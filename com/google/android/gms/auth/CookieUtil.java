package com.google.android.gms.auth;
public final class CookieUtil {

    private CookieUtil()
    {
        return;
    }

    public static String getCookieUrl(String p1, Boolean p2)
    {
        String v2_2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        if (1 == com.google.android.gms.auth.CookieUtil.zza(p2)) {
            v2_2 = "https";
        } else {
            v2_2 = "http";
        }
        return g2.g.e(v2_2, "://", p1);
    }

    public static String getCookieValue(String p1, String p2, String p3, String p4, Boolean p5, Boolean p6, Long p7)
    {
        if (p1 == null) {
            p1 = "";
        }
        StringBuilder v0_1 = new StringBuilder(p1);
        v0_1.append(61);
        if (!android.text.TextUtils.isEmpty(p2)) {
            v0_1.append(p2);
        }
        if (com.google.android.gms.auth.CookieUtil.zza(p5)) {
            v0_1.append(";HttpOnly");
        }
        if (com.google.android.gms.auth.CookieUtil.zza(p6)) {
            v0_1.append(";Secure");
        }
        if (!android.text.TextUtils.isEmpty(p3)) {
            v0_1.append(";Domain=");
            v0_1.append(p3);
        }
        if (!android.text.TextUtils.isEmpty(p4)) {
            v0_1.append(";Path=");
            v0_1.append(p4);
        }
        if ((p7 != null) && (p7.longValue() > 0)) {
            v0_1.append(";Max-Age=");
            v0_1.append(p7);
        }
        if (!android.text.TextUtils.isEmpty(0)) {
            v0_1.append(";Priority=null");
        }
        if (!android.text.TextUtils.isEmpty(0)) {
            v0_1.append(";SameSite=null");
        }
        if (com.google.android.gms.auth.CookieUtil.zza(0)) {
            v0_1.append(";SameParty");
        }
        return v0_1.toString();
    }

    private static boolean zza(Boolean p0)
    {
        if ((p0 == 0) || (!p0.booleanValue())) {
            return 0;
        } else {
            return 1;
        }
    }
}
