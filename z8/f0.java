package z8;
public final class f0 extends z8.z0 {
    public final synthetic int d;
    public final reflect.Method e;
    public final int f;
    public final z8.m g;
    public final Object h;

    public f0(reflect.Method p2, int p3, okhttp3.Headers p4, z8.m p5)
    {
        this.d = 0;
        this.e = p2;
        this.f = p3;
        this.h = p4;
        this.g = p5;
        return;
    }

    public f0(reflect.Method p2, int p3, z8.m p4, String p5)
    {
        this.d = 1;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.h = p5;
        return;
    }

    public final void a(z8.n0 p9, Object p10)
    {
        switch (this.d) {
            case 0:
                if (p10 != null) {
                    try {
                        Object[] v10_11 = ((okhttp3.Headers) this.h);
                        p9.c(v10_11, ((okhttp3.RequestBody) this.g.e(p10)));
                    } catch (IllegalArgumentException v9_1) {
                        reflect.Method v0_2 = new StringBuilder("Unable to convert ");
                        v0_2.append(v10_11);
                        v0_2.append(" to RequestBody");
                        throw z8.z0.n(this.e, this.f, v0_2.toString(), new Object[] {v9_1}));
                    }
                }
                return;
            default:
                int v1_2 = this.f;
                reflect.Method v2 = this.e;
                if (((java.util.Map) p10) == null) {
                    Object[] v10_4 = new Object[0];
                    throw z8.z0.n(v2, v1_2, "Part map was null.", v10_4);
                } else {
                    Object[] v10_6 = ((java.util.Map) p10).entrySet().iterator();
                    while (v10_6.hasNext()) {
                        okhttp3.RequestBody v3_2 = ((java.util.Map$Entry) v10_6.next());
                        okhttp3.Headers v4_1 = ((String) v3_2.getKey());
                        if (v4_1 == null) {
                            Object[] v10_7 = new Object[0];
                            throw z8.z0.n(v2, v1_2, "Part map contained null key.", v10_7);
                        } else {
                            okhttp3.RequestBody v3_3 = v3_2.getValue();
                            if (v3_3 == null) {
                                Object[] v10_9 = new Object[0];
                                throw z8.z0.n(v2, v1_2, v1.a.l("Part map contained null value for key \'", v4_1, "\'."), v10_9);
                            } else {
                                okhttp3.Headers v4_3 = new String[] {"Content-Disposition", v1.a.l("form-data; name=\"", v4_1, "\""), "Content-Transfer-Encoding", ((String) this.h)});
                                okhttp3.Headers.b.getClass();
                                p9.c(okhttp3.Headers$Companion.a(v4_3), ((okhttp3.RequestBody) this.g.e(v3_3)));
                            }
                        }
                    }
                    return;
                }
        }
    }
}
