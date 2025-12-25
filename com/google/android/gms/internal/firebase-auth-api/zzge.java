package com.google.android.gms.internal.firebase-auth-api;
public final class zzge extends com.google.android.gms.internal.firebase-auth-api.zzcy {
    private final com.google.android.gms.internal.firebase-auth-api.zzge$zza zza;

    private zzge(com.google.android.gms.internal.firebase-auth-api.zzge$zza p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzge zza(com.google.android.gms.internal.firebase-auth-api.zzge$zza p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzge(p1);
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzge zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzge(com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzc);
    }

    public final boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzge)) {
            if (((com.google.android.gms.internal.firebase-auth-api.zzge) p3).zza != this.zza) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzge, this.zza}));
    }

    public final String toString()
    {
        return v1.a.l("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    public final boolean zza()
    {
        if (this.zza == com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzge$zza zzb()
    {
        return this.zza;
    }
}
