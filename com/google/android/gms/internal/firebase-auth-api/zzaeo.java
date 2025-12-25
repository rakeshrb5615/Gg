package com.google.android.gms.internal.firebase-auth-api;
public final class zzaeo {
    private static final com.google.android.gms.common.logging.Logger zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaar zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzagc zzc;

    static zzaeo()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaeo.zza = new com.google.android.gms.common.logging.Logger("FirebaseAuth", new String[] {"FirebaseAuthFallback:"}));
        return;
    }

    public zzaeo(q4.f p5, java.util.concurrent.ScheduledExecutorService p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        p5.a();
        android.content.Context v0 = p5.a;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0);
        this.zzb = new com.google.android.gms.internal.firebase-auth-api.zzaar(new com.google.android.gms.internal.firebase-auth-api.zzafb(p5, com.google.android.gms.internal.firebase-auth-api.zzafc.zza()));
        this.zzc = new com.google.android.gms.internal.firebase-auth-api.zzagc(v0, p6);
        return;
    }

    private static boolean zza(long p2, boolean p4)
    {
        if ((p2 > 0) && (p4 != 0)) {
            return 1;
        } else {
            Object[] v0_1 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaeo.zza.w("App hash will not be appended to the request.", v0_1);
            return 0;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaan p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzb.zza(com.google.android.gms.internal.firebase-auth-api.zzafw.zza(((y4.s) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.zza()))), new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaaq p15, com.google.android.gms.internal.firebase-auth-api.zzaem p16)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p15);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p16);
        String v2 = p15.zzb().d;
        com.google.android.gms.internal.firebase-auth-api.zzael v3_1 = new com.google.android.gms.internal.firebase-auth-api.zzael(p16, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza);
        if (this.zzc.zzc(v2)) {
            if (!p15.zzh()) {
                this.zzc.zzb(v3_1, v2);
                return;
            } else {
                this.zzc.zzb(v2);
            }
        }
        long v4 = p15.zza();
        boolean v6 = p15.zzi();
        com.google.android.gms.internal.firebase-auth-api.zzagc v15_2 = com.google.android.gms.internal.firebase-auth-api.zzaiq.zza(p15.zze(), p15.zzb().a, p15.zzb().d, p15.zzd(), p15.zzg(), p15.zzf(), p15.zzc());
        if (com.google.android.gms.internal.firebase-auth-api.zzaeo.zza(v4, v6)) {
            v15_2.zza(new com.google.android.gms.internal.firebase-auth-api.zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(v2, v3_1, v4, v6);
        this.zzb.zza(v15_2, this.zzc.zza(v3_1, v2));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagx p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5.zzb());
        this.zzb.zza(p5.zzb(), p5.zzc(), new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahm p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4.zzd());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaho p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaht p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahz p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zza(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5.zzb()), p5.zza(), new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaic p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4.zzb());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaie p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaij p7, com.google.android.gms.internal.firebase-auth-api.zzaem p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        String v1 = p7.zzd();
        com.google.android.gms.internal.firebase-auth-api.zzael v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzael(p8, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza);
        if (this.zzc.zzc(v1)) {
            if (!p7.zze()) {
                this.zzc.zzb(v2_1, v1);
                return;
            } else {
                this.zzc.zzb(v1);
            }
        }
        long v3 = p7.zzb();
        boolean v5 = p7.zzf();
        if (com.google.android.gms.internal.firebase-auth-api.zzaeo.zza(v3, v5)) {
            p7.zza(new com.google.android.gms.internal.firebase-auth-api.zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(v1, v2_1, v3, v5);
        this.zzb.zza(p7, this.zzc.zza(v2_1, v1));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzain p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zzd(p4.zza(), new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaiu p3, com.google.android.gms.internal.firebase-auth-api.zzaem p4)
    {
        this.zzb.zza(p3, new com.google.android.gms.internal.firebase-auth-api.zzael(((com.google.android.gms.internal.firebase-auth-api.zzaem) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4)), com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzajb p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzajc p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zza(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p4, com.google.android.gms.internal.firebase-auth-api.zzajb p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zza(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zza(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p9, String p10, String p11, long p12, boolean p14, boolean p15, String p16, String p17, String p18, boolean p19, com.google.android.gms.internal.firebase-auth-api.zzaem p20)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9, "idToken should not be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p20);
        com.google.android.gms.internal.firebase-auth-api.zzael v7_1 = new com.google.android.gms.internal.firebase-auth-api.zzael(p20, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza);
        if (this.zzc.zzc(p10)) {
            if (!p14) {
                this.zzc.zzb(v7_1, p10);
                return;
            } else {
                this.zzc.zzb(p10);
            }
        }
        com.google.android.gms.internal.firebase-auth-api.zzais v6_1 = com.google.android.gms.internal.firebase-auth-api.zzais.zza(p9, p10, p11, p16, p17, p18, 0);
        if (com.google.android.gms.internal.firebase-auth-api.zzaeo.zza(p12, p19)) {
            v6_1.zza(new com.google.android.gms.internal.firebase-auth-api.zzagm(this.zzc.zzb()));
        }
        com.google.android.gms.internal.firebase-auth-api.zzael v2_1 = v7_1;
        this.zzc.zza(p10, v2_1, p12, p19);
        this.zzb.zza(v6_1, this.zzc.zza(v2_1, p10));
        return;
    }

    public final void zza(String p4, String p5, String p6, com.google.android.gms.internal.firebase-auth-api.zzaem p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4, "cachedTokenState should not be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5, "uid should not be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        this.zzb.zza(p4, p5, p6, new com.google.android.gms.internal.firebase-auth-api.zzael(p7, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p7, String p8, String p9, String p10, com.google.android.gms.internal.firebase-auth-api.zzaem p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p7);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        this.zzb.zza(p7, p8, p9, p10, new com.google.android.gms.internal.firebase-auth-api.zzael(p11, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p8, String p9, String p10, String p11, String p12, com.google.android.gms.internal.firebase-auth-api.zzaem p13)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p13);
        this.zzb.zza(p8, p9, p10, p11, p12, new com.google.android.gms.internal.firebase-auth-api.zzael(p13, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p4, y4.c0 p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zza(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zza(String p1, y4.o p2, String p3, com.google.android.gms.internal.firebase-auth-api.zzaem p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(y4.o p1, String p2, String p3, String p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "cachedTokenState should not be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzahm p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4.zzc());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zzb(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzb(String p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zzb(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzb(String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zzb(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzb(String p7, String p8, String p9, String p10, com.google.android.gms.internal.firebase-auth-api.zzaem p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p7);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        this.zzb.zzb(p7, p8, p9, p10, new com.google.android.gms.internal.firebase-auth-api.zzael(p11, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzc(com.google.android.gms.internal.firebase-auth-api.zzahm p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzb.zzc(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzc(String p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zzc(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzc(String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zzc(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzd(String p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zze(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzd(String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zzd(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zze(String p4, com.google.android.gms.internal.firebase-auth-api.zzaem p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        this.zzb.zzf(p4, new com.google.android.gms.internal.firebase-auth-api.zzael(p5, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zze(String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        this.zzb.zze(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }

    public final void zzf(String p4, String p5, com.google.android.gms.internal.firebase-auth-api.zzaem p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        this.zzb.zzf(p4, p5, new com.google.android.gms.internal.firebase-auth-api.zzael(p6, com.google.android.gms.internal.firebase-auth-api.zzaeo.zza));
        return;
    }
}
