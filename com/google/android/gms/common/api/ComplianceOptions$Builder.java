package com.google.android.gms.common.api;
public final class ComplianceOptions$Builder {
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;

    public ComplianceOptions$Builder()
    {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = 1;
        return;
    }

    public com.google.android.gms.common.api.ComplianceOptions build()
    {
        return new com.google.android.gms.common.api.ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public com.google.android.gms.common.api.ComplianceOptions$Builder setCallerProductId(int p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.common.api.ComplianceOptions$Builder setDataOwnerProductId(int p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.common.api.ComplianceOptions$Builder setIsUserData(boolean p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.common.api.ComplianceOptions$Builder setProcessingReason(int p1)
    {
        this.zzc = p1;
        return this;
    }
}
