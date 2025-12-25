package com.google.android.gms.measurement.internal;
public final class zznn extends com.google.android.gms.measurement.internal.zzos {
    public final com.google.android.gms.measurement.internal.zzhe zza;
    public final com.google.android.gms.measurement.internal.zzhe zzb;
    public final com.google.android.gms.measurement.internal.zzhe zzc;
    public final com.google.android.gms.measurement.internal.zzhe zzd;
    public final com.google.android.gms.measurement.internal.zzhe zze;
    public final com.google.android.gms.measurement.internal.zzhe zzf;
    private final java.util.Map zzh;

    public zznn(com.google.android.gms.measurement.internal.zzpg p5)
    {
        super(p5);
        super.zzh = new java.util.HashMap();
        com.google.android.gms.measurement.internal.zzhh v0_11 = super.zzu.zzd();
        java.util.Objects.requireNonNull(v0_11);
        super.zza = new com.google.android.gms.measurement.internal.zzhe(v0_11, "last_delete_stale", 0);
        com.google.android.gms.measurement.internal.zzhh v0_1 = super.zzu.zzd();
        java.util.Objects.requireNonNull(v0_1);
        super.zzb = new com.google.android.gms.measurement.internal.zzhe(v0_1, "last_delete_stale_batch", 0);
        com.google.android.gms.measurement.internal.zzhh v0_3 = super.zzu.zzd();
        java.util.Objects.requireNonNull(v0_3);
        super.zzc = new com.google.android.gms.measurement.internal.zzhe(v0_3, "backoff", 0);
        com.google.android.gms.measurement.internal.zzhh v0_5 = super.zzu.zzd();
        java.util.Objects.requireNonNull(v0_5);
        super.zzd = new com.google.android.gms.measurement.internal.zzhe(v0_5, "last_upload", 0);
        com.google.android.gms.measurement.internal.zzhh v0_7 = super.zzu.zzd();
        java.util.Objects.requireNonNull(v0_7);
        super.zze = new com.google.android.gms.measurement.internal.zzhe(v0_7, "last_upload_attempt", 0);
        com.google.android.gms.measurement.internal.zzhh v0_9 = super.zzu.zzd();
        java.util.Objects.requireNonNull(v0_9);
        super.zzf = new com.google.android.gms.measurement.internal.zzhe(v0_9, "midnight_offset", 0);
        return;
    }

    public final boolean zzbb()
    {
        return 0;
    }

    public final android.util.Pair zzc(String p2, com.google.android.gms.measurement.internal.zzjl p3)
    {
        if (!p3.zzo(com.google.android.gms.measurement.internal.zzjk.zza)) {
            return new android.util.Pair("", Boolean.FALSE);
        } else {
            return this.zzd(p2);
        }
    }

    public final android.util.Pair zzd(String p13)
    {
        this.zzg();
        boolean v1_1 = this.zzu;
        String v2_4 = v1_1.zzaZ().elapsedRealtime();
        com.google.android.gms.measurement.internal.zznm v4_0 = ((com.google.android.gms.measurement.internal.zznm) this.zzh.get(p13));
        if ((v4_0 != null) && (v2_4 < v4_0.zzc)) {
            return new android.util.Pair(v4_0.zza, Boolean.valueOf(v4_0.zzb));
        } else {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(1);
            long v5_5 = (v1_1.zzc().zzl(p13, com.google.android.gms.measurement.internal.zzfy.zza) + v2_4);
            try {
                boolean v1_4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(v1_1.zzaY());
            } catch (boolean v1_11) {
                this.zzu.zzaV().zzj().zzb("Unable to get advertising id", v1_11);
                com.google.android.gms.measurement.internal.zznm v3_3 = new com.google.android.gms.measurement.internal.zznm("", 0, v5_5);
                this.zzh.put(p13, v3_3);
                com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(0);
                return new android.util.Pair(v3_3.zza, Boolean.valueOf(v3_3.zzb));
            } catch (Exception) {
                v1_4 = 0;
                if (v4_0 == null) {
                } else {
                    if (v2_4 >= (v4_0.zzc + this.zzu.zzc().zzl(p13, com.google.android.gms.measurement.internal.zzfy.zzb))) {
                    } else {
                        return new android.util.Pair(v4_0.zza, Boolean.valueOf(v4_0.zzb));
                    }
                }
            }
            if (v1_4) {
                String v2_3 = v1_4.getId();
                if (v2_3 == null) {
                    v3_3 = new com.google.android.gms.measurement.internal.zznm("", v1_4.isLimitAdTrackingEnabled(), v5_5);
                    this.zzh.put(p13, v3_3);
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(0);
                    return new android.util.Pair(v3_3.zza, Boolean.valueOf(v3_3.zzb));
                } else {
                    v3_3 = new com.google.android.gms.measurement.internal.zznm(v2_3, v1_4.isLimitAdTrackingEnabled(), v5_5);
                    this.zzh.put(p13, v3_3);
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(0);
                    return new android.util.Pair(v3_3.zza, Boolean.valueOf(v3_3.zzb));
                }
            } else {
                return new android.util.Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
        }
    }

    public final String zzf(String p3, boolean p4)
    {
        String v3_4;
        this.zzg();
        if (p4 == null) {
            v3_4 = "00000000-0000-0000-0000-000000000000";
        } else {
            v3_4 = ((String) this.zzd(p3).first);
        }
        String v4_3 = com.google.android.gms.measurement.internal.zzpp.zzO();
        if (v4_3 != null) {
            return String.format(java.util.Locale.US, "%032X", new Object[] {new java.math.BigInteger(1, v4_3.digest(v3_4.getBytes()))}));
        } else {
            return 0;
        }
    }
}
