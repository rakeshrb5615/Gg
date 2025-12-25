package com.google.android.gms.internal.firebase-auth-api;
final class zzacb implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafv zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzahv zzc;

    public zzacb(com.google.android.gms.internal.firebase-auth-api.zzacc p1, com.google.android.gms.internal.firebase-auth-api.zzafv p2, com.google.android.gms.internal.firebase-auth-api.zzael p3, com.google.android.gms.internal.firebase-auth-api.zzahv p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final synthetic void zza(Object p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzahk v4_5 = ((com.google.android.gms.internal.firebase-auth-api.zzahl) p4).zza();
        if ((v4_5 != null) && (!v4_5.isEmpty())) {
            this.zzb.zza(this.zzc, ((com.google.android.gms.internal.firebase-auth-api.zzahk) v4_5.get(0)));
            return;
        } else {
            this.zza.zza("No users");
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zza.zza(p2);
        return;
    }
}
