package com.google.android.gms.auth.api.identity;
public final class zbc implements com.google.android.gms.common.api.Api$ApiOptions$Optional {
    private final String zba;

    public zbc(String p1)
    {
        this.zba = p1;
        return;
    }

    public final boolean equals(Object p1)
    {
        return (p1 instanceof com.google.android.gms.auth.api.identity.zbc);
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {com.google.android.gms.auth.api.identity.zbc}));
    }

    public final android.os.Bundle zba()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putString("session_id", this.zba);
        return v0_1;
    }

    public final String zbb()
    {
        return this.zba;
    }
}
