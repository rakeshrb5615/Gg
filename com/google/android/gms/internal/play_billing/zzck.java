package com.google.android.gms.internal.play_billing;
abstract class zzck extends com.google.android.gms.internal.play_billing.zzdf implements com.google.android.gms.internal.play_billing.zzcz {
    static final Object zza;
    static final com.google.android.gms.internal.play_billing.zzcy zzb;
    static final boolean zzc;
    private static final com.google.android.gms.internal.play_billing.zzck$zza zzd;
    volatile com.google.android.gms.internal.play_billing.zzcj$zzd listenersField;
    volatile Object valueField;
    volatile com.google.android.gms.internal.play_billing.zzck$zze waitersField;

    static zzck()
    {
        com.google.android.gms.internal.play_billing.zzck.zza = new Object();
        com.google.android.gms.internal.play_billing.zzck.zzb = new com.google.android.gms.internal.play_billing.zzcy(com.google.android.gms.internal.play_billing.zzcj);
        try {
            com.google.android.gms.internal.play_billing.zzck$zzc v0_3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException) {
            v0_3 = 0;
        }
        com.google.android.gms.internal.play_billing.zzck$zzc v0_8;
        com.google.android.gms.internal.play_billing.zzck.zzc = v0_3;
        com.google.android.gms.internal.play_billing.zzck$zzc v0_5 = System.getProperty("java.runtime.name", "");
        if ((v0_5 != null) && (!v0_5.contains("Android"))) {
            try {
                v0_8 = new com.google.android.gms.internal.play_billing.zzck$zzb(0);
            } catch (NoClassDefFoundError) {
                v0_8 = new com.google.android.gms.internal.play_billing.zzck$zzc(0);
            }
            Error v6 = 0;
            java.util.logging.Level v12 = 0;
        } else {
            try {
                v0_8 = new com.google.android.gms.internal.play_billing.zzck$zzd(0);
            } catch (com.google.android.gms.internal.play_billing.zzck$zzc v0_12) {
                java.util.logging.Level v2_1 = v0_12;
                try {
                    v0_8 = new com.google.android.gms.internal.play_billing.zzck$zzb(0);
                    v6 = 0;
                    v12 = v2_1;
                } catch (com.google.android.gms.internal.play_billing.zzck$zzc v0_14) {
                    v6 = v0_14;
                    v12 = v2_1;
                    v0_8 = new com.google.android.gms.internal.play_billing.zzck$zzc(0);
                } catch (com.google.android.gms.internal.play_billing.zzck$zzc v0_14) {
                }
            } catch (com.google.android.gms.internal.play_billing.zzck$zzc v0_12) {
            }
        }
        com.google.android.gms.internal.play_billing.zzck.zzd = v0_8;
        if (v6 != null) {
            com.google.android.gms.internal.play_billing.zzck$zzc v0_15 = com.google.android.gms.internal.play_billing.zzck.zzb;
            java.util.logging.Level v2_2 = java.util.logging.Level.SEVERE;
            v0_15.zza().logp(v2_2, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", v12);
            v0_15.zza().logp(v2_2, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", v6);
        }
        return;
    }

    public zzck()
    {
        return;
    }

    private final void zza(com.google.android.gms.internal.play_billing.zzck$zze p5)
    {
        p5.thread = 0;
        do {
            boolean v5_3 = this.waitersField;
            if (v5_3 == com.google.android.gms.internal.play_billing.zzck$zze.zza) {
                break;
            }
            com.google.android.gms.internal.play_billing.zzck$zze v1_0 = 0;
        } while(!v5_3);
        return;
    }

    public static synthetic void zzn(com.google.android.gms.internal.play_billing.zzck$zze p1, Thread p2)
    {
        com.google.android.gms.internal.play_billing.zzck.zzd.zzd(p1, p2);
        return;
    }

    public static boolean zzq(com.google.android.gms.internal.play_billing.zzck p1, Object p2, Object p3)
    {
        return com.google.android.gms.internal.play_billing.zzck.zzd.zzf(p1, p2, p3);
    }

    public final com.google.android.gms.internal.play_billing.zzcj$zzd zzk(com.google.android.gms.internal.play_billing.zzcj$zzd p2)
    {
        return com.google.android.gms.internal.play_billing.zzck.zzd.zza(this, p2);
    }

    public final Object zzl()
    {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else {
            com.google.android.gms.internal.play_billing.zzck$zze v3_0;
            Object v0_13 = this.valueField;
            if (v0_13 == null) {
                v3_0 = 0;
            } else {
                v3_0 = 1;
            }
            if ((v3_0 & com.google.android.gms.internal.play_billing.zzcj.zzh(v0_13)) == 0) {
                Object v0_1 = this.waitersField;
                if (v0_1 != com.google.android.gms.internal.play_billing.zzck$zze.zza) {
                    com.google.android.gms.internal.play_billing.zzck$zze v3_4 = new com.google.android.gms.internal.play_billing.zzck$zze();
                    do {
                        int v4_1 = com.google.android.gms.internal.play_billing.zzck.zzd;
                        v4_1.zzc(v3_4, v0_1);
                        if (!v4_1.zzg(this, v0_1, v3_4)) {
                            v0_1 = this.waitersField;
                        }
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (Thread.interrupted()) {
                                this.zza(v3_4);
                                throw new InterruptedException();
                            } else {
                                int v4_3;
                                Object v0_10 = this.valueField;
                                if (v0_10 == null) {
                                    v4_3 = 0;
                                } else {
                                    v4_3 = 1;
                                }
                            }
                        } while((v4_3 & com.google.android.gms.internal.play_billing.zzcj.zzh(v0_10)) == 0);
                        return com.google.android.gms.internal.play_billing.zzcj.zzc(v0_10);
                    } while(v0_1 != com.google.android.gms.internal.play_billing.zzck$zze.zza);
                }
                Object v0_3 = this.valueField;
                java.util.Objects.requireNonNull(v0_3);
                return com.google.android.gms.internal.play_billing.zzcj.zzc(v0_3);
            } else {
                return com.google.android.gms.internal.play_billing.zzcj.zzc(v0_13);
            }
        }
    }

    public final Object zzm(long p19, java.util.concurrent.TimeUnit p21)
    {
        void v0 = this;
        long v4_5 = p21.toNanos(p19);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else {
            long v9_1;
            long v6_0 = this.valueField;
            int v8 = 1;
            if (v6_0 == 0) {
                v9_1 = 0;
            } else {
                v9_1 = 1;
            }
            if ((v9_1 & com.google.android.gms.internal.play_billing.zzcj.zzh(v6_0)) == 0) {
                long v11_2;
                if (v4_5 <= 0) {
                    v11_2 = 0;
                } else {
                    v11_2 = (System.nanoTime() + v4_5);
                }
                if (v4_5 >= 1000) {
                    long v6_4 = this.waitersField;
                    if (v6_4 != com.google.android.gms.internal.play_billing.zzck$zze.zza) {
                        String v15_2 = new com.google.android.gms.internal.play_billing.zzck$zze();
                        do {
                            com.google.android.gms.internal.play_billing.zzck$zze v7_0 = com.google.android.gms.internal.play_billing.zzck.zzd;
                            v7_0.zzc(v15_2, v6_4);
                            if (!v7_0.zzg(this, v6_4, v15_2)) {
                                v6_4 = this.waitersField;
                            }
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, Math.min(v4_5, 2147483647999999999));
                                if (Thread.interrupted()) {
                                    this.zza(v15_2);
                                    throw new InterruptedException();
                                } else {
                                    int v5_2;
                                    long v4_8 = this.valueField;
                                    if (v4_8 == 0) {
                                        v5_2 = 0;
                                    } else {
                                        v5_2 = 1;
                                    }
                                    if ((v5_2 & com.google.android.gms.internal.play_billing.zzcj.zzh(v4_8)) == 0) {
                                        v4_5 = (v11_2 - System.nanoTime());
                                    } else {
                                        return com.google.android.gms.internal.play_billing.zzcj.zzc(v4_8);
                                    }
                                }
                                while (v4_5 > 0) {
                                    int v5_0;
                                    long v4_2 = v0.valueField;
                                    if (v4_2 == 0) {
                                        v5_0 = 0;
                                    } else {
                                        v5_0 = 1;
                                    }
                                    if ((v5_0 & com.google.android.gms.internal.play_billing.zzcj.zzh(v4_2)) == 0) {
                                        if (Thread.interrupted()) {
                                            throw new InterruptedException();
                                        } else {
                                            v4_5 = (v11_2 - System.nanoTime());
                                        }
                                    } else {
                                        return com.google.android.gms.internal.play_billing.zzcj.zzc(v4_2);
                                    }
                                }
                                long v6_11 = v0.toString();
                                long v11_4 = java.util.Locale.ROOT;
                                com.google.android.gms.internal.play_billing.zzck$zze v7_3 = p21.toString().toLowerCase(v11_4);
                                long v11_5 = p21.toString().toLowerCase(v11_4);
                                StringBuilder v12_2 = new StringBuilder("Waited ");
                                v12_2.append(p19);
                                v12_2.append(" ");
                                v12_2.append(v11_5);
                                String v2_3 = v12_2.toString();
                                if ((v4_5 + 1000) < 0) {
                                    String v2_0 = v2_3.concat(" (plus ");
                                    long v4_0 = (- v4_5);
                                    long v11_1 = p21.convert(v4_0, java.util.concurrent.TimeUnit.NANOSECONDS);
                                    long v4_1 = (v4_0 - p21.toNanos(v11_1));
                                    String v3_0 = v11_1 cmp 0;
                                    if ((v3_0 != null) && (v4_1 <= 1000)) {
                                        v8 = 0;
                                    }
                                    if (v3_0 > null) {
                                        String v3_2 = new StringBuilder();
                                        v3_2.append(v2_0);
                                        v3_2.append(v11_1);
                                        v3_2.append(" ");
                                        v3_2.append(v7_3);
                                        String v2_1 = v3_2.toString();
                                        if (v8 != 0) {
                                            v2_1 = v2_1.concat(",");
                                        }
                                        v2_0 = v2_1.concat(" ");
                                    }
                                    if (v8 != 0) {
                                        Object v1_2 = new StringBuilder();
                                        v1_2.append(v2_0);
                                        v1_2.append(v4_1);
                                        v1_2.append(" nanoseconds ");
                                        v2_0 = v1_2.toString();
                                    }
                                    v2_3 = v2_0.concat("delay)");
                                }
                                if (!v0.isDone()) {
                                    throw new java.util.concurrent.TimeoutException(g2.g.e(v2_3, " for ", v6_11));
                                } else {
                                    throw new java.util.concurrent.TimeoutException(v2_3.concat(" but future completed as timeout expired"));
                                }
                            } while(v4_5 >= 1000);
                            v0 = this.zza(v15_2);
                        } while(v6_4 != com.google.android.gms.internal.play_billing.zzck$zze.zza);
                    }
                    Object v1_14 = this.valueField;
                    java.util.Objects.requireNonNull(v1_14);
                    return com.google.android.gms.internal.play_billing.zzcj.zzc(v1_14);
                }
            } else {
                return com.google.android.gms.internal.play_billing.zzcj.zzc(v6_0);
            }
        }
    }

    public final void zzo()
    {
        com.google.android.gms.internal.play_billing.zzck$zze v0_1 = com.google.android.gms.internal.play_billing.zzck.zzd.zzb(this, com.google.android.gms.internal.play_billing.zzck$zze.zza);
        while (v0_1 != null) {
            Thread v1_1 = v0_1.thread;
            if (v1_1 != null) {
                v0_1.thread = 0;
                java.util.concurrent.locks.LockSupport.unpark(v1_1);
            }
            v0_1 = v0_1.next;
        }
        return;
    }

    public final boolean zzp(com.google.android.gms.internal.play_billing.zzcj$zzd p2, com.google.android.gms.internal.play_billing.zzcj$zzd p3)
    {
        return com.google.android.gms.internal.play_billing.zzck.zzd.zze(this, p2, p3);
    }
}
