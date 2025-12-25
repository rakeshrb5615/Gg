package com.google.android.gms.internal.fido;
final class zzcq extends com.google.android.gms.internal.fido.zzcs {
    final synthetic com.google.android.gms.internal.fido.zzcz zza;
    private int zzb;
    private final int zzc;

    public zzcq(com.google.android.gms.internal.fido.zzcz p2)
    {
        this.zza = p2;
        this.zzb = 0;
        this.zzc = p2.zzd();
        return;
    }

    public final boolean hasNext()
    {
        if (this.zzb >= this.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final byte zza()
    {
        java.util.NoSuchElementException v0_0 = this.zzb;
        if (v0_0 >= this.zzc) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zzb = (v0_0 + 1);
            return this.zza.zzb(v0_0);
        }
    }
}
