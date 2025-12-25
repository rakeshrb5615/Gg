package com.google.android.play.core.integrity;
final class bl extends com.google.android.play.core.integrity.bi {
    final synthetic com.google.android.play.core.integrity.bn c;
    private final k4.z d;

    public bl(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.c = p1;
        super(p1, p2);
        super.d = new k4.z("OnWarmUpIntegrityTokenCallback");
        return;
    }

    public final void e(android.os.Bundle p4)
    {
        super.e(p4);
        long v1_3 = new Object[0];
        this.d.b("onWarmUpExpressIntegrityToken", v1_3);
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = com.google.android.play.core.integrity.bn.g(this.c).a(p4);
        if (v0_1 == null) {
            this.a.trySetResult(Long.valueOf(p4.getLong("warm.up.sid")));
            return;
        } else {
            this.a.trySetException(v0_1);
            return;
        }
    }
}
