package com.google.android.gms.ads.identifier;
public class AdvertisingIdClient {
    com.google.android.gms.common.BlockingServiceConnection zza;
    com.google.android.gms.internal.ads_identifier.zzf zzb;
    boolean zzc;
    final Object zzd;
    com.google.android.gms.ads.identifier.zzb zze;
    final long zzf;
    private final android.content.Context zzg;

    public AdvertisingIdClient(android.content.Context p7)
    {
        this(p7, 30000, 0, 0);
        return;
    }

    public AdvertisingIdClient(android.content.Context p1, long p2, boolean p4, boolean p5)
    {
        this.zzd = new Object();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        if (p4 != null) {
            android.content.Context v4_1 = p1.getApplicationContext();
            if (v4_1 != null) {
                p1 = v4_1;
            }
        }
        this.zzg = p1;
        this.zzc = 0;
        this.zzf = p2;
        return;
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient$Info getAdvertisingIdInfo(android.content.Context p9)
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient v1_1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient(p9, -1, 1, 0);
        try {
            int v2_3 = android.os.SystemClock.elapsedRealtime();
            v1_1.zzb(0);
            int v2_0 = v1_1.zzd(-1);
            v1_1.zzc(v2_0, 1, 0, (android.os.SystemClock.elapsedRealtime() - v2_3), "", 0);
            v1_1.zza();
            return v2_0;
        } catch (Throwable v0_0) {
            Throwable v8_1 = v0_0;
            try {
                v1_1.zzc(0, 1, 0, -1, "", v8_1);
                throw v8_1;
            } catch (Throwable v0_1) {
                Throwable v9_4 = v0_1;
                v1_1.zza();
                throw v9_4;
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context p7)
    {
        void v1_1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient(p7, -1, 0, 0);
        try {
            v1_1.zzb(0);
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        } catch (String v0_13) {
            java.io.IOException v7_17 = v0_13;
            v1_1.zza();
            throw v7_17;
        }
        if (!v1_1.zzc) {
            String v0_1 = v1_1.zze;
            if ((v0_1 == null) || (!v0_1.zzb)) {
                throw new java.io.IOException("AdvertisingIdClient is not connected.");
            } else {
                v1_1.zzb(0);
                if (!v1_1.zzc) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                } else {
                }
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_1.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_1.zzb);
        try {
            java.io.IOException v7_11 = v1_1.zzb.zzd();
        } catch (String v0_9) {
            android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", v0_9);
            throw new java.io.IOException("Remote exception");
        }
        v1_1 = v1_1.zze();
        v1_1.zza();
        return v7_11;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean p0)
    {
        return;
    }

    private final com.google.android.gms.ads.identifier.AdvertisingIdClient$Info zzd(int p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        if (!this.zzc) {
            String v0_9 = this.zze;
            if ((v0_9 == null) || (!v0_9.zzb)) {
                throw new java.io.IOException("AdvertisingIdClient is not connected.");
            } else {
                this.zzb(0);
                if (!this.zzc) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                } else {
                }
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb);
        try {
            java.io.IOException v4_10 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info(this.zzb.zzc(), this.zzb.zze(1));
        } catch (java.io.IOException v4_11) {
            android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", v4_11);
            throw new java.io.IOException("Remote exception");
        }
        this.zze();
        return v4_10;
    }

    private final void zze()
    {
        try {
            com.google.android.gms.ads.identifier.zzb v1_0 = this.zze;
        } catch (com.google.android.gms.ads.identifier.zzb v1_1) {
            throw v1_1;
        }
        if (v1_0 != null) {
            v1_0.zza.countDown();
            this.zze.join();
        }
        com.google.android.gms.ads.identifier.zzb v1_4 = this.zzf;
        if (v1_4 > 0) {
            this.zze = new com.google.android.gms.ads.identifier.zzb(this, v1_4);
        }
        return;
    }

    public final void finalize()
    {
        this.zza();
        super.finalize();
        return;
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient$Info getInfo()
    {
        return this.zzd(-1);
    }

    public void start()
    {
        this.zzb(1);
        return;
    }

    public final void zza()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        if ((this.zzg != null) && (this.zza != null)) {
            try {
                if (this.zzc) {
                    com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                }
            } catch (int v0_8) {
                android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", v0_8);
            }
            this.zzc = 0;
            this.zzb = 0;
            this.zza = 0;
            return;
        } else {
            return;
        }
    }

    public final void zzb(boolean p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        if (this.zzc) {
            this.zza();
        }
        java.io.IOException v0_9 = this.zzg;
        v0_9.getPackageManager().getPackageInfo("com.android.vending", 0);
        com.google.android.gms.common.BlockingServiceConnection v1_1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(v0_9, 12451000);
        if (v1_1 != null) {
            if (v1_1 != 2) {
                throw new java.io.IOException("Google Play services not available");
            } else {
            }
        }
        com.google.android.gms.common.BlockingServiceConnection v1_3 = new com.google.android.gms.common.BlockingServiceConnection();
        long v2_3 = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
        v2_3.setPackage("com.google.android.gms");
        if (!com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(v0_9, v2_3, v1_3, 1)) {
            throw new java.io.IOException("Connection failure");
        } else {
            this.zza = v1_3;
            this.zzb = com.google.android.gms.internal.ads_identifier.zze.zza(v1_3.getServiceWithTimeout(10000, java.util.concurrent.TimeUnit.MILLISECONDS));
            this.zzc = 1;
            if (p6 != null) {
                this.zze();
            }
            return;
        }
    }

    public final boolean zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info p3, boolean p4, float p5, long p6, String p8, Throwable p9)
    {
        if (Math.random() > 0) {
            return 0;
        } else {
            java.util.HashMap v4_3 = new java.util.HashMap();
            String v8_0 = "1";
            v4_3.put("app_context", "1");
            if (p3 != null) {
                if (1 != p3.isLimitAdTrackingEnabled()) {
                    v8_0 = "0";
                }
                v4_3.put("limit_ad_tracking", v8_0);
                String v3_1 = p3.getId();
                if (v3_1 != null) {
                    v4_3.put("ad_id_size", Integer.toString(v3_1.length()));
                }
            }
            if (p9 != null) {
                v4_3.put("error", p9.getClass().getName());
            }
            v4_3.put("tag", "AdvertisingIdClient");
            v4_3.put("time_spent", Long.toString(p6));
            new com.google.android.gms.ads.identifier.zza(this, v4_3).start();
            return 1;
        }
    }
}
