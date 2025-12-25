package com.google.android.gms.common.util;
public class HttpUtils {
    private static final java.util.regex.Pattern zza;
    private static final java.util.regex.Pattern zzb;
    private static final java.util.regex.Pattern zzc;

    static HttpUtils()
    {
        com.google.android.gms.common.util.HttpUtils.zza = java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        com.google.android.gms.common.util.HttpUtils.zzb = java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        com.google.android.gms.common.util.HttpUtils.zzc = java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
        return;
    }

    private HttpUtils()
    {
        return;
    }

    public static java.util.Map parse(java.net.URI p6, String p7)
    {
        java.util.HashMap v0_0 = java.util.Collections.EMPTY_MAP;
        IllegalArgumentException v6_1 = p6.getRawQuery();
        if ((v6_1 != null) && (v6_1.length() > 0)) {
            v0_0 = new java.util.HashMap();
            com.google.android.gms.internal.common.zzw v1_1 = com.google.android.gms.internal.common.zzw.zza(com.google.android.gms.internal.common.zzp.zzb(61));
            IllegalArgumentException v6_3 = com.google.android.gms.internal.common.zzw.zza(com.google.android.gms.internal.common.zzp.zzb(38)).zzb().zzc(v6_1).iterator();
            while (v6_3.hasNext()) {
                int v2_7 = v1_1.zzd(((String) v6_3.next()));
                if ((v2_7.isEmpty()) || (v2_7.size() > 2)) {
                    throw new IllegalArgumentException("bad parameter");
                } else {
                    int v2_8;
                    String v3_5 = com.google.android.gms.common.util.HttpUtils.zza(((String) v2_7.get(0)), p7);
                    if (v2_7.size() != 2) {
                        v2_8 = 0;
                    } else {
                        v2_8 = com.google.android.gms.common.util.HttpUtils.zza(((String) v2_7.get(1)), p7);
                    }
                    v0_0.put(v3_5, v2_8);
                }
            }
        }
        return v0_0;
    }

    private static String zza(String p0, String p1)
    {
        if (p1 == null) {
            try {
                p1 = "ISO-8859-1";
            } catch (java.io.UnsupportedEncodingException v0_1) {
                throw new IllegalArgumentException(v0_1);
            }
        }
        return java.net.URLDecoder.decode(p0, p1);
    }
}
