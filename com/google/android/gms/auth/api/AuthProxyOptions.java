package com.google.android.gms.auth.api;
public final class AuthProxyOptions implements com.google.android.gms.common.api.Api$ApiOptions$Optional {
    public static final com.google.android.gms.auth.api.AuthProxyOptions zza;
    private final android.os.Bundle zzb;

    static AuthProxyOptions()
    {
        com.google.android.gms.auth.api.AuthProxyOptions.zza = new com.google.android.gms.auth.api.AuthProxyOptions(new android.os.Bundle(), 0);
        return;
    }

    public synthetic AuthProxyOptions(android.os.Bundle p1, com.google.android.gms.auth.api.zzb p2)
    {
        this.zzb = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (p2 != this) {
            if ((p2 instanceof com.google.android.gms.auth.api.AuthProxyOptions)) {
                return com.google.android.gms.common.internal.Objects.checkBundlesEquality(this.zzb, ((com.google.android.gms.auth.api.AuthProxyOptions) p2).zzb);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zzb}));
    }

    public final android.os.Bundle zza()
    {
        return new android.os.Bundle(this.zzb);
    }
}
