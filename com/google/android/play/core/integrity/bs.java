package com.google.android.play.core.integrity;
public final synthetic class bs implements com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider {
    public final synthetic com.google.android.play.core.integrity.bt a;
    public final synthetic long b;
    public final synthetic long c;

    public synthetic bs(com.google.android.play.core.integrity.bt p1, long p2, long p4, int p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p4;
        return;
    }

    public final com.google.android.gms.tasks.Task request(com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest p8)
    {
        return this.a.a(this.b, this.c, 0, p8);
    }
}
