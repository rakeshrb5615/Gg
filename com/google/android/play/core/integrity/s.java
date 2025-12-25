package com.google.android.play.core.integrity;
final class s {
    private final com.google.android.play.core.integrity.s a;
    private final k4.j b;
    private final k4.j c;
    private final k4.j d;
    private final k4.j e;
    private final k4.j f;

    public s(android.content.Context p4, com.google.android.play.core.integrity.r p5)
    {
        this.a = this;
        if (p4 == null) {
            throw new NullPointerException("instance cannot be null");
        } else {
            String v5_4 = new k4.i(p4, 0);
            this.b = v5_4;
            NullPointerException v4_2 = k4.g.b(com.google.android.play.core.integrity.ac.a());
            this.c = v4_2;
            com.google.android.play.core.integrity.au v1_1 = new com.google.android.play.core.integrity.au(v5_4, com.google.android.play.core.integrity.l.a());
            this.d = v1_1;
            NullPointerException v4_3 = k4.g.b(new com.google.android.play.core.integrity.al(v5_4, v4_2, v1_1, com.google.android.play.core.integrity.l.a()));
            this.e = v4_3;
            this.f = k4.g.b(new com.google.android.play.core.integrity.ab(v4_3));
            return;
        }
    }

    public final com.google.android.play.core.integrity.IntegrityManager a()
    {
        return ((com.google.android.play.core.integrity.IntegrityManager) this.f.a());
    }
}
