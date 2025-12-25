package com.google.android.gms.internal.location;
final enum class zzfb extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final enum com.google.android.gms.internal.location.zzfb zza;
    private static final synthetic com.google.android.gms.internal.location.zzfb[] zzb;

    static zzfb()
    {
        com.google.android.gms.internal.location.zzfb[] v0_1 = new com.google.android.gms.internal.location.zzfb("INSTANCE", 0);
        com.google.android.gms.internal.location.zzfb.zza = v0_1;
        com.google.android.gms.internal.location.zzfb.zzb = new com.google.android.gms.internal.location.zzfb[] {v0_1});
        return;
    }

    private zzfb(String p1, int p2)
    {
        super("INSTANCE", 0);
        return;
    }

    public static com.google.android.gms.internal.location.zzfb[] values()
    {
        return ((com.google.android.gms.internal.location.zzfb[]) com.google.android.gms.internal.location.zzfb.zzb.clone());
    }

    public final void execute(Runnable p1)
    {
        p1.run();
        return;
    }

    public final String toString()
    {
        return "MoreExecutors.directExecutor()";
    }
}
