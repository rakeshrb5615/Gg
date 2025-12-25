package com.google.android.gms.stats;
public class WakeLock {
    private static final long zzb;
    private static volatile java.util.concurrent.ScheduledExecutorService zzc;
    private static final Object zzd;
    private static volatile com.google.android.gms.stats.zzd zze;
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    private final android.os.PowerManager$WakeLock zzg;
    private int zzh;
    private java.util.concurrent.Future zzi;
    private long zzj;
    private final java.util.Set zzk;
    private boolean zzl;
    private int zzm;
    private com.google.android.gms.common.util.Clock zzn;
    private android.os.WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final android.content.Context zzr;
    private final java.util.Map zzs;
    private java.util.concurrent.atomic.AtomicInteger zzt;
    private final java.util.concurrent.ScheduledExecutorService zzu;

    static WakeLock()
    {
        com.google.android.gms.stats.WakeLock.zzb = java.util.concurrent.TimeUnit.DAYS.toMillis(366);
        com.google.android.gms.stats.WakeLock.zzc = 0;
        com.google.android.gms.stats.WakeLock.zzd = new Object();
        com.google.android.gms.stats.WakeLock.zze = new com.google.android.gms.stats.zzb();
        return;
    }

    public WakeLock(android.content.Context p7, int p8, String p9)
    {
        String v0_0 = p7.getPackageName();
        this.zzf = new Object();
        this.zzh = 0;
        this.zzk = new java.util.HashSet();
        this.zzl = 1;
        this.zzn = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzs = new java.util.HashMap();
        this.zzt = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7, "WakeLock: context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9, "WakeLock: wakeLockName must not be empty");
        this.zzr = p7.getApplicationContext();
        this.zzq = p9;
        this.zza = 0;
        if ("com.google.android.gms".equals(p7.getPackageName())) {
            this.zzp = p9;
        } else {
            android.os.PowerManager v3_13;
            android.os.PowerManager v3_11 = String.valueOf(p9);
            if (v3_11.length() == 0) {
                v3_13 = new String("*gcore*:");
            } else {
                v3_13 = "*gcore*:".concat(v3_11);
            }
            this.zzp = v3_13;
        }
        android.os.PowerManager v3_16 = ((android.os.PowerManager) p7.getSystemService("power"));
        if (v3_16 == null) {
            Object v8_2 = new StringBuilder(29);
            v8_2.append("expected a non-null reference", 0, 29);
            throw new com.google.android.gms.internal.stats.zzi(v8_2.toString());
        } else {
            Object v8_4 = v3_16.newWakeLock(p8, p9);
            this.zzg = v8_4;
            if (com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(p7)) {
                if (com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(v0_0)) {
                    v0_0 = p7.getPackageName();
                }
                java.util.concurrent.ScheduledExecutorService v7_3 = com.google.android.gms.common.util.WorkSourceUtil.fromPackage(p7, v0_0);
                this.zzo = v7_3;
                if (v7_3 != null) {
                    com.google.android.gms.stats.WakeLock.zze(v8_4, v7_3);
                }
            }
            java.util.concurrent.ScheduledExecutorService v7_4 = com.google.android.gms.stats.WakeLock.zzc;
            if (v7_4 == null) {
                v7_4 = com.google.android.gms.stats.WakeLock.zzc;
                if (v7_4 == null) {
                    com.google.android.gms.internal.stats.zzh.zza();
                    v7_4 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1));
                    com.google.android.gms.stats.WakeLock.zzc = v7_4;
                }
            }
            this.zzu = v7_4;
            return;
        }
    }

    public static synthetic void zza(com.google.android.gms.stats.WakeLock p4)
    {
        if (p4.isHeld()) {
            android.util.Log.e("WakeLock", String.valueOf(p4.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
            void v4_1 = p4.zzc();
            if (v4_1.isHeld()) {
                v4_1.zzh = 1;
                v4_1.zzd(0);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
    }

    private final String zzb(String p2)
    {
        if (this.zzl) {
            android.text.TextUtils.isEmpty(0);
        }
        return 0;
    }

    private final void zzc()
    {
        if (!this.zzk.isEmpty()) {
            int v0_5 = new java.util.ArrayList(this.zzk);
            this.zzk.clear();
            if (v0_5.size() > 0) {
                v0_5.get(0);
                throw 0;
            }
        }
        return;
    }

    private final void zzd(int p6)
    {
        if (this.isHeld()) {
            if (!this.zzl) {
                this.zzh = 0;
            } else {
                com.google.android.gms.internal.stats.zzb v0_17 = (this.zzh - 1);
                this.zzh = v0_17;
                if (v0_17 > null) {
                    return;
                } else {
                }
            }
            this.zzc();
            com.google.android.gms.internal.stats.zzb v0_2 = this.zzs.values().iterator();
            while (v0_2.hasNext()) {
                ((com.google.android.gms.stats.zzc) v0_2.next()).zza = 0;
            }
            this.zzs.clear();
            com.google.android.gms.internal.stats.zzb v0_5 = this.zzi;
            if (v0_5 != null) {
                v0_5.cancel(0);
                this.zzi = 0;
                this.zzj = 0;
            }
            this.zzm = 0;
            if (!this.zzg.isHeld()) {
                android.util.Log.e("WakeLock", String.valueOf(this.zzp).concat(" should be held!"));
            } else {
                try {
                    this.zzg.release();
                } catch (com.google.android.gms.internal.stats.zzb v0_11) {
                    if (!v0_11.getClass().equals(RuntimeException)) {
                        throw v0_11;
                    } else {
                        android.util.Log.e("WakeLock", String.valueOf(this.zzp).concat(" failed to release!"), v0_11);
                        if (this.zza != null) {
                            this.zza = 0;
                        }
                    }
                } catch (com.google.android.gms.internal.stats.zzb v0_12) {
                    if (this.zza != null) {
                        this.zza = 0;
                    }
                    throw v0_12;
                }
                if (this.zza != null) {
                    this.zza = 0;
                }
            }
            return;
        } else {
            return;
        }
    }

    private static void zze(android.os.PowerManager$WakeLock p0, android.os.WorkSource p1)
    {
        try {
            p0.setWorkSource(p1);
            return;
        } catch (String v0_1) {
            android.util.Log.wtf("WakeLock", v0_1.toString());
            return;
        }
    }

    public void acquire(long p10)
    {
        this.zzt.incrementAndGet();
        com.google.android.gms.stats.zza v2_0 = 9223372036854775807;
        long v0_1 = Math.max(Math.min(9223372036854775807, com.google.android.gms.stats.WakeLock.zzb), 1);
        if (p10 > 0) {
            v0_1 = Math.min(p10, v0_1);
        }
        if (!this.isHeld()) {
            this.zza = com.google.android.gms.internal.stats.zzb.zza(0, 0);
            this.zzg.acquire();
            this.zzn.elapsedRealtime();
        }
        this.zzh = (this.zzh + 1);
        this.zzm = (this.zzm + 1);
        this.zzb(0);
        java.util.concurrent.ScheduledFuture v11_10 = ((com.google.android.gms.stats.zzc) this.zzs.get(0));
        if (v11_10 == null) {
            v11_10 = new com.google.android.gms.stats.zzc(0);
            this.zzs.put(0, v11_10);
        }
        v11_10.zza = (v11_10.zza + 1);
        long v5_3 = this.zzn.elapsedRealtime();
        if ((9223372036854775807 - v5_3) > v0_1) {
            v2_0 = (v5_3 + v0_1);
        }
        if (v2_0 > this.zzj) {
            this.zzj = v2_0;
            java.util.concurrent.ScheduledFuture v11_15 = this.zzi;
            if (v11_15 != null) {
                v11_15.cancel(0);
            }
            this.zzi = this.zzu.schedule(new com.google.android.gms.stats.zza(this), v0_1, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return;
    }

    public boolean isHeld()
    {
        try {
            int v1_1;
            if (this.zzh <= 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
        } catch (int v1_2) {
            throw v1_2;
        }
        return v1_1;
    }

    public void release()
    {
        if (this.zzt.decrementAndGet() < 0) {
            android.util.Log.e("WakeLock", String.valueOf(this.zzp).concat(" release without a matched acquire!"));
        }
        this.zzb(0);
        if (!this.zzs.containsKey(0)) {
            android.util.Log.w("WakeLock", String.valueOf(this.zzp).concat(" counter does not exist"));
        } else {
            java.util.Map v2_7 = ((com.google.android.gms.stats.zzc) this.zzs.get(0));
            if (v2_7 != null) {
                int v3_2 = (v2_7.zza - 1);
                v2_7.zza = v3_2;
                if (v3_2 == 0) {
                    this.zzs.remove(0);
                }
            }
        }
        this.zzd(0);
        return;
    }

    public void setReferenceCounted(boolean p2)
    {
        try {
            this.zzl = p2;
            return;
        } catch (Throwable v2_1) {
            throw v2_1;
        }
    }
}
