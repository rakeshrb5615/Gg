package com.google.android.gms.internal.play_billing;
public class zzo implements com.google.android.gms.internal.play_billing.zzcz {
    static final boolean zza;
    static final com.google.android.gms.internal.play_billing.zzd zzb;
    public static final synthetic int zzf;
    private static final java.util.logging.Logger zzg;
    private static final Object zzh;
    volatile Object zzc;
    volatile com.google.android.gms.internal.play_billing.zzh zzd;
    volatile com.google.android.gms.internal.play_billing.zzm zze;

    static zzo()
    {
        com.google.android.gms.internal.play_billing.zzo.zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        com.google.android.gms.internal.play_billing.zzo.zzg = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.zzo.getName());
        try {
            com.google.android.gms.internal.play_billing.zzl v4_1 = new com.google.android.gms.internal.play_billing.zzj(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzm, Thread, "zzb"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzm, com.google.android.gms.internal.play_billing.zzm, "zzc"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzo, com.google.android.gms.internal.play_billing.zzm, "zze"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzo, com.google.android.gms.internal.play_billing.zzh, "zzd"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzo, Object, "zzc"));
            Object v0_1 = 0;
        } catch (Object v0_1) {
            v4_1 = new com.google.android.gms.internal.play_billing.zzl();
        }
        Throwable v10 = v0_1;
        com.google.android.gms.internal.play_billing.zzo.zzb = v4_1;
        if (v10 != null) {
            com.google.android.gms.internal.play_billing.zzo.zzg.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", v10);
        }
        com.google.android.gms.internal.play_billing.zzo.zzh = new Object();
        return;
    }

    public zzo()
    {
        return;
    }

    public static void zzc(com.google.android.gms.internal.play_billing.zzo p4)
    {
        do {
            Runnable v0_0 = p4.zze;
            com.google.android.gms.internal.play_billing.zzh v1_0 = com.google.android.gms.internal.play_billing.zzo.zzb;
        } while(!v1_0.zze(p4, v0_0, com.google.android.gms.internal.play_billing.zzm.zza));
    }

    private final void zze(StringBuilder p4)
    {
        String v0_0 = "]";
        String v1_0 = 0;
        try {
            while(true) {
                String v2_0 = this.get();
                v1_0 = 1;
            }
        } catch (InterruptedException) {
        } catch (InterruptedException) {
            p4.append("CANCELLED");
            return;
        }
        if (v1_0 != null) {
            Thread.currentThread().interrupt();
        }
        String v1_3;
        p4.append("SUCCESS, result=[");
        if (v2_0 != this) {
            v1_3 = String.valueOf(v2_0);
        } else {
            v1_3 = "this future";
        }
        p4.append(v1_3);
        p4.append("]");
        return;
    }

    private static void zzf(Runnable p6, java.util.concurrent.Executor p7)
    {
        try {
            p7.execute(p6);
            return;
        } catch (java.util.logging.Logger v0_0) {
            com.google.android.gms.internal.play_billing.zzo.zzg.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", g2.g.f("RuntimeException while executing runnable ", String.valueOf(p6), " with executor ", String.valueOf(p7)), v0_0);
            return;
        }
    }

    private final void zzg(com.google.android.gms.internal.play_billing.zzm p5)
    {
        p5.zzb = 0;
        do {
            boolean v5_3 = this.zze;
            if (v5_3 != com.google.android.gms.internal.play_billing.zzm.zza) {
                com.google.android.gms.internal.play_billing.zzm v1_0 = 0;
                while (v5_3) {
                    com.google.android.gms.internal.play_billing.zzm v2 = v5_3.zzc;
                    if (v5_3.zzb == null) {
                        if (v1_0 == null) {
                        } else {
                            v1_0.zzc = v2;
                            if (v1_0.zzb == null) {
                            }
                        }
                    } else {
                        v1_0 = v5_3;
                    }
                    v5_3 = v2;
                }
            }
            return;
        } while(com.google.android.gms.internal.play_billing.zzo.zzb.zze(this, v5_3, v2));
    }

    private static final Object zzh(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.internal.play_billing.zze)) {
            int v2_4 = ((com.google.android.gms.internal.play_billing.zze) p2).zzc;
            java.util.concurrent.ExecutionException v0_5 = new java.util.concurrent.CancellationException("Task was cancelled.");
            v0_5.initCause(v2_4);
            throw v0_5;
        } else {
            if ((p2 instanceof com.google.android.gms.internal.play_billing.zzg)) {
                throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.play_billing.zzg) p2).zza);
            } else {
                if (p2 == com.google.android.gms.internal.play_billing.zzo.zzh) {
                    p2 = 0;
                }
                return p2;
            }
        }
    }

    public final boolean cancel(boolean p7)
    {
        java.util.concurrent.CancellationException v4_2;
        Object v0 = this.zzc;
        if (v0 != null) {
            v4_2 = 0;
        } else {
            v4_2 = 1;
        }
        if (((v0 instanceof com.google.android.gms.internal.play_billing.zzk) | v4_2) != 0) {
            com.google.android.gms.internal.play_billing.zze v1_1;
            if (!com.google.android.gms.internal.play_billing.zzo.zza) {
                if (p7 == 0) {
                    v1_1 = com.google.android.gms.internal.play_billing.zze.zzb;
                } else {
                    v1_1 = com.google.android.gms.internal.play_billing.zze.zza;
                }
            } else {
                v1_1 = new com.google.android.gms.internal.play_billing.zze(p7, new java.util.concurrent.CancellationException("Future.cancel() was called."));
            }
            while (!com.google.android.gms.internal.play_billing.zzo.zzb.zzd(this, v0, v1_1)) {
                v0 = this.zzc;
                if (!(v0 instanceof com.google.android.gms.internal.play_billing.zzk)) {
                }
            }
            com.google.android.gms.internal.play_billing.zzo.zzc(this);
            if ((v0 instanceof com.google.android.gms.internal.play_billing.zzk)) {
                throw 0;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public final Object get()
    {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else {
            int v3_0;
            Object v0_13 = this.zzc;
            if (v0_13 == null) {
                v3_0 = 0;
            } else {
                v3_0 = 1;
            }
            if ((v3_0 & ((v0_13 instanceof com.google.android.gms.internal.play_billing.zzk) ^ 1)) == 0) {
                Object v0_1 = this.zze;
                int v3_2 = com.google.android.gms.internal.play_billing.zzm.zza;
                if (v0_1 != v3_2) {
                    com.google.android.gms.internal.play_billing.zzm v4_3 = new com.google.android.gms.internal.play_billing.zzm();
                    do {
                        int v5_0 = com.google.android.gms.internal.play_billing.zzo.zzb;
                        v5_0.zza(v4_3, v0_1);
                        if (!v5_0.zze(this, v0_1, v4_3)) {
                            v0_1 = this.zze;
                        }
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (Thread.interrupted()) {
                                this.zzg(v4_3);
                                throw new InterruptedException();
                            } else {
                                int v3_3;
                                Object v0_10 = this.zzc;
                                if (v0_10 == null) {
                                    v3_3 = 0;
                                } else {
                                    v3_3 = 1;
                                }
                            }
                        } while((v3_3 & ((v0_10 instanceof com.google.android.gms.internal.play_billing.zzk) ^ 1)) == 0);
                        return com.google.android.gms.internal.play_billing.zzo.zzh(v0_10);
                    } while(v0_1 != v3_2);
                }
                return com.google.android.gms.internal.play_billing.zzo.zzh(this.zzc);
            } else {
                return com.google.android.gms.internal.play_billing.zzo.zzh(v0_13);
            }
        }
    }

    public final Object get(long p20, java.util.concurrent.TimeUnit p22)
    {
        void v0 = this;
        long v4_4 = p22.toNanos(p20);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        } else {
            long v9_0;
            long v6_0 = this.zzc;
            if (v6_0 == 0) {
                v9_0 = 0;
            } else {
                v9_0 = 1;
            }
            if ((v9_0 & ((v6_0 instanceof com.google.android.gms.internal.play_billing.zzk) ^ 1)) == 0) {
                long v11_1;
                if (v4_4 <= 0) {
                    v11_1 = 0;
                } else {
                    v11_1 = (System.nanoTime() + v4_4);
                }
                int v16;
                if (v4_4 < 1000) {
                    v16 = 1;
                } else {
                    long v6_5 = this.zze;
                    com.google.android.gms.internal.play_billing.zzm v15 = com.google.android.gms.internal.play_billing.zzm.zza;
                    if (v6_5 != v15) {
                        String v7_1 = new com.google.android.gms.internal.play_billing.zzm();
                        v16 = 1;
                        do {
                            long v8_2 = com.google.android.gms.internal.play_billing.zzo.zzb;
                            v8_2.zza(v7_1, v6_5);
                            if (!v8_2.zze(this, v6_5, v7_1)) {
                                v6_5 = this.zze;
                            }
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, v4_4);
                                if (Thread.interrupted()) {
                                    this.zzg(v7_1);
                                    throw new InterruptedException();
                                } else {
                                    int v5_2;
                                    long v4_6 = this.zzc;
                                    if (v4_6 == 0) {
                                        v5_2 = 0;
                                    } else {
                                        v5_2 = 1;
                                    }
                                    if ((v5_2 & ((v4_6 instanceof com.google.android.gms.internal.play_billing.zzk) ^ 1)) == 0) {
                                        v4_4 = (v11_1 - System.nanoTime());
                                    } else {
                                        return com.google.android.gms.internal.play_billing.zzo.zzh(v4_6);
                                    }
                                }
                                while (v4_4 > 0) {
                                    int v5_0;
                                    long v4_1 = v0.zzc;
                                    if (v4_1 == 0) {
                                        v5_0 = 0;
                                    } else {
                                        v5_0 = v16;
                                    }
                                    if ((v5_0 & ((v4_1 instanceof com.google.android.gms.internal.play_billing.zzk) ^ 1)) == 0) {
                                        if (Thread.interrupted()) {
                                            throw new InterruptedException();
                                        } else {
                                            v4_4 = (v11_1 - System.nanoTime());
                                        }
                                    } else {
                                        return com.google.android.gms.internal.play_billing.zzo.zzh(v4_1);
                                    }
                                }
                                long v6_12 = v0.toString();
                                long v8_3 = java.util.Locale.ROOT;
                                String v7_3 = p22.toString().toLowerCase(v8_3);
                                long v8_4 = p22.toString().toLowerCase(v8_3);
                                long v11_5 = new StringBuilder("Waited ");
                                v11_5.append(p20);
                                v11_5.append(" ");
                                v11_5.append(v8_4);
                                String v2_3 = v11_5.toString();
                                if ((v4_4 + 1000) < 0) {
                                    String v2_1 = v2_3.concat(" (plus ");
                                    long v4_8 = (- v4_4);
                                    long v11_0 = p22.convert(v4_8, java.util.concurrent.TimeUnit.NANOSECONDS);
                                    long v4_0 = (v4_8 - p22.toNanos(v11_0));
                                    String v3_0 = v11_0 cmp 0;
                                    if ((v3_0 != null) && (v4_0 <= 1000)) {
                                        v16 = 0;
                                    }
                                    if (v3_0 > null) {
                                        String v3_2 = new StringBuilder();
                                        v3_2.append(v2_1);
                                        v3_2.append(v11_0);
                                        v3_2.append(" ");
                                        v3_2.append(v7_3);
                                        String v2_0 = v3_2.toString();
                                        if (v16 != 0) {
                                            v2_0 = v2_0.concat(",");
                                        }
                                        v2_1 = v2_0.concat(" ");
                                    }
                                    if (v16 != 0) {
                                        Object v1_2 = new StringBuilder();
                                        v1_2.append(v2_1);
                                        v1_2.append(v4_0);
                                        v1_2.append(" nanoseconds ");
                                        v2_1 = v1_2.toString();
                                    }
                                    v2_3 = v2_1.concat("delay)");
                                }
                                if (!v0.isDone()) {
                                    throw new java.util.concurrent.TimeoutException(g2.g.e(v2_3, " for ", v6_12));
                                } else {
                                    throw new java.util.concurrent.TimeoutException(v2_3.concat(" but future completed as timeout expired"));
                                }
                            } while(v4_4 >= 1000);
                            v0 = this.zzg(v7_1);
                        } while(v6_5 != v15);
                    }
                    return com.google.android.gms.internal.play_billing.zzo.zzh(this.zzc);
                }
            } else {
                return com.google.android.gms.internal.play_billing.zzo.zzh(v6_0);
            }
        }
    }

    public final boolean isCancelled()
    {
        return (this.zzc instanceof com.google.android.gms.internal.play_billing.zze);
    }

    public final boolean isDone()
    {
        int v0_1;
        int v0_0 = this.zzc;
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        return (v0_1 & ((v0_0 instanceof com.google.android.gms.internal.play_billing.zzk) ^ 1));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(super.toString());
        v0_1.append("[status=");
        if (!(this.zzc instanceof com.google.android.gms.internal.play_billing.zze)) {
            if (!this.isDone()) {
                try {
                    String v1_1 = this.zza();
                } catch (String v1_2) {
                    v1_1 = "Exception thrown from implementation: ".concat(String.valueOf(v1_2.getClass()));
                }
                if ((v1_1 == null) || (v1_1.isEmpty())) {
                    if (!this.isDone()) {
                        v0_1.append("PENDING");
                    } else {
                        this.zze(v0_1);
                    }
                } else {
                    v0_1.append("PENDING, info=[");
                    v0_1.append(v1_1);
                    v0_1.append("]");
                }
            } else {
                this.zze(v0_1);
            }
        } else {
            v0_1.append("CANCELLED");
        }
        v0_1.append("]");
        return v0_1.toString();
    }

    public String zza()
    {
        if (!(this.zzc instanceof com.google.android.gms.internal.play_billing.zzk)) {
            if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
                return 0;
            } else {
                int v0_2 = ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
                StringBuilder v2_1 = new StringBuilder("remaining delay=[");
                v2_1.append(v0_2);
                v2_1.append(" ms]");
                return v2_1.toString();
            }
        } else {
            return "setFuture=[null]";
        }
    }

    public final void zzb(Runnable p5, java.util.concurrent.Executor p6)
    {
        p6.getClass();
        com.google.android.gms.internal.play_billing.zzh v0_0 = this.zzd;
        com.google.android.gms.internal.play_billing.zzh v1 = com.google.android.gms.internal.play_billing.zzh.zza;
        if (v0_0 != v1) {
            com.google.android.gms.internal.play_billing.zzh v2_1 = new com.google.android.gms.internal.play_billing.zzh(p5, p6);
            do {
                v2_1.zzd = v0_0;
                if (!com.google.android.gms.internal.play_billing.zzo.zzb.zzc(this, v0_0, v2_1)) {
                    v0_0 = this.zzd;
                } else {
                    return;
                }
            } while(v0_0 != v1);
        }
        com.google.android.gms.internal.play_billing.zzo.zzf(p5, p6);
        return;
    }

    public boolean zzd(Object p3)
    {
        if (p3 == 0) {
            p3 = com.google.android.gms.internal.play_billing.zzo.zzh;
        }
        if (!com.google.android.gms.internal.play_billing.zzo.zzb.zzd(this, 0, p3)) {
            return 0;
        } else {
            com.google.android.gms.internal.play_billing.zzo.zzc(this);
            return 1;
        }
    }
}
