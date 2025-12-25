package com.google.android.recaptcha.internal;
public final class zzjf {

    public static void zza(boolean p0)
    {
        if (p0 == null) {
            throw new IllegalArgumentException();
        } else {
            return;
        }
    }

    public static void zzb(boolean p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(((String) p1));
        } else {
            return;
        }
    }

    public static void zzc(boolean p0, String p1, char p2)
    {
        if (p0 == null) {
            throw new IllegalArgumentException(com.google.android.recaptcha.internal.zzji.zza(p1, new Object[] {Character.valueOf(p2)})));
        } else {
            return;
        }
    }

    public static void zzd(int p1, int p2, int p3)
    {
        if ((p1 >= null) && ((p2 >= p1) && (p2 <= p3))) {
            return;
        } else {
            if ((p1 < null) || (p1 > p3)) {
                String v1_3 = com.google.android.recaptcha.internal.zzjf.zzf(p1, p3, "start index");
            } else {
                if ((p2 >= null) && (p2 <= p3)) {
                    v1_3 = com.google.android.recaptcha.internal.zzji.zza("end index (%s) must not be less than start index (%s)", new Object[] {Integer.valueOf(p2), Integer.valueOf(p1)}));
                } else {
                    v1_3 = com.google.android.recaptcha.internal.zzjf.zzf(p2, p3, "end index");
                }
            }
            throw new IndexOutOfBoundsException(v1_3);
        }
    }

    public static void zze(boolean p0, Object p1)
    {
        if (p0 == null) {
            throw new IllegalStateException(((String) p1));
        } else {
            return;
        }
    }

    private static String zzf(int p0, int p1, String p2)
    {
        if (p0 >= null) {
            return com.google.android.recaptcha.internal.zzji.zza("%s (%s) must not be greater than size (%s)", new Object[] {p2, Integer.valueOf(p0), Integer.valueOf(p1)}));
        } else {
            return com.google.android.recaptcha.internal.zzji.zza("%s (%s) must not be negative", new Object[] {p2, Integer.valueOf(p0)}));
        }
    }
}
