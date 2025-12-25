package androidx.datastore.core;
public final class NativeSharedCounter {

    public final native long nativeCreateSharedCounter();

    public final native int nativeGetCounterValue();

    public final native int nativeIncrementAndGetCounterValue();

    public final native int nativeTruncateFile();
}
