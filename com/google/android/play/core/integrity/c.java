package com.google.android.play.core.integrity;
final class c extends com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder {
    private long a;
    private byte b;

    public c()
    {
        return;
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder a(int p1)
    {
        this.b = ((byte) (this.b | 2));
        return this;
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest build()
    {
        if (this.b == 3) {
            return new com.google.android.play.core.integrity.e(this.a, 0, 0);
        } else {
            String v0_1 = new StringBuilder();
            if ((this.b & 1) == 0) {
                v0_1.append(" cloudProjectNumber");
            }
            if ((this.b & 2) == 0) {
                v0_1.append(" webViewRequestMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(v0_1.toString()));
        }
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder setCloudProjectNumber(long p1)
    {
        this.a = p1;
        this.b = ((byte) (this.b | 1));
        return this;
    }
}
