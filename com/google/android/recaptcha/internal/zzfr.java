package com.google.android.recaptcha.internal;
final class zzfr extends n7.i implements u7.p {
    final synthetic Exception zza;
    final synthetic com.google.android.recaptcha.internal.zzgd zzb;
    final synthetic com.google.android.recaptcha.internal.zzft zzc;
    private synthetic Object zzd;

    public zzfr(Exception p1, com.google.android.recaptcha.internal.zzgd p2, com.google.android.recaptcha.internal.zzft p3, l7.c p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p5, l7.c p6)
    {
        com.google.android.recaptcha.internal.zzfr v0_1 = new com.google.android.recaptcha.internal.zzfr(this.zza, this.zzb, this.zzc, p6);
        v0_1.zzd = p5;
        return v0_1;
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzfr) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p7)
    {
        String[] v0_2;
        c4.b.e0(p7);
        h7.l v7_2 = ((d8.c0) this.zzd);
        String[] v0_6 = this.zza;
        if (!(v0_6 instanceof com.google.android.recaptcha.internal.zzce)) {
            String[] v0_8 = this.zzb;
            String v1_12 = com.google.android.recaptcha.internal.zzte.zzf();
            v1_12.zze(v0_8.zza());
            v1_12.zzr(2);
            v1_12.zzq(2);
            v0_2 = v1_12;
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzce) v0_6).zza();
            v0_2.zze(this.zzb.zza());
        }
        String[] v0_5 = ((com.google.android.recaptcha.internal.zzte) v0_2.zzi());
        v0_5.zzl();
        v0_5.zzk();
        kotlin.jvm.internal.s.a(this.zza.getClass()).b();
        this.zza.getMessage();
        String v1_6 = this.zzb;
        String v2_0 = v1_6.zzb();
        String v1_7 = v1_6.zza;
        if (v1_7 == null) {
            v1_7 = 0;
        }
        String v1_8 = com.google.android.recaptcha.internal.zzev.zza(v2_0, v1_7);
        String v2_2 = this.zzb.zzd();
        if (v2_2.length() == 0) {
            v2_2 = "recaptcha.m.Main.rge";
        }
        h7.l v7_6;
        h7.l v7_5 = ((d8.e1) v7_2.a().get(d8.b0.b));
        if (v7_5 == null) {
            v7_6 = 1;
        } else {
            v7_6 = v7_5.isActive();
        }
        if (v7_6 != null) {
            h7.l v7_7 = this.zzc;
            com.google.android.recaptcha.internal.zzkh v3_2 = com.google.android.recaptcha.internal.zzkh.zzh();
            String[] v0_7 = v0_5.zzd();
            String[] v0_9 = v3_2.zzi(v0_7, 0, v0_7.length);
            com.google.android.recaptcha.internal.zzkh v3_3 = com.google.android.recaptcha.internal.zzkh.zzh();
            String v1_10 = v1_8.zzd();
            com.google.android.recaptcha.internal.zzft.zze(v7_7, v2_2, new String[] {v0_9, v3_3.zzi(v1_10, 0, v1_10.length)}));
        }
        return h7.l.a;
    }
}
