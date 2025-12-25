package com.google.android.recaptcha.internal;
public final class zzeu implements com.google.android.recaptcha.internal.zzet {
    private final String zza;

    public zzeu(String p1)
    {
        this.zza = p1;
        return;
    }

    private static final void zzb(byte[] p5)
    {
        java.util.Iterator v5_3 = com.google.android.recaptcha.internal.zzrf.zzk(p5).zzl().iterator();
        while (v5_3.hasNext()) {
            com.google.android.recaptcha.internal.zzrc v0_1 = ((com.google.android.recaptcha.internal.zzrc) v5_3.next());
            com.google.android.recaptcha.internal.zzqq v1_0 = "INIT_TOTAL";
            java.util.List v3_1 = a.a.H(new String[] {"INIT_TOTAL", "EXECUTE_TOTAL"}));
            switch (v0_1.zzY()) {
                case 2:
                    v1_0 = "UNKNOWN";
                    break;
                case 3:
                    v1_0 = "INIT_NATIVE";
                    break;
                case 4:
                    v1_0 = "INIT_NETWORK";
                    break;
                case 5:
                    v1_0 = "INIT_JS";
                case 6:
                    break;
                case 7:
                    v1_0 = "EXECUTE_NATIVE";
                    break;
                case 8:
                    v1_0 = "EXECUTE_JS";
                    break;
                case 9:
                    v1_0 = "EXECUTE_TOTAL";
                    break;
                case 10:
                    v1_0 = "CHALLENGE_ACCOUNT_NATIVE";
                    break;
                case 11:
                    v1_0 = "CHALLENGE_ACCOUNT_JS";
                    break;
                case 12:
                    v1_0 = "CHALLENGE_ACCOUNT_TOTAL";
                    break;
                case 13:
                    v1_0 = "VERIFY_PIN_NATIVE";
                    break;
                case 14:
                    v1_0 = "VERIFY_PIN_JS";
                    break;
                case 15:
                    v1_0 = "VERIFY_PIN_TOTAL";
                    break;
                case 16:
                    v1_0 = "RUN_PROGRAM";
                    break;
                case 17:
                    v1_0 = "FETCH_ALLOWLIST";
                    break;
                case 18:
                    v1_0 = "JS_LOAD";
                    break;
                case 19:
                    v1_0 = "WEB_VIEW_RELOAD_JS";
                    break;
                case 20:
                    v1_0 = "INIT_NETWORK_MRI_ACTION";
                    break;
                case 21:
                    v1_0 = "INIT_DOWNLOAD_JS";
                    break;
                case 22:
                    v1_0 = "VALIDATE_INPUT";
                    break;
                case 23:
                    v1_0 = "DOWNLOAD_JS";
                    break;
                case 24:
                    v1_0 = "SAVE_CACHE_JS";
                    break;
                case 25:
                    v1_0 = "LOAD_CACHE_JS";
                    break;
                case 26:
                    v1_0 = "LOAD_WEBVIEW";
                    break;
                case 27:
                    v1_0 = "COLLECT_SIGNALS";
                    break;
                case 28:
                    v1_0 = "FETCH_TOKEN";
                    break;
                case 29:
                    v1_0 = "POST_EXECUTE";
                    break;
                case 30:
                    v1_0 = "SIGNAL_MANAGER_INITIALIZATION";
                    break;
                case 31:
                    v1_0 = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                    break;
                case 32:
                    v1_0 = "WEBVIEW_ENGINE_INITIALIATION";
                    break;
                case 33:
                    v1_0 = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 34:
                    v1_0 = "NATIVE_ENGINE_INITIALIZATION";
                    break;
                case 35:
                    v1_0 = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 36:
                    v1_0 = "NATIVE_SIGNAL_INITIALIZATION";
                    break;
                case 37:
                    v1_0 = "NATIVE_SIGNAL_COLLECTION";
                    break;
                case 38:
                    v1_0 = "PIA_WARMUP";
                    break;
                case 39:
                    v1_0 = "GMSCORE_ENGINE_INITIALIZATION";
                    break;
                case 40:
                    v1_0 = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 41:
                    v1_0 = "INIT_ATTEMPT";
                    break;
                case 42:
                    v1_0 = "WEBVIEW_INITIALIZATION";
                    break;
                default:
                    v1_0 = "UNRECOGNIZED";
            }
            if ((!v3_1.contains(v1_0)) || (!v0_1.zzX())) {
                v0_1.zzM();
                v0_1.zzN();
                v0_1.zzY();
                v0_1.zzZ();
            } else {
                v0_1.zzM();
                v0_1.zzN();
                v0_1.zzY();
                v0_1.zzg().zzk();
                v0_1.zzg().zzf();
                v0_1.zzZ();
            }
        }
        return;
    }

    public final boolean zza(byte[] p6)
    {
        String v1_8;
        android.net.TrafficStats.setThreadStatsTag(((int) Thread.currentThread().getId()));
        com.google.android.recaptcha.internal.zzeu.zzb(p6);
        if (!android.webkit.URLUtil.isHttpUrl(this.zza)) {
            if (!android.webkit.URLUtil.isHttpsUrl(this.zza)) {
                throw new java.net.MalformedURLException("Recaptcha server url only allows using Http or Https.");
            } else {
                String v1_7 = new java.net.URL(this.zza).openConnection();
                kotlin.jvm.internal.j.c(v1_7, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                v1_8 = ((javax.net.ssl.HttpsURLConnection) v1_7);
            }
        } else {
            String v1_11 = new java.net.URL(this.zza).openConnection();
            kotlin.jvm.internal.j.c(v1_11, "null cannot be cast to non-null type java.net.HttpURLConnection");
            v1_8 = ((java.net.HttpURLConnection) v1_11);
        }
        v1_8.setRequestMethod("POST");
        v1_8.setDoOutput(1);
        v1_8.setRequestProperty("Content-Type", "application/x-protobuffer");
        v1_8.connect();
        v1_8.getOutputStream().write(p6);
        if (v1_8.getResponseCode() != 200) {
            return 0;
        } else {
            return 1;
        }
    }
}
