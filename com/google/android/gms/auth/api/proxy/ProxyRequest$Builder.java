package com.google.android.gms.auth.api.proxy;
public class ProxyRequest$Builder {
    private final String zza;
    private int zzb;
    private long zzc;
    private byte[] zzd;
    private final android.os.Bundle zze;

    public ProxyRequest$Builder(String p4)
    {
        this.zzb = com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET;
        this.zzc = 3000;
        IllegalArgumentException v0_8 = new byte[0];
        this.zzd = v0_8;
        this.zze = new android.os.Bundle();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        if (!android.util.Patterns.WEB_URL.matcher(p4).matches()) {
            throw new IllegalArgumentException(v1.a.l("The supplied url [ ", p4, "] is not match Patterns.WEB_URL!"));
        } else {
            this.zza = p4;
            return;
        }
    }

    public com.google.android.gms.auth.api.proxy.ProxyRequest build()
    {
        if (this.zzd == null) {
            byte[] v0_2 = new byte[0];
            this.zzd = v0_2;
        }
        return new com.google.android.gms.auth.api.proxy.ProxyRequest(2, this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public com.google.android.gms.auth.api.proxy.ProxyRequest$Builder putHeader(String p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "Header name cannot be null or empty!");
        if (p3 == null) {
            p3 = "";
        }
        this.zze.putString(p2, p3);
        return this;
    }

    public com.google.android.gms.auth.api.proxy.ProxyRequest$Builder setBody(byte[] p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.auth.api.proxy.ProxyRequest$Builder setHttpMethod(int p3)
    {
        int v0 = 0;
        if ((p3 >= 0) && (p3 <= com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE)) {
            v0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "Unrecognized http method code.");
        this.zzb = p3;
        return this;
    }

    public com.google.android.gms.auth.api.proxy.ProxyRequest$Builder setTimeoutMillis(long p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "The specified timeout must be non-negative.");
        this.zzc = p3;
        return this;
    }
}
