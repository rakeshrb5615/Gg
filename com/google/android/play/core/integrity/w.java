package com.google.android.play.core.integrity;
final class w implements com.google.android.play.core.integrity.aw {
    private final com.google.android.play.core.integrity.w a;
    private final k4.j b;
    private final k4.j c;
    private final k4.j d;
    private final k4.j e;
    private final k4.j f;
    private final k4.j g;

    public w(android.content.Context p4, com.google.android.play.core.integrity.v p5)
    {
        this.a = this;
        if (p4 == null) {
            throw new NullPointerException("instance cannot be null");
        } else {
            String v5_5 = new k4.i(p4, 0);
            this.b = v5_5;
            NullPointerException v4_2 = k4.g.b(com.google.android.play.core.integrity.bb.a());
            this.c = v4_2;
            com.google.android.play.core.integrity.au v1_1 = new com.google.android.play.core.integrity.au(v5_5, com.google.android.play.core.integrity.n.a());
            this.d = v1_1;
            NullPointerException v4_3 = k4.g.b(new com.google.android.play.core.integrity.bp(v5_5, v4_2, v1_1, com.google.android.play.core.integrity.n.a()));
            this.e = v4_3;
            String v5_3 = k4.g.b(new com.google.android.play.core.integrity.bu(v4_3));
            this.f = v5_3;
            this.g = k4.g.b(new com.google.android.play.core.integrity.ba(v4_3, v5_3));
            return;
        }
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager a()
    {
        return ((com.google.android.play.core.integrity.StandardIntegrityManager) this.g.a());
    }
}
