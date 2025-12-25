package com.google.android.gms.common.util;
public final class Base64Utils {

    public Base64Utils()
    {
        return;
    }

    public static byte[] decode(String p1)
    {
        if (p1 != null) {
            return android.util.Base64.decode(p1, 0);
        } else {
            return 0;
        }
    }

    public static byte[] decodeUrlSafe(String p1)
    {
        if (p1 != null) {
            return android.util.Base64.decode(p1, 10);
        } else {
            return 0;
        }
    }

    public static byte[] decodeUrlSafeNoPadding(String p1)
    {
        if (p1 != null) {
            return android.util.Base64.decode(p1, 11);
        } else {
            return 0;
        }
    }

    public static String encode(byte[] p1)
    {
        if (p1 != null) {
            return android.util.Base64.encodeToString(p1, 0);
        } else {
            return 0;
        }
    }

    public static String encodeUrlSafe(byte[] p1)
    {
        if (p1 != null) {
            return android.util.Base64.encodeToString(p1, 10);
        } else {
            return 0;
        }
    }

    public static String encodeUrlSafeNoPadding(byte[] p1)
    {
        if (p1 != null) {
            return android.util.Base64.encodeToString(p1, 11);
        } else {
            return 0;
        }
    }
}
