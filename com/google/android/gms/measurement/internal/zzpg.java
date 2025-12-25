package com.google.android.gms.measurement.internal;
public final class zzpg implements com.google.android.gms.measurement.internal.zzjg {
    private static volatile com.google.android.gms.measurement.internal.zzpg zzb;
    private java.util.List zzA;
    private long zzB;
    private final java.util.Map zzC;
    private final java.util.Map zzD;
    private final java.util.Map zzE;
    private final java.util.Map zzF;
    private com.google.android.gms.measurement.internal.zzlu zzG;
    private String zzH;
    private com.google.android.gms.measurement.internal.zzay zzI;
    private long zzJ;
    private final com.google.android.gms.measurement.internal.zzpo zzK;
    long zza;
    private final com.google.android.gms.measurement.internal.zzht zzc;
    private final com.google.android.gms.measurement.internal.zzgz zzd;
    private com.google.android.gms.measurement.internal.zzav zze;
    private com.google.android.gms.measurement.internal.zzhb zzf;
    private com.google.android.gms.measurement.internal.zzok zzg;
    private com.google.android.gms.measurement.internal.zzad zzh;
    private final com.google.android.gms.measurement.internal.zzpk zzi;
    private com.google.android.gms.measurement.internal.zzlp zzj;
    private com.google.android.gms.measurement.internal.zznn zzk;
    private final com.google.android.gms.measurement.internal.zzou zzl;
    private com.google.android.gms.measurement.internal.zzhk zzm;
    private final com.google.android.gms.measurement.internal.zzic zzn;
    private final java.util.concurrent.atomic.AtomicBoolean zzo;
    private boolean zzp;
    private java.util.List zzq;
    private final java.util.Deque zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private java.nio.channels.FileLock zzx;
    private java.nio.channels.FileChannel zzy;
    private java.util.List zzz;

    public zzpg(com.google.android.gms.measurement.internal.zzph p3, com.google.android.gms.measurement.internal.zzic p4)
    {
        this.zzo = new java.util.concurrent.atomic.AtomicBoolean(0);
        this.zzr = new java.util.LinkedList();
        this.zzF = new java.util.HashMap();
        this.zzK = new com.google.android.gms.measurement.internal.zzpb(this);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zzn = com.google.android.gms.measurement.internal.zzic.zzy(p3.zza, 0, 0);
        this.zzB = -1;
        this.zzl = new com.google.android.gms.measurement.internal.zzou(this);
        com.google.android.gms.measurement.internal.zzhz v4_8 = new com.google.android.gms.measurement.internal.zzpk(this);
        v4_8.zzax();
        this.zzi = v4_8;
        com.google.android.gms.measurement.internal.zzhz v4_11 = new com.google.android.gms.measurement.internal.zzgz(this);
        v4_11.zzax();
        this.zzd = v4_11;
        com.google.android.gms.measurement.internal.zzhz v4_13 = new com.google.android.gms.measurement.internal.zzht(this);
        v4_13.zzax();
        this.zzc = v4_13;
        this.zzC = new java.util.HashMap();
        this.zzD = new java.util.HashMap();
        this.zzE = new java.util.HashMap();
        this.zzaW().zzj(new com.google.android.gms.measurement.internal.zzov(this, p3));
        return;
    }

    public static com.google.android.gms.measurement.internal.zzpg zza(android.content.Context p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.getApplicationContext());
        if (com.google.android.gms.measurement.internal.zzpg.zzb == null) {
            if (com.google.android.gms.measurement.internal.zzpg.zzb == null) {
                com.google.android.gms.measurement.internal.zzpg.zzb = new com.google.android.gms.measurement.internal.zzpg(((com.google.android.gms.measurement.internal.zzph) com.google.android.gms.common.internal.Preconditions.checkNotNull(new com.google.android.gms.measurement.internal.zzph(p3))), 0);
            }
        }
        return com.google.android.gms.measurement.internal.zzpg.zzb;
    }

    public static final void zzaA(com.google.android.gms.internal.measurement.zzhr p4, int p5, String p6)
    {
        com.google.android.gms.internal.measurement.zzhv v0_0 = p4.zza();
        int v1_2 = 0;
        while (v1_2 < v0_0.size()) {
            if (!"_err".equals(((com.google.android.gms.internal.measurement.zzhw) v0_0.get(v1_2)).zzb())) {
                v1_2++;
            } else {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv v0_2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        v0_2.zzb("_err");
        v0_2.zzf(((long) p5));
        com.google.android.gms.internal.measurement.zzhw v5_2 = ((com.google.android.gms.internal.measurement.zzhw) v0_2.zzbc());
        com.google.android.gms.internal.measurement.zzhv v0_1 = com.google.android.gms.internal.measurement.zzhw.zzn();
        v0_1.zzb("_ev");
        v0_1.zzd(p6);
        com.google.android.gms.internal.measurement.zzhw v6_2 = ((com.google.android.gms.internal.measurement.zzhw) v0_1.zzbc());
        p4.zzf(v5_2);
        p4.zzf(v6_2);
        return;
    }

    public static final void zzaB(com.google.android.gms.internal.measurement.zzhr p3, String p4)
    {
        java.util.List v0 = p3.zza();
        int v1 = 0;
        while (v1 < v0.size()) {
            if (!p4.equals(((com.google.android.gms.internal.measurement.zzhw) v0.get(v1)).zzb())) {
                v1++;
            } else {
                p3.zzj(v1);
                return;
            }
        }
        return;
    }

    private final int zzaC(String p7, com.google.android.gms.measurement.internal.zzan p8)
    {
        com.google.android.gms.measurement.internal.zzam v0_0 = this.zzc;
        if (v0_0.zzx(p7) != null) {
            com.google.android.gms.measurement.internal.zzjk v1_7 = this.zzj().zzu(p7);
            if ((v1_7 != null) && (com.google.android.gms.measurement.internal.zze.zzc(v1_7.zzaH()).zza() == com.google.android.gms.measurement.internal.zzji.zzb)) {
                com.google.android.gms.measurement.internal.zzjk v1_3 = com.google.android.gms.measurement.internal.zzjk.zzd;
                com.google.android.gms.measurement.internal.zzji v4_1 = v0_0.zzA(p7, v1_3);
                if (v4_1 != com.google.android.gms.measurement.internal.zzji.zza) {
                    p8.zzc(v1_3, com.google.android.gms.measurement.internal.zzam.zzi);
                    if (v4_1 != com.google.android.gms.measurement.internal.zzji.zzd) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
            com.google.android.gms.measurement.internal.zzjk v1_5 = com.google.android.gms.measurement.internal.zzjk.zzd;
            p8.zzc(v1_5, com.google.android.gms.measurement.internal.zzam.zzb);
            if (!v0_0.zzv(p7, v1_5)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            p8.zzc(com.google.android.gms.measurement.internal.zzjk.zzd, com.google.android.gms.measurement.internal.zzam.zzj);
            return 1;
        }
    }

    private final java.util.Map zzaD(com.google.android.gms.internal.measurement.zzhs p4)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        this.zzp();
        java.util.Iterator v4_3 = com.google.android.gms.measurement.internal.zzpk.zzH(p4, "gad_").entrySet().iterator();
        while (v4_3.hasNext()) {
            String v1_2 = ((java.util.Map$Entry) v4_3.next());
            v0_1.put(((String) v1_2.getKey()), String.valueOf(v1_2.getValue()));
        }
        return v0_1;
    }

    private final com.google.android.gms.measurement.internal.zzay zzaE()
    {
        if (this.zzI == null) {
            this.zzI = new com.google.android.gms.measurement.internal.zzoy(this, this.zzn);
        }
        return this.zzI;
    }

    private final void zzaF()
    {
        this.zzaW().zzg();
        if ((!this.zzr.isEmpty()) && (!this.zzaE().zzc())) {
            long v0_6 = Math.max(0, (((long) ((Integer) com.google.android.gms.measurement.internal.zzfy.zzaB.zzb(0)).intValue()) - (this.zzaZ().elapsedRealtime() - this.zzJ)));
            this.zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(v0_6));
            this.zzaE().zzb(v0_6);
        }
        return;
    }

    private final boolean zzaG(String p44, long p45)
    {
        int v1_0 = this;
        int v2_74 = "_ai";
        com.google.android.gms.measurement.internal.zzgs v3_46 = "purchase";
        String v4_48 = "items";
        Boolean v7_18 = Long.valueOf(1);
        this.zzj().zzb();
        int v2_75;
        long v10_16;
        boolean v15_1 = new com.google.android.gms.measurement.internal.zzpc(this, 0);
        v1_0.zzj().zzat(p44, p45, v1_0.zzB, v15_1);
        boolean v9_26 = v15_1.zzc;
        if ((v9_26) && (!v9_26.isEmpty())) {
            boolean v9_13 = ((com.google.android.gms.internal.measurement.zzic) v15_1.zza.zzcl());
            v9_13.zzi();
            boolean v17_0 = 0;
            int v18_0 = 0;
            long v8_15 = -1;
            long v10_9 = -1;
            int v12_9 = 0;
            long v13_0 = 0;
            long v14_1 = 0;
            int v16 = 0;
            while(true) {
                String[] v5_5 = "_et";
                int v46 = v13_0;
                String v21_1 = v14_1;
                if (v12_9 >= v15_1.zzc.size()) {
                    String v23_0 = v7_18;
                    int v2_90 = 0;
                    String[] v5_45 = v46;
                    Boolean v7_24 = 0;
                    String v0_53 = 0;
                    while (v0_53 < v5_45) {
                        long v10_38 = v9_13.zzd(v0_53);
                        if (!"_e".equals(v10_38.zzd())) {
                            this.zzp();
                            long v10_39 = com.google.android.gms.measurement.internal.zzpk.zzF(v10_38, "_et");
                            if (v10_39 != 0) {
                                long v10_40;
                                if (!v10_39.zze()) {
                                    v10_40 = 0;
                                } else {
                                    v10_40 = Long.valueOf(v10_39.zzf());
                                }
                                if ((v10_40 != 0) && (v10_40.longValue() > 0)) {
                                    v7_24 += v10_40.longValue();
                                }
                            }
                        } else {
                            this.zzp();
                            if (com.google.android.gms.measurement.internal.zzpk.zzF(v10_38, "_fr") == null) {
                            } else {
                                v9_13.zzj(v0_53);
                                v5_45--;
                                v0_53--;
                            }
                        }
                        v0_53++;
                    }
                    v1_0 = this.zzaH(v9_13, v7_24, 0);
                    String v0_66 = v9_13.zzb().iterator();
                    while (v0_66.hasNext()) {
                        if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) v0_66.next()).zzd())) {
                            v1_0.zzj().zzk(v9_13.zzK(), "_se");
                            break;
                        }
                    }
                    if (com.google.android.gms.measurement.internal.zzpk.zzx(v9_13, "_sid") < 0) {
                        String v0_94 = com.google.android.gms.measurement.internal.zzpk.zzx(v9_13, "_se");
                        if (v0_94 >= null) {
                            v9_13.zzr(v0_94);
                            v1_0.zzaV().zzb().zzb("Session engagement user property is in the bundle without session ID. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v15_1.zza.zzA()));
                        }
                    } else {
                        v1_0 = v1_0.zzaH(v9_13, v7_24, 1);
                    }
                    String v0_2 = v15_1.zza.zzA();
                    v1_0.zzaW().zzg();
                    v1_0.zzu();
                    String v4_3 = v1_0.zzj().zzu(v0_2);
                    if (v4_3 != null) {
                        v1_0.zzI(v4_3, v9_13);
                    } else {
                        v1_0.zzaV().zzb().zzb("Cannot fix consent fields without appInfo. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v0_2));
                    }
                    String v0_5 = v15_1.zza.zzA();
                    v1_0.zzaW().zzg();
                    v1_0.zzu();
                    String v4_23 = v1_0.zzj().zzu(v0_5);
                    if (v4_23 != null) {
                        v1_0.zzJ(v4_23, v9_13);
                    } else {
                        v1_0.zzaV().zze().zzb("Cannot populate ad_campaign_info without appInfo. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v0_5));
                    }
                    v9_13.zzv(9223372036854775807);
                    v9_13.zzx(-9223372036854775808);
                    String v4_36 = 0;
                    while (v4_36 < v9_13.zzc()) {
                        String v0_95 = v9_13.zzd(v4_36);
                        if (v0_95.zzf() < v9_13.zzu()) {
                            v9_13.zzv(v0_95.zzf());
                        }
                        if (v0_95.zzf() > v9_13.zzw()) {
                            v9_13.zzx(v0_95.zzf());
                        }
                        v4_36++;
                    }
                    v9_13.zzak();
                    String v0_11 = v1_0.zzB(v15_1.zza.zzA()).zzs(com.google.android.gms.measurement.internal.zzjl.zzf(v15_1.zza.zzaf(), 100));
                    String v4_50 = v1_0.zzj().zzad(v15_1.zza.zzA());
                    v1_0.zzj().zzac(v15_1.zza.zzA(), v0_11);
                    String[] v5_31 = com.google.android.gms.measurement.internal.zzjk.zzb;
                    if ((v0_11.zzo(v5_31)) || (!v4_50.zzo(v5_31))) {
                        if ((v0_11.zzo(v5_31)) && (!v4_50.zzo(v5_31))) {
                            v1_0.zzj().zzj(v15_1.zza.zzA());
                        }
                    } else {
                        v1_0.zzj().zzi(v15_1.zza.zzA());
                    }
                    String v4_54 = com.google.android.gms.measurement.internal.zzjk.zza;
                    if (!v0_11.zzo(v4_54)) {
                        v9_13.zzR();
                        v9_13.zzU();
                        v9_13.zzan();
                    }
                    if (!v0_11.zzo(v5_31)) {
                        v9_13.zzX();
                        v9_13.zzav();
                    }
                    com.google.android.gms.internal.measurement.zzqp.zza();
                    if ((v1_0.zzd().zzp(v15_1.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzaP)) && ((v1_0.zzt().zzX(v15_1.zza.zzA())) && ((v1_0.zzB(v15_1.zza.zzA()).zzo(v4_54)) && (v15_1.zza.zzak())))) {
                        v1_0.zzT(v9_13, v15_1);
                    }
                    int v12_10;
                    long v45_1;
                    v9_13.zzag();
                    v9_13.zzaf(v1_0.zzm().zzb(v9_13.zzK(), v9_13.zzb(), v9_13.zzk(), Long.valueOf(v9_13.zzu()), Long.valueOf(v9_13.zzw()), (v0_11.zzo(v5_31) ^ 1)));
                    if (!v1_0.zzd().zzD(v15_1.zza.zzA())) {
                        v45_1 = 0;
                        v12_10 = 1;
                    } else {
                        String v4_61 = new java.util.HashMap();
                        String[] v5_33 = new java.util.ArrayList();
                        String v6_43 = v1_0.zzt().zzf();
                        Boolean v7_23 = 0;
                        while (v7_23 < v9_13.zzc()) {
                            int v12_11;
                            long v45_2;
                            String v6_51;
                            boolean v17_7;
                            String v21_2;
                            int v1_22;
                            long v8_18 = ((com.google.android.gms.internal.measurement.zzhr) v9_13.zzd(v7_23).zzcl());
                            long v10_21 = "_efs";
                            if (!v8_18.zzk().equals("_ep")) {
                                v12_11 = v23_0;
                                long v13_8;
                                long v13_7 = v1_0.zzh();
                                long v14_2 = v15_1.zza.zzA();
                                String v0_52 = v13_7.zza(v14_2, "measurement.account.time_zone_offset_minutes");
                                if (android.text.TextUtils.isEmpty(v0_52)) {
                                    v45_2 = v2_90;
                                    v13_8 = v45_2;
                                } else {
                                    try {
                                        v13_8 = Long.parseLong(v0_52);
                                        v45_2 = v2_90;
                                    } catch (String v0_54) {
                                        v45_2 = v2_90;
                                        v13_8.zzu.zzaV().zze().zzc("Unable to parse timezone offset. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v14_2), v0_54);
                                    }
                                }
                                int v18_1;
                                String v0_64;
                                int v2_93 = v1_0.zzt().zzaj(v8_18.zzn(), v13_8);
                                String v0_56 = v8_18.zzbc();
                                if (android.text.TextUtils.isEmpty("_dbg")) {
                                    v18_1 = v10_21;
                                    v0_64 = this.zzh().zzm(v15_1.zza.zzA(), v8_18.zzk());
                                } else {
                                    String v0_59 = ((com.google.android.gms.internal.measurement.zzhs) v0_56).zza().iterator();
                                    while (v0_59.hasNext()) {
                                        boolean v17_6 = ((com.google.android.gms.internal.measurement.zzhw) v0_59.next());
                                        v18_1 = v10_21;
                                        if (!"_dbg".equals(v17_6.zzb())) {
                                            v10_21 = v18_1;
                                        } else {
                                            if (v12_11.equals(Long.valueOf(v17_6.zzf()))) {
                                                v0_64 = 1;
                                            } else {
                                            }
                                        }
                                    }
                                }
                                if (v0_64 > null) {
                                    String v23_1;
                                    String v24_1;
                                    int v1_15 = ((com.google.android.gms.measurement.internal.zzbc) v4_61.get(v8_18.zzk()));
                                    if (v1_15 != 0) {
                                        v23_1 = v12_11;
                                        v24_1 = v13_8;
                                    } else {
                                        v23_1 = v12_11;
                                        v1_15 = this.zzj().zzf(v15_1.zza.zzA(), v8_18.zzk());
                                        if (v1_15 != 0) {
                                        } else {
                                            v24_1 = v13_8;
                                            this.zzaV().zze().zzc("Event being bundled has no eventAggregate. appId, eventName", v15_1.zza.zzA(), v8_18.zzk());
                                            v1_15 = new com.google.android.gms.measurement.internal.zzbc(v15_1.zza.zzA(), v8_18.zzk(), 1, 1, 1, v8_18.zzn(), 0, 0, 0, 0, 0);
                                        }
                                    }
                                    int v22_4;
                                    this.zzp();
                                    long v10_31 = ((Long) com.google.android.gms.measurement.internal.zzpk.zzI(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()), "_eid"));
                                    if (v10_31 == 0) {
                                        v22_4 = 0;
                                    } else {
                                        v22_4 = 1;
                                    }
                                    if (v0_64 != 1) {
                                        if (v6_43.nextInt(v0_64) != 0) {
                                            long v13_16;
                                            int v26_8;
                                            long v13_14 = v1_15.zzh;
                                            if (v13_14 == 0) {
                                                v17_7 = v15_1;
                                                v21_2 = v6_43;
                                                v26_8 = v7_23;
                                                v13_16 = this.zzt().zzaj(v8_18.zzp(), v24_1);
                                            } else {
                                                v13_16 = v13_14.longValue();
                                                v21_2 = v6_43;
                                                v26_8 = v7_23;
                                                v17_7 = v15_1;
                                            }
                                            if (v13_16 == v2_93) {
                                                v6_51 = v23_1;
                                                if (v22_4 != 0) {
                                                    v4_61.put(v8_18.zzk(), v1_15.zzc(v10_31, 0, 0));
                                                }
                                            } else {
                                                this.zzp();
                                                v6_51 = v23_1;
                                                com.google.android.gms.measurement.internal.zzpk.zzC(v8_18, v18_1, v6_51);
                                                this.zzp();
                                                String v0_68 = Long.valueOf(((long) v0_64));
                                                com.google.android.gms.measurement.internal.zzpk.zzC(v8_18, "_sr", v0_68);
                                                v5_33.add(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()));
                                                if (v22_4 != 0) {
                                                    v1_15 = v1_15.zzc(0, v0_68, Boolean.TRUE);
                                                }
                                                v4_61.put(v8_18.zzk(), v1_15.zzb(v8_18.zzn(), v2_93));
                                            }
                                            v1_22 = v26_8;
                                        } else {
                                            this.zzp();
                                            String v0_70 = Long.valueOf(((long) v0_64));
                                            com.google.android.gms.measurement.internal.zzpk.zzC(v8_18, "_sr", v0_70);
                                            v5_33.add(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()));
                                            if (v22_4 != 0) {
                                                v1_15 = v1_15.zzc(0, v0_70, 0);
                                            }
                                            v4_61.put(v8_18.zzk(), v1_15.zzb(v8_18.zzn(), v2_93));
                                            v21_2 = v6_43;
                                            v1_22 = v7_23;
                                            v17_7 = v15_1;
                                            v6_51 = v23_1;
                                        }
                                        v9_13.zzf(v1_22, v8_18);
                                    } else {
                                        v5_33.add(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()));
                                        if ((v22_4 != 0) && ((v1_15.zzi != null) || ((v1_15.zzj != null) || (v1_15.zzk != null)))) {
                                            v4_61.put(v8_18.zzk(), v1_15.zzc(0, 0, 0));
                                        }
                                        v9_13.zzf(v7_23, v8_18);
                                        v21_2 = v6_43;
                                        v1_22 = v7_23;
                                        v17_7 = v15_1;
                                        v6_51 = v23_1;
                                    }
                                } else {
                                    this.zzaV().zze().zzc("Sample rate must be positive. event, rate", v8_18.zzk(), Integer.valueOf(v0_64));
                                    v5_33.add(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()));
                                    v9_13.zzf(v7_23, v8_18);
                                    v21_2 = v6_43;
                                    v1_22 = v7_23;
                                    v6_51 = v12_11;
                                    v17_7 = v15_1;
                                }
                            } else {
                                v1_0.zzp();
                                String v0_85 = ((String) com.google.android.gms.measurement.internal.zzpk.zzI(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()), "_en"));
                                int v12_19 = ((com.google.android.gms.measurement.internal.zzbc) v4_61.get(v0_85));
                                if (v12_19 == 0) {
                                    v12_19 = v1_0.zzj().zzf(v15_1.zza.zzA(), ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_85)));
                                    if (v12_19 != 0) {
                                        v4_61.put(v0_85, v12_19);
                                    }
                                }
                                if ((v12_19 == 0) || (v12_19.zzi != null)) {
                                    v12_11 = v23_0;
                                } else {
                                    String v0_88 = v12_19.zzj;
                                    if (v0_88 == null) {
                                    } else {
                                        if (v0_88.longValue() > 1) {
                                            v1_0.zzp();
                                            com.google.android.gms.measurement.internal.zzpk.zzC(v8_18, "_sr", v0_88);
                                        }
                                    }
                                    String v0_90 = v12_19.zzk;
                                    if ((v0_90 == null) || (!v0_90.booleanValue())) {
                                        v12_11 = v23_0;
                                    } else {
                                        v1_0.zzp();
                                        v12_11 = v23_0;
                                        com.google.android.gms.measurement.internal.zzpk.zzC(v8_18, "_efs", v12_11);
                                    }
                                    v5_33.add(((com.google.android.gms.internal.measurement.zzhs) v8_18.zzbc()));
                                }
                                v9_13.zzf(v7_23, v8_18);
                                v45_2 = v2_90;
                            }
                            v7_23 = (v1_22 + 1);
                            v1_0 = this;
                            v2_90 = v45_2;
                            v23_0 = v6_51;
                            v15_1 = v17_7;
                            v6_43 = v21_2;
                        }
                        v45_1 = v2_90;
                        boolean v17_1 = v15_1;
                        v12_10 = 1;
                        if (v5_33.size() < v9_13.zzc()) {
                            v9_13.zzi();
                            v9_13.zzh(v5_33);
                        }
                        String v0_23 = v4_61.entrySet().iterator();
                        while (v0_23.hasNext()) {
                            this.zzj().zzh(((com.google.android.gms.measurement.internal.zzbc) ((java.util.Map$Entry) v0_23.next()).getValue()));
                        }
                        v15_1 = v17_1;
                    }
                    String v4_65;
                    int v1_4 = v15_1.zza.zzA();
                    String v0_26 = this.zzj().zzu(v1_4);
                    if (v0_26 != null) {
                        if (v9_13.zzc() <= 0) {
                            v4_65 = 0;
                        } else {
                            int v2_77 = v0_26.zzp();
                            if (v2_77 == v45_1) {
                                v9_13.zzB();
                            } else {
                                v9_13.zzA(v2_77);
                            }
                            String v4_63 = v0_26.zzn();
                            if (v4_63 != v45_1) {
                                v2_77 = v4_63;
                            } else {
                            }
                            if (v2_77 == v45_1) {
                                v9_13.zzz();
                            } else {
                                v9_13.zzy(v2_77);
                            }
                            v0_26.zzM(((long) v9_13.zzc()));
                            v9_13.zzaJ(((int) v0_26.zzaF()));
                            v9_13.zzZ(((int) v0_26.zzG()));
                            v0_26.zzo(v9_13.zzu());
                            v0_26.zzq(v9_13.zzw());
                            int v2_86 = v0_26.zzaa();
                            if (v2_86 == 0) {
                                v9_13.zzab();
                            } else {
                                v9_13.zzaa(v2_86);
                            }
                            v4_65 = 0;
                            this.zzj().zzv(v0_26, 0, 0);
                        }
                    } else {
                        this.zzaV().zzb().zzb("Bundling raw events w/o app info. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v15_1.zza.zzA()));
                    }
                    if (v9_13.zzc() <= 0) {
                        v2_75 = this;
                    } else {
                        v2_75 = this;
                        this.zzn.zzaU();
                        String v0_32 = this.zzh().zzb(v15_1.zza.zzA());
                        if (v0_32 == null) {
                            if (!v15_1.zza.zzP().isEmpty()) {
                                this.zzaV().zze().zzb("Did not find measurement config or missing version info. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v15_1.zza.zzA()));
                            } else {
                                v9_13.zzal(-1);
                            }
                        } else {
                            if (v0_32.zza()) {
                                v9_13.zzal(v0_32.zzb());
                            } else {
                            }
                        }
                        this.zzj().zzz(((com.google.android.gms.internal.measurement.zzid) v9_13.zzbc()), v16);
                    }
                    String v0_39 = v2_75.zzj();
                    com.google.android.gms.measurement.internal.zzgs v3_56 = v15_1.zzb;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_56);
                    v0_39.zzg();
                    v0_39.zzaw();
                    String v6_47 = new StringBuilder("rowid in (");
                    long v10_18 = v4_65;
                    while (v10_18 < v3_56.size()) {
                        if (v10_18 != 0) {
                            v6_47.append(",");
                        }
                        v6_47.append(((Long) v3_56.get(v10_18)).longValue());
                        v10_18++;
                    }
                    v6_47.append(")");
                    String v4_69 = v0_39.zze().delete("raw_events", v6_47.toString(), 0);
                    if (v4_69 != v3_56.size()) {
                        v0_39.zzu.zzaV().zzb().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(v4_69), Integer.valueOf(v3_56.size()));
                    }
                    com.google.android.gms.measurement.internal.zzgs v3_59 = v2_75.zzj();
                    try {
                        v3_59.zze().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[] {v1_4, v1_4}));
                    } catch (String v0_44) {
                        v3_59.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v1_4), v0_44);
                    }
                    v2_75.zzj().zzc();
                    v10_16 = v12_10;
                } else {
                    Boolean v7_4;
                    String v4_39;
                    String v21_0;
                    String v27_0;
                    String v11_14 = ((com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) v15_1.zzc.get(v12_9)).zzcl());
                    String v23_2 = v7_18;
                    String v24_2 = v12_9;
                    if (!this.zzh().zzj(v15_1.zza.zzA(), v11_14.zzk())) {
                        com.google.android.gms.internal.measurement.zzmb v25_9;
                        Boolean v7_34 = v11_14.zzk();
                        int v26_1 = v4_48;
                        if ((v7_34.equals(v3_46)) || (v7_34.equals("_iap"))) {
                            String v4_89;
                            Boolean v7_36 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            v25_9 = v10_9;
                            v7_36.zzb("_ct");
                            if (v21_1 != null) {
                                v4_89 = "returning";
                            } else {
                                long v10_45 = v15_1.zza.zzA();
                                if ((!this.zzaP(v10_45, v3_46)) || ((!this.zzaP(v10_45, "_iap")) || (!this.zzaP(v10_45, "ecommerce_purchase")))) {
                                } else {
                                    v4_89 = "new";
                                }
                            }
                            v7_36.zzd(v4_89);
                            v11_14.zzf(((com.google.android.gms.internal.measurement.zzhw) v7_36.zzbc()));
                            v14_1 = 1;
                        } else {
                            if (!v7_34.equals("ecommerce_purchase")) {
                                v25_9 = v10_9;
                                v14_1 = v21_1;
                            } else {
                            }
                        }
                        if (v11_14.zzk().equals(com.google.android.gms.measurement.internal.zzjm.zza(v2_74))) {
                            v11_14.zzl(v2_74);
                            this.zzaV().zzk().zza("Renaming ad_impression to _ai");
                            if (android.util.Log.isLoggable(this.zzaV().zzn(), 5)) {
                                String v4_46 = 0;
                                while (v4_46 < v11_14.zzb()) {
                                    if (("ad_platform".equals(v11_14.zzc(v4_46).zzb())) && ((!v11_14.zzc(v4_46).zzd().isEmpty()) && ("admob".equalsIgnoreCase(v11_14.zzc(v4_46).zzd())))) {
                                        this.zzaV().zzh().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    v4_46++;
                                }
                            }
                        }
                        String[] v5_0;
                        String v28_2;
                        long v29_0;
                        int v30_0;
                        String v4_19 = this.zzh().zzk(v15_1.zza.zzA(), v11_14.zzk());
                        if (v4_19 != null) {
                            v21_0 = v2_74;
                            v27_0 = v3_46;
                            int v2_3 = 0;
                            long v10_1 = 0;
                            String v28_0 = 0;
                            while(true) {
                                v29_0 = v4_19;
                                if (v2_3 >= v11_14.zzb()) {
                                    break;
                                }
                                int v30_1;
                                if (!"_c".equals(v11_14.zzc(v2_3).zzb())) {
                                    v30_1 = v5_5;
                                    if ("_r".equals(v11_14.zzc(v2_3).zzb())) {
                                        com.google.android.gms.measurement.internal.zzgs v3_16 = ((com.google.android.gms.internal.measurement.zzhv) v11_14.zzc(v2_3).zzcl());
                                        v3_16.zzf(1);
                                        v11_14.zzd(v2_3, ((com.google.android.gms.internal.measurement.zzhw) v3_16.zzbc()));
                                        v10_1 = 1;
                                    }
                                } else {
                                    com.google.android.gms.measurement.internal.zzgs v3_21 = ((com.google.android.gms.internal.measurement.zzhv) v11_14.zzc(v2_3).zzcl());
                                    v30_1 = v5_5;
                                    v3_21.zzf(1);
                                    v11_14.zzd(v2_3, ((com.google.android.gms.internal.measurement.zzhw) v3_21.zzbc()));
                                    v28_0 = 1;
                                }
                                v2_3++;
                                v4_19 = v29_0;
                                v5_5 = v30_1;
                            }
                            com.google.android.gms.measurement.internal.zzgs v3_2;
                            String v28_1;
                            v30_0 = v5_5;
                            if ((v28_0 != null) || (v29_0 == 0)) {
                                v5_0 = v8_15;
                                v3_2 = v9_13;
                                v28_1 = v10_1;
                            } else {
                                v28_1 = v10_1;
                                this.zzaV().zzk().zzb("Marking event as conversion", this.zzn.zzl().zza(v11_14.zzk()));
                                int v2_6 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                v2_6.zzb("_c");
                                v5_0 = v8_15;
                                v3_2 = v9_13;
                                v2_6.zzf(1);
                                v11_14.zzg(v2_6);
                            }
                            if (v28_1 == null) {
                                this.zzaV().zzk().zzb("Marking event as real-time", this.zzn.zzl().zza(v11_14.zzk()));
                                int v2_9 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                v2_9.zzb("_r");
                                v2_9.zzf(1);
                                v11_14.zzg(v2_9);
                            }
                            v28_2 = v3_2;
                            if (this.zzj().zzw(this.zzC(), v15_1.zza.zzA(), 0, 0, 0, 0, 1, 0, 0).zze <= ((long) this.zzd().zzm(v15_1.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzo))) {
                                v16 = 1;
                            } else {
                                com.google.android.gms.measurement.internal.zzpg.zzaB(v11_14, "_r");
                            }
                            if ((com.google.android.gms.measurement.internal.zzpp.zzh(v11_14.zzk())) && ((v29_0 != 0) && (this.zzj().zzw(this.zzC(), v15_1.zza.zzA(), 0, 0, 1, 0, 0, 0, 0).zzc > ((long) this.zzd().zzm(v15_1.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzn))))) {
                                this.zzaV().zze().zzb("Too many conversions. Not logging as conversion. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v15_1.zza.zzA()));
                                int v2_24 = 0;
                                com.google.android.gms.measurement.internal.zzgs v3_6 = 0;
                                String v4_10 = -1;
                                long v8_7 = 0;
                                while (v2_24 < v11_14.zzb()) {
                                    boolean v9_5 = v11_14.zzc(v2_24);
                                    if (!"_c".equals(v9_5.zzb())) {
                                        if ("_err".equals(v9_5.zzb())) {
                                            v3_6 = 1;
                                        }
                                    } else {
                                        v8_7 = ((com.google.android.gms.internal.measurement.zzhv) v9_5.zzcl());
                                        v4_10 = v2_24;
                                    }
                                    v2_24++;
                                }
                                if (v3_6 != null) {
                                    if (v8_7 == 0) {
                                        v8_7 = 0;
                                    } else {
                                        v11_14.zzj(v4_10);
                                        if (v29_0 == 0) {
                                        } else {
                                            int v2_32 = new java.util.ArrayList(v11_14.zza());
                                            com.google.android.gms.measurement.internal.zzgs v3_25 = 0;
                                            String v4_21 = -1;
                                            long v8_10 = -1;
                                            while (v3_25 < v2_32.size()) {
                                                if (!"value".equals(((com.google.android.gms.internal.measurement.zzhw) v2_32.get(v3_25)).zzb())) {
                                                    if ("currency".equals(((com.google.android.gms.internal.measurement.zzhw) v2_32.get(v3_25)).zzb())) {
                                                        v8_10 = v3_25;
                                                    }
                                                } else {
                                                    v4_21 = v3_25;
                                                }
                                                v3_25++;
                                            }
                                            if (v4_21 != -1) {
                                                if ((((com.google.android.gms.internal.measurement.zzhw) v2_32.get(v4_21)).zze()) || (((com.google.android.gms.internal.measurement.zzhw) v2_32.get(v4_21)).zzi())) {
                                                    if (v8_10 != -1) {
                                                        int v2_35 = ((com.google.android.gms.internal.measurement.zzhw) v2_32.get(v8_10)).zzd();
                                                        if (v2_35.length() == 3) {
                                                            long v8_12 = 0;
                                                            while (v8_12 < v2_35.length()) {
                                                                boolean v9_11 = v2_35.codePointAt(v8_12);
                                                                if (Character.isLetter(v9_11)) {
                                                                    v8_12 += Character.charCount(v9_11);
                                                                }
                                                            }
                                                            String v4_25;
                                                            if (!"_e".equals(v11_14.zzk())) {
                                                                v9_13 = v28_2;
                                                                if (!"_vs".equals(v11_14.zzk())) {
                                                                    v4_25 = v25_9;
                                                                    if (((!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbj)) || ((!"_f".equals(v11_14.zzk())) && (!"_v".equals(v11_14.zzk())))) || ((!"_f".equals(v11_14.zzk())) && (!"_v".equals(v11_14.zzk())))) {
                                                                        v10_9 = v4_25;
                                                                        v8_15 = v5_0;
                                                                    } else {
                                                                        int v2_56 = 0;
                                                                        while (v2_56 < v11_14.zzb()) {
                                                                            String v6_3 = v11_14.zzc(v2_56);
                                                                            if (!"_elt".equals(v6_3.zzb())) {
                                                                                v2_56++;
                                                                            } else {
                                                                                v11_14.zzr(v6_3.zzf());
                                                                                v11_14.zzj(v2_56);
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    this.zzp();
                                                                    if (com.google.android.gms.measurement.internal.zzpk.zzF(((com.google.android.gms.internal.measurement.zzhs) v11_14.zzbc()), v30_0) != null) {
                                                                        v4_25 = v25_9;
                                                                    } else {
                                                                        if ((v17_0) && (Math.abs((v17_0.zzn() - v11_14.zzn())) <= 1000)) {
                                                                            int v2_62 = ((com.google.android.gms.internal.measurement.zzhr) v17_0.zzba());
                                                                            if (this.zzaI(v2_62, v11_14)) {
                                                                                String v4_31 = v25_9;
                                                                                v9_13.zzf(v4_31, v2_62);
                                                                                v10_9 = v4_31;
                                                                                v8_15 = v5_0;
                                                                                v17_0 = 0;
                                                                                v18_0 = 0;
                                                                                if (v11_14.zzb() != 0) {
                                                                                    break;
                                                                                }
                                                                                v7_4 = v26_1;
                                                                                v4_39 = v24_2;
                                                                                v15_1.zzc.set(v4_39, ((com.google.android.gms.internal.measurement.zzhs) v11_14.zzbc()));
                                                                                v9_13.zzg(v11_14);
                                                                                v13_0 = (v46 + 1);
                                                                                v12_9 = (v4_39 + 1);
                                                                                v4_48 = v7_4;
                                                                                v2_74 = v21_0;
                                                                                v7_18 = v23_2;
                                                                                v3_46 = v27_0;
                                                                            }
                                                                        }
                                                                        v8_15 = v46;
                                                                        v10_9 = v25_9;
                                                                        v18_0 = v11_14;
                                                                    }
                                                                }
                                                            } else {
                                                                this.zzp();
                                                                if (com.google.android.gms.measurement.internal.zzpk.zzF(((com.google.android.gms.internal.measurement.zzhs) v11_14.zzbc()), "_fr") != null) {
                                                                    v9_13 = v28_2;
                                                                } else {
                                                                    if ((v18_0 != 0) && (Math.abs((v18_0.zzn() - v11_14.zzn())) <= 1000)) {
                                                                        int v2_68 = ((com.google.android.gms.internal.measurement.zzhr) v18_0.zzba());
                                                                        if (this.zzaI(v11_14, v2_68)) {
                                                                            v9_13 = v28_2;
                                                                            v9_13.zzf(v5_0, v2_68);
                                                                            v8_15 = v5_0;
                                                                            v10_9 = v25_9;
                                                                        }
                                                                    }
                                                                    v9_13 = v28_2;
                                                                    v10_9 = v46;
                                                                    v8_15 = v5_0;
                                                                    v17_0 = v11_14;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                    }
                                                    this.zzaV().zzh().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                    v11_14.zzj(v4_21);
                                                    com.google.android.gms.measurement.internal.zzpg.zzaB(v11_14, "_c");
                                                    com.google.android.gms.measurement.internal.zzpg.zzaA(v11_14, 19, "currency");
                                                } else {
                                                    this.zzaV().zzh().zza("Value must be specified with a numeric type.");
                                                    v11_14.zzj(v4_21);
                                                    com.google.android.gms.measurement.internal.zzpg.zzaB(v11_14, "_c");
                                                    com.google.android.gms.measurement.internal.zzpg.zzaA(v11_14, 18, "value");
                                                }
                                            } else {
                                            }
                                        }
                                    }
                                }
                                if (v8_7 == 0) {
                                    this.zzaV().zzb().zzb("Did not find conversion parameter. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v15_1.zza.zzA()));
                                } else {
                                    int v2_28 = ((com.google.android.gms.internal.measurement.zzhv) v8_7.zzba());
                                    v2_28.zzb("_err");
                                    v2_28.zzf(10);
                                    v11_14.zzd(v4_10, ((com.google.android.gms.internal.measurement.zzhw) v2_28.zzbc()));
                                }
                            }
                        } else {
                            this.zzp();
                            long v10_0 = v11_14.zzk();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v10_0);
                            v21_0 = v2_74;
                            v27_0 = v3_46;
                            if ((v10_0.hashCode() != 95027) || (!v10_0.equals("_ui"))) {
                                v30_0 = "_et";
                                v5_0 = v8_15;
                                v28_2 = v9_13;
                                v29_0 = 0;
                            }
                        }
                    } else {
                        this.zzaV().zze().zzc("Dropping blocked raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v15_1.zza.zzA()), this.zzn.zzl().zza(v11_14.zzk()));
                        if (!this.zzh().zzn(v15_1.zza.zzA())) {
                            if (!this.zzh().zzo(v15_1.zza.zzA())) {
                                if (!"_err".equals(v11_14.zzk())) {
                                    this.zzt().zzN(this.zzK, v15_1.zza.zzA(), 11, "_ev", v11_14.zzk(), 0);
                                }
                            } else {
                            }
                        }
                        v13_0 = v46;
                        v27_0 = v3_46;
                        v7_4 = v4_48;
                        v14_1 = v21_1;
                        v4_39 = v24_2;
                        v21_0 = v2_74;
                    }
                }
            }
            this.zzp();
            int v2_71 = com.google.android.gms.measurement.internal.zzpk.zzE(v11_14.zza());
            String v4_35 = 0;
            while (v4_35 < v11_14.zzb()) {
                int v26_0;
                String[] v5_12 = v11_14.zzc(v4_35);
                Boolean v7_5 = v26_1;
                if ((!v5_12.zzb().equals(v7_5)) || (v5_12.zzk().isEmpty())) {
                    v26_0 = v4_35;
                    if (!v5_12.zzb().equals(v7_5)) {
                        this.zzU(v11_14.zzk(), ((com.google.android.gms.internal.measurement.zzhv) v5_12.zzcl()), v2_71, v15_1.zza.zzA());
                    }
                } else {
                    String v6_16 = v15_1.zza.zzA();
                    String[] v5_15 = v5_12.zzk();
                    int v12_8 = new android.os.Bundle[v5_15.size()];
                    long v13_1 = 0;
                    while (v13_1 < v5_15.size()) {
                        com.google.android.gms.measurement.internal.zzgs v3_44 = ((com.google.android.gms.internal.measurement.zzhw) v5_15.get(v13_1));
                        this.zzp();
                        com.google.android.gms.internal.measurement.zzmb v25_0 = v3_44;
                        com.google.android.gms.measurement.internal.zzgs v3_45 = com.google.android.gms.measurement.internal.zzpk.zzE(v3_44.zzk());
                        int v22_2 = v25_0.zzk().iterator();
                        while (v22_2.hasNext()) {
                            int v26_3 = v4_35;
                            String v28_5 = v5_15;
                            this.zzU(v11_14.zzk(), ((com.google.android.gms.internal.measurement.zzhv) ((com.google.android.gms.internal.measurement.zzhw) v22_2.next()).zzcl()), v3_45, v6_16);
                            v4_35 = v26_3;
                            v5_15 = v28_5;
                        }
                        int v26_2 = v4_35;
                        String v28_4 = v5_15;
                        v12_8[v13_1] = v3_45;
                        v13_1++;
                        v4_35 = v26_2;
                        v5_15 = v28_4;
                    }
                    v26_0 = v4_35;
                    v2_71.putParcelableArray(v7_5, v12_8);
                }
                v4_35 = (v26_0 + 1);
                v26_1 = v7_5;
            }
            v7_4 = v26_1;
            v11_14.zzi();
            com.google.android.gms.measurement.internal.zzgs v3_35 = this.zzp();
            String v4_38 = new java.util.ArrayList();
            String[] v5_9 = v2_71.keySet().iterator();
            while (v5_9.hasNext()) {
                String v6_7 = ((String) v5_9.next());
                int v12_6 = com.google.android.gms.internal.measurement.zzhw.zzn();
                v12_6.zzb(v6_7);
                String v6_8 = v2_71.get(v6_7);
                if (v6_8 != null) {
                    v3_35.zzd(v12_6, v6_8);
                    v4_38.add(((com.google.android.gms.internal.measurement.zzhw) v12_6.zzbc()));
                }
            }
            int v2_72 = v4_38.size();
            com.google.android.gms.measurement.internal.zzgs v3_36 = 0;
            while (v3_36 < v2_72) {
                String[] v5_10 = v4_38.get(v3_36);
                v3_36++;
                v11_14.zzf(((com.google.android.gms.internal.measurement.zzhw) v5_10));
            }
        } else {
            v2_75 = this;
            this.zzj().zzc();
            v10_16 = 0;
        }
        v2_75.zzj().zzd();
        return v10_16;
    }

    private final void zzaH(com.google.android.gms.internal.measurement.zzic p11, long p12, boolean p14)
    {
        com.google.android.gms.internal.measurement.zziu v1_2;
        if (1 == p14) {
            v1_2 = "_se";
        } else {
            v1_2 = "_lte";
        }
        com.google.android.gms.measurement.internal.zzpn v2_1;
        String v5 = v1_2;
        com.google.android.gms.internal.measurement.zziu v1_0 = this.zzj().zzm(p11.zzK(), v5);
        if (v1_0 == null) {
            v2_1 = new com.google.android.gms.measurement.internal.zzpn(p11.zzK(), "auto", v5, this.zzaZ().currentTimeMillis(), Long.valueOf(p12));
        } else {
            com.google.android.gms.internal.measurement.zziu v1_1 = v1_0.zze;
            if (v1_1 != null) {
                v2_1 = new com.google.android.gms.measurement.internal.zzpn(p11.zzK(), "auto", v5, this.zzaZ().currentTimeMillis(), Long.valueOf((((Long) v1_1).longValue() + p12)));
            }
        }
        com.google.android.gms.internal.measurement.zziu v1_5 = com.google.android.gms.internal.measurement.zziu.zzm();
        v1_5.zzb(v5);
        v1_5.zza(this.zzaZ().currentTimeMillis());
        Object v3_4 = v2_1.zze;
        v1_5.zze(((Long) v3_4).longValue());
        com.google.android.gms.internal.measurement.zziu v1_7 = ((com.google.android.gms.internal.measurement.zziu) v1_5.zzbc());
        long v4_5 = com.google.android.gms.measurement.internal.zzpk.zzx(p11, v5);
        if (v4_5 < 0) {
            p11.zzo(v1_7);
        } else {
            p11.zzn(v4_5, v1_7);
        }
        if (p12 > 0) {
            String v11_3;
            this.zzj().zzl(v2_1);
            if (1 == p14) {
                v11_3 = "session-scoped";
            } else {
                v11_3 = "lifetime";
            }
            this.zzaV().zzk().zzc("Updated engagement user property. scope, value", v11_3, v3_4);
        }
        return;
    }

    private final boolean zzaI(com.google.android.gms.internal.measurement.zzhr p9, com.google.android.gms.internal.measurement.zzhr p10)
    {
        String v0_2;
        com.google.android.gms.common.internal.Preconditions.checkArgument("_e".equals(p9.zzk()));
        this.zzp();
        String v0_1 = com.google.android.gms.measurement.internal.zzpk.zzF(((com.google.android.gms.internal.measurement.zzhs) p9.zzbc()), "_sc");
        long v2_1 = 0;
        if (v0_1 != null) {
            v0_2 = v0_1.zzd();
        } else {
            v0_2 = 0;
        }
        this.zzp();
        com.google.android.gms.internal.measurement.zzhw v3_2 = com.google.android.gms.measurement.internal.zzpk.zzF(((com.google.android.gms.internal.measurement.zzhs) p10.zzbc()), "_pc");
        if (v3_2 != null) {
            v2_1 = v3_2.zzd();
        }
        if ((v2_1 == 0) || (!v2_1.equals(v0_2))) {
            return 0;
        } else {
            com.google.android.gms.common.internal.Preconditions.checkArgument("_e".equals(p9.zzk()));
            this.zzp();
            String v0_9 = com.google.android.gms.measurement.internal.zzpk.zzF(((com.google.android.gms.internal.measurement.zzhs) p9.zzbc()), "_et");
            if ((v0_9 != null) && ((v0_9.zze()) && (v0_9.zzf() > 0))) {
                long v2_5 = v0_9.zzf();
                this.zzp();
                String v0_12 = com.google.android.gms.measurement.internal.zzpk.zzF(((com.google.android.gms.internal.measurement.zzhs) p10.zzbc()), "_et");
                if ((v0_12 != null) && (v0_12.zzf() > 0)) {
                    v2_5 += v0_12.zzf();
                }
                this.zzp();
                com.google.android.gms.measurement.internal.zzpk.zzC(p10, "_et", Long.valueOf(v2_5));
                this.zzp();
                com.google.android.gms.measurement.internal.zzpk.zzC(p9, "_fr", Long.valueOf(1));
            }
            return 1;
        }
    }

    private final boolean zzaJ()
    {
        this.zzaW().zzg();
        this.zzu();
        if ((!this.zzj().zzP()) && (android.text.TextUtils.isEmpty(this.zzj().zzF()))) {
            return 0;
        } else {
            return 1;
        }
    }

    private static String zzaK(java.util.Map p2, String p3)
    {
        if (p2 != null) {
            String v2_10 = p2.entrySet().iterator();
            while (v2_10.hasNext()) {
                java.util.Map$Entry v0_0 = ((java.util.Map$Entry) v2_10.next());
                if (p3.equalsIgnoreCase(((String) v0_0.getKey()))) {
                    if (((java.util.List) v0_0.getValue()).isEmpty()) {
                        break;
                    }
                    return ((String) ((java.util.List) v0_0.getValue()).get(0));
                }
            }
        }
        return 0;
    }

    private final void zzaL()
    {
        this.zzaW().zzg();
        this.zzu();
        if (this.zza > 0) {
            int v5_10 = (3600000 - Math.abs((this.zzaZ().elapsedRealtime() - this.zza)));
            if (v5_10 <= 0) {
                this.zza = 0;
            } else {
                this.zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(v5_10));
                this.zzk().zzb();
                this.zzl().zzd();
                return;
            }
        }
        if ((this.zzn.zzH()) && (this.zzaJ())) {
            com.google.android.gms.measurement.internal.zzok v1_47 = this.zzaZ().currentTimeMillis();
            this.zzd();
            long v7_4 = Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzO.zzb(0)).longValue());
            int v10 = 1;
            if ((!this.zzj().zzR()) && (!this.zzj().zzG())) {
                v10 = 0;
            }
            long v11_4;
            if (v10 == 0) {
                this.zzd();
                v11_4 = Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzH.zzb(0)).longValue());
            } else {
                int v5_24 = this.zzd().zzA();
                if ((android.text.TextUtils.isEmpty(v5_24)) || (".none.".equals(v5_24))) {
                    this.zzd();
                    v11_4 = Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzI.zzb(0)).longValue());
                } else {
                    this.zzd();
                    v11_4 = Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzJ.zzb(0)).longValue());
                }
            }
            long v7_0;
            long v13_5 = this.zzk.zzd.zza();
            long v15_0 = this.zzk.zze.zza();
            long v17 = 0;
            int v19 = v10;
            int v3_1 = Math.max(this.zzj().zzM(), this.zzj().zzO());
            if (v3_1 != 0) {
                int v3_4 = (v1_47 - Math.abs((v3_1 - v1_47)));
                long v9_2 = (v1_47 - Math.abs((v13_5 - v1_47)));
                com.google.android.gms.measurement.internal.zzok v1_2 = (v1_47 - Math.abs((v15_0 - v1_47)));
                v7_0 = (v7_4 + v3_4);
                long v9_3 = Math.max(v9_2, v1_2);
                if ((v19 != 0) && (v9_3 > 0)) {
                    v7_0 = (Math.min(v3_4, v9_3) + v11_4);
                }
                if (!this.zzp().zzs(v9_3, v11_4)) {
                    v7_0 = (v9_3 + v11_4);
                }
                if ((v1_2 != 0) && (v1_2 >= v3_4)) {
                    int v3_6 = 0;
                    while(true) {
                        this.zzd();
                        if (v3_6 >= Math.min(20, Math.max(0, ((Integer) com.google.android.gms.measurement.internal.zzfy.zzQ.zzb(0)).intValue()))) {
                            break;
                        }
                        long v9_7 = (1 << v3_6);
                        this.zzd();
                        v7_0 += (Math.max(v17, ((Long) com.google.android.gms.measurement.internal.zzfy.zzP.zzb(0)).longValue()) * v9_7);
                        if (v7_0 <= v1_2) {
                            v3_6++;
                            v17 = 0;
                        }
                    }
                    v7_0 = 0;
                }
                v17 = 0;
            } else {
                v7_0 = 0;
            }
            if (v7_0 != v17) {
                if (!this.zzi().zzb()) {
                    this.zzaV().zzk().zza("No network");
                    this.zzk().zza();
                    this.zzl().zzd();
                    return;
                } else {
                    com.google.android.gms.measurement.internal.zzok v1_16 = this.zzk.zzc.zza();
                    this.zzd();
                    int v3_11 = Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzF.zzb(0)).longValue());
                    if (!this.zzp().zzs(v1_16, v3_11)) {
                        v7_0 = Math.max(v7_0, (v1_16 + v3_11));
                    }
                    this.zzk().zzb();
                    long v7_2 = (v7_0 - this.zzaZ().currentTimeMillis());
                    if (v7_2 <= 0) {
                        this.zzd();
                        v7_2 = Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzK.zzb(0)).longValue());
                        this.zzk.zzd.zzb(this.zzaZ().currentTimeMillis());
                    }
                    this.zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(v7_2));
                    this.zzl().zzc(v7_2);
                    return;
                }
            } else {
                this.zzaV().zzk().zza("Next upload time is 0");
                this.zzk().zzb();
                this.zzl().zzd();
                return;
            }
        } else {
            this.zzaV().zzk().zza("Nothing to upload or uploading impossible");
            this.zzk().zzb();
            this.zzl().zzd();
            return;
        }
    }

    private final void zzaM()
    {
        this.zzaW().zzg();
        if ((!this.zzu) && ((!this.zzv) && (!this.zzw))) {
            this.zzaV().zzk().zza("Stopping uploading service(s)");
            java.util.List v0_3 = this.zzq;
            if (v0_3 != null) {
                java.util.List v0_4 = v0_3.iterator();
                while (v0_4.hasNext()) {
                    ((Runnable) v0_4.next()).run();
                }
                ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzq)).clear();
                return;
            } else {
                return;
            }
        } else {
            this.zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
    }

    private final Boolean zzaN(com.google.android.gms.measurement.internal.zzh p6)
    {
        try {
            if (p6.zzt() == -2147483648) {
                String v0_3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(p6.zzc(), 0).versionName;
                Boolean v6_1 = p6.zzr();
                if ((v6_1 != null) && (v6_1.equals(v0_3))) {
                    return Boolean.TRUE;
                }
            } else {
                if (p6.zzt() == ((long) com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(p6.zzc(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            }
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
        return Boolean.FALSE;
    }

    private final com.google.android.gms.measurement.internal.zzr zzaO(String p41)
    {
        com.google.android.gms.measurement.internal.zzgs v0_2 = this.zzj().zzu(p41);
        if ((v0_2 != null) && (!android.text.TextUtils.isEmpty(v0_2.zzr()))) {
            String v4_0 = this.zzaN(v0_2);
            if ((v4_0 == null) || (v4_0.booleanValue())) {
                String v4_2 = v0_2;
                String v6_0 = v4_2;
                long v7_0 = v6_0;
                long v9_0 = v7_0;
                int v11_0 = v9_0;
                return new com.google.android.gms.measurement.internal.zzr(p41, v4_2.zzf(), v4_2.zzr(), v6_0.zzt(), v7_0.zzv(), v9_0.zzx(), v11_0.zzz(), 0, v11_0.zzD(), 0, v11_0.zzl(), 0, 0, v11_0.zzac(), 0, v11_0.zzae(), v11_0.zzB(), v11_0.zzag(), this.zzB(p41).zzl(), "", 0, v11_0.zzai(), v11_0.zzak(), this.zzB(p41).zzb(), this.zzx(p41).zze(), v11_0.zzao(), v11_0.zzaw(), v11_0.zzay(), v11_0.zzaH(), 0, v11_0.zzaL());
            } else {
                this.zzaV().zzb().zzb("App version does not match; dropping. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p41));
                return 0;
            }
        } else {
            this.zzaV().zzj().zzb("No app data available; dropping", p41);
            return 0;
        }
    }

    private final boolean zzaP(String p3, String p4)
    {
        int v3_2 = this.zzj().zzf(p3, p4);
        if ((v3_2 != 0) && (v3_2.zzc >= 1)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static void zzaQ(android.content.Context p2, android.content.Intent p3)
    {
        if (android.os.Build$VERSION.SDK_INT >= 34) {
            p2.sendBroadcast(p3, 0, android.app.BroadcastOptions.makeBasic().setShareIdentityEnabled(1).toBundle());
            return;
        } else {
            p2.sendBroadcast(p3);
            return;
        }
    }

    private static final boolean zzaR(com.google.android.gms.measurement.internal.zzr p0)
    {
        if (android.text.TextUtils.isEmpty(p0.zzb)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final com.google.android.gms.measurement.internal.zzos zzaS(com.google.android.gms.measurement.internal.zzos p2)
    {
        if (p2 == null) {
            throw new IllegalStateException("Upload Component not created");
        } else {
            if (!p2.zzav()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(p2.getClass())));
            } else {
                return p2;
            }
        }
    }

    private static final Boolean zzaT(com.google.android.gms.measurement.internal.zzr p2)
    {
        Boolean v0 = p2.zzp;
        Boolean v2_1 = p2.zzC;
        if (!android.text.TextUtils.isEmpty(v2_1)) {
            Boolean v2_2 = com.google.android.gms.measurement.internal.zze.zzc(v2_1).zza().ordinal();
            if ((v2_2 == null) || (v2_2 == 1)) {
                return 0;
            } else {
                if (v2_2 == 2) {
                    return Boolean.TRUE;
                } else {
                    if (v2_2 == 3) {
                        return Boolean.FALSE;
                    }
                }
            }
        }
        return v0;
    }

    public static synthetic void zzaw(android.content.Context p0, android.content.Intent p1)
    {
        com.google.android.gms.measurement.internal.zzpg.zzaQ(p0, p1);
        return;
    }

    public final void zzA(String p2, com.google.android.gms.measurement.internal.zzjl p3)
    {
        this.zzaW().zzg();
        this.zzu();
        this.zzC.put(p2, p3);
        this.zzj().zzZ(p2, p3);
        return;
    }

    public final com.google.android.gms.measurement.internal.zzjl zzB(String p2)
    {
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.measurement.internal.zzjl v0_1 = ((com.google.android.gms.measurement.internal.zzjl) this.zzC.get(p2));
        if (v0_1 == null) {
            v0_1 = this.zzj().zzX(p2);
            if (v0_1 == null) {
                v0_1 = com.google.android.gms.measurement.internal.zzjl.zza;
            }
            this.zzA(p2, v0_1);
        }
        return v0_1;
    }

    public final long zzC()
    {
        long v0_4 = this.zzaZ().currentTimeMillis();
        long v2_7 = this.zzk;
        v2_7.zzaw();
        v2_7.zzg();
        com.google.android.gms.measurement.internal.zzhe v3 = v2_7.zzf;
        long v4_2 = v3.zza();
        if (v4_2 == 0) {
            v4_2 = (((long) v2_7.zzu.zzk().zzf().nextInt(86400000)) + 1);
            v3.zzb(v4_2);
        }
        long v2_5 = 60;
        return (((((v0_4 + v4_2) / 1000) / v2_5) / v2_5) / 24);
    }

    public final void zzD(com.google.android.gms.measurement.internal.zzbg p43, String p44)
    {
        com.google.android.gms.measurement.internal.zzr v2_5 = this.zzj().zzu(p44);
        if ((v2_5 != null) && (!android.text.TextUtils.isEmpty(v2_5.zzr()))) {
            String v4_1 = this.zzaN(v2_5);
            if (v4_1 != null) {
                if (!v4_1.booleanValue()) {
                    this.zzaV().zzb().zzb("App version does not match; dropping event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p44));
                    return;
                }
            } else {
                if (!"_ui".equals(p43.zza)) {
                    this.zzaV().zze().zzb("Could not find package. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p44));
                }
            }
            String v5_2 = v2_5;
            long v6_1 = v5_2;
            String v8_0 = v6_1;
            long v9_0 = v8_0;
            long v11_0 = v9_0;
            int v13_1 = v11_0;
            this.zzE(p43, new com.google.android.gms.measurement.internal.zzr(p44, v5_2.zzf(), v6_1.zzr(), v8_0.zzt(), v9_0.zzv(), v11_0.zzx(), v13_1.zzz(), 0, v13_1.zzD(), 0, v13_1.zzl(), 0, 0, v13_1.zzac(), 0, v13_1.zzae(), v13_1.zzB(), v13_1.zzag(), this.zzB(p44).zzl(), "", 0, v13_1.zzai(), v13_1.zzak(), this.zzB(p44).zzb(), this.zzx(p44).zze(), v13_1.zzao(), v13_1.zzaw(), v13_1.zzay(), v13_1.zzaH(), 0, v13_1.zzaL()));
            return;
        } else {
            this.zzaV().zzj().zzb("No app data available; dropping event", p44);
            return;
        }
    }

    public final void zzE(com.google.android.gms.measurement.internal.zzbg p9, com.google.android.gms.measurement.internal.zzr p10)
    {
        boolean v0_0 = p10.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0);
        com.google.android.gms.measurement.internal.zzbg v9_2 = com.google.android.gms.measurement.internal.zzgv.zza(p9);
        this.zzt().zzI(v9_2.zzd, this.zzj().zzU(v0_0));
        this.zzt().zzG(v9_2, this.zzd().zzd(v0_0));
        com.google.android.gms.measurement.internal.zzbg v9_1 = v9_2.zzb();
        if ((!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbf)) && ("_cmp".equals(v9_1.zza))) {
            boolean v0_6 = v9_1.zzb;
            if ("referrer API v2".equals(v0_6.zzd("_cis"))) {
                String v6 = v0_6.zzd("gclid");
                if (!android.text.TextUtils.isEmpty(v6)) {
                    this.zzac(new com.google.android.gms.measurement.internal.zzpl("_lgclid", v9_1.zzd, v6, "auto"), p10);
                }
            }
        }
        this.zzF(v9_1, p10);
        return;
    }

    public final void zzF(com.google.android.gms.measurement.internal.zzbg p21, com.google.android.gms.measurement.internal.zzr p22)
    {
        com.google.android.gms.measurement.internal.zzpl v6_20;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p22);
        com.google.android.gms.measurement.internal.zzbg v4_8 = p22.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_8);
        this.zzaW().zzg();
        this.zzu();
        long v9 = p21.zzd;
        com.google.android.gms.measurement.internal.zzav v5_1 = com.google.android.gms.measurement.internal.zzgv.zza(p21);
        this.zzaW().zzg();
        if (this.zzG == null) {
            v6_20 = 0;
        } else {
            com.google.android.gms.measurement.internal.zzpl v6_16 = this.zzH;
            if ((v6_16 != null) && (v6_16.equals(v4_8))) {
                v6_20 = this.zzG;
            }
        }
        com.google.android.gms.measurement.internal.zzpp.zzav(v6_20, v5_1.zzd, 0);
        com.google.android.gms.measurement.internal.zzav v5_12 = v5_1.zzb();
        this.zzp();
        if (com.google.android.gms.measurement.internal.zzpk.zzD(v5_12, p22)) {
            if (p22.zzh) {
                com.google.android.gms.measurement.internal.zzbg v13_0;
                com.google.android.gms.measurement.internal.zzpl v6_36 = p22.zzr;
                if (v6_36 == null) {
                    v13_0 = v5_12;
                } else {
                    String v14_8 = v5_12.zza;
                    if (!v6_36.contains(v14_8)) {
                        this.zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", v4_8, v5_12.zza, v5_12.zzc);
                        return;
                    } else {
                        com.google.android.gms.measurement.internal.zzpl v6_39 = v5_12.zzb.zzf();
                        v6_39.putLong("ga_safelisted", 1);
                        v13_0 = new com.google.android.gms.measurement.internal.zzbg(v14_8, new com.google.android.gms.measurement.internal.zzbe(v6_39), v5_12.zzc, v5_12.zzd);
                    }
                }
                this.zzj().zzb();
                com.google.android.gms.measurement.internal.zzav v5_15 = v13_0.zza;
                if (("_s".equals(v5_15)) && ((!this.zzj().zzQ(v4_8, "_s")) && (v13_0.zzb.zzb("_sid").longValue() != 0))) {
                    if (!this.zzj().zzQ(v4_8, "_f")) {
                        if (!this.zzj().zzQ(v4_8, "_v")) {
                            this.zzj().zzW(v4_8, Long.valueOf((this.zzaZ().currentTimeMillis() + -15000)), "_sid", this.zzG(v4_8, v13_0));
                            int v2_3;
                            int v2_2 = this.zzj();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_8);
                            v2_2.zzg();
                            v2_2.zzaw();
                            java.util.ArrayList v3_0 = v9 cmp 0;
                            if (v3_0 >= null) {
                                v2_3 = v2_2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] {v4_8, String.valueOf(v9)}));
                            } else {
                                v2_2.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", com.google.android.gms.measurement.internal.zzgu.zzl(v4_8), Long.valueOf(v9));
                                v2_3 = java.util.Collections.EMPTY_LIST;
                            }
                            int v2_7 = v2_3.iterator();
                            while (v2_7.hasNext()) {
                                com.google.android.gms.measurement.internal.zzpl v6_32 = ((com.google.android.gms.measurement.internal.zzah) v2_7.next());
                                if (v6_32 != null) {
                                    this.zzaV().zzk().zzd("User property timed out", v6_32.zza, this.zzn.zzl().zzc(v6_32.zzc.zzb), v6_32.zzc.zza());
                                    String v7_23 = v6_32.zzg;
                                    if (v7_23 != null) {
                                        this.zzH(new com.google.android.gms.measurement.internal.zzbg(v7_23, v9), p22);
                                    }
                                    this.zzj().zzr(v4_8, v6_32.zzc.zzb);
                                }
                            }
                            int v2_9;
                            int v2_8 = this.zzj();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_8);
                            v2_8.zzg();
                            v2_8.zzaw();
                            if (v3_0 >= null) {
                                v2_9 = v2_8.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] {v4_8, String.valueOf(v9)}));
                            } else {
                                v2_8.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", com.google.android.gms.measurement.internal.zzgu.zzl(v4_8), Long.valueOf(v9));
                                v2_9 = java.util.Collections.EMPTY_LIST;
                            }
                            com.google.android.gms.measurement.internal.zzpl v6_12 = new java.util.ArrayList(v2_9.size());
                            int v2_13 = v2_9.iterator();
                            while (v2_13.hasNext()) {
                                String v7_18 = ((com.google.android.gms.measurement.internal.zzah) v2_13.next());
                                if (v7_18 != null) {
                                    this.zzaV().zzk().zzd("User property expired", v7_18.zza, this.zzn.zzl().zzc(v7_18.zzc.zzb), v7_18.zzc.zza());
                                    this.zzj().zzk(v4_8, v7_18.zzc.zzb);
                                    Object v8_13 = v7_18.zzk;
                                    if (v8_13 != null) {
                                        v6_12.add(v8_13);
                                    }
                                    this.zzj().zzr(v4_8, v7_18.zzc.zzb);
                                }
                            }
                            int v2_14 = v6_12.size();
                            String v7_9 = 0;
                            while (v7_9 < v2_14) {
                                Object v8_8 = v6_12.get(v7_9);
                                v7_9++;
                                this.zzH(new com.google.android.gms.measurement.internal.zzbg(((com.google.android.gms.measurement.internal.zzbg) v8_8), v9), p22);
                            }
                            int v2_17;
                            int v2_15 = this.zzj();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_8);
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v5_15);
                            v2_15.zzg();
                            v2_15.zzaw();
                            if (v3_0 >= null) {
                                v2_17 = v2_15.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] {v4_8, v5_15, String.valueOf(v9)}));
                            } else {
                                int v2_18 = v2_15.zzu;
                                v2_18.zzaV().zze().zzd("Invalid time querying triggered conditional properties", com.google.android.gms.measurement.internal.zzgu.zzl(v4_8), v2_18.zzl().zza(v5_15), Long.valueOf(v9));
                                v2_17 = java.util.Collections.EMPTY_LIST;
                            }
                            java.util.ArrayList v3_5 = new java.util.ArrayList(v2_17.size());
                            int v2_21 = v2_17.iterator();
                            while (v2_21.hasNext()) {
                                com.google.android.gms.measurement.internal.zzbg v4_7 = ((com.google.android.gms.measurement.internal.zzah) v2_21.next());
                                if (v4_7 != null) {
                                    com.google.android.gms.measurement.internal.zzav v5_5 = v4_7.zzc;
                                    com.google.android.gms.measurement.internal.zzav v5_9 = new com.google.android.gms.measurement.internal.zzpn(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_7.zza)), v4_7.zzb, v5_5.zzb, v9, com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_5.zza()));
                                    if (!this.zzj().zzl(v5_9)) {
                                        this.zzaV().zzb().zzd("Too many active user properties, ignoring", com.google.android.gms.measurement.internal.zzgu.zzl(v4_7.zza), this.zzn.zzl().zzc(v5_9.zzc), v5_9.zze);
                                    } else {
                                        this.zzaV().zzk().zzd("User property triggered", v4_7.zza, this.zzn.zzl().zzc(v5_9.zzc), v5_9.zze);
                                    }
                                    com.google.android.gms.measurement.internal.zzpl v6_27 = v4_7.zzi;
                                    if (v6_27 != null) {
                                        v3_5.add(v6_27);
                                    }
                                    v4_7.zzc = new com.google.android.gms.measurement.internal.zzpl(v5_9);
                                    v4_7.zze = 1;
                                    this.zzj().zzp(v4_7);
                                }
                            }
                            this.zzH(v13_0, p22);
                            int v2_22 = v3_5.size();
                            int v12_0 = 0;
                            while (v12_0 < v2_22) {
                                com.google.android.gms.measurement.internal.zzbg v4_4 = v3_5.get(v12_0);
                                v12_0++;
                                this.zzH(new com.google.android.gms.measurement.internal.zzbg(((com.google.android.gms.measurement.internal.zzbg) v4_4), v9), p22);
                            }
                            this.zzj().zzc();
                            this.zzj().zzd();
                            return;
                        } else {
                        }
                    }
                    this.zzj().zzW(v4_8, 0, "_sid", this.zzG(v4_8, v13_0));
                }
            } else {
                this.zzao(p22);
                return;
            }
        } else {
            return;
        }
    }

    public final android.os.Bundle zzG(String p5, com.google.android.gms.measurement.internal.zzbg p6)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putLong("_sid", p6.zzb.zzb("_sid").longValue());
        long v5_1 = this.zzj().zzm(p5, "_sno");
        if (v5_1 != 0) {
            long v5_2 = v5_1.zze;
            if ((v5_2 instanceof Long)) {
                v0_1.putLong("_sno", ((Long) v5_2).longValue());
            }
        }
        return v0_1;
    }

    public final void zzH(com.google.android.gms.measurement.internal.zzbg p45, com.google.android.gms.measurement.internal.zzr p46)
    {
        void v1_0 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p46);
        long v10_9 = p46.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v10_9);
        long v25 = System.nanoTime();
        this.zzaW().zzg();
        this.zzu();
        this.zzp();
        if (com.google.android.gms.measurement.internal.zzpk.zzD(p45, p46)) {
            if (p46.zzh) {
                Long v13_12 = p45.zza;
                if (!this.zzh().zzj(v10_9, v13_12)) {
                    Object v0_80 = com.google.android.gms.measurement.internal.zzgv.zza(p45);
                    this.zzt().zzG(v0_80, this.zzd().zzd(v10_9));
                    String v8_31 = this.zzd().zzn(v10_9, com.google.android.gms.measurement.internal.zzfy.zzag, 10, 35);
                    String v11_30 = v0_80.zzd;
                    long v12_27 = new java.util.TreeSet(v11_30.keySet()).iterator();
                    while (v12_27.hasNext()) {
                        Long v13_5 = ((String) v12_27.next());
                        if ("items".equals(v13_5)) {
                            this.zzt().zzH(v11_30.getParcelableArray(v13_5), v8_31);
                        }
                    }
                    String v8_40 = v0_80.zzb();
                    if (android.util.Log.isLoggable(this.zzaV().zzn(), 2)) {
                        this.zzaV().zzk().zzb("Logging event", this.zzn.zzl().zzd(v8_40));
                    }
                    this.zzj().zzb();
                    Object v0_6;
                    this.zzao(p46);
                    String v11_44 = v8_40.zza;
                    if ((!"ecommerce_purchase".equals(v11_44)) && ((!"purchase".equals(v11_44)) && (!"refund".equals(v11_44)))) {
                        v0_6 = 0;
                    } else {
                        v0_6 = 1;
                    }
                    com.google.android.gms.measurement.internal.zzpp v29;
                    String v5_22;
                    double v28;
                    if ("_iap".equals(v11_44)) {
                        String v4_23;
                        Long v13_1 = v8_40.zzb;
                        int v14_2 = v13_1.zzd("currency");
                        if (v0_6 == null) {
                            v28 = "app_id";
                            v29 = "_fx";
                            v4_23 = v13_1.zzb("value").longValue();
                        } else {
                            long v18_1 = (v13_1.zzc("value").doubleValue() * 4696837146684686336);
                            if (v18_1 != 0) {
                                v28 = "app_id";
                                v29 = "_fx";
                            } else {
                                v28 = "app_id";
                                v29 = "_fx";
                                v18_1 = (((double) v13_1.zzb("value").longValue()) * 4696837146684686336);
                            }
                            if ((v18_1 > 4890909195324358656) || (v18_1 < -4332462841530417152)) {
                                this.zzaV().zze().zzc("Data lost. Currency value is too big. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v10_9), Double.valueOf(v18_1));
                                this.zzj().zzc();
                                this.zzj().zzd();
                                return;
                            } else {
                                v4_23 = Math.round(v18_1);
                                if ("refund".equals(v11_44)) {
                                    v4_23 = (- v4_23);
                                }
                            }
                        }
                        if (android.text.TextUtils.isEmpty(v14_2)) {
                            v5_22 = v8_40;
                            int v14_16;
                            Object v0_79 = v5_22.zza;
                            String v8_14 = com.google.android.gms.measurement.internal.zzpp.zzh(v0_79);
                            long v17_0 = "_err".equals(v0_79);
                            this.zzt();
                            long v9_15 = v5_22.zzb;
                            if (v9_15 != 0) {
                                Long v13_16 = new com.google.android.gms.measurement.internal.zzbd(v9_15);
                                v14_16 = 0;
                                while (v13_16.hasNext()) {
                                    String v11_16 = v9_15.zza(v13_16.zza());
                                    if ((v11_16 instanceof android.os.Parcelable[])) {
                                        v14_16 += ((long) ((android.os.Parcelable[]) v11_16).length);
                                    }
                                }
                            } else {
                                v14_16 = 0;
                            }
                            int v15_3 = v8_14;
                            String v11_21 = v10_9;
                            int v21_0 = v9_15;
                            int v24_0 = v5_22;
                            String v8_16 = this.zzj().zzx(this.zzC(), v11_21, (v14_16 + 1), 1, v15_3, 0, v17_0, 0, 0, 0);
                            long v10_11 = v11_21;
                            long v18_5 = v15_3;
                            String v11_22 = v8_16.zzb;
                            this.zzd();
                            String v11_23 = (v11_22 - com.google.android.gms.measurement.internal.zzal.zzH());
                            if (v11_23 <= 0) {
                                if (v18_5 != 0) {
                                    String v11_24 = v8_16.zza;
                                    this.zzd();
                                    String v11_25 = (v11_24 - ((long) ((Integer) com.google.android.gms.measurement.internal.zzfy.zzm.zzb(0)).intValue()));
                                    if (v11_25 > 0) {
                                        if ((v11_25 % 1000) == 1) {
                                            this.zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", com.google.android.gms.measurement.internal.zzgu.zzl(v10_11), Long.valueOf(v8_16.zza));
                                        }
                                        this.zzt().zzN(this.zzK, v10_11, 16, "_ev", v24_0.zza, 0);
                                        this.zzj().zzc();
                                        this.zzj().zzd();
                                        return;
                                    }
                                }
                                com.google.android.gms.measurement.internal.zzav v33_1;
                                String v5_23;
                                String v11_27 = v24_0;
                                if (v17_0 == 0) {
                                    v33_1 = 1;
                                    v5_23 = 0;
                                } else {
                                    v33_1 = 1;
                                    v5_23 = 0;
                                    long v12_19 = (v8_16.zzd - ((long) Math.max(0, Math.min(1000000, this.zzd().zzm(p46.zza, com.google.android.gms.measurement.internal.zzfy.zzl)))));
                                    if (v12_19 > 0) {
                                        if (v12_19 == 1) {
                                            this.zzaV().zzb().zzc("Too many error events logged. appId, count", com.google.android.gms.measurement.internal.zzgu.zzl(v10_11), Long.valueOf(v8_16.zzd));
                                        }
                                        this.zzj().zzc();
                                        this.zzj().zzd();
                                        return;
                                    }
                                }
                                String v4_63 = v21_0.zzf();
                                Long v13_20 = v11_27.zzc;
                                this.zzt().zzM(v4_63, "_o", v13_20);
                                if (this.zzt().zzaa(v10_11, p46.zzB)) {
                                    String v8_21 = this.zzt();
                                    int v15_7 = Long.valueOf(v33_1);
                                    v8_21.zzM(v4_63, "_dbg", v15_7);
                                    this.zzt().zzM(v4_63, "_r", v15_7);
                                }
                                if ("_s".equals(v0_79)) {
                                    String v8_27 = this.zzj().zzm(p46.zza, "_sno");
                                    if (v8_27 != null) {
                                        String v8_28 = v8_27.zze;
                                        if ((v8_28 instanceof Long)) {
                                            this.zzt().zzM(v4_63, "_sno", v8_28);
                                        }
                                    }
                                }
                                if ((this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaX)) && ((java.util.Objects.equals(v13_20, "am")) && (java.util.Objects.equals(v0_79, "_ai")))) {
                                    Object v0_82 = v4_63.get("value");
                                    if ((v0_82 instanceof String)) {
                                        android.content.ContentValues v7_11 = Double.parseDouble(((String) v0_82));
                                        v4_63.remove("value");
                                        v4_63.putDouble("value", v7_11);
                                    }
                                }
                                Object v3_16 = this.zzj();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v10_11);
                                v3_16.zzg();
                                v3_16.zzaw();
                                try {
                                    android.content.ContentValues v7_19 = ((long) v3_16.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] {v10_11, String.valueOf(Math.max(v5_23, Math.min(1000000, v3_16.zzu.zzc().zzm(v10_11, com.google.android.gms.measurement.internal.zzfy.zzp))))})));
                                } catch (Object v0_86) {
                                    v3_16.zzu.zzaV().zzb().zzc("Error deleting over the limit events. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v10_11), v0_86);
                                    v7_19 = 0;
                                }
                                if (v7_19 > 0) {
                                    this.zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v10_11), Long.valueOf(v7_19));
                                }
                                Object v3_24;
                                String v8_37;
                                long v9_25 = this.zzn;
                                String v11_31 = v10_11;
                                Object v0_90 = new com.google.android.gms.measurement.internal.zzbb(v9_25, v11_27.zzc, v11_31, v11_27.zza, v11_27.zzd, 0, v4_63);
                                long v10_13 = v11_31;
                                String v4_64 = v0_90.zzb;
                                Object v3_23 = this.zzj().zzf(v10_13, v4_64);
                                if (v3_23 != null) {
                                    String v8_36 = v0_90.zza(v9_25, v3_23.zzf);
                                    v3_24 = v8_36;
                                    v8_37 = v3_23.zza(v8_36.zzd);
                                } else {
                                    if ((this.zzj().zzS(v10_13) < ((long) this.zzd().zzh(v10_13))) || (v18_5 == 0)) {
                                        v8_37 = new com.google.android.gms.measurement.internal.zzbc(v10_13, v4_64, 0, 0, 0, v0_90.zzd, 0, 0, 0, 0, 0);
                                        v3_24 = v0_90;
                                    } else {
                                        this.zzaV().zzb().zzd("Too many event names used, ignoring event. appId, name, supported count", com.google.android.gms.measurement.internal.zzgu.zzl(v10_13), v9_25.zzl().zza(v4_64), Integer.valueOf(this.zzd().zzh(v10_13)));
                                        this.zzt().zzN(this.zzK, v10_13, 8, 0, 0, 0);
                                        this.zzj().zzd();
                                        return;
                                    }
                                }
                                this.zzj().zzh(v8_37);
                                this.zzaW().zzg();
                                this.zzu();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_24);
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(p46);
                                Object v0_94 = v3_24.zza;
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_94);
                                String v4_65 = p46.zza;
                                com.google.android.gms.common.internal.Preconditions.checkArgument(v0_94.equals(v4_65));
                                String v8_39 = com.google.android.gms.internal.measurement.zzid.zzaE();
                                v8_39.zza(1);
                                v8_39.zzC("android");
                                if (!android.text.TextUtils.isEmpty(v4_65)) {
                                    v8_39.zzL(v4_65);
                                }
                                Object v0_98 = p46.zzd;
                                if (!android.text.TextUtils.isEmpty(v0_98)) {
                                    v8_39.zzJ(v0_98);
                                }
                                Object v0_99 = p46.zzc;
                                if (!android.text.TextUtils.isEmpty(v0_99)) {
                                    v8_39.zzM(v0_99);
                                }
                                Object v0_100 = p46.zzu;
                                if (!android.text.TextUtils.isEmpty(v0_100)) {
                                    v8_39.zzau(v0_100);
                                }
                                long v10_19 = p46.zzj;
                                if (v10_19 != -2147483648) {
                                    v8_39.zzaj(((int) v10_19));
                                }
                                v8_39.zzN(p46.zze);
                                Object v0_103 = p46.zzb;
                                if (!android.text.TextUtils.isEmpty(v0_103)) {
                                    v8_39.zzad(v0_103);
                                }
                                Object v0_108 = this.zzB(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_65))).zzs(com.google.android.gms.measurement.internal.zzjl.zzf(p46.zzs, 100));
                                v8_39.zzat(v0_108.zzk());
                                com.google.android.gms.internal.measurement.zzqp.zza();
                                if ((this.zzd().zzp(v4_65, com.google.android.gms.measurement.internal.zzfy.zzaP)) && (this.zzt().zzX(v4_65))) {
                                    v8_39.zzaH(p46.zzz);
                                    long v12_30 = p46.zzA;
                                    if ((!v0_108.zzo(com.google.android.gms.measurement.internal.zzjk.zza)) && (v12_30 != 0)) {
                                        v12_30 = ((v12_30 & -2) | 32);
                                    }
                                    Object v0_113;
                                    if (v12_30 != v33_1) {
                                        v0_113 = v5_23;
                                    } else {
                                        v0_113 = 1;
                                    }
                                    v8_39.zzaz(v0_113);
                                    if (v12_30 != 0) {
                                        String v4_70;
                                        Object v0_115 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        if ((v12_30 & v33_1) == 0) {
                                            v4_70 = v5_23;
                                        } else {
                                            v4_70 = 1;
                                        }
                                        String v4_72;
                                        v0_115.zza(v4_70);
                                        if ((v12_30 & 2) == 0) {
                                            v4_72 = v5_23;
                                        } else {
                                            v4_72 = 1;
                                        }
                                        String v4_74;
                                        v0_115.zzb(v4_72);
                                        if ((v12_30 & 4) == 0) {
                                            v4_74 = v5_23;
                                        } else {
                                            v4_74 = 1;
                                        }
                                        String v4_76;
                                        v0_115.zzc(v4_74);
                                        if ((v12_30 & 8) == 0) {
                                            v4_76 = v5_23;
                                        } else {
                                            v4_76 = 1;
                                        }
                                        String v4_78;
                                        v0_115.zzd(v4_76);
                                        if ((v12_30 & 16) == 0) {
                                            v4_78 = v5_23;
                                        } else {
                                            v4_78 = 1;
                                        }
                                        String v4_80;
                                        v0_115.zze(v4_78);
                                        if ((32 & v12_30) == 0) {
                                            v4_80 = v5_23;
                                        } else {
                                            v4_80 = 1;
                                        }
                                        Long v13_27;
                                        v0_115.zzf(v4_80);
                                        if ((v12_30 & 64) == 0) {
                                            v13_27 = v5_23;
                                        } else {
                                            v13_27 = 1;
                                        }
                                        v0_115.zzg(v13_27);
                                        v8_39.zzaI(((com.google.android.gms.internal.measurement.zzhe) v0_115.zzbc()));
                                    } else {
                                    }
                                }
                                long v12_33 = p46.zzf;
                                if (v12_33 != 0) {
                                    v8_39.zzY(v12_33);
                                }
                                Object v0_127;
                                v8_39.zzar(p46.zzq);
                                String v4_82 = this.zzp();
                                Object v0_126 = com.google.android.gms.internal.measurement.zzjr.zza(v4_82.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement"), com.google.android.gms.measurement.internal.zzfu.zza);
                                if (v0_126 != null) {
                                    v0_127 = v0_126.zzb();
                                } else {
                                    v0_127 = java.util.Collections.EMPTY_MAP;
                                }
                                if ((v0_127 != null) && (!v0_127.isEmpty())) {
                                    long v10_32 = new java.util.ArrayList();
                                    long v12_39 = ((Integer) com.google.android.gms.measurement.internal.zzfy.zzaf.zzb(0)).intValue();
                                    Long v13_28 = v0_127.entrySet().iterator();
                                    while (v13_28.hasNext()) {
                                        Object v0_131 = ((java.util.Map$Entry) v13_28.next());
                                        if (((String) v0_131.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                Object v0_134 = Integer.parseInt(((String) v0_131.getValue()));
                                            } catch (Object v0_137) {
                                                v4_82.zzu.zzaV().zze().zzb("Experiment ID NumberFormatException", v0_137);
                                            }
                                            if (v0_134 != null) {
                                                v10_32.add(Integer.valueOf(v0_134));
                                                if (v10_32.size() >= v12_39) {
                                                    v4_82.zzu.zzaV().zze().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(v10_32.size()));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (v10_32.isEmpty()) {
                                        v10_32 = 0;
                                    }
                                }
                                if (v10_32 != 0) {
                                    v8_39.zzaq(v10_32);
                                }
                                if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzba)) {
                                    v8_39.zzaP("");
                                }
                                int v14_36;
                                com.google.android.gms.measurement.internal.zzh v16_15;
                                Object v0_146 = p46.zza;
                                String v4_87 = this.zzB(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_146))).zzs(com.google.android.gms.measurement.internal.zzjl.zzf(p46.zzs, 100));
                                long v10_35 = com.google.android.gms.measurement.internal.zzjk.zza;
                                if ((!v4_87.zzo(v10_35)) || (!p46.zzn)) {
                                    v16_15 = "raw_events";
                                    v14_36 = v10_35;
                                } else {
                                    String v11_43 = this.zzk.zzc(v0_146, v4_87);
                                    if (android.text.TextUtils.isEmpty(((CharSequence) v11_43.first))) {
                                    } else {
                                        v8_39.zzQ(((String) v11_43.first));
                                        long v12_46 = v11_43.second;
                                        if (v12_46 != 0) {
                                            v8_39.zzT(((Boolean) v12_46).booleanValue());
                                        }
                                        Long v13_29 = v29;
                                        if ((v3_24.zzb.equals(v13_29)) || (((String) v11_43.first).equals("00000000-0000-0000-0000-000000000000"))) {
                                        } else {
                                            String v11_49 = this.zzj().zzu(v0_146);
                                            if ((v11_49 == null) || (!v11_49.zzaq())) {
                                            } else {
                                                this.zzR(v0_146, v5_23, 0, 0);
                                                long v12_54 = new android.os.Bundle();
                                                int v14_37 = v11_49.zzas();
                                                if (v14_37 == 0) {
                                                    v16_15 = "raw_events";
                                                    v14_36 = v10_35;
                                                } else {
                                                    v16_15 = "raw_events";
                                                    v14_36 = v10_35;
                                                    v12_54.putLong("_pfo", Math.max(0, v14_37.longValue()));
                                                }
                                                String v5_27 = v11_49.zzau();
                                                if (v5_27 != null) {
                                                    v12_54.putLong("_uwa", v5_27.longValue());
                                                }
                                                v12_54.putLong("_r", v33_1);
                                                this.zzK.zza(v0_146, v13_29, v12_54);
                                            }
                                        }
                                    }
                                }
                                String v5_30 = this.zzn;
                                v5_30.zzu().zzw();
                                v8_39.zzF(android.os.Build.MODEL);
                                v5_30.zzu().zzw();
                                v8_39.zzE(android.os.Build$VERSION.RELEASE);
                                v8_39.zzI(((int) v5_30.zzu().zzb()));
                                v8_39.zzH(v5_30.zzu().zzc());
                                v8_39.zzay(p46.zzw);
                                if (v5_30.zzB()) {
                                    v8_39.zzK();
                                    if (!android.text.TextUtils.isEmpty(0)) {
                                        v8_39.zzam(0);
                                    }
                                }
                                long v9_33;
                                long v6_14 = this.zzj().zzu(v0_146);
                                if (v6_14 != 0) {
                                    v9_33 = 0;
                                } else {
                                    v6_14 = new com.google.android.gms.measurement.internal.zzh(v5_30, v0_146);
                                    v6_14.zze(this.zzK(v4_87));
                                    v6_14.zzm(p46.zzk);
                                    v6_14.zzg(p46.zzb);
                                    if (v4_87.zzo(v14_36)) {
                                        v6_14.zzk(this.zzk.zzf(v0_146, p46.zzn));
                                    }
                                    v6_14.zzF(0);
                                    v6_14.zzo(0);
                                    v6_14.zzq(0);
                                    v6_14.zzs(p46.zzc);
                                    v6_14.zzu(p46.zzj);
                                    v6_14.zzw(p46.zzd);
                                    v6_14.zzy(p46.zze);
                                    v6_14.zzA(p46.zzf);
                                    v6_14.zzE(p46.zzh);
                                    v6_14.zzC(p46.zzq);
                                    v9_33 = 0;
                                    this.zzj().zzv(v6_14, 0, 0);
                                }
                                if ((v4_87.zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) && (!android.text.TextUtils.isEmpty(v6_14.zzd()))) {
                                    v8_39.zzW(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_14.zzd())));
                                }
                                if (!android.text.TextUtils.isEmpty(v6_14.zzl())) {
                                    v8_39.zzah(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_14.zzl())));
                                }
                                Object v0_152 = this.zzj().zzn(v0_146);
                                int v14_3 = v9_33;
                                while (v14_3 < v0_152.size()) {
                                    String v4_26 = com.google.android.gms.internal.measurement.zziu.zzm();
                                    v4_26.zzb(((com.google.android.gms.measurement.internal.zzpn) v0_152.get(v14_3)).zzc);
                                    v4_26.zza(((com.google.android.gms.measurement.internal.zzpn) v0_152.get(v14_3)).zzd);
                                    this.zzp().zzc(v4_26, ((com.google.android.gms.measurement.internal.zzpn) v0_152.get(v14_3)).zze);
                                    v8_39.zzp(v4_26);
                                    if (("_sid".equals(((com.google.android.gms.measurement.internal.zzpn) v0_152.get(v14_3)).zzc)) && ((v6_14.zzam() != 0) && (this.zzp().zzu(p46.zzu) != v6_14.zzam()))) {
                                        v8_39.zzav();
                                    }
                                    v14_3++;
                                }
                                try {
                                    com.google.android.gms.measurement.internal.zzgs v2_28 = this.zzj();
                                    String v4_1 = ((com.google.android.gms.internal.measurement.zzid) v8_39.zzbc());
                                    v2_28.zzg();
                                    v2_28.zzaw();
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_1);
                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_1.zzA());
                                    Object v0_1 = v4_1.zzcc();
                                    String v5_2 = v2_28.zzg.zzp().zzt(v0_1);
                                    long v10_1 = new android.content.ContentValues();
                                    long v12_0 = v28;
                                    v10_1.put(v12_0, v4_1.zzA());
                                    v10_1.put("metadata_fingerprint", Long.valueOf(v5_2));
                                    v10_1.put("metadata", v0_1);
                                    try {
                                        v2_28.zze().insertWithOnConflict("raw_events_metadata", 0, v10_1, 4);
                                    } catch (Object v0_3) {
                                        v2_28.zzu.zzaV().zzb().zzc("Error storing raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_1.zzA()), v0_3);
                                        throw v0_3;
                                    }
                                    com.google.android.gms.measurement.internal.zzgs v2_6 = this.zzj();
                                    String v4_7 = new com.google.android.gms.measurement.internal.zzbd(v3_24.zzf);
                                    while (v4_7.hasNext()) {
                                        if ("_r".equals(v4_7.zza())) {
                                            long v30 = 1;
                                        }
                                        v2_6.zzg();
                                        v2_6.zzaw();
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_24);
                                        Object v0_15 = v3_24.zza;
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_15);
                                        String v4_14 = v2_6.zzg.zzp().zzh(v3_24).zzcc();
                                        android.content.ContentValues v7_4 = new android.content.ContentValues();
                                        v7_4.put(v12_0, v0_15);
                                        v7_4.put("name", v3_24.zzb);
                                        v7_4.put("timestamp", Long.valueOf(v3_24.zzd));
                                        v7_4.put("metadata_fingerprint", Long.valueOf(v5_2));
                                        v7_4.put("data", v4_14);
                                        v7_4.put("realtime", Integer.valueOf(v30));
                                        try {
                                            if (v2_6.zze().insert(v16_15, 0, v7_4) != -1) {
                                                this.zza = 0;
                                                this.zzj().zzc();
                                                this.zzj().zzd();
                                                this.zzaL().zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf((((System.nanoTime() - v25) + 500000) / 1000000)));
                                                return;
                                            } else {
                                                v2_6.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(v0_15));
                                                this.zzj().zzc();
                                                this.zzj().zzd();
                                                this.zzaL().zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf((((System.nanoTime() - v25) + 500000) / 1000000)));
                                                return;
                                            }
                                        } catch (Object v0_16) {
                                            v2_6.zzu.zzaV().zzb().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v3_24.zza), v0_16);
                                            this.zzj().zzc();
                                            this.zzj().zzd();
                                            this.zzaL().zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf((((System.nanoTime() - v25) + 500000) / 1000000)));
                                            return;
                                        }
                                    }
                                    String v4_8 = v3_24.zza;
                                    Object v0_9 = this.zzh().zzk(v4_8, v3_24.zzb);
                                    String v36 = v4_8;
                                    com.google.android.gms.measurement.internal.zzar vtmp375 = v1_0.zzj().zzw(v1_0.zzC(), v36, 0, 0, 0, 0, 0, 0, 0);
                                    if ((v0_9 == null) || (vtmp375.zze >= ((long) this.zzd().zzm(v36, com.google.android.gms.measurement.internal.zzfy.zzo)))) {
                                        v30 = v9_33;
                                    } else {
                                    }
                                } catch (Object v0_4) {
                                    this.zzaV().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v8_39.zzK()), v0_4);
                                    this.zzj().zzc();
                                    this.zzj().zzd();
                                    this.zzaL().zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf((((System.nanoTime() - v25) + 500000) / 1000000)));
                                    return;
                                }
                            } else {
                                if ((v11_23 % 1000) == 1) {
                                    this.zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", com.google.android.gms.measurement.internal.zzgu.zzl(v10_11), Long.valueOf(v8_16.zzb));
                                }
                                this.zzj().zzc();
                            }
                        } else {
                            Object v0_60 = v14_2.toUpperCase(java.util.Locale.US);
                            if (!v0_60.matches("[A-Z]{3}")) {
                            } else {
                                String v8_6;
                                String v11_12 = "_ltv_".concat(v0_60);
                                Object v0_63 = this.zzj().zzm(v10_9, v11_12);
                                if (v0_63 == null) {
                                    long v12_7 = this.zzj();
                                    Object v0_70 = (this.zzd().zzm(v10_9, com.google.android.gms.measurement.internal.zzfy.zzT) - 1);
                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v10_9);
                                    v12_7.zzg();
                                    v12_7.zzaw();
                                    try {
                                        v12_7.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'!_ltv!_%\' escape \'!\'order by set_timestamp desc limit ?,10);", new String[] {v10_9, v10_9, String.valueOf(v0_70)}));
                                    } catch (Object v0_73) {
                                        v12_7.zzu.zzaV().zzb().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v10_9), v0_73);
                                    }
                                    long v9_11 = v10_9;
                                    v5_22 = v8_40;
                                    v8_6 = new com.google.android.gms.measurement.internal.zzpn(v9_11, v8_40.zzc, v11_12, this.zzaZ().currentTimeMillis(), Long.valueOf(v4_23));
                                    v10_9 = v9_11;
                                } else {
                                    Object v0_64 = v0_63.zze;
                                    if ((v0_64 instanceof Long)) {
                                        long v9_9 = v10_9;
                                        v5_22 = v8_40;
                                        v8_6 = new com.google.android.gms.measurement.internal.zzpn(v9_9, v8_40.zzc, v11_12, this.zzaZ().currentTimeMillis(), Long.valueOf((((Long) v0_64).longValue() + v4_23)));
                                        v10_9 = v9_9;
                                    }
                                }
                                Object v0_76 = v8_6;
                                if (this.zzj().zzl(v0_76)) {
                                } else {
                                    this.zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v10_9), this.zzn.zzl().zzc(v0_76.zzc), v0_76.zze);
                                    this.zzt().zzN(this.zzK, v10_9, 9, 0, 0, 0);
                                }
                            }
                        }
                    } else {
                        if (v0_6 == null) {
                            v28 = "app_id";
                            v29 = "_fx";
                        } else {
                            v0_6 = 1;
                        }
                    }
                    this.zzj().zzd();
                    return;
                } else {
                    this.zzaV().zze().zzc("Dropping blocked event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v10_9), this.zzn.zzl().zza(v13_12));
                    if ((!this.zzh().zzn(v10_9)) && (!this.zzh().zzo(v10_9))) {
                        if (!"_err".equals(v13_12)) {
                            this.zzt().zzN(this.zzK, v10_9, 11, "_ev", v13_12, 0);
                            return;
                        }
                    } else {
                        Object v0_51 = this.zzj().zzu(v10_9);
                        if (v0_51 != null) {
                            com.google.android.gms.measurement.internal.zzgs v2_23 = Math.abs((this.zzaZ().currentTimeMillis() - Math.max(v0_51.zzJ(), v0_51.zzH())));
                            this.zzd();
                            if (v2_23 > ((Long) com.google.android.gms.measurement.internal.zzfy.zzN.zzb(0)).longValue()) {
                                this.zzaV().zzj().zza("Fetching config for blocked app");
                                this.zzW(v0_51);
                            }
                        }
                    }
                }
            } else {
                this.zzao(p46);
                return;
            }
        }
        return;
    }

    public final void zzI(com.google.android.gms.measurement.internal.zzh p12, com.google.android.gms.internal.measurement.zzic p13)
    {
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.internal.measurement.zzhr v0_9 = com.google.android.gms.measurement.internal.zzan.zzd(p13.zzaA());
        String v1_17 = p12.zzc();
        this.zzaW().zzg();
        this.zzu();
        String v1_4 = this.zzB(v1_17);
        com.google.android.gms.measurement.internal.zzam v2_17 = v1_4.zzp().ordinal();
        if (v2_17 == 1) {
            v0_9.zzc(com.google.android.gms.measurement.internal.zzjk.zza, com.google.android.gms.measurement.internal.zzam.zzi);
        } else {
            if ((v2_17 == 2) || (v2_17 == 3)) {
                v0_9.zzb(com.google.android.gms.measurement.internal.zzjk.zza, v1_4.zzb());
            } else {
                v0_9.zzc(com.google.android.gms.measurement.internal.zzjk.zza, com.google.android.gms.measurement.internal.zzam.zzj);
            }
        }
        com.google.android.gms.measurement.internal.zzam v2_22 = v1_4.zzq().ordinal();
        if (v2_22 == 1) {
            v0_9.zzc(com.google.android.gms.measurement.internal.zzjk.zzb, com.google.android.gms.measurement.internal.zzam.zzi);
        } else {
            if ((v2_22 == 2) || (v2_22 == 3)) {
                v0_9.zzb(com.google.android.gms.measurement.internal.zzjk.zzb, v1_4.zzb());
            } else {
                v0_9.zzc(com.google.android.gms.measurement.internal.zzjk.zzb, com.google.android.gms.measurement.internal.zzam.zzj);
            }
        }
        String v1_11 = p12.zzc();
        this.zzaW().zzg();
        this.zzu();
        String v1_12 = this.zzz(v1_11, this.zzx(v1_11), this.zzB(v1_11), v0_9);
        p13.zzaD(((Boolean) com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_12.zzj())).booleanValue());
        if (!android.text.TextUtils.isEmpty(v1_12.zzk())) {
            p13.zzaF(v1_12.zzk());
        }
        this.zzaW().zzg();
        this.zzu();
        String v1_16 = p13.zzk().iterator();
        while (v1_16.hasNext()) {
            com.google.android.gms.measurement.internal.zzam v2_35 = ((com.google.android.gms.internal.measurement.zziu) v1_16.next());
            if ("_npa".equals(v2_35.zzc())) {
            }
            if (v2_35 == null) {
                String v1_1 = this.zzaC(p12.zzc(), v0_9);
                com.google.android.gms.measurement.internal.zzam v2_0 = com.google.android.gms.internal.measurement.zziu.zzm();
                v2_0.zzb("_npa");
                v2_0.zza(this.zzaZ().currentTimeMillis());
                v2_0.zze(((long) v1_1));
                p13.zzo(((com.google.android.gms.internal.measurement.zziu) v2_0.zzbc()));
                this.zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(v1_1));
            } else {
                String v1_3 = com.google.android.gms.measurement.internal.zzjk.zzd;
                if (v0_9.zza(v1_3) == com.google.android.gms.measurement.internal.zzam.zza) {
                    int v3_4 = this.zzj().zzm(p12.zzc(), "_npa");
                    if (v3_4 == 0) {
                        int v3_5 = p12.zzae();
                        if (((v3_5 != 0) && ((!v3_5.booleanValue()) || (v2_35.zzg() == 1))) && ((v3_5.booleanValue()) || (v2_35.zzg() == 0))) {
                            v0_9.zzc(v1_3, com.google.android.gms.measurement.internal.zzam.zzd);
                        } else {
                            v0_9.zzc(v1_3, com.google.android.gms.measurement.internal.zzam.zzf);
                        }
                    } else {
                        com.google.android.gms.measurement.internal.zzam v2_10 = v3_4.zzb;
                        if (!"tcf".equals(v2_10)) {
                            if (!"app".equals(v2_10)) {
                                v0_9.zzc(v1_3, com.google.android.gms.measurement.internal.zzam.zzd);
                            } else {
                                v0_9.zzc(v1_3, com.google.android.gms.measurement.internal.zzam.zzf);
                            }
                        } else {
                            v0_9.zzc(v1_3, com.google.android.gms.measurement.internal.zzam.zzh);
                        }
                    }
                }
            }
            p13.zzaB(v0_9.toString());
            char[] v12_2 = this.zzc.zzy(p12.zzc());
            com.google.android.gms.internal.measurement.zzhr v0_3 = p13.zzb();
            String v1_5 = 0;
            com.google.android.gms.measurement.internal.zzam v2_16 = 0;
            while (v2_16 < v0_3.size()) {
                if (!"_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) v0_3.get(v2_16)).zzd())) {
                    v2_16++;
                } else {
                    com.google.android.gms.internal.measurement.zzhr v0_7 = ((com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) v0_3.get(v2_16)).zzcl());
                    int v3_16 = v0_7.zza();
                    int v4_7 = 0;
                    while (v4_7 < v3_16.size()) {
                        if (!"_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) v3_16.get(v4_7)).zzb())) {
                            v4_7++;
                        } else {
                            int v3_19 = ((com.google.android.gms.internal.measurement.zzhw) v3_16.get(v4_7)).zzd();
                            if ((v12_2 != null) && (v3_19.length() > 4)) {
                                char[] v12_4 = v3_19.toCharArray();
                                int v3_20 = 1;
                                while (v3_20 < 64) {
                                    if (v12_4[4] != "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v3_20)) {
                                        v3_20++;
                                    } else {
                                        v1_5 = v3_20;
                                        break;
                                    }
                                }
                                v12_4[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((v1_5 | 1));
                                v3_19 = String.valueOf(v12_4);
                            }
                            char[] v12_5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            v12_5.zzb("_tcfd");
                            v12_5.zzd(v3_19);
                            v0_7.zze(v4_7, v12_5);
                            break;
                        }
                    }
                    p13.zzf(v2_16, v0_7);
                    return;
                }
            }
            return;
        }
        v2_35 = 0;
    }

    public final void zzJ(com.google.android.gms.measurement.internal.zzh p12, com.google.android.gms.internal.measurement.zzic p13)
    {
        this.zzaW().zzg();
        this.zzu();
        String v0_1 = com.google.android.gms.internal.measurement.zzha.zzr();
        com.google.android.gms.internal.measurement.zzha v1_11 = p12.zzaJ();
        if (v1_11 != null) {
            try {
                v0_1 = ((com.google.android.gms.internal.measurement.zzgx) com.google.android.gms.measurement.internal.zzpk.zzw(v0_1, v1_11));
            } catch (com.google.android.gms.internal.measurement.zzmr) {
                this.zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p12.zzc()));
            }
        }
        com.google.android.gms.internal.measurement.zzha v1_5 = p13.zzb().iterator();
        while (v1_5.hasNext()) {
            java.util.Map v2_7 = ((com.google.android.gms.internal.measurement.zzhs) v1_5.next());
            if (v2_7.zzd().equals("_cmp")) {
                String v4_4 = ((String) com.google.android.gms.measurement.internal.zzpk.zzJ(v2_7, "gclid", ""));
                String v6_2 = ((String) com.google.android.gms.measurement.internal.zzpk.zzJ(v2_7, "gbraid", ""));
                String v5_3 = ((String) com.google.android.gms.measurement.internal.zzpk.zzJ(v2_7, "gad_source", ""));
                boolean v3_21 = ((String) com.google.android.gms.measurement.internal.zzfy.zzbg.zzb(0)).split(",");
                this.zzp();
                if (!com.google.android.gms.measurement.internal.zzpk.zzG(v2_7, v3_21).isEmpty()) {
                    long v9_1 = ((Long) com.google.android.gms.measurement.internal.zzpk.zzJ(v2_7, "click_timestamp", Long.valueOf(0))).longValue();
                    if (v9_1 <= 0) {
                        v9_1 = v2_7.zzf();
                    }
                    if (!"referrer API v2".equals(com.google.android.gms.measurement.internal.zzpk.zzI(v2_7, "_cis"))) {
                        if (v9_1 > v0_1.zzg()) {
                            if (!v4_4.isEmpty()) {
                                v0_1.zza(v4_4);
                            } else {
                                v0_1.zzb();
                            }
                            if (!v6_2.isEmpty()) {
                                v0_1.zzc(v6_2);
                            } else {
                                v0_1.zzd();
                            }
                            if (!v5_3.isEmpty()) {
                                v0_1.zze(v5_3);
                            } else {
                                v0_1.zzf();
                            }
                            v0_1.zzh(v9_1);
                            v0_1.zzq();
                            v0_1.zzr(this.zzaD(v2_7));
                        }
                    } else {
                        if (v9_1 > v0_1.zzo()) {
                            if (!v4_4.isEmpty()) {
                                v0_1.zzi(v4_4);
                            } else {
                                v0_1.zzj();
                            }
                            if (!v6_2.isEmpty()) {
                                v0_1.zzk(v6_2);
                            } else {
                                v0_1.zzl();
                            }
                            if (!v5_3.isEmpty()) {
                                v0_1.zzm(v5_3);
                            } else {
                                v0_1.zzn();
                            }
                            v0_1.zzp(v9_1);
                            v0_1.zzs();
                            v0_1.zzt(this.zzaD(v2_7));
                        }
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) v0_1.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            p13.zzaM(((com.google.android.gms.internal.measurement.zzha) v0_1.zzbc()));
        }
        p12.zzaI(((com.google.android.gms.internal.measurement.zzha) v0_1.zzbc()).zzcc());
        if (p12.zza()) {
            this.zzj().zzv(p12, 0, 0);
        }
        if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbf)) {
            this.zzj().zzk(p12.zzc(), "_lgclid");
        }
        return;
    }

    public final String zzK(com.google.android.gms.measurement.internal.zzjl p4)
    {
        if (!p4.zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
            return 0;
        } else {
            int v4_6 = new byte[16];
            this.zzt().zzf().nextBytes(v4_6);
            return String.format(java.util.Locale.US, "%032x", new Object[] {new java.math.BigInteger(1, v4_6)}));
        }
    }

    public final void zzL(java.util.List p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument((p2.isEmpty() ^ 1));
        if (this.zzz == null) {
            this.zzz = new java.util.ArrayList(p2);
            return;
        } else {
            this.zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
            return;
        }
    }

    public final void zzM()
    {
        this.zzaW().zzg();
        this.zzu();
        this.zzw = 1;
        com.google.android.gms.measurement.internal.zzh v1_26 = this.zzn;
        v1_26.zzaU();
        com.google.android.gms.measurement.internal.zzh v1_3 = v1_26.zzt().zzJ();
        if (v1_3 != null) {
            if (!v1_3.booleanValue()) {
                if (this.zza <= 0) {
                    this.zzaW().zzg();
                    if (this.zzz == null) {
                        if (this.zzi().zzb()) {
                            com.google.android.gms.measurement.internal.zzh v1_25 = this.zzaZ().currentTimeMillis();
                            boolean v7_0 = 0;
                            long v5_2 = this.zzd().zzm(0, com.google.android.gms.measurement.internal.zzfy.zzai);
                            this.zzd();
                            android.database.sqlite.SQLiteException v8_4 = com.google.android.gms.measurement.internal.zzal.zzF();
                            int v6_0 = 0;
                            while ((v6_0 < v5_2) && (this.zzaG(0, (v1_25 - v8_4)))) {
                                v6_0++;
                            }
                            com.google.android.gms.internal.measurement.zzqp.zza();
                            this.zzaW().zzg();
                            this.zzaF();
                            long v5_6 = this.zzk.zzd.zza();
                            if (v5_6 != 0) {
                                this.zzaV().zzj().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs((v1_25 - v5_6))));
                            }
                            com.google.android.gms.measurement.internal.zzgs v3_8 = this.zzj().zzF();
                            long v5_0 = -1;
                            if (android.text.TextUtils.isEmpty(v3_8)) {
                                this.zzB = -1;
                                com.google.android.gms.measurement.internal.zzgs v3_2 = this.zzj();
                                this.zzd();
                                com.google.android.gms.measurement.internal.zzh v1_27 = (v1_25 - com.google.android.gms.measurement.internal.zzal.zzF());
                                v3_2.zzg();
                                v3_2.zzaw();
                                try {
                                    com.google.android.gms.measurement.internal.zzh v1_2 = v3_2.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[] {String.valueOf(v1_27)}));
                                } catch (com.google.android.gms.measurement.internal.zzh v1_1) {
                                    com.google.android.gms.measurement.internal.zzgs v2_0 = v1_1;
                                    v1_2 = 0;
                                    v3_2 = v3_2.zzu.zzaV().zzb();
                                    v3_2.zzb("Error selecting expired configs", v2_0);
                                    if (v1_2 == null) {
                                        if (!android.text.TextUtils.isEmpty(v7_0)) {
                                            com.google.android.gms.measurement.internal.zzh v1_6 = this.zzj().zzu(v7_0);
                                            if (v1_6 != null) {
                                                this.zzW(v1_6);
                                            }
                                        }
                                    } else {
                                        v1_2.close();
                                    }
                                } catch (com.google.android.gms.measurement.internal.zzh v1_30) {
                                    com.google.android.gms.measurement.internal.zzgs v2_5 = v1_30;
                                    if (v7_0) {
                                        v7_0.close();
                                    }
                                    throw v2_5;
                                }
                                if (v1_2.moveToFirst()) {
                                    v7_0 = v1_2.getString(0);
                                } else {
                                    v3_2.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                }
                            } else {
                                if (this.zzB == -1) {
                                    com.google.android.gms.measurement.internal.zzgs v4_3 = this.zzj();
                                    try {
                                        boolean v7_1 = v4_3.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", 0);
                                    } catch (android.database.sqlite.SQLiteException v8_3) {
                                        v4_3.zzu.zzaV().zzb().zzb("Error querying raw events", v8_3);
                                        if (!v7_1) {
                                            this.zzB = v5_0;
                                        } else {
                                            v7_1.close();
                                        }
                                    } catch (com.google.android.gms.measurement.internal.zzh v1_8) {
                                        if (v7_1) {
                                            v7_1.close();
                                        }
                                        throw v1_8;
                                    }
                                    if (v7_1.moveToFirst()) {
                                        v5_0 = v7_1.getLong(0);
                                    }
                                }
                                this.zzN(v3_8, v1_25);
                            }
                        } else {
                            this.zzaV().zzk().zza("Network not connected, ignoring upload request");
                            this.zzaL();
                        }
                    } else {
                        this.zzaV().zzk().zza("Uploading requested multiple times");
                    }
                } else {
                    this.zzaL();
                }
            } else {
                this.zzaV().zzb().zza("Upload called in the client side when service should be used");
            }
        } else {
            this.zzaV().zze().zza("Upload data called on the client side before use of service was decided");
        }
        this.zzw = 0;
        this.zzaM();
        return;
    }

    public final void zzN(String p33, long p34)
    {
        String v10_9;
        android.util.Pair v0_87 = this.zzd().zzm(p33, com.google.android.gms.measurement.internal.zzfy.zzg);
        Long v7_13 = 0;
        int v5_11 = Math.max(0, this.zzd().zzm(p33, com.google.android.gms.measurement.internal.zzfy.zzh));
        com.google.android.gms.internal.measurement.zzic v8_0 = this.zzj();
        v8_0.zzg();
        v8_0.zzaw();
        com.google.android.gms.internal.measurement.zzib v9_23 = 1;
        if (v0_87 <= null) {
            v10_9 = 0;
        } else {
            v10_9 = 1;
        }
        String v10_11;
        com.google.android.gms.common.internal.Preconditions.checkArgument(v10_9);
        if (v5_11 <= 0) {
            v10_11 = 0;
        } else {
            v10_11 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v10_11);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p33);
        try {
            com.google.android.gms.measurement.internal.zzls v11_1;
            int v23_2 = -1;
            try {
                String v10_10 = v8_0.zze().query("queue", new String[] {"rowid", "data", "retry_count"}), "app_id=?", new String[] {p33}), 0, 0, "rowid", String.valueOf(v0_87));
                try {
                    if (v10_10.moveToFirst()) {
                        v11_1 = new java.util.ArrayList();
                        com.google.android.gms.internal.measurement.zzfu v14_6 = 0;
                        while(true) {
                            StringBuilder v15_8 = v10_10.getLong(v7_13);
                            android.util.Pair v0_78 = v10_10.getBlob(v9_23);
                            com.google.android.gms.internal.measurement.zzib v9_42 = v8_0.zzg.zzp();
                            try {
                                int v13_22 = new java.io.ByteArrayInputStream(v0_78);
                                android.util.Pair v0_80 = new java.util.zip.GZIPInputStream(v13_22);
                                java.util.Map v12_39 = new java.io.ByteArrayOutputStream();
                                Long v7_28 = new byte[1024];
                                com.google.android.gms.measurement.internal.zzgs v21_9 = v13_22;
                            } catch (android.util.Pair v0_90) {
                                com.google.android.gms.internal.measurement.zziu v22_4 = v10_10;
                                try {
                                    v9_42.zzu.zzaV().zzb().zzb("Failed to ungzip content", v0_90);
                                    throw v0_90;
                                } catch (android.util.Pair v0_0) {
                                    v8_0.zzu.zzaV().zzb().zzc("Failed to unzip queued bundle. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33), v0_0);
                                }
                            }
                            while(true) {
                                int v13_25 = v0_80.read(v7_28);
                                if (v13_25 <= 0) {
                                    break;
                                }
                                v22_4 = v10_10;
                                try {
                                    v12_39.write(v7_28, 0, v13_25);
                                    v10_10 = v22_4;
                                } catch (android.util.Pair v0_90) {
                                }
                            }
                            v0_80.close();
                            v21_9.close();
                            android.util.Pair v0_102 = v12_39.toByteArray();
                            if ((!v11_1.isEmpty()) && ((v0_102.length + v14_6) > v5_11)) {
                                break;
                            }
                            try {
                                Long v7_9 = ((com.google.android.gms.internal.measurement.zzic) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), v0_102));
                            } catch (android.util.Pair v0_22) {
                                v8_0.zzu.zzaV().zzb().zzc("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33), v0_22);
                                v22_4 = v10_10;
                                if ((v22_4.moveToNext()) && (v14_6 <= v5_11)) {
                                    v10_10 = v22_4;
                                    v7_13 = 0;
                                    v9_23 = 1;
                                } else {
                                    v22_4.close();
                                    if (!v11_1.isEmpty()) {
                                        com.google.android.gms.internal.measurement.zzpo.zza();
                                        int v5_15 = com.google.android.gms.measurement.internal.zzfy.zzbh;
                                        if (this.zzd().zzp(0, v5_15)) {
                                            com.google.android.gms.internal.measurement.zzpo.zza();
                                            if (this.zzd().zzp(0, v5_15)) {
                                                if ((this.zzB(p33).zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) || (!this.zzh().zzB(p33))) {
                                                    Long v7_18 = new java.util.ArrayList(v11_1.size());
                                                    com.google.android.gms.internal.measurement.zzib v9_26 = this.zzj();
                                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p33);
                                                    v9_26.zzg();
                                                    v9_26.zzaw();
                                                    String v10_13 = new java.util.ArrayList();
                                                    try {
                                                        com.google.android.gms.measurement.internal.zzgs v21_4 = v9_26.zze();
                                                        com.google.android.gms.internal.measurement.zzfu v14_8 = v9_26.zzu.zzaZ().currentTimeMillis();
                                                        int v4_2 = v21_4.query("no_data_mode_events", new String[] {"data"}), "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[] {p33, String.valueOf(v14_8)}), 0, 0, "rowid", 0);
                                                        int v16_0 = v11_1;
                                                        com.google.android.gms.measurement.internal.zzls v11_19 = v21_4;
                                                        try {
                                                            int v23_3;
                                                            if (!v4_2.moveToFirst()) {
                                                                v23_3 = v4_2;
                                                                v23_3.close();
                                                                android.util.Pair v0_55 = v16_0.iterator();
                                                                int v4_12 = 1;
                                                                while (v0_55.hasNext()) {
                                                                    int v5_24 = ((android.util.Pair) v0_55.next());
                                                                    com.google.android.gms.internal.measurement.zzib v9_31 = ((com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) v5_24.first).zzcl());
                                                                    if ((v4_12 != 0) && (!v10_13.isEmpty())) {
                                                                        int v4_13 = v9_31.zzb();
                                                                        v9_31.zzi();
                                                                        v9_31.zzh(v10_13);
                                                                        v9_31.zzh(v4_13);
                                                                        v4_12 = 0;
                                                                    }
                                                                    com.google.android.gms.measurement.internal.zzls v11_24 = com.google.android.gms.internal.measurement.zzho.zzb();
                                                                    java.util.Map v12_29 = this.zzh().zzx(p33);
                                                                    int v13_17 = new java.util.ArrayList();
                                                                    if (v12_29 != null) {
                                                                        java.util.Map v12_31 = v12_29.zza().iterator();
                                                                        while (v12_31.hasNext()) {
                                                                            int v23_4;
                                                                            String v10_15;
                                                                            android.util.Pair v0_57;
                                                                            com.google.android.gms.internal.measurement.zzfu v14_16 = ((com.google.android.gms.internal.measurement.zzfu) v12_31.next());
                                                                            StringBuilder v15_7 = com.google.android.gms.internal.measurement.zzhl.zza();
                                                                            com.google.android.gms.measurement.internal.zzgs v21_7 = v0_55;
                                                                            android.util.Pair v0_56 = (v14_16.zzb() - 1);
                                                                            int v16_3 = v4_12;
                                                                            if (v0_56 == 1) {
                                                                                v23_4 = v10_13;
                                                                                v10_15 = 3;
                                                                                v0_57 = 2;
                                                                            } else {
                                                                                if (v0_56 == 2) {
                                                                                    v23_4 = v10_13;
                                                                                    v10_15 = 3;
                                                                                    v0_57 = 3;
                                                                                } else {
                                                                                    v23_4 = v10_13;
                                                                                    v10_15 = 3;
                                                                                    if (v0_56 == 3) {
                                                                                        v0_57 = 4;
                                                                                    } else {
                                                                                        if (v0_56 == 4) {
                                                                                            v0_57 = 5;
                                                                                        } else {
                                                                                            v0_57 = 1;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            v15_7.zza(v0_57);
                                                                            android.util.Pair v0_60 = (v14_16.zzd() - 1);
                                                                            if (v0_60 == 1) {
                                                                                v10_15 = 2;
                                                                            } else {
                                                                                if (v0_60 != 2) {
                                                                                    v10_15 = 1;
                                                                                }
                                                                            }
                                                                            v15_7.zzb(v10_15);
                                                                            v13_17.add(((com.google.android.gms.internal.measurement.zzhl) v15_7.zzbc()));
                                                                            v4_12 = v16_3;
                                                                            v0_55 = v21_7;
                                                                            v10_13 = v23_4;
                                                                        }
                                                                    }
                                                                    com.google.android.gms.measurement.internal.zzgs v21_8 = v0_55;
                                                                    int v16_4 = v4_12;
                                                                    int v23_5 = v10_13;
                                                                    v11_24.zza(v13_17);
                                                                    v9_31.zzaQ(v11_24);
                                                                    v7_18.add(android.util.Pair.create(((com.google.android.gms.internal.measurement.zzid) v9_31.zzbc()), ((Long) v5_24.second)));
                                                                    v4_12 = v16_4;
                                                                    v0_55 = v21_8;
                                                                    v10_13 = v23_5;
                                                                }
                                                                v11_1 = v7_18;
                                                            } else {
                                                                com.google.android.gms.measurement.internal.zzgs v21_5 = v14_8;
                                                                try {
                                                                    while(true) {
                                                                        v10_13.add(((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), v4_2.getBlob(0))).zzbc()));
                                                                        v23_3 = v4_2;
                                                                        v4_2 = v23_3;
                                                                    }
                                                                    v23_3.close();
                                                                    try {
                                                                        android.util.Pair v0_53 = v11_19.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[] {p33, String.valueOf(v21_5)}));
                                                                        int v4_8 = v9_26.zzu.zzaV().zzk();
                                                                        com.google.android.gms.measurement.internal.zzls v11_22 = new StringBuilder((String.valueOf(v0_53).length() + 34));
                                                                        v11_22.append("Pruned ");
                                                                        v11_22.append(v0_53);
                                                                        v11_22.append(" NO_DATA mode events. appId");
                                                                        v4_8.zzb(v11_22.toString(), p33);
                                                                    } catch (android.util.Pair v0_42) {
                                                                        v23_3 = 0;
                                                                        v9_26.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33), v0_42);
                                                                        v10_13 = java.util.Collections.EMPTY_LIST;
                                                                        if (v23_3 == 0) {
                                                                        }
                                                                    }
                                                                } catch (android.util.Pair v0_49) {
                                                                    v23_3 = v4_2;
                                                                    v9_26.zzu.zzaV().zzh().zzc("Failed to parse stored NO_DATA mode event, appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33), v0_49);
                                                                } catch (android.util.Pair v0_42) {
                                                                }
                                                                if (v23_3.moveToNext()) {
                                                                }
                                                            }
                                                        } catch (android.util.Pair v0_42) {
                                                            v23_3 = v4_2;
                                                        } catch (android.util.Pair v0_50) {
                                                            v23_3 = v4_2;
                                                            int v13_15 = v23_3;
                                                            if (v13_15 != 0) {
                                                                v13_15.close();
                                                            }
                                                            throw v0_50;
                                                        }
                                                    } catch (android.util.Pair v0_42) {
                                                        v16_0 = v11_19;
                                                    } catch (android.util.Pair v0_50) {
                                                        v13_15 = 0;
                                                    } catch (android.util.Pair v0_50) {
                                                    }
                                                } else {
                                                    Long v7_20 = java.util.Arrays.asList(((String) com.google.android.gms.measurement.internal.zzfy.zzbi.zzb(0)).split(","));
                                                    com.google.android.gms.internal.measurement.zzib v9_32 = v11_1.iterator();
                                                    while (v9_32.hasNext()) {
                                                        android.util.Pair v0_2 = ((android.util.Pair) v9_32.next());
                                                        try {
                                                            this.zzj().zzH(((Long) v0_2.second).longValue());
                                                            String v10_7 = ((com.google.android.gms.internal.measurement.zzid) v0_2.first).zzc().iterator();
                                                        } catch (android.database.sqlite.SQLiteException) {
                                                            this.zzaV().zzh().zzb("Failed handling NO_DATA mode bundles. appId", p33);
                                                        }
                                                        while (v10_7.hasNext()) {
                                                            android.util.Pair v0_10 = ((com.google.android.gms.internal.measurement.zzhs) v10_7.next());
                                                            if (v7_20.contains(v0_10.zzd())) {
                                                                if ((v0_10.zzd().equals("_f")) || (v0_10.zzd().equals("_v"))) {
                                                                    android.util.Pair v0_12 = ((com.google.android.gms.internal.measurement.zzhr) v0_10.zzcl());
                                                                    this.zzp();
                                                                    com.google.android.gms.measurement.internal.zzpk.zzC(v0_12, "_dac", Long.valueOf(1));
                                                                    v0_10 = ((com.google.android.gms.internal.measurement.zzhs) v0_12.zzbc());
                                                                }
                                                                com.google.android.gms.measurement.internal.zzls v11_15 = this.zzj();
                                                                v11_15.zzg();
                                                                v11_15.zzaw();
                                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_10);
                                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p33);
                                                                java.util.Map v12_11 = v11_15.zzu;
                                                                v12_11.zzaV().zzk().zzb("Caching events in NO_DATA mode", v0_10);
                                                                int v13_3 = new android.content.ContentValues();
                                                                v13_3.put("app_id", p33);
                                                                v13_3.put("name", v0_10.zzd());
                                                                v13_3.put("data", v0_10.zzcc());
                                                                v13_3.put("timestamp_millis", Long.valueOf(v0_10.zzf()));
                                                                try {
                                                                    if (v11_15.zze().insert("no_data_mode_events", 0, v13_3) == v23_2) {
                                                                        v12_11.zzaV().zzb().zzb("Failed to insert NO_DATA mode event (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33));
                                                                    }
                                                                } catch (android.util.Pair v0_17) {
                                                                    v11_15.zzu.zzaV().zzb().zzc("Error storing NO_DATA mode event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33), v0_17);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v11_1 = java.util.Collections.EMPTY_LIST;
                                                }
                                            }
                                            if (v11_1.isEmpty()) {
                                                return;
                                            }
                                        }
                                        int v4_21 = com.google.android.gms.measurement.internal.zzjk.zza;
                                        if (this.zzB(p33).zzo(v4_21)) {
                                            android.util.Pair v0_74 = v11_1.iterator();
                                            while (v0_74.hasNext()) {
                                                int v5_29 = ((com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) v0_74.next()).first);
                                                if (!v5_29.zzG().isEmpty()) {
                                                    android.util.Pair v0_76 = v5_29.zzG();
                                                }
                                                if (v0_76 != null) {
                                                    com.google.android.gms.internal.measurement.zzib v9_7 = 0;
                                                    while (v9_7 < v11_1.size()) {
                                                        int v5_34 = ((com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) v11_1.get(v9_7)).first);
                                                        if ((v5_34.zzG().isEmpty()) || (v5_34.zzG().equals(v0_76))) {
                                                            v9_7++;
                                                        } else {
                                                            v11_1 = v11_1.subList(0, v9_7);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            v0_76 = 0;
                                        }
                                        com.google.android.gms.internal.measurement.zzib v9_5;
                                        android.util.Pair v0_77 = com.google.android.gms.internal.measurement.zzib.zzh();
                                        int v5_9 = v11_1.size();
                                        Long v7_26 = new java.util.ArrayList(v11_1.size());
                                        if ((!this.zzd().zzC(p33)) || (!this.zzB(p33).zzo(v4_21))) {
                                            v9_5 = 0;
                                        } else {
                                            v9_5 = 1;
                                        }
                                        int v4_0 = this.zzB(p33).zzo(v4_21);
                                        String v10_3 = this.zzB(p33).zzo(com.google.android.gms.measurement.internal.zzjk.zzb);
                                        com.google.android.gms.internal.measurement.zzrb.zza();
                                        java.util.Map v12_0 = this.zzd().zzp(p33, com.google.android.gms.measurement.internal.zzfy.zzaM);
                                        int v13_19 = this.zzl;
                                        com.google.android.gms.internal.measurement.zzfu v14_18 = v13_19.zza(p33);
                                        StringBuilder v15_0 = 0;
                                        while (v15_0 < v5_9) {
                                            com.google.android.gms.measurement.internal.zzgs v21_10 = v4_0;
                                            int v4_34 = ((com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) v11_1.get(v15_0)).first).zzcl());
                                            com.google.android.gms.internal.measurement.zziu v22_7 = v5_9;
                                            v7_26.add(((Long) ((android.util.Pair) v11_1.get(v15_0)).second));
                                            this.zzd().zzi();
                                            int v5_55 = v9_5;
                                            int v16_7 = v10_3;
                                            v4_34.zzO(133005);
                                            v4_34.zzs(p34);
                                            this.zzn.zzaU();
                                            v4_34.zzae(0);
                                            if (v5_55 == 0) {
                                                v4_34.zzan();
                                            }
                                            if (v21_10 == null) {
                                                v4_34.zzR();
                                                v4_34.zzU();
                                            }
                                            if (v16_7 == 0) {
                                                v4_34.zzX();
                                            }
                                            this.zzS(p33, v4_34);
                                            if (v12_0 == null) {
                                                v4_34.zzav();
                                            }
                                            if (v16_7 == 0) {
                                                v4_34.zzag();
                                            }
                                            boolean v25_0;
                                            boolean v27_1;
                                            String v29_0;
                                            com.google.android.gms.internal.measurement.zzhs v28_0;
                                            String v10_36 = v4_34.zzP();
                                            if ((!android.text.TextUtils.isEmpty(v10_36)) && (!v10_36.equals("00000000-0000-0000-0000-000000000000"))) {
                                                v25_0 = v5_55;
                                                v28_0 = v11_1;
                                                v27_1 = v12_0;
                                                v29_0 = v15_0;
                                            } else {
                                                com.google.android.gms.internal.measurement.zzib v9_0 = new java.util.ArrayList(v4_34.zzb());
                                                v25_0 = v5_55;
                                                java.util.Iterator v26_0 = v9_0.iterator();
                                                int v5_1 = 0;
                                                String v10_2 = 0;
                                                int v23_0 = 0;
                                                int v24_0 = 0;
                                                while (v26_0.hasNext()) {
                                                    com.google.android.gms.internal.measurement.zzhs v28_1 = v11_1;
                                                    com.google.android.gms.measurement.internal.zzls v11_3 = ((com.google.android.gms.internal.measurement.zzhs) v26_0.next());
                                                    boolean v27_3 = v12_0;
                                                    String v29_1 = v15_0;
                                                    if (!"_fx".equals(v11_3.zzd())) {
                                                        if (!"_f".equals(v11_3.zzd())) {
                                                            v12_0 = v27_3;
                                                            v11_1 = v28_1;
                                                            v15_0 = v29_1;
                                                        } else {
                                                            this.zzp();
                                                            java.util.Map v12_6 = com.google.android.gms.measurement.internal.zzpk.zzF(v11_3, "_pfo");
                                                            if (v12_6 != null) {
                                                                v5_1 = Long.valueOf(v12_6.zzf());
                                                            }
                                                            this.zzp();
                                                            com.google.android.gms.measurement.internal.zzls v11_4 = com.google.android.gms.measurement.internal.zzpk.zzF(v11_3, "_uwa");
                                                            if (v11_4 != null) {
                                                                v10_2 = Long.valueOf(v11_4.zzf());
                                                            }
                                                            v12_0 = v27_3;
                                                            v11_1 = v28_1;
                                                            v15_0 = v29_1;
                                                        }
                                                    } else {
                                                        v26_0.remove();
                                                        v12_0 = v27_3;
                                                        v11_1 = v28_1;
                                                        v15_0 = v29_1;
                                                        v23_0 = 1;
                                                    }
                                                    v24_0 = 1;
                                                }
                                                v28_0 = v11_1;
                                                v27_1 = v12_0;
                                                v29_0 = v15_0;
                                                if (v23_0 != 0) {
                                                    v4_34.zzi();
                                                    v4_34.zzh(v9_0);
                                                }
                                                if (v24_0 != 0) {
                                                    this.zzR(v4_34.zzK(), 1, v5_1, v10_2);
                                                }
                                            }
                                            if (v4_34.zzc() != 0) {
                                                if (this.zzd().zzp(p33, com.google.android.gms.measurement.internal.zzfy.zzaC)) {
                                                    v4_34.zzas(this.zzp().zzt(((com.google.android.gms.internal.measurement.zzid) v4_34.zzbc()).zzcc()));
                                                }
                                                int v5_8 = v14_18.zzd();
                                                if (v5_8 != 0) {
                                                    v4_34.zzaN(v5_8);
                                                }
                                                v0_77.zze(v4_34);
                                            }
                                            v15_0 = (v29_0 + 1);
                                            v10_3 = v16_7;
                                            v4_0 = v21_10;
                                            v5_9 = v22_7;
                                            v9_5 = v25_0;
                                            v12_0 = v27_1;
                                            v11_1 = v28_0;
                                        }
                                        if (v0_77.zzb() != 0) {
                                            com.google.android.gms.internal.measurement.zzic v8_4;
                                            int v4_24 = ((com.google.android.gms.internal.measurement.zzib) v0_77.zzbc());
                                            int v5_39 = new java.util.ArrayList();
                                            if (v14_18.zzc() != com.google.android.gms.measurement.internal.zzls.zzd) {
                                                v8_4 = 0;
                                            } else {
                                                v8_4 = 1;
                                            }
                                            int v4_25;
                                            int v13_20;
                                            if (v14_18.zzc() == com.google.android.gms.measurement.internal.zzls.zzc) {
                                                v4_25 = v8_4;
                                                com.google.android.gms.internal.measurement.zzic v8_8 = ((com.google.android.gms.internal.measurement.zzib) v0_77.zzbc()).zza().iterator();
                                                while (v8_8.hasNext()) {
                                                    if (((com.google.android.gms.internal.measurement.zzid) v8_8.next()).zzY()) {
                                                        com.google.android.gms.internal.measurement.zzic v8_9 = java.util.UUID.randomUUID().toString();
                                                    }
                                                    com.google.android.gms.internal.measurement.zzib v9_47 = ((com.google.android.gms.internal.measurement.zzib) v0_77.zzbc());
                                                    this.zzaW().zzg();
                                                    this.zzu();
                                                    String v10_20 = com.google.android.gms.internal.measurement.zzib.zzi(v9_47);
                                                    if (!android.text.TextUtils.isEmpty(v8_9)) {
                                                        v10_20.zzi(v8_9);
                                                    }
                                                    com.google.android.gms.measurement.internal.zzls v11_28 = this.zzh().zzc(p33);
                                                    if (!android.text.TextUtils.isEmpty(v11_28)) {
                                                        v10_20.zzj(v11_28);
                                                    }
                                                    com.google.android.gms.measurement.internal.zzls v11_30 = new java.util.ArrayList();
                                                    com.google.android.gms.internal.measurement.zzib v9_49 = v9_47.zza().iterator();
                                                    while (v9_49.hasNext()) {
                                                        java.util.Map v12_49 = com.google.android.gms.internal.measurement.zzid.zzaF(((com.google.android.gms.internal.measurement.zzid) v9_49.next()));
                                                        v12_49.zzan();
                                                        v11_30.add(((com.google.android.gms.internal.measurement.zzid) v12_49.zzbc()));
                                                    }
                                                    com.google.android.gms.measurement.internal.zzls v11_32;
                                                    v10_20.zzg();
                                                    v10_20.zzf(v11_30);
                                                    com.google.android.gms.internal.measurement.zzib v9_51 = this.zzaV().zzk();
                                                    if (!android.text.TextUtils.isEmpty(v8_9)) {
                                                        v11_32 = v10_20.zzh();
                                                    } else {
                                                        v11_32 = "null";
                                                    }
                                                    v9_51.zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", v11_32);
                                                    com.google.android.gms.internal.measurement.zzib v9_53 = ((com.google.android.gms.internal.measurement.zzib) v10_20.zzbc());
                                                    if (android.text.TextUtils.isEmpty(v8_9)) {
                                                        v13_20 = 0;
                                                    } else {
                                                        android.util.Pair v0_82 = ((com.google.android.gms.internal.measurement.zzib) v0_77.zzbc());
                                                        this.zzaW().zzg();
                                                        this.zzu();
                                                        String v10_23 = com.google.android.gms.internal.measurement.zzib.zzh();
                                                        this.zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", v8_9);
                                                        v10_23.zzi(v8_9);
                                                        android.util.Pair v0_84 = v0_82.zza().iterator();
                                                        while (v0_84.hasNext()) {
                                                            com.google.android.gms.internal.measurement.zzic v8_25 = ((com.google.android.gms.internal.measurement.zzid) v0_84.next());
                                                            com.google.android.gms.measurement.internal.zzls v11_40 = com.google.android.gms.internal.measurement.zzid.zzaE();
                                                            v11_40.zzam(v8_25.zzZ());
                                                            v11_40.zzaJ(v8_25.zzav());
                                                            v10_23.zze(v11_40);
                                                        }
                                                        com.google.android.gms.internal.measurement.zzic v8_16;
                                                        android.util.Pair v0_86 = ((com.google.android.gms.internal.measurement.zzib) v10_23.zzbc());
                                                        com.google.android.gms.internal.measurement.zzic v8_14 = v13_19.zzg.zzh().zzc(p33);
                                                        if (android.text.TextUtils.isEmpty(v8_14)) {
                                                            com.google.android.gms.measurement.internal.zzls v11_35;
                                                            v13_20 = 0;
                                                            Object vtmp349 = com.google.android.gms.measurement.internal.zzfy.zzr.zzb(0);
                                                            if (v4_25 == 0) {
                                                                v11_35 = com.google.android.gms.measurement.internal.zzls.zzb;
                                                            } else {
                                                                v11_35 = com.google.android.gms.measurement.internal.zzls.zze;
                                                            }
                                                            v8_16 = new com.google.android.gms.measurement.internal.zzot(((String) vtmp349), java.util.Collections.EMPTY_MAP, v11_35, 0);
                                                        } else {
                                                            com.google.android.gms.measurement.internal.zzls v11_38;
                                                            String v10_31 = android.net.Uri.parse(((String) com.google.android.gms.measurement.internal.zzfy.zzr.zzb(0)));
                                                            com.google.android.gms.measurement.internal.zzls v11_37 = v10_31.buildUpon();
                                                            String v10_32 = v10_31.getAuthority();
                                                            StringBuilder v15_10 = new StringBuilder(((String.valueOf(v8_14).length() + 1) + String.valueOf(v10_32).length()));
                                                            v15_10.append(v8_14);
                                                            v15_10.append(".");
                                                            v15_10.append(v10_32);
                                                            v11_37.authority(v15_10.toString());
                                                            String v10_34 = v11_37.build().toString();
                                                            if (v4_25 == 0) {
                                                                v11_38 = com.google.android.gms.measurement.internal.zzls.zzb;
                                                            } else {
                                                                v11_38 = com.google.android.gms.measurement.internal.zzls.zze;
                                                            }
                                                            v13_20 = 0;
                                                            v8_16 = new com.google.android.gms.measurement.internal.zzot(v10_34, java.util.Collections.EMPTY_MAP, v11_38, 0);
                                                        }
                                                        v5_39.add(android.util.Pair.create(v0_86, v8_16));
                                                    }
                                                    if (v4_25 == 0) {
                                                        v4_24 = v9_53;
                                                    } else {
                                                        android.util.Pair v0_92 = ((com.google.android.gms.internal.measurement.zzhz) v9_53.zzcl());
                                                        int v4_26 = 0;
                                                        while (v4_26 < v9_53.zzb()) {
                                                            com.google.android.gms.internal.measurement.zzic v8_23 = ((com.google.android.gms.internal.measurement.zzic) v9_53.zzc(v4_26).zzcl());
                                                            v8_23.zzt();
                                                            v8_23.zzaO(p34);
                                                            v0_92.zzd(v4_26, v8_23);
                                                            v4_26++;
                                                        }
                                                        v5_39.add(android.util.Pair.create(((com.google.android.gms.internal.measurement.zzib) v0_92.zzbc()), v14_18));
                                                        this.zzL(v7_26);
                                                        this.zzV(0, 204, 0, 0, p33, v5_39);
                                                        if (this.zzO(p33, v14_18.zza())) {
                                                            this.zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", p33);
                                                            android.util.Pair v0_101 = new android.content.Intent();
                                                            v0_101.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                            v0_101.setPackage(p33);
                                                            com.google.android.gms.measurement.internal.zzpg.zzaQ(this.zzn.zzaY(), v0_101);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                v8_9 = 0;
                                            } else {
                                                if (v8_4 == null) {
                                                    v13_20 = 0;
                                                } else {
                                                    v4_25 = 1;
                                                }
                                            }
                                            android.util.Pair v0_89 = v5_39;
                                            if (this.zzi().zzb()) {
                                                if (android.util.Log.isLoggable(this.zzaV().zzn(), 2)) {
                                                    v13_20 = this.zzp().zzi(v4_24);
                                                }
                                                this.zzp();
                                                int v5_46 = v4_24.zzcc();
                                                this.zzL(v7_26);
                                                this.zzk.zze.zzb(p34);
                                                this.zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", p33, Integer.valueOf(v5_46.length), v13_20);
                                                this.zzv = 1;
                                                this.zzi().zzc(p33, v14_18, v4_24, new com.google.android.gms.measurement.internal.zzow(this, p33, v0_89));
                                            }
                                        } else {
                                            this.zzL(v7_26);
                                            this.zzV(0, 204, 0, 0, p33, java.util.Collections.EMPTY_LIST);
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                            if (!v11_1.isEmpty()) {
                                com.google.android.gms.internal.measurement.zzib v9_12 = ((com.google.android.gms.internal.measurement.zzid) ((android.util.Pair) v11_1.get(0)).first);
                                java.util.Map v12_18 = ((com.google.android.gms.internal.measurement.zzid) v7_9.zzbc());
                                com.google.android.gms.measurement.internal.zzgs v21_0 = v9_12;
                                if ((!v9_12.zzaf().equals(v12_18.zzaf())) || ((!v21_0.zzam().equals(v12_18.zzam())) || ((v21_0.zzao() != v12_18.zzao()) || (!v21_0.zzaq().equals(v12_18.zzaq()))))) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzib v9_21 = v21_0.zzf().iterator();
                                while(true) {
                                    java.util.Map v12_19;
                                    com.google.android.gms.internal.measurement.zziu v22_0;
                                    com.google.android.gms.measurement.internal.zzgs v21_1 = v9_21;
                                    if (!v9_21.hasNext()) {
                                        v22_0 = v12_18;
                                        v12_19 = -1;
                                    } else {
                                        int v13_12 = ((com.google.android.gms.internal.measurement.zziu) v21_1.next());
                                        v22_0 = v12_18;
                                        if ("_npa".equals(v13_12.zzc())) {
                                            break;
                                        }
                                        v9_21 = v21_1;
                                        v12_18 = v22_0;
                                    }
                                    com.google.android.gms.measurement.internal.zzgs v21_3 = v22_0.zzf().iterator();
                                    while (v21_3.hasNext()) {
                                        com.google.android.gms.internal.measurement.zziu v22_3 = ((com.google.android.gms.internal.measurement.zziu) v21_3.next());
                                        boolean v25_1 = v12_19;
                                        if (!"_npa".equals(v22_3.zzc())) {
                                            v12_19 = v25_1;
                                        } else {
                                            java.util.Map v12_22 = v22_3.zzg();
                                        }
                                        if (v25_1 != v12_22) {
                                            v22_4 = v10_10;
                                        }
                                    }
                                    v25_1 = v12_19;
                                    v12_22 = -1;
                                }
                                v12_19 = v13_12.zzg();
                            }
                            if (!v10_10.isNull(2)) {
                                v7_9.zzao(v10_10.getInt(2));
                            }
                            v14_6 += v0_102.length;
                            v11_1.add(android.util.Pair.create(((com.google.android.gms.internal.measurement.zzid) v7_9.zzbc()), Long.valueOf(v15_8)));
                        }
                    } else {
                        android.util.Pair v0_28 = java.util.Collections.EMPTY_LIST;
                        v10_10.close();
                        v11_1 = v0_28;
                    }
                } catch (android.util.Pair v0_7) {
                    v22_4 = v10_10;
                } catch (android.util.Pair v0_3) {
                    v22_4 = v10_10;
                    int v13_13 = v22_4;
                    if (v13_13 != 0) {
                        v13_13.close();
                    }
                    throw v0_3;
                }
                v10_10 = v22_4;
                try {
                    v8_0.zzu.zzaV().zzb().zzc("Error querying bundles. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p33), v0_7);
                    v0_28 = java.util.Collections.EMPTY_LIST;
                } catch (android.util.Pair v0_3) {
                    v13_13 = v10_10;
                }
                if (v10_10 == null) {
                } else {
                }
            } catch (android.util.Pair v0_7) {
                v10_10 = 0;
            }
        } catch (android.util.Pair v0_7) {
            v23_2 = -1;
        } catch (android.util.Pair v0_3) {
            v13_13 = 0;
        }
    }

    public final boolean zzO(String p4, String p5)
    {
        String v0_1 = this.zzj().zzu(p4);
        if ((v0_1 != null) && (this.zzt().zzaa(p4, v0_1.zzay()))) {
            this.zzF.remove(p5);
            return 1;
        } else {
            boolean v4_5 = ((com.google.android.gms.measurement.internal.zzpe) this.zzF.get(p5));
            if (v4_5) {
                return v4_5.zzb();
            } else {
                return 1;
            }
        }
    }

    public final void zzP(String p9)
    {
        this.zzaW().zzg();
        this.zzu();
        this.zzw = 1;
        com.google.android.gms.measurement.internal.zzpj v2_13 = this.zzn;
        v2_13.zzaU();
        com.google.android.gms.measurement.internal.zzpj v2_1 = v2_13.zzt().zzJ();
        if (v2_1 != null) {
            if (!v2_1.booleanValue()) {
                if (this.zza <= 0) {
                    if (this.zzi().zzb()) {
                        if (this.zzj().zzD(p9)) {
                            com.google.android.gms.measurement.internal.zzpj v2_12;
                            com.google.android.gms.measurement.internal.zzpj v2_9 = this.zzj();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9);
                            v2_9.zzg();
                            v2_9.zzaw();
                            com.google.android.gms.measurement.internal.zzpj v2_10 = v2_9.zzC(p9, com.google.android.gms.measurement.internal.zzoo.zza(new com.google.android.gms.measurement.internal.zzls[] {com.google.android.gms.measurement.internal.zzls.zzb})), 1);
                            if (!v2_10.isEmpty()) {
                                v2_12 = ((com.google.android.gms.measurement.internal.zzpj) v2_10.get(0));
                            } else {
                                v2_12 = 0;
                            }
                            if (v2_12 != null) {
                                com.google.android.gms.internal.measurement.zzib v3_4 = v2_12.zzd();
                                if (v3_4 != null) {
                                    this.zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", p9, v2_12.zzf(), v2_12.zze());
                                    com.google.android.gms.measurement.internal.zzot v4_3 = v3_4.zzcc();
                                    if (android.util.Log.isLoggable(this.zzaV().zzn(), 2)) {
                                        this.zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", p9, Integer.valueOf(v4_3.length), this.zzp().zzi(v3_4));
                                    }
                                    com.google.android.gms.measurement.internal.zzot v4_6 = v2_12.zza();
                                    this.zzv = 1;
                                    this.zzi().zzc(p9, v4_6, v3_4, new com.google.android.gms.measurement.internal.zzox(this, p9, v2_12));
                                }
                            }
                        } else {
                            this.zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", p9);
                        }
                    } else {
                        this.zzaV().zzk().zza("Network not connected, ignoring upload request");
                        this.zzaL();
                    }
                } else {
                    this.zzaL();
                }
            } else {
                this.zzaV().zzb().zza("Upload called in the client side when service should be used");
            }
        } else {
            this.zzaV().zze().zza("Upload data called on the client side before use of service was decided");
        }
        this.zzw = 0;
        this.zzaM();
        return;
    }

    public final void zzQ(String p4, int p5, Throwable p6, byte[] p7, com.google.android.gms.measurement.internal.zzpj p8)
    {
        this.zzaW().zzg();
        this.zzu();
        if (p7 == null) {
            p7 = new byte[0];
        }
        if (p5 == 200) {
            if (p6 != null) {
                com.google.android.gms.measurement.internal.zzgs v1_1 = new String(p7, java.nio.charset.StandardCharsets.UTF_8);
                String v7_3 = v1_1.substring(0, Math.min(32, v1_1.length()));
                com.google.android.gms.measurement.internal.zzgs v1_3 = this.zzaV().zzh();
                boolean v5_1 = Integer.valueOf(p5);
                if (p6 == null) {
                    p6 = v7_3;
                }
                v1_3.zzd("Network upload failed. Will retry later. appId, status, error", p4, v5_1, p6);
                this.zzj().zzK(Long.valueOf(p8.zzc()));
                this.zzaL();
            } else {
                this.zzj().zzE(Long.valueOf(p8.zzc()));
                this.zzaV().zzk().zzc("Successfully uploaded batch from upload queue. appId, status", p4, Integer.valueOf(p5));
                if ((!this.zzi().zzb()) || (!this.zzj().zzD(p4))) {
                    this.zzaL();
                } else {
                    this.zzP(p4);
                }
            }
        } else {
            if (p5 != 204) {
            } else {
                p5 = 204;
            }
        }
        this.zzv = 0;
        this.zzaM();
        return;
    }

    public final void zzR(String p2, boolean p3, Long p4, Long p5)
    {
        com.google.android.gms.measurement.internal.zzh v2_1 = this.zzj().zzu(p2);
        if (v2_1 != null) {
            v2_1.zzar(p3);
            v2_1.zzat(p4);
            v2_1.zzav(p5);
            if (v2_1.zza()) {
                this.zzj().zzv(v2_1, 0, 0);
            }
        }
        return;
    }

    public final void zzS(String p7, com.google.android.gms.internal.measurement.zzic p8)
    {
        String v0_5 = this.zzh().zzl(p7);
        if (v0_5 != null) {
            p8.zzaw(v0_5);
        }
        if (this.zzh().zzp(p7)) {
            p8.zzG();
        }
        if (this.zzh().zzq(p7)) {
            String v0_3 = p8.zzD();
            if (!android.text.TextUtils.isEmpty(v0_3)) {
                int v2_2 = v0_3.indexOf(".");
                if (v2_2 != -1) {
                    p8.zzE(v0_3.substring(0, v2_2));
                }
            }
        }
        if (this.zzh().zzr(p7)) {
            String v0_9 = com.google.android.gms.measurement.internal.zzpk.zzx(p8, "_id");
            if (v0_9 != -1) {
                p8.zzr(v0_9);
            }
        }
        if (this.zzh().zzs(p7)) {
            p8.zzan();
        }
        if (this.zzh().zzt(p7)) {
            p8.zzX();
            if (this.zzB(p7).zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
                String v0_16 = this.zzE;
                com.google.android.gms.measurement.internal.zzpd v1_3 = ((com.google.android.gms.measurement.internal.zzpd) v0_16.get(p7));
                if ((v1_3 == null) || ((this.zzd().zzl(p7, com.google.android.gms.measurement.internal.zzfy.zzak) + v1_3.zzb) < this.zzaZ().elapsedRealtime())) {
                    v1_3 = new com.google.android.gms.measurement.internal.zzpd(this, 0);
                    v0_16.put(p7, v1_3);
                }
                p8.zzax(v1_3.zza);
            }
        }
        if (this.zzh().zzu(p7)) {
            p8.zzav();
        }
        return;
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzic p24, com.google.android.gms.measurement.internal.zzpc p25)
    {
        int v3 = 0;
        while (v3 < p24.zzc()) {
            com.google.android.gms.internal.measurement.zzhs v4_1 = ((com.google.android.gms.internal.measurement.zzhr) p24.zzd(v3).zzcl());
            java.util.Deque v5_9 = v4_1.zza().iterator();
            while (v5_9.hasNext()) {
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) v5_9.next()).zzb())) {
                    if (p25.zza.zzar() >= this.zzd().zzm(p25.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzal)) {
                        java.util.Deque v5_22 = this.zzd().zzm(p25.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzay);
                        String v8_0 = 0;
                        if (v5_22 <= null) {
                            if (this.zzd().zzp(p25.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzaR)) {
                                v8_0 = this.zzt().zzaw();
                                java.util.Deque v5_26 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                v5_26.zzb("_tu");
                                v5_26.zzd(v8_0);
                                v4_1.zzf(((com.google.android.gms.internal.measurement.zzhw) v5_26.zzbc()));
                            }
                            java.util.Deque v5_29 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            v5_29.zzb("_tr");
                            v5_29.zzf(1);
                            v4_1.zzf(((com.google.android.gms.internal.measurement.zzhw) v5_29.zzbc()));
                            java.util.Deque v5_33 = this.zzp().zzf(p25.zza.zzA(), p24, v4_1, v8_0);
                            if (v5_33 != null) {
                                this.zzaV().zzk().zzc("Generated trigger URI. appId, uri", p25.zza.zzA(), v5_33.zza);
                                this.zzj().zzY(p25.zza.zzA(), v5_33);
                                java.util.Deque v5_0 = this.zzr;
                                if (!v5_0.contains(p25.zza.zzA())) {
                                    v5_0.add(p25.zza.zzA());
                                }
                            }
                        } else {
                            if (this.zzj().zzw(this.zzC(), p25.zza.zzA(), 0, 0, 0, 0, 0, 0, 1).zzg <= ((long) v5_22)) {
                                if (this.zzd().zzp(p25.zza.zzA(), com.google.android.gms.measurement.internal.zzfy.zzaR)) {
                                    v8_0 = this.zzt().zzaw();
                                    java.util.Deque v5_6 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                    v5_6.zzb("_tu");
                                    v5_6.zzd(v8_0);
                                    v4_1.zzf(((com.google.android.gms.internal.measurement.zzhw) v5_6.zzbc()));
                                }
                                java.util.Deque v5_10 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                v5_10.zzb("_tr");
                                v5_10.zzf(1);
                                v4_1.zzf(((com.google.android.gms.internal.measurement.zzhw) v5_10.zzbc()));
                                java.util.Deque v5_14 = this.zzp().zzf(p25.zza.zzA(), p24, v4_1, v8_0);
                                if (v5_14 != null) {
                                    this.zzaV().zzk().zzc("Generated trigger URI. appId, uri", p25.zza.zzA(), v5_14.zza);
                                    this.zzj().zzY(p25.zza.zzA(), v5_14);
                                    java.util.Deque v5_15 = this.zzr;
                                    if (!v5_15.contains(p25.zza.zzA())) {
                                        v5_15.add(p25.zza.zzA());
                                    }
                                }
                            } else {
                                java.util.Deque v5_16 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                v5_16.zzb("_tnr");
                                v5_16.zzf(1);
                                v4_1.zzf(((com.google.android.gms.internal.measurement.zzhw) v5_16.zzbc()));
                            }
                        }
                    }
                    p24.zze(v3, ((com.google.android.gms.internal.measurement.zzhs) v4_1.zzbc()));
                    break;
                }
            }
            v3++;
        }
        return;
    }

    public final void zzU(String p10, com.google.android.gms.internal.measurement.zzhv p11, android.os.Bundle p12, String p13)
    {
        String v10_3;
        long v0_7 = com.google.android.gms.common.util.CollectionUtils.listOf(new String[] {"_o", "_sn", "_sc", "_si"}));
        if ((!com.google.android.gms.measurement.internal.zzpp.zzZ(p11.zza())) && (!com.google.android.gms.measurement.internal.zzpp.zzZ(p10))) {
            v10_3 = this.zzd().zze(p13, 1);
        } else {
            v10_3 = this.zzd().zzf(p13, 1);
        }
        long v3_0 = ((long) v10_3);
        long v5_1 = ((long) p11.zzc().codePointCount(0, p11.zzc().length()));
        String v10_7 = this.zzt();
        String v1_4 = p11.zza();
        this.zzd();
        String v10_8 = v10_7.zzC(v1_4, 40, 1);
        if ((v5_1 > v3_0) && (!v0_7.contains(p11.zza()))) {
            if (!"_ev".equals(p11.zza())) {
                this.zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", v10_8, Long.valueOf(v5_1));
                if (p12.getLong("_err") == 0) {
                    p12.putLong("_err", 4);
                    if (p12.getString("_ev") == null) {
                        p12.putString("_ev", v10_8);
                        p12.putLong("_el", v5_1);
                    }
                }
                p12.remove(p11.zza());
            } else {
                p12.putString("_ev", this.zzt().zzC(p11.zzc(), this.zzd().zzf(p13, 1), 1));
                return;
            }
        }
        return;
    }

    public final void zzV(boolean p19, int p20, Throwable p21, byte[] p22, String p23, java.util.List p24)
    {
        Long v3_0;
        void v1 = this;
        boolean v0_0 = p20;
        this.zzaW().zzg();
        this.zzu();
        if (p22 != null) {
            v3_0 = p22;
        } else {
            v3_0 = new byte[0];
        }
        java.util.List v10_1 = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzz));
        this.zzz = 0;
        if (!p19) {
            long v2_25 = this.zzaV().zzk();
            boolean v0_28 = Integer.valueOf(v0_0);
            v2_25.zzc("Network upload successful with code, uploadAttempted", v0_28, Boolean.valueOf(p19));
            if (p19) {
                this.zzk.zzd.zzb(this.zzaZ().currentTimeMillis());
            }
            this.zzk.zze.zzb(0);
            v1 = this.zzaL();
            if (!p19) {
                v1.zzaV().zzk().zza("Purged empty bundles");
            } else {
                v1.zzaV().zzk().zzc("Successful upload. Got network response. code, size", v0_28, Integer.valueOf(v3_0.length));
            }
            v1.zzj().zzb();
            boolean v0_35 = new java.util.HashMap();
            long v14_2 = p24.iterator();
            while (v14_2.hasNext()) {
                long v2_10 = ((android.util.Pair) v14_2.next());
                com.google.android.gms.measurement.internal.zzot v15_1 = ((com.google.android.gms.measurement.internal.zzot) v2_10.second);
                if (v15_1.zzc() != com.google.android.gms.measurement.internal.zzls.zzd) {
                    boolean v4_10 = ((com.google.android.gms.internal.measurement.zzib) v2_10.first);
                    java.util.List v5_7 = v1.zzj().zzA(p23, v4_10, v15_1.zza(), v15_1.zzb(), v15_1.zzc(), 0);
                    if ((v15_1.zzc() == com.google.android.gms.measurement.internal.zzls.zze) && ((v5_7 != -1) && (!v4_10.zze().isEmpty()))) {
                        v0_35.put(v4_10.zze(), Long.valueOf(v5_7));
                    }
                }
            }
            long v14_3 = p24.iterator();
            while (v14_3.hasNext()) {
                long v2_4 = ((android.util.Pair) v14_3.next());
                boolean v4_7 = ((com.google.android.gms.internal.measurement.zzib) v2_4.first);
                long v2_6 = ((com.google.android.gms.measurement.internal.zzot) v2_4.second);
                if (v2_6.zzc() != com.google.android.gms.measurement.internal.zzls.zzd) {
                } else {
                    Long v3_5 = v2_6;
                    v1.zzj().zzA(p23, v4_7, v3_5.zza(), v3_5.zzb(), v3_5.zzc(), ((Long) v0_35.get(v4_7.zze())));
                }
            }
            boolean v0_37 = v1.zzj().zzC(p23, com.google.android.gms.measurement.internal.zzoo.zza(new com.google.android.gms.measurement.internal.zzls[] {com.google.android.gms.measurement.internal.zzls.zzd})), 1);
            if (!v0_37.isEmpty()) {
                boolean v4_20 = ((com.google.android.gms.measurement.internal.zzpj) v0_37.get(0)).zzg();
                if (v1.zzaZ().currentTimeMillis() > (((Long) com.google.android.gms.measurement.internal.zzfy.zzE.zzb(0)).longValue() + v4_20)) {
                    v1.zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", p23, Long.valueOf(v4_20));
                }
            }
            long v2_1 = v10_1.iterator();
            while (v2_1.hasNext()) {
                boolean v4_4 = ((Long) v2_1.next());
                try {
                    v1.zzj().zzH(v4_4.longValue());
                } catch (boolean v0_20) {
                    java.util.List v5_1 = v1.zzA;
                    if (v5_1 != null) {
                        if (v5_1.contains(v4_4)) {
                        }
                    }
                    throw v0_20;
                }
            }
            v1.zzj().zzc();
            v1.zzj().zzd();
            v1.zzA = 0;
            if ((!v1.zzi().zzb()) || (!v1.zzj().zzD(p23))) {
                if ((!v1.zzi().zzb()) || (!v1.zzaJ())) {
                    v1.zzB = -1;
                    v1 = v1.zzaL();
                } else {
                    v1.zzM();
                }
            } else {
                v1.zzP(p23);
            }
            v1.zza = 0;
        } else {
            if (p20 == 200) {
                if (p21 == null) {
                }
            } else {
                if (p20 == 204) {
                    v0_0 = 204;
                }
            }
            boolean v4_12 = new String(v3_0, java.nio.charset.StandardCharsets.UTF_8);
            this.zzaV().zzh().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(v0_0), p21, v4_12.substring(0, Math.min(32, v4_12.length())));
            this.zzk.zze.zzb(this.zzaZ().currentTimeMillis());
            if ((v0_0 == 503) || (v0_0 == 429)) {
                this.zzk.zzc.zzb(this.zzaZ().currentTimeMillis());
            }
            this.zzj().zzJ(v10_1);
            v1 = this.zzaL();
        }
        v1.zzv = 0;
        v1.zzaM();
        return;
    }

    public final void zzW(com.google.android.gms.measurement.internal.zzh p7)
    {
        this.zzaW().zzg();
        if (!android.text.TextUtils.isEmpty(p7.zzf())) {
            String v1_2 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p7.zzc()));
            this.zzaV().zzk().zzb("Fetching remote configuration", v1_2);
            String v2_3 = this.zzh().zzb(v1_2);
            String v3_2 = this.zzh().zzd(v1_2);
            r.e v4_0 = 0;
            if (v2_3 != null) {
                if (!android.text.TextUtils.isEmpty(v3_2)) {
                    v4_0 = new r.e(0);
                    v4_0.put("If-Modified-Since", v3_2);
                }
                String v1_3 = this.zzh().zze(v1_2);
                if (!android.text.TextUtils.isEmpty(v1_3)) {
                    if (v4_0 == null) {
                        v4_0 = new r.e(0);
                    }
                    v4_0.put("If-None-Match", v1_3);
                }
            }
            this.zzu = 1;
            this.zzi().zzd(p7, v4_0, new com.google.android.gms.measurement.internal.zzpf(this));
            return;
        } else {
            this.zzX(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p7.zzc())), 204, 0, 0, 0);
            return;
        }
    }

    public final void zzX(String p7, int p8, Throwable p9, byte[] p10, java.util.Map p11)
    {
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p7);
        if (p10 == 0) {
            p10 = new byte[0];
        }
        Integer v1_0 = this.zzaV().zzk();
        Integer v3_1 = Integer.valueOf(p10.length);
        v1_0.zzb("onConfigFetched. Response size", v3_1);
        this.zzj().zzb();
        com.google.android.gms.measurement.internal.zzht v2_3;
        Integer v1_3 = this.zzj().zzu(p7);
        if ((p8 == 200) || (p8 == 204)) {
            if (p9 != null) {
                v2_3 = 0;
            } else {
                v2_3 = 1;
            }
        } else {
            if (p8 != 304) {
            } else {
                p8 = 304;
            }
        }
        if (v1_3 != null) {
            if (v2_3 == null) {
                if (p8 != 404) {
                    v1_3.zzK(this.zzaZ().currentTimeMillis());
                    this.zzj().zzv(v1_3, 0, 0);
                    this.zzaV().zzk().zzc("Fetching config failed. code, error", Integer.valueOf(p8), p9);
                    this.zzh().zzf(p7);
                    this.zzk.zze.zzb(this.zzaZ().currentTimeMillis());
                    if ((p8 == 503) || (p8 == 429)) {
                        this.zzk.zzc.zzb(this.zzaZ().currentTimeMillis());
                    }
                    this.zzaL();
                    this.zzj().zzc();
                    this.zzj().zzd();
                    this.zzu = 0;
                    this.zzaM();
                    return;
                } else {
                }
            }
            String v9_9 = com.google.android.gms.measurement.internal.zzpg.zzaK(p11, "Last-Modified");
            String v11_2 = com.google.android.gms.measurement.internal.zzpg.zzaK(p11, "ETag");
            if (p8 == 404) {
                if (this.zzh().zzb(p7) == null) {
                    this.zzh().zzi(p7, 0, 0, 0);
                }
            } else {
                if (p8 != 304) {
                    this.zzh().zzi(p7, p10, v9_9, v11_2);
                } else {
                }
            }
            v1_3.zzI(this.zzaZ().currentTimeMillis());
            this.zzj().zzv(v1_3, 0, 0);
            if (p8 != 404) {
                this.zzaV().zzk().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(p8), v3_1);
            } else {
                this.zzaV().zzh().zzb("Config not found. Using empty config. appId", p7);
            }
            if ((!this.zzi().zzb()) || (!this.zzaJ())) {
                if ((!this.zzi().zzb()) || (!this.zzj().zzD(v1_3.zzc()))) {
                    this.zzaL();
                } else {
                    this.zzP(v1_3.zzc());
                }
            } else {
                this.zzM();
            }
        } else {
            this.zzaV().zze().zzb("App does not exist in onConfigFetched. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p7));
        }
    }

    public final void zzY(Runnable p2)
    {
        this.zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new java.util.ArrayList();
        }
        this.zzq.add(p2);
        return;
    }

    public final void zzZ()
    {
        this.zzaW().zzg();
        this.zzu();
        if (!this.zzp) {
            this.zzp = 1;
            if (this.zzaa()) {
                Integer v1_1 = this.zzy;
                this.zzaW().zzg();
                int v6 = 0;
                if ((v1_1 != null) && (v1_1.isOpen())) {
                    com.google.android.gms.measurement.internal.zzgs v7_1 = java.nio.ByteBuffer.allocate(4);
                    v1_1.position(0);
                    Integer v1_4 = v1_1.read(v7_1);
                    if (v1_4 == 4) {
                        v7_1.flip();
                        v6 = v7_1.getInt();
                    } else {
                        if (v1_4 != -1) {
                            this.zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(v1_4));
                        }
                    }
                } else {
                    this.zzaV().zzb().zza("Bad channel to read from");
                }
                Integer v1_11 = this.zzn.zzv().zzm();
                this.zzaW().zzg();
                if (v6 <= v1_11) {
                    if (v6 < v1_11) {
                        com.google.android.gms.measurement.internal.zzgs v7_8 = this.zzy;
                        this.zzaW().zzg();
                        if ((v7_8 != null) && (v7_8.isOpen())) {
                            com.google.android.gms.measurement.internal.zzgs v2_5 = java.nio.ByteBuffer.allocate(4);
                            v2_5.putInt(v1_11);
                            v2_5.flip();
                            try {
                                v7_8.truncate(0);
                                v7_8.write(v2_5);
                                v7_8.force(1);
                            } catch (com.google.android.gms.measurement.internal.zzgs v0_12) {
                                this.zzaV().zzb().zzb("Failed to write to channel", v0_12);
                            }
                            if (v7_8.size() != 4) {
                                this.zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(v7_8.size()));
                            }
                            this.zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(v6), Integer.valueOf(v1_11));
                            return;
                        } else {
                            this.zzaV().zzb().zza("Bad channel to read from");
                        }
                        this.zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(v6), Integer.valueOf(v1_11));
                    }
                } else {
                    this.zzaV().zzb().zzc("Panic: can\'t downgrade version. Previous, current version", Integer.valueOf(v6), Integer.valueOf(v1_11));
                    return;
                }
            }
        }
        return;
    }

    public final com.google.android.gms.measurement.internal.zzae zzaU()
    {
        return this.zzn.zzaU();
    }

    public final com.google.android.gms.measurement.internal.zzgu zzaV()
    {
        return ((com.google.android.gms.measurement.internal.zzic) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    public final com.google.android.gms.measurement.internal.zzhz zzaW()
    {
        return ((com.google.android.gms.measurement.internal.zzic) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    public final android.content.Context zzaY()
    {
        return this.zzn.zzaY();
    }

    public final com.google.android.gms.common.util.Clock zzaZ()
    {
        return ((com.google.android.gms.measurement.internal.zzic) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    public final boolean zzaa()
    {
        this.zzaW().zzg();
        int v0_8 = this.zzx;
        if ((v0_8 != 0) && (v0_8.isValid())) {
            this.zzaV().zzk().zza("Storage concurrent access okay");
            return 1;
        } else {
            this.zze.zzu.zzc();
            int v0_7 = this.zzn.zzaY().getFilesDir();
            com.google.android.gms.internal.measurement.zzbv.zza();
            int v0_12 = new java.io.RandomAccessFile(new java.io.File(new java.io.File(v0_7, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = v0_12;
            int v0_13 = v0_12.tryLock();
            this.zzx = v0_13;
            if (v0_13 == 0) {
                this.zzaV().zzb().zza("Storage concurrent data access panic");
                return 0;
            } else {
                this.zzaV().zzk().zza("Storage concurrent access okay");
                return 1;
            }
        }
    }

    public final void zzab(com.google.android.gms.measurement.internal.zzr p11)
    {
        if (this.zzz != null) {
            com.google.android.gms.measurement.internal.zzgs v1_2 = new java.util.ArrayList();
            this.zzA = v1_2;
            v1_2.addAll(this.zzz);
        }
        com.google.android.gms.measurement.internal.zzgs v1_5 = this.zzj();
        Object v2_2 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p11.zza));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2_2);
        v1_5.zzg();
        v1_5.zzaw();
        String v3_1 = v1_5.zze();
        Integer v4_1 = new String[] {v2_2});
        int v5_13 = ((((((((((((v3_1.delete("apps", "app_id=?", v4_1) + v3_1.delete("events", "app_id=?", v4_1)) + v3_1.delete("events_snapshot", "app_id=?", v4_1)) + v3_1.delete("user_attributes", "app_id=?", v4_1)) + v3_1.delete("conditional_properties", "app_id=?", v4_1)) + v3_1.delete("raw_events", "app_id=?", v4_1)) + v3_1.delete("raw_events_metadata", "app_id=?", v4_1)) + v3_1.delete("queue", "app_id=?", v4_1)) + v3_1.delete("audience_filter_values", "app_id=?", v4_1)) + v3_1.delete("main_event_params", "app_id=?", v4_1)) + v3_1.delete("default_event_params", "app_id=?", v4_1)) + v3_1.delete("trigger_uris", "app_id=?", v4_1)) + v3_1.delete("upload_queue", "app_id=?", v4_1));
        com.google.android.gms.internal.measurement.zzpo.zza();
        com.google.android.gms.measurement.internal.zzic v6_24 = v1_5.zzu;
        if (v6_24.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbh)) {
            v5_13 += v3_1.delete("no_data_mode_events", "app_id=?", v4_1);
        }
        if (v5_13 <= 0) {
            if (p11.zzh) {
                this.zzah(p11);
            }
            return;
        } else {
            v6_24.zzaV().zzk().zzc("Reset analytics data. app, records", v2_2, Integer.valueOf(v5_13));
        }
    }

    public final void zzac(com.google.android.gms.measurement.internal.zzpl p22, com.google.android.gms.measurement.internal.zzr p23)
    {
        this.zzaW().zzg();
        this.zzu();
        if (com.google.android.gms.measurement.internal.zzpg.zzaR(p23)) {
            if (p23.zzh) {
                String v8 = p22.zzb;
                Long v12_0 = this.zzt().zzp(v8);
                int v13_0 = 0;
                if (v12_0 == null) {
                    int v17_1 = this.zzt().zzK(v8, p22.zza());
                    if (v17_1 == 0) {
                        Object v11_1 = this.zzt().zzL(v8, p22.zza());
                        if (v11_1 != null) {
                            if ("_sid".equals(v8)) {
                                long v9_8;
                                com.google.android.gms.measurement.internal.zzpn v5_4 = p22.zzc;
                                String v7_4 = p22.zzf;
                                long v9_6 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p23.zza));
                                com.google.android.gms.measurement.internal.zzgs v10_3 = this.zzj().zzm(v9_6, "_sno");
                                if (v10_3 == null) {
                                    if (v10_3 != null) {
                                        this.zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", v10_3.zze);
                                    }
                                    long v9_7 = this.zzj().zzf(v9_6, "_s");
                                    if (v9_7 == 0) {
                                        v9_8 = 0;
                                    } else {
                                        com.google.android.gms.measurement.internal.zzpp v14_5 = v9_7.zzc;
                                        this.zzaV().zzk().zzb("Backfill the session number. Last used session number", Long.valueOf(v14_5));
                                        v9_8 = v14_5;
                                    }
                                } else {
                                    Long v12_2 = v10_3.zze;
                                    if (!(v12_2 instanceof Long)) {
                                    } else {
                                        v9_8 = ((Long) v12_2).longValue();
                                    }
                                }
                                this.zzac(new com.google.android.gms.measurement.internal.zzpl("_sno", v5_4, Long.valueOf((v9_8 + 1)), v7_4), p23);
                            }
                            Long v12_8 = p23.zza;
                            com.google.android.gms.measurement.internal.zzpn v5_0 = new com.google.android.gms.measurement.internal.zzpn(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v12_8)), ((String) p22), v8, p22.zzc, v11_1);
                            com.google.android.gms.measurement.internal.zzic v6_0 = this.zzn;
                            String v7_2 = v5_0.zzc;
                            this.zzaV().zzk().zzc("Setting user property", v6_0.zzl().zzc(v7_2), v11_1);
                            this.zzj().zzb();
                            if ("_id".equals(v7_2)) {
                                com.google.android.gms.measurement.internal.zzav v0_6 = this.zzj().zzm(v12_8, "_id");
                                if ((v0_6 != null) && (!v5_0.zze.equals(v0_6.zze))) {
                                    this.zzj().zzk(v12_8, "_lair");
                                }
                            }
                            this.zzao(p23);
                            com.google.android.gms.measurement.internal.zzav v0_11 = this.zzj().zzl(v5_0);
                            if ("_sid".equals(v8)) {
                                com.google.android.gms.measurement.internal.zzav v2_1 = this.zzp().zzu(p23.zzu);
                                Object v4_3 = this.zzj().zzu(v12_8);
                                if (v4_3 != null) {
                                    v4_3.zzan(v2_1);
                                    if (v4_3.zza()) {
                                        this.zzj().zzv(v4_3, 0, 0);
                                    }
                                }
                            }
                            this.zzj().zzc();
                            if (v0_11 == null) {
                                this.zzaV().zzb().zzc("Too many unique user properties are set. Ignoring user property", v6_0.zzl().zzc(v7_2), v5_0.zze);
                                this.zzt().zzN(this.zzK, v12_8, 9, 0, 0, 0);
                            }
                            this.zzj().zzd();
                            return;
                        }
                    } else {
                        String v3_6 = this.zzt();
                        this.zzd();
                        int v19_1 = v3_6.zzC(v8, 24, 1);
                        com.google.android.gms.measurement.internal.zzav v0_16 = p22.zza();
                        if ((v0_16 != null) && (((v0_16 instanceof String)) || ((v0_16 instanceof CharSequence)))) {
                            v13_0 = v0_16.toString().length();
                        }
                        this.zzt().zzN(this.zzK, p23.zza, v17_1, "_ev", v19_1, v13_0);
                        return;
                    }
                } else {
                    com.google.android.gms.measurement.internal.zzav v0_19 = this.zzt();
                    this.zzd();
                    com.google.android.gms.measurement.internal.zzpp v14_2 = v0_19.zzC(v8, 24, 1);
                    if (v8 != null) {
                        v13_0 = v8.length();
                    }
                    this.zzt().zzN(this.zzK, p23.zza, v12_0, "_ev", v14_2, v13_0);
                    return;
                }
            } else {
                this.zzao(p23);
                return;
            }
        }
        return;
    }

    public final void zzad(String p9, com.google.android.gms.measurement.internal.zzr p10)
    {
        this.zzaW().zzg();
        this.zzu();
        if (com.google.android.gms.measurement.internal.zzpg.zzaR(p10)) {
            if (p10.zzh) {
                String v0_1 = com.google.android.gms.measurement.internal.zzpg.zzaT(p10);
                if ((!"_npa".equals(p9)) || (v0_1 == null)) {
                    com.google.android.gms.measurement.internal.zzgn v1_2 = this.zzn;
                    this.zzaV().zzj().zzb("Removing user property", v1_2.zzl().zzc(p9));
                    this.zzj().zzb();
                    this.zzao(p10);
                    if ("_id".equals(p9)) {
                        this.zzj().zzk(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p10.zza)), "_lair");
                    }
                    this.zzj().zzk(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p10.zza)), p9);
                    this.zzj().zzc();
                    this.zzaV().zzj().zzb("User property removed", v1_2.zzl().zzc(p9));
                    this.zzj().zzd();
                    return;
                } else {
                    String v0_14;
                    this.zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                    long v4 = this.zzaZ().currentTimeMillis();
                    if (1 == v0_1.booleanValue()) {
                        v0_14 = 1;
                    } else {
                        v0_14 = 0;
                    }
                    this.zzac(new com.google.android.gms.measurement.internal.zzpl("_npa", v4, Long.valueOf(v0_14), "auto"), p10);
                    return;
                }
            } else {
                this.zzao(p10);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzae()
    {
        this.zzs = (this.zzs + 1);
        return;
    }

    public final void zzaf()
    {
        this.zzt = (this.zzt + 1);
        return;
    }

    public final com.google.android.gms.measurement.internal.zzic zzag()
    {
        return this.zzn;
    }

    public final void zzah(com.google.android.gms.measurement.internal.zzr p28)
    {
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p28);
        com.google.android.gms.measurement.internal.zzgs v8_0 = p28.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v8_0);
        if (com.google.android.gms.measurement.internal.zzpg.zzaR(p28)) {
            String v9_6 = this.zzj().zzu(v8_0);
            if ((v9_6 != null) && ((android.text.TextUtils.isEmpty(v9_6.zzf())) && (!android.text.TextUtils.isEmpty(p28.zzb)))) {
                v9_6.zzI(0);
                this.zzj().zzv(v9_6, 0, 0);
                this.zzh().zzh(v8_0);
            }
            if (p28.zzh) {
                long v13_10 = p28.zzl;
                if (v13_10 == 0) {
                    v13_10 = this.zzaZ().currentTimeMillis();
                }
                com.google.android.gms.measurement.internal.zzbe v17_9 = v13_10;
                String v9_26 = p28.zzm;
                if ((v9_26 != null) && (v9_26 != 1)) {
                    this.zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", com.google.android.gms.measurement.internal.zzgu.zzl(v8_0), Integer.valueOf(v9_26));
                    v9_26 = 0;
                }
                this.zzj().zzb();
                int v12_0;
                long v24;
                String v11_11 = this.zzj().zzm(v8_0, "_npa");
                int v12_19 = com.google.android.gms.measurement.internal.zzpg.zzaT(p28);
                if (v11_11 == null) {
                    if (v12_19 == 0) {
                        v12_0 = v17_9;
                        v24 = 1;
                        if (v11_11 != null) {
                            this.zzad("_npa", p28);
                        }
                    } else {
                        long v23_0;
                        if (1 == v12_19.booleanValue()) {
                            v23_0 = 1;
                        } else {
                            v23_0 = 0;
                        }
                        int v15_0 = new com.google.android.gms.measurement.internal.zzpl("_npa", v17_9, Long.valueOf(v23_0), "auto");
                        v24 = 1;
                        v12_0 = v17_9;
                        if ((v11_11 == null) || (!v11_11.zze.equals(v15_0.zzd))) {
                            this.zzac(v15_0, p28);
                        }
                    }
                } else {
                    if (!"auto".equals(v11_11.zzb)) {
                        v12_0 = v17_9;
                        v24 = 1;
                    } else {
                    }
                }
                if (!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbb)) {
                    this.zzan(p28, v12_0);
                } else {
                    this.zzan(p28, p28.zzD);
                }
                String v11_3;
                String v9_1;
                this.zzao(p28);
                if (v9_26 != null) {
                    v9_1 = this.zzj().zzf(v8_0, "_v");
                    v11_3 = 1;
                } else {
                    v9_1 = this.zzj().zzf(v8_0, "_f");
                    v11_3 = 0;
                }
                if (v9_1 != null) {
                    if (p28.zzi) {
                        this.zzE(new com.google.android.gms.measurement.internal.zzbg("_cd", new com.google.android.gms.measurement.internal.zzbe(new android.os.Bundle()), "auto", v12_0), p28);
                    }
                } else {
                    com.google.android.gms.measurement.internal.zzbe v17_4 = (((v12_0 / 3600000) + v24) * 3600000);
                    if (v11_3 != null) {
                        com.google.android.gms.measurement.internal.zzbe v17_5 = v12_0;
                        this.zzac(new com.google.android.gms.measurement.internal.zzpl("_fvt", v17_5, Long.valueOf(v17_4), "auto"), p28);
                        this.zzaW().zzg();
                        this.zzu();
                        String v0_6 = new android.os.Bundle();
                        v0_6.putLong("_c", 1);
                        v0_6.putLong("_r", 1);
                        v0_6.putLong("_et", 1);
                        if (p28.zzo) {
                            v0_6.putLong("_dac", 1);
                        }
                        if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbj)) {
                            v0_6.putLong("_elt", this.zzaZ().currentTimeMillis());
                        }
                        this.zzE(new com.google.android.gms.measurement.internal.zzbg("_v", new com.google.android.gms.measurement.internal.zzbe(v0_6), "auto", v17_5), p28);
                    } else {
                        String v26;
                        com.google.android.gms.measurement.internal.zzbe v17_7 = v12_0;
                        this.zzac(new com.google.android.gms.measurement.internal.zzpl("_fot", v17_7, Long.valueOf(v17_4), "auto"), p28);
                        this.zzaW().zzg();
                        long v13_2 = ((com.google.android.gms.measurement.internal.zzhk) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzm));
                        if ((v8_0 != null) && (!v8_0.isEmpty())) {
                            int v15_10 = v13_2.zza;
                            v15_10.zzaW().zzg();
                            if (v13_2.zza()) {
                                int v12_9 = new com.google.android.gms.measurement.internal.zzhj(v13_2, v8_0);
                                v15_10.zzaW().zzg();
                                String v16_4 = v15_10;
                                com.google.android.gms.measurement.internal.zzgs v8_3 = new android.content.Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                v26 = "_elt";
                                v8_3.setComponent(new android.content.ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                String v9_9 = v16_4.zzaY().getPackageManager();
                                if (v9_9 != null) {
                                    String v9_10 = v9_9.queryIntentServices(v8_3, 0);
                                    if ((v9_10 == null) || (v9_10.isEmpty())) {
                                        v16_4.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        String v9_13 = ((android.content.pm.ResolveInfo) v9_10.get(0)).serviceInfo;
                                        if (v9_13 != null) {
                                            if ((v9_13.name == null) || ((!"com.android.vending".equals(v9_13.packageName)) || (!v13_2.zza()))) {
                                                v16_4.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            } else {
                                                String v0_16;
                                                String v0_15 = com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(v16_4.zzaY(), new android.content.Intent(v8_3), v12_9, 1);
                                                com.google.android.gms.measurement.internal.zzgs v8_8 = v16_4.zzaV().zzk();
                                                if (v0_15 == null) {
                                                    v0_16 = "not available";
                                                } else {
                                                    v0_16 = "available";
                                                }
                                                v8_8.zzb("Install Referrer Service is", v0_16);
                                            }
                                        }
                                    }
                                } else {
                                    v16_4.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                }
                            } else {
                                v15_10.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                v26 = "_elt";
                            }
                        } else {
                            v26 = "_elt";
                            v13_2.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                        }
                        this.zzaW().zzg();
                        this.zzu();
                        com.google.android.gms.measurement.internal.zzgs v8_16 = new android.os.Bundle();
                        int v12_10 = v24;
                        v8_16.putLong("_c", v12_10);
                        v8_16.putLong("_r", v12_10);
                        v8_16.putLong("_uwa", 0);
                        v8_16.putLong("_pfo", 0);
                        v8_16.putLong("_sys", 0);
                        v8_16.putLong("_sysu", 0);
                        v8_16.putLong("_et", v12_10);
                        if (p28.zzo) {
                            v8_16.putLong("_dac", v12_10);
                        }
                        String v9_20 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p28.zza));
                        String v0_30 = this.zzj();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v9_20);
                        v0_30.zzg();
                        v0_30.zzaw();
                        long v10_2 = v0_30.zzN(v9_20, "first_open_count");
                        String v0_31 = this.zzn;
                        if (v0_31.zzaY().getPackageManager() != null) {
                            try {
                                com.google.android.gms.measurement.internal.zzfx v6_9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(v0_31.zzaY()).getPackageInfo(v9_20, 0);
                            } catch (String v0_34) {
                                this.zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v9_20), v0_34);
                                v6_9 = 0;
                            }
                            if (v6_9 != null) {
                                int v12_12 = v6_9.firstInstallTime;
                                if (v12_12 != 0) {
                                    int v12_13;
                                    if (v12_12 == v6_9.lastUpdateTime) {
                                        v12_13 = 1;
                                    } else {
                                        if (!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaI)) {
                                            v8_16.putLong("_uwa", 1);
                                        } else {
                                            if (v10_2 == 0) {
                                                v8_16.putLong("_uwa", 1);
                                                v10_2 = 0;
                                            }
                                        }
                                        v12_13 = 0;
                                    }
                                    long v13_9;
                                    if (1 == v12_13) {
                                        v13_9 = 1;
                                    } else {
                                        v13_9 = 0;
                                    }
                                    this.zzac(new com.google.android.gms.measurement.internal.zzpl("_fi", v17_7, Long.valueOf(v13_9), "auto"), p28);
                                }
                            }
                            try {
                                String v0_43 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(v9_20, 0);
                            } catch (String v0_44) {
                                this.zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v9_20), v0_44);
                                v0_43 = 0;
                            }
                            if (v0_43 != null) {
                                int v12_18;
                                if ((v0_43.flags & 1) == 0) {
                                    v12_18 = 1;
                                } else {
                                    v12_18 = 1;
                                    v8_16.putLong("_sys", 1);
                                }
                                if ((v0_43.flags & 128) != 0) {
                                    v8_16.putLong("_sysu", v12_18);
                                }
                            }
                        } else {
                            this.zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v9_20));
                        }
                        if (v10_2 >= 0) {
                            v8_16.putLong("_pfo", v10_2);
                        }
                        if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbj)) {
                            v8_16.putLong(v26, this.zzaZ().currentTimeMillis());
                        }
                        this.zzE(new com.google.android.gms.measurement.internal.zzbg("_f", new com.google.android.gms.measurement.internal.zzbe(v8_16), "auto", v17_7), p28);
                    }
                }
                this.zzj().zzc();
                this.zzj().zzd();
                return;
            } else {
                this.zzao(p28);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzai(com.google.android.gms.measurement.internal.zzr p9)
    {
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9);
        String v0_1 = p9.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_1);
        int v2_0 = 0;
        if (!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaz)) {
            this.zzd();
            long v4_0 = com.google.android.gms.measurement.internal.zzal.zzH();
            while ((((long) v2_0) < v4_0) && (this.zzaG(v0_1, 0))) {
                v2_0++;
            }
        } else {
            long v4_1 = this.zzaZ().currentTimeMillis();
            long v1_5 = this.zzd().zzm(0, com.google.android.gms.measurement.internal.zzfy.zzai);
            this.zzd();
            long v6_3 = com.google.android.gms.measurement.internal.zzal.zzF();
            while ((v2_0 < v1_5) && (this.zzaG(0, (v4_1 - v6_3)))) {
                v2_0++;
            }
        }
        if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaA)) {
            this.zzaW().zzg();
            this.zzaF();
        }
        if (this.zzl.zzc(v0_1, com.google.android.gms.internal.measurement.zzin.zzb(p9.zzE))) {
            this.zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", v0_1);
            this.zzN(v0_1, this.zzaZ().currentTimeMillis());
        }
        return;
    }

    public final void zzaj(com.google.android.gms.measurement.internal.zzah p2)
    {
        com.google.android.gms.measurement.internal.zzr v0_3 = this.zzaO(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zza)));
        if (v0_3 != null) {
            this.zzak(p2, v0_3);
        }
        return;
    }

    public final void zzak(com.google.android.gms.measurement.internal.zzah p11, com.google.android.gms.measurement.internal.zzr p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11.zzb);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11.zzc.zzb);
        this.zzaW().zzg();
        this.zzu();
        if (com.google.android.gms.measurement.internal.zzpg.zzaR(p12)) {
            if (p12.zzh) {
                Object v0_10 = new com.google.android.gms.measurement.internal.zzah(p11);
                com.google.android.gms.measurement.internal.zzbg v11_13 = 0;
                v0_10.zze = 0;
                this.zzj().zzb();
                com.google.android.gms.measurement.internal.zzbg v1_14 = this.zzj().zzq(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_10.zza)), v0_10.zzc.zzb);
                if ((v1_14 != null) && (!v1_14.zzb.equals(v0_10.zzb))) {
                    this.zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(v0_10.zzc.zzb), v0_10.zzb, v1_14.zzb);
                }
                if ((v1_14 == null) || (!v1_14.zze)) {
                    if (android.text.TextUtils.isEmpty(v0_10.zzf)) {
                        com.google.android.gms.measurement.internal.zzbg v11_14 = v0_10.zzc;
                        v0_10.zzc = new com.google.android.gms.measurement.internal.zzpl(v11_14.zzb, v0_10.zzd, v11_14.zza(), v0_10.zzc.zzf);
                        v0_10.zze = 1;
                        v11_13 = 1;
                    }
                } else {
                    v0_10.zzb = v1_14.zzb;
                    v0_10.zzd = v1_14.zzd;
                    v0_10.zzh = v1_14.zzh;
                    v0_10.zzf = v1_14.zzf;
                    v0_10.zzi = v1_14.zzi;
                    v0_10.zze = 1;
                    long v2_19 = v0_10.zzc;
                    v0_10.zzc = new com.google.android.gms.measurement.internal.zzpl(v2_19.zzb, v1_14.zzc.zzc, v2_19.zza(), v1_14.zzc.zzf);
                }
                if (v0_10.zze) {
                    com.google.android.gms.measurement.internal.zzbg v1_0 = v0_10.zzc;
                    long v2_1 = new com.google.android.gms.measurement.internal.zzpn(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_10.zza)), v0_10.zzb, v1_0.zzb, v1_0.zzc, com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_0.zza()));
                    if (!this.zzj().zzl(v2_1)) {
                        this.zzaV().zzb().zzd("(2)Too many active user properties, ignoring", com.google.android.gms.measurement.internal.zzgu.zzl(v0_10.zza), this.zzn.zzl().zzc(v2_1.zzc), v2_1.zze);
                    } else {
                        this.zzaV().zzj().zzd("User property updated immediately", v0_10.zza, this.zzn.zzl().zzc(v2_1.zzc), v2_1.zze);
                    }
                    if ((v11_13 != null) && (v0_10.zzi != null)) {
                        this.zzH(new com.google.android.gms.measurement.internal.zzbg(v0_10.zzi, v0_10.zzd), p12);
                    }
                }
                if (!this.zzj().zzp(v0_10)) {
                    this.zzaV().zzb().zzd("Too many conditional properties, ignoring", com.google.android.gms.measurement.internal.zzgu.zzl(v0_10.zza), this.zzn.zzl().zzc(v0_10.zzc.zzb), v0_10.zzc.zza());
                } else {
                    this.zzaV().zzj().zzd("Conditional property added", v0_10.zza, this.zzn.zzl().zzc(v0_10.zzc.zzb), v0_10.zzc.zza());
                }
                this.zzj().zzc();
                this.zzj().zzd();
                return;
            } else {
                this.zzao(p12);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzal(com.google.android.gms.measurement.internal.zzah p2)
    {
        com.google.android.gms.measurement.internal.zzr v0_3 = this.zzaO(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zza)));
        if (v0_3 != null) {
            this.zzam(p2, v0_3);
        }
        return;
    }

    public final void zzam(com.google.android.gms.measurement.internal.zzah p11, com.google.android.gms.measurement.internal.zzr p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11.zzc.zzb);
        this.zzaW().zzg();
        this.zzu();
        if (com.google.android.gms.measurement.internal.zzpg.zzaR(p12)) {
            if (p12.zzh) {
                this.zzj().zzb();
                this.zzao(p12);
                com.google.android.gms.measurement.internal.zzgn v2_1 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p11.zza));
                String v0_8 = this.zzj().zzq(v2_1, p11.zzc.zzb);
                if (v0_8 == null) {
                    this.zzaV().zze().zzc("Conditional user property doesn\'t exist", com.google.android.gms.measurement.internal.zzgu.zzl(p11.zza), this.zzn.zzl().zzc(p11.zzc.zzb));
                } else {
                    this.zzaV().zzj().zzc("Removing conditional user property", p11.zza, this.zzn.zzl().zzc(p11.zzc.zzb));
                    this.zzj().zzr(v2_1, p11.zzc.zzb);
                    if (v0_8.zze) {
                        this.zzj().zzk(v2_1, p11.zzc.zzb);
                    }
                    com.google.android.gms.measurement.internal.zzbg v11_7 = p11.zzk;
                    if (v11_7 != null) {
                        com.google.android.gms.measurement.internal.zzpp v1_10;
                        com.google.android.gms.measurement.internal.zzpp v1_9 = v11_7.zzb;
                        if (v1_9 == null) {
                            v1_10 = 0;
                        } else {
                            v1_10 = v1_9.zzf();
                        }
                        this.zzH(((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzt().zzac(v2_1, ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.Preconditions.checkNotNull(v11_7)).zza, v1_10, v0_8.zzb, v11_7.zzd, 1, 1))), p12);
                    }
                }
                this.zzj().zzc();
                this.zzj().zzd();
                return;
            } else {
                this.zzao(p12);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzan(com.google.android.gms.measurement.internal.zzr p17, long p18)
    {
        com.google.android.gms.measurement.internal.zzfx v3_0 = this.zzj().zzu(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p17.zza)));
        if ((v3_0 != null) && (this.zzt().zzB(p17.zzb, v3_0.zzf()))) {
            this.zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v3_0.zzc()));
            String v5_9 = this.zzj();
            com.google.android.gms.measurement.internal.zzfx v3_7 = v3_0.zzc();
            v5_9.zzaw();
            v5_9.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_7);
            String v6_6 = v5_9.zze();
            Integer v7_4 = new String[] {v3_7});
            int v8_0 = (((((((((((v6_6.delete("events", "app_id=?", v7_4) + v6_6.delete("user_attributes", "app_id=?", v7_4)) + v6_6.delete("conditional_properties", "app_id=?", v7_4)) + v6_6.delete("apps", "app_id=?", v7_4)) + v6_6.delete("raw_events", "app_id=?", v7_4)) + v6_6.delete("raw_events_metadata", "app_id=?", v7_4)) + v6_6.delete("event_filters", "app_id=?", v7_4)) + v6_6.delete("property_filters", "app_id=?", v7_4)) + v6_6.delete("audience_filter_values", "app_id=?", v7_4)) + v6_6.delete("consent_settings", "app_id=?", v7_4)) + v6_6.delete("default_event_params", "app_id=?", v7_4)) + v6_6.delete("trigger_uris", "app_id=?", v7_4));
            com.google.android.gms.internal.measurement.zzpo.zza();
            String v9_24 = v5_9.zzu;
            if (v9_24.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbh)) {
                v8_0 += v6_6.delete("no_data_mode_events", "app_id=?", v7_4);
            }
            if (v8_0 <= 0) {
                v3_0 = 0;
            } else {
                v9_24.zzaV().zzk().zzc("Deleted application data. app, records", v3_7, Integer.valueOf(v8_0));
            }
        }
        if (v3_0 != null) {
            boolean v0_5;
            String v5_4 = 1;
            if ((v3_0.zzt() == -2147483648) || (v3_0.zzt() == p17.zzj)) {
                v0_5 = 0;
            } else {
                v0_5 = 1;
            }
            String v9_1 = v3_0.zzr();
            if ((v3_0.zzt() != -2147483648) || ((v9_1 == null) || (v9_1.equals(p17.zzc)))) {
                v5_4 = 0;
            }
            if ((v0_5 | v5_4) != 0) {
                boolean v0_8 = new android.os.Bundle();
                v0_8.putString("_pv", v9_1);
                com.google.android.gms.measurement.internal.zzbg v10_2 = new com.google.android.gms.measurement.internal.zzbg("_au", new com.google.android.gms.measurement.internal.zzbe(v0_8), "auto", p18);
                if (!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbc)) {
                    this.zzF(v10_2, p17);
                } else {
                    this.zzE(v10_2, p17);
                    return;
                }
            }
        }
        return;
    }

    public final com.google.android.gms.measurement.internal.zzh zzao(com.google.android.gms.measurement.internal.zzr p13)
    {
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p13);
        com.google.android.gms.measurement.internal.zzfx v2_7 = p13.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2_7);
        com.google.android.gms.measurement.internal.zzh v0_8 = p13.zzt;
        if (!v0_8.isEmpty()) {
            this.zzE.put(v2_7, new com.google.android.gms.measurement.internal.zzpd(this, v0_8, 0));
        }
        String v4_3;
        com.google.android.gms.measurement.internal.zzh v0_6 = this.zzj().zzu(v2_7);
        String v1_33 = this.zzB(v2_7).zzs(com.google.android.gms.measurement.internal.zzjl.zzf(p13.zzs, 100));
        String v3_10 = com.google.android.gms.measurement.internal.zzjk.zza;
        if (!v1_33.zzo(v3_10)) {
            v4_3 = "";
        } else {
            v4_3 = this.zzk.zzf(v2_7, p13.zzn);
        }
        int v11;
        int v9 = 1;
        if (v0_6 != null) {
            if ((!v1_33.zzo(v3_10)) || ((v4_3 == null) || (v4_3.equals(v0_6.zzj())))) {
                if ((!android.text.TextUtils.isEmpty(v0_6.zzd())) || (!v1_33.zzo(com.google.android.gms.measurement.internal.zzjk.zzb))) {
                    v11 = 0;
                } else {
                    v0_6.zze(this.zzK(v1_33));
                }
            } else {
                String v3_15 = android.text.TextUtils.isEmpty(v0_6.zzj());
                v0_6.zzk(v4_3);
                if ((!p13.zzn) || (("00000000-0000-0000-0000-000000000000".equals(this.zzk.zzc(v2_7, v1_33).first)) || (v3_15 != null))) {
                    if ((!android.text.TextUtils.isEmpty(v0_6.zzd())) || (!v1_33.zzo(com.google.android.gms.measurement.internal.zzjk.zzb))) {
                    } else {
                        v0_6.zze(this.zzK(v1_33));
                    }
                } else {
                    if (!v1_33.zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
                        v11 = 1;
                    } else {
                        v0_6.zze(this.zzK(v1_33));
                        v11 = 0;
                    }
                    if ((this.zzj().zzm(v2_7, "_id") != null) && (this.zzj().zzm(v2_7, "_lair") == null)) {
                        this.zzj().zzl(new com.google.android.gms.measurement.internal.zzpn(v2_7, "auto", "_lair", this.zzaZ().currentTimeMillis(), Long.valueOf(1)));
                    }
                }
            }
        } else {
            long v5_2 = new com.google.android.gms.measurement.internal.zzh(this.zzn, v2_7);
            if (v1_33.zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
                v5_2.zze(this.zzK(v1_33));
            }
            if (v1_33.zzo(v3_10)) {
                v5_2.zzk(v4_3);
            }
            v0_6 = v5_2;
        }
        v0_6.zzg(p13.zzb);
        String v1_8 = p13.zzk;
        if (!android.text.TextUtils.isEmpty(v1_8)) {
            v0_6.zzm(v1_8);
        }
        String v1_9 = p13.zze;
        if (v1_9 != 0) {
            v0_6.zzy(v1_9);
        }
        String v1_10 = p13.zzc;
        if (!android.text.TextUtils.isEmpty(v1_10)) {
            v0_6.zzs(v1_10);
        }
        v0_6.zzu(p13.zzj);
        String v1_12 = p13.zzd;
        if (v1_12 != null) {
            v0_6.zzw(v1_12);
        }
        v0_6.zzA(p13.zzf);
        v0_6.zzE(p13.zzh);
        String v1_15 = p13.zzg;
        if (!android.text.TextUtils.isEmpty(v1_15)) {
            v0_6.zzab(v1_15);
        }
        v0_6.zzad(p13.zzn);
        v0_6.zzaf(p13.zzp);
        v0_6.zzC(p13.zzq);
        v0_6.zzi(p13.zzu);
        com.google.android.gms.internal.measurement.zzpr.zza();
        if (!this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaL)) {
            com.google.android.gms.internal.measurement.zzpr.zza();
            if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaK)) {
                v0_6.zzah(0);
            }
        } else {
            v0_6.zzah(p13.zzr);
        }
        v0_6.zzaj(p13.zzv);
        v0_6.zzaz(p13.zzB);
        com.google.android.gms.internal.measurement.zzqp.zza();
        if (this.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaP)) {
            v0_6.zzap(p13.zzz);
        }
        v0_6.zzal(p13.zzw);
        v0_6.zzaG(p13.zzC);
        v0_6.zzaK(p13.zzE);
        if (v0_6.zza()) {
            v9 = v11;
        } else {
            if (v11 == 0) {
                return v0_6;
            }
        }
        this.zzj().zzv(v0_6, v9, 0);
        return v0_6;
    }

    public final String zzap(com.google.android.gms.measurement.internal.zzr p5)
    {
        try {
            return ((String) this.zzaW().zzh(new com.google.android.gms.measurement.internal.zzoz(this, p5)).get(30000, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.util.concurrent.ExecutionException v0_2) {
            this.zzaV().zzb().zzc("Failed to get app instance id. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5.zza), v0_2);
            return 0;
        } catch (java.util.concurrent.ExecutionException v0_2) {
            this.zzaV().zzb().zzc("Failed to get app instance id. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5.zza), v0_2);
            return 0;
        } catch (java.util.concurrent.ExecutionException v0_2) {
            this.zzaV().zzb().zzc("Failed to get app instance id. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p5.zza), v0_2);
            return 0;
        }
    }

    public final java.util.List zzaq(com.google.android.gms.measurement.internal.zzr p17, android.os.Bundle p18)
    {
        this.zzaW().zzg();
        com.google.android.gms.internal.measurement.zzqp.zza();
        android.database.Cursor v3_1 = p17.zza;
        if ((this.zzd().zzp(v3_1, com.google.android.gms.measurement.internal.zzfy.zzaP)) && (v3_1 != null)) {
            if (p18 != null) {
                String v4_4 = p18.getIntArray("uriSources");
                boolean v5_4 = p18.getLongArray("uriTimestamps");
                if (v4_4 != null) {
                    if ((v5_4) && (v5_4.length == v4_4.length)) {
                        int v6_5 = 0;
                        while (v6_5 < v4_4.length) {
                            Object v7_2 = this.zzj();
                            android.database.sqlite.SQLiteException v0_8 = v4_4[v6_5];
                            String v8_4 = v5_4[v6_5];
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_1);
                            v7_2.zzg();
                            v7_2.zzaw();
                            try {
                                com.google.android.gms.measurement.internal.zzgs v2_7 = v7_2.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[] {v3_1, String.valueOf(v0_8), String.valueOf(v8_4)}));
                                com.google.android.gms.measurement.internal.zzgs v12_4 = v7_2.zzu.zzaV().zzk();
                                StringBuilder v14_2 = new StringBuilder((String.valueOf(v2_7).length() + 46));
                                v14_2.append("Pruned ");
                                v14_2.append(v2_7);
                                v14_2.append(" trigger URIs. appId, source, timestamp");
                                v12_4.zzd(v14_2.toString(), v3_1, Integer.valueOf(v0_8), Long.valueOf(v8_4));
                            } catch (android.database.sqlite.SQLiteException v0_10) {
                                v7_2.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v3_1), v0_10);
                            }
                            v6_5++;
                        }
                    } else {
                        this.zzaV().zzb().zza("Uri sources and timestamps do not match");
                    }
                }
            }
            com.google.android.gms.measurement.internal.zzgs v2_3 = this.zzj();
            Object v1_1 = p17.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_1);
            v2_3.zzg();
            v2_3.zzaw();
            android.database.sqlite.SQLiteException v0_2 = new java.util.ArrayList();
            android.database.Cursor v3_0 = v2_3.zze().query("trigger_uris", new String[] {"trigger_uri", "timestamp_millis", "source"}), "app_id=?", new String[] {v1_1}), 0, 0, "rowid", 0);
            if (!v3_0.moveToFirst()) {
                if (v3_0 != null) {
                    v3_0.close();
                }
                return v0_2;
            } else {
                do {
                    boolean v5_1 = v3_0.getString(0);
                    if (!v5_1) {
                        v5_1 = "";
                    }
                    v0_2.add(new com.google.android.gms.measurement.internal.zzoh(v5_1, v3_0.getLong(1), v3_0.getInt(2)));
                } while(v3_0.moveToNext());
            }
        } else {
            return new java.util.ArrayList();
        }
    }

    public final void zzar(String p12, com.google.android.gms.measurement.internal.zzaf p13)
    {
        this.zzaW().zzg();
        this.zzu();
        String v1_13 = p13.zza;
        Long v0_14 = this.zzj().zzB(v1_13);
        if (v0_14 != null) {
            Long v0_1 = v0_14.zze();
            if (p13.zzb != com.google.android.gms.measurement.internal.zzlr.zzb.zza()) {
                if (p13.zzb == com.google.android.gms.measurement.internal.zzlr.zzd.zza()) {
                    String v1_5 = this.zzF;
                    com.google.android.gms.measurement.internal.zzgs v2_6 = ((com.google.android.gms.measurement.internal.zzpe) v1_5.get(v0_1));
                    if (v2_6 != null) {
                        v2_6.zza();
                    } else {
                        v2_6 = new com.google.android.gms.measurement.internal.zzpe(this);
                        v1_5.put(v0_1, v2_6);
                    }
                    this.zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", p12, v0_1, Long.valueOf(((v2_6.zzc() - this.zzaZ().currentTimeMillis()) / 1000)));
                }
                Long v0_6 = this.zzj();
                Long v13_5 = Long.valueOf(p13.zza);
                v0_6.zzK(v13_5);
                this.zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", p12, v13_5);
                return;
            } else {
                com.google.android.gms.measurement.internal.zzgs v3_4 = this.zzF;
                if (v3_4.containsKey(v0_1)) {
                    v3_4.remove(v0_1);
                }
                Long v0_10 = this.zzj();
                String v1_14 = Long.valueOf(v1_13);
                v0_10.zzE(v1_14);
                this.zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", p12, v1_14);
                Long v0_13 = p13.zzc;
                if (v0_13 <= 0) {
                    return;
                } else {
                    com.google.android.gms.measurement.internal.zzgs v2_12 = this.zzj();
                    v2_12.zzg();
                    v2_12.zzaw();
                    com.google.android.gms.measurement.internal.zzgs v3_5 = Long.valueOf(v0_13);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_5);
                    com.google.android.gms.measurement.internal.zzgs v4_9 = new android.content.ContentValues();
                    v4_9.put("upload_type", Integer.valueOf(com.google.android.gms.measurement.internal.zzls.zzb.zza()));
                    String v5_4 = v2_12.zzu;
                    v4_9.put("creation_timestamp", Long.valueOf(v5_4.zzaZ().currentTimeMillis()));
                    try {
                        if (((long) v2_12.zze().update("upload_queue", v4_9, "rowid=? AND app_id=? AND upload_type=?", new String[] {String.valueOf(v0_13), p12, String.valueOf(com.google.android.gms.measurement.internal.zzls.zze.zza())}))) != 1) {
                            v5_4.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", p12, v3_5);
                        }
                    } catch (Long v13_1) {
                        v2_12.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", p12, Long.valueOf(v0_13), v13_1);
                        throw v13_1;
                    }
                    this.zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", p12, Long.valueOf(p13.zzc));
                    this.zzP(p12);
                    return;
                }
            }
        } else {
            this.zzaV().zze().zzc("[sgtm] Queued batch doesn\'t exist. appId, rowId", p12, Long.valueOf(v1_13));
            return;
        }
    }

    public final void zzas(boolean p1)
    {
        this.zzaL();
        return;
    }

    public final void zzat(String p2, com.google.android.gms.measurement.internal.zzlu p3)
    {
        this.zzaW().zzg();
        boolean v0_1 = this.zzH;
        if ((v0_1) && ((!v0_1.equals(p2)) && (p3 == null))) {
            return;
        } else {
            this.zzH = p2;
            this.zzG = p3;
            return;
        }
    }

    public final synthetic void zzau(com.google.android.gms.measurement.internal.zzph p4)
    {
        this.zzaW().zzg();
        this.zzm = new com.google.android.gms.measurement.internal.zzhk(this);
        com.google.android.gms.measurement.internal.zzgs v4_23 = new com.google.android.gms.measurement.internal.zzav(this);
        v4_23.zzax();
        this.zze = v4_23;
        this.zzd().zza(((com.google.android.gms.measurement.internal.zzak) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc)));
        com.google.android.gms.measurement.internal.zzgs v4_5 = new com.google.android.gms.measurement.internal.zznn(this);
        v4_5.zzax();
        this.zzk = v4_5;
        com.google.android.gms.measurement.internal.zzgs v4_7 = new com.google.android.gms.measurement.internal.zzad(this);
        v4_7.zzax();
        this.zzh = v4_7;
        com.google.android.gms.measurement.internal.zzgs v4_9 = new com.google.android.gms.measurement.internal.zzlp(this);
        v4_9.zzax();
        this.zzj = v4_9;
        com.google.android.gms.measurement.internal.zzgs v4_12 = new com.google.android.gms.measurement.internal.zzok(this);
        v4_12.zzax();
        this.zzg = v4_12;
        this.zzf = new com.google.android.gms.measurement.internal.zzhb(this);
        if (this.zzs != this.zzt) {
            this.zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(1);
        this.zzaV().zzk().zza("UploadController is now fully initialized");
        return;
    }

    public final synthetic void zzav()
    {
        this.zzaF();
        return;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzic zzax()
    {
        return this.zzn;
    }

    public final synthetic java.util.Deque zzay()
    {
        return this.zzr;
    }

    public final synthetic void zzaz(long p1)
    {
        this.zzJ = p1;
        return;
    }

    public final void zzc()
    {
        this.zzaW().zzg();
        this.zzj().zzI();
        com.google.android.gms.measurement.internal.zzgs v0_11 = this.zzj();
        v0_11.zzg();
        v0_11.zzaw();
        if (v0_11.zzag()) {
            Integer v1_1 = com.google.android.gms.measurement.internal.zzfy.zzav;
            if (((Long) v1_1.zzb(0)).longValue() != 0) {
                com.google.android.gms.measurement.internal.zzgs v0_1 = v0_11.zzu;
                Integer v1_5 = v0_11.zze().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[] {String.valueOf(v0_1.zzaZ().currentTimeMillis()), String.valueOf(v1_1.zzb(0))}));
                if (v1_5 > null) {
                    v0_1.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(v1_5));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(this.zzaZ().currentTimeMillis());
        }
        this.zzaL();
        return;
    }

    public final com.google.android.gms.measurement.internal.zzal zzd()
    {
        return ((com.google.android.gms.measurement.internal.zzic) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzc();
    }

    public final com.google.android.gms.measurement.internal.zzou zzf()
    {
        return this.zzl;
    }

    public final com.google.android.gms.measurement.internal.zzht zzh()
    {
        com.google.android.gms.measurement.internal.zzht v0 = this.zzc;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzgz zzi()
    {
        com.google.android.gms.measurement.internal.zzgz v0 = this.zzd;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzav zzj()
    {
        com.google.android.gms.measurement.internal.zzav v0 = this.zze;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzhb zzk()
    {
        IllegalStateException v0_0 = this.zzf;
        if (v0_0 == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        } else {
            return v0_0;
        }
    }

    public final com.google.android.gms.measurement.internal.zzok zzl()
    {
        com.google.android.gms.measurement.internal.zzok v0 = this.zzg;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzad zzm()
    {
        com.google.android.gms.measurement.internal.zzad v0 = this.zzh;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzlp zzn()
    {
        com.google.android.gms.measurement.internal.zzlp v0 = this.zzj;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzpk zzp()
    {
        com.google.android.gms.measurement.internal.zzpk v0 = this.zzi;
        com.google.android.gms.measurement.internal.zzpg.zzaS(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zznn zzq()
    {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzgn zzs()
    {
        return this.zzn.zzl();
    }

    public final com.google.android.gms.measurement.internal.zzpp zzt()
    {
        return ((com.google.android.gms.measurement.internal.zzic) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzn)).zzk();
    }

    public final void zzu()
    {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        } else {
            return;
        }
    }

    public final void zzv(com.google.android.gms.measurement.internal.zzr p4)
    {
        this.zzaW().zzg();
        this.zzu();
        String v0_1 = p4.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_1);
        com.google.android.gms.measurement.internal.zzjl v4_2 = com.google.android.gms.measurement.internal.zzjl.zzf(p4.zzs, p4.zzx);
        this.zzB(v0_1);
        this.zzaV().zzk().zzc("Setting storage consent for package", v0_1, v4_2);
        this.zzA(v0_1, v4_2);
        return;
    }

    public final void zzw(com.google.android.gms.measurement.internal.zzr p13)
    {
        int v5_1;
        this.zzaW().zzg();
        this.zzu();
        String v4 = p13.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4);
        android.os.Bundle v13_9 = com.google.android.gms.measurement.internal.zzaz.zzg(p13.zzy);
        this.zzaV().zzk().zzc("Setting DMA consent for package", v4, v13_9);
        this.zzaW().zzg();
        this.zzu();
        com.google.android.gms.measurement.internal.zzpo v0_9 = com.google.android.gms.measurement.internal.zzaz.zzh(this.zzy(v4), 100).zzc();
        this.zzD.put(v4, v13_9);
        this.zzj().zzab(v4, v13_9);
        android.os.Bundle v13_3 = com.google.android.gms.measurement.internal.zzaz.zzh(this.zzy(v4), 100).zzc();
        this.zzaW().zzg();
        this.zzu();
        String v1_6 = com.google.android.gms.measurement.internal.zzji.zzc;
        String v2_4 = 1;
        if ((v0_9 != v1_6) || (v13_3 != com.google.android.gms.measurement.internal.zzji.zzd)) {
            v5_1 = 0;
        } else {
            v5_1 = 1;
        }
        if ((v0_9 != com.google.android.gms.measurement.internal.zzji.zzd) || (v13_3 != v1_6)) {
            v2_4 = 0;
        }
        if ((v5_1 == 0) && (v2_4 == null)) {
            return;
        } else {
            this.zzaV().zzk().zzb("Generated _dcu event for", v4);
            android.os.Bundle v13_8 = new android.os.Bundle();
            if (this.zzj().zzw(this.zzC(), v4, 0, 0, 0, 0, 0, 0, 0).zzf < ((long) this.zzd().zzm(v4, com.google.android.gms.measurement.internal.zzfy.zzam))) {
                v13_8.putLong("_r", 1);
                this.zzaV().zzk().zzc("_dcu realtime event count", v4, Long.valueOf(this.zzj().zzw(this.zzC(), v4, 0, 0, 0, 0, 0, 1, 0).zzf));
            }
            this.zzK.zza(v4, "_dcu", v13_8);
            return;
        }
    }

    public final com.google.android.gms.measurement.internal.zzaz zzx(String p3)
    {
        this.zzaW().zzg();
        this.zzu();
        java.util.Map v0_1 = this.zzD;
        com.google.android.gms.measurement.internal.zzaz v1_1 = ((com.google.android.gms.measurement.internal.zzaz) v0_1.get(p3));
        if (v1_1 == null) {
            v1_1 = this.zzj().zzaa(p3);
            v0_1.put(p3, v1_1);
        }
        return v1_1;
    }

    public final android.os.Bundle zzy(String p5)
    {
        this.zzaW().zzg();
        this.zzu();
        if (this.zzh().zzx(p5) != null) {
            String v5_1;
            android.os.Bundle v0_1 = new android.os.Bundle();
            String v1_0 = this.zzB(p5);
            v0_1.putAll(v1_0.zzn());
            v0_1.putAll(this.zzz(p5, this.zzx(p5), v1_0, new com.google.android.gms.measurement.internal.zzan()).zzf());
            String v1_4 = this.zzj().zzm(p5, "_npa");
            if (v1_4 == null) {
                v5_1 = this.zzaC(p5, new com.google.android.gms.measurement.internal.zzan());
            } else {
                v5_1 = v1_4.zze.equals(Long.valueOf(1));
            }
            String v5_3;
            if (1 == v5_1) {
                v5_3 = "denied";
            } else {
                v5_3 = "granted";
            }
            v0_1.putString("ad_personalization", v5_3);
            return v0_1;
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.measurement.internal.zzaz zzz(String p10, com.google.android.gms.measurement.internal.zzaz p11, com.google.android.gms.measurement.internal.zzjl p12, com.google.android.gms.measurement.internal.zzan p13)
    {
        int v2 = 90;
        if (this.zzh().zzx(p10) != null) {
            com.google.android.gms.measurement.internal.zzji v0_4 = p11.zzc();
            com.google.android.gms.measurement.internal.zzji v3 = com.google.android.gms.measurement.internal.zzji.zzd;
            if (v0_4 == v3) {
                v2 = p11.zzb();
                p13.zzb(com.google.android.gms.measurement.internal.zzjk.zzc, v2);
            } else {
                com.google.android.gms.measurement.internal.zzji v4 = com.google.android.gms.measurement.internal.zzji.zzc;
                if (v0_4 != v4) {
                    if (v0_4 == com.google.android.gms.measurement.internal.zzji.zzb) {
                        com.google.android.gms.measurement.internal.zzji v0_1 = com.google.android.gms.measurement.internal.zzjk.zzc;
                        com.google.android.gms.measurement.internal.zzam v11_3 = this.zzc.zzA(p10, v0_1);
                        if (v11_3 != com.google.android.gms.measurement.internal.zzji.zza) {
                            p13.zzc(v0_1, com.google.android.gms.measurement.internal.zzam.zzi);
                            v0_4 = v11_3;
                            com.google.android.gms.measurement.internal.zzam v11_9 = this.zzc.zzy(p10);
                            com.google.android.gms.measurement.internal.zzaz v10_1 = this.zzh().zzz(p10);
                            if ((v0_4 != com.google.android.gms.measurement.internal.zzji.zzc) && (!v10_1.isEmpty())) {
                                com.google.android.gms.measurement.internal.zzji v0_5 = Boolean.valueOf(v11_9);
                                String v1_1 = "";
                                if (v11_9 != null) {
                                    v1_1 = android.text.TextUtils.join("", v10_1);
                                }
                                return new com.google.android.gms.measurement.internal.zzaz(Boolean.TRUE, v2, v0_5, v1_1);
                            } else {
                                return new com.google.android.gms.measurement.internal.zzaz(Boolean.FALSE, v2, Boolean.valueOf(v11_9), "-");
                            }
                        }
                    }
                    int v7;
                    com.google.android.gms.measurement.internal.zzam v11_4 = this.zzc;
                    com.google.android.gms.measurement.internal.zzji v0_2 = com.google.android.gms.measurement.internal.zzjk.zzc;
                    com.google.android.gms.measurement.internal.zzjk v5_1 = v11_4.zzw(p10, v0_2);
                    com.google.android.gms.measurement.internal.zzam v12_1 = p12.zzp();
                    if ((v12_1 != v3) && (v12_1 != v4)) {
                        v7 = 0;
                    } else {
                        v7 = 1;
                    }
                    if ((v5_1 != com.google.android.gms.measurement.internal.zzjk.zza) || (v7 == 0)) {
                        p13.zzc(v0_2, com.google.android.gms.measurement.internal.zzam.zzb);
                        if (1 == v11_4.zzv(p10, v0_2)) {
                            v0_4 = v3;
                        } else {
                            v0_4 = v4;
                        }
                    } else {
                        p13.zzc(v0_2, com.google.android.gms.measurement.internal.zzam.zzc);
                        v0_4 = v12_1;
                    }
                }
            }
        } else {
            if (p11.zzc() != com.google.android.gms.measurement.internal.zzji.zzc) {
                p13.zzc(com.google.android.gms.measurement.internal.zzjk.zzc, com.google.android.gms.measurement.internal.zzam.zzj);
            } else {
                v2 = p11.zzb();
                p13.zzb(com.google.android.gms.measurement.internal.zzjk.zzc, v2);
            }
            return new com.google.android.gms.measurement.internal.zzaz(Boolean.FALSE, v2, Boolean.TRUE, "-");
        }
    }
}
