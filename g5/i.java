package g5;
public final synthetic class i implements java.util.Comparator {
    public final synthetic int a;

    public synthetic i(int p1)
    {
        this.a = p1;
        return;
    }

    public final int compare(Object p5, Object p6)
    {
        switch (this.a) {
            case 0:
                return Long.compare(((java.io.File) p6).lastModified(), ((java.io.File) p5).lastModified());
            case 1:
                return ((j5.f0) ((j5.q1) p5)).a.compareTo(((j5.f0) ((j5.q1) p6)).a);
            case 2:
                return ((java.io.File) p6).getName().compareTo(((java.io.File) p5).getName());
            case 3:
                int v0_1 = m5.a.f;
                return ((java.io.File) p5).getName().substring(0, v0_1).compareTo(((java.io.File) p6).getName().substring(0, v0_1));
            case 4:
                int v5_1;
                if (((byte[]) p5).length == ((byte[]) p6).length) {
                    int v1_0 = 0;
                    while (v1_0 < ((byte[]) p5).length) {
                        int v2_0 = ((byte[]) p5)[v1_0];
                        int v3 = ((byte[]) p6)[v1_0];
                        if (v2_0 == v3) {
                            v1_0++;
                        } else {
                            v5_1 = (v2_0 - v3);
                        }
                    }
                    v5_1 = 0;
                } else {
                    v5_1 = (((byte[]) p5).length - ((byte[]) p6).length);
                }
                return v5_1;
            default:
                return Float.compare(((n2.c) p5).c, ((n2.c) p6).c);
        }
    }
}
