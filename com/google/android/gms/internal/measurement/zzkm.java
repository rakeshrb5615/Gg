package com.google.android.gms.internal.measurement;
public abstract class zzkm {
    public static final synthetic int zzc = 0;
    private static final Object zzd = None;
    private static volatile com.google.android.gms.internal.measurement.zzkh zze = None;
    private static volatile boolean zzf = False;
    private static final java.util.concurrent.atomic.AtomicInteger zzh;
    final com.google.android.gms.internal.measurement.zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi;
    private volatile Object zzj;
    private volatile boolean zzk;

    static zzkm()
    {
        com.google.android.gms.internal.measurement.zzkm.zzd = new Object();
        new java.util.concurrent.atomic.AtomicReference();
        a.a.g(com.google.android.gms.internal.measurement.zzkk.zza, "BuildInfo must be non-null");
        com.google.android.gms.internal.measurement.zzkm.zzh = new java.util.concurrent.atomic.AtomicInteger();
        return;
    }

    public synthetic zzkm(com.google.android.gms.internal.measurement.zzkg p1, String p2, Object p3, boolean p4, byte[] p5)
    {
        this.zzi = -1;
        if (p1.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else {
            this.zza = p1;
            this.zzb = p2;
            this.zzg = p3;
            this.zzk = 0;
            return;
        }
    }

    public static void zzb(android.content.Context p3)
    {
        if ((com.google.android.gms.internal.measurement.zzkm.zze == null) && (p3 != null)) {
            if (com.google.android.gms.internal.measurement.zzkm.zze == null) {
                com.google.android.gms.internal.measurement.zzjn v1_5 = com.google.android.gms.internal.measurement.zzkm.zze;
                l4.i v2_5 = p3.getApplicationContext();
                if (v2_5 != null) {
                    p3 = v2_5;
                }
                if (v1_5 == null) {
                    if (v1_5 != null) {
                        com.google.android.gms.internal.measurement.zzjr.zzd();
                        com.google.android.gms.internal.measurement.zzko.zzb();
                        com.google.android.gms.internal.measurement.zzjy.zzc();
                    }
                    l4.i v2_3;
                    com.google.android.gms.internal.measurement.zzjn v1_1 = new com.google.android.gms.internal.measurement.zzkl(p3);
                    if (!(v1_1 instanceof java.io.Serializable)) {
                        v2_3 = new l4.i();
                        v2_3.a = v1_1;
                    } else {
                        v2_3 = new l4.g(v1_1);
                    }
                    com.google.android.gms.internal.measurement.zzkm.zze = new com.google.android.gms.internal.measurement.zzjn(p3, v2_3);
                    com.google.android.gms.internal.measurement.zzkm.zzh.incrementAndGet();
                } else {
                    if (v1_5.zza() != p3) {
                    }
                }
            }
            return;
        } else {
            return;
        }
    }

    public static void zzc()
    {
        com.google.android.gms.internal.measurement.zzkm.zzh.incrementAndGet();
        return;
    }

    public abstract Object zza();

    public final Object zzd()
    {
        IllegalStateException v0_1 = com.google.android.gms.internal.measurement.zzkm.zzh.get();
        if (this.zzi < v0_1) {
            if (this.zzi < v0_1) {
                String v4_2;
                String v1_2 = com.google.android.gms.internal.measurement.zzkm.zze;
                l4.d v2_2 = l4.a.a;
                Object v3 = 0;
                if ((v1_2 == null) || (v1_2.zzb() == null)) {
                    v4_2 = 0;
                } else {
                    l4.d v2_0 = v1_2.zzb();
                    v2_0.getClass();
                    v2_2 = ((l4.d) v2_0.get());
                    if (!v2_2.b()) {
                    } else {
                        String v5_0 = this.zza;
                        v4_2 = ((com.google.android.gms.internal.measurement.zzjt) v2_2.a()).zza(v5_0.zza, 0, v5_0.zzc, this.zzb);
                    }
                }
                String v5_2;
                if (v1_2 == null) {
                    v5_2 = 0;
                } else {
                    v5_2 = 1;
                }
                if (v5_2 == null) {
                    throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                } else {
                    String v5_3 = this.zza;
                    Object v6_2 = v5_3.zza;
                    if (v6_2 == null) {
                        v1_2.zza();
                        throw 0;
                    } else {
                        Object v6_3;
                        if (!com.google.android.gms.internal.measurement.zzka.zza(v1_2.zza(), v6_2)) {
                            v6_3 = 0;
                        } else {
                            v6_3 = com.google.android.gms.internal.measurement.zzjr.zza(v1_2.zza().getContentResolver(), v6_2, com.google.android.gms.internal.measurement.zzkj.zza);
                        }
                        Object v6_5;
                        if (v6_3 == null) {
                            v6_5 = 0;
                        } else {
                            Object v6_4 = v6_3.zze(this.zzb);
                            if (v6_4 == null) {
                            } else {
                                v6_5 = this.zza(v6_4);
                            }
                        }
                        if (v6_5 == null) {
                            if (!v5_3.zzd) {
                                String v1_5 = com.google.android.gms.internal.measurement.zzjy.zza(v1_2.zza()).zzb(this.zzb);
                                if (v1_5 != null) {
                                    v3 = this.zza(v1_5);
                                }
                            }
                            if (v3 != null) {
                                v6_5 = v3;
                            } else {
                                v6_5 = this.zzg;
                            }
                        } else {
                        }
                        if (v2_2.b()) {
                            if (v4_2 != null) {
                                v6_5 = this.zza(v4_2);
                            } else {
                                v6_5 = this.zzg;
                            }
                        }
                        this.zzj = v6_5;
                        this.zzi = v0_1;
                    }
                }
            }
        }
        return this.zzj;
    }
}
