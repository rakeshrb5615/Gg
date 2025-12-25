package z6;
public final class q {
    public final String a;
    public final reflect.Field b;
    public final String c;
    public final synthetic reflect.Method d;
    public final synthetic w6.z e;
    public final synthetic w6.z f;
    public final synthetic boolean g;
    public final synthetic boolean h;

    public q(String p1, reflect.Field p2, reflect.Method p3, w6.z p4, w6.z p5, boolean p6, boolean p7)
    {
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.h = p7;
        this.a = p1;
        this.b = p2;
        this.c = p2.getName();
        return;
    }

    public final void a(e7.b p4, Object p5)
    {
        w6.p v0_4;
        w6.p v0_0 = this.d;
        if (v0_0 == null) {
            v0_4 = this.b.get(p5);
        } else {
            try {
                v0_4 = v0_0.invoke(p5, 0);
            } catch (Throwable v4_2) {
                throw new w6.p(v1.a.l("Accessor ", b7.c.d(v0_4, 0), " threw exception"), v4_2.getCause());
            }
        }
        if (v0_4 != p5) {
            p4.z(this.a);
            this.e.c(p4, v0_4);
            return;
        } else {
            return;
        }
    }
}
