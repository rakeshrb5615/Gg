package com.google.android.gms.internal.firebase-auth-api;
public final class zzu {

    public static int zza(int p2, int p3)
    {
        if ((p2 >= null) && (p2 < p3)) {
            return p2;
        } else {
            String v2_1;
            if (p2 < null) {
                v2_1 = com.google.android.gms.internal.firebase-auth-api.zzac.zza("%s (%s) must not be negative", new Object[] {"index", Integer.valueOf(p2)}));
            } else {
                if (p3 >= null) {
                    v2_1 = com.google.android.gms.internal.firebase-auth-api.zzac.zza("%s (%s) must be less than size (%s)", new Object[] {"index", Integer.valueOf(p2), Integer.valueOf(p3)}));
                } else {
                    throw new IllegalArgumentException(g2.g.c(p3, "negative size: "));
                }
            }
            throw new IndexOutOfBoundsException(v2_1);
        }
    }

    public static int zza(int p1, int p2, String p3)
    {
        if ((p1 < null) || (p1 > p2)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p1, p2, p3));
        } else {
            return p1;
        }
    }

    public static Object zza(Object p0)
    {
        p0.getClass();
        return p0;
    }

    public static void zza(int p1, int p2, int p3)
    {
        if ((p1 >= null) && ((p2 >= p1) && (p2 <= p3))) {
            return;
        } else {
            if ((p1 < null) || (p1 > p3)) {
                String v1_3 = com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p1, p3, "start index");
            } else {
                if ((p2 >= null) && (p2 <= p3)) {
                    v1_3 = com.google.android.gms.internal.firebase-auth-api.zzac.zza("end index (%s) must not be less than start index (%s)", new Object[] {Integer.valueOf(p2), Integer.valueOf(p1)}));
                } else {
                    v1_3 = com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p2, p3, "end index");
                }
            }
            throw new IndexOutOfBoundsException(v1_3);
        }
    }

    public static void zza(boolean p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(com.google.android.gms.internal.firebase-auth-api.zzp.zza(p1));
        } else {
            return;
        }
    }

    public static int zzb(int p2, int p3)
    {
        if ((p2 < null) || (p2 > p3)) {
            throw new IndexOutOfBoundsException(com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p2, p3, "index"));
        } else {
            return p2;
        }
    }

    private static String zzb(int p0, int p1, String p2)
    {
        if (p0 >= null) {
            if (p1 < null) {
                throw new IllegalArgumentException(g2.g.c(p1, "negative size: "));
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzac.zza("%s (%s) must not be greater than size (%s)", new Object[] {p2, Integer.valueOf(p0), Integer.valueOf(p1)}));
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzac.zza("%s (%s) must not be negative", new Object[] {p2, Integer.valueOf(p0)}));
        }
    }
}
