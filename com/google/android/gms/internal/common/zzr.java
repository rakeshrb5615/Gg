package com.google.android.gms.internal.common;
public final class zzr {

    public static void zza(boolean p0)
    {
        if (p0 == null) {
            throw new IllegalStateException();
        } else {
            return;
        }
    }

    public static int zzb(int p1, int p2, String p3)
    {
        if ((p1 >= null) && (p1 < p2)) {
            return p1;
        } else {
            String v1_1;
            if (p1 < null) {
                v1_1 = com.google.android.gms.internal.common.zzx.zza("%s (%s) must not be negative", new Object[] {"index", Integer.valueOf(p1)}));
            } else {
                if (p2 >= null) {
                    v1_1 = com.google.android.gms.internal.common.zzx.zza("%s (%s) must be less than size (%s)", new Object[] {"index", Integer.valueOf(p1), Integer.valueOf(p2)}));
                } else {
                    throw new IllegalArgumentException(v1.a.m(new StringBuilder((String.valueOf(p2).length() + 15)), "negative size: ", p2));
                }
            }
            throw new IndexOutOfBoundsException(v1_1);
        }
    }

    public static int zzc(int p1, int p2, String p3)
    {
        if ((p1 < null) || (p1 > p2)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.common.zzr.zze(p1, p2, "index"));
        } else {
            return p1;
        }
    }

    public static void zzd(int p1, int p2, int p3)
    {
        if ((p1 >= null) && ((p2 >= p1) && (p2 <= p3))) {
            return;
        } else {
            if ((p1 < null) || (p1 > p3)) {
                String v1_3 = com.google.android.gms.internal.common.zzr.zze(p1, p3, "start index");
            } else {
                if ((p2 >= null) && (p2 <= p3)) {
                    v1_3 = com.google.android.gms.internal.common.zzx.zza("end index (%s) must not be less than start index (%s)", new Object[] {Integer.valueOf(p2), Integer.valueOf(p1)}));
                } else {
                    v1_3 = com.google.android.gms.internal.common.zzr.zze(p2, p3, "end index");
                }
            }
            throw new IndexOutOfBoundsException(v1_3);
        }
    }

    private static String zze(int p1, int p2, String p3)
    {
        if (p1 >= null) {
            if (p2 < null) {
                throw new IllegalArgumentException(v1.a.m(new StringBuilder((String.valueOf(p2).length() + 15)), "negative size: ", p2));
            } else {
                return com.google.android.gms.internal.common.zzx.zza("%s (%s) must not be greater than size (%s)", new Object[] {p3, Integer.valueOf(p1), Integer.valueOf(p2)}));
            }
        } else {
            return com.google.android.gms.internal.common.zzx.zza("%s (%s) must not be negative", new Object[] {p3, Integer.valueOf(p1)}));
        }
    }
}
