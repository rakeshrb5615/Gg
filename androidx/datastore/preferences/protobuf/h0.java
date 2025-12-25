package androidx.datastore.preferences.protobuf;
public final class h0 extends java.util.LinkedHashMap {
    public static final androidx.datastore.preferences.protobuf.h0 b;
    public boolean a;

    static h0()
    {
        androidx.datastore.preferences.protobuf.h0 v0_1 = new androidx.datastore.preferences.protobuf.h0();
        androidx.datastore.preferences.protobuf.h0.b = v0_1;
        v0_1.a = 0;
        return;
    }

    public h0()
    {
        this.a = 1;
        return;
    }

    public final void b()
    {
        if (!this.a) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.b();
        super.clear();
        return;
    }

    public final androidx.datastore.preferences.protobuf.h0 d()
    {
        if (!this.isEmpty()) {
            androidx.datastore.preferences.protobuf.h0 v0_2 = new androidx.datastore.preferences.protobuf.h0(this);
            v0_2.a = 1;
            return v0_2;
        } else {
            return new androidx.datastore.preferences.protobuf.h0();
        }
    }

    public final java.util.Set entrySet()
    {
        if (!this.isEmpty()) {
            return super.entrySet();
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public final boolean equals(Object p7)
    {
        if ((p7 instanceof java.util.Map)) {
            int v7_2;
            if (this != ((java.util.Map) p7)) {
                if (this.size() == ((java.util.Map) p7).size()) {
                    java.util.Iterator v2_1 = this.entrySet().iterator();
                    while (v2_1.hasNext()) {
                        boolean v3_2 = ((java.util.Map$Entry) v2_1.next());
                        if (((java.util.Map) p7).containsKey(v3_2.getKey())) {
                            boolean v3_5;
                            byte[] v4_2 = v3_2.getValue();
                            boolean v3_4 = ((java.util.Map) p7).get(v3_2.getKey());
                            if ((!(v4_2 instanceof byte[])) || (!(v3_4 instanceof byte[]))) {
                                v3_5 = v4_2.equals(v3_4);
                            } else {
                                v3_5 = java.util.Arrays.equals(((byte[]) v4_2), ((byte[]) v3_4));
                            }
                            if (!v3_5) {
                            }
                        }
                    }
                    v7_2 = 1;
                    if (v7_2 != 0) {
                        return 1;
                    }
                    return 0;
                }
                v7_2 = 0;
            }
        }
        return 0;
    }

    public final int hashCode()
    {
        java.util.Iterator v0_1 = this.entrySet().iterator();
        int v2 = 0;
        while (v0_1.hasNext()) {
            int v8_0;
            int v3_1 = ((java.util.Map$Entry) v0_1.next());
            int v4_0 = v3_1.getKey();
            int v6 = 1;
            if (!(v4_0 instanceof byte[])) {
                v8_0 = v4_0.hashCode();
            } else {
                int v4_1 = ((byte[]) v4_0);
                int v5_1 = v4_1.length;
                int v7_0 = 0;
                v8_0 = v5_1;
                while (v7_0 < v5_1) {
                    v8_0 = ((v8_0 * 31) + v4_1[v7_0]);
                    v7_0++;
                }
                if (v8_0 == 0) {
                    v8_0 = 1;
                }
            }
            int v3_2 = v3_1.getValue();
            if (!(v3_2 instanceof byte[])) {
                v6 = v3_2.hashCode();
            } else {
                int v3_3 = ((byte[]) v3_2);
                int v4_3 = v3_3.length;
                int v5_2 = 0;
                int v7_1 = v4_3;
                while (v5_2 < v4_3) {
                    v7_1 = ((v7_1 * 31) + v3_3[v5_2]);
                    v5_2++;
                }
                if (v7_1 != 0) {
                    v6 = v7_1;
                }
            }
            v2 += (v8_0 ^ v6);
        }
        return v2;
    }

    public final Object put(Object p2, Object p3)
    {
        this.b();
        Class vtmp1 = p2.getClass();
        p3.getClass();
        return super.put(p2, p3);
    }

    public final void putAll(java.util.Map p4)
    {
        this.b();
        java.util.Iterator v0_1 = p4.keySet().iterator();
        while (v0_1.hasNext()) {
            Object v1_0 = v0_1.next();
            Class vtmp5 = v1_0.getClass();
            p4.get(v1_0).getClass();
        }
        super.putAll(p4);
        return;
    }

    public final Object remove(Object p1)
    {
        this.b();
        return super.remove(p1);
    }
}
