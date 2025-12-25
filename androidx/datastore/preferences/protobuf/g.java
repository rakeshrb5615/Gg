package androidx.datastore.preferences.protobuf;
public class g implements java.lang.Iterable, java.io.Serializable {
    public static final androidx.datastore.preferences.protobuf.g c;
    public static final androidx.datastore.preferences.protobuf.e d;
    public int a;
    public final byte[] b;

    static g()
    {
        androidx.datastore.preferences.protobuf.e v0_2;
        androidx.datastore.preferences.protobuf.g.c = new androidx.datastore.preferences.protobuf.g(androidx.datastore.preferences.protobuf.x.b);
        if (!androidx.datastore.preferences.protobuf.c.a()) {
            v0_2 = new androidx.datastore.preferences.protobuf.e(0);
        } else {
            v0_2 = new androidx.datastore.preferences.protobuf.e(1);
        }
        androidx.datastore.preferences.protobuf.g.d = v0_2;
        return;
    }

    public g(byte[] p2)
    {
        this.a = 0;
        p2.getClass();
        this.b = p2;
        return;
    }

    public static int b(int p3, int p4, int p5)
    {
        String v0_0 = (p4 - p3);
        if ((((p3 | p4) | v0_0) | (p5 - p4)) >= 0) {
            return v0_0;
        } else {
            if (p3 < null) {
                throw new IndexOutOfBoundsException(v1.a.j("Beginning index: ", p3, " < 0"));
            } else {
                if (p4 >= p3) {
                    throw new IndexOutOfBoundsException(v1.a.i("End index: ", p4, p5, " >= "));
                } else {
                    throw new IndexOutOfBoundsException(v1.a.i("Beginning index larger than ending index: ", p3, p4, ", "));
                }
            }
        }
    }

    public static androidx.datastore.preferences.protobuf.g c(byte[] p3, int p4, int p5)
    {
        byte[] v1_1;
        androidx.datastore.preferences.protobuf.g.b(p4, (p4 + p5), p3.length);
        switch (androidx.datastore.preferences.protobuf.g.d.a) {
            case 0:
                v1_1 = java.util.Arrays.copyOfRange(p3, p4, (p5 + p4));
                break;
            default:
                v1_1 = new byte[p5];
                System.arraycopy(p3, p4, v1_1, 0, p5);
        }
        return new androidx.datastore.preferences.protobuf.g(v1_1);
    }

    public byte a(int p2)
    {
        return this.b[p2];
    }

    public void d(int p3, byte[] p4)
    {
        System.arraycopy(this.b, 0, p4, 0, p3);
        return;
    }

    public int e()
    {
        return 0;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if (((p6 instanceof androidx.datastore.preferences.protobuf.g)) && (this.size() == ((androidx.datastore.preferences.protobuf.g) p6).size())) {
                if (this.size() != 0) {
                    if (!(p6 instanceof androidx.datastore.preferences.protobuf.g)) {
                        return p6.equals(this);
                    } else {
                        int v0_3 = this.a;
                        IllegalArgumentException v1_0 = ((androidx.datastore.preferences.protobuf.g) p6).a;
                        if ((v0_3 == 0) || ((v1_0 == null) || (v0_3 == v1_0))) {
                            int v0_4 = this.size();
                            if (v0_4 > ((androidx.datastore.preferences.protobuf.g) p6).size()) {
                                IllegalArgumentException v1_3 = new StringBuilder("Length too large: ");
                                v1_3.append(v0_4);
                                v1_3.append(this.size());
                                throw new IllegalArgumentException(v1_3.toString());
                            } else {
                                if (v0_4 > ((androidx.datastore.preferences.protobuf.g) p6).size()) {
                                    int v0_8 = v1.a.p("Ran off end of other: 0, ", v0_4, ", ");
                                    v0_8.append(((androidx.datastore.preferences.protobuf.g) p6).size());
                                    throw new IllegalArgumentException(v0_8.toString());
                                } else {
                                    IllegalArgumentException v1_8 = ((androidx.datastore.preferences.protobuf.g) p6).b;
                                    String v2_3 = (this.e() + v0_4);
                                    int v0_9 = this.e();
                                    int v6_7 = ((androidx.datastore.preferences.protobuf.g) p6).e();
                                    while (v0_9 < v2_3) {
                                        if (this.b[v0_9] == v1_8[v6_7]) {
                                            v0_9++;
                                            v6_7++;
                                        }
                                    }
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public byte f(int p2)
    {
        return this.b[p2];
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0;
        } else {
            int v0_1 = this.size();
            int v1 = this.e();
            int v3_0 = v0_1;
            int v2 = v1;
            while (v2 < (v1 + v0_1)) {
                v3_0 = ((v3_0 * 31) + this.b[v2]);
                v2++;
            }
            if (v3_0 == 0) {
                v3_0 = 1;
            }
            this.a = v3_0;
            return v3_0;
        }
    }

    public final java.util.Iterator iterator()
    {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public int size()
    {
        return this.b.length;
    }

    public final String toString()
    {
        String v2_2;
        String v0_1 = Integer.toHexString(System.identityHashCode(this));
        int v1 = this.size();
        if (this.size() > 50) {
            String v3_2;
            String v2_1 = new StringBuilder();
            String v3_1 = androidx.datastore.preferences.protobuf.g.b(0, 47, this.size());
            if (v3_1 != null) {
                v3_2 = new androidx.datastore.preferences.protobuf.f(this.b, this.e(), v3_1);
            } else {
                v3_2 = androidx.datastore.preferences.protobuf.g.c;
            }
            v2_1.append(j5.t1.q(v3_2));
            v2_1.append("...");
            v2_2 = v2_1.toString();
        } else {
            v2_2 = j5.t1.q(this);
        }
        String v3_6 = new StringBuilder("<ByteString@");
        v3_6.append(v0_1);
        v3_6.append(" size=");
        v3_6.append(v1);
        v3_6.append(" contents=\"");
        return v1.a.n(v3_6, v2_2, "\">");
    }
}
