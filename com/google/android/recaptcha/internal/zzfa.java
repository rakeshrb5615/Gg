package com.google.android.recaptcha.internal;
public final class zzfa implements com.google.android.recaptcha.internal.zzey {
    private final h7.d zza;

    public zzfa()
    {
        this.zza = a.a.F(com.google.android.recaptcha.internal.zzez.zza);
        return;
    }

    public final com.google.android.recaptcha.internal.zzsc zza(String p4, com.google.android.recaptcha.internal.zzto p5)
    {
        try {
            com.google.android.recaptcha.internal.zzew v0 = ((com.google.android.recaptcha.internal.zzex) this.zza.getValue()).zza(p4);
            v0.zzc();
            v0.zze(p5.zzd());
            com.google.android.recaptcha.internal.zzbd v4_3 = ((com.google.android.recaptcha.internal.zzsc) v0.zza(com.google.android.recaptcha.internal.zzsc.zzi()));
            v0.zzd();
            return v4_3;
        } catch (com.google.android.recaptcha.internal.zzbd v4_6) {
            if (v0 == null) {
                throw v4_6;
            } else {
                if (kotlin.jvm.internal.j.a(v4_6.zza(), com.google.android.recaptcha.internal.zzba.zzau)) {
                    try {
                        v4_6 = com.google.android.recaptcha.internal.zzbc.zza(com.google.android.recaptcha.internal.zztu.zzg(v0.zzb().getErrorStream()).zzi());
                    } catch (com.google.android.recaptcha.internal.zzbd v4_11) {
                        v4_6 = new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzG, v4_11.getMessage());
                    }
                }
                throw v4_6;
            }
        } catch (com.google.android.recaptcha.internal.zzbd v4_4) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzF, v4_4.getMessage());
        } catch (com.google.android.recaptcha.internal.zzbd v4_13) {
            if (v0 != null) {
                v0.zzd();
            }
            throw v4_13;
        }
    }

    public final String zzb(String p6)
    {
        try {
            try {
                String v6_1 = new java.net.URL(p6).openConnection();
                kotlin.jvm.internal.j.c(v6_1, "null cannot be cast to non-null type java.net.HttpURLConnection");
                String v6_2 = ((java.net.HttpURLConnection) v6_1);
                v6_2.setRequestMethod("GET");
                v6_2.setDoInput(1);
                v6_2.setRequestProperty("Accept", "application/x-protobuffer");
                v6_2.setRequestProperty("Accept-Encoding", "gzip");
                v6_2.connect();
            } catch (Exception) {
                throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzO, 0);
            }
            if (v6_2.getResponseCode() != 200) {
                throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, new com.google.android.recaptcha.internal.zzba(v6_2.getResponseCode()), 0);
            } else {
                try {
                    String v0_6;
                    if (!"gzip".equals(v6_2.getContentEncoding())) {
                        v0_6 = new java.io.InputStreamReader(v6_2.getInputStream());
                    } else {
                        v0_6 = new java.io.InputStreamReader(new java.util.zip.GZIPInputStream(v6_2.getInputStream()));
                    }
                } catch (Exception) {
                    throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzP, 0);
                }
                String v6_10 = new java.io.StringWriter();
                char[] v2_14 = new char[8192];
                int v3_4 = v0_6.read(v2_14);
                while (v3_4 >= 0) {
                    v6_10.write(v2_14, 0, v3_4);
                    v3_4 = v0_6.read(v2_14);
                }
                String v6_11 = v6_10.toString();
                kotlin.jvm.internal.j.d(v6_11, "toString(...)");
                return v6_11;
            }
        } catch (Exception) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzN, 0);
        }
    }
}
