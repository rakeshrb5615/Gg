package com.google.android.recaptcha.internal;
final class zzdh extends n7.i implements u7.p {
    int zza;
    final synthetic com.google.android.recaptcha.internal.zzdt zzb;

    public zzdh(com.google.android.recaptcha.internal.zzdt p1, l7.c p2)
    {
        this.zzb = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p2, l7.c p3)
    {
        return new com.google.android.recaptcha.internal.zzdh(this.zzb, p3);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzdh) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        m7.a v0 = m7.a.a;
        String v1_0 = this.zza;
        c4.b.e0(p8);
        if (v1_0 == null) {
            Object v8_1 = new com.google.android.recaptcha.internal.zzbs(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()).zza(com.google.android.recaptcha.internal.zzdt.zza(this.zzb));
            String v1_2 = this.zzb;
            com.google.android.recaptcha.internal.zzff v2_0 = com.google.android.recaptcha.internal.zzdt.zzp(v1_2);
            String v1_4 = com.google.android.recaptcha.internal.zzdt.zza(v1_2).getPackageName();
            int v3_2 = com.google.android.recaptcha.internal.zzdt.zze(this.zzb).zzd();
            String v4_2 = com.google.android.recaptcha.internal.zzdt.zzc(this.zzb).zza();
            com.google.android.recaptcha.internal.zztn v6 = com.google.android.recaptcha.internal.zzto.zzf();
            v6.zzt(v2_0);
            v6.zzq(v1_4);
            v6.zzu(v8_1);
            v6.zzr("18.6.1");
            v6.zzs(v3_2);
            v6.zzf(String.valueOf(android.os.Build$VERSION.SDK_INT));
            v6.zze(v4_2);
            Object v8_6 = ((com.google.android.recaptcha.internal.zzto) v6.zzi());
            String v1_5 = this.zzb;
            com.google.android.recaptcha.internal.zzff v2_1 = com.google.android.recaptcha.internal.zzdt.zzg(v1_5);
            String v1_7 = com.google.android.recaptcha.internal.zzdt.zzd(v1_5).zzb();
            this.zza = 1;
            Object v8_7 = v2_1.zzc(v1_7, v8_6, this);
            if (v8_7 != v0) {
                return v8_7;
            } else {
                return v0;
            }
        } else {
            return p8;
        }
    }
}
