package com.google.android.gms.internal.play_billing;
final class zzej extends com.google.android.gms.internal.play_billing.zzel {
    private int zzb;
    private int zzc;
    private int zzd;

    public synthetic zzej(byte[] p1, int p2, int p3, boolean p4, com.google.android.gms.internal.play_billing.zzek p5)
    {
        super(0);
        super.zzd = 2147483647;
        super.zzb = 0;
        return;
    }

    public final int zza(int p4)
    {
        p4 = this.zzd;
        this.zzd = 0;
        int v1_1 = (this.zzb + this.zzc);
        this.zzb = v1_1;
        if (v1_1 <= 0) {
            this.zzc = 0;
            return p4;
        } else {
            this.zzc = v1_1;
            this.zzb = 0;
            return p4;
        }
    }
}
