package com.google.android.gms.common.api;
public final class ApiMetadata$Builder {
    private com.google.android.gms.common.api.ComplianceOptions zza;
    private boolean zzb;
    private boolean zzc;

    public ApiMetadata$Builder()
    {
        this.zzb = 0;
        return;
    }

    public com.google.android.gms.common.api.ApiMetadata build()
    {
        com.google.android.gms.common.api.ApiMetadata v0_1 = new com.google.android.gms.common.api.ApiMetadata(this.zza, this.zzb);
        v0_1.zza(this.zzc);
        return v0_1;
    }

    public com.google.android.gms.common.api.ApiMetadata$Builder setCallbackSupportEnabled(boolean p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.common.api.ApiMetadata$Builder setComplianceOptions(com.google.android.gms.common.api.ComplianceOptions p1)
    {
        this.zza = p1;
        return this;
    }

    public final synthetic com.google.android.gms.common.api.ApiMetadata$Builder zza(boolean p1)
    {
        this.zzc = p1;
        return this;
    }
}
