package com.google.android.gms.measurement.internal;
public final class zzhu {

    public static String zza(android.content.Context p2)
    {
        try {
            String v2_1 = p2.getResources().getResourcePackageName(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
            return v2_1;
        } catch (android.content.res.Resources$NotFoundException) {
            return v2_1.getPackageName();
        }
    }

    public static final String zzb(String p1, android.content.res.Resources p2, String p3)
    {
        String v1_1 = p2.getIdentifier("google_app_id", "string", p3);
        if (v1_1 != null) {
            try {
                return p2.getString(v1_1);
            } catch (android.content.res.Resources$NotFoundException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static final Boolean zzc(String p1, android.content.res.Resources p2, String p3)
    {
        Boolean v1_1 = p2.getIdentifier("google_analytics_force_disable_updates", "bool", p3);
        if (v1_1 != null) {
            try {
                return Boolean.valueOf(p2.getBoolean(v1_1));
            } catch (android.content.res.Resources$NotFoundException) {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
