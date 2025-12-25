package com.google.android.recaptcha;
public final class Recaptcha {
    public static final com.google.android.recaptcha.Recaptcha INSTANCE;

    static Recaptcha()
    {
        com.google.android.recaptcha.Recaptcha.INSTANCE = new com.google.android.recaptcha.Recaptcha();
        return;
    }

    private Recaptcha()
    {
        return;
    }

    public static final com.google.android.gms.tasks.Task fetchTaskClient(android.app.Application p0, String p1)
    {
        return com.google.android.recaptcha.internal.zzcq.zze(p0, p1);
    }

    public static synthetic Object getClient-BWLJW6A$default(com.google.android.recaptcha.Recaptcha p6, android.app.Application p7, String p8, long p9, l7.c p11, int p12, Object p13)
    {
        if ((p12 & 4) != 0) {
            p9 = 10000;
        }
        return p6.getClient-BWLJW6A(p7, p8, p9, p11);
    }

    public static final com.google.android.gms.tasks.Task getTasksClient(android.app.Application p2, String p3)
    {
        return com.google.android.recaptcha.internal.zzcq.zzc(p2, p3, 10000);
    }

    public static final com.google.android.gms.tasks.Task getTasksClient(android.app.Application p0, String p1, long p2)
    {
        return com.google.android.recaptcha.internal.zzcq.zzc(p0, p1, p2);
    }

    public final Object fetchClient(android.app.Application p1, String p2, l7.c p3)
    {
        return com.google.android.recaptcha.internal.zzcq.zzd(p1, p2, p3);
    }

    public final Object getClient-BWLJW6A(android.app.Application p5, String p6, long p7, l7.c p9)
    {
        com.google.android.recaptcha.Recaptcha$getClient$1 v0_2;
        if (!(p9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1)) {
            v0_2 = new com.google.android.recaptcha.Recaptcha$getClient$1(this, p9);
        } else {
            v0_2 = ((com.google.android.recaptcha.Recaptcha$getClient$1) p9);
            m7.a v1_2 = ((com.google.android.recaptcha.Recaptcha$getClient$1) p9).zzc;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.Recaptcha$getClient$1) p9).zzc = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzdc v9_1 = v0_2.zza;
        m7.a v1_1 = m7.a.a;
        int v2_0 = v0_2.zzc;
        try {
            if (v2_0 == 0) {
                c4.b.e0(v9_1);
                v0_2.zzc = 1;
                v9_1 = com.google.android.recaptcha.internal.zzcq.zzb(p5, p6, p7, v0_2);
                if (v9_1 == v1_1) {
                    return v1_1;
                }
            } else {
                if (v2_0 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    c4.b.e0(v9_1);
                }
            }
        } catch (h7.g v5_3) {
            return c4.b.p(v5_3);
        }
        return ((com.google.android.recaptcha.internal.zzdc) v9_1);
    }
}
