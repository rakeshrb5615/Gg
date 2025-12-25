package com.google.android.gms.internal.auth;
final class zzeg extends com.google.android.gms.internal.auth.zzei {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public synthetic zzeg(byte[] p1, int p2, int p3, boolean p4, com.google.android.gms.internal.auth.zzef p5)
    {
        super(0);
        super.zze = 2147483647;
        super.zzb = p1;
        super.zzc = 0;
        return;
    }

    public final int zza(int p4)
    {
        p4 = this.zze;
        this.zze = 0;
        int v1_1 = (this.zzc + this.zzd);
        this.zzc = v1_1;
        if (v1_1 <= 0) {
            this.zzd = 0;
            return p4;
        } else {
            this.zzd = v1_1;
            this.zzc = 0;
            return p4;
        }
    }
}
