package h1;
public abstract class c {
    public int a;
    public int b;
    public int c;
    public Object d;

    public c()
    {
        if (c5.c.a == null) {
            c5.c.a = new c5.c();
        }
        return;
    }

    public int b(int p3)
    {
        if (p3 >= this.c) {
            return 0;
        } else {
            return ((java.nio.ByteBuffer) this.d).getShort((this.b + p3));
        }
    }

    public void c()
    {
        if (((j7.f) this.d).n != this.c) {
            throw new java.util.ConcurrentModificationException();
        } else {
            return;
        }
    }

    public abstract Object d();

    public abstract void e();

    public void f()
    {
        while(true) {
            int v0_0 = this.a;
            int v1_1 = ((j7.f) this.d);
            if ((v0_0 >= v1_1.f) || (v1_1.c[v0_0] >= 0)) {
                break;
            }
            this.a = (v0_0 + 1);
        }
        return;
    }

    public void g(android.view.View p3, Object p4)
    {
        if (android.os.Build$VERSION.SDK_INT < this.b) {
            int v0_1;
            if (android.os.Build$VERSION.SDK_INT < this.b) {
                v0_1 = p3.getTag(this.a);
                if (!((Class) this.d).isInstance(v0_1)) {
                    v0_1 = 0;
                }
            } else {
                v0_1 = this.d(p3);
            }
            if (this.h(v0_1, p4)) {
                int v0_4;
                int v0_3 = q0.q0.e(p3);
                if (v0_3 != 0) {
                    if (!(v0_3 instanceof q0.a)) {
                        v0_4 = new q0.b(v0_3);
                    } else {
                        v0_4 = ((q0.a) v0_3).a;
                    }
                } else {
                    v0_4 = 0;
                }
                if (v0_4 == 0) {
                    v0_4 = new q0.b();
                }
                q0.q0.n(p3, v0_4);
                p3.setTag(this.a, p4);
                q0.q0.i(p3, this.c);
            }
            return;
        } else {
            this.e(p3, p4);
            return;
        }
    }

    public abstract boolean h();

    public boolean hasNext()
    {
        if (this.a >= ((j7.f) this.d).f) {
            return 0;
        } else {
            return 1;
        }
    }

    public void remove()
    {
        IllegalStateException v0_1 = ((j7.f) this.d);
        this.c();
        if (this.b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        } else {
            v0_1.c();
            v0_1.l(this.b);
            this.b = -1;
            this.c = v0_1.n;
            return;
        }
    }
}
