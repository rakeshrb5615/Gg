package f6;
public final class c {
    public static final java.util.regex.Pattern d;
    public static final java.nio.charset.Charset e;
    public final android.content.Context a;
    public final c6.b b;
    public final f6.d c;

    static c()
    {
        f6.c.d = java.util.regex.Pattern.compile("[0-9]+s");
        f6.c.e = java.nio.charset.Charset.forName("UTF-8");
        return;
    }

    public c(android.content.Context p1, c6.b p2)
    {
        this.a = p1;
        this.b = p2;
        this.c = new f6.d();
        return;
    }

    public static java.net.URL a(String p3)
    {
        try {
            StringBuilder v2_1 = new StringBuilder("https://firebaseinstallations.googleapis.com/v1/");
            v2_1.append(p3);
            return new java.net.URL(v2_1.toString());
        } catch (String v3_3) {
            throw new d6.e(v3_3.getMessage());
        }
    }

    public static void b(java.net.HttpURLConnection p5, String p6, String p7, String p8)
    {
        StringBuilder v0_0 = p5.getErrorStream();
        String v1_0 = 0;
        try {
            if (v0_0 != null) {
                String v2_2 = new java.io.BufferedReader(new java.io.InputStreamReader(v0_0, f6.c.e));
                StringBuilder v0_1 = new StringBuilder();
                while(true) {
                    String v3_0 = v2_2.readLine();
                    if (v3_0 == null) {
                        break;
                    }
                    v0_1.append(v3_0);
                    v0_1.append(10);
                }
                v1_0 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", new Object[] {Integer.valueOf(p5.getResponseCode()), p5.getResponseMessage(), v0_1}));
                v2_2.close();
            }
        } catch (java.io.IOException) {
        }
        if (!android.text.TextUtils.isEmpty(v1_0)) {
            String v6_1;
            android.util.Log.w("Firebase-Installations", v1_0);
            if (!android.text.TextUtils.isEmpty(p6)) {
                v6_1 = g2.g.l(", ", p6);
            } else {
                v6_1 = "";
            }
            StringBuilder v0_4 = new StringBuilder("Firebase options used while communicating with Firebase server APIs: ");
            v0_4.append(p7);
            v0_4.append(", ");
            v0_4.append(p8);
            v0_4.append(v6_1);
            android.util.Log.w("Firebase-Installations", v0_4.toString());
        }
        return;
    }

    public static long d(String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument(f6.c.d.matcher(p2).matches(), "Invalid Expiration Timestamp.");
        if ((p2 != null) && (p2.length() != 0)) {
            return Long.parseLong(p2.substring(0, (p2.length() - 1)));
        } else {
            return 0;
        }
    }

    public static f6.a e(java.net.HttpURLConnection p12)
    {
        IllegalStateException v12_1 = p12.getInputStream();
        String v0_2 = new android.util.JsonReader(new java.io.InputStreamReader(v12_1, f6.c.e));
        byte v1_0 = ((byte) (0 | 1));
        v0_2.beginObject();
        String v3_0 = 0;
        String v6 = 0;
        long v7_0 = 0;
        long v8_0 = 0;
        String v4_1 = 0;
        String v5 = 0;
        while (v0_2.hasNext()) {
            int v10_1 = v0_2.nextName();
            if (!v10_1.equals("name")) {
                if (!v10_1.equals("fid")) {
                    if (!v10_1.equals("refreshToken")) {
                        if (!v10_1.equals("authToken")) {
                            v0_2.skipValue();
                        } else {
                            v0_2.beginObject();
                            while (v0_2.hasNext()) {
                                long v7_3 = v0_2.nextName();
                                if (!v7_3.equals("token")) {
                                    if (!v7_3.equals("expiresIn")) {
                                        v0_2.skipValue();
                                    } else {
                                        v1_0 = ((byte) (v1_0 | 1));
                                        v8_0 = f6.c.d(v0_2.nextString());
                                    }
                                } else {
                                    v3_0 = v0_2.nextString();
                                }
                            }
                            if (v1_0 != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            } else {
                                v7_0 = new f6.b(v3_0, v8_0, 0);
                                v0_2.endObject();
                            }
                        }
                    } else {
                        v6 = v0_2.nextString();
                    }
                } else {
                    v5 = v0_2.nextString();
                }
            } else {
                v4_1 = v0_2.nextString();
            }
        }
        v0_2.endObject();
        v0_2.close();
        v12_1.close();
        return new f6.a(v4_1, v5, v6, v7_0, 1);
    }

    public static f6.b f(java.net.HttpURLConnection p8)
    {
        IllegalStateException v8_1 = p8.getInputStream();
        String v0_2 = new android.util.JsonReader(new java.io.InputStreamReader(v8_1, f6.c.e));
        byte v1_0 = ((byte) (0 | 1));
        v0_2.beginObject();
        String v3 = 0;
        long v4_0 = 0;
        while (v0_2.hasNext()) {
            boolean v6_1 = v0_2.nextName();
            if (!v6_1.equals("token")) {
                if (!v6_1.equals("expiresIn")) {
                    v0_2.skipValue();
                } else {
                    v4_0 = f6.c.d(v0_2.nextString());
                    v1_0 = ((byte) (v1_0 | 1));
                }
            } else {
                v3 = v0_2.nextString();
            }
        }
        v0_2.endObject();
        v0_2.close();
        v8_1.close();
        if (v1_0 != 1) {
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        } else {
            return new f6.b(v3, v4_0, 1);
        }
    }

    public static void g(java.net.HttpURLConnection p2, String p3, String p4)
    {
        try {
            org.json.JSONObject v0_1 = new org.json.JSONObject();
            v0_1.put("fid", p3);
            v0_1.put("appId", p4);
            v0_1.put("authVersion", "FIS_v2");
            v0_1.put("sdkVersion", "a:19.0.1");
            f6.c.i(p2, v0_1.toString().getBytes("UTF-8"));
            return;
        } catch (org.json.JSONException v2_1) {
            throw new IllegalStateException(v2_1);
        }
    }

    public static void h(java.net.HttpURLConnection p3)
    {
        try {
            IllegalStateException v0_1 = new org.json.JSONObject();
            v0_1.put("sdkVersion", "a:19.0.1");
            String v1_3 = new org.json.JSONObject();
            v1_3.put("installation", v0_1);
            f6.c.i(p3, v1_3.toString().getBytes("UTF-8"));
            return;
        } catch (org.json.JSONException v3_1) {
            throw new IllegalStateException(v3_1);
        }
    }

    public static void i(java.net.HttpURLConnection p1, byte[] p2)
    {
        java.io.IOException v1_1 = p1.getOutputStream();
        if (v1_1 == null) {
            throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
        } else {
            java.util.zip.GZIPOutputStream v0_1 = new java.util.zip.GZIPOutputStream(v1_1);
            try {
                v0_1.write(p2);
                try {
                    v0_1.close();
                    v1_1.close();
                } catch (java.io.IOException) {
                }
                return;
            } catch (Throwable v2_1) {
                try {
                    v0_1.close();
                    v1_1.close();
                } catch (java.io.IOException) {
                }
                throw v2_1;
            }
        }
    }

    public final java.net.HttpURLConnection c(java.net.URL p10, String p11)
    {
        try {
            d6.e v10_2 = ((java.net.HttpURLConnection) p10.openConnection());
            v10_2.setConnectTimeout(10000);
            v10_2.setUseCaches(0);
            v10_2.setReadTimeout(10000);
            v10_2.addRequestProperty("Content-Type", "application/json");
            v10_2.addRequestProperty("Accept", "application/json");
            v10_2.addRequestProperty("Content-Encoding", "gzip");
            v10_2.addRequestProperty("Cache-Control", "no-cache");
            String v3_3 = this.a;
            v10_2.addRequestProperty("X-Android-Package", v3_3.getPackageName());
            String v1_6 = ((a6.f) this.b.get());
        } catch (java.io.IOException) {
            throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
        }
        if (v1_6 != null) {
            try {
                String v1_9;
                String v1_7 = ((a6.d) v1_6);
            } catch (String v1_12) {
                android.util.Log.w("ContentValues", "Failed to get heartbeats header", v1_12);
            } catch (String v1_11) {
                Thread.currentThread().interrupt();
                android.util.Log.w("ContentValues", "Failed to get heartbeats header", v1_11);
            }
            if (((android.os.UserManager) v1_7.b.getSystemService(android.os.UserManager)).isUserUnlocked()) {
                v1_9 = com.google.android.gms.tasks.Tasks.call(v1_7.e, new a6.c(v1_7, 0));
            } else {
                v1_9 = com.google.android.gms.tasks.Tasks.forResult("");
            }
            v10_2.addRequestProperty("x-firebase-client", ((String) com.google.android.gms.tasks.Tasks.await(v1_9)));
        }
        String v1_15 = 0;
        String v5_3 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(v3_3, v3_3.getPackageName());
        if (v5_3 != null) {
            v1_15 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(v5_3, 0);
            v10_2.addRequestProperty("X-Android-Cert", v1_15);
            v10_2.addRequestProperty("x-goog-api-key", p11);
            return v10_2;
        } else {
            String v2_2 = new StringBuilder("Could not get fingerprint hash for package: ");
            v2_2.append(v3_3.getPackageName());
            android.util.Log.e("ContentValues", v2_2.toString());
            v10_2.addRequestProperty("X-Android-Cert", v1_15);
            v10_2.addRequestProperty("x-goog-api-key", p11);
            return v10_2;
        }
    }
}
