package com.google.android.gms.internal.firebase-auth-api;
public final class zzaaj {
    private final byte[] zza;

    private zzaaj(byte[] p2, int p3, int p4)
    {
        p3 = new byte[p4];
        this.zza = p3;
        System.arraycopy(p2, 0, p3, 0, p4);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaaj zza(byte[] p2)
    {
        if (p2 == null) {
            throw new NullPointerException("data must be non-null");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(p2, 0, p2.length);
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaaj zza(byte[] p1, int p2, int p3)
    {
        if (p1 == null) {
            throw new NullPointerException("data must be non-null");
        } else {
            if (p3 > p1.length) {
                p3 = p1.length;
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzaaj(p1, 0, p3);
        }
    }

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzaaj)) {
            return java.util.Arrays.equals(((com.google.android.gms.internal.firebase-auth-api.zzaaj) p2).zza, this.zza);
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(this.zza);
    }

    public final String toString()
    {
        return v1.a.l("Bytes(", com.google.android.gms.internal.firebase-auth-api.zzzx.zza(this.zza), ")");
    }

    public final int zza()
    {
        return this.zza.length;
    }

    public final byte[] zzb()
    {
        byte[] v0 = this.zza;
        byte[] v1_1 = new byte[v0.length];
        System.arraycopy(v0, 0, v1_1, 0, v0.length);
        return v1_1;
    }
}
