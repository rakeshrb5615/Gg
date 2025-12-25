package d6;
public final synthetic class b implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic d6.c b;

    public synthetic b(d6.c p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                this.b.a();
                return;
            default:
                Throwable v0_7 = this.b;
                String v2_0 = v0_7.a;
                v2_0.a();
                String v2_3 = k2.c.g(v2_0.a);
                try {
                    int v3_1 = v0_7.c.A();
                } catch (Throwable v0_1) {
                    if (v2_3 != null) {
                        v2_3.B();
                    }
                    throw v0_1;
                }
                if (v2_3 != null) {
                    v2_3.B();
                }
                k2.c v7_0;
                String v2_4 = v3_1.b;
                k2.c v4_0 = 0;
                if (v2_4 != 5) {
                    v7_0 = 0;
                } else {
                    v7_0 = 1;
                }
                String v2_7;
                if (v7_0 != null) {
                    v2_7 = v0_7.g(v3_1);
                } else {
                    if (v2_4 == 3) {
                        v4_0 = 1;
                    }
                    if (v4_0 == null) {
                        if (!v0_7.d.a(v3_1)) {
                            return;
                        } else {
                            v2_7 = v0_7.b(v3_1);
                        }
                    } else {
                    }
                }
                k2.c v4_1 = v0_7.a;
                v4_1.a();
                k2.c v4_3 = k2.c.g(v4_1.a);
                try {
                    v0_7.c.r(v2_7);
                } catch (Throwable v0_5) {
                    if (v4_3 != null) {
                        v4_3.B();
                    }
                    throw v0_5;
                }
                if (v4_3 != null) {
                    v4_3.B();
                }
                if ((v0_7.k.size() != 0) && (!android.text.TextUtils.equals(v3_1.a, v2_7.a))) {
                    java.io.IOException v1_10 = v0_7.k.iterator();
                    if (v1_10.hasNext()) {
                        if (v1_10.next() != null) {
                            throw new ClassCastException();
                        } else {
                            throw 0;
                        }
                    } else {
                    }
                }
                if (v2_7.b == 4) {
                    v0_7.j = v2_7.a;
                }
                java.io.IOException v1_19 = v2_7.b;
                if (v1_19 != 5) {
                    if ((v1_19 != 2) && (v1_19 != 1)) {
                        v0_7.i(v2_7);
                        return;
                    } else {
                        v0_7.h(new java.io.IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    }
                } else {
                    v0_7.h(new d6.e());
                    return;
                }
        }
    }
}
