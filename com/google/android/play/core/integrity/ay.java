package com.google.android.play.core.integrity;
public final synthetic class ay implements com.google.android.gms.tasks.SuccessContinuation {
    public final synthetic com.google.android.play.core.integrity.az a;
    public final synthetic com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest b;

    public synthetic ay(com.google.android.play.core.integrity.az p1, com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final com.google.android.gms.tasks.Task then(Object p3)
    {
        return this.a.a(this.b, ((Long) p3));
    }
}
