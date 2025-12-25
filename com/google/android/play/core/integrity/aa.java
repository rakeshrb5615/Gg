package com.google.android.play.core.integrity;
final class aa implements com.google.android.play.core.integrity.IntegrityManager {
    private final com.google.android.play.core.integrity.aj a;

    public aa(com.google.android.play.core.integrity.aj p1)
    {
        this.a = p1;
        return;
    }

    public final com.google.android.gms.tasks.Task requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest p2)
    {
        return this.a.c(p2);
    }
}
