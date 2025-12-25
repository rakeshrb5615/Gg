package z8;
public final class b extends z8.l {
    public final synthetic int a;

    public synthetic b(int p1)
    {
        this.a = p1;
        return;
    }

    public z8.m a(reflect.Type p2)
    {
        switch (this.a) {
            case 0:
                int v2_4;
                if (!okhttp3.RequestBody.isAssignableFrom(z8.z0.h(p2))) {
                    v2_4 = 0;
                } else {
                    v2_4 = z8.a.d;
                }
                return v2_4;
            default:
                return super.a(p2);
        }
    }

    public final z8.m b(reflect.Type p3, otation.Annotation[] p4, z8.s0 p5)
    {
        switch (this.a) {
            case 0:
                z8.a v3_2;
                if (p3 != okhttp3.ResponseBody) {
                    if (p3 != Void) {
                        try {
                            if ((z8.z0.b) && (p3 == h7.l)) {
                                v3_2 = z8.a.f;
                                return v3_2;
                            }
                        } catch (NoClassDefFoundError) {
                            z8.z0.b = 0;
                        }
                        v3_2 = 0;
                    } else {
                        v3_2 = z8.a.m;
                    }
                } else {
                    if (!z8.z0.l(p4, b9.w)) {
                        v3_2 = z8.a.c;
                    } else {
                        v3_2 = z8.a.e;
                    }
                }
                return v3_2;
            default:
                z8.a v3_8;
                if (z8.z0.h(p3) == java.util.Optional) {
                    v3_8 = new j6.o(p5.c(z8.z0.g(0, ((reflect.ParameterizedType) p3)), p4), 26);
                } else {
                    v3_8 = 0;
                }
                return v3_8;
        }
    }
}
