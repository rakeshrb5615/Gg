package com.google.android.gms.internal.common;
public final class zzj {

    public static varargs Object zza(Class p2, String p3, com.google.android.gms.internal.common.zzi[] p4)
    {
        return com.google.android.gms.internal.common.zzj.zzc(p2, "isIsolated", 0, 0, p4);
    }

    public static varargs Object zzb(String p1, String p2, ClassLoader p3, com.google.android.gms.internal.common.zzi[] p4)
    {
        return com.google.android.gms.internal.common.zzj.zzc(p3.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", 0, 0, p4);
    }

    private static varargs Object zzc(Class p2, String p3, Object p4, boolean p5, com.google.android.gms.internal.common.zzi[] p6)
    {
        Object[] v4_0 = p6.length;
        p5 = new Class[v4_0];
        Object[] v4_1 = new Object[v4_0];
        int v0 = 0;
        while (v0 < p6.length) {
            Object v1_0 = p6[v0];
            v1_0.getClass();
            p5[v0] = v1_0.zzc();
            v4_1[v0] = p6[v0].zzd();
            v0++;
        }
        return p2.getDeclaredMethod(p3, p5).invoke(0, v4_1);
    }
}
