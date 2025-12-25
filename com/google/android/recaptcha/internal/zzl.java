package com.google.android.recaptcha.internal;
public final class zzl {
    private final java.util.List zza;
    private com.google.android.recaptcha.internal.zzek zzb;

    public zzl()
    {
        this(0, 1, 0);
        return;
    }

    public synthetic zzl(java.util.List p1, int p2, kotlin.jvm.internal.f p3)
    {
        this.zza = new java.util.ArrayList();
        com.google.android.recaptcha.internal.zze[] v1_5 = new com.google.android.recaptcha.internal.zze[0];
        com.google.android.recaptcha.internal.zze[] v1_7 = ((com.google.android.recaptcha.internal.zze[]) i7.n.a.toArray(v1_5));
        this.zzh(((com.google.android.recaptcha.internal.zze[]) java.util.Arrays.copyOf(v1_7, v1_7.length)));
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzek zza(com.google.android.recaptcha.internal.zzl p0)
    {
        return p0.zzb;
    }

    public static final synthetic void zze(com.google.android.recaptcha.internal.zzl p0, com.google.android.recaptcha.internal.zzek p1)
    {
        p0.zzb = p1;
        return;
    }

    private final varargs void zzh(com.google.android.recaptcha.internal.zze[] p3)
    {
        java.util.List v0 = this.zza;
        kotlin.jvm.internal.j.e(v0, "<this>");
        kotlin.jvm.internal.j.e(p3, "elements");
        v0.addAll(i7.h.V(p3));
        return;
    }

    public final Object zzb(String p7, long p8, l7.c p10)
    {
        return d8.f0.e(new com.google.android.recaptcha.internal.zzh(this, p7, p8, 0), p10);
    }

    public final Object zzc(long p12, com.google.android.recaptcha.internal.zzsc p14, com.google.android.recaptcha.internal.zzek p15, l7.c p16)
    {
        String v1_1;
        if (!(p16 instanceof com.google.android.recaptcha.internal.zzi)) {
            v1_1 = new com.google.android.recaptcha.internal.zzi(this, p16);
        } else {
            v1_1 = ((com.google.android.recaptcha.internal.zzi) p16);
            com.google.android.recaptcha.internal.zzk v2_4 = ((com.google.android.recaptcha.internal.zzi) p16).zzc;
            if ((v2_4 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzi) p16).zzc = (v2_4 - -2147483648);
            }
        }
        Object v0_1 = v1_1.zza;
        m7.a v9 = m7.a.a;
        com.google.android.recaptcha.internal.zzk v2_1 = v1_1.zzc;
        if (v2_1 == null) {
            c4.b.e0(v0_1);
            com.google.android.recaptcha.internal.zzk v2_3 = new com.google.android.recaptcha.internal.zzk(this, p15, p12, p14, 0);
            v1_1.zzc = 1;
            v0_1 = d8.f0.e(v2_3, v1_1);
            if (v0_1 == v9) {
                return v9;
            }
        } else {
            if (v2_1 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                c4.b.e0(v0_1);
            }
        }
        return ((h7.h) v0_1).a;
    }

    public final java.util.List zzd()
    {
        return this.zza;
    }

    public final varargs void zzf(com.google.android.recaptcha.internal.zze[] p2)
    {
        this.zzh(((com.google.android.recaptcha.internal.zze[]) java.util.Arrays.copyOf(p2, 1)));
        return;
    }

    public final void zzg(com.google.android.recaptcha.internal.zzsr p3)
    {
        java.util.Iterator v0_1 = this.zza.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.recaptcha.internal.zze) v0_1.next()).zzk(p3);
        }
        return;
    }
}
