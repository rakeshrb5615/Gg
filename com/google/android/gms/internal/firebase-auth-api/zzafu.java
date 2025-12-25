package com.google.android.gms.internal.firebase-auth-api;
public final class zzafu {

    public static void zza(String p2, com.google.android.gms.internal.firebase-auth-api.zzafa p3, com.google.android.gms.internal.firebase-auth-api.zzafv p4, reflect.Type p5, com.google.android.gms.internal.firebase-auth-api.zzafe p6)
    {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
            Throwable v2_7 = ((java.net.HttpURLConnection) new java.net.URL(p2).openConnection());
            v2_7.setDoOutput(1);
            Throwable v3_1 = p3.zza().getBytes(java.nio.charset.Charset.defaultCharset());
            v2_7.setFixedLengthStreamingMode(v3_1.length);
            v2_7.setRequestProperty("Content-Type", "application/json");
            v2_7.setConnectTimeout(60000);
            p6.zza(v2_7);
            java.io.BufferedOutputStream v6_2 = new java.io.BufferedOutputStream(v2_7.getOutputStream(), v3_1.length);
            try {
                v6_2.write(v3_1, 0, v3_1.length);
            } catch (Throwable v2_1) {
                try {
                    v6_2.close();
                } catch (Throwable v3_2) {
                    v2_1.addSuppressed(v3_2);
                }
                throw v2_1;
            }
            v6_2.close();
            com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v2_7, p4, p5);
            return;
        } catch (java.net.SocketTimeoutException) {
            p4.zza("TIMEOUT");
            return;
        } catch (java.net.UnknownHostException) {
            p4.zza("<<Network Error>>");
            return;
        } catch (Throwable v2_2) {
            p4.zza(v2_2.getMessage());
            return;
        } catch (Throwable v2_2) {
            p4.zza(v2_2.getMessage());
            return;
        } catch (Throwable v2_2) {
            p4.zza(v2_2.getMessage());
            return;
        }
    }

    public static void zza(String p1, com.google.android.gms.internal.firebase-auth-api.zzafv p2, reflect.Type p3, com.google.android.gms.internal.firebase-auth-api.zzafe p4)
    {
        try {
            String v1_6 = ((java.net.HttpURLConnection) new java.net.URL(p1).openConnection());
            v1_6.setConnectTimeout(60000);
            p4.zza(v1_6);
            com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v1_6, p2, p3);
            return;
        } catch (java.net.SocketTimeoutException) {
            p2.zza("TIMEOUT");
            return;
        } catch (java.net.UnknownHostException) {
            p2.zza("<<Network Error>>");
            return;
        } catch (String v1_1) {
            p2.zza(v1_1.getMessage());
            return;
        }
    }

    private static void zza(java.net.HttpURLConnection p6, com.google.android.gms.internal.firebase-auth-api.zzafv p7, reflect.Type p8)
    {
        String v1_3;
        Throwable v0_0 = p6.getResponseCode();
        if (!com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0)) {
            v1_3 = p6.getErrorStream();
        } else {
            v1_3 = p6.getInputStream();
        }
        StringBuilder v2_0 = new StringBuilder();
        java.io.BufferedReader v3_1 = new java.io.BufferedReader(new java.io.InputStreamReader(v1_3, "UTF-8"));
        try {
            while(true) {
                String v1_0 = v3_1.readLine();
                v2_0.append(v1_0);
            }
            v3_1.close();
            String v1_1 = v2_0.toString();
            if (com.google.android.gms.internal.firebase-auth-api.zzafu.zza(v0_0)) {
                p7.zza(((com.google.android.gms.internal.firebase-auth-api.zzaez) com.google.android.gms.internal.firebase-auth-api.zzaex.zza(v1_1, p8)));
            } else {
                p7.zza(((String) com.google.android.gms.internal.firebase-auth-api.zzaex.zza(v1_1, String)));
            }
            p6.disconnect();
            return;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzaez v8_1) {
            try {
                v3_1.close();
            } catch (Throwable v0_1) {
                v8_1.addSuppressed(v0_1);
            }
            throw v8_1;
        }
        if (v1_0 != null) {
        }
    }

    private static final boolean zza(int p1)
    {
        if ((p1 < 200) || (p1 >= 300)) {
            return 0;
        } else {
            return 1;
        }
    }
}
