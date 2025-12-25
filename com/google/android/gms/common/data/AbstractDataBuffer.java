package com.google.android.gms.common.data;
public abstract class AbstractDataBuffer implements com.google.android.gms.common.data.DataBuffer {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;

    public AbstractDataBuffer(com.google.android.gms.common.data.DataHolder p1)
    {
        this.mDataHolder = p1;
        return;
    }

    public final void close()
    {
        this.release();
        return;
    }

    public abstract Object get();

    public int getCount()
    {
        int v0_0 = this.mDataHolder;
        if (v0_0 != 0) {
            return v0_0.getCount();
        } else {
            return 0;
        }
    }

    public final android.os.Bundle getMetadata()
    {
        android.os.Bundle v0_0 = this.mDataHolder;
        if (v0_0 != null) {
            return v0_0.getMetadata();
        } else {
            return 0;
        }
    }

    public boolean isClosed()
    {
        int v0_0 = this.mDataHolder;
        if ((v0_0 != 0) && (!v0_0.isClosed())) {
            return 0;
        } else {
            return 1;
        }
    }

    public java.util.Iterator iterator()
    {
        return new com.google.android.gms.common.data.DataBufferIterator(this);
    }

    public void release()
    {
        com.google.android.gms.common.data.DataHolder v0 = this.mDataHolder;
        if (v0 != null) {
            v0.close();
        }
        return;
    }

    public java.util.Iterator singleRefIterator()
    {
        return new com.google.android.gms.common.data.SingleRefDataBufferIterator(this);
    }
}
