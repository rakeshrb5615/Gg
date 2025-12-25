package com.google.android.gms.common.data;
public class SingleRefDataBufferIterator extends com.google.android.gms.common.data.DataBufferIterator {
    private Object zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer p1)
    {
        super(p1);
        return;
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException(g2.g.c(this.zab, "Cannot advance the iterator beyond "));
        } else {
            Object v0_2 = (this.zab + 1);
            this.zab = v0_2;
            if (v0_2 != null) {
                ((com.google.android.gms.common.data.DataBufferRef) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            } else {
                Object v0_8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = v0_8;
                if (!(v0_8 instanceof com.google.android.gms.common.data.DataBufferRef)) {
                    throw new IllegalStateException(v1.a.l("DataBuffer reference of type ", String.valueOf(v0_8.getClass()), " is not movable"));
                }
            }
            return this.zac;
        }
    }
}
