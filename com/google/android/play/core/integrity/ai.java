package com.google.android.play.core.integrity;
final class ai extends k4.v {
    final synthetic com.google.android.play.core.integrity.aj a;
    private final k4.z b;
    private final com.google.android.gms.tasks.TaskCompletionSource c;

    public ai(com.google.android.play.core.integrity.aj p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        this.a = p2;
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        super.b = new k4.z("OnRequestIntegrityTokenCallback");
        super.c = p3;
        return;
    }

    public final void b(android.os.Bundle p5)
    {
        this.a.a.d(this.c);
        com.google.android.play.core.integrity.a v1_7 = new Object[0];
        this.b.b("onRequestIntegrityToken", v1_7);
        com.google.android.play.core.integrity.aq v0_3 = com.google.android.play.core.integrity.aj.d(this.a).a(p5);
        if (v0_3 == null) {
            com.google.android.play.core.integrity.aq v0_5 = p5.getString("token");
            if (v0_5 != null) {
                com.google.android.play.core.integrity.ah v3_1 = new com.google.android.play.core.integrity.ah(this, com.google.android.play.core.integrity.aj.g(this.a), p5.getLong("request.token.sid"));
                com.google.android.gms.tasks.TaskCompletionSource v5_3 = this.c;
                com.google.android.play.core.integrity.a v1_4 = new com.google.android.play.core.integrity.a();
                v1_4.b(v0_5);
                v1_4.a(v3_1);
                v5_3.trySetResult(v1_4.c());
                return;
            } else {
                this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, 0));
                return;
            }
        } else {
            this.c.trySetException(v0_3);
            return;
        }
    }
}
