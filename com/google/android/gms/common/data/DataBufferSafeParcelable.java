package com.google.android.gms.common.data;
public class DataBufferSafeParcelable extends com.google.android.gms.common.data.AbstractDataBuffer {
    private static final String[] zaa;
    private final android.os.Parcelable$Creator zab;

    static DataBufferSafeParcelable()
    {
        com.google.android.gms.common.data.DataBufferSafeParcelable.zaa = new String[] {"data"});
        return;
    }

    public DataBufferSafeParcelable(com.google.android.gms.common.data.DataHolder p1, android.os.Parcelable$Creator p2)
    {
        super(p1);
        super.zab = p2;
        return;
    }

    public static void addValue(com.google.android.gms.common.data.DataHolder$Builder p3, com.google.android.gms.common.internal.safeparcel.SafeParcelable p4)
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        p4.writeToParcel(v0, 0);
        android.content.ContentValues v4_2 = new android.content.ContentValues();
        v4_2.put("data", v0.marshall());
        p3.withRow(v4_2);
        v0.recycle();
        return;
    }

    public static com.google.android.gms.common.data.DataHolder$Builder buildDataHolder()
    {
        return com.google.android.gms.common.data.DataHolder.builder(com.google.android.gms.common.data.DataBufferSafeParcelable.zaa);
    }

    public com.google.android.gms.common.internal.safeparcel.SafeParcelable get(int p4)
    {
        android.os.Parcel v0_3 = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder));
        com.google.android.gms.common.internal.safeparcel.SafeParcelable v4_4 = v0_3.getByteArray("data", p4, v0_3.getWindowIndex(p4));
        android.os.Parcel v0_1 = android.os.Parcel.obtain();
        v0_1.unmarshall(v4_4, 0, v4_4.length);
        v0_1.setDataPosition(0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelable v4_3 = ((com.google.android.gms.common.internal.safeparcel.SafeParcelable) this.zab.createFromParcel(v0_1));
        v0_1.recycle();
        return v4_3;
    }

    public final bridge synthetic Object get(int p1)
    {
        return this.get(p1);
    }
}
