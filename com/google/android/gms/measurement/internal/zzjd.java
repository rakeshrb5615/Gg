package com.google.android.gms.measurement.internal;
public final class zzjd extends com.google.android.gms.measurement.internal.zzga {
    private final com.google.android.gms.measurement.internal.zzpg zza;
    private Boolean zzb;
    private String zzc;

    public zzjd(com.google.android.gms.measurement.internal.zzpg p1, String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zza = p1;
        this.zzc = 0;
        return;
    }

    private final void zzM(com.google.android.gms.measurement.internal.zzbg p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzZ();
        v0.zzF(p2, p3);
        return;
    }

    private final void zzN(com.google.android.gms.measurement.internal.zzr p2, boolean p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.measurement.internal.zzpp v3_0 = p2.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_0);
        this.zzO(v3_0, 0);
        this.zza.zzt().zzA(p2.zzb);
        return;
    }

    private final void zzO(String p5, boolean p6)
    {
        if (android.text.TextUtils.isEmpty(p5)) {
            this.zza.zzaV().zzb().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        } else {
            if (!p6) {
                if ((this.zzc == null) && (com.google.android.gms.common.GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaY(), android.os.Binder.getCallingUid(), p5))) {
                    this.zzc = p5;
                }
                if (!p5.equals(this.zzc)) {
                    int v1_5 = new StringBuilder("Unknown calling package name \'");
                    v1_5.append(p5);
                    v1_5.append("\'.");
                    throw new SecurityException(v1_5.toString());
                }
            } else {
                if (this.zzb == null) {
                    int v1_2 = 1;
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        boolean v6_4 = this.zza;
                        if (!com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(v6_4.zzaY(), android.os.Binder.getCallingUid())) {
                            if (!com.google.android.gms.common.GoogleSignatureVerifier.getInstance(v6_4.zzaY()).isUidGoogleSigned(android.os.Binder.getCallingUid())) {
                                v1_2 = 0;
                            } else {
                            }
                        }
                    }
                    this.zzb = Boolean.valueOf(v1_2);
                }
                if (!this.zzb.booleanValue()) {
                }
            }
            return;
        }
    }

    public final void zzA(com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zzN(p2, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zzif(this, p2));
        return;
    }

    public final void zzB(com.google.android.gms.measurement.internal.zzr p3, com.google.android.gms.measurement.internal.zzoo p4, com.google.android.gms.measurement.internal.zzgh p5)
    {
        this.zzN(p3, 0);
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zziz(this, ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.zza)), p4, p5));
        return;
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzr p2, com.google.android.gms.measurement.internal.zzaf p3)
    {
        this.zzN(p2, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zzja(this, p2, p3));
        return;
    }

    public final void zzD(com.google.android.gms.measurement.internal.zzr p8, android.os.Bundle p9, com.google.android.gms.measurement.internal.zzge p10)
    {
        this.zzN(p8, 0);
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zziy(this, p8, p9, p10, ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p8.zza))));
        return;
    }

    public final void zzE(Runnable p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zza;
        if (!v0_0.zzaW().zze()) {
            v0_0.zzaW().zzl(p3);
            return;
        } else {
            p3.run();
            return;
        }
    }

    public final synthetic void zzF(com.google.android.gms.measurement.internal.zzr p2)
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzZ();
        v0.zzv(p2);
        return;
    }

    public final synthetic void zzG(com.google.android.gms.measurement.internal.zzr p2)
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzZ();
        v0.zzw(p2);
        return;
    }

    public final synthetic void zzH(com.google.android.gms.measurement.internal.zzr p2, android.os.Bundle p3, com.google.android.gms.measurement.internal.zzge p4, String p5)
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzZ();
        try {
            p4.zze(v0.zzaq(p2, p3));
            return;
        } catch (android.os.RemoteException v2_2) {
            this.zza.zzaV().zzb().zzc("Failed to return trigger URIs for app", p5, v2_2);
            return;
        }
    }

    public final synthetic void zzI(String p11, com.google.android.gms.measurement.internal.zzoo p12, com.google.android.gms.measurement.internal.zzgh p13)
    {
        String v0_0 = this.zza;
        v0_0.zzZ();
        v0_0.zzaW().zzg();
        v0_0.zzu();
        android.os.RemoteException v12_1 = v0_0.zzj().zzC(p11, p12, ((Integer) com.google.android.gms.measurement.internal.zzfy.zzA.zzb(0)).intValue());
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        android.os.RemoteException v12_2 = v12_1.iterator();
        while (v12_2.hasNext()) {
            com.google.android.gms.measurement.internal.zzgs v2_10 = ((com.google.android.gms.measurement.internal.zzpj) v12_2.next());
            if (v0_0.zzO(p11, v2_10.zze())) {
                String v4_11 = v2_10.zzi();
                if ((v4_11 > null) && ((v4_11 > ((Integer) com.google.android.gms.measurement.internal.zzfy.zzy.zzb(0)).intValue()) || (v0_0.zzaZ().currentTimeMillis() < (v2_10.zzh() + Math.min((((Long) com.google.android.gms.measurement.internal.zzfy.zzw.zzb(0)).longValue() * (1 << (v4_11 - 1))), ((Long) com.google.android.gms.measurement.internal.zzfy.zzx.zzb(0)).longValue()))))) {
                    v0_0.zzaV().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", p11, Long.valueOf(v2_10.zzc()), Long.valueOf(v2_10.zzh()));
                } else {
                    com.google.android.gms.measurement.internal.zzgs v2_1 = v2_10.zzb();
                    try {
                        String v4_2 = ((com.google.android.gms.internal.measurement.zzhz) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), v2_1.zzb));
                        com.google.android.gms.measurement.internal.zzpk v5_2 = 0;
                    } catch (com.google.android.gms.internal.measurement.zzmr) {
                        v0_0.zzaV().zze().zzb("Failed to parse queued batch. appId", p11);
                    }
                    while (v5_2 < v4_2.zzb()) {
                        int v6_6 = ((com.google.android.gms.internal.measurement.zzic) v4_2.zzc(v5_2).zzcl());
                        v6_6.zzs(v0_0.zzaZ().currentTimeMillis());
                        v4_2.zzd(v5_2, v6_6);
                        v5_2++;
                    }
                    v2_1.zzb = ((com.google.android.gms.internal.measurement.zzib) v4_2.zzbc()).zzcc();
                    if (android.util.Log.isLoggable(v0_0.zzaV().zzn(), 2)) {
                        v2_1.zzg = v0_0.zzp().zzi(((com.google.android.gms.internal.measurement.zzib) v4_2.zzbc()));
                    }
                    v1_1.add(v2_1);
                }
            } else {
                v0_0.zzaV().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", p11, Long.valueOf(v2_10.zzc()), v2_10.zze());
            }
        }
        android.os.RemoteException v12_4 = new com.google.android.gms.measurement.internal.zzoq(v1_1);
        try {
            p13.zze(v12_4);
            this.zza.zzaV().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", p11, Integer.valueOf(v12_4.zza.size()));
            return;
        } catch (android.os.RemoteException v12_8) {
            this.zza.zzaV().zzb().zzc("[sgtm] Failed to return upload batches for app", p11, v12_8);
            return;
        }
    }

    public final synthetic void zzJ(com.google.android.gms.measurement.internal.zzr p2, com.google.android.gms.measurement.internal.zzaf p3)
    {
        com.google.android.gms.measurement.internal.zzpg v0 = this.zza;
        v0.zzZ();
        v0.zzar(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zza)), p3);
        return;
    }

    public final synthetic void zzK(android.os.Bundle p14, String p15, com.google.android.gms.measurement.internal.zzr p16)
    {
        com.google.android.gms.measurement.internal.zzav v0_0 = this.zza;
        Long v1_9 = v0_0.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaV);
        if ((!p14.isEmpty()) || (v1_9 == null)) {
            com.google.android.gms.measurement.internal.zzav v12 = v0_0.zzj();
            v12.zzg();
            v12.zzaw();
            com.google.android.gms.measurement.internal.zzav v0_5 = v12.zzg.zzp().zzh(new com.google.android.gms.measurement.internal.zzbb(v12.zzu, "", p15, "dep", 0, 0, p14)).zzcc();
            Long v1_6 = v12.zzu;
            v1_6.zzaV().zzk().zzc("Saving default event parameters, appId, data size", p15, Integer.valueOf(v0_5.length));
            String v2_6 = new android.content.ContentValues();
            v2_6.put("app_id", p15);
            v2_6.put("parameters", v0_5);
            try {
                if (v12.zze().insertWithOnConflict("default_event_params", 0, v2_6, 5) == -1) {
                    v1_6.zzaV().zzb().zzb("Failed to insert default event parameters (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p15));
                }
            } catch (com.google.android.gms.measurement.internal.zzav v0_8) {
                v12.zzu.zzaV().zzb().zzc("Error storing default event parameters. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p15), v0_8);
            }
            com.google.android.gms.measurement.internal.zzav v0_11 = this.zza;
            String v2_11 = p16.zzD;
            if (v0_11.zzj().zzV(p15, v2_11)) {
                v0_11.zzj().zzW(p15, Long.valueOf(v2_11), 0, p14);
            }
            return;
        } else {
            Long v1_15 = this.zza.zzj();
            v1_15.zzg();
            v1_15.zzaw();
            try {
                v1_15.zze().execSQL("delete from default_event_params where app_id=?", new String[] {p15}));
                return;
            } catch (com.google.android.gms.measurement.internal.zzav v0_1) {
                v1_15.zzu.zzaV().zzb().zzb("Error clearing default event params", v0_1);
                return;
            }
        }
    }

    public final synthetic com.google.android.gms.measurement.internal.zzpg zzL()
    {
        return this.zza;
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzbg p7, com.google.android.gms.measurement.internal.zzr p8)
    {
        com.google.android.gms.measurement.internal.zzpk v1_0;
        com.google.android.gms.measurement.internal.zzbg v0_0 = this.zza;
        com.google.android.gms.measurement.internal.zzpk v1_3 = v0_0.zzh();
        com.google.android.gms.measurement.internal.zzgs v2_4 = p8.zza;
        if (!android.text.TextUtils.isEmpty(v2_4)) {
            v1_0 = ((com.google.android.gms.internal.measurement.zzc) v1_3.zzd.get(v2_4));
        } else {
            v1_0 = 0;
        }
        if (v1_0 == null) {
            this.zza.zzaV().zzk().zzb("EES not loaded for", p8.zza);
            this.zzM(p7, p8);
            return;
        } else {
            try {
                com.google.android.gms.measurement.internal.zzbg v0_9 = v0_0.zzp().zzz(p7.zzb.zzf(), 1);
                com.google.android.gms.measurement.internal.zzgs v2_5 = p7.zza;
                String v3_1 = com.google.android.gms.measurement.internal.zzjm.zza(v2_5);
            } catch (com.google.android.gms.internal.measurement.zzd) {
                this.zza.zzaV().zzb().zzc("EES error. appId, eventName", p8.zzb, p7.zza);
                this.zza.zzaV().zzk().zzb("EES was not applied to event", p7.zza);
                this.zzM(p7, p8);
                return;
            }
            if (v3_1 != null) {
                v2_5 = v3_1;
            }
            if (v1_0.zzb(new com.google.android.gms.internal.measurement.zzaa(v2_5, p7.zzd, v0_9))) {
                if (!v1_0.zzc()) {
                    this.zzM(p7, p8);
                } else {
                    com.google.android.gms.measurement.internal.zzbg v0_15 = this.zza;
                    v0_15.zzaV().zzk().zzb("EES edited event", p7.zza);
                    this.zzM(v0_15.zzp().zzA(v1_0.zze().zzc()), p8);
                }
                if (v1_0.zzd()) {
                    java.util.Iterator v7_7 = v1_0.zze().zzf().iterator();
                    while (v7_7.hasNext()) {
                        com.google.android.gms.measurement.internal.zzbg v0_20 = ((com.google.android.gms.internal.measurement.zzaa) v7_7.next());
                        com.google.android.gms.measurement.internal.zzpk v1_6 = this.zza;
                        v1_6.zzaV().zzk().zzb("EES logging created event", v0_20.zzb());
                        this.zzM(v1_6.zzp().zzA(v0_20), p8);
                    }
                }
                return;
            } else {
                this.zza.zzaV().zzk().zzb("EES was not applied to event", p7.zza);
                this.zzM(p7, p8);
                return;
            }
        }
    }

    public final com.google.android.gms.measurement.internal.zzbg zzc(com.google.android.gms.measurement.internal.zzbg p7, com.google.android.gms.measurement.internal.zzr p8)
    {
        if ("_cmp".equals(p7.zza)) {
            com.google.android.gms.measurement.internal.zzbe v2 = p7.zzb;
            if ((v2 != null) && (v2.zze() != 0)) {
                com.google.android.gms.measurement.internal.zzgs v8_2 = v2.zzd("_cis");
                if (("referrer broadcast".equals(v8_2)) || ("referrer API".equals(v8_2))) {
                    this.zza.zzaV().zzi().zzb("Event has been filtered ", p7.toString());
                    return new com.google.android.gms.measurement.internal.zzbg("_cmpx", v2, p7.zzc, p7.zzd);
                }
            }
        }
        return p7;
    }

    public final void zzd(Runnable p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zza;
        if (!v0_0.zzaW().zze()) {
            v0_0.zzaW().zzj(p3);
            return;
        } else {
            p3.run();
            return;
        }
    }

    public final void zze(com.google.android.gms.measurement.internal.zzbg p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zzN(p3, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zzir(this, p2, p3));
        return;
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzpl p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zzN(p3, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zziu(this, p2, p3));
        return;
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zzN(p2, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zzie(this, p2));
        return;
    }

    public final void zzh(com.google.android.gms.measurement.internal.zzbg p1, String p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzO(p2, 1);
        this.zzd(new com.google.android.gms.measurement.internal.zzis(this, p1, p2));
        return;
    }

    public final void zzi(com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zzN(p2, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zzin(this, p2));
        return;
    }

    public final java.util.List zzj(com.google.android.gms.measurement.internal.zzr p5, boolean p6)
    {
        this.zzN(p5, 0);
        com.google.android.gms.measurement.internal.zzgs v0_5 = p5.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_5);
        com.google.android.gms.measurement.internal.zzgs v0_3 = ((java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzid(this, v0_5)).get());
        String v1_1 = new java.util.ArrayList(v0_3.size());
        com.google.android.gms.measurement.internal.zzgs v0_4 = v0_3.iterator();
        while (v0_4.hasNext()) {
            com.google.android.gms.measurement.internal.zzpn v2_3 = ((com.google.android.gms.measurement.internal.zzpn) v0_4.next());
            if (p6 == null) {
                if (!com.google.android.gms.measurement.internal.zzpp.zzZ(v2_3.zzc)) {
                }
            }
            v1_1.add(new com.google.android.gms.measurement.internal.zzpl(v2_3));
        }
        return v1_1;
    }

    public final byte[] zzk(com.google.android.gms.measurement.internal.zzbg p10, String p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p10);
        this.zzO(p11, 1);
        String v0_1 = this.zza;
        Integer v3_0 = p10.zza;
        v0_1.zzaV().zzj().zzb("Log and bundle. event", v0_1.zzs().zza(v3_0));
        String v1_2 = (v0_1.zzaZ().nanoTime() / 1000000);
        byte[] v6_3 = ((byte[]) v0_1.zzaW().zzi(new com.google.android.gms.measurement.internal.zzit(this, p10, p11)).get());
        if (v6_3 == null) {
            v0_1.zzaV().zzb().zzb("Log and bundle returned null. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p11));
            v6_3 = new byte[0];
        }
        v0_1.zzaV().zzj().zzd("Log and bundle processed. event, size, time_ms", v0_1.zzs().zza(v3_0), Integer.valueOf(v6_3.length), Long.valueOf(((v0_1.zzaZ().nanoTime() / 1000000) - v1_2)));
        return v6_3;
    }

    public final void zzl(long p8, String p10, String p11, String p12)
    {
        this.zzd(new com.google.android.gms.measurement.internal.zzig(this, p11, p12, p10, p8));
        return;
    }

    public final String zzm(com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zzN(p2, 0);
        return this.zza.zzap(p2);
    }

    public final void zzn(com.google.android.gms.measurement.internal.zzah p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zzc);
        this.zzN(p3, 0);
        com.google.android.gms.measurement.internal.zzah v0_3 = new com.google.android.gms.measurement.internal.zzah(p2);
        v0_3.zza = p3.zza;
        this.zzd(new com.google.android.gms.measurement.internal.zzih(this, v0_3, p3));
        return;
    }

    public final void zzo(com.google.android.gms.measurement.internal.zzah p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3.zza);
        this.zzO(p3.zza, 1);
        this.zzd(new com.google.android.gms.measurement.internal.zzii(this, new com.google.android.gms.measurement.internal.zzah(p3)));
        return;
    }

    public final java.util.List zzp(String p4, String p5, boolean p6, com.google.android.gms.measurement.internal.zzr p7)
    {
        this.zzN(p7, 0);
        com.google.android.gms.measurement.internal.zzpn v0_2 = p7.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2);
        java.util.List v4_3 = ((java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzij(this, v0_2, p4, p5)).get());
        com.google.android.gms.measurement.internal.zzgs v5_2 = new java.util.ArrayList(v4_3.size());
        java.util.List v4_4 = v4_3.iterator();
        while (v4_4.hasNext()) {
            com.google.android.gms.measurement.internal.zzpn v0_5 = ((com.google.android.gms.measurement.internal.zzpn) v4_4.next());
            if (p6 == null) {
                if (!com.google.android.gms.measurement.internal.zzpp.zzZ(v0_5.zzc)) {
                }
            }
            v5_2.add(new com.google.android.gms.measurement.internal.zzpl(v0_5));
        }
        return v5_2;
    }

    public final java.util.List zzq(String p3, String p4, String p5, boolean p6)
    {
        this.zzO(p3, 1);
        java.util.concurrent.ExecutionException v4_2 = ((java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzik(this, p3, p4, p5)).get());
        com.google.android.gms.measurement.internal.zzgs v5_2 = new java.util.ArrayList(v4_2.size());
        java.util.concurrent.ExecutionException v4_3 = v4_2.iterator();
        while (v4_3.hasNext()) {
            com.google.android.gms.measurement.internal.zzpn v0_5 = ((com.google.android.gms.measurement.internal.zzpn) v4_3.next());
            if (p6 == null) {
                if (!com.google.android.gms.measurement.internal.zzpp.zzZ(v0_5.zzc)) {
                }
            }
            v5_2.add(new com.google.android.gms.measurement.internal.zzpl(v0_5));
        }
        return v5_2;
    }

    public final java.util.List zzr(String p3, String p4, com.google.android.gms.measurement.internal.zzr p5)
    {
        this.zzN(p5, 0);
        String v5_1 = p5.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_1);
        try {
            return ((java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzil(this, v5_1, p3, p4)).get());
        } catch (java.util.List v3_4) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties", v3_4);
            return java.util.Collections.EMPTY_LIST;
        } catch (java.util.List v3_4) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties", v3_4);
            return java.util.Collections.EMPTY_LIST;
        }
    }

    public final java.util.List zzs(String p3, String p4, String p5)
    {
        this.zzO(p3, 1);
        try {
            return ((java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzim(this, p3, p4, p5)).get());
        } catch (java.util.List v3_3) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties as", v3_3);
            return java.util.Collections.EMPTY_LIST;
        } catch (java.util.List v3_3) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties as", v3_3);
            return java.util.Collections.EMPTY_LIST;
        }
    }

    public final void zzt(com.google.android.gms.measurement.internal.zzr p3)
    {
        com.google.android.gms.measurement.internal.zzio v0_0 = p3.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0);
        this.zzO(v0_0, 0);
        this.zzd(new com.google.android.gms.measurement.internal.zzio(this, p3));
        return;
    }

    public final void zzu(android.os.Bundle p3, com.google.android.gms.measurement.internal.zzr p4)
    {
        this.zzN(p4, 0);
        String v0_1 = p4.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        this.zzd(new com.google.android.gms.measurement.internal.zzjb(this, p3, v0_1, p4));
        return;
    }

    public final void zzv(com.google.android.gms.measurement.internal.zzr p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zzs);
        this.zzE(new com.google.android.gms.measurement.internal.zzip(this, p2));
        return;
    }

    public final com.google.android.gms.measurement.internal.zzao zzw(com.google.android.gms.measurement.internal.zzr p5)
    {
        this.zzN(p5, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5.zza);
        try {
            return ((com.google.android.gms.measurement.internal.zzao) this.zza.zzaW().zzi(new com.google.android.gms.measurement.internal.zziq(this, p5)).get(10000, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (int v0_4) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5.zza), v0_4);
            return new com.google.android.gms.measurement.internal.zzao(0);
        } catch (int v0_4) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5.zza), v0_4);
            return new com.google.android.gms.measurement.internal.zzao(0);
        } catch (int v0_4) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5.zza), v0_4);
            return new com.google.android.gms.measurement.internal.zzao(0);
        }
    }

    public final java.util.List zzx(com.google.android.gms.measurement.internal.zzr p6, android.os.Bundle p7)
    {
        this.zzN(p6, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6.zza);
        com.google.android.gms.measurement.internal.zzgs v0_8 = this.zza;
        if (!v0_8.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaY)) {
            try {
                return ((java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zziw(this, p6, p7)).get());
            } catch (java.util.concurrent.ExecutionException v7_4) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6.zza), v7_4);
                return java.util.Collections.EMPTY_LIST;
            } catch (java.util.concurrent.ExecutionException v7_4) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6.zza), v7_4);
                return java.util.Collections.EMPTY_LIST;
            }
        } else {
            try {
                return ((java.util.List) v0_8.zzaW().zzi(new com.google.android.gms.measurement.internal.zziv(this, p6, p7)).get(10000, java.util.concurrent.TimeUnit.MILLISECONDS));
            } catch (java.util.concurrent.ExecutionException v7_8) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6.zza), v7_8);
                return java.util.Collections.EMPTY_LIST;
            } catch (java.util.concurrent.ExecutionException v7_8) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6.zza), v7_8);
                return java.util.Collections.EMPTY_LIST;
            } catch (java.util.concurrent.ExecutionException v7_8) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6.zza), v7_8);
                return java.util.Collections.EMPTY_LIST;
            }
        }
    }

    public final void zzy(com.google.android.gms.measurement.internal.zzr p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zzs);
        this.zzE(new com.google.android.gms.measurement.internal.zzjc(this, p2));
        return;
    }

    public final void zzz(com.google.android.gms.measurement.internal.zzr p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zzs);
        this.zzE(new com.google.android.gms.measurement.internal.zzix(this, p2));
        return;
    }
}
