package com.google.android.gms.measurement.internal;
public final class zzmb extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzlu zza;
    private volatile com.google.android.gms.measurement.internal.zzlu zzb;
    private volatile com.google.android.gms.measurement.internal.zzlu zzc;
    private final java.util.Map zzd;
    private com.google.android.gms.internal.measurement.zzdf zze;
    private volatile boolean zzf;
    private volatile com.google.android.gms.measurement.internal.zzlu zzg;
    private com.google.android.gms.measurement.internal.zzlu zzh;
    private boolean zzi;
    private final Object zzj;

    public zzmb(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        super.zzj = new Object();
        super.zzd = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    private final void zzA(com.google.android.gms.measurement.internal.zzlu p5, boolean p6, long p7)
    {
        int v2_1;
        com.google.android.gms.measurement.internal.zzoa v0_0 = this.zzu;
        v0_0.zzw().zzc(v0_0.zzaZ().elapsedRealtime());
        if ((p5 == null) || (!p5.zzd)) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        if ((v0_0.zzh().zzb.zzd(v2_1, p6, p7)) && (p5 != null)) {
            p5.zzd = 0;
        }
        return;
    }

    private final com.google.android.gms.measurement.internal.zzlu zzB(com.google.android.gms.internal.measurement.zzdf p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        Integer v0_1 = Integer.valueOf(p7.zza);
        java.util.Map v1 = this.zzd;
        com.google.android.gms.measurement.internal.zzlu v2_4 = ((com.google.android.gms.measurement.internal.zzlu) v1.get(v0_1));
        if (v2_4 == null) {
            com.google.android.gms.measurement.internal.zzlu v3_1 = new com.google.android.gms.measurement.internal.zzlu(0, this.zzi(p7.zzb, "Activity"), this.zzu.zzk().zzd());
            v1.put(v0_1, v3_1);
            v2_4 = v3_1;
        }
        if (this.zzg == null) {
            return v2_4;
        } else {
            return this.zzg;
        }
    }

    private final void zzy(String p13, com.google.android.gms.measurement.internal.zzlu p14, boolean p15)
    {
        com.google.android.gms.measurement.internal.zzlu v3_1;
        if (this.zzb != null) {
            v3_1 = this.zzb;
        } else {
            v3_1 = this.zzc;
        }
        com.google.android.gms.measurement.internal.zzlu v2;
        if (p14.zzb != null) {
            v2 = p14;
        } else {
            com.google.android.gms.measurement.internal.zzlw v0_0;
            if (p13 == null) {
                v0_0 = 0;
            } else {
                v0_0 = this.zzi(p13, "Activity");
            }
            v2 = new com.google.android.gms.measurement.internal.zzlu(p14.zza, v0_0, p14.zzc, p14.zze, p14.zzf);
        }
        this.zzc = this.zzb;
        this.zzb = v2;
        com.google.android.gms.measurement.internal.zzlw v0_2 = this.zzu;
        v0_2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlw(this, v2, v3_1, v0_2.zzaZ().elapsedRealtime(), p15));
        return;
    }

    private final void zzz(com.google.android.gms.measurement.internal.zzlu p15, com.google.android.gms.measurement.internal.zzlu p16, long p17, boolean p19, android.os.Bundle p20)
    {
        long v7_5;
        this.zzg();
        int v5 = 0;
        if ((p16 != null) && ((p16.zzc == p15.zzc) && ((java.util.Objects.equals(p16.zzb, p15.zzb)) && (java.util.Objects.equals(p16.zza, p15.zza))))) {
            v7_5 = 0;
        } else {
            v7_5 = 1;
        }
        if ((p19 != 0) && (this.zza != null)) {
            v5 = 1;
        }
        if (v7_5 != 0) {
            long v7_7;
            if (p20 == null) {
                v7_7 = new android.os.Bundle();
            } else {
                v7_7 = new android.os.Bundle(p20);
            }
            android.os.Bundle v13 = v7_7;
            com.google.android.gms.measurement.internal.zzpp.zzav(p15, v13, 1);
            if (p16 != null) {
                boolean v4_1 = p16.zza;
                if (v4_1) {
                    v13.putString("_pn", v4_1);
                }
                boolean v4_2 = p16.zzb;
                if (v4_2) {
                    v13.putString("_pc", v4_2);
                }
                v13.putLong("_pi", p16.zzc);
            }
            if (v5 != 0) {
                com.google.android.gms.measurement.internal.zzic v1_5 = this.zzu.zzh().zzb;
                String v9_1 = (p17 - v1_5.zzb);
                v1_5.zzb = p17;
                if (v9_1 > 0) {
                    this.zzu.zzk().zzak(v13, v9_1);
                }
            }
            com.google.android.gms.measurement.internal.zzic v1_9 = this.zzu;
            if (!v1_9.zzc().zzv()) {
                v13.putLong("_mst", 1);
            }
            String v9_3;
            boolean v4_6 = p15.zze;
            if (1 == v4_6) {
                v9_3 = "app";
            } else {
                v9_3 = "auto";
            }
            long v11;
            String v10_0 = v1_9.zzaZ().currentTimeMillis();
            if (!v4_6) {
                v11 = v10_0;
            } else {
                long v7_14 = p15.zzf;
                if (v7_14 != 0) {
                    v11 = v7_14;
                }
            }
            this.zzu.zzj().zzG(v9_3, "_vs", v11, v13);
        }
        if (v5 != 0) {
            this.zzA(this.zza, 1, p17);
        }
        this.zza = p15;
        if (p15.zze) {
            this.zzh = p15;
        }
        this.zzu.zzt().zzG(p15);
        return;
    }

    public final boolean zze()
    {
        return 0;
    }

    public final com.google.android.gms.measurement.internal.zzlu zzh(boolean p1)
    {
        this.zzb();
        this.zzg();
        if (p1 != null) {
            com.google.android.gms.measurement.internal.zzlu v1_1 = this.zza;
            if (v1_1 == null) {
                return this.zzh;
            } else {
                return v1_1;
            }
        } else {
            return this.zza;
        }
    }

    public final String zzi(String p5, String p6)
    {
        if (p5 != null) {
            String v5_1;
            String v5_3 = p5.split("\\.");
            int v6_3 = v5_3.length;
            if (v6_3 <= 0) {
                v5_1 = "";
            } else {
                v5_1 = v5_3[(v6_3 - 1)];
            }
            int v6_5 = this.zzu;
            if (v5_1.length() > v6_5.zzc().zze(0, 0)) {
                v5_1 = v5_1.substring(0, v6_5.zzc().zze(0, 0));
            }
            return v5_1;
        } else {
            return "Activity";
        }
    }

    public final void zzj(android.os.Bundle p13, long p14)
    {
        if (this.zzi) {
            String v3 = p13.getString("screen_name");
            if ((v3 == null) || ((v3.length() > 0) && (v3.length() <= this.zzu.zzc().zze(0, 0)))) {
                String v4_3 = p13.getString("screen_class");
                if ((v4_3 == null) || ((v4_3.length() > 0) && (v4_3.length() <= this.zzu.zzc().zze(0, 0)))) {
                    if (v4_3 == null) {
                        boolean v0_4 = this.zze;
                        if (!v0_4) {
                            v4_3 = "Activity";
                        } else {
                            v4_3 = this.zzi(v0_4.zzb, "Activity");
                        }
                    }
                    boolean v0_6 = this.zzb;
                    if ((this.zzf) && (v0_6)) {
                        this.zzf = 0;
                        com.google.android.gms.measurement.internal.zzlu v2_1 = java.util.Objects.equals(v0_6.zzb, v4_3);
                        boolean vtmp25 = java.util.Objects.equals(v0_6.zza, v3);
                        if ((v2_1 != null) && (vtmp25)) {
                            this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                            return;
                        }
                    }
                    com.google.android.gms.measurement.internal.zzlu v2_2;
                    boolean v0_9 = this.zzu;
                    com.google.android.gms.measurement.internal.zzlu v1_1 = v0_9.zzaV().zzk();
                    if (v3 != null) {
                        v2_2 = v3;
                    } else {
                        v2_2 = "null";
                    }
                    com.google.android.gms.measurement.internal.zzlv v5_6;
                    if (v4_3 != null) {
                        v5_6 = v4_3;
                    } else {
                        v5_6 = "null";
                    }
                    com.google.android.gms.measurement.internal.zzlu v1_3;
                    v1_1.zzc("Logging screen view with name, class", v2_2, v5_6);
                    if (this.zzb != null) {
                        v1_3 = this.zzb;
                    } else {
                        v1_3 = this.zzc;
                    }
                    com.google.android.gms.measurement.internal.zzlu v2_5 = new com.google.android.gms.measurement.internal.zzlu(v3, v4_3, v0_9.zzk().zzd(), 1, p14);
                    this.zzb = v2_5;
                    this.zzc = v1_3;
                    this.zzg = v2_5;
                    v0_9.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlv(this, p13, v2_5, v1_3, v0_9.zzaZ().elapsedRealtime()));
                    return;
                } else {
                    this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(v4_3.length()));
                    return;
                }
            } else {
                this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(v3.length()));
                return;
            }
        } else {
            this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
            return;
        }
    }

    public final void zzk(com.google.android.gms.internal.measurement.zzdf p8, String p9, String p10)
    {
        com.google.android.gms.measurement.internal.zzpp v0_0 = this.zzu;
        if (v0_0.zzc().zzv()) {
            com.google.android.gms.measurement.internal.zzlu v1_5 = this.zzb;
            if (v1_5 != null) {
                java.util.Map v2 = this.zzd;
                Integer v3_0 = Integer.valueOf(p8.zza);
                if (v2.get(v3_0) != null) {
                    if (p10 == null) {
                        p10 = this.zzi(p8.zzb, "Activity");
                    }
                    com.google.android.gms.measurement.internal.zzlu v1_1 = v1_5.zza;
                    long v4_3 = java.util.Objects.equals(v1_5.zzb, p10);
                    com.google.android.gms.measurement.internal.zzlu v1_2 = java.util.Objects.equals(v1_1, p9);
                    if ((v4_3 != 0) && (v1_2 != null)) {
                        v0_0.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
                        return;
                    } else {
                        if ((p9 != 0) && ((p9.length() <= 0) || (p9.length() > v0_0.zzc().zze(0, 0)))) {
                            v0_0.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(p9.length()));
                            return;
                        } else {
                            if ((p10 != null) && ((p10.length() <= 0) || (p10.length() > v0_0.zzc().zze(0, 0)))) {
                                v0_0.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(p10.length()));
                                return;
                            } else {
                                long v4_5;
                                com.google.android.gms.measurement.internal.zzlu v1_8 = v0_0.zzaV().zzk();
                                if (p9 != 0) {
                                    v4_5 = p9;
                                } else {
                                    v4_5 = "null";
                                }
                                v1_8.zzc("Setting current screen to name, class", v4_5, p10);
                                com.google.android.gms.measurement.internal.zzlu v1_10 = new com.google.android.gms.measurement.internal.zzlu(p9, p10, v0_0.zzk().zzd());
                                v2.put(v3_0, v1_10);
                                this.zzy(p8.zzb, v1_10, 1);
                                return;
                            }
                        }
                    }
                } else {
                    v0_0.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
                    return;
                }
            } else {
                v0_0.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
                return;
            }
        } else {
            v0_0.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
    }

    public final com.google.android.gms.measurement.internal.zzlu zzl()
    {
        return this.zzb;
    }

    public final void zzm(com.google.android.gms.internal.measurement.zzdf p6, android.os.Bundle p7)
    {
        if ((this.zzu.zzc().zzv()) && (p7 != null)) {
            java.util.Map v7_2 = p7.getBundle("com.google.app_measurement.screen_service");
            if (v7_2 != null) {
                this.zzd.put(Integer.valueOf(p6.zza), new com.google.android.gms.measurement.internal.zzlu(v7_2.getString("name"), v7_2.getString("referrer_name"), v7_2.getLong("id")));
            }
        }
        return;
    }

    public final void zzn(com.google.android.gms.internal.measurement.zzdf p5)
    {
        this.zzi = 1;
        if (!java.util.Objects.equals(p5, this.zze)) {
            this.zze = p5;
            this.zzf = 0;
            com.google.android.gms.measurement.internal.zzhz v1_1 = this.zzu;
            if (v1_1.zzc().zzv()) {
                this.zzg = 0;
                v1_1.zzaW().zzj(new com.google.android.gms.measurement.internal.zzma(this));
            }
        }
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zzu;
        if (v0_0.zzc().zzv()) {
            this.zzy(p5.zzb, this.zzB(p5), 0);
            Throwable v5_5 = this.zzu.zzw();
            com.google.android.gms.measurement.internal.zzhz v0_2 = v5_5.zzu;
            v0_2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzc(v5_5, v0_2.zzaZ().elapsedRealtime()));
            return;
        } else {
            this.zzb = this.zzg;
            v0_0.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlx(this));
            return;
        }
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf p6)
    {
        this.zzi = 0;
        this.zzf = 1;
        com.google.android.gms.measurement.internal.zzhz v0_3 = this.zzu;
        long v1_3 = v0_3.zzaZ().elapsedRealtime();
        if (v0_3.zzc().zzv()) {
            com.google.android.gms.measurement.internal.zzlu v6_2 = this.zzB(p6);
            this.zzc = this.zzb;
            this.zzb = 0;
            v0_3.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlz(this, v6_2, v1_3));
            return;
        } else {
            this.zzb = 0;
            v0_3.zzaW().zzj(new com.google.android.gms.measurement.internal.zzly(this, v1_3));
            return;
        }
    }

    public final void zzq(com.google.android.gms.internal.measurement.zzdf p5, android.os.Bundle p6)
    {
        if ((this.zzu.zzc().zzv()) && (p6 != null)) {
            String v5_3 = ((com.google.android.gms.measurement.internal.zzlu) this.zzd.get(Integer.valueOf(p5.zza)));
            if (v5_3 != null) {
                android.os.Bundle v0_2 = new android.os.Bundle();
                v0_2.putLong("id", v5_3.zzc);
                v0_2.putString("name", v5_3.zza);
                v0_2.putString("referrer_name", v5_3.zzb);
                p6.putBundle("com.google.app_measurement.screen_service", v0_2);
            }
        }
        return;
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdf p3)
    {
        if (java.util.Objects.equals(this.zze, p3)) {
            this.zze = 0;
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(Integer.valueOf(p3.zza));
            return;
        } else {
            return;
        }
    }

    public final synthetic void zzt(android.os.Bundle p9, com.google.android.gms.measurement.internal.zzlu p10, com.google.android.gms.measurement.internal.zzlu p11, long p12)
    {
        p9.remove("screen_name");
        p9.remove("screen_class");
        this.zzz(p10, p11, p12, 1, this.zzu.zzk().zzF(0, "screen_view", p9, 0, 0));
        return;
    }

    public final synthetic void zzu(com.google.android.gms.measurement.internal.zzlu p8, com.google.android.gms.measurement.internal.zzlu p9, long p10, boolean p12, android.os.Bundle p13)
    {
        this.zzz(p8, p9, p10, p12, 0);
        return;
    }

    public final synthetic void zzv(com.google.android.gms.measurement.internal.zzlu p1, boolean p2, long p3)
    {
        this.zzA(p1, 0, p3);
        return;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzlu zzw()
    {
        return this.zzh;
    }

    public final synthetic void zzx(com.google.android.gms.measurement.internal.zzlu p1)
    {
        this.zzh = 0;
        return;
    }
}
