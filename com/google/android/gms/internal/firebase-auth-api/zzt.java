package com.google.android.gms.internal.firebase-auth-api;
public final class zzt {
    private final com.google.android.gms.internal.firebase-auth-api.zzf zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzz zzb;
    private final int zzc;

    private zzt(com.google.android.gms.internal.firebase-auth-api.zzz p4)
    {
        this(p4, 0, com.google.android.gms.internal.firebase-auth-api.zzj.zza, 2147483647);
        return;
    }

    private zzt(com.google.android.gms.internal.firebase-auth-api.zzz p1, boolean p2, com.google.android.gms.internal.firebase-auth-api.zzf p3, int p4)
    {
        this.zzb = p1;
        this.zza = p3;
        this.zzc = 2147483647;
        return;
    }

    public static bridge synthetic int zza(com.google.android.gms.internal.firebase-auth-api.zzt p0)
    {
        return p0.zzc;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzt zza(char p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzh v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzh(p2);
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(v0_1);
        return new com.google.android.gms.internal.firebase-auth-api.zzt(new com.google.android.gms.internal.firebase-auth-api.zzw(v0_1));
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzt zza(String p2)
    {
        String v2_1 = com.google.android.gms.internal.firebase-auth-api.zzp.zza(p2);
        if (v2_1.zza("").zzc()) {
            throw new IllegalArgumentException(com.google.android.gms.internal.firebase-auth-api.zzp.zza("The pattern may not match the empty string: %s", new Object[] {v2_1})));
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzt(new com.google.android.gms.internal.firebase-auth-api.zzv(v2_1));
        }
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzf zzb(com.google.android.gms.internal.firebase-auth-api.zzt p0)
    {
        return p0.zza;
    }

    public final java.util.List zza(CharSequence p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p3);
        java.util.List v3_2 = this.zzb.zza(this, p3);
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        while (v3_2.hasNext()) {
            v0_2.add(((String) v3_2.next()));
        }
        return java.util.Collections.unmodifiableList(v0_2);
    }
}
