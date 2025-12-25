package androidx.graphics.path;
public final class PathIteratorPreApi34Impl {

    static PathIteratorPreApi34Impl()
    {
        System.loadLibrary("androidx.graphics.path");
        return;
    }

    private final native long createInternalPathIterator();

    private final native void destroyInternalPathIterator();

    private final native boolean internalPathIteratorHasNext();

    private final native int internalPathIteratorNext();

    private final native int internalPathIteratorPeek();

    private final native int internalPathIteratorRawSize();

    private final native int internalPathIteratorSize();

    public final void finalize()
    {
        this.destroyInternalPathIterator(0);
        return;
    }
}
