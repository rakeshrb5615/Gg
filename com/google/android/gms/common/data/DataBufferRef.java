package com.google.android.gms.common.data;
public abstract class DataBufferRef {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected int mDataRow;
    private int zaa;

    public DataBufferRef(com.google.android.gms.common.data.DataHolder p1, int p2)
    {
        this.mDataHolder = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zaa(p2);
        return;
    }

    public void copyToBuffer(String p4, android.database.CharArrayBuffer p5)
    {
        this.mDataHolder.zac(p4, this.mDataRow, this.zaa, p5);
        return;
    }

    public boolean equals(Object p4)
    {
        if ((!(p4 instanceof com.google.android.gms.common.data.DataBufferRef)) || ((!com.google.android.gms.common.internal.Objects.equal(Integer.valueOf(((com.google.android.gms.common.data.DataBufferRef) p4).mDataRow), Integer.valueOf(this.mDataRow))) || ((!com.google.android.gms.common.internal.Objects.equal(Integer.valueOf(((com.google.android.gms.common.data.DataBufferRef) p4).zaa), Integer.valueOf(this.zaa))) || (((com.google.android.gms.common.data.DataBufferRef) p4).mDataHolder != this.mDataHolder)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean getBoolean(String p4)
    {
        return this.mDataHolder.getBoolean(p4, this.mDataRow, this.zaa);
    }

    public byte[] getByteArray(String p4)
    {
        return this.mDataHolder.getByteArray(p4, this.mDataRow, this.zaa);
    }

    public int getDataRow()
    {
        return this.mDataRow;
    }

    public double getDouble(String p4)
    {
        return this.mDataHolder.zaa(p4, this.mDataRow, this.zaa);
    }

    public float getFloat(String p4)
    {
        return this.mDataHolder.zab(p4, this.mDataRow, this.zaa);
    }

    public int getInteger(String p4)
    {
        return this.mDataHolder.getInteger(p4, this.mDataRow, this.zaa);
    }

    public long getLong(String p4)
    {
        return this.mDataHolder.getLong(p4, this.mDataRow, this.zaa);
    }

    public String getString(String p4)
    {
        return this.mDataHolder.getString(p4, this.mDataRow, this.zaa);
    }

    public boolean hasColumn(String p2)
    {
        return this.mDataHolder.hasColumn(p2);
    }

    public boolean hasNull(String p4)
    {
        return this.mDataHolder.hasNull(p4, this.mDataRow, this.zaa);
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.mDataRow), Integer.valueOf(this.zaa), this.mDataHolder}));
    }

    public boolean isDataValid()
    {
        if (this.mDataHolder.isClosed()) {
            return 0;
        } else {
            return 1;
        }
    }

    public android.net.Uri parseUri(String p4)
    {
        android.net.Uri v4_1 = this.mDataHolder.getString(p4, this.mDataRow, this.zaa);
        if (v4_1 != null) {
            return android.net.Uri.parse(v4_1);
        } else {
            return 0;
        }
    }

    public final void zaa(int p3)
    {
        int v0_0 = 0;
        if ((p3 >= 0) && (p3 < this.mDataHolder.getCount())) {
            v0_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_0);
        this.mDataRow = p3;
        this.zaa = this.mDataHolder.getWindowIndex(p3);
        return;
    }
}
