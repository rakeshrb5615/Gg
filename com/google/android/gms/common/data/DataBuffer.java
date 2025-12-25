package com.google.android.gms.common.data;
public interface DataBuffer implements java.lang.Iterable, com.google.android.gms.common.api.Releasable, java.io.Closeable {

    public abstract void close();

    public abstract Object get();

    public abstract int getCount();

    public abstract android.os.Bundle getMetadata();

    public abstract boolean isClosed();

    public abstract java.util.Iterator iterator();

    public abstract void release();

    public abstract java.util.Iterator singleRefIterator();
}
