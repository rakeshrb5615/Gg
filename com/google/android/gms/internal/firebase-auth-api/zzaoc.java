package com.google.android.gms.internal.firebase-auth-api;
final class zzaoc {

    public static synthetic void zza(byte p2, byte p3, byte p4, byte p5, char[] p6, int p7)
    {
        if ((com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(p3)) || (((((p3 + 112) + (p2 << 28)) >> 30) != 0) || ((com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(p4)) || (com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(p5))))) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
        } else {
            char v2_6 = (((((p2 & 7) << 18) | ((p3 & 63) << 12)) | ((p4 & 63) << 6)) | (p5 & 63));
            p6[p7] = ((char) ((v2_6 >> 10) + 55232));
            p6[(p7 + 1)] = ((char) ((v2_6 & 1023) + 56320));
            return;
        }
    }

    public static synthetic void zza(byte p2, byte p3, byte p4, char[] p5, int p6)
    {
        if (((com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(p3)) || ((p2 == -32) && (p3 < -96))) || (((p2 == -19) && (p3 >= -96)) || (com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(p4)))) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
        } else {
            p5[p6] = ((char) ((((p2 & 15) << 12) | ((p3 & 63) << 6)) | (p4 & 63)));
            return;
        }
    }

    public static synthetic void zza(byte p1, byte p2, char[] p3, int p4)
    {
        if ((p1 < -62) || (com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(p2))) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
        } else {
            p3[p4] = ((char) (((p1 & 31) << 6) | (p2 & 63)));
            return;
        }
    }

    public static synthetic void zza(byte p0, char[] p1, int p2)
    {
        p1[p2] = ((char) p0);
        return;
    }

    private static boolean zza(byte p1)
    {
        if (p1 <= -65) {
            return 0;
        } else {
            return 1;
        }
    }
}
