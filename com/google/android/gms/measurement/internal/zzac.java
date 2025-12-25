package com.google.android.gms.measurement.internal;
final class zzac extends com.google.android.gms.measurement.internal.zzab {
    final synthetic com.google.android.gms.measurement.internal.zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    public zzac(com.google.android.gms.measurement.internal.zzad p1, String p2, int p3, com.google.android.gms.internal.measurement.zzfn p4)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2, p3);
        super.zzh = p4;
        return;
    }

    public final int zza()
    {
        return this.zzh.zzb();
    }

    public final boolean zzb()
    {
        return 1;
    }

    public final boolean zzc()
    {
        return 0;
    }

    public final boolean zzd(Long p13, Long p14, com.google.android.gms.internal.measurement.zziu p15, boolean p16)
    {
        long v3_2;
        com.google.android.gms.internal.measurement.zzpu.zza();
        boolean v0_8 = this.zza.zzu;
        boolean v1_1 = v0_8.zzc().zzp(this.zzb, com.google.android.gms.measurement.internal.zzfy.zzaD);
        com.google.android.gms.internal.measurement.zzfn v2_1 = this.zzh;
        long v3_0 = v2_1.zze();
        Boolean v4_3 = v2_1.zzf();
        boolean v5 = v2_1.zzh();
        if ((v3_0 == 0) && ((v4_3 == null) && (!v5))) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        Boolean v4_2 = 0;
        if ((!p16) || (v3_2 != 0)) {
            com.google.android.gms.measurement.internal.zzgs v8_5 = v2_1.zzd();
            String v9_6 = v8_5.zzf();
            if (!p15.zzf()) {
                if (!p15.zzj()) {
                    if (!p15.zzd()) {
                        v0_8.zzaV().zze().zzb("User property has no value, property", v0_8.zzl().zzc(p15.zzc()));
                    } else {
                        if (v8_5.zza()) {
                            v4_2 = com.google.android.gms.measurement.internal.zzab.zze(com.google.android.gms.measurement.internal.zzab.zzf(p15.zze(), v8_5.zzb(), v0_8.zzaV()), v9_6);
                        } else {
                            if (v8_5.zzc()) {
                                if (!com.google.android.gms.measurement.internal.zzpk.zzm(p15.zze())) {
                                    v0_8.zzaV().zze().zzc("Invalid user property value for Numeric number filter. property, value", v0_8.zzl().zzc(p15.zzc()), p15.zze());
                                } else {
                                    v4_2 = com.google.android.gms.measurement.internal.zzab.zze(com.google.android.gms.measurement.internal.zzab.zzi(p15.zze(), v8_5.zzd()), v9_6);
                                }
                            } else {
                                v0_8.zzaV().zze().zzb("No string or number filter defined. property", v0_8.zzl().zzc(p15.zzc()));
                            }
                        }
                    }
                } else {
                    if (v8_5.zzc()) {
                        v4_2 = com.google.android.gms.measurement.internal.zzab.zze(com.google.android.gms.measurement.internal.zzab.zzh(p15.zzk(), v8_5.zzd()), v9_6);
                    } else {
                        v0_8.zzaV().zze().zzb("No number filter for double property. property", v0_8.zzl().zzc(p15.zzc()));
                    }
                }
            } else {
                if (v8_5.zzc()) {
                    v4_2 = com.google.android.gms.measurement.internal.zzab.zze(com.google.android.gms.measurement.internal.zzab.zzg(p15.zzg(), v8_5.zzd()), v9_6);
                } else {
                    v0_8.zzaV().zze().zzb("No number filter for long property. property", v0_8.zzl().zzc(p15.zzc()));
                }
            }
            com.google.android.gms.measurement.internal.zzgs v8_4;
            boolean v0_2 = v0_8.zzaV().zzk();
            if (v4_2 != null) {
                v8_4 = v4_2;
            } else {
                v8_4 = "null";
            }
            v0_2.zzb("Property filter result", v8_4);
            if (v4_2 != null) {
                this.zzd = Boolean.TRUE;
                if ((v5) && (!v4_2.booleanValue())) {
                    return 1;
                } else {
                    if ((!p16) || (v2_1.zze())) {
                        this.zze = v4_2;
                    }
                    if ((v4_2.booleanValue()) && ((v3_2 != 0) && (p15.zza()))) {
                        long v3_1 = p15.zzb();
                        if (p13 != null) {
                            v3_1 = p13.longValue();
                        }
                        if ((v1_1) && ((v2_1.zze()) && ((!v2_1.zzf()) && (p14 != null)))) {
                            v3_1 = p14.longValue();
                        }
                        if (!v2_1.zzf()) {
                            this.zzf = Long.valueOf(v3_1);
                        } else {
                            this.zzg = Long.valueOf(v3_1);
                        }
                    }
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            Long v13_7 = v0_8.zzaV().zzk();
            Integer v14_2 = Integer.valueOf(this.zzc);
            if (v2_1.zza()) {
                v4_2 = Integer.valueOf(v2_1.zzb());
            }
            v13_7.zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", v14_2, v4_2);
            return 1;
        }
    }
}
