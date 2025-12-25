package com.google.android.gms.internal.measurement;
public abstract class zzks implements com.google.android.gms.internal.measurement.zznm {
    protected int zza;

    public zzks()
    {
        this.zza = 0;
        return;
    }

    public static void zzce(Iterable p0, java.util.List p1)
    {
        com.google.android.gms.internal.measurement.zzkr.zzaU(p0, p1);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzlh zzcb()
    {
        try {
            java.io.IOException v0_0 = this.zzcn();
            String v1_3 = new byte[v0_0];
            RuntimeException v2_3 = new com.google.android.gms.internal.measurement.zzlk(v1_3, 0, v0_0);
            this.zzcB(v2_3);
            return com.google.android.gms.internal.measurement.zzle.zza(v2_3, v1_3);
        } catch (java.io.IOException v0_2) {
            String v1_1 = this.getClass().getName();
            throw new RuntimeException(v1.a.o(new StringBuilder((v1_1.length() + 72)), "Serializing ", v1_1, " to a ByteString threw an IOException (should never happen)."), v0_2);
        }
    }

    public final byte[] zzcc()
    {
        try {
            java.io.IOException v0_0 = this.zzcn();
            String v1_2 = new byte[v0_0];
            RuntimeException v2_3 = new com.google.android.gms.internal.measurement.zzlk(v1_2, 0, v0_0);
            this.zzcB(v2_3);
            v2_3.zzE();
            return v1_2;
        } catch (java.io.IOException v0_1) {
            String v1_1 = this.getClass().getName();
            throw new RuntimeException(v1.a.o(new StringBuilder((v1_1.length() + 72)), "Serializing ", v1_1, " to a byte array threw an IOException (should never happen)."), v0_1);
        }
    }

    public int zzcd(com.google.android.gms.internal.measurement.zznx p1)
    {
        throw 0;
    }
}
