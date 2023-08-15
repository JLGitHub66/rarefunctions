package io.shiftleft.fuzzyc2cpg.preprocessor;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import io.shiftleft.fuzzyc2cpg.preprocessLexer;
import io.shiftleft.fuzzyc2cpg.preprocessParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;


public class preprocessorRun {
    public static List<File> listDirectory(String dir, List<File> filelist) throws IOException {
        File file = new File(dir);
        File[] files = file.listFiles();
        if (files == null)
            return null;
        for (File f : files) {
            if (f.isDirectory()) {
                filelist = listDirectory(f.getAbsolutePath(), filelist);
            } else if (f.getAbsolutePath().endsWith("cc") || f
                    .getAbsolutePath().endsWith("c") || f
                    .getAbsolutePath().endsWith("cpp")) {
                filelist.add(f);
            }
        }
        return filelist;
    }


    public static void main(String[] args) throws Exception {
        String filename = args[0];
        String result = args[1];
        preprocessLexer lex = new preprocessLexer((CharStream)new ANTLRFileStream(args[0], "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource)lex);
        String[] names = filename.split("/");
        int start = (result.split("/")).length;
        for (int i = start; i < names.length - 1; i++)
            result = result + "/" + names[i];
        File f = new File(result);
        if (!f.exists())
            f.mkdirs();
        result = result + "/" + names[names.length - 1];
        PrintStream ps = new PrintStream(result);
        System.setOut(ps);
        preprocessParser g = new preprocessParser((TokenStream)tokens);
        g.code();
        ps.close();
    }
}