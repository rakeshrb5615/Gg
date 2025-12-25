package com.google.android.gms.common;
abstract class zzj extends com.google.android.gms.common.internal.zzw {
    private final int zza;

    public zzj(byte[] p3)
    {
        int v0_1;
        if (p3.length != 25) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1);
        this.zza = java.util.Arrays.hashCode(p3);
        return;
    }

    public static byte[] zzf(String p1)
    {
        try {
            return p1.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException v1_2) {
            throw new AssertionError(v1_2);
        }
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.common.internal.zzx)) {
            try {
                if (((com.google.android.gms.common.internal.zzx) p4).zze() == this.zza) {
                    boolean v4_6 = ((com.google.android.gms.common.internal.zzx) p4).zzd();
                    if (!v4_6) {
                        return 0;
                    } else {
                        return java.util.Arrays.equals(this.zzc(), ((byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(v4_6)));
                    }
                } else {
                    return 0;
                }
            } catch (boolean v4_4) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", v4_4);
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zza;
    }

    public abstract byte[] zzc();

    public final com.google.android.gms.dynamic.IObjectWrapper zzd()
    {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc());
    }

    public final int zze()
    {
        return this.zza;
    }
}
