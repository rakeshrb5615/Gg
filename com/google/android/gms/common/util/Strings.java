package com.google.android.gms.common.util;
public class Strings {
    private static final java.util.regex.Pattern zza;

    static Strings()
    {
        com.google.android.gms.common.util.Strings.zza = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");
        return;
    }

    private Strings()
    {
        return;
    }

    public static String emptyToNull(String p1)
    {
        if (android.text.TextUtils.isEmpty(p1)) {
            p1 = 0;
        }
        return p1;
    }

    public static boolean isEmptyOrWhitespace(String p0)
    {
        if ((p0 != 0) && (!p0.trim().isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }
}
