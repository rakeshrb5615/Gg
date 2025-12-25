package com.google.android.gms.internal.measurement;
public final class zzfb {
    private static volatile com.google.android.gms.internal.measurement.zzfb zzc;
    protected final com.google.android.gms.common.util.Clock zza;
    protected final java.util.concurrent.ExecutorService zzb;
    private final String zzd;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zze;
    private final java.util.List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile com.google.android.gms.internal.measurement.zzcr zzj;

    public zzfb(android.content.Context p10, android.os.Bundle p11)
    {
        this.zzd = "FA";
        this.zza = com.google.android.gms.common.util.DefaultClock.getInstance();
        com.google.android.gms.internal.measurement.zzcm.zza();
        String v1_0 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.measurement.zzed(this));
        v1_0.allowCoreThreadTimeOut(1);
        this.zzb = java.util.concurrent.Executors.unconfigurableExecutorService(v1_0);
        this.zze = new com.google.android.gms.measurement.api.AppMeasurementSdk(this);
        this.zzf = new java.util.ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzlt.zza(p10, "google_app_id", com.google.android.gms.measurement.internal.zzhu.zza(p10)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", 0, com.google.android.gms.internal.measurement.zzfb.getClassLoader());
                } catch (ClassNotFoundException) {
                    this.zzi = 0;
                    this.zzh = 1;
                    android.util.Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException) {
        }
        this.zzi = "fa";
        this.zzS(new com.google.android.gms.internal.measurement.zzdr(this, p10, p11));
        String v10_4 = ((android.app.Application) p10.getApplicationContext());
        if (v10_4 != null) {
            v10_4.registerActivityLifecycleCallbacks(new com.google.android.gms.internal.measurement.zzfa(this));
            return;
        } else {
            android.util.Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
            return;
        }
    }

    private final void zzS(com.google.android.gms.internal.measurement.zzeq p2)
    {
        this.zzb.execute(p2);
        return;
    }

    private final void zzT(Exception p7, boolean p8, boolean p9)
    {
        this.zzh = (this.zzh | p8);
        if (p8 == null) {
            Exception v3;
            com.google.android.gms.internal.measurement.zzfb v0_2;
            if (p9 == null) {
                v0_2 = this;
                v3 = p7;
            } else {
                v0_2 = this;
                v3 = p7;
                this.zzD(5, "Error with data collection. Data lost.", p7, 0, 0);
            }
            android.util.Log.w(v0_2.zzd, "Error with data collection. Data lost.", v3);
            return;
        } else {
            android.util.Log.w(this.zzd, "Data collection startup failed. No data will be collected.", p7);
            return;
        }
    }

    private final void zzU(String p9, String p10, android.os.Bundle p11, boolean p12, boolean p13, Long p14)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzep(this, p14, p9, p10, p11, p12, p13));
        return;
    }

    public static com.google.android.gms.internal.measurement.zzfb zza(android.content.Context p2, android.os.Bundle p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        if (com.google.android.gms.internal.measurement.zzfb.zzc == null) {
            if (com.google.android.gms.internal.measurement.zzfb.zzc == null) {
                com.google.android.gms.internal.measurement.zzfb.zzc = new com.google.android.gms.internal.measurement.zzfb(p2, p3);
            }
        }
        return com.google.android.gms.internal.measurement.zzfb.zzc;
    }

    public final String zzA()
    {
        String v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzdz(this, v0_1));
        return v0_1.zzc(500);
    }

    public final String zzB()
    {
        String v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzea(this, v0_1));
        return v0_1.zzc(500);
    }

    public final java.util.Map zzC(String p7, String p8, boolean p9)
    {
        com.google.android.gms.internal.measurement.zzco v5_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzeb(this, p7, p8, p9, v5_1));
        java.util.Map v7_1 = v5_1.zze(5000);
        if ((v7_1 != null) && (v7_1.size() != 0)) {
            java.util.HashMap v8_3 = new java.util.HashMap(v7_1.size());
            java.util.Iterator v9_3 = v7_1.keySet().iterator();
            while (v9_3.hasNext()) {
                String v0_3 = ((String) v9_3.next());
                Object v2_0 = v7_1.get(v0_3);
                if (((v2_0 instanceof Double)) || (((v2_0 instanceof Long)) || ((v2_0 instanceof String)))) {
                    v8_3.put(v0_3, v2_0);
                }
            }
            return v8_3;
        } else {
            return java.util.Collections.EMPTY_MAP;
        }
    }

    public final void zzD(int p9, String p10, Object p11, Object p12, Object p13)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzec(this, 0, 5, p10, p11, 0, 0));
        return;
    }

    public final android.os.Bundle zzE(android.os.Bundle p3, boolean p4)
    {
        com.google.android.gms.internal.measurement.zzco v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzee(this, p3, v0_1));
        if (!p4) {
            return 0;
        } else {
            return v0_1.zze(5000);
        }
    }

    public final int zzF(String p4)
    {
        Class v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzef(this, p4, v0_1));
        int v4_2 = ((Integer) com.google.android.gms.internal.measurement.zzco.zzf(v0_1.zze(10000), Integer));
        if (v4_2 != 0) {
            return v4_2.intValue();
        } else {
            return 25;
        }
    }

    public final String zzG()
    {
        String v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzeg(this, v0_1));
        return v0_1.zzc(120000);
    }

    public final Long zzH()
    {
        Long v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzeh(this, v0_1));
        return v0_1.zzd(120000);
    }

    public final String zzI()
    {
        return this.zzi;
    }

    public final Object zzJ(int p4)
    {
        Class v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzei(this, v0_1, p4));
        return com.google.android.gms.internal.measurement.zzco.zzf(v0_1.zze(15000), Object);
    }

    public final void zzK(boolean p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzej(this, p2));
        return;
    }

    public final void zzL(android.os.Bundle p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzek(this, p2));
        return;
    }

    public final synthetic void zzM(com.google.android.gms.internal.measurement.zzeq p1)
    {
        this.zzS(p1);
        return;
    }

    public final synthetic void zzN(Exception p1, boolean p2, boolean p3)
    {
        this.zzT(p1, p2, p3);
        return;
    }

    public final synthetic String zzO()
    {
        return this.zzd;
    }

    public final synthetic boolean zzP()
    {
        return this.zzh;
    }

    public final synthetic com.google.android.gms.internal.measurement.zzcr zzQ()
    {
        return this.zzj;
    }

    public final synthetic void zzR(com.google.android.gms.internal.measurement.zzcr p1)
    {
        this.zzj = p1;
        return;
    }

    public final com.google.android.gms.measurement.api.AppMeasurementSdk zzb()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzcr zzc(android.content.Context p2, boolean p3)
    {
        int v3_1;
        if (p3 == 0) {
            v3_1 = com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL;
        } else {
            v3_1 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION;
        }
        return com.google.android.gms.internal.measurement.zzcq.asInterface(com.google.android.gms.dynamite.DynamiteModule.load(p2, v3_1, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjp p3)
    {
        com.google.android.gms.internal.measurement.zzer v0_1 = new com.google.android.gms.internal.measurement.zzer(p3);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(v0_1);
                return;
            } catch (UnsupportedOperationException) {
                android.util.Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zzS(new com.google.android.gms.internal.measurement.zzel(this, v0_1));
        return;
    }

    public final void zze(android.content.Intent p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzem(this, p2));
        return;
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjq p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        String v0_0 = this.zzf;
        int v1_0 = 0;
        while (v1_0 < v0_0.size()) {
            if (!p4.equals(((android.util.Pair) v0_0.get(v1_0)).first)) {
                v1_0++;
            } else {
                android.util.Log.w(this.zzd, "OnEventListener already registered.");
                return;
            }
        }
        int v1_3 = new com.google.android.gms.internal.measurement.zzes(p4);
        v0_0.add(new android.util.Pair(p4, v1_3));
        if (this.zzj != null) {
            try {
                this.zzj.registerOnMeasurementEventListener(v1_3);
                return;
            } catch (UnsupportedOperationException) {
                android.util.Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zzS(new com.google.android.gms.internal.measurement.zzen(this, v1_3));
        return;
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjq p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        String v0_0 = this.zzf;
        String v1_0 = 0;
        while (v1_0 < v0_0.size()) {
            if (!p4.equals(((android.util.Pair) v0_0.get(v1_0)).first)) {
                v1_0++;
            } else {
                com.google.android.gms.internal.measurement.zzes v4_2 = ((android.util.Pair) v0_0.get(v1_0));
            }
            if (v4_2 != null) {
                v0_0.remove(v4_2);
                com.google.android.gms.internal.measurement.zzes v4_4 = ((com.google.android.gms.internal.measurement.zzes) v4_2.second);
                if (this.zzj != null) {
                    try {
                        this.zzj.unregisterOnMeasurementEventListener(v4_4);
                        return;
                    } catch (UnsupportedOperationException) {
                        android.util.Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                    }
                }
                this.zzS(new com.google.android.gms.internal.measurement.zzeo(this, v4_4));
                return;
            } else {
                android.util.Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
        }
        v4_2 = 0;
    }

    public final void zzh(String p8, android.os.Bundle p9)
    {
        this.zzU(0, p8, p9, 0, 1, 0);
        return;
    }

    public final void zzi(String p8, String p9, android.os.Bundle p10)
    {
        this.zzU(p8, p9, p10, 1, 1, 0);
        return;
    }

    public final void zzj(String p8, String p9, android.os.Bundle p10, long p11)
    {
        this.zzU(p8, p9, p10, 1, 0, Long.valueOf(p11));
        return;
    }

    public final void zzk(String p7, String p8, Object p9, boolean p10)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdh(this, p7, p8, p9, p10));
        return;
    }

    public final void zzl(android.os.Bundle p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdi(this, p2));
        return;
    }

    public final void zzm(String p2, String p3, android.os.Bundle p4)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdj(this, p2, p3, p4));
        return;
    }

    public final java.util.List zzn(String p3, String p4)
    {
        com.google.android.gms.internal.measurement.zzco v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzdk(this, p3, p4, v0_1));
        java.util.List v3_2 = ((java.util.List) com.google.android.gms.internal.measurement.zzco.zzf(v0_1.zze(5000), java.util.List));
        if (v3_2 == null) {
            v3_2 = java.util.Collections.EMPTY_LIST;
        }
        return v3_2;
    }

    public final void zzo(String p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdl(this, p2));
        return;
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf p2, String p3, String p4)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdm(this, p2, p3, p4));
        return;
    }

    public final void zzq(Boolean p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdn(this, p2));
        return;
    }

    public final void zzr(android.os.Bundle p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdo(this, p2));
        return;
    }

    public final void zzs()
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdp(this));
        return;
    }

    public final void zzt(long p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdq(this, p2));
        return;
    }

    public final void zzu(String p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzds(this, p2));
        return;
    }

    public final void zzv(String p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdt(this, p2));
        return;
    }

    public final void zzw(Runnable p2)
    {
        this.zzS(new com.google.android.gms.internal.measurement.zzdv(this, p2));
        return;
    }

    public final String zzx()
    {
        String v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzdw(this, v0_1));
        return v0_1.zzc(500);
    }

    public final String zzy()
    {
        String v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzdx(this, v0_1));
        return v0_1.zzc(50);
    }

    public final long zzz()
    {
        long v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zzS(new com.google.android.gms.internal.measurement.zzdy(this, v0_1));
        long v0_6 = v0_1.zzd(500);
        if (v0_6 != 0) {
            return v0_6.longValue();
        } else {
            long v0_4 = new java.util.Random((System.nanoTime() ^ this.zza.currentTimeMillis())).nextLong();
            long v2_3 = (this.zzg + 1);
            this.zzg = v2_3;
            return (v0_4 + ((long) v2_3));
        }
    }
}
