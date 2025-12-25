package com.google.android.gms.common.util;
final class zzf {
    private static final java.util.regex.Pattern zza;

    static zzf()
    {
        com.google.android.gms.common.util.zzf.zza = java.util.regex.Pattern.compile("\\\\u[0-9a-fA-F]{4}");
        return;
    }

    public static String zza(String p7)
    {
        if (!android.text.TextUtils.isEmpty(p7)) {
            int v0_3 = com.google.android.gms.common.util.zzf.zza.matcher(p7);
            StringBuilder v1_1 = 0;
            int v2_2 = 0;
            while (v0_3.find()) {
                if (v1_1 == null) {
                    v1_1 = new StringBuilder();
                }
                int v3_1 = v0_3.start();
                int v4_0 = v3_1;
                while ((v4_0 >= 0) && (p7.charAt(v4_0) == 92)) {
                    v4_0--;
                }
                if (((v3_1 - v4_0) % 2) != 0) {
                    int v3_6 = Integer.parseInt(v0_3.group().substring(2), 16);
                    v1_1.append(p7, v2_2, v0_3.start());
                    if (v3_6 != 92) {
                        v1_1.append(Character.toChars(v3_6));
                    } else {
                        v1_1.append("\\\\");
                    }
                    v2_2 = v0_3.end();
                }
            }
            if (v1_1 != null) {
                if (v2_2 < v0_3.regionEnd()) {
                    v1_1.append(p7, v2_2, v0_3.regionEnd());
                }
                p7 = v1_1.toString();
            }
        }
        return p7;
    }
}
