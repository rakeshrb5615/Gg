package p;
public class f implements java.lang.Iterable {
    public p.c a;
    public p.c b;
    public final java.util.WeakHashMap c;
    public int d;

    public f()
    {
        this.c = new java.util.WeakHashMap();
        this.d = 0;
        return;
    }

    public p.c a(Object p3)
    {
        p.c v0 = this.a;
        while ((v0 != null) && (!v0.a.equals(p3))) {
            v0 = v0.c;
        }
        return v0;
    }

    public Object b(Object p4)
    {
        Object v4_1 = this.a(p4);
        if (v4_1 != null) {
            this.d = (this.d - 1);
            p.c v1_5 = this.c;
            if (!v1_5.isEmpty()) {
                p.c v1_1 = v1_5.keySet().iterator();
                while (v1_1.hasNext()) {
                    ((p.e) v1_1.next()).a(v4_1);
                }
            }
            p.c v1_2 = v4_1.d;
            if (v1_2 == null) {
                this.a = v4_1.c;
            } else {
                v1_2.c = v4_1.c;
            }
            p.c v2_3 = v4_1.c;
            if (v2_3 == null) {
                this.b = v1_2;
            } else {
                v2_3.d = v1_2;
            }
            v4_1.c = 0;
            v4_1.d = 0;
            return v4_1.b;
        } else {
            return 0;
        }
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof p.f)) {
                if (this.d == ((p.f) p7).d) {
                    boolean v1_0 = this.iterator();
                    boolean v7_1 = ((p.f) p7).iterator();
                    do {
                        boolean v3_1 = ((p.b) v1_0);
                        if (v3_1.hasNext()) {
                            Object v4_2 = ((p.b) v7_1);
                            if (v4_2.hasNext()) {
                                boolean v3_3 = ((java.util.Map$Entry) v3_1.next());
                                Object v4_3 = v4_2.next();
                            }
                        }
                        if ((v3_1.hasNext()) || (((p.b) v7_1).hasNext())) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } while(((v3_3) || (v4_3 == null)) && ((!v3_3) || (v3_3.equals(v4_3))));
                    return 0;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        java.util.Iterator v0 = this.iterator();
        int v1 = 0;
        while(true) {
            int v2_4 = ((p.b) v0);
            if (!v2_4.hasNext()) {
                break;
            }
            v1 += ((java.util.Map$Entry) v2_4.next()).hashCode();
        }
        return v1;
    }

    public final java.util.Iterator iterator()
    {
        p.b v0_1 = new p.b(this.a, this.b, 0);
        this.c.put(v0_1, Boolean.FALSE);
        return v0_1;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("[");
        String v1_2 = this.iterator();
        do {
            String v2_3 = ((p.b) v1_2);
            if (!v2_3.hasNext()) {
                v0_2.append("]");
                return v0_2.toString();
            } else {
                v0_2.append(((java.util.Map$Entry) v2_3.next()).toString());
            }
        } while(!v2_3.hasNext());
        v0_2.append(", ");
    }
}
