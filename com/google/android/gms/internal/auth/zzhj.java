package com.google.android.gms.internal.auth;
final class zzhj {

    public static bridge synthetic void zza(byte p2, byte p3, byte p4, byte p5, char[] p6, int p7)
    {
        if ((com.google.android.gms.internal.auth.zzhj.zze(p3)) || (((((p3 + 112) + (p2 << 28)) >> 30) != 0) || ((com.google.android.gms.internal.auth.zzhj.zze(p4)) || (com.google.android.gms.internal.auth.zzhj.zze(p5))))) {
            throw com.google.android.gms.internal.auth.zzfa.zzb();
        } else {
            char v2_6 = (((((p2 & 7) << 18) | ((p3 & 63) << 12)) | ((p4 & 63) << 6)) | (p5 & 63));
            p6[p7] = ((char) ((v2_6 >> 10) + 55232));
            p6[(p7 + 1)] = ((char) ((v2_6 & 1023) + 56320));
            return;
        }
    }

    public static bridge synthetic void zzb(byte p2, byte p3, byte p4, char[] p5, int p6)
    {
        if (!com.google.android.gms.internal.auth.zzhj.zze(p3)) {
            if (p2 == -32) {
                if (p3 < -96) {
                    throw com.google.android.gms.internal.auth.zzfa.zzb();
                } else {
                    p2 = -32;
                }
            }
            if (p2 == -19) {
                if (p3 >= -96) {
                } else {
                    p2 = -19;
                }
            }
            if (!com.google.android.gms.internal.auth.zzhj.zze(p4)) {
                p5[p6] = ((char) ((((p2 & 15) << 12) | ((p3 & 63) << 6)) | (p4 & 63)));
                return;
            }
        }
    }

    public static bridge synthetic void zzc(byte p1, byte p2, char[] p3, int p4)
    {
        if ((p1 < -62) || (com.google.android.gms.internal.auth.zzhj.zze(p2))) {
            throw com.google.android.gms.internal.auth.zzfa.zzb();
        } else {
            p3[p4] = ((char) (((p1 & 31) << 6) | (p2 & 63)));
            return;
        }
    }

    public static bridge synthetic boolean zzd(byte p0)
    {
        if (p0 < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zze(byte p1)
    {
        if (p1 <= -65) {
            return 0;
        } else {
            return 1;
        }
    }
}
