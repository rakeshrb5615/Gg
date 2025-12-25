package v5;
public final class d implements u5.a {
    public static final v5.a e;
    public static final v5.b f;
    public static final v5.b g;
    public static final v5.c h;
    public final java.util.HashMap a;
    public final java.util.HashMap b;
    public final v5.a c;
    public boolean d;

    static d()
    {
        v5.d.e = new v5.a(0);
        v5.d.f = new v5.b(0);
        v5.d.g = new v5.b(1);
        v5.d.h = new v5.c();
        return;
    }

    public d()
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        this.a = v0_1;
        java.util.HashMap v1_1 = new java.util.HashMap();
        this.b = v1_1;
        this.c = v5.d.e;
        this.d = 0;
        v1_1.put(String, v5.d.f);
        v0_1.remove(String);
        v1_1.put(Boolean, v5.d.g);
        v0_1.remove(Boolean);
        v1_1.put(java.util.Date, v5.d.h);
        v0_1.remove(java.util.Date);
        return;
    }

    public final u5.a a(Class p2, t5.d p3)
    {
        this.a.put(p2, p3);
        this.b.remove(p2);
        return this;
    }
}
