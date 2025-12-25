package com.android.billingclient.api;
final class zzbf implements android.content.ServiceConnection {
    final synthetic com.android.billingclient.api.BillingClientImpl zza;
    private final com.android.billingclient.api.BillingClientStateListener zzb;
    private final com.google.android.gms.internal.play_billing.zzbi zzc;
    private final com.google.android.gms.internal.play_billing.zzbi zzd;
    private final int zze;

    public synthetic zzbf(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.BillingClientStateListener p2, int p3, com.android.billingclient.api.zzbp p4)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzc = com.google.android.gms.internal.play_billing.zzbi.zzc(com.android.billingclient.api.BillingClientImpl.zzo(p1));
        this.zzd = com.google.android.gms.internal.play_billing.zzbi.zzc(com.android.billingclient.api.BillingClientImpl.zzo(p1));
        this.zzb = p2;
        this.zze = p3;
        return;
    }

    public static synthetic Object zza(com.android.billingclient.api.zzbf p16)
    {
        com.android.billingclient.api.BillingClientImpl v0_0 = p16.zza;
        com.android.billingclient.api.BillingClientImpl.zzw(v0_0);
        if (com.android.billingclient.api.BillingClientImpl.zza(v0_0) != 3) {
            String v3_1;
            if (com.android.billingclient.api.BillingClientImpl.zza(v0_0) != 1) {
                v3_1 = 0;
            } else {
                v3_1 = 1;
            }
            com.google.android.gms.internal.play_billing.zzib v2_14;
            if (android.text.TextUtils.isEmpty(0)) {
                v2_14 = 0;
            } else {
                v2_14 = new android.os.Bundle();
                v2_14.putString("accountName", 0);
                com.google.android.gms.internal.play_billing.zzc.zzc(v2_14, com.android.billingclient.api.BillingClientImpl.zzx(v0_0), com.android.billingclient.api.BillingClientImpl.zzy(v0_0), com.android.billingclient.api.BillingClientImpl.zzp(v0_0).longValue());
            }
            com.google.android.gms.internal.play_billing.zzie v8_0 = com.google.android.gms.internal.play_billing.zzie.zza;
            com.android.billingclient.api.BillingClientImpl.zzw(v0_0);
            com.android.billingclient.api.BillingClientImpl v0_15 = com.android.billingclient.api.BillingClientImpl.zzn(v0_0);
            if (v0_15 != null) {
                com.android.billingclient.api.BillingClientImpl v9_1 = p16.zza;
                String v10_4 = com.android.billingclient.api.BillingClientImpl.zzc(v9_1).getPackageName();
                int v11 = 25;
                int v13_0 = 3;
                String v12_0 = 25;
                while (v12_0 >= 3) {
                    if (v2_14 != null) {
                        v13_0 = v0_15.zzc(v12_0, v10_4, "subs", v2_14);
                    } else {
                        v13_0 = v0_15.zzw(v12_0, v10_4, "subs");
                    }
                    if (v13_0 != 0) {
                        v12_0--;
                    } else {
                        StringBuilder v15_1 = new StringBuilder();
                        v15_1.append("highestLevelSupportedForSubs: ");
                        v15_1.append(v12_0);
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v15_1.toString());
                        int v6_8;
                        if (v12_0 < 5) {
                            v6_8 = 0;
                        } else {
                            v6_8 = 1;
                        }
                        int v6_9;
                        com.android.billingclient.api.BillingClientImpl.zzV(v9_1, v6_8);
                        if (v12_0 < 3) {
                            v6_9 = 0;
                        } else {
                            v6_9 = 1;
                        }
                        com.android.billingclient.api.BillingClientImpl.zzW(v9_1, v6_9);
                        if (v12_0 < 3) {
                            v8_0 = com.google.android.gms.internal.play_billing.zzie.zzi;
                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (v11 >= 3) {
                            int v6_12;
                            if (v2_14 != null) {
                                v6_12 = v0_15.zzc(v11, v10_4, "inapp", v2_14);
                            } else {
                                v6_12 = v0_15.zzw(v11, v10_4, "inapp");
                            }
                            v13_0 = v6_12;
                            if (v13_0 != 0) {
                                v11--;
                            } else {
                                com.android.billingclient.api.BillingClientImpl.zzT(v9_1, v11);
                                com.google.android.gms.internal.play_billing.zzib v2_18 = com.android.billingclient.api.BillingClientImpl.zzb(v9_1);
                                int v6_0 = new StringBuilder();
                                v6_0.append("mHighestLevelSupportedForInApp: ");
                                v6_0.append(v2_18);
                                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v6_0.toString());
                                break;
                            }
                        }
                        com.android.billingclient.api.BillingClientImpl.zzac(v9_1, com.android.billingclient.api.BillingClientImpl.zzb(v9_1));
                        if (com.android.billingclient.api.BillingClientImpl.zzb(v9_1) < 3) {
                            v8_0 = com.google.android.gms.internal.play_billing.zzie.zzJ;
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        com.android.billingclient.api.BillingClientImpl.zzae(v9_1, v13_0);
                        if (v13_0 == 0) {
                            com.android.billingclient.api.BillingClientImpl v0_6 = p16.zze(v3_1);
                            if (v3_1 == null) {
                                com.google.android.gms.internal.play_billing.zzib v2_7 = com.google.android.gms.internal.play_billing.zzjo.zzc();
                                String v3_2 = com.google.android.gms.internal.play_billing.zzig.zzc();
                                v3_2.zzo(0);
                                v2_7.zza(v3_2);
                                if (v0_6 != null) {
                                    v2_7.zzl(v0_6.longValue());
                                }
                                com.android.billingclient.api.BillingClientImpl.zzi(p16.zza).zzj(((com.google.android.gms.internal.play_billing.zzjo) v2_7.zze()));
                                p16.zzg(com.android.billingclient.api.zzcj.zzi);
                            } else {
                                int v6_4;
                                com.google.android.gms.internal.play_billing.zzib v2_10 = com.google.android.gms.internal.play_billing.zzib.zzc();
                                v2_10.zzo(6);
                                String v3_4 = com.google.android.gms.internal.play_billing.zzjv.zzc();
                                long v5_5 = p16.zze;
                                if (v5_5 <= 0) {
                                    v6_4 = 0;
                                } else {
                                    v6_4 = 1;
                                }
                                v3_4.zza(v6_4);
                                v3_4.zzl(v5_5);
                                if (v0_6 != null) {
                                    v3_4.zzm(v0_6.longValue());
                                }
                                com.android.billingclient.api.BillingClientImpl v0_9 = p16.zza;
                                v2_10.zzn(v3_4);
                                com.android.billingclient.api.BillingClientImpl.zzaa(v0_9, ((com.google.android.gms.internal.play_billing.zzib) v2_10.zze()));
                            }
                        } else {
                            com.android.billingclient.api.BillingClientImpl v0_12 = com.android.billingclient.api.zzcj.zzb;
                            p16.zzf(v0_12, v8_0, 0, v3_1).zzg(v0_12);
                            return 0;
                        }
                    }
                    return 0;
                }
                v12_0 = 0;
            } else {
                com.android.billingclient.api.BillingClientImpl v0_13 = p16.zza;
                com.android.billingclient.api.BillingClientImpl.zzad(v0_13, 0);
                long v5_7 = com.android.billingclient.api.zzcj.zzj;
                com.android.billingclient.api.BillingClientImpl.zzab(v0_13, com.google.android.gms.internal.play_billing.zzie.zzbc, v5_7, p16.zze);
                p16.zzg(v5_7);
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static synthetic void zzb(com.android.billingclient.api.zzbf p4)
    {
        com.android.billingclient.api.BillingClientImpl v0 = p4.zza;
        com.android.billingclient.api.BillingClientImpl.zzad(v0, 0);
        com.android.billingclient.api.BillingResult v2 = com.android.billingclient.api.zzcj.zzk;
        com.android.billingclient.api.BillingClientImpl.zzab(v0, com.google.android.gms.internal.play_billing.zzie.zzx, v2, p4.zze);
        p4.zzg(v2);
        return;
    }

    private final Long zze(boolean p3)
    {
        if (p3 == null) {
            Long v3_1 = this.zzd;
            if (v3_1.zzg()) {
                v3_1.zzf();
                return Long.valueOf(v3_1.zza(java.util.concurrent.TimeUnit.MILLISECONDS));
            }
        } else {
            Long v3_3 = this.zzc;
            if (v3_3.zzg()) {
                v3_3.zzf();
                return Long.valueOf(v3_3.zza(java.util.concurrent.TimeUnit.MILLISECONDS));
            }
        }
        return 0;
    }

    private final void zzf(com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, String p5, boolean p6)
    {
        com.google.android.gms.internal.play_billing.zzic v0 = com.google.android.gms.internal.play_billing.zzig.zzc();
        v0.zzo(p3.getResponseCode());
        v0.zzl(p3.getDebugMessage());
        v0.zzn(p4);
        if (p5 != null) {
            v0.zza(p5);
        }
        com.android.billingclient.api.BillingClientImpl v3_1 = this.zze(p6);
        if (p6 == 0) {
            com.google.android.gms.internal.play_billing.zzhx v4_1 = com.google.android.gms.internal.play_billing.zzjo.zzc();
            v4_1.zza(v0);
            if (v3_1 != null) {
                v4_1.zzl(v3_1.longValue());
            }
            com.android.billingclient.api.BillingClientImpl.zzi(this.zza).zzj(((com.google.android.gms.internal.play_billing.zzjo) v4_1.zze()));
            return;
        } else {
            int v6_1;
            com.google.android.gms.internal.play_billing.zzhx v4_4 = com.google.android.gms.internal.play_billing.zzjv.zzc();
            com.google.android.gms.internal.play_billing.zzhv v5_2 = this.zze;
            if (v5_2 <= null) {
                v6_1 = 0;
            } else {
                v6_1 = 1;
            }
            v4_4.zza(v6_1);
            v4_4.zzl(v5_2);
            if (v3_1 != null) {
                v4_4.zzm(v3_1.longValue());
            }
            com.android.billingclient.api.BillingClientImpl v3_4 = this.zza;
            com.google.android.gms.internal.play_billing.zzhv v5_4 = com.google.android.gms.internal.play_billing.zzhx.zzc();
            v5_4.zzl(v0);
            v5_4.zzp(6);
            v5_4.zzo(v4_4);
            com.android.billingclient.api.BillingClientImpl.zzZ(v3_4, ((com.google.android.gms.internal.play_billing.zzhx) v5_4.zze()));
            return;
        }
    }

    private final void zzg(com.android.billingclient.api.BillingResult p4)
    {
        String v0_0 = this.zza;
        com.android.billingclient.api.BillingClientImpl.zzw(v0_0);
        if (com.android.billingclient.api.BillingClientImpl.zza(v0_0) != 3) {
            try {
                this.zzb.onBillingSetupFinished(p4);
                return;
            } catch (Throwable v4_1) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", v4_1);
                return;
            }
        } else {
            return;
        }
    }

    public final void onBindingDied(android.content.ComponentName p6)
    {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service died.");
        String v0_3 = this.zza;
        if (!com.android.billingclient.api.BillingClientImpl.zzai(v0_3)) {
            com.android.billingclient.api.BillingClientImpl.zzi(v0_3).zzi(com.google.android.gms.internal.play_billing.zzij.zzd());
            String v0_4 = this.zza;
            com.android.billingclient.api.BillingClientImpl.zzw(v0_4);
            try {
                if (com.android.billingclient.api.BillingClientImpl.zza(v0_4) == 3) {
                } else {
                    if (com.android.billingclient.api.BillingClientImpl.zza(v0_4) != 0) {
                        com.android.billingclient.api.BillingClientImpl.zzad(v0_4, 0);
                        com.android.billingclient.api.BillingClientImpl.zzaf(v0_4);
                        try {
                            this.zzb.onBillingServiceDisconnected();
                        } catch (Throwable v6_3) {
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", v6_3);
                            return;
                        }
                    } else {
                    }
                }
            } catch (Throwable v6_4) {
                throw v6_4;
            }
            return;
        } else {
            int v4;
            String v0_1 = com.android.billingclient.api.BillingClientImpl.zzi(v0_3);
            String v1_1 = com.google.android.gms.internal.play_billing.zzhx.zzc();
            v1_1.zzp(6);
            int v2_1 = com.google.android.gms.internal.play_billing.zzig.zzc();
            v2_1.zzn(com.google.android.gms.internal.play_billing.zzie.zzbf);
            v1_1.zzl(v2_1);
            int v2_2 = com.google.android.gms.internal.play_billing.zzjv.zzc();
            int v3_1 = this.zze;
            if (v3_1 <= 0) {
                v4 = 0;
            } else {
                v4 = 1;
            }
            v2_2.zza(v4);
            v2_2.zzl(v3_1);
            v1_1.zzo(v2_2);
            v0_1.zza(((com.google.android.gms.internal.play_billing.zzhx) v1_1.zze()));
        }
    }

    public final void onServiceConnected(android.content.ComponentName p9, android.os.IBinder p10)
    {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Billing service connected.");
        Throwable v9_1 = this.zza;
        com.android.billingclient.api.BillingClientImpl.zzw(v9_1);
        if (com.android.billingclient.api.BillingClientImpl.zza(v9_1) != 3) {
            com.android.billingclient.api.BillingClientImpl.zzU(v9_1, com.google.android.gms.internal.play_billing.zzal.zzs(p10));
            if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzbd(this), 30000, new com.android.billingclient.api.zzbe(this), com.android.billingclient.api.BillingClientImpl.zzf(v9_1), v9_1.zzF()) == null) {
                int v10_3 = this.zze;
                com.android.billingclient.api.BillingResult v0_1 = com.android.billingclient.api.BillingClientImpl.zzk(v9_1);
                com.android.billingclient.api.BillingClientImpl.zzab(v9_1, com.google.android.gms.internal.play_billing.zzie.zzy, v0_1, v10_3);
                this.zzg(v0_1);
            }
            return;
        } else {
            return;
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName p6)
    {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service disconnected.");
        String v0_3 = this.zza;
        if (!com.android.billingclient.api.BillingClientImpl.zzai(v0_3)) {
            com.android.billingclient.api.BillingClientImpl.zzi(v0_3).zzk(com.google.android.gms.internal.play_billing.zzjs.zzd());
            String v0_4 = this.zzd;
            v0_4.zzd();
            v0_4.zze();
            String v0_5 = this.zza;
            com.android.billingclient.api.BillingClientImpl.zzw(v0_5);
            if (com.android.billingclient.api.BillingClientImpl.zza(v0_5) != 3) {
                com.android.billingclient.api.BillingClientImpl.zzad(v0_5, 0);
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (Throwable v6_3) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", v6_3);
                    return;
                }
            } else {
            }
            return;
        } else {
            int v4;
            String v0_1 = com.android.billingclient.api.BillingClientImpl.zzi(v0_3);
            String v1_1 = com.google.android.gms.internal.play_billing.zzhx.zzc();
            v1_1.zzp(6);
            int v2_1 = com.google.android.gms.internal.play_billing.zzig.zzc();
            v2_1.zzn(com.google.android.gms.internal.play_billing.zzie.zzbe);
            v1_1.zzl(v2_1);
            int v2_2 = com.google.android.gms.internal.play_billing.zzjv.zzc();
            int v3_1 = this.zze;
            if (v3_1 <= 0) {
                v4 = 0;
            } else {
                v4 = 1;
            }
            v2_2.zza(v4);
            v2_2.zzl(v3_1);
            v1_1.zzo(v2_2);
            v0_1.zza(((com.google.android.gms.internal.play_billing.zzhx) v1_1.zze()));
        }
    }

    public final void zzc()
    {
        com.google.android.gms.internal.play_billing.zzbi v0 = this.zzc;
        v0.zzd();
        v0.zze();
        return;
    }

    public final boolean zzd()
    {
        if (this.zze <= 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
