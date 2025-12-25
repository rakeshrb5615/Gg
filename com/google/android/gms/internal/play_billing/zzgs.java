package com.google.android.gms.internal.play_billing;
final class zzgs {
    public static final synthetic int zza;
    private static final com.google.android.gms.internal.play_billing.zzgs zzb;
    private final com.google.android.gms.internal.play_billing.zzgw zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static zzgs()
    {
        com.google.android.gms.internal.play_billing.zzgs.zzb = new com.google.android.gms.internal.play_billing.zzgs();
        return;
    }

    private zzgs()
    {
        this.zzd = new java.util.concurrent.ConcurrentHashMap();
        this.zzc = new com.google.android.gms.internal.play_billing.zzgd();
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzgs zza()
    {
        return com.google.android.gms.internal.play_billing.zzgs.zzb;
    }

    public final com.google.android.gms.internal.play_billing.zzgv zzb(Class p4)
    {
        com.google.android.gms.internal.play_billing.zzfo.zzc(p4, "messageType");
        java.util.concurrent.ConcurrentMap v1 = this.zzd;
        com.google.android.gms.internal.play_billing.zzgv v2_1 = ((com.google.android.gms.internal.play_billing.zzgv) v1.get(p4));
        if (v2_1 == null) {
            v2_1 = this.zzc.zza(p4);
            com.google.android.gms.internal.play_billing.zzfo.zzc(p4, "messageType");
            com.google.android.gms.internal.play_billing.zzgv v4_2 = ((com.google.android.gms.internal.play_billing.zzgv) v1.putIfAbsent(p4, v2_1));
            if (v4_2 != null) {
                return v4_2;
            }
        }
        return v2_1;
    }
}
