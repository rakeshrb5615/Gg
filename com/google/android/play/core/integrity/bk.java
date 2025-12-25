package com.google.android.play.core.integrity;
final class bk extends com.google.android.play.core.integrity.bi {
    final synthetic com.google.android.play.core.integrity.bn c;
    private final k4.z d;
    private final long e;

    public bk(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2, long p3)
    {
        this.c = p1;
        super(p1, p2);
        super.d = new k4.z("OnRequestIntegrityTokenCallback");
        super.e = p3;
        return;
    }

    public static bridge synthetic long f(com.google.android.play.core.integrity.bk p2)
    {
        return p2.e;
    }

    public final void c(android.os.Bundle p5)
    {
        super.c(p5);
        com.google.android.play.core.integrity.b v1_3 = new Object[0];
        this.d.b("onRequestExpressIntegrityToken", v1_3);
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = com.google.android.play.core.integrity.bn.g(this.c).a(p5);
        if (v0_1 == null) {
            com.google.android.play.core.integrity.bj v3_1 = new com.google.android.play.core.integrity.bj(this, com.google.android.play.core.integrity.bn.j(this.c), p5.getLong("request.token.sid"));
            com.google.android.gms.tasks.TaskCompletionSource v0_4 = this.a;
            com.google.android.play.core.integrity.b v1_2 = new com.google.android.play.core.integrity.b();
            v1_2.b(p5.getString("token"));
            v1_2.a(v3_1);
            v0_4.trySetResult(v1_2.c());
            return;
        } else {
            this.a.trySetException(v0_1);
            return;
        }
    }
}
