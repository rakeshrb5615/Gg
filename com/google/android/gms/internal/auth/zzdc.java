package com.google.android.gms.internal.auth;
public abstract class zzdc {
    private static final Object zza = None;
    public static final synthetic int zzd = 0;
    private static volatile com.google.android.gms.internal.auth.zzda zze = None;
    private static volatile boolean zzf = False;
    private static final java.util.concurrent.atomic.AtomicReference zzg;
    private static final com.google.android.gms.internal.auth.zzde zzh;
    private static final java.util.concurrent.atomic.AtomicInteger zzi;
    final com.google.android.gms.internal.auth.zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk;
    private volatile Object zzl;
    private final boolean zzm;

    static zzdc()
    {
        com.google.android.gms.internal.auth.zzdc.zza = new Object();
        com.google.android.gms.internal.auth.zzdc.zzg = new java.util.concurrent.atomic.AtomicReference();
        com.google.android.gms.internal.auth.zzdc.zzh = new com.google.android.gms.internal.auth.zzde(com.google.android.gms.internal.auth.zzcu.zza, 0);
        com.google.android.gms.internal.auth.zzdc.zzi = new java.util.concurrent.atomic.AtomicInteger();
        return;
    }

    public synthetic zzdc(com.google.android.gms.internal.auth.zzcz p1, String p2, Object p3, boolean p4, com.google.android.gms.internal.auth.zzdb p5)
    {
        this.zzk = -1;
        if (p1.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else {
            this.zzb = p1;
            this.zzc = p2;
            this.zzj = p3;
            this.zzm = 1;
            return;
        }
    }

    public static void zzd()
    {
        com.google.android.gms.internal.auth.zzdc.zzi.incrementAndGet();
        return;
    }

    public static void zze(android.content.Context p3)
    {
        if (com.google.android.gms.internal.auth.zzdc.zze != null) {
            return;
        } else {
            if (com.google.android.gms.internal.auth.zzdc.zze == null) {
                com.google.android.gms.internal.auth.zzdj v1_5 = com.google.android.gms.internal.auth.zzdc.zze;
                com.google.android.gms.internal.auth.zzcd v2_2 = p3.getApplicationContext();
                if (v2_2 != null) {
                    p3 = v2_2;
                }
                if (v1_5 == null) {
                    com.google.android.gms.internal.auth.zzcg.zzd();
                    com.google.android.gms.internal.auth.zzdd.zzc();
                    com.google.android.gms.internal.auth.zzco.zze();
                    com.google.android.gms.internal.auth.zzdc.zze = new com.google.android.gms.internal.auth.zzcd(p3, com.google.android.gms.internal.auth.zzdn.zza(new com.google.android.gms.internal.auth.zzct(p3)));
                    com.google.android.gms.internal.auth.zzdc.zzi.incrementAndGet();
                } else {
                    if (v1_5.zza() != p3) {
                    }
                }
            }
            return;
        }
    }

    public abstract Object zza();

    public final Object zzb()
    {
        if ((!this.zzm) && (this.zzc == null)) {
            throw new NullPointerException("flagName must not be null");
        } else {
            IllegalStateException v0_1 = com.google.android.gms.internal.auth.zzdc.zzi.get();
            if (this.zzk < v0_1) {
                if (this.zzk < v0_1) {
                    String v1_2 = com.google.android.gms.internal.auth.zzdc.zze;
                    if (v1_2 == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    } else {
                        Object v2_5;
                        if (this.zzb.zzb == null) {
                            v2_5 = com.google.android.gms.internal.auth.zzdd.zza(v1_2.zza(), 0, com.google.android.gms.internal.auth.zzcs.zza);
                        } else {
                            if (!com.google.android.gms.internal.auth.zzcq.zza(v1_2.zza(), this.zzb.zzb)) {
                                v2_5 = 0;
                            } else {
                                v2_5 = com.google.android.gms.internal.auth.zzcg.zza(v1_2.zza().getContentResolver(), this.zzb.zzb, com.google.android.gms.internal.auth.zzcs.zza);
                            }
                        }
                        Object v2_0;
                        if (v2_5 == null) {
                            v2_0 = 0;
                        } else {
                            Object v2_11 = v2_5.zzb(this.zzc());
                            if (v2_11 == null) {
                            } else {
                                v2_0 = this.zza(v2_11);
                            }
                        }
                        if (v2_0 == null) {
                            if (this.zzb.zze) {
                                v2_0 = 0;
                            } else {
                                String v4_9;
                                Object v2_15 = com.google.android.gms.internal.auth.zzco.zza(v1_2.zza());
                                if (!this.zzb.zze) {
                                    v4_9 = this.zzc;
                                } else {
                                    v4_9 = 0;
                                }
                                Object v2_16 = v2_15.zzc(v4_9);
                                if (v2_16 == null) {
                                } else {
                                    v2_0 = this.zza(v2_16);
                                }
                            }
                            if (v2_0 == null) {
                                v2_0 = this.zzj;
                            }
                        } else {
                        }
                        String v1_6 = ((com.google.android.gms.internal.auth.zzdh) v1_2.zzb().zza());
                        if (v1_6.zzb()) {
                            Object v2_17 = this.zzb;
                            String v1_9 = ((com.google.android.gms.internal.auth.zzci) v1_6.zza()).zza(v2_17.zzb, 0, v2_17.zzd, this.zzc);
                            if (v1_9 != null) {
                                v2_0 = this.zza(v1_9);
                            } else {
                                v2_0 = this.zzj;
                            }
                        }
                        this.zzl = v2_0;
                        this.zzk = v0_1;
                    }
                }
            }
            return this.zzl;
        }
    }

    public final String zzc()
    {
        return this.zzc;
    }
}
