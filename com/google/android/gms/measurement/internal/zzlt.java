package com.google.android.gms.measurement.internal;
public final class zzlt {

    public static String zza(android.content.Context p1, String p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        p2 = p1.getResources();
        if (android.text.TextUtils.isEmpty(p3)) {
            p3 = com.google.android.gms.measurement.internal.zzhu.zza(p1);
        }
        return com.google.android.gms.measurement.internal.zzhu.zzb("google_app_id", p2, p3);
    }

    public static Object zzb(Object p4)
    {
        try {
            if (p4 == 0) {
                return 0;
            } else {
                Throwable v1_4 = new java.io.ByteArrayOutputStream();
                int v2_1 = new java.io.ObjectOutputStream(v1_4);
                v2_1.writeObject(p4);
                v2_1.flush();
                int v4_2 = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(v1_4.toByteArray()));
                Throwable v1_3 = v4_2.readObject();
                v2_1.close();
                v4_2.close();
                return v1_3;
            }
        } catch (ClassNotFoundException) {
            return 0;
        }
    }

    public static String zzc(String p3, String[] p4, String[] p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        int v0_1 = Math.min(p4.length, p5.length);
        int v1_0 = 0;
        while (v1_0 < v0_1) {
            boolean v2_0 = p4[v1_0];
            if (((p3 != null) || (v2_0)) && ((p3 == null) || (!p3.equals(v2_0)))) {
                v1_0++;
            } else {
                return p5[v1_0];
            }
        }
        return 0;
    }
}
