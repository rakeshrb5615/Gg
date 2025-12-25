package com.google.android.gms.internal.firebase-auth-api;
abstract class zzaa extends com.google.android.gms.internal.firebase-auth-api.zzd {
    final CharSequence zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzf zzb;
    private final boolean zzc;
    private int zzd;
    private int zze;

    public zzaa(com.google.android.gms.internal.firebase-auth-api.zzt p3, CharSequence p4)
    {
        this.zzd = 0;
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzt.zzb(p3);
        this.zzc = 0;
        this.zze = com.google.android.gms.internal.firebase-auth-api.zzt.zza(p3);
        this.zza = p4;
        return;
    }

    public abstract int zza();

    public final synthetic Object zza()
    {
        String v0_0 = this.zzd;
        do {
            int v1_0 = this.zzd;
            if (v1_0 == -1) {
                this.zzb();
                return 0;
            } else {
                int v1_2 = this.zzb(v1_0);
                if (v1_2 != -1) {
                    this.zzd = this.zza(v1_2);
                } else {
                    v1_2 = this.zza.length();
                    this.zzd = -1;
                }
                char v3_1 = this.zzd;
                if (v3_1 == v0_0) {
                    char v3_10 = (v3_1 + 1);
                    this.zzd = v3_10;
                }
                while ((v0_0 < v1_2) && (this.zzb.zza(this.zza.charAt(v0_0)))) {
                    v0_0++;
                }
                while ((v1_2 > v0_0) && (this.zzb.zza(this.zza.charAt((v1_2 - 1))))) {
                    v1_2--;
                }
                char v3_6 = this.zze;
                if (v3_6 != 1) {
                    this.zze = (v3_6 - 1);
                } else {
                    v1_2 = this.zza.length();
                    this.zzd = -1;
                    while ((v1_2 > v0_0) && (this.zzb.zza(this.zza.charAt((v1_2 - 1))))) {
                        v1_2--;
                    }
                }
                return this.zza.subSequence(v0_0, v1_2).toString();
            }
        } while(v3_10 <= this.zza.length());
        this.zzd = -1;
    }

    public abstract int zzb();
}
