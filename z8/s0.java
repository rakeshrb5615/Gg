package z8;
public final class s0 {
    public final java.util.concurrent.ConcurrentHashMap a;
    public final okhttp3.Call$Factory b;
    public final okhttp3.HttpUrl c;
    public final java.util.List d;
    public final java.util.List e;

    public s0(okhttp3.Call$Factory p2, okhttp3.HttpUrl p3, java.util.List p4, java.util.List p5)
    {
        this.a = new java.util.concurrent.ConcurrentHashMap();
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final z8.f a(reflect.Type p6, otation.Annotation[] p7)
    {
        java.util.Objects.requireNonNull(p6, "returnType == null");
        java.util.Objects.requireNonNull(p7, "annotations == null");
        java.util.List v0_2 = this.e;
        int v1_0 = (v0_2.indexOf(0) + 1);
        String v2_0 = v0_2.size();
        int v3 = v1_0;
        while (v3 < v2_0) {
            z8.f v4_2 = ((z8.e) v0_2.get(v3)).a(p6, p7);
            if (v4_2 == null) {
                v3++;
            } else {
                return v4_2;
            }
        }
        String v7_2 = new StringBuilder("Could not locate call adapter for ");
        v7_2.append(p6);
        v7_2.append(".\n  Tried:");
        IllegalArgumentException v6_2 = v0_2.size();
        while (v1_0 < v6_2) {
            v7_2.append("\n   * ");
            v7_2.append(((z8.e) v0_2.get(v1_0)).getClass().getName());
            v1_0++;
        }
        throw new IllegalArgumentException(v7_2.toString());
    }

    public final z8.m b(reflect.Type p4, otation.Annotation[] p5, otation.Annotation[] p6)
    {
        java.util.Objects.requireNonNull(p4, "type == null");
        java.util.Objects.requireNonNull(p6, "methodAnnotations == null");
        String v5_3 = this.d;
        int v6_1 = (v5_3.indexOf(0) + 1);
        StringBuilder v0_0 = v5_3.size();
        String v1_0 = v6_1;
        while (v1_0 < v0_0) {
            z8.m v2_2 = ((z8.l) v5_3.get(v1_0)).a(p4);
            if (v2_2 == null) {
                v1_0++;
            } else {
                return v2_2;
            }
        }
        StringBuilder v0_2 = new StringBuilder("Could not locate RequestBody converter for ");
        v0_2.append(p4);
        v0_2.append(".\n  Tried:");
        IllegalArgumentException v4_2 = v5_3.size();
        while (v6_1 < v4_2) {
            v0_2.append("\n   * ");
            v0_2.append(((z8.l) v5_3.get(v6_1)).getClass().getName());
            v6_1++;
        }
        throw new IllegalArgumentException(v0_2.toString());
    }

    public final z8.m c(reflect.Type p6, otation.Annotation[] p7)
    {
        java.util.Objects.requireNonNull(p6, "type == null");
        java.util.Objects.requireNonNull(p7, "annotations == null");
        java.util.List v0_2 = this.d;
        int v1_0 = (v0_2.indexOf(0) + 1);
        String v2_0 = v0_2.size();
        int v3 = v1_0;
        while (v3 < v2_0) {
            z8.m v4_2 = ((z8.l) v0_2.get(v3)).b(p6, p7, this);
            if (v4_2 == null) {
                v3++;
            } else {
                return v4_2;
            }
        }
        String v7_2 = new StringBuilder("Could not locate ResponseBody converter for ");
        v7_2.append(p6);
        v7_2.append(".\n  Tried:");
        IllegalArgumentException v6_2 = v0_2.size();
        while (v1_0 < v6_2) {
            v7_2.append("\n   * ");
            v7_2.append(((z8.l) v0_2.get(v1_0)).getClass().getName());
            v1_0++;
        }
        throw new IllegalArgumentException(v7_2.toString());
    }

    public final void d(reflect.Type p3, otation.Annotation[] p4)
    {
        java.util.Objects.requireNonNull(p3, "type == null");
        java.util.List v3_1 = this.d;
        int v4_1 = v3_1.size();
        int v0 = 0;
        while (v0 < v4_1) {
            ((z8.l) v3_1.get(v0)).getClass();
            v0++;
        }
        return;
    }
}
