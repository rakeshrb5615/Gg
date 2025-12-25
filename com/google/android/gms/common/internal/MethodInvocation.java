package com.google.android.gms.common.internal;
public class MethodInvocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zaa;
    private final int zab;
    private final int zac;
    private final long zad;
    private final long zae;
    private final String zaf;
    private final String zag;
    private final int zah;
    private final int zai;

    static MethodInvocation()
    {
        com.google.android.gms.common.internal.MethodInvocation.CREATOR = new com.google.android.gms.common.internal.zan();
        return;
    }

    public MethodInvocation(int p13, int p14, int p15, long p16, long p18, String p20, String p21, int p22)
    {
        this(p13, p14, p15, p16, p18, p20, p21, p22, -1);
        return;
    }

    public MethodInvocation(int p1, int p2, int p3, long p4, long p6, String p8, String p9, int p10, int p11)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        this.zae = p6;
        this.zaf = p8;
        this.zag = p9;
        this.zah = p10;
        this.zai = p11;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zaa;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, v5_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 4, this.zad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 5, this.zae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 6, this.zaf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 7, this.zag, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 8, this.zah);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 9, this.zai);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
