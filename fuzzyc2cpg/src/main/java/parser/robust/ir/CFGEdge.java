package parser.robust.ir;

public class CFGEdge {
    private BasicBlock mSource;
    private BasicBlock mTarget;
    private String mProperty;

    public CFGEdge() {

    }

    public CFGEdge(BasicBlock src, BasicBlock tgt) {
        mSource = src;
        mTarget = tgt;
    }

    public void setSource(BasicBlock src) {
        mSource = src;
    }

    public void setTarget(BasicBlock tgt) {
        mTarget = tgt;
    }

    public void setProperty(String prop) {
        mProperty = prop;
    }

    public BasicBlock source() {
        return mSource;
    }

    public BasicBlock target() {
        return mTarget;
    }

    public String property() {
        return mProperty;
    }
}
