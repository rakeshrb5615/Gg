package com.google.android.gms.common.api.internal;
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(android.app.Activity p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Activity must not be null");
        this.zza = p2;
        return;
    }

    public LifecycleActivity(android.content.ContextWrapper p1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean zza()
    {
        return (this.zza instanceof androidx.fragment.app.j0);
    }

    public final boolean zzb()
    {
        return (this.zza instanceof android.app.Activity);
    }

    public final android.app.Activity zzc()
    {
        return ((android.app.Activity) this.zza);
    }

    public final androidx.fragment.app.j0 zzd()
    {
        return ((androidx.fragment.app.j0) this.zza);
    }
}
