package com.google.android.gms.measurement.internal;
final class zzh {
    private Long zzA;
    private long zzB;
    private String zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private String zzG;
    private byte[] zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private boolean zzQ;
    private long zzR;
    private long zzS;
    private final com.google.android.gms.measurement.internal.zzic zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private Boolean zzq;
    private long zzr;
    private java.util.List zzs;
    private String zzt;
    private boolean zzu;
    private long zzv;
    private long zzw;
    private int zzx;
    private boolean zzy;
    private Long zzz;

    public zzh(com.google.android.gms.measurement.internal.zzic p1, String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zza = p1;
        this.zzb = p2;
        p1.zzaW().zzg();
        return;
    }

    public final void zzA(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzn == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzn = p4;
        return;
    }

    public final long zzB()
    {
        this.zza.zzaW().zzg();
        return this.zzr;
    }

    public final void zzC(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzr == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzr = p4;
        return;
    }

    public final boolean zzD()
    {
        this.zza.zzaW().zzg();
        return this.zzo;
    }

    public final void zzE(boolean p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzo == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzo = p3;
        return;
    }

    public final void zzF(long p6)
    {
        int v0_5;
        int v1 = 0;
        if (p6 < 0) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_5);
        this.zza.zzaW().zzg();
        if (this.zzg != p6) {
            v1 = 1;
        }
        this.zzQ = (this.zzQ | v1);
        this.zzg = p6;
        return;
    }

    public final long zzG()
    {
        this.zza.zzaW().zzg();
        return this.zzg;
    }

    public final long zzH()
    {
        this.zza.zzaW().zzg();
        return this.zzR;
    }

    public final void zzI(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzR == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzR = p4;
        return;
    }

    public final long zzJ()
    {
        this.zza.zzaW().zzg();
        return this.zzS;
    }

    public final void zzK(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzS == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzS = p4;
        return;
    }

    public final void zzL()
    {
        int v0_0 = this.zza;
        v0_0.zzaW().zzg();
        long v1_2 = (this.zzg + 1);
        if (v1_2 > 2147483647) {
            v0_0.zzaV().zze().zzb("Bundle index overflow. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zzb));
            v1_2 = 0;
        }
        this.zzQ = 1;
        this.zzg = v1_2;
        return;
    }

    public final void zzM(long p8)
    {
        int v0_0 = this.zza;
        v0_0.zzaW().zzg();
        long v1_3 = (this.zzg + p8);
        if (v1_3 > 2147483647) {
            v0_0.zzaV().zze().zzb("Bundle index overflow. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zzb));
            v1_3 = (-1 + p8);
        }
        long v8_2 = (this.zzF + 1);
        if (v8_2 > 2147483647) {
            v0_0.zzaV().zze().zzb("Delivery index overflow. appId", com.google.android.gms.measurement.internal.zzgu.zzl(this.zzb));
            v8_2 = 0;
        }
        this.zzQ = 1;
        this.zzg = v1_3;
        this.zzF = v8_2;
        return;
    }

    public final long zzN()
    {
        this.zza.zzaW().zzg();
        return this.zzJ;
    }

    public final void zzO(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzJ == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzJ = p4;
        return;
    }

    public final long zzP()
    {
        this.zza.zzaW().zzg();
        return this.zzK;
    }

    public final void zzQ(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzK == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzK = p4;
        return;
    }

    public final long zzR()
    {
        this.zza.zzaW().zzg();
        return this.zzL;
    }

    public final void zzS(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzL == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzL = p4;
        return;
    }

    public final long zzT()
    {
        this.zza.zzaW().zzg();
        return this.zzM;
    }

    public final void zzU(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzM == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzM = p4;
        return;
    }

    public final long zzV()
    {
        this.zza.zzaW().zzg();
        return this.zzO;
    }

    public final void zzW(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzO == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzO = p4;
        return;
    }

    public final long zzX()
    {
        this.zza.zzaW().zzg();
        return this.zzN;
    }

    public final void zzY(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzN == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzN = p4;
        return;
    }

    public final String zzZ()
    {
        this.zza.zzaW().zzg();
        return this.zzP;
    }

    public final boolean zza()
    {
        this.zza.zzaW().zzg();
        return this.zzQ;
    }

    public final int zzaA()
    {
        this.zza.zzaW().zzg();
        return this.zzD;
    }

    public final void zzaB(int p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzD == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzD = p3;
        return;
    }

    public final int zzaC()
    {
        this.zza.zzaW().zzg();
        return this.zzE;
    }

    public final void zzaD(int p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzE == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzE = p3;
        return;
    }

    public final void zzaE(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzF == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzF = p4;
        return;
    }

    public final long zzaF()
    {
        this.zza.zzaW().zzg();
        return this.zzF;
    }

    public final void zzaG(String p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzG == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzG = p3;
        return;
    }

    public final String zzaH()
    {
        this.zza.zzaW().zzg();
        return this.zzG;
    }

    public final void zzaI(byte[] p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzH == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzH = p3;
        return;
    }

    public final byte[] zzaJ()
    {
        this.zza.zzaW().zzg();
        return this.zzH;
    }

    public final void zzaK(int p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzI == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzI = p3;
        return;
    }

    public final int zzaL()
    {
        this.zza.zzaW().zzg();
        return this.zzI;
    }

    public final String zzaa()
    {
        this.zza.zzaW().zzg();
        String v0_2 = this.zzP;
        this.zzab(0);
        return v0_2;
    }

    public final void zzab(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzP, p3) ^ 1));
        this.zzP = p3;
        return;
    }

    public final boolean zzac()
    {
        this.zza.zzaW().zzg();
        return this.zzp;
    }

    public final void zzad(boolean p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzp == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzp = p3;
        return;
    }

    public final Boolean zzae()
    {
        this.zza.zzaW().zzg();
        return this.zzq;
    }

    public final void zzaf(Boolean p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzq, p3) ^ 1));
        this.zzq = p3;
        return;
    }

    public final java.util.List zzag()
    {
        this.zza.zzaW().zzg();
        return this.zzs;
    }

    public final void zzah(java.util.List p2)
    {
        this.zza.zzaW().zzg();
        if (!java.util.Objects.equals(this.zzs, p2)) {
            int v0_1;
            this.zzQ = 1;
            if (p2 == null) {
                v0_1 = 0;
            } else {
                v0_1 = new java.util.ArrayList(p2);
            }
            this.zzs = v0_1;
        }
        return;
    }

    public final boolean zzai()
    {
        this.zza.zzaW().zzg();
        return this.zzu;
    }

    public final void zzaj(boolean p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzu == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzu = p3;
        return;
    }

    public final long zzak()
    {
        this.zza.zzaW().zzg();
        return this.zzv;
    }

    public final void zzal(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzv == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzv = p4;
        return;
    }

    public final long zzam()
    {
        this.zza.zzaW().zzg();
        return this.zzw;
    }

    public final void zzan(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzw == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzw = p4;
        return;
    }

    public final int zzao()
    {
        this.zza.zzaW().zzg();
        return this.zzx;
    }

    public final void zzap(int p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzx == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzx = p3;
        return;
    }

    public final boolean zzaq()
    {
        this.zza.zzaW().zzg();
        return this.zzy;
    }

    public final void zzar(boolean p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzy == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzy = p3;
        return;
    }

    public final Long zzas()
    {
        this.zza.zzaW().zzg();
        return this.zzz;
    }

    public final void zzat(Long p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzz, p3) ^ 1));
        this.zzz = p3;
        return;
    }

    public final Long zzau()
    {
        this.zza.zzaW().zzg();
        return this.zzA;
    }

    public final void zzav(Long p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzA, p3) ^ 1));
        this.zzA = p3;
        return;
    }

    public final long zzaw()
    {
        this.zza.zzaW().zzg();
        return this.zzB;
    }

    public final void zzax(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzB == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzB = p4;
        return;
    }

    public final String zzay()
    {
        this.zza.zzaW().zzg();
        return this.zzC;
    }

    public final void zzaz(String p3)
    {
        int v1_1;
        this.zza.zzaW().zzg();
        if (this.zzC == p3) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.zzQ = (this.zzQ | v1_1);
        this.zzC = p3;
        return;
    }

    public final void zzb()
    {
        this.zza.zzaW().zzg();
        this.zzQ = 0;
        return;
    }

    public final String zzc()
    {
        this.zza.zzaW().zzg();
        return this.zzb;
    }

    public final String zzd()
    {
        this.zza.zzaW().zzg();
        return this.zzc;
    }

    public final void zze(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzc, p3) ^ 1));
        this.zzc = p3;
        return;
    }

    public final String zzf()
    {
        this.zza.zzaW().zzg();
        return this.zzd;
    }

    public final void zzg(String p4)
    {
        this.zza.zzaW().zzg();
        if (1 == android.text.TextUtils.isEmpty(p4)) {
            p4 = 0;
        }
        this.zzQ = (this.zzQ | (1 ^ java.util.Objects.equals(this.zzd, p4)));
        this.zzd = p4;
        return;
    }

    public final String zzh()
    {
        this.zza.zzaW().zzg();
        return this.zzt;
    }

    public final void zzi(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzt, p3) ^ 1));
        this.zzt = p3;
        return;
    }

    public final String zzj()
    {
        this.zza.zzaW().zzg();
        return this.zze;
    }

    public final void zzk(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zze, p3) ^ 1));
        this.zze = p3;
        return;
    }

    public final String zzl()
    {
        this.zza.zzaW().zzg();
        return this.zzf;
    }

    public final void zzm(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzf, p3) ^ 1));
        this.zzf = p3;
        return;
    }

    public final long zzn()
    {
        this.zza.zzaW().zzg();
        return this.zzh;
    }

    public final void zzo(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzh == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzh = p4;
        return;
    }

    public final long zzp()
    {
        this.zza.zzaW().zzg();
        return this.zzi;
    }

    public final void zzq(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzi == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzi = p4;
        return;
    }

    public final String zzr()
    {
        this.zza.zzaW().zzg();
        return this.zzj;
    }

    public final void zzs(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzj, p3) ^ 1));
        this.zzj = p3;
        return;
    }

    public final long zzt()
    {
        this.zza.zzaW().zzg();
        return this.zzk;
    }

    public final void zzu(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzk == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzk = p4;
        return;
    }

    public final String zzv()
    {
        this.zza.zzaW().zzg();
        return this.zzl;
    }

    public final void zzw(String p3)
    {
        this.zza.zzaW().zzg();
        this.zzQ = (this.zzQ | (java.util.Objects.equals(this.zzl, p3) ^ 1));
        this.zzl = p3;
        return;
    }

    public final long zzx()
    {
        this.zza.zzaW().zzg();
        return this.zzm;
    }

    public final void zzy(long p4)
    {
        int v1_2;
        this.zza.zzaW().zzg();
        if (this.zzm == p4) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        this.zzQ = (this.zzQ | v1_2);
        this.zzm = p4;
        return;
    }

    public final long zzz()
    {
        this.zza.zzaW().zzg();
        return this.zzn;
    }
}
