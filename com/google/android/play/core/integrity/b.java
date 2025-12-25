package com.google.android.play.core.integrity;
final class b extends com.google.android.play.core.integrity.bq {
    private String a;
    private com.google.android.play.core.integrity.y b;

    public b()
    {
        return;
    }

    public final com.google.android.play.core.integrity.bq a(com.google.android.play.core.integrity.y p1)
    {
        this.b = p1;
        return this;
    }

    public final com.google.android.play.core.integrity.bq b(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null token");
        } else {
            this.a = p2;
            return this;
        }
    }

    public final com.google.android.play.core.integrity.br c()
    {
        String v0_0 = this.a;
        if (v0_0 != null) {
            IllegalStateException v1_4 = this.b;
            if (v1_4 != null) {
                return new com.google.android.play.core.integrity.br(v0_0, v1_4);
            }
        }
        String v0_4 = new StringBuilder();
        if (this.a == null) {
            v0_4.append(" token");
        }
        if (this.b == null) {
            v0_4.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(v0_4.toString()));
    }
}
