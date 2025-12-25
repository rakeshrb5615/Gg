package com.google.android.gms.common;
abstract class zzm extends com.google.android.gms.common.zzj {
    private static final ref.WeakReference zzb;
    private ref.WeakReference zza;

    static zzm()
    {
        com.google.android.gms.common.zzm.zzb = new ref.WeakReference(0);
        return;
    }

    public zzm(byte[] p1)
    {
        super(p1);
        super.zza = com.google.android.gms.common.zzm.zzb;
        return;
    }

    public abstract byte[] zzb();

    public final byte[] zzc()
    {
        byte[] v0_3 = ((byte[]) this.zza.get());
        if (v0_3 == null) {
            v0_3 = this.zzb();
            this.zza = new ref.WeakReference(v0_3);
        }
        return v0_3;
    }
}
