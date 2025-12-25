package com.google.android.gms.internal.common;
final class zzs extends com.google.android.gms.internal.common.zzv {
    final synthetic com.google.android.gms.internal.common.zzp zza;

    public zzs(com.google.android.gms.internal.common.zzw p1, CharSequence p2, com.google.android.gms.internal.common.zzp p3)
    {
        this.zza = p3;
        super(p1, p2);
        return;
    }

    public final int zzc(int p5)
    {
        CharSequence v0 = this.zzb;
        int v1 = v0.length();
        com.google.android.gms.internal.common.zzr.zzc(p5, v1, "index");
        while (p5 < v1) {
            if (!this.zza.zza(v0.charAt(p5))) {
                p5++;
            } else {
                return p5;
            }
        }
        return -1;
    }

    public final int zzd(int p1)
    {
        return (p1 + 1);
    }
}
