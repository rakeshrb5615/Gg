package com.google.android.gms.internal.auth;
final class zzdv extends com.google.android.gms.internal.auth.zzdx {
    final synthetic com.google.android.gms.internal.auth.zzee zza;
    private int zzb;
    private final int zzc;

    public zzdv(com.google.android.gms.internal.auth.zzee p2)
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
