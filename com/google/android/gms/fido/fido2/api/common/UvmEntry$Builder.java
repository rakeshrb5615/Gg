package com.google.android.gms.fido.fido2.api.common;
public final class UvmEntry$Builder {
    private int zza;
    private short zzb;
    private short zzc;

    public UvmEntry$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntry build()
    {
        return new com.google.android.gms.fido.fido2.api.common.UvmEntry(this.zza, this.zzb, this.zzc);
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntry$Builder setKeyProtectionType(short p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntry$Builder setMatcherProtectionType(short p1)
    {
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntry$Builder setUserVerificationMethod(int p1)
    {
        this.zza = p1;
        return this;
    }
}
