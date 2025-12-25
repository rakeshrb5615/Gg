package com.google.android.gms.internal.fido;
public final class zzap {

    public static int zza(int p1, int p2, String p3)
    {
        if ((p1 >= null) && (p1 < p2)) {
            return p1;
        } else {
            String v1_1;
            if (p1 < null) {
                v1_1 = com.google.android.gms.internal.fido.zzaq.zza("%s (%s) must not be negative", new Object[] {"index", Integer.valueOf(p1)}));
            } else {
                if (p2 >= null) {
                    v1_1 = com.google.android.gms.internal.fido.zzaq.zza("%s (%s) must be less than size (%s)", new Object[] {"index", Integer.valueOf(p1), Integer.valueOf(p2)}));
                } else {
                    throw new IllegalArgumentException(g2.g.c(p2, "negative size: "));
                }
            }
            throw new IndexOutOfBoundsException(v1_1);
        }
    }

    public static int zzb(int p1, int p2, String p3)
    {
        if ((p1 < null) || (p1 > p2)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.fido.zzap.zzf(p1, p2, "index"));
        } else {
            return p1;
        }
    }

    public static void zzc(boolean p0)
    {
        if (p0 == null) {
            throw new IllegalArgumentException();
        } else {
            return;
        }
    }

    public static void zzd(boolean p0, String p1, char p2)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(com.google.android.gms.internal.fido.zzaq.zza(p1, new Object[] {Character.valueOf(p2)})));
        } else {
            return;
        }
    }

    public static void zze(int p1, int p2, int p3)
    {
        if ((p1 >= null) && ((p2 >= p1) && (p2 <= p3))) {
            return;
        } else {
            if ((p1 < null) || (p1 > p3)) {
                String v1_3 = com.google.android.gms.internal.fido.zzap.zzf(p1, p3, "start index");
            } else {
                if ((p2 >= null) && (p2 <= p3)) {
                    v1_3 = com.google.android.gms.internal.fido.zzaq.zza("end index (%s) must not be less than start index (%s)", new Object[] {Integer.valueOf(p2), Integer.valueOf(p1)}));
                } else {
                    v1_3 = com.google.android.gms.internal.fido.zzap.zzf(p2, p3, "end index");
                }
            }
            throw new IndexOutOfBoundsException(v1_3);
        }
    }

    private static String zzf(int p0, int p1, String p2)
    {
        if (p0 >= null) {
            if (p1 < null) {
                throw new IllegalArgumentException(g2.g.c(p1, "negative size: "));
            } else {
                return com.google.android.gms.internal.fido.zzaq.zza("%s (%s) must not be greater than size (%s)", new Object[] {p2, Integer.valueOf(p0), Integer.valueOf(p1)}));
            }
        } else {
            return com.google.android.gms.internal.fido.zzaq.zza("%s (%s) must not be negative", new Object[] {p2, Integer.valueOf(p0)}));
        }
    }
}
