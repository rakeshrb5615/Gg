package com.google.android.gms.internal.firebase-auth-api;
final class zzaaz implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafs zza;
    private final synthetic String zzb;
    private final synthetic String zzc;
    private final synthetic Boolean zzd;
    private final synthetic y4.g0 zze;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzf;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzahv zzg;

    public zzaaz(com.google.android.gms.internal.firebase-auth-api.zzaar p1, com.google.android.gms.internal.firebase-auth-api.zzafs p2, String p3, String p4, Boolean p5, y4.g0 p6, com.google.android.gms.internal.firebase-auth-api.zzael p7, com.google.android.gms.internal.firebase-auth-api.zzahv p8)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        this.zzg = p8;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final synthetic void zza(Object p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzahk v6_3 = ((com.google.android.gms.internal.firebase-auth-api.zzahl) p6).zza();
        if ((v6_3 != null) && (!v6_3.isEmpty())) {
            com.google.android.gms.internal.firebase-auth-api.zzaib v1_1;
            int v0_1 = 0;
            com.google.android.gms.internal.firebase-auth-api.zzahk v6_2 = ((com.google.android.gms.internal.firebase-auth-api.zzahk) v6_3.get(0));
            com.google.android.gms.internal.firebase-auth-api.zzaib v1_0 = v6_2.zzf();
            if (v1_0 == null) {
                v1_1 = 0;
            } else {
                v1_1 = v1_0.zza();
            }
            if ((v1_1 != null) && (!v1_1.isEmpty())) {
                if (android.text.TextUtils.isEmpty(this.zzb)) {
                    ((com.google.android.gms.internal.firebase-auth-api.zzaib) v1_1.get(0)).zza(this.zzc);
                } else {
                    int v2_4 = 0;
                    while (v2_4 < v1_1.size()) {
                        if (!((com.google.android.gms.internal.firebase-auth-api.zzaib) v1_1.get(v2_4)).zzf().equals(this.zzb)) {
                            v2_4++;
                        } else {
                            ((com.google.android.gms.internal.firebase-auth-api.zzaib) v1_1.get(v2_4)).zza(this.zzc);
                            break;
                        }
                    }
                }
            }
            com.google.android.gms.internal.firebase-auth-api.zzaib v1_6 = this.zzd;
            if (v1_6 == null) {
                if ((v6_2.zzb() - v6_2.zza()) < 1000) {
                    v0_1 = 1;
                }
                v6_2.zza(v0_1);
            } else {
                v6_2.zza(v1_6.booleanValue());
            }
            v6_2.zza(this.zze);
            this.zzf.zza(this.zzg, v6_2);
            return;
        } else {
            this.zza.zza("No users.");
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zza.zza(p2);
        return;
    }
}
