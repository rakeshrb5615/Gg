package com.google.android.gms.internal.auth-api;
final class zbf extends com.google.android.gms.internal.auth-api.zbd {
    final synthetic com.google.android.gms.internal.auth-api.zbg zba;

    public zbf(com.google.android.gms.internal.auth-api.zbg p1)
    {
        this.zba = p1;
        return;
    }

    public final void zbb(com.google.android.gms.common.api.Status p3, com.google.android.gms.auth.api.credentials.Credential p4)
    {
        this.zba.setResult(new com.google.android.gms.internal.auth-api.zbe(p3, p4));
        return;
    }

    public final void zbc(com.google.android.gms.common.api.Status p4)
    {
        this.zba.setResult(new com.google.android.gms.internal.auth-api.zbe(p4, 0));
        return;
    }
}
