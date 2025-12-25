package com.google.android.gms.common.util;
public class SharedPreferencesUtils {

    private SharedPreferencesUtils()
    {
        return;
    }

    public static void publishWorldReadableSharedPreferences(android.content.Context p0, android.content.SharedPreferences$Editor p1, String p2)
    {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
