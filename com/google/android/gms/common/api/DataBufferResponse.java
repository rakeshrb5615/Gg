package com.google.android.gms.common.api;
public class DataBufferResponse extends com.google.android.gms.common.api.Response implements com.google.android.gms.common.data.DataBuffer {

    public DataBufferResponse()
    {
        return;
    }

    public DataBufferResponse(com.google.android.gms.common.data.AbstractDataBuffer p1)
    {
        super(p1);
        return;
    }

    public final void close()
    {
        ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).close();
        return;
    }

    public final Object get(int p2)
    {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).get(p2);
    }

    public final int getCount()
    {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).getCount();
    }

    public final android.os.Bundle getMetadata()
    {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).getMetadata();
    }

    public final boolean isClosed()
    {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).isClosed();
    }

    public final java.util.Iterator iterator()
    {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).iterator();
    }

    public final void release()
    {
        ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).release();
        return;
    }

    public final java.util.Iterator singleRefIterator()
    {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getResult()).singleRefIterator();
    }
}
