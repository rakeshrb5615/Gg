package j5;
public final class n0 extends j5.v1 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public n0(int p1, String p2, int p3, long p4, long p6, boolean p8, int p9, String p10, String p11)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p6;
        this.f = p8;
        this.g = p9;
        this.h = p10;
        this.i = p11;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof j5.v1)) || ((this.a != ((j5.n0) ((j5.v1) p8)).a) || ((!this.b.equals(((j5.n0) ((j5.v1) p8)).b)) || ((this.c != ((j5.n0) ((j5.v1) p8)).c) || ((this.d != ((j5.n0) ((j5.v1) p8)).d) || ((this.e != ((j5.n0) ((j5.v1) p8)).e) || ((this.f != ((j5.n0) ((j5.v1) p8)).f) || ((this.g != ((j5.n0) ((j5.v1) p8)).g) || ((!this.h.equals(((j5.n0) ((j5.v1) p8)).h)) || (!this.i.equals(((j5.n0) ((j5.v1) p8)).i))))))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2_7;
        int v1_0 = 1000003;
        int v2_0 = this.d;
        int v0_3 = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * v1_0) ^ this.c) * v1_0) ^ ((int) (v2_0 ^ (v2_0 >> 32))));
        int v2_3 = this.e;
        if (!this.f) {
            v2_7 = 1237;
        } else {
            v2_7 = 1231;
        }
        return ((((((((((v0_3 * v1_0) ^ ((int) (v2_3 ^ (v2_3 >> 32)))) * 1000003) ^ v2_7) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Device{arch=");
        v0_1.append(this.a);
        v0_1.append(", model=");
        v0_1.append(this.b);
        v0_1.append(", cores=");
        v0_1.append(this.c);
        v0_1.append(", ram=");
        v0_1.append(this.d);
        v0_1.append(", diskSpace=");
        v0_1.append(this.e);
        v0_1.append(", simulator=");
        v0_1.append(this.f);
        v0_1.append(", state=");
        v0_1.append(this.g);
        v0_1.append(", manufacturer=");
        v0_1.append(this.h);
        v0_1.append(", modelClass=");
        return v1.a.n(v0_1, this.i, "}");
    }
}
