package com.google.android.gms.common;
final class zzaa {
    private String zza;
    private long zzb;
    private com.google.android.gms.internal.common.zzah zzc;
    private com.google.android.gms.internal.common.zzah zzd;

    public zzaa()
    {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = com.google.android.gms.internal.common.zzah.zzj();
        this.zzd = com.google.android.gms.internal.common.zzah.zzj();
        return;
    }

    public final com.google.android.gms.common.zzaa zza(String p1)
    {
        this.zza = p1;
        return this;
    }

    public final com.google.android.gms.common.zzaa zzb(long p1)
    {
        this.zzb = p1;
        return this;
    }

    public final com.google.android.gms.common.zzaa zzc(java.util.List p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzc = com.google.android.gms.internal.common.zzah.zzp(p1);
        return this;
    }

    public final com.google.android.gms.common.zzaa zzd(java.util.List p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zzd = com.google.android.gms.internal.common.zzah.zzp(p1);
        return this;
    }

    public final com.google.android.gms.common.zzab zze()
    {
        if (this.zza == null) {
            throw new IllegalStateException("packageName must be defined");
        } else {
            if (this.zzb < 0) {
                throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
            } else {
                if ((this.zzc.isEmpty()) && (this.zzd.isEmpty())) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                } else {
                    return new com.google.android.gms.common.zzab(this.zza, this.zzb, this.zzc, this.zzd, 0);
                }
            }
        }
    }
}
