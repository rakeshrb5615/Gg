package p0;
public class c {
    public final Object[] a;
    public int b;

    public c()
    {
        Object[] v0_1 = new Object[256];
        this.a = v0_1;
        return;
    }

    public c(int p2)
    {
        if (p2 <= null) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else {
            IllegalArgumentException v2_3 = new Object[p2];
            this.a = v2_3;
            return;
        }
    }

    public Object a()
    {
        int v0_0 = this.b;
        if (v0_0 <= 0) {
            return 0;
        } else {
            int v0_3 = (v0_0 - 1);
            Object[] v2 = this.a;
            Object v3 = v2[v0_3];
            kotlin.jvm.internal.j.c(v3, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            v2[v0_3] = 0;
            this.b = (this.b - 1);
            return v3;
        }
    }

    public void b(u.b p4)
    {
        int v0_0 = this.b;
        Object[] v1 = this.a;
        if (v0_0 < v1.length) {
            v1[v0_0] = p4;
            this.b = (v0_0 + 1);
        }
        return;
    }

    public boolean c(Object p7)
    {
        kotlin.jvm.internal.j.e(p7, "instance");
        int v2_0 = 0;
        while(true) {
            int v0_1;
            Object[] v3 = this.a;
            if (v2_0 >= this.b) {
                break;
            }
            if (v3[v2_0] != p7) {
                v2_0++;
            } else {
                v0_1 = 1;
            }
            if (v0_1 != 0) {
                throw new IllegalStateException("Already in the pool!");
            } else {
                int v0_3 = this.b;
                if (v0_3 >= v3.length) {
                    return 0;
                } else {
                    v3[v0_3] = p7;
                    this.b = (v0_3 + 1);
                    return 1;
                }
            }
        }
        v0_1 = 0;
    }
}
