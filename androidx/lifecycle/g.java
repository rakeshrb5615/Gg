package androidx.lifecycle;
public final class g implements androidx.lifecycle.s {
    public final synthetic int a;
    public final Object b;
    public final Object c;

    public synthetic g(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public g(androidx.lifecycle.t p3)
    {
        this.a = 2;
        this.b = p3;
        androidx.lifecycle.d v0_1 = androidx.lifecycle.d.c;
        Class v3_1 = p3.getClass();
        androidx.lifecycle.b v1_0 = ((androidx.lifecycle.b) v0_1.a.get(v3_1));
        if (v1_0 == null) {
            v1_0 = v0_1.a(v3_1, 0);
        }
        this.c = v1_0;
        return;
    }

    public final void c(androidx.lifecycle.u p6, androidx.lifecycle.n p7)
    {
        switch (this.a) {
            case 0:
                androidx.lifecycle.s v0_2 = ((g1.j) this.b);
                switch (androidx.lifecycle.f.a[p7.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 3:
                        androidx.lifecycle.p v1_4;
                        if (android.os.Build$VERSION.SDK_INT < 28) {
                            v1_4 = new android.os.Handler(android.os.Looper.getMainLooper());
                        } else {
                            v1_4 = g1.b.a(android.os.Looper.getMainLooper());
                        }
                        v1_4.postDelayed(new g1.l(), 500);
                        v0_2.a.b(v0_2);
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                        break;
                    default:
                        throw new a5.o();
                }
                androidx.lifecycle.s v0_4 = ((androidx.lifecycle.s) this.c);
                if (v0_4 != null) {
                    v0_4.c(p6, p7);
                }
                return;
            case 1:
                if (p7 == androidx.lifecycle.n.ON_START) {
                    ((androidx.lifecycle.p) this.b).b(this);
                    ((b2.e) this.c).d();
                }
                return;
            default:
                androidx.lifecycle.p v1_8 = ((androidx.lifecycle.t) this.b);
                androidx.lifecycle.s v0_7 = ((androidx.lifecycle.b) this.c).a;
                androidx.lifecycle.b.a(((java.util.List) v0_7.get(p7)), p6, p7, v1_8);
                androidx.lifecycle.b.a(((java.util.List) v0_7.get(androidx.lifecycle.n.ON_ANY)), p6, p7, v1_8);
                return;
        }
    }
}
