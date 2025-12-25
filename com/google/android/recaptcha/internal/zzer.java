package com.google.android.recaptcha.internal;
final class zzer extends n7.i implements u7.p {
    final synthetic com.google.android.recaptcha.internal.zzes zza;
    final synthetic com.google.android.recaptcha.internal.zztx zzb;

    public zzer(com.google.android.recaptcha.internal.zzes p1, com.google.android.recaptcha.internal.zztx p2, l7.c p3)
    {
        this.zza = p1;
        this.zzb = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzer(this.zza, this.zzb, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzer) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p8)
    {
        c4.b.e0(p8);
        com.google.android.recaptcha.internal.zzes v0 = this.zza;
        if (com.google.android.recaptcha.internal.zzes.zzb(v0) != null) {
            int v8_1 = this.zzb.zzd();
            int v2_0 = new com.google.android.recaptcha.internal.zzej(com.google.android.recaptcha.internal.zzkh.zzg().zzi(v8_1, 0, v8_1.length), System.currentTimeMillis(), 0);
            int v8_4 = com.google.android.recaptcha.internal.zzes.zzb(v0);
            android.content.ContentValues v3_3 = new android.content.ContentValues();
            v3_3.put("ss", v2_0.zzc());
            v3_3.put("ts", Long.valueOf(v2_0.zzb()));
            v8_4.getWritableDatabase().insert("ce", 0, v3_3);
            int v8_8 = (com.google.android.recaptcha.internal.zzes.zzb(v0).zzb() + -500);
            if (v8_8 > 0) {
                com.google.android.recaptcha.internal.zzes.zzb(v0).zza(i7.i.f0(v8_8, com.google.android.recaptcha.internal.zzes.zzb(v0).zzd()));
            }
            if (com.google.android.recaptcha.internal.zzes.zzb(v0).zzb() >= 20) {
                com.google.android.recaptcha.internal.zzes.zze(v0);
            }
        }
        return h7.l.a;
    }
}
