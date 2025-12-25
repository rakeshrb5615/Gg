package m4;
public abstract class f implements java.util.Map, java.io.Serializable {
    public transient m4.k a;
    public transient m4.l b;
    public transient m4.m c;

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object p1)
    {
        if (this.get(p1) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean containsValue(Object p5)
    {
        m4.m v0_0 = this.c;
        if (v0_0 == null) {
            m4.m v1_1 = new m4.m(((m4.n) this).e, 1, ((m4.n) this).f);
            this.c = v1_1;
            v0_0 = v1_1;
        }
        return v0_0.contains(p5);
    }

    public final java.util.Set entrySet()
    {
        m4.n v0_0 = this.a;
        if (v0_0 != null) {
            return v0_0;
        } else {
            m4.k v1_1 = new m4.k(((m4.n) this), ((m4.n) this).e, ((m4.n) this).f);
            this.a = v1_1;
            return v1_1;
        }
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if (!(p2 instanceof java.util.Map)) {
                return 0;
            } else {
                return ((m4.g) this.entrySet()).equals(((java.util.Map) p2).entrySet());
            }
        } else {
            return 1;
        }
    }

    public abstract Object get();

    public final Object getOrDefault(Object p1, Object p2)
    {
        Object v1_1 = this.get(p1);
        if (v1_1 == null) {
            return p2;
        } else {
            return v1_1;
        }
    }

    public final int hashCode()
    {
        java.util.Iterator v0_0 = this.a;
        if (v0_0 == null) {
            int v1_2 = new m4.k(((m4.n) this), ((m4.n) this).e, ((m4.n) this).f);
            this.a = v1_2;
            v0_0 = v1_2;
        }
        java.util.Iterator v0_1 = v0_0.iterator();
        int v2_0 = 0;
        while (v0_1.hasNext()) {
            int v3_2;
            int v3_1 = v0_1.next();
            if (v3_1 == 0) {
                v3_2 = 0;
            } else {
                v3_2 = v3_1.hashCode();
            }
            v2_0 = (~ (~ (v2_0 + v3_2)));
        }
        return v2_0;
    }

    public final boolean isEmpty()
    {
        if (((m4.n) this).size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Set keySet()
    {
        m4.n v0_0 = this.b;
        if (v0_0 != null) {
            return v0_0;
        } else {
            m4.l v2_1 = new m4.l(((m4.n) this), new m4.m(((m4.n) this).e, 0, ((m4.n) this).f));
            this.b = v2_1;
            return v2_1;
        }
    }

    public final Object put(Object p1, Object p2)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(java.util.Map p1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public final String toString()
    {
        String v0_4 = ((m4.n) this).f;
        if (v0_4 < null) {
            throw new IllegalArgumentException(g2.g.c(v0_4, "size cannot be negative but was: "));
        } else {
            IllegalArgumentException v1_1 = new StringBuilder(((int) Math.min((((long) v0_4) * 8), 1073741824)));
            v1_1.append(123);
            String v0_7 = ((m4.k) this.entrySet()).i();
            int v2_3 = 1;
            while(true) {
                java.util.Map$Entry v3_1 = ((m4.b) v0_7);
                if (!v3_1.hasNext()) {
                    break;
                }
                java.util.Map$Entry v3_3 = ((java.util.Map$Entry) v3_1.next());
                if (v2_3 == 0) {
                    v1_1.append(", ");
                }
                v1_1.append(v3_3.getKey());
                v1_1.append(61);
                v1_1.append(v3_3.getValue());
                v2_3 = 0;
            }
            v1_1.append(125);
            return v1_1.toString();
        }
    }

    public final java.util.Collection values()
    {
        Object[] v0_0 = this.c;
        if (v0_0 != null) {
            return v0_0;
        } else {
            m4.m v1_1 = new m4.m(((m4.n) this).e, 1, ((m4.n) this).f);
            this.c = v1_1;
            return v1_1;
        }
    }
}
