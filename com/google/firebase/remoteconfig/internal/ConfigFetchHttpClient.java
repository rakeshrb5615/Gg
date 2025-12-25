package com.google.firebase.remoteconfig.internal;
public class ConfigFetchHttpClient {
    public static final java.util.regex.Pattern h;
    public final android.content.Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    static ConfigFetchHttpClient()
    {
        com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.h = java.util.regex.Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
        return;
    }

    public ConfigFetchHttpClient(android.content.Context p1, String p2, String p3, long p4, long p6)
    {
        String v1_1;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        String v1_4 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.h.matcher(p2);
        if (!v1_4.matches()) {
            v1_1 = 0;
        } else {
            v1_1 = v1_4.group(1);
        }
        this.d = v1_1;
        this.e = "firebase";
        this.f = p4;
        this.g = p6;
        return;
    }

    public static org.json.JSONObject c(java.net.HttpURLConnection p3)
    {
        org.json.JSONObject v0_3 = new java.io.BufferedReader(new java.io.InputStreamReader(p3.getInputStream(), "utf-8"));
        String v3_4 = new StringBuilder();
        while(true) {
            char v1_1 = v0_3.read();
            if (v1_1 == -1) {
                break;
            }
            v3_4.append(((char) v1_1));
        }
        return new org.json.JSONObject(v3_4.toString());
    }

    public static void d(java.net.HttpURLConnection p1, byte[] p2)
    {
        p1.setFixedLengthStreamingMode(p2.length);
        java.io.BufferedOutputStream v0_2 = new java.io.BufferedOutputStream(p1.getOutputStream());
        v0_2.write(p2);
        v0_2.flush();
        v0_2.close();
        return;
    }

    public final org.json.JSONObject a(String p6, String p7, java.util.Map p8, Long p9, java.util.Map p10)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        if (p6 == null) {
            throw new m6.c("Fetch failed: Firebase installation id is null.");
        } else {
            v0_1.put("appInstanceId", p6);
            v0_1.put("appInstanceIdToken", p7);
            v0_1.put("appId", this.b);
            org.json.JSONObject v6_4 = this.a;
            String v7_4 = v6_4.getResources().getConfiguration().locale;
            v0_1.put("countryCode", v7_4.getCountry());
            int v1_1 = android.os.Build$VERSION.SDK_INT;
            v0_1.put("languageCode", v7_4.toLanguageTag());
            v0_1.put("platformVersion", Integer.toString(v1_1));
            v0_1.put("timeZone", java.util.TimeZone.getDefault().getID());
            try {
                String v7_11 = v6_4.getPackageManager().getPackageInfo(v6_4.getPackageName(), 0);
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                v0_1.put("packageName", v6_4.getPackageName());
                v0_1.put("sdkVersion", "23.0.1");
                v0_1.put("analyticsUserProperties", new org.json.JSONObject(p8));
                if (!p10.isEmpty()) {
                    v0_1.put("customSignals", new org.json.JSONObject(p10));
                    org.json.JSONObject v6_15 = new StringBuilder("Keys of custom signals during fetch: ");
                    v6_15.append(p10.keySet());
                    android.util.Log.d("FirebaseRemoteConfig", v6_15.toString());
                }
                if (p9 != null) {
                    org.json.JSONObject v6_19 = new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", java.util.Locale.US);
                    v6_19.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                    v0_1.put("firstOpenTime", v6_19.format(p9));
                }
                return new org.json.JSONObject(v0_1);
            }
            if (v7_11 == null) {
            } else {
                long v3_3;
                v0_1.put("appVersion", v7_11.versionName);
                if (v1_1 < 28) {
                    v3_3 = ((long) v7_11.versionCode);
                } else {
                    v3_3 = e0.a.d(v7_11);
                }
                v0_1.put("appBuild", Long.toString(v3_3));
            }
        }
    }

    public final java.net.HttpURLConnection b()
    {
        try {
            m6.d v1_0 = this.d;
            String v2 = this.e;
            StringBuilder v3_1 = new StringBuilder("https://firebaseremoteconfig.googleapis.com/v1/projects/");
            v3_1.append(v1_0);
            v3_1.append("/namespaces/");
            v3_1.append(v2);
            v3_1.append(":fetch");
            return ((java.net.HttpURLConnection) new java.net.URL(v3_1.toString()).openConnection());
        } catch (String v0_4) {
            throw new m6.d(v0_4.getMessage());
        }
    }

    public n6.h fetch(java.net.HttpURLConnection p14, String p15, String p16, java.util.Map p17, String p18, java.util.Map p19, Long p20, java.util.Date p21, java.util.Map p22)
    {
        p14.setDoOutput(1);
        n6.h v0_7 = java.util.concurrent.TimeUnit.SECONDS;
        p14.setConnectTimeout(((int) v0_7.toMillis(this.f)));
        p14.setReadTimeout(((int) v0_7.toMillis(this.g)));
        p14.setRequestProperty("If-None-Match", p18);
        p14.setRequestProperty("X-Goog-Api-Key", this.c);
        n6.f v2_12 = this.a;
        p14.setRequestProperty("X-Android-Package", v2_12.getPackageName());
        n6.h v0_12;
        org.json.JSONObject v4_18 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(v2_12, v2_12.getPackageName());
        if (v4_18 != null) {
            v0_12 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(v4_18, 0);
            p14.setRequestProperty("X-Android-Cert", v0_12);
            p14.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            p14.setRequestProperty("X-Goog-Firebase-Installations-Auth", p16);
            p14.setRequestProperty("Content-Type", "application/json");
            p14.setRequestProperty("Accept", "application/json");
            n6.h v0_21 = p19.entrySet().iterator();
            while (v0_21.hasNext()) {
                n6.f v2_15 = ((java.util.Map$Entry) v0_21.next());
                p14.setRequestProperty(((String) v2_15.getKey()), ((String) v2_15.getValue()));
            }
            try {
                com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.d(p14, this.a(p15, p16, p17, p20, p22).toString().getBytes("utf-8"));
                p14.connect();
                n6.h v0_25 = p14.getResponseCode();
            } catch (n6.h v0_26) {
                throw new m6.c("The client had an error while calling the backend!", v0_26);
            } catch (n6.h v0_26) {
            } catch (n6.h v0_0) {
                p14.disconnect();
                try {
                    p14.getInputStream().close();
                } catch (java.io.IOException) {
                }
                throw v0_0;
            }
            if (v0_25 != 200) {
                throw new m6.f(v0_25, p14.getResponseMessage());
            } else {
                n6.h v0_3 = p14.getHeaderField("ETag");
                n6.h v1_2 = com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.c(p14);
                p14.disconnect();
                p14.getInputStream().close();
                String v3_0 = n6.f.c();
                v3_0.b = p21;
                try {
                    org.json.JSONObject v4_2 = v1_2.getJSONObject("entries");
                } catch (org.json.JSONException) {
                    v4_2 = 0;
                }
                if (v4_2 != null) {
                    v3_0.a = new org.json.JSONObject(v4_2.toString());
                }
                try {
                    org.json.JSONObject v4_5 = v1_2.getJSONArray("experimentDescriptions");
                } catch (org.json.JSONException) {
                    v4_5 = 0;
                }
                if (v4_5 != null) {
                    v3_0.c = new org.json.JSONArray(v4_5.toString());
                }
                try {
                    org.json.JSONObject v4_8 = v1_2.getJSONObject("personalizationMetadata");
                } catch (org.json.JSONException) {
                    v4_8 = 0;
                }
                if (v4_8 != null) {
                    v3_0.d = new org.json.JSONObject(v4_8.toString());
                }
                if (!v1_2.has("templateVersion")) {
                    n6.f v2_5 = 0;
                } else {
                    v2_5 = v1_2.getString("templateVersion");
                }
                if (v2_5 != null) {
                    v3_0.e = Long.parseLong(v2_5);
                }
                try {
                    n6.f v2_7 = v1_2.getJSONArray("rolloutMetadata");
                } catch (org.json.JSONException) {
                    v2_7 = 0;
                }
                if (v2_7 != null) {
                    v3_0.f = new org.json.JSONArray(v2_7.toString());
                }
                n6.f v2_11 = new n6.f(v3_0.a, v3_0.b, v3_0.c, v3_0.d, v3_0.e, v3_0.f);
                try {
                    n6.h v1_7 = (v1_2.get("state").equals("NO_CHANGE") ^ 1);
                } catch (org.json.JSONException) {
                    v1_7 = 1;
                }
                if (v1_7 != null) {
                    return new n6.h(0, v2_11, v0_3);
                } else {
                    return new n6.h(1, v2_11, 0);
                }
            }
        } else {
            org.json.JSONObject v4_20 = new StringBuilder("Could not get fingerprint hash for package: ");
            v4_20.append(v2_12.getPackageName());
            android.util.Log.e("FirebaseRemoteConfig", v4_20.toString());
            v0_12 = 0;
        }
    }
}
