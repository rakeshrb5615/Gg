package com.google.android.gms.internal.firebase-auth-api;
final class zzn extends com.google.android.gms.internal.firebase-auth-api.zzm {
    private final java.util.regex.Matcher zza;

    public zzn(java.util.regex.Matcher p1)
    {
        this.zza = ((java.util.regex.Matcher) com.google.android.gms.internal.firebase-auth-api.zzu.zza(p1));
        return;
    }

    public final int zza()
    {
        return this.zza.end();
    }

    public final boolean zza(int p2)
    {
        return this.zza.find(p2);
    }

    public final int zzb()
    {
        return this.zza.start();
    }

    public final boolean zzc()
    {
        return this.zza.matches();
    }
}
