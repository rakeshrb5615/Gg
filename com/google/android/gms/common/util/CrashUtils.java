package com.google.android.gms.common.util;
public final class CrashUtils {
    private static final String[] zza;

    static CrashUtils()
    {
        com.google.android.gms.common.util.CrashUtils.zza = new String[] {"android.", "com.android.", "dalvik.", "java.", "javax."});
        return;
    }

    public CrashUtils()
    {
        return;
    }

    public static boolean addDynamiteErrorToDropBox(android.content.Context p1, Throwable p2)
    {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        } catch (int v1_1) {
            android.util.Log.e("CrashUtils", "Error adding exception to DropBox!", v1_1);
        }
        return 0;
    }
}
