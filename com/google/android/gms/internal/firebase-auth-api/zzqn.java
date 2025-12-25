package com.google.android.gms.internal.firebase-auth-api;
public final class zzqn {
    public static final java.nio.charset.Charset zza;

    static zzqn()
    {
        com.google.android.gms.internal.firebase-auth-api.zzqn.zza = java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    public static int zza()
    {
        int v1_0 = 0;
        while (v1_0 == 0) {
            int v1_4 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(4);
            v1_0 = ((v1_4[3] & 255) | ((((v1_4[0] & 255) << 24) | ((v1_4[1] & 255) << 16)) | ((v1_4[2] & 255) << 8)));
        }
        return v1_0;
    }

    public static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza(String p4)
    {
        String v0_3 = new byte[p4.length()];
        int v1_1 = 0;
        while (v1_1 < p4.length()) {
            byte v2_0 = p4.charAt(v1_1);
            if ((v2_0 < 33) || (v2_0 > 126)) {
                String v0_2 = new StringBuilder("Not a printable ASCII character: ");
                v0_2.append(v2_0);
                throw new java.security.GeneralSecurityException(v0_2.toString());
            } else {
                v0_3[v1_1] = ((byte) v2_0);
                v1_1++;
            }
        }
        return com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(v0_3);
    }

    public static boolean zza(byte[] p4, byte[] p5)
    {
        if (p5.length >= p4.length) {
            int v0_1 = 0;
            while (v0_1 < p4.length) {
                if (p5[v0_1] == p4[v0_1]) {
                    v0_1++;
                } else {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public static final com.google.android.gms.internal.firebase-auth-api.zzaaj zzb(String p4)
    {
        String v0_3 = new byte[p4.length()];
        int v1_1 = 0;
        while (v1_1 < p4.length()) {
            byte v2_0 = p4.charAt(v1_1);
            if ((v2_0 < 33) || (v2_0 > 126)) {
                String v0_2 = new StringBuilder("Not a printable ASCII character: ");
                v0_2.append(v2_0);
                throw new com.google.android.gms.internal.firebase-auth-api.zzql(v0_2.toString());
            } else {
                v0_3[v1_1] = ((byte) v2_0);
                v1_1++;
            }
        }
        return com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(v0_3);
    }

    public static Integer zzb()
    {
        if (java.util.Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(android.os.Build$VERSION.SDK_INT);
        } else {
            return 0;
        }
    }
}
