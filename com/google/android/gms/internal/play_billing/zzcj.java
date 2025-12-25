package com.google.android.gms.internal.play_billing;
public abstract class zzcj extends com.google.android.gms.internal.play_billing.zzck {

    public zzcj()
    {
        return;
    }

    public static bridge synthetic Object zza(com.google.android.gms.internal.play_billing.zzcz p0)
    {
        return com.google.android.gms.internal.play_billing.zzcj.zzr(p0);
    }

    public static Object zzc(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.play_billing.zzcj$zza)) {
            int v4_7 = ((com.google.android.gms.internal.play_billing.zzcj$zza) p4).zzd;
            java.util.concurrent.ExecutionException v0_8 = new java.util.concurrent.CancellationException("Task was cancelled.");
            v0_8.initCause(v4_7);
            throw v0_8;
        } else {
            if (!(p4 instanceof com.google.android.gms.internal.play_billing.zzcj$zzc)) {
                if (p4 == com.google.android.gms.internal.play_billing.zzck.zza) {
                    p4 = 0;
                }
                return p4;
            } else {
                int v4_2 = ((com.google.android.gms.internal.play_billing.zzcj$zzc) p4).zzc;
                if (v4_2 != 0) {
                    throw new java.util.concurrent.ExecutionException(v4_2);
                } else {
                    com.google.android.gms.internal.play_billing.zzck.zzb.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
                    throw new java.util.concurrent.ExecutionException(com.google.android.gms.internal.play_billing.zzcj$zzc.zzb.zzc);
                }
            }
        }
    }

    public static bridge synthetic void zzf(com.google.android.gms.internal.play_billing.zzcj p0, boolean p1)
    {
        com.google.android.gms.internal.play_billing.zzcj.zzu(p0, 0);
        return;
    }

    public static boolean zzh(Object p0)
    {
        if ((p0 instanceof com.google.android.gms.internal.play_billing.zzcj$zzb)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static Object zzr(com.google.android.gms.internal.play_billing.zzcz p6)
    {
        Throwable v0_0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
        if (!(p6 instanceof com.google.android.gms.internal.play_billing.zzcj$zze)) {
            if ((p6 instanceof com.google.android.gms.internal.play_billing.zzdf)) {
                com.google.android.gms.internal.play_billing.zzcj$zzc v1_10 = ((com.google.android.gms.internal.play_billing.zzdf) p6).zze();
                if (v1_10 != null) {
                    return new com.google.android.gms.internal.play_billing.zzcj$zzc(v1_10);
                }
            }
            com.google.android.gms.internal.play_billing.zzcj$zzc v1_1 = p6.isCancelled();
            if (((com.google.android.gms.internal.play_billing.zzck.zzc ^ 1) & v1_1) == 0) {
                try {
                    String v3_3 = com.google.android.gms.internal.play_billing.zzcj.zzs(p6);
                } catch (com.google.android.gms.internal.play_billing.zzcj$zza v6_4) {
                    return new com.google.android.gms.internal.play_billing.zzcj$zzc(v6_4);
                }
                if (v1_1 == null) {
                    if (v3_3 != null) {
                        return v3_3;
                    } else {
                        return com.google.android.gms.internal.play_billing.zzck.zza;
                    }
                } else {
                    return new com.google.android.gms.internal.play_billing.zzcj$zza(0, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(p6))));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzcj$zza v6_13 = com.google.android.gms.internal.play_billing.zzcj$zza.zzb;
                java.util.Objects.requireNonNull(v6_13);
                return v6_13;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzcj$zza v6_15 = ((com.google.android.gms.internal.play_billing.zzcj) p6).valueField;
            if ((v6_15 instanceof com.google.android.gms.internal.play_billing.zzcj$zza)) {
                Throwable v0_6 = ((com.google.android.gms.internal.play_billing.zzcj$zza) v6_15);
                if (v0_6.zzc) {
                    com.google.android.gms.internal.play_billing.zzcj$zza v6_16 = v0_6.zzd;
                    if (v6_16 == null) {
                        v6_15 = com.google.android.gms.internal.play_billing.zzcj$zza.zzb;
                    } else {
                        v6_15 = new com.google.android.gms.internal.play_billing.zzcj$zza(0, v6_16);
                    }
                }
            }
            java.util.Objects.requireNonNull(v6_15);
            return v6_15;
        }
    }

    private static Object zzs(java.util.concurrent.Future p1)
    {
        Thread v0_0 = 0;
        try {
            while(true) {
                p1 = p1.get();
                v0_0 = 1;
            }
        } catch (InterruptedException) {
        } catch (Throwable v1_1) {
            if (v0_0 != null) {
                Thread.currentThread().interrupt();
            }
            throw v1_1;
        }
        if (v0_0 != null) {
            Thread.currentThread().interrupt();
        }
        return p1;
    }

    private final void zzt(StringBuilder p4)
    {
        String v0_0 = "]";
        try {
            String v1_3 = com.google.android.gms.internal.play_billing.zzcj.zzs(this);
            p4.append("SUCCESS, result=[");
        } catch (java.util.concurrent.ExecutionException) {
            p4.append("CANCELLED");
            return;
        }
        if (v1_3 != null) {
            if (v1_3 != this) {
                p4.append(v1_3.getClass().getName());
                p4.append("@");
                p4.append(Integer.toHexString(System.identityHashCode(v1_3)));
            } else {
                p4.append("this future");
            }
        } else {
            p4.append("null");
        }
        p4.append("]");
        return;
    }

    private static void zzu(com.google.android.gms.internal.play_billing.zzcj p3, boolean p4)
    {
        com.google.android.gms.internal.play_billing.zzcj$zzd v4_0 = 0;
        while(true) {
            p3.zzo();
            p3.zzg();
            com.google.android.gms.internal.play_billing.zzcj$zzd v4_5 = p3.zzk(com.google.android.gms.internal.play_billing.zzcj$zzd.zza);
            com.google.android.gms.internal.play_billing.zzcj$zzd v3_3 = v4_0;
            if (v4_5 != null) {
                com.google.android.gms.internal.play_billing.zzcj$zzd v0_2 = v4_5.next;
                v4_5.next = v3_3;
                v3_3 = v4_5;
                v4_5 = v0_2;
                while (v4_5 == null) {
                }
            }
            while (v3_3 != null) {
                com.google.android.gms.internal.play_billing.zzcj$zzd v4_1 = v3_3.zzb;
                com.google.android.gms.internal.play_billing.zzcj$zzd v0_0 = v3_3.next;
                java.util.Objects.requireNonNull(v4_1);
                com.google.android.gms.internal.play_billing.zzcj$zzd v4_2 = ((Runnable) v4_1);
                if (!(v4_2 instanceof com.google.android.gms.internal.play_billing.zzcj$zzb)) {
                    com.google.android.gms.internal.play_billing.zzcj$zzd v3_1 = v3_3.zzc;
                    java.util.Objects.requireNonNull(v3_1);
                    com.google.android.gms.internal.play_billing.zzcj.zzv(v4_2, ((java.util.concurrent.Executor) v3_1));
                } else {
                    com.google.android.gms.internal.play_billing.zzcj$zzd v4_3 = ((com.google.android.gms.internal.play_billing.zzcj$zzb) v4_2);
                    p3 = v4_3.zza;
                    if ((p3.valueField == v4_3) && (com.google.android.gms.internal.play_billing.zzck.zzq(p3, v4_3, com.google.android.gms.internal.play_billing.zzcj.zzr(v4_3.zzb)))) {
                        v4_0 = v0_0;
                    }
                }
                v3_3 = v0_0;
            }
            return;
        }
    }

    private static void zzv(Runnable p6, java.util.concurrent.Executor p7)
    {
        try {
            p7.execute(p6);
            return;
        } catch (java.util.logging.Logger v0_0) {
            com.google.android.gms.internal.play_billing.zzck.zzb.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", g2.g.f("RuntimeException while executing runnable ", String.valueOf(p6), " with executor ", String.valueOf(p7)), v0_0);
            return;
        }
    }

    public final boolean cancel(boolean p8)
    {
        com.google.android.gms.internal.play_billing.zzcj v4_6;
        Object v0_0 = this.valueField;
        if (v0_0 != null) {
            v4_6 = 0;
        } else {
            v4_6 = 1;
        }
        if (((v0_0 instanceof com.google.android.gms.internal.play_billing.zzcj$zzb) | v4_6) == 0) {
            return 0;
        } else {
            com.google.android.gms.internal.play_billing.zzcj$zza v1_2;
            if (!com.google.android.gms.internal.play_billing.zzck.zzc) {
                if (!p8) {
                    v1_2 = com.google.android.gms.internal.play_billing.zzcj$zza.zzb;
                } else {
                    v1_2 = com.google.android.gms.internal.play_billing.zzcj$zza.zza;
                }
                java.util.Objects.requireNonNull(v1_2);
            } else {
                v1_2 = new com.google.android.gms.internal.play_billing.zzcj$zza(p8, new java.util.concurrent.CancellationException("Future.cancel() was called."));
            }
            com.google.android.gms.internal.play_billing.zzcj v4_2 = this;
            int v5_1 = 0;
            do {
                if (!com.google.android.gms.internal.play_billing.zzck.zzq(v4_2, v0_0, v1_2)) {
                    v0_0 = v4_2.valueField;
                } else {
                    com.google.android.gms.internal.play_billing.zzcj.zzu(v4_2, p8);
                    if ((v0_0 instanceof com.google.android.gms.internal.play_billing.zzcj$zzb)) {
                        Object v0_2 = ((com.google.android.gms.internal.play_billing.zzcj$zzb) v0_0).zzb;
                        if (!(v0_2 instanceof com.google.android.gms.internal.play_billing.zzcj$zze)) {
                            v0_2.cancel(p8);
                        } else {
                            int v5_2;
                            v4_2 = ((com.google.android.gms.internal.play_billing.zzcj) v0_2);
                            v0_0 = v4_2.valueField;
                            if (v0_0 != null) {
                                v5_2 = 0;
                            } else {
                                v5_2 = 1;
                            }
                            if ((v5_2 | (v0_0 instanceof com.google.android.gms.internal.play_billing.zzcj$zzb)) == 0) {
                                return 1;
                            } else {
                                v5_1 = 1;
                            }
                        }
                    }
                    return 1;
                }
            } while(!com.google.android.gms.internal.play_billing.zzcj.zzh(v0_0));
            return v5_1;
        }
    }

    public final Object get()
    {
        return this.zzl();
    }

    public final Object get(long p1, java.util.concurrent.TimeUnit p3)
    {
        return this.zzm(p1, p3);
    }

    public final boolean isCancelled()
    {
        return (this.valueField instanceof com.google.android.gms.internal.play_billing.zzcj$zza);
    }

    public final boolean isDone()
    {
        int v0_1;
        int v0_0 = this.valueField;
        boolean v1 = com.google.android.gms.internal.play_billing.zzcj.zzh(v0_0);
        if (v0_0 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        return (v0_1 & v1);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        if (!this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            v0_1.append(this.getClass().getName());
        } else {
            v0_1.append(this.getClass().getSimpleName());
        }
        v0_1.append(64);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append("[status=");
        if (!(this.valueField instanceof com.google.android.gms.internal.play_billing.zzcj$zza)) {
            if (!this.isDone()) {
                int v1_12 = v0_1.length();
                v0_1.append("PENDING");
                int v3_1 = this.valueField;
                if (!(v3_1 instanceof com.google.android.gms.internal.play_billing.zzcj$zzb)) {
                    try {
                        int v3_2 = this.zzd();
                    } catch (int v3_3) {
                        com.google.android.gms.internal.play_billing.zzda.zza(v3_3);
                        v3_2 = "Exception thrown from implementation: ".concat(String.valueOf(v3_3.getClass()));
                        if (v3_2 != 0) {
                            v0_1.append(", info=[");
                            v0_1.append(v3_2);
                            v0_1.append("]");
                        }
                    }
                    if ((v3_2 != 0) && (!v3_2.isEmpty())) {
                    } else {
                        v3_2 = 0;
                    }
                } else {
                    v0_1.append(", setFuture=[");
                    int v3_7 = ((com.google.android.gms.internal.play_billing.zzcj$zzb) v3_1).zzb;
                    if (v3_7 != this) {
                        v0_1.append(v3_7);
                    } else {
                        v0_1.append("this future");
                    }
                    v0_1.append("]");
                }
                if (this.isDone()) {
                    v0_1.delete(v1_12, v0_1.length());
                    this.zzt(v0_1);
                }
            } else {
                this.zzt(v0_1);
            }
        } else {
            v0_1.append("CANCELLED");
        }
        v0_1.append("]");
        return v0_1.toString();
    }

    public final void zzb(Runnable p4, java.util.concurrent.Executor p5)
    {
        com.google.android.gms.internal.play_billing.zzbg.zzc(p5, "Executor was null.");
        if (!this.isDone()) {
            com.google.android.gms.internal.play_billing.zzcj$zzd v0_2 = this.listenersField;
            if (v0_2 != com.google.android.gms.internal.play_billing.zzcj$zzd.zza) {
                com.google.android.gms.internal.play_billing.zzcj$zzd v1_2 = new com.google.android.gms.internal.play_billing.zzcj$zzd(p4, p5);
                do {
                    v1_2.next = v0_2;
                    if (this.zzp(v0_2, v1_2)) {
                        return;
                    } else {
                        v0_2 = this.listenersField;
                    }
                } while(v0_2 != com.google.android.gms.internal.play_billing.zzcj$zzd.zza);
            }
        }
        com.google.android.gms.internal.play_billing.zzcj.zzv(p4, p5);
        return;
    }

    public String zzd()
    {
        throw 0;
    }

    public final Throwable zze()
    {
        if ((this instanceof com.google.android.gms.internal.play_billing.zzcj$zze)) {
            Throwable v0_1 = this.valueField;
            if ((v0_1 instanceof com.google.android.gms.internal.play_billing.zzcj$zzc)) {
                return ((com.google.android.gms.internal.play_billing.zzcj$zzc) v0_1).zzc;
            }
        }
        return 0;
    }

    public void zzg()
    {
        return;
    }

    public final boolean zzi(Throwable p2)
    {
        if (!com.google.android.gms.internal.play_billing.zzck.zzq(this, 0, new com.google.android.gms.internal.play_billing.zzcj$zzc(p2))) {
            return 0;
        } else {
            com.google.android.gms.internal.play_billing.zzcj.zzu(this, 0);
            return 1;
        }
    }

    public final boolean zzj(com.google.android.gms.internal.play_billing.zzcz p5)
    {
        Object v0_0 = this.valueField;
        if (v0_0 == null) {
            if (!p5.isDone()) {
                Object v0_5 = new com.google.android.gms.internal.play_billing.zzcj$zzb(this, p5);
                if (!com.google.android.gms.internal.play_billing.zzck.zzq(this, 0, v0_5)) {
                    v0_0 = this.valueField;
                } else {
                    try {
                        p5.zzb(v0_5, com.google.android.gms.internal.play_billing.zzcp.zza);
                    } catch (Throwable v5_1) {
                        try {
                            com.google.android.gms.internal.play_billing.zzcj$zzc v1_3 = new com.google.android.gms.internal.play_billing.zzcj$zzc(v5_1);
                        } catch (Error) {
                            v1_3 = com.google.android.gms.internal.play_billing.zzcj$zzc.zza;
                        }
                        com.google.android.gms.internal.play_billing.zzck.zzq(this, v0_5, v1_3);
                    }
                    return 1;
                }
            } else {
                if (!com.google.android.gms.internal.play_billing.zzck.zzq(this, 0, com.google.android.gms.internal.play_billing.zzcj.zzr(p5))) {
                    return 0;
                } else {
                    com.google.android.gms.internal.play_billing.zzcj.zzu(this, 0);
                    return 1;
                }
            }
        }
        if ((v0_0 instanceof com.google.android.gms.internal.play_billing.zzcj$zza)) {
            p5.cancel(((com.google.android.gms.internal.play_billing.zzcj$zza) v0_0).zzc);
        }
        return 0;
    }
}
