package z8;
public final class i implements z8.f {
    public final synthetic int a;
    public final reflect.Type b;

    public synthetic i(int p1, reflect.Type p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object a(z8.z p4)
    {
        switch (this.a) {
            case 0:
                z8.j v0_3 = new z8.j(p4);
                p4.f(new z8.h(v0_3, 0));
                return v0_3;
            default:
                z8.j v0_1 = new z8.j(p4);
                p4.f(new z8.h(v0_1, 1));
                return v0_1;
        }
    }

    public final reflect.Type c()
    {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }
}
