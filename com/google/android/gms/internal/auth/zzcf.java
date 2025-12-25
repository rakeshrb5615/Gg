package com.google.android.gms.internal.auth;
final class zzcf extends android.database.ContentObserver {
    final synthetic com.google.android.gms.internal.auth.zzcg zza;

    public zzcf(com.google.android.gms.internal.auth.zzcg p1, android.os.Handler p2)
    {
        this.zza = p1;
        super(0);
        return;
    }

    public final void onChange(boolean p1)
    {
        this.zza.zze();
        return;
    }
}
