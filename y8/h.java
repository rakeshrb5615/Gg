package y8;
public final class h extends x8.m {
    public static final x8.y f;
    public final ClassLoader c;
    public final x8.m d;
    public final h7.j e;

    static h()
    {
        y8.h.f = a6.e.d("/");
        return;
    }

    public h(ClassLoader p3)
    {
        x8.v v1 = x8.m.a;
        kotlin.jvm.internal.j.e(v1, "systemFileSystem");
        this.c = p3;
        this.d = v1;
        this.e = a.a.F(new a8.j(this, 7));
        return;
    }

    public final x8.u c(x8.y p6)
    {
        if (!c5.c.k(p6)) {
            StringBuilder v2_9 = new StringBuilder("file not found: ");
            v2_9.append(p6);
            throw new java.io.FileNotFoundException(v2_9.toString());
        } else {
            java.io.FileNotFoundException v0_2 = y8.h.f;
            v0_2.getClass();
            java.io.FileNotFoundException v0_5 = y8.c.b(v0_2, p6, 1).b(v0_2).a.r();
            StringBuilder v2_5 = ((java.util.List) this.e.getValue()).iterator();
            while (v2_5.hasNext()) {
                x8.y v3_2 = ((h7.f) v2_5.next());
                p6 = ((x8.m) v3_2.a).c(((x8.y) v3_2.b).c(v0_5));
                return p6;
            }
            StringBuilder v2_7 = new StringBuilder("file not found: ");
            v2_7.append(p6);
            throw new java.io.FileNotFoundException(v2_7.toString());
        }
    }

    public final x8.h0 f(x8.y p5)
    {
        kotlin.jvm.internal.j.e(p5, "file");
        if (!c5.c.k(p5)) {
            StringBuilder v2_4 = new StringBuilder("file not found: ");
            v2_4.append(p5);
            throw new java.io.FileNotFoundException(v2_4.toString());
        } else {
            x8.t v0_2 = y8.h.f;
            v0_2.getClass();
            x8.t v0_6 = this.c.getResource(y8.c.b(v0_2, p5, 0).b(v0_2).a.r());
            if (v0_6 == null) {
                StringBuilder v2_2 = new StringBuilder("file not found: ");
                v2_2.append(p5);
                throw new java.io.FileNotFoundException(v2_2.toString());
            } else {
                java.io.InputStream v5_3 = v0_6.openConnection();
                if ((v5_3 instanceof java.net.JarURLConnection)) {
                    ((java.net.JarURLConnection) v5_3).setUseCaches(0);
                }
                java.io.InputStream v5_4 = v5_3.getInputStream();
                kotlin.jvm.internal.j.d(v5_4, "getInputStream(...)");
                return new x8.t(v5_4, new x8.j0());
            }
        }
    }
}
