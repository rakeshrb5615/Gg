package com.google.android.gms.auth.api.identity;
public final class zbb {
    private String zba;

    private zbb()
    {
        return;
    }

    public synthetic zbb(com.google.android.gms.auth.api.identity.zba p1)
    {
        return;
    }

    public static final com.google.android.gms.auth.api.identity.zbb zbc(com.google.android.gms.auth.api.identity.zbc p1)
    {
        String v1_1 = p1.zbb();
        com.google.android.gms.auth.api.identity.zbb v0_1 = new com.google.android.gms.auth.api.identity.zbb();
        if (v1_1 != null) {
            v0_1.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_1);
        }
        return v0_1;
    }

    public final com.google.android.gms.auth.api.identity.zbb zba(String p1)
    {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public final com.google.android.gms.auth.api.identity.zbc zbb()
    {
        return new com.google.android.gms.auth.api.identity.zbc(this.zba);
    }
}
