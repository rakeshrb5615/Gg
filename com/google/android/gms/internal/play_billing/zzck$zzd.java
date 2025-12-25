package com.google.android.gms.internal.play_billing;
final class zzck$zzd extends com.google.android.gms.internal.play_billing.zzck$zza {
    static final sun.misc.Unsafe zza;
    static final long zzb;
    static final long zzc;
    static final long zzd;
    static final long zze;
    static final long zzf;
    public static final synthetic int zzg;

    static zzck$zzd()
    {
        RuntimeException v1_1 = sun.misc.Unsafe.getUnsafe();
    }

    private zzck$zzd()
    {
        throw 0;
    }

    public synthetic zzck$zzd(com.google.android.gms.internal.play_billing.zzco p1)
    {
        super(0);
        return;
    }

    public final com.google.android.gms.internal.play_billing.zzcj$zzd zza(com.google.android.gms.internal.play_billing.zzck p3, com.google.android.gms.internal.play_billing.zzcj$zzd p4)
    {
        do {
            com.google.android.gms.internal.play_billing.zzcj$zzd v0 = p3.listenersField;
        } while((p4 != v0) && (!this.zze(p3, v0, p4)));
        return v0;
    }

    public final com.google.android.gms.internal.play_billing.zzck$zze zzb(com.google.android.gms.internal.play_billing.zzck p3, com.google.android.gms.internal.play_billing.zzck$zze p4)
    {
        do {
            com.google.android.gms.internal.play_billing.zzck$zze v0 = p3.waitersField;
        } while((p4 != v0) && (!this.zzg(p3, v0, p4)));
        return v0;
    }

    public final void zzc(com.google.android.gms.internal.play_billing.zzck$zze p4, com.google.android.gms.internal.play_billing.zzck$zze p5)
    {
        com.google.android.gms.internal.play_billing.zzck$zzd.zza.putObject(p4, com.google.android.gms.internal.play_billing.zzck$zzd.zzf, p5);
        return;
    }

    public final void zzd(com.google.android.gms.internal.play_billing.zzck$zze p4, Thread p5)
    {
        com.google.android.gms.internal.play_billing.zzck$zzd.zza.putObject(p4, com.google.android.gms.internal.play_billing.zzck$zzd.zze, p5);
        return;
    }

    public final boolean zze(com.google.android.gms.internal.play_billing.zzck p7, com.google.android.gms.internal.play_billing.zzcj$zzd p8, com.google.android.gms.internal.play_billing.zzcj$zzd p9)
    {
        return com.google.android.gms.internal.play_billing.zzcm.zza(com.google.android.gms.internal.play_billing.zzck$zzd.zza, p7, com.google.android.gms.internal.play_billing.zzck$zzd.zzb, p8, p9);
    }

    public final boolean zzf(com.google.android.gms.internal.play_billing.zzck p7, Object p8, Object p9)
    {
        return com.google.android.gms.internal.play_billing.zzcm.zza(com.google.android.gms.internal.play_billing.zzck$zzd.zza, p7, com.google.android.gms.internal.play_billing.zzck$zzd.zzd, p8, p9);
    }

    public final boolean zzg(com.google.android.gms.internal.play_billing.zzck p7, com.google.android.gms.internal.play_billing.zzck$zze p8, com.google.android.gms.internal.play_billing.zzck$zze p9)
    {
        return com.google.android.gms.internal.play_billing.zzcm.zza(com.google.android.gms.internal.play_billing.zzck$zzd.zza, p7, com.google.android.gms.internal.play_billing.zzck$zzd.zzc, p8, p9);
    }
}
