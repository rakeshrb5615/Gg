package com.google.android.gms.internal.play_billing;
final enum class zzcp extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final enum com.google.android.gms.internal.play_billing.zzcp zza;
    private static final synthetic com.google.android.gms.internal.play_billing.zzcp[] zzb;

    static zzcp()
    {
        com.google.android.gms.internal.play_billing.zzcp[] v0_1 = new com.google.android.gms.internal.play_billing.zzcp("INSTANCE", 0);
        com.google.android.gms.internal.play_billing.zzcp.zza = v0_1;
        com.google.android.gms.internal.play_billing.zzcp.zzb = new com.google.android.gms.internal.play_billing.zzcp[] {v0_1});
        return;
    }

    private zzcp(String p1, int p2)
    {
        super("INSTANCE", 0);
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzcp[] values()
    {
        return ((com.google.android.gms.internal.play_billing.zzcp[]) com.google.android.gms.internal.play_billing.zzcp.zzb.clone());
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
