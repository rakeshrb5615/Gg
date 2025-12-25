package com.google.android.gms.measurement.internal;
final class zzln implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzlo zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzll zzd;
    private final String zze;
    private final java.util.Map zzf;

    public zzln(com.google.android.gms.measurement.internal.zzlo p1, String p2, java.net.URL p3, byte[] p4, java.util.Map p5, com.google.android.gms.measurement.internal.zzll p6)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p6;
        this.zze = p2;
        this.zzf = p5;
        return;
    }

    private final void zzb(int p8, Exception p9, byte[] p10, java.util.Map p11)
    {
        this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlm(this, p8, p9, p10, p11));
        return;
    }

    public final void run()
    {
        Throwable v1_0 = this.zza;
        v1_0.zzaX();
        Throwable v2_3 = 0;
        try {
            int v4_3 = this.zzb.openConnection();
        } catch (Throwable v1_4) {
            int v4_1 = 0;
            int v5_0 = 0;
            int v6_5 = v5_0;
            if (v5_0 != 0) {
                try {
                    v5_0.close();
                } catch (int v5_2) {
                    this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zze), v5_2);
                }
            }
            if (v4_1 != 0) {
                v4_1.disconnect();
            }
            this.zzb(v2_3, v1_4, 0, v6_5);
            return;
        } catch (Throwable v1_3) {
            v4_1 = 0;
            v5_0 = 0;
            int v6_3 = v5_0;
            if (v5_0 != 0) {
                try {
                    v5_0.close();
                } catch (int v5_1) {
                    this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zze), v5_1);
                }
            }
            if (v4_1 != 0) {
                v4_1.disconnect();
            }
            this.zzb(v2_3, 0, 0, v6_3);
            throw v1_3;
        }
        if (!(v4_3 instanceof java.net.HttpURLConnection)) {
            throw new java.io.IOException("Failed to obtain HTTP connection");
        } else {
            v4_1 = ((java.net.HttpURLConnection) v4_3);
            v4_1.setDefaultUseCaches(0);
            Throwable v1_5 = v1_0.zzu;
            v1_5.zzc();
            v4_1.setConnectTimeout(60000);
            v1_5.zzc();
            v4_1.setReadTimeout(61000);
            v4_1.setInstanceFollowRedirects(0);
            v4_1.setDoInput(1);
            int v6_6 = this.zzf;
            if (v6_6 != 0) {
                int v6_8 = v6_6.entrySet().iterator();
                while (v6_8.hasNext()) {
                    int v7_2 = ((java.util.Map$Entry) v6_8.next());
                    v4_1.addRequestProperty(((String) v7_2.getKey()), ((String) v7_2.getValue()));
                }
            }
            int v6_9 = this.zzc;
            if (v6_9 != 0) {
                try {
                    v1_5.zzaU();
                    Throwable v1_7 = new java.io.ByteArrayOutputStream();
                    int v7_15 = new java.util.zip.GZIPOutputStream(v1_7);
                    v7_15.write(v6_9);
                    v7_15.close();
                    v1_7.close();
                    Throwable v1_8 = v1_7.toByteArray();
                } catch (Throwable v1_9) {
                    this.zza.zzu.zzaV().zzb().zzb("Failed to gzip post request content", v1_9);
                    throw v1_9;
                }
                byte[] v8_8 = v1_8.length;
                this.zza.zzu.zzaV().zzk().zzb("Uploading data. size", Integer.valueOf(v8_8));
                v4_1.setDoOutput(1);
                v4_1.addRequestProperty("Content-Encoding", "gzip");
                v4_1.setFixedLengthStreamingMode(v8_8);
                v4_1.connect();
                v5_0 = v4_1.getOutputStream();
                try {
                    v5_0.write(v1_8);
                    v5_0.close();
                } catch (Throwable v1_4) {
                    v6_5 = 0;
                } catch (Throwable v1_3) {
                    v6_3 = 0;
                }
            }
            Throwable v1_10 = v4_1.getResponseCode();
            try {
                int v5_12 = v4_1.getHeaderFields();
                try {
                    int v6_1 = new java.io.ByteArrayOutputStream();
                    int v7_0 = v4_1.getInputStream();
                } catch (Throwable v2_0) {
                    v7_0 = 0;
                    if (v7_0 != 0) {
                        v7_0.close();
                    }
                    throw v2_0;
                } catch (Throwable v2_4) {
                    v2_3 = v1_10;
                    v1_4 = v2_4;
                    v6_5 = v5_12;
                    v5_0 = 0;
                } catch (Throwable v2_2) {
                    v2_3 = v1_10;
                    v1_3 = v2_2;
                    v6_3 = v5_12;
                    v5_0 = 0;
                }
                byte[] v8_1 = new byte[1024];
                while(true) {
                    int v9_0 = v7_0.read(v8_1);
                    if (v9_0 <= 0) {
                        break;
                    }
                    v6_1.write(v8_1, 0, v9_0);
                }
                Throwable v2_1 = v6_1.toByteArray();
                v7_0.close();
                v4_1.disconnect();
                this.zzb(v1_10, 0, v2_1, v5_12);
                return;
            } catch (Throwable v2_6) {
                v2_3 = v1_10;
                v1_4 = v2_6;
                v5_0 = 0;
            } catch (Throwable v2_5) {
                v2_3 = v1_10;
                v1_3 = v2_5;
                v5_0 = 0;
            }
        }
    }

    public final synthetic void zza(int p7, Exception p8, byte[] p9, java.util.Map p10)
    {
        this.zzd.zza(this.zze, p7, p8, p9, p10);
        return;
    }
}
