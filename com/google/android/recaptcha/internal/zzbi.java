package com.google.android.recaptcha.internal;
public final class zzbi {
    private final d8.c0 zza;
    private final d8.c0 zzb;
    private final d8.c0 zzc;
    private final d8.c0 zzd;

    public zzbi()
    {
        this.zza = new i8.c(q4.b.L(new d8.x1(), i8.n.a));
        i8.c v0_2 = d8.f0.b(new d8.z0(java.util.concurrent.Executors.newSingleThreadExecutor()));
        d8.f0.p(v0_2, new com.google.android.recaptcha.internal.zzbh(0));
        this.zzb = v0_2;
        this.zzc = d8.f0.b(k8.d.c);
        i8.c v0_6 = d8.f0.b(new d8.z0(java.util.concurrent.Executors.newSingleThreadExecutor()));
        d8.f0.p(v0_6, new com.google.android.recaptcha.internal.zzbg(0));
        this.zzd = v0_6;
        return;
    }

    public final d8.c0 zza()
    {
        return this.zzc;
    }

    public final d8.c0 zzb()
    {
        return this.zza;
    }

    public final d8.c0 zzc()
    {
        return this.zzd;
    }

    public final d8.c0 zzd()
    {
        return this.zzb;
    }
}
