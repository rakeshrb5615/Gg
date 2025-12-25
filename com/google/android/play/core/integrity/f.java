package com.google.android.play.core.integrity;
final class f extends com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder {
    private String a;

    public f()
    {
        return;
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest build()
    {
        return new com.google.android.play.core.integrity.h(this.a, 0);
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder setRequestHash(String p1)
    {
        this.a = p1;
        return this;
    }
}
