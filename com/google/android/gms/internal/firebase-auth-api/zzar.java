package com.google.android.gms.internal.firebase-auth-api;
final class zzar extends com.google.android.gms.internal.firebase-auth-api.zzaq {
    private final transient com.google.android.gms.internal.firebase-auth-api.zzal zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzar(com.google.android.gms.internal.firebase-auth-api.zzal p1, Object[] p2, int p3, int p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        return;
    }

    public static bridge synthetic int zza(com.google.android.gms.internal.firebase-auth-api.zzar p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic Object[] zzb(com.google.android.gms.internal.firebase-auth-api.zzar p0)
    {
        return p0.zzb;
    }

    public final boolean contains(Object p4)
    {
        if ((p4 instanceof java.util.Map$Entry)) {
            Object v0_2 = ((java.util.Map$Entry) p4).getKey();
            int v4_4 = ((java.util.Map$Entry) p4).getValue();
            if ((v4_4 != 0) && (v4_4.equals(this.zza.get(v0_2)))) {
                return 1;
            }
        }
        return 0;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzd();
    }

    public final int size()
    {
        return this.zzc;
    }

    public final int zza(Object[] p2, int p3)
    {
        return this.zzc().zza(p2, p3);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzay zzd()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzay) this.zzc().iterator());
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzah zzf()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzau(this);
    }
}
