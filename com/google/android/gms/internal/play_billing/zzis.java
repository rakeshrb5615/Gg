package com.google.android.gms.internal.play_billing;
public final class zzis extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzis zzb;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static zzis()
    {
        com.google.android.gms.internal.play_billing.zzis v0_1 = new com.google.android.gms.internal.play_billing.zzis();
        com.google.android.gms.internal.play_billing.zzis.zzb = v0_1;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzis, v0_1);
        return;
    }

    private zzis()
    {
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        return;
    }

    public static synthetic void zzA(com.google.android.gms.internal.play_billing.zzis p1, int p2)
    {
        p1.zzd = (p1.zzd | 128);
        p1.zzl = p2;
        return;
    }

    public static synthetic void zzB(com.google.android.gms.internal.play_billing.zzis p1, int p2)
    {
        p1.zzd = (p1.zzd | 256);
        p1.zzm = p2;
        return;
    }

    public static synthetic void zzC(com.google.android.gms.internal.play_billing.zzis p1, int p2)
    {
        p1.zzd = (p1.zzd | 8);
        p1.zzh = p2;
        return;
    }

    public static synthetic void zzD(com.google.android.gms.internal.play_billing.zzis p1, long p2)
    {
        p1.zzd = (p1.zzd | 16);
        p1.zzi = p2;
        return;
    }

    public static synthetic void zzE(com.google.android.gms.internal.play_billing.zzis p1, long p2)
    {
        p1.zzd = (p1.zzd | 32);
        p1.zzj = p2;
        return;
    }

    public static synthetic void zzF(com.google.android.gms.internal.play_billing.zzis p0, long p1)
    {
        p0.zzd = (p0.zzd | 512);
        p0.zzn = 772604006;
        return;
    }

    public static synthetic void zzG(com.google.android.gms.internal.play_billing.zzis p1, String p2)
    {
        p2.getClass();
        p1.zzd = (p1.zzd | 4);
        p1.zzg = p2;
        return;
    }

    public static synthetic void zzH(com.google.android.gms.internal.play_billing.zzis p1, boolean p2)
    {
        p1.zzd = (p1.zzd | 64);
        p1.zzk = p2;
        return;
    }

    public static synthetic void zzI(com.google.android.gms.internal.play_billing.zzis p1, String p2)
    {
        p2.getClass();
        p1.zzd = (p1.zzd | 1);
        p1.zze = p2;
        return;
    }

    public static synthetic void zzJ(com.google.android.gms.internal.play_billing.zzis p1, String p2)
    {
        p1.zzd = (p1.zzd | 2);
        p1.zzf = p2;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zziq zzc()
    {
        return ((com.google.android.gms.internal.play_billing.zziq) com.google.android.gms.internal.play_billing.zzis.zzb.zzl());
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzis zzd()
    {
        return com.google.android.gms.internal.play_billing.zzis.zzb;
    }

    public final Object zzb(int p12, Object p13, Object p14)
    {
        com.google.android.gms.internal.play_billing.zzis v12_1 = (p12 - 1);
        if (v12_1 == null) {
            return Byte.valueOf(1);
        } else {
            if (v12_1 == 2) {
                String v2 = "zzg";
                String v4 = "zzi";
                String v6 = "zzj";
                String v8 = "zzl";
                return com.google.android.gms.internal.play_billing.zzfi.zzt(com.google.android.gms.internal.play_billing.zzis.zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0002\u0003\u1004\u0003\u0004\u1002\u0004\u0005\u1008\u0001\u0006\u1002\u0005\u0007\u1007\u0006\u0008\u1004\u0007\t\u1004\u0008\n\u1002\t", new Object[] {"zzd", "zzn"}));
            } else {
                if (v12_1 == 3) {
                    return new com.google.android.gms.internal.play_billing.zzis();
                } else {
                    if (v12_1 == 4) {
                        return new com.google.android.gms.internal.play_billing.zziq(0);
                    } else {
                        if (v12_1 != 5) {
                            throw 0;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzis.zzb;
                        }
                    }
                }
            }
        }
    }
}
