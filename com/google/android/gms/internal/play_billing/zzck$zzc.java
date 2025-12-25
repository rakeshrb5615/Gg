package com.google.android.gms.internal.play_billing;
final class zzck$zzc extends com.google.android.gms.internal.play_billing.zzck$zza {

    private zzck$zzc()
    {
        throw 0;
    }

    public synthetic zzck$zzc(com.google.android.gms.internal.play_billing.zzco p1)
    {
        super(0);
        return;
    }

    public final com.google.android.gms.internal.play_billing.zzcj$zzd zza(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzcj$zzd p3)
    {
        com.google.android.gms.internal.play_billing.zzcj$zzd v0 = p2.listenersField;
        if (v0 != p3) {
            p2.listenersField = p3;
        }
        return v0;
    }

    public final com.google.android.gms.internal.play_billing.zzck$zze zzb(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzck$zze p3)
    {
        com.google.android.gms.internal.play_billing.zzck$zze v0 = p2.waitersField;
        if (v0 != p3) {
            p2.waitersField = p3;
        }
        return v0;
    }

    public final void zzc(com.google.android.gms.internal.play_billing.zzck$zze p1, com.google.android.gms.internal.play_billing.zzck$zze p2)
    {
        p1.next = p2;
        return;
    }

    public final void zzd(com.google.android.gms.internal.play_billing.zzck$zze p1, Thread p2)
    {
        p1.thread = p2;
        return;
    }

    public final boolean zze(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzcj$zzd p3, com.google.android.gms.internal.play_billing.zzcj$zzd p4)
    {
        if (p2.listenersField != p3) {
            return 0;
        } else {
            p2.listenersField = p4;
            return 1;
        }
    }

    public final boolean zzf(com.google.android.gms.internal.play_billing.zzck p2, Object p3, Object p4)
    {
        if (p2.valueField != p3) {
            return 0;
        } else {
            p2.valueField = p4;
            return 1;
        }
    }

    public final boolean zzg(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzck$zze p3, com.google.android.gms.internal.play_billing.zzck$zze p4)
    {
        if (p2.waitersField != p3) {
            return 0;
        } else {
            p2.waitersField = p4;
            return 1;
        }
    }
}
