package com.google.android.play.core.integrity;
final class az implements com.google.android.play.core.integrity.StandardIntegrityManager {
    private final com.google.android.play.core.integrity.bn a;
    private final com.google.android.play.core.integrity.bt b;

    public az(com.google.android.play.core.integrity.bn p1, com.google.android.play.core.integrity.bt p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final synthetic com.google.android.gms.tasks.Task a(com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest p8, Long p9)
    {
        long v2 = p8.b();
        long v4 = p9.longValue();
        p8.a();
        return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.play.core.integrity.bs(this.b, v2, v4, 0));
    }

    public final com.google.android.gms.tasks.Task prepareIntegrityToken(com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest p5)
    {
        com.google.android.gms.tasks.Task v0_0 = p5.b();
        p5.a();
        return this.a.e(v0_0, 0).onSuccessTask(new com.google.android.play.core.integrity.ay(this, p5));
    }
}
