package com.google.android.gms.internal.measurement;
final class zzbt extends com.google.android.gms.internal.measurement.zzbz {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public zzbt()
    {
        return;
    }

    public final com.google.android.gms.internal.measurement.zzbz zza(String p1)
    {
        this.zza = "";
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzbz zzb(boolean p1)
    {
        this.zzb = 1;
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzca zzc()
    {
        if ((this.zzb == 1) && ((this.zza != null) && ((this.zzc != 0) && (this.zzd != 0)))) {
            return new com.google.android.gms.internal.measurement.zzbu(this.zza, 0, this.zzc, 0, 0, this.zzd, 0);
        } else {
            String v0_2 = new StringBuilder();
            if (this.zza == null) {
                v0_2.append(" fileOwner");
            }
            if (this.zzb == 0) {
                v0_2.append(" hasDifferentDmaOwner");
            }
            if (this.zzc == 0) {
                v0_2.append(" fileChecks");
            }
            if (this.zzd == 0) {
                v0_2.append(" filePurpose");
            }
            throw new IllegalStateException("Missing required properties:".concat(v0_2.toString()));
        }
    }

    public final com.google.android.gms.internal.measurement.zzbz zzd(int p1)
    {
        this.zzc = p1;
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzbz zze(int p1)
    {
        this.zzd = 1;
        return this;
    }
}
