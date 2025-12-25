package com.google.android.recaptcha.internal;
final class zzfh extends n7.i implements u7.p {
    final synthetic com.google.android.recaptcha.internal.zzfj zza;
    final synthetic com.google.android.recaptcha.internal.zzbr zzb;
    final synthetic com.google.android.recaptcha.internal.zzsp zzc;

    public zzfh(com.google.android.recaptcha.internal.zzfj p1, com.google.android.recaptcha.internal.zzbr p2, com.google.android.recaptcha.internal.zzsp p3, l7.c p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        super(2, p4);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        return new com.google.android.recaptcha.internal.zzfh(this.zza, this.zzb, this.zzc, p5);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzfh) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p5)
    {
        c4.b.e0(p5);
        try {
            com.google.android.recaptcha.internal.zzew v5_1 = com.google.android.recaptcha.internal.zzfj.zza(this.zza).zza(this.zzb.zzd());
            v5_1.zzc();
            v5_1.zze(this.zzc.zzd());
            String v0_4 = ((com.google.android.recaptcha.internal.zzsr) v5_1.zza(com.google.android.recaptcha.internal.zzsr.zzi()));
            v5_1.zzd();
            return v0_4;
        } catch (String v0_8) {
            throw v0_8;
        } catch (String v0_5) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzc, com.google.android.recaptcha.internal.zzba.zzF, v0_5.getMessage());
        } catch (String v0_9) {
            if (v5_1 != null) {
                v5_1.zzd();
            }
            throw v0_9;
        }
    }
}
