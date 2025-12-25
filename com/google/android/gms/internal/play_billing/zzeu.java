package com.google.android.gms.internal.play_billing;
public final class zzeu {
    static final com.google.android.gms.internal.play_billing.zzeu zza = None;
    public static final synthetic int zzb = 0;
    private static volatile boolean zzc = False;
    private static volatile com.google.android.gms.internal.play_billing.zzeu zzd;
    private final java.util.Map zze;

    static zzeu()
    {
        com.google.android.gms.internal.play_billing.zzeu.zza = new com.google.android.gms.internal.play_billing.zzeu(1);
        return;
    }

    public zzeu()
    {
        this.zze = new java.util.HashMap();
        return;
    }

    public zzeu(boolean p1)
    {
        this.zze = java.util.Collections.EMPTY_MAP;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzeu zza()
    {
        Class v0 = com.google.android.gms.internal.play_billing.zzeu.zzd;
        if (v0 == null) {
            com.google.android.gms.internal.play_billing.zzeu v1_1 = com.google.android.gms.internal.play_billing.zzeu.zzd;
            if (v1_1 == null) {
                com.google.android.gms.internal.play_billing.zzeu v1_3 = com.google.android.gms.internal.play_billing.zzfc.zzb(com.google.android.gms.internal.play_billing.zzeu);
                com.google.android.gms.internal.play_billing.zzeu.zzd = v1_3;
                return v1_3;
            } else {
                return v1_1;
            }
        } else {
            return v0;
        }
    }

    public final com.google.android.gms.internal.play_billing.zzfh zzb(com.google.android.gms.internal.play_billing.zzgl p2, int p3)
    {
        return ((com.google.android.gms.internal.play_billing.zzfh) this.zze.get(new com.google.android.gms.internal.play_billing.zzet(p2, p3)));
    }
}
