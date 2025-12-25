package com.google.android.play.core.integrity;
final class am extends com.google.android.play.core.integrity.IntegrityTokenRequest$Builder {
    private String a;
    private Long b;

    public am()
    {
        return;
    }

    public final com.google.android.play.core.integrity.IntegrityTokenRequest build()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        } else {
            return new com.google.android.play.core.integrity.ao(v0_0, this.b, 0, 0);
        }
    }

    public final com.google.android.play.core.integrity.IntegrityTokenRequest$Builder setCloudProjectNumber(long p1)
    {
        this.b = Long.valueOf(p1);
        return this;
    }

    public final com.google.android.play.core.integrity.IntegrityTokenRequest$Builder setNonce(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null nonce");
        } else {
            this.a = p2;
            return this;
        }
    }
}
