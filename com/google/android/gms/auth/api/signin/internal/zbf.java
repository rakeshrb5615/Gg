package com.google.android.gms.auth.api.signin.internal;
final class zbf extends com.google.android.gms.auth.api.signin.internal.zba {
    final synthetic com.google.android.gms.auth.api.signin.internal.zbg zba;

    public zbf(com.google.android.gms.auth.api.signin.internal.zbg p1)
    {
        this.zba = p1;
        return;
    }

    public final void zbd(com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.common.api.Status p4)
    {
        if (p3 != null) {
            com.google.android.gms.auth.api.signin.internal.zbn.zbc(this.zba.zba).zbe(this.zba.zbb, p3);
        }
        this.zba.setResult(new com.google.android.gms.auth.api.signin.GoogleSignInResult(p3, p4));
        return;
    }
}
