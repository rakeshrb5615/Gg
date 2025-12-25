package x;
public class g extends x.f {
    public int m;

    public g(x.o p1)
    {
        super(p1);
        if (!(p1 instanceof x.k)) {
            super.e = 3;
            return;
        } else {
            super.e = 2;
            return;
        }
    }

    public final void d(int p4)
    {
        if (!this.j) {
            this.j = 1;
            this.g = p4;
            java.util.ArrayList v4_1 = this.k;
            int v0_2 = v4_1.size();
            int v1 = 0;
            while (v1 < v0_2) {
                x.d v2_0 = v4_1.get(v1);
                v1++;
                ((x.d) v2_0).a(((x.d) v2_0));
            }
        }
        return;
    }
}
