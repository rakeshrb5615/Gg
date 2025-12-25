package com.google.android.play.core.integrity;
final class bj extends com.google.android.play.core.integrity.y {
    final synthetic com.google.android.play.core.integrity.bk a;

    public bj(com.google.android.play.core.integrity.bk p1, String p2, long p3)
    {
        this.a = p1;
        super(p2, p3);
        return;
    }

    public final com.google.android.gms.tasks.Task b(android.app.Activity p5, android.os.Bundle p6)
    {
        p6.putLong("cloud.prj", com.google.android.play.core.integrity.bk.f(this.a));
        return this.a.c.c(p5, p6);
    }
}
