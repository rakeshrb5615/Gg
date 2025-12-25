package com.google.android.play.core.integrity;
abstract class bm extends k4.a0 {
    final synthetic com.google.android.play.core.integrity.bn f;

    public bm(com.google.android.play.core.integrity.bn p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.f = p1;
        super(p2);
        return;
    }

    public final void a(Exception p3)
    {
        if ((p3 instanceof k4.e)) {
            if (!com.google.android.play.core.integrity.bn.k(this.f)) {
                super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-9, p3));
                return;
            } else {
                super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, p3));
                return;
            }
        } else {
            super.a(p3);
            return;
        }
    }
}
