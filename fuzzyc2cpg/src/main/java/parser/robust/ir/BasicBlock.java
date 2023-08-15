package parser.robust.ir;


import java.util.Objects;

/**
 * The BasicBlock for normalized CFGs. Each BB contains only one instruction,
 * i.e., complex statements can be splitted into multiple BBs.
 */
public class BasicBlock {
    // Original code and the normalized representation
    private String mCode;
    private String mNorm;
    private int mLine;
    private int mId;

    public BasicBlock(String code, int line, String norm) {
        mCode = code;
        mLine = line;
        mNorm = norm;
        mId = -1;
    }

    public BasicBlock(String code, int line) {
        mCode = code;
        mLine = line;
        mId = -1;
    }

    public BasicBlock(int line, int id) {
        mLine = line;
        mId = id;
    }

    public void setId(int id) {
        mId = id;
    }

    public void setLine(int line) {
        mLine = line;
    }

    public int id() {
        return mId;
    }

    public String code() {
        return mCode;
    }

    public int line() {
        return mLine;
    }

    public String normalized() {
        return mNorm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicBlock that = (BasicBlock) o;
        return mLine == that.mLine &&
                Objects.equals(mCode, that.mCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mCode, mLine);
    }
}
