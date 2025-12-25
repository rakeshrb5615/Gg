package com.google.android.play.core.integrity;
final class a extends com.google.android.play.core.integrity.ap {
    private String a;
    private com.google.android.play.core.integrity.y b;

    public a()
    {
        return;
    }

    public final com.google.android.play.core.integrity.ap a(com.google.android.play.core.integrity.y p1)
    {
        this.b = p1;
        return this;
    }

    public final com.google.android.play.core.integrity.ap b(String p1)
    {
        this.a = p1;
        return this;
    }

    public final com.google.android.play.core.integrity.aq c()
    {
        String v0_0 = this.a;
        if (v0_0 != null) {
            IllegalStateException v1_4 = this.b;
            if (v1_4 != null) {
                return new com.google.android.play.core.integrity.aq(v0_0, v1_4);
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
