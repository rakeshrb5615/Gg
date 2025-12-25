package com.google.android.play.core.integrity;
final class u implements com.google.android.play.core.integrity.av {
    private android.content.Context a;

    private u()
    {
        return;
    }

    public synthetic u(com.google.android.play.core.integrity.t p1)
    {
        return;
    }

    public final com.google.android.play.core.integrity.u a(android.content.Context p1)
    {
        p1.getClass();
        this.a = p1;
        return this;
    }

    public final com.google.android.play.core.integrity.aw b()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 == null) {
            throw new IllegalStateException(String.valueOf(android.content.Context.getCanonicalName()).concat(" must be set"));
        } else {
            return new com.google.android.play.core.integrity.w(v0_0, 0);
        }
    }
}
