package androidx.lifecycle;
public abstract class b0 {
    public final androidx.lifecycle.e0 a;
    public boolean b;
    public int c;
    public final synthetic androidx.lifecycle.c0 d;

    public b0(androidx.lifecycle.c0 p1, androidx.lifecycle.e0 p2)
    {
        this.d = p1;
        this.c = -1;
        this.a = p2;
        return;
    }

    public final void a(boolean p6)
    {
        if (p6 != this.b) {
            int v6_4;
            this.b = p6;
            if (p6 == 0) {
                v6_4 = -1;
            } else {
                v6_4 = 1;
            }
            androidx.lifecycle.c0 v1 = this.d;
            int v2_1 = v1.c;
            v1.c = (v6_4 + v2_1);
            if (!v1.d) {
                v1.d = 1;
                while(true) {
                    int v3 = v1.c;
                    if (v2_1 == v3) {
                        break;
                    }
                    if ((v2_1 != 0) || (v3 <= 0)) {
                        Throwable v4 = 0;
                    } else {
                        v4 = 1;
                    }
                    if ((v2_1 <= 0) || (v3 != 0)) {
                        int v2_0 = 0;
                    } else {
                        v2_0 = 1;
                    }
                    if (v4 == null) {
                        if (v2_0 != 0) {
                            v1.f();
                        }
                    } else {
                        v1.e();
                    }
                    v2_1 = v3;
                }
                v1.d = 0;
            }
            if (this.b) {
                v1.c(this);
            }
        }
        return;
    }

    public void b()
    {
        return;
    }

    public boolean d(androidx.lifecycle.u p1)
    {
        return 0;
    }

    public abstract boolean e();
}
