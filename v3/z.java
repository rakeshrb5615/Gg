package v3;
public final class z {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final java.util.ArrayList g;
    public final java.util.ArrayList h;

    public z()
    {
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.d(0, 0, 1132920832, 0);
        return;
    }

    public final void a(float p5)
    {
        v3.t v0_0 = this.e;
        if (v0_0 != p5) {
            v3.t v0_5 = (((p5 - v0_0) + 1135869952) % 1135869952);
            if (v0_5 <= 1127481344) {
                java.util.ArrayList v1_2 = new v3.v(this.c, this.d, this.c, this.d);
                v1_2.f = this.e;
                v1_2.g = v0_5;
                this.h.add(new v3.t(v1_2));
                this.e = p5;
                return;
            }
        }
        return;
    }

    public final void b(android.graphics.Matrix p5, android.graphics.Path p6)
    {
        java.util.ArrayList v0 = this.g;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            ((v3.x) v0.get(v2)).a(p5, p6);
            v2++;
        }
        return;
    }

    public final void c(float p5, float p6)
    {
        java.util.ArrayList v0_1 = new v3.w();
        v0_1.b = p5;
        v0_1.c = p6;
        this.g.add(v0_1);
        v3.u v1_2 = new v3.u(v0_1, this.c, this.d);
        java.util.ArrayList v0_3 = (v1_2.b() + 1132920832);
        float v3_1 = (v1_2.b() + 1132920832);
        this.a(v0_3);
        this.h.add(v1_2);
        this.e = v3_1;
        this.c = p5;
        this.d = p6;
        return;
    }

    public final void d(float p1, float p2, float p3, float p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p1;
        this.d = p2;
        this.e = p3;
        this.f = ((p3 + p4) % 1135869952);
        this.g.clear();
        this.h.clear();
        return;
    }
}
