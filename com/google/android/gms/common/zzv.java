package com.google.android.gms.common;
final class zzv {
    private String zza;
    private Boolean zzb;
    private Boolean zzc;

    private zzv()
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    public synthetic zzv(byte[] p1)
    {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    public final com.google.android.gms.common.zzv zza(String p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.common.zzv zzb(boolean p1)
    {
        this.zzb = Boolean.valueOf(p1);
        return this;
    }

    public final com.google.android.gms.common.zzv zzc(boolean p1)
    {
        this.zzc = Boolean.valueOf(p1);
        return this;
    }

    public final com.google.android.gms.common.zzw zzd()
    {
        IllegalStateException v0_0 = this.zzb;
        if (v0_0 == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        } else {
            if (this.zzc == null) {
                throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
            } else {
                return new com.google.android.gms.common.zzw(this.zza, v0_0.booleanValue(), 0, 0, this.zzc.booleanValue(), 0, 0);
            }
        }
    }
}
