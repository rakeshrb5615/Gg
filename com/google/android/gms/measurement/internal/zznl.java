package com.google.android.gms.measurement.internal;
public final class zznl extends com.google.android.gms.measurement.internal.zzg {
    private final com.google.android.gms.measurement.internal.zznf zza;
    private com.google.android.gms.measurement.internal.zzgb zzb;
    private volatile Boolean zzc;
    private final com.google.android.gms.measurement.internal.zzay zzd;
    private java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.measurement.internal.zzog zzf;
    private final java.util.List zzg;
    private final com.google.android.gms.measurement.internal.zzay zzh;

    public zznl(com.google.android.gms.measurement.internal.zzic p3)
    {
        super(p3);
        super.zzg = new java.util.ArrayList();
        super.zzf = new com.google.android.gms.measurement.internal.zzog(p3.zzaZ());
        super.zza = new com.google.android.gms.measurement.internal.zznf(super);
        super.zzd = new com.google.android.gms.measurement.internal.zzmm(super, p3);
        super.zzh = new com.google.android.gms.measurement.internal.zzmq(super, p3);
        return;
    }

    private final boolean zzad()
    {
        this.zzu.zzaU();
        return 1;
    }

    private final void zzae()
    {
        this.zzg();
        this.zzf.zza();
        this.zzu.zzc();
        this.zzd.zzb(((Long) com.google.android.gms.measurement.internal.zzfy.zzY.zzb(0)).longValue());
        return;
    }

    private final void zzaf(Runnable p7)
    {
        this.zzg();
        if (!this.zzh()) {
            long v0_2 = this.zzg;
            long v1_2 = ((long) v0_2.size());
            com.google.android.gms.measurement.internal.zzic v3 = this.zzu;
            v3.zzc();
            if (v1_2 < 1000) {
                v0_2.add(p7);
                this.zzh.zzb(60000);
                this.zzI();
                return;
            } else {
                v1.a.s(v3, "Discarding data. Max runnable queue size reached");
                return;
            }
        } else {
            p7.run();
            return;
        }
    }

    private final void zzag()
    {
        this.zzg();
        RuntimeException v1_4 = this.zzg;
        this.zzu.zzaV().zzk().zzb("Processing queued up service tasks", Integer.valueOf(v1_4.size()));
        com.google.android.gms.measurement.internal.zzay v0_1 = v1_4.iterator();
        while (v0_1.hasNext()) {
            try {
                ((Runnable) v0_1.next()).run();
            } catch (RuntimeException v1_3) {
                this.zzu.zzaV().zzb().zzb("Task exception while flushing queue", v1_3);
            }
        }
        this.zzg.clear();
        this.zzh.zzd();
        return;
    }

    private final com.google.android.gms.measurement.internal.zzr zzah(boolean p6)
    {
        String v0_0 = this.zzu;
        v0_0.zzaU();
        com.google.android.gms.measurement.internal.zzgi v1_1 = this.zzu.zzv();
        String v2_4 = 0;
        if (p6 != null) {
            String v6_8 = v0_0.zzaV().zzu;
            if (v6_8.zzd().zzb != null) {
                String v6_3 = v6_8.zzd().zzb.zzb();
                if ((v6_3 != null) && (v6_3 != com.google.android.gms.measurement.internal.zzhh.zza)) {
                    String v0_5 = String.valueOf(v6_3.second);
                    String v6_5 = ((String) v6_3.first);
                    v2_4 = v1.a.o(new StringBuilder(((v0_5.length() + 1) + String.valueOf(v6_5).length())), v0_5, ":", v6_5);
                }
            }
        }
        return v1_1.zzh(v2_4);
    }

    public final void zzA(com.google.android.gms.measurement.internal.zzpl p4)
    {
        this.zzg();
        this.zzb();
        this.zzad();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmg(this, this.zzah(1), this.zzu.zzm().zzj(p4), p4));
        return;
    }

    public final void zzB()
    {
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzr v0_1 = this.zzah(0);
        this.zzad();
        this.zzu.zzm().zzh();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmh(this, v0_1));
        return;
    }

    public final void zzC(java.util.concurrent.atomic.AtomicReference p3)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmi(this, p3, this.zzah(0)));
        return;
    }

    public final void zzD(com.google.android.gms.internal.measurement.zzcu p3)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmj(this, this.zzah(0), p3));
        return;
    }

    public final void zzE()
    {
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzr v1 = this.zzah(1);
        this.zzad();
        this.zzu.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbb);
        this.zzu.zzm().zzn();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmk(this, v1, 1));
        return;
    }

    public final void zzF()
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzml(this, this.zzah(1)));
        return;
    }

    public final void zzG(com.google.android.gms.measurement.internal.zzlu p2)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmn(this, p2));
        return;
    }

    public final void zzH(android.os.Bundle p8)
    {
        int v4;
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzbe v5_1 = new com.google.android.gms.measurement.internal.zzbe(p8);
        this.zzad();
        if ((!this.zzu.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbb)) || (!this.zzu.zzm().zzl(v5_1))) {
            v4 = 0;
        } else {
            v4 = 1;
        }
        this.zzaf(new com.google.android.gms.measurement.internal.zzmo(this, 1, this.zzah(0), v4, v5_1, p8));
        return;
    }

    public final void zzI()
    {
        this.zzg();
        this.zzb();
        if (!this.zzh()) {
            if (this.zzK()) {
                this.zza.zzc();
                return;
            } else {
                com.google.android.gms.measurement.internal.zznf v0_0 = this.zzu;
                if (!v0_0.zzc().zzE()) {
                    v0_0.zzaU();
                    android.content.Intent v1_4 = v0_0.zzaY().getPackageManager().queryIntentServices(new android.content.Intent().setClassName(v0_0.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if ((v1_4 == null) || (v1_4.isEmpty())) {
                        v1.a.s(v0_0, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    } else {
                        android.content.Intent v1_8 = new android.content.Intent("com.google.android.gms.measurement.START");
                        android.content.Context v3_2 = v0_0.zzaY();
                        v0_0.zzaU();
                        v1_8.setComponent(new android.content.ComponentName(v3_2, "com.google.android.gms.measurement.AppMeasurementService"));
                        this.zza.zza(v1_8);
                        return;
                    }
                }
            }
        }
        return;
    }

    public final Boolean zzJ()
    {
        return this.zzc;
    }

    public final boolean zzK()
    {
        this.zzg();
        this.zzb();
        if (this.zzc == null) {
            String v1_5;
            this.zzg();
            this.zzb();
            android.content.SharedPreferences$Editor v0_7 = this.zzu;
            String v1_10 = v0_7.zzd();
            v1_10.zzg();
            Integer v4_0 = 0;
            if (v1_10.zzd().contains("use_service")) {
                v1_5 = Boolean.valueOf(v1_10.zzd().getBoolean("use_service", 0));
            } else {
                v1_5 = 0;
            }
            String v2_0 = 1;
            if ((v1_5 == null) || (!v1_5.booleanValue())) {
                v0_7.zzaU();
                if (this.zzu.zzv().zzo() != 1) {
                    v0_7.zzaV().zzk().zza("Checking service availability");
                    String v5_7 = v0_7.zzk().zzai(12451000);
                    if (v5_7 == null) {
                        v0_7.zzaV().zzk().zza("Service available");
                        v4_0 = 1;
                    } else {
                        if (v5_7 == 1) {
                            v0_7.zzaV().zzk().zza("Service missing");
                        } else {
                            if (v5_7 == 2) {
                                v0_7.zzaV().zzj().zza("Service container out of date");
                                if (v0_7.zzk().zzah() >= 17443) {
                                    if (v1_5 != null) {
                                        v2_0 = 0;
                                    }
                                    v4_0 = v2_0;
                                    v2_0 = 0;
                                }
                            } else {
                                if (v5_7 == 3) {
                                    v1.a.v(v0_7, "Service disabled");
                                } else {
                                    if (v5_7 == 9) {
                                        v1.a.v(v0_7, "Service invalid");
                                    } else {
                                        if (v5_7 == 18) {
                                            v1.a.v(v0_7, "Service updating");
                                        } else {
                                            v0_7.zzaV().zze().zzb("Unexpected service status", Integer.valueOf(v5_7));
                                        }
                                    }
                                }
                                v2_0 = 0;
                            }
                        }
                    }
                }
                if ((v4_0 != null) || (!v0_7.zzc().zzE())) {
                    if (v2_0 != null) {
                        android.content.SharedPreferences$Editor v0_0 = v0_7.zzd();
                        v0_0.zzg();
                        android.content.SharedPreferences$Editor v0_2 = v0_0.zzd().edit();
                        v0_2.putBoolean("use_service", v4_0);
                        v0_2.apply();
                    }
                } else {
                    v1.a.s(v0_7, "No way to upload. Consider using the full version of Analytics");
                }
                v2_0 = v4_0;
            }
            this.zzc = Boolean.valueOf(v2_0);
        }
        return this.zzc.booleanValue();
    }

    public final void zzL(com.google.android.gms.measurement.internal.zzgb p1)
    {
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzb = p1;
        this.zzae();
        this.zzag();
        return;
    }

    public final void zzM()
    {
        this.zzg();
        this.zzb();
        int v0_1 = this.zza;
        v0_1.zzb();
        try {
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zzu.zzaY(), v0_1);
        } catch (IllegalArgumentException) {
        }
        this.zzb = 0;
        return;
    }

    public final void zzN(com.google.android.gms.internal.measurement.zzcu p4, com.google.android.gms.measurement.internal.zzbg p5, String p6)
    {
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzmp v0_1 = this.zzu;
        if (v0_1.zzk().zzai(12451000) == 0) {
            this.zzaf(new com.google.android.gms.measurement.internal.zzmp(this, p5, p6, p4));
            return;
        } else {
            v0_1.zzaV().zze().zza("Not bundling data. Service unavailable or out of date");
            byte[] v6_3 = new byte[0];
            v0_1.zzk().zzao(p4, v6_3);
            return;
        }
    }

    public final boolean zzO()
    {
        this.zzg();
        this.zzb();
        if (!this.zzK()) {
            return 1;
        } else {
            if (this.zzu.zzk().zzah() < ((Integer) com.google.android.gms.measurement.internal.zzfy.zzaJ.zzb(0)).intValue()) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final boolean zzP()
    {
        this.zzg();
        this.zzb();
        if (!this.zzK()) {
            return 1;
        } else {
            if (this.zzu.zzk().zzah() < 241200) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final synthetic void zzQ()
    {
        android.os.RemoteException v0_0 = this.zzb;
        if (v0_0 != null) {
            try {
                com.google.android.gms.measurement.internal.zzgs v1_5 = this.zzah(0);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_5);
                v0_0.zzy(v1_5);
                this.zzae();
                return;
            } catch (android.os.RemoteException v0_2) {
                this.zzu.zzaV().zzb().zzb("Failed to send storage consent settings to the service", v0_2);
                return;
            }
        } else {
            v1.a.s(this.zzu, "Failed to send storage consent settings to service");
            return;
        }
    }

    public final synthetic void zzR()
    {
        android.os.RemoteException v0_0 = this.zzb;
        if (v0_0 != null) {
            try {
                com.google.android.gms.measurement.internal.zzgs v1_5 = this.zzah(0);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_5);
                v0_0.zzz(v1_5);
                this.zzae();
                return;
            } catch (android.os.RemoteException v0_2) {
                this.zzu.zzaV().zzb().zzb("Failed to send Dma consent settings to the service", v0_2);
                return;
            }
        } else {
            v1.a.s(this.zzu, "Failed to send Dma consent settings to service");
            return;
        }
    }

    public final synthetic void zzS(java.util.concurrent.atomic.AtomicReference p3, com.google.android.gms.measurement.internal.zzr p4, android.os.Bundle p5)
    {
        try {
            String v0_0 = this.zzb;
        } catch (com.google.android.gms.measurement.internal.zzgs v4_2) {
            this.zzu.zzaV().zzb().zzb("Failed to request trigger URIs; remote exception", v4_2);
            p3.notifyAll();
            return;
        } catch (com.google.android.gms.measurement.internal.zzgs v4_3) {
            throw v4_3;
        }
        if (v0_0 != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
            v0_0.zzD(p4, p5, new com.google.android.gms.measurement.internal.zzme(this, p3));
            this.zzae();
            return;
        } else {
            this.zzu.zzaV().zzb().zza("Failed to request trigger URIs; not connected to service");
            return;
        }
    }

    public final synthetic void zzT(java.util.concurrent.atomic.AtomicReference p3, com.google.android.gms.measurement.internal.zzr p4, com.google.android.gms.measurement.internal.zzoo p5)
    {
        try {
            String v0_0 = this.zzb;
        } catch (com.google.android.gms.measurement.internal.zzgs v4_2) {
            this.zzu.zzaV().zzb().zzb("[sgtm] Failed to get upload batches; remote exception", v4_2);
            p3.notifyAll();
            return;
        } catch (com.google.android.gms.measurement.internal.zzgs v4_3) {
            throw v4_3;
        }
        if (v0_0 != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
            v0_0.zzB(p4, p5, new com.google.android.gms.measurement.internal.zzmf(this, p3));
            this.zzae();
            return;
        } else {
            this.zzu.zzaV().zzb().zza("[sgtm] Failed to get upload batches; not connected to service");
            return;
        }
    }

    public final synthetic void zzU(com.google.android.gms.measurement.internal.zzr p4, com.google.android.gms.measurement.internal.zzaf p5)
    {
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzb;
        if (v0_0 != null) {
            try {
                v0_0.zzC(p4, p5);
                this.zzae();
                return;
            } catch (android.os.RemoteException v4_2) {
                this.zzu.zzaV().zzb().zzc("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(p5.zza), v4_2);
                return;
            }
        } else {
            v1.a.s(this.zzu, "[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
    }

    public final synthetic void zzV()
    {
        this.zzae();
        return;
    }

    public final synthetic void zzW(android.content.ComponentName p3)
    {
        this.zzg();
        if (this.zzb != null) {
            this.zzb = 0;
            this.zzu.zzaV().zzk().zzb("Disconnected from device MeasurementService", p3);
            this.zzg();
            this.zzI();
        }
        return;
    }

    public final synthetic void zzX()
    {
        this.zzag();
        return;
    }

    public final synthetic com.google.android.gms.measurement.internal.zznf zzY()
    {
        return this.zza;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzgb zzZ()
    {
        return this.zzb;
    }

    public final synthetic void zzaa(com.google.android.gms.measurement.internal.zzgb p1)
    {
        this.zzb = 0;
        return;
    }

    public final synthetic java.util.concurrent.ScheduledExecutorService zzab()
    {
        return this.zze;
    }

    public final synthetic void zzac(java.util.concurrent.ScheduledExecutorService p1)
    {
        this.zze = p1;
        return;
    }

    public final boolean zze()
    {
        return 0;
    }

    public final boolean zzh()
    {
        this.zzg();
        this.zzb();
        if (this.zzb == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzi()
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmr(this, this.zzah(1)));
        return;
    }

    public final void zzj(boolean p2)
    {
        this.zzg();
        this.zzb();
        if (this.zzO()) {
            this.zzaf(new com.google.android.gms.measurement.internal.zzms(this, this.zzah(0)));
        }
        return;
    }

    public final void zzk(boolean p1)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zznk(this));
        return;
    }

    public final void zzl()
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzng(this));
        return;
    }

    public final void zzm(com.google.android.gms.measurement.internal.zzgb p59, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable p60, com.google.android.gms.measurement.internal.zzr p61)
    {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable v3_10 = p60;
        this.zzg();
        this.zzb();
        this.zzad();
        com.google.android.gms.measurement.internal.zzgs v4_19 = this.zzu;
        v4_19.zzc();
        String v6_7 = 100;
        android.os.RemoteException v0_21 = p61;
        int v8_0 = 100;
        int v7 = 0;
        while ((v7 < 1001) && (v8_0 == v6_7)) {
            int v8_1 = this.zzu;
            java.util.ArrayList v9_2 = new java.util.ArrayList();
            int v8_3 = v8_1.zzm().zzm(v6_7);
            if (v8_3 == 0) {
                v8_0 = 0;
            } else {
                v9_2.addAll(v8_3);
                v8_0 = v8_3.size();
            }
            if ((v3_10 != null) && (v8_0 < v6_7)) {
                v9_2.add(new com.google.android.gms.measurement.internal.zzgk(v3_10, v0_21.zzc, v0_21.zzj));
            }
            int v12_2 = 0;
            String v10_2 = v4_19.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaO);
            long v11_2 = v9_2.size();
            int v13_0 = 0;
            while (v13_0 < v11_2) {
                com.google.android.gms.measurement.internal.zzgk v56;
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable v3_9;
                com.google.android.gms.measurement.internal.zzic v57;
                long v14_4 = ((com.google.android.gms.measurement.internal.zzgk) v9_2.get(v13_0));
                com.google.android.gms.measurement.internal.zzbe v15_4 = v14_4.zza;
                String v6_8 = com.google.android.gms.measurement.internal.zzfy.zzbb;
                if (!v4_19.zzc().zzp(v12_2, v6_8)) {
                    v57 = v4_19;
                    v56 = v13_0;
                    v3_9 = v0_21;
                } else {
                    String v5_5 = v14_4.zzb;
                    if (android.text.TextUtils.isEmpty(v5_5)) {
                    } else {
                        v56 = v13_0;
                        v57 = v4_19;
                        v3_9 = new com.google.android.gms.measurement.internal.zzr(v0_21.zza, v0_21.zzb, v5_5, v14_4.zzc, v0_21.zzd, v0_21.zze, v0_21.zzf, v0_21.zzg, v0_21.zzh, v0_21.zzi, v0_21.zzk, v0_21.zzl, v0_21.zzm, v0_21.zzn, v0_21.zzo, v0_21.zzp, v0_21.zzq, v0_21.zzr, v0_21.zzs, v0_21.zzt, v0_21.zzu, v0_21.zzv, v0_21.zzw, v0_21.zzx, v0_21.zzy, v0_21.zzz, v0_21.zzA, v0_21.zzB, v0_21.zzC, v0_21.zzD, v0_21.zzE);
                    }
                }
                String v5_0;
                if (!(v15_4 instanceof com.google.android.gms.measurement.internal.zzbg)) {
                    if (!(v15_4 instanceof com.google.android.gms.measurement.internal.zzpl)) {
                        if (!(v15_4 instanceof com.google.android.gms.measurement.internal.zzah)) {
                            android.os.RemoteException v0_4 = this.zzu;
                            v5_0 = 0;
                            if ((!v0_4.zzc().zzp(0, v6_8)) || (!(v15_4 instanceof com.google.android.gms.measurement.internal.zzbe))) {
                                v1.a.s(v0_4, "Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    p59.zzu(((com.google.android.gms.measurement.internal.zzbe) v15_4).zzf(), v3_9);
                                } catch (android.os.RemoteException v0_6) {
                                    this.zzu.zzaV().zzb().zzb("Failed to send default event parameters to the service", v0_6);
                                }
                            }
                        } else {
                            try {
                                p59.zzn(((com.google.android.gms.measurement.internal.zzah) v15_4), v3_9);
                            } catch (android.os.RemoteException v0_7) {
                                this.zzu.zzaV().zzb().zzb("Failed to send conditional user property to the service", v0_7);
                            }
                            v5_0 = 0;
                        }
                    } else {
                        try {
                            p59.zzf(((com.google.android.gms.measurement.internal.zzpl) v15_4), v3_9);
                        } catch (android.os.RemoteException v0_8) {
                            this.zzu.zzaV().zzb().zzb("Failed to send user property to the service", v0_8);
                        }
                    }
                } else {
                    int v12_0;
                    long v19_1;
                    if (v10_2 == null) {
                        v12_0 = 0;
                        v19_1 = 0;
                        try {
                            p59.zze(((com.google.android.gms.measurement.internal.zzbg) v15_4), v3_9);
                        } catch (android.os.RemoteException v0_10) {
                        }
                        if (v10_2 == null) {
                        } else {
                            v57.zzaV().zzk().zza("Logging telemetry for logEvent from database");
                            android.os.RemoteException v0_14 = this.zzu;
                            com.google.android.gms.measurement.internal.zzgq.zza(v0_14).zzb(36301, 0, v19_1, v0_14.zzaZ().currentTimeMillis(), ((int) (v0_14.zzaZ().elapsedRealtime() - v12_0)));
                        }
                    } else {
                        try {
                            android.os.RemoteException v0_9 = this.zzu;
                            try {
                                v19_1 = v0_9.zzaZ().currentTimeMillis();
                                v12_0 = v0_9.zzaZ().elapsedRealtime();
                            } catch (android.os.RemoteException v0_10) {
                                v19_1 = v12_0;
                                v12_0 = 0;
                            }
                        } catch (android.os.RemoteException v0_10) {
                            v12_0 = 0;
                            v19_1 = 0;
                        }
                    }
                    this.zzu.zzaV().zzb().zzb("Failed to send event to the service", v0_10);
                    if (v10_2 == null) {
                    } else {
                        if (v19_1 == 0) {
                        } else {
                            android.os.RemoteException v0_18 = this.zzu;
                            com.google.android.gms.measurement.internal.zzgq.zza(v0_18).zzb(36301, 13, v19_1, v0_18.zzaZ().currentTimeMillis(), ((int) (v0_18.zzaZ().elapsedRealtime() - v12_0)));
                        }
                    }
                }
                v13_0 = (v56 + 1);
                v0_21 = v3_9;
                v12_2 = v5_0;
                v4_19 = v57;
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable v3 = p60;
            }
            v7++;
            v3_10 = p60;
            v6_7 = 100;
        }
        return;
    }

    public final void zzn(com.google.android.gms.measurement.internal.zzbg p9, String p10)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9);
        this.zzg();
        this.zzb();
        this.zzad();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmt(this, 1, this.zzah(1), this.zzu.zzm().zzi(p9), p9, p10));
        return;
    }

    public final void zzp(com.google.android.gms.measurement.internal.zzah p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9);
        this.zzg();
        this.zzb();
        this.zzu.zzaU();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmu(this, 1, this.zzah(1), this.zzu.zzm().zzk(p9), new com.google.android.gms.measurement.internal.zzah(p9), p9));
        return;
    }

    public final void zzq(java.util.concurrent.atomic.AtomicReference p8, String p9, String p10, String p11)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmv(this, p8, 0, p10, p11, this.zzah(0)));
        return;
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzcu p8, String p9, String p10)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmw(this, p9, p10, this.zzah(0), p8));
        return;
    }

    public final void zzt(java.util.concurrent.atomic.AtomicReference p9, String p10, String p11, String p12, boolean p13)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmx(this, p9, 0, p11, p12, this.zzah(0), p13));
        return;
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzcu p9, String p10, String p11, boolean p12)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmc(this, p10, p11, this.zzah(0), p12, p9));
        return;
    }

    public final void zzv(java.util.concurrent.atomic.AtomicReference p3, boolean p4)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzmd(this, p3, this.zzah(0), p4));
        return;
    }

    public final void zzw(java.util.concurrent.atomic.AtomicReference p3, android.os.Bundle p4)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zznh(this, p3, this.zzah(0), p4));
        return;
    }

    public final void zzx(java.util.concurrent.atomic.AtomicReference p3, com.google.android.gms.measurement.internal.zzoo p4)
    {
        this.zzg();
        this.zzb();
        this.zzaf(new com.google.android.gms.measurement.internal.zzni(this, p3, this.zzah(0), p4));
        return;
    }

    public final void zzy(com.google.android.gms.measurement.internal.zzaf p3)
    {
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzr v0_1 = this.zzah(1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        this.zzaf(new com.google.android.gms.measurement.internal.zznj(this, v0_1, p3));
        return;
    }

    public final com.google.android.gms.measurement.internal.zzao zzz()
    {
        this.zzg();
        this.zzb();
        android.os.RemoteException v0_2 = this.zzb;
        if (v0_2 != null) {
            com.google.android.gms.measurement.internal.zzgs v2_5 = this.zzah(0);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_5);
            try {
                android.os.RemoteException v0_0 = v0_2.zzw(v2_5);
                this.zzae();
                return v0_0;
            } catch (android.os.RemoteException v0_1) {
                this.zzu.zzaV().zzb().zzb("Failed to get consents; remote exception", v0_1);
                return 0;
            }
        } else {
            this.zzI();
            this.zzu.zzaV().zzj().zza("Failed to get consents; not connected to service yet.");
            return 0;
        }
    }
}
