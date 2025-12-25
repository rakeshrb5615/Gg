package com.google.android.gms.common.data;
public class DataBufferIterator implements java.util.Iterator {
    protected final com.google.android.gms.common.data.DataBuffer zaa;
    protected int zab;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer p1)
    {
        this.zaa = ((com.google.android.gms.common.data.DataBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zab = -1;
        return;
    }

    public final boolean hasNext()
    {
        if (this.zab >= (this.zaa.getCount() - 1)) {
            return 0;
        } else {
            return 1;
        }
    }

    public Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException(g2.g.c(this.zab, "Cannot advance the iterator beyond "));
        } else {
            java.util.NoSuchElementException v0_1 = this.zaa;
            String v1_1 = (this.zab + 1);
            this.zab = v1_1;
            return v0_1.get(v1_1);
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
