package com.google.android.play.core.integrity;
final class q implements com.google.android.play.core.integrity.x {
    private android.content.Context a;

    private q()
    {
        return;
    }

    public synthetic q(com.google.android.play.core.integrity.p p1)
    {
        return;
    }

    public final com.google.android.play.core.integrity.q a(android.content.Context p1)
    {
        p1.getClass();
        this.a = p1;
        return this;
    }

    public final com.google.android.play.core.integrity.s b()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 == null) {
            throw new IllegalStateException(String.valueOf(android.content.Context.getCanonicalName()).concat(" must be set"));
        } else {
            return new com.google.android.play.core.integrity.s(v0_0, 0);
        }
    }
}
