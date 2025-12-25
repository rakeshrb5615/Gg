package com.google.android.play.core.integrity;
final class aq extends com.google.android.play.core.integrity.IntegrityTokenResponse {
    private final String a;
    private final com.google.android.play.core.integrity.y b;

    public aq(String p1, com.google.android.play.core.integrity.y p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final com.google.android.gms.tasks.Task showDialog(android.app.Activity p2, int p3)
    {
        return this.b.a(p2, p3);
    }

    public final String token()
    {
        return this.a;
    }
}
