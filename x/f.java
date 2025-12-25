package x;
public class f implements x.d {
    public x.o a;
    public boolean b;
    public boolean c;
    public final x.o d;
    public int e;
    public int f;
    public int g;
    public int h;
    public x.g i;
    public boolean j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;

    public f(x.o p4)
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.e = 1;
        this.h = 1;
        this.i = 0;
        this.j = 0;
        this.k = new java.util.ArrayList();
        this.l = new java.util.ArrayList();
        this.d = p4;
        return;
    }

    public final void a(x.d p8)
    {
        int v8_0 = this.l;
        int v0_0 = v8_0.size();
        int v1 = 0;
        int v2_2 = 0;
        while (v2_2 < v0_0) {
            int v3_2 = v8_0.get(v2_2);
            v2_2++;
            if (!((x.f) v3_2).j) {
            }
            return;
        }
        this.c = 1;
        int v2_3 = this.a;
        if (v2_3 != 0) {
            v2_3.a(this);
        }
        if (!this.b) {
            int v2_1 = v8_0.size();
            x.f v4 = 0;
            int v3_1 = 0;
            while (v3_1 < v2_1) {
                x.f v5_0 = v8_0.get(v3_1);
                v3_1++;
                x.f v5_1 = ((x.f) v5_0);
                if (!(v5_1 instanceof x.g)) {
                    v1++;
                    v4 = v5_1;
                }
            }
            if ((v4 != null) && ((v1 == 1) && (v4.j))) {
                int v8_2 = this.i;
                if (v8_2 != 0) {
                    if (!v8_2.j) {
                        return;
                    } else {
                        this.f = (this.h * v8_2.g);
                    }
                }
                this.d((v4.g + this.f));
            }
            int v8_6 = this.a;
            if (v8_6 != 0) {
                v8_6.a(this);
            }
        } else {
            this.d.a(this);
            return;
        }
        return;
    }

    public final void b(x.o p2)
    {
        this.k.add(p2);
        if (this.j) {
            p2.a(p2);
        }
        return;
    }

    public final void c()
    {
        this.l.clear();
        this.k.clear();
        this.j = 0;
        this.g = 0;
        this.c = 0;
        this.b = 0;
        return;
    }

    public void d(int p4)
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

    public final String toString()
    {
        String v1_0;
        String v0_1 = new StringBuilder();
        v0_1.append(this.d.b.h0);
        v0_1.append(":");
        switch (this.e) {
            case 1:
                v1_0 = "UNKNOWN";
                break;
            case 2:
                v1_0 = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                v1_0 = "VERTICAL_DIMENSION";
                break;
            case 4:
                v1_0 = "LEFT";
                break;
            case 5:
                v1_0 = "RIGHT";
                break;
            case 6:
                v1_0 = "TOP";
                break;
            case 7:
                v1_0 = "BOTTOM";
                break;
            case 8:
                v1_0 = "BASELINE";
                break;
            default:
                v1_0 = "null";
        }
        String v1_4;
        v0_1.append(v1_0);
        v0_1.append("(");
        if (!this.j) {
            v1_4 = "unresolved";
        } else {
            v1_4 = Integer.valueOf(this.g);
        }
        v0_1.append(v1_4);
        v0_1.append(") <t=");
        v0_1.append(this.l.size());
        v0_1.append(":d=");
        v0_1.append(this.k.size());
        v0_1.append(">");
        return v0_1.toString();
    }
}
