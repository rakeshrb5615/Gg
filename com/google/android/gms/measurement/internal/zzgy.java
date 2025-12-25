package com.google.android.gms.measurement.internal;
final class zzgy implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzgz zza;
    private final java.net.URL zzb;
    private final byte[] zzc;
    private final com.google.android.gms.measurement.internal.zzgw zzd;
    private final String zze;
    private final java.util.Map zzf;

    public zzgy(com.google.android.gms.measurement.internal.zzgz p1, String p2, java.net.URL p3, byte[] p4, java.util.Map p5, com.google.android.gms.measurement.internal.zzgw p6)
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

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zza;
        v0_0.zzaX();
        java.io.InputStream v3_8 = 0;
        try {
            String v4_6 = this.zzb.openConnection();
        } catch (com.google.android.gms.measurement.internal.zzhz v0_19) {
            java.io.ByteArrayOutputStream v8_0 = v0_19;
            java.io.ByteArrayOutputStream v7_1 = 0;
            String v4_1 = 0;
            java.util.Map v10_1 = 0;
            if (v3_8 != null) {
                try {
                    v3_8.close();
                } catch (com.google.android.gms.measurement.internal.zzhz v0_15) {
                    this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zze), v0_15);
                }
            }
            if (v4_1 != null) {
                v4_1.disconnect();
            }
            this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgx(this.zze, this.zzd, v7_1, v8_0, 0, v10_1, 0));
            return;
        } catch (com.google.android.gms.measurement.internal.zzhz v0_10) {
            java.io.ByteArrayOutputStream v6_1 = 0;
            v4_1 = 0;
            java.util.Map v9_1 = 0;
            com.google.android.gms.measurement.internal.zzhz v2_0 = v0_10;
            if (v3_8 != null) {
                try {
                    v3_8.close();
                } catch (com.google.android.gms.measurement.internal.zzhz v0_11) {
                    this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zze), v0_11);
                }
            }
            if (v4_1 != null) {
                v4_1.disconnect();
            }
            this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgx(this.zze, this.zzd, v6_1, 0, 0, v9_1, 0));
            throw v2_0;
        }
        if (!(v4_6 instanceof java.net.HttpURLConnection)) {
            throw new java.io.IOException("Failed to obtain HTTP connection");
        } else {
            v4_1 = ((java.net.HttpURLConnection) v4_6);
            v4_1.setDefaultUseCaches(0);
            com.google.android.gms.measurement.internal.zzgx v5_4 = v0_0.zzu;
            v5_4.zzc();
            v4_1.setConnectTimeout(60000);
            v5_4.zzc();
            v4_1.setReadTimeout(61000);
            v4_1.setInstanceFollowRedirects(0);
            v4_1.setDoInput(1);
            java.io.ByteArrayOutputStream v7_3 = this.zzf;
            if (v7_3 != null) {
                java.io.ByteArrayOutputStream v7_5 = v7_3.entrySet().iterator();
                while (v7_5.hasNext()) {
                    java.io.ByteArrayOutputStream v8_2 = ((java.util.Map$Entry) v7_5.next());
                    v4_1.addRequestProperty(((String) v8_2.getKey()), ((String) v8_2.getValue()));
                }
            }
            java.io.ByteArrayOutputStream v7_6 = this.zzc;
            if (v7_6 != null) {
                com.google.android.gms.measurement.internal.zzhz v0_22 = v0_0.zzg.zzp().zzv(v7_6);
                java.io.ByteArrayOutputStream v8_7 = v0_22.length;
                v5_4.zzaV().zzk().zzb("Uploading data. size", Integer.valueOf(v8_7));
                v4_1.setDoOutput(1);
                v4_1.addRequestProperty("Content-Encoding", "gzip");
                v4_1.setFixedLengthStreamingMode(v8_7);
                v4_1.connect();
                com.google.android.gms.measurement.internal.zzgx v5_10 = v4_1.getOutputStream();
                try {
                    v5_10.write(v0_22);
                    v5_10.close();
                } catch (com.google.android.gms.measurement.internal.zzhz v0_23) {
                    v8_0 = v0_23;
                    v7_1 = 0;
                    v10_1 = 0;
                    v3_8 = v5_10;
                } catch (com.google.android.gms.measurement.internal.zzhz v0_10) {
                    v6_1 = 0;
                    v9_1 = 0;
                    v3_8 = v5_10;
                }
            }
            java.io.ByteArrayOutputStream v8_8 = v4_1.getResponseCode();
            try {
                java.util.Map v11_1 = v4_1.getHeaderFields();
                try {
                    com.google.android.gms.measurement.internal.zzhz v0_26 = new java.io.ByteArrayOutputStream();
                    com.google.android.gms.measurement.internal.zzgx v5_12 = v4_1.getInputStream();
                } catch (com.google.android.gms.measurement.internal.zzhz v0_5) {
                    v5_12 = 0;
                    if (v5_12 != null) {
                        v5_12.close();
                    }
                    throw v0_5;
                } catch (com.google.android.gms.measurement.internal.zzhz v0_8) {
                    v7_1 = v8_8;
                    v10_1 = v11_1;
                    v8_0 = v0_8;
                } catch (com.google.android.gms.measurement.internal.zzhz v0_7) {
                    v2_0 = v0_7;
                    v6_1 = v8_8;
                    v9_1 = v11_1;
                }
                java.io.ByteArrayOutputStream v6_8 = new byte[1024];
                while(true) {
                    java.io.ByteArrayOutputStream v7_8 = v5_12.read(v6_8);
                    if (v7_8 <= null) {
                        break;
                    }
                    v0_26.write(v6_8, 0, v7_8);
                }
                java.util.Map v10_0 = v0_26.toByteArray();
                v5_12.close();
                v4_1.disconnect();
                this.zza.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzgx(this.zze, this.zzd, v8_8, 0, v10_0, v11_1, 0));
                return;
            } catch (com.google.android.gms.measurement.internal.zzhz v0_8) {
                v10_1 = 0;
                v7_1 = v8_8;
            } catch (com.google.android.gms.measurement.internal.zzhz v0_24) {
                v2_0 = v0_24;
                v9_1 = 0;
                v6_1 = v8_8;
            }
        }
    }
}
