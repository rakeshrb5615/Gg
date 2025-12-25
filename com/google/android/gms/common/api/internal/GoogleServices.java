package com.google.android.gms.common.api.internal;
public final class GoogleServices {
    private static final Object zza;
    private static com.google.android.gms.common.api.internal.GoogleServices zzb;
    private final String zzc;
    private final com.google.android.gms.common.api.Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static GoogleServices()
    {
        com.google.android.gms.common.api.internal.GoogleServices.zza = new Object();
        return;
    }

    public GoogleServices(android.content.Context p5)
    {
        int v0_1 = p5.getResources();
        String v1_4 = v0_1.getIdentifier("google_app_measurement_enable", "integer", v0_1.getResourcePackageName(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue));
        int v2_0 = 1;
        if (v1_4 == null) {
            this.zzf = 0;
        } else {
            String v1_0;
            int v0_0 = v0_1.getInteger(v1_4);
            if (v0_0 == 0) {
                v1_0 = 1;
            } else {
                v1_0 = 0;
            }
            if (v0_0 == 0) {
                v2_0 = 0;
            }
            this.zzf = v1_0;
        }
        this.zze = v2_0;
        int v0_2 = com.google.android.gms.common.internal.zzae.zza(p5);
        if (v0_2 == 0) {
            v0_2 = new com.google.android.gms.common.internal.StringResourceValueReader(p5).getString("google_app_id");
        }
        if (!android.text.TextUtils.isEmpty(v0_2)) {
            this.zzc = v0_2;
            this.zzd = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
            return;
        } else {
            this.zzd = new com.google.android.gms.common.api.Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = 0;
            return;
        }
    }

    public GoogleServices(String p1, boolean p2)
    {
        this.zzc = p1;
        this.zzd = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        this.zze = p2;
        this.zzf = (p2 ^ 1);
        return;
    }

    private static com.google.android.gms.common.api.internal.GoogleServices checkInitialized(String p6)
    {
        IllegalStateException v3_1 = com.google.android.gms.common.api.internal.GoogleServices.zzb;
        if (v3_1 == null) {
            StringBuilder v5_1 = new StringBuilder((String.valueOf(p6).length() + 34));
            v5_1.append("Initialize must be called before ");
            v5_1.append(p6);
            v5_1.append(".");
            throw new IllegalStateException(v5_1.toString());
        } else {
            return v3_1;
        }
    }

    public static void clearInstanceForTest()
    {
        try {
            com.google.android.gms.common.api.internal.GoogleServices.zzb = 0;
            return;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public static String getGoogleAppId()
    {
        return com.google.android.gms.common.api.internal.GoogleServices.checkInitialized("getGoogleAppId").zzc;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Context must not be null.");
        if (com.google.android.gms.common.api.internal.GoogleServices.zzb == null) {
            com.google.android.gms.common.api.internal.GoogleServices.zzb = new com.google.android.gms.common.api.internal.GoogleServices(p2);
        }
        return com.google.android.gms.common.api.internal.GoogleServices.zzb.zzd;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context p1, String p2, boolean p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Context must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "App ID must be nonempty.");
        com.google.android.gms.common.api.internal.GoogleServices v0_1 = com.google.android.gms.common.api.internal.GoogleServices.zzb;
        if (v0_1 == null) {
            com.google.android.gms.common.api.internal.GoogleServices v0_3 = new com.google.android.gms.common.api.internal.GoogleServices(p2, p3);
            com.google.android.gms.common.api.internal.GoogleServices.zzb = v0_3;
            return v0_3.zzd;
        } else {
            return v0_1.checkGoogleAppId(p2);
        }
    }

    public static boolean isMeasurementEnabled()
    {
        int v0_2 = com.google.android.gms.common.api.internal.GoogleServices.checkInitialized("isMeasurementEnabled");
        if ((!v0_2.zzd.isSuccess()) || (!v0_2.zze)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isMeasurementExplicitlyDisabled()
    {
        return com.google.android.gms.common.api.internal.GoogleServices.checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    public com.google.android.gms.common.api.Status checkGoogleAppId(String p5)
    {
        int v0_0 = this.zzc;
        if ((v0_0 == 0) || (v0_0.equals(p5))) {
            return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        } else {
            return new com.google.android.gms.common.api.Status(10, v1.a.o(new StringBuilder((v0_0.length() + 97)), "Initialize was called with two different Google App IDs.  Only the first app ID will be used: \'", v0_0, "\'."));
        }
    }
}
