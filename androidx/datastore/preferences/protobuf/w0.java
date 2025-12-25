package androidx.datastore.preferences.protobuf;
public final class w0 extends java.util.AbstractMap {
    public static final synthetic int f;
    public java.util.List a;
    public java.util.Map b;
    public boolean c;
    public volatile androidx.datastore.preferences.protobuf.z0 d;
    public java.util.Map e;

    public static androidx.datastore.preferences.protobuf.w0 g()
    {
        androidx.datastore.preferences.protobuf.w0 v0_1 = new androidx.datastore.preferences.protobuf.w0();
        v0_1.a = java.util.Collections.EMPTY_LIST;
        java.util.Map v1_1 = java.util.Collections.EMPTY_MAP;
        v0_1.b = v1_1;
        v0_1.e = v1_1;
        return v0_1;
    }

    public final int b(Comparable p5)
    {
        int v0_2;
        int v0_3 = this.a.size();
        int v1 = (v0_3 - 1);
        if (v1 < 0) {
            int v0_1 = 0;
            while (v0_1 <= v1) {
                int v2_2 = ((v0_1 + v1) / 2);
                int v3_4 = p5.compareTo(((androidx.datastore.preferences.protobuf.x0) this.a.get(v2_2)).a);
                if (v3_4 >= 0) {
                    if (v3_4 <= 0) {
                        return v2_2;
                    } else {
                        v0_1 = (v2_2 + 1);
                    }
                } else {
                    v1 = (v2_2 - 1);
                }
            }
            v0_2 = (v0_1 + 1);
        } else {
            int v2_0 = p5.compareTo(((androidx.datastore.preferences.protobuf.x0) this.a.get(v1)).a);
            if (v2_0 <= 0) {
                if (v2_0 != 0) {
                } else {
                    return v1;
                }
            } else {
                v0_2 = (v0_3 + 1);
            }
        }
        return (- v0_2);
    }

    public final void c()
    {
        if (this.c) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void clear()
    {
        this.c();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        return;
    }

    public final boolean containsKey(Object p2)
    {
        if ((this.b(((Comparable) p2)) < 0) && (!this.b.containsKey(((Comparable) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final java.util.Map$Entry d(int p2)
    {
        return ((java.util.Map$Entry) this.a.get(p2));
    }

    public final java.util.Set e()
    {
        if (!this.b.isEmpty()) {
            return this.b.entrySet();
        } else {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public final java.util.Set entrySet()
    {
        if (this.d == null) {
            this.d = new androidx.datastore.preferences.protobuf.z0(this, 0);
        }
        return this.d;
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((p7 instanceof androidx.datastore.preferences.protobuf.w0)) {
                java.util.Map v0_4 = this.size();
                if (v0_4 == ((androidx.datastore.preferences.protobuf.w0) p7).size()) {
                    int v1_1 = this.a.size();
                    if (v1_1 == ((androidx.datastore.preferences.protobuf.w0) p7).a.size()) {
                        int v3_2 = 0;
                        while (v3_2 < v1_1) {
                            if (this.d(v3_2).equals(((androidx.datastore.preferences.protobuf.w0) p7).d(v3_2))) {
                                v3_2++;
                            }
                        }
                        if (v1_1 == v0_4) {
                            return 1;
                        } else {
                            return this.b.equals(((androidx.datastore.preferences.protobuf.w0) p7).b);
                        }
                    } else {
                        return ((java.util.AbstractSet) this.entrySet()).equals(((androidx.datastore.preferences.protobuf.w0) p7).entrySet());
                    }
                }
                return 0;
            } else {
                return super.equals(p7);
            }
        }
        return 1;
    }

    public final java.util.SortedMap f()
    {
        this.c();
        if ((this.b.isEmpty()) && (!(this.b instanceof java.util.TreeMap))) {
            java.util.NavigableMap v0_8 = new java.util.TreeMap();
            this.b = v0_8;
            this.e = v0_8.descendingMap();
        }
        return ((java.util.SortedMap) this.b);
    }

    public final Object get(Object p2)
    {
        java.util.Map v0_0 = this.b(((Comparable) p2));
        if (v0_0 < null) {
            return this.b.get(((Comparable) p2));
        } else {
            return ((androidx.datastore.preferences.protobuf.x0) this.a.get(v0_0)).b;
        }
    }

    public final Object h(Comparable p5, Object p6)
    {
        this.c();
        java.util.SortedMap v0_2 = this.b(p5);
        if (v0_2 < null) {
            this.c();
            if ((this.a.isEmpty()) && (!(this.a instanceof java.util.ArrayList))) {
                this.a = new java.util.ArrayList(16);
            }
            java.util.SortedMap v0_1 = (- (v0_2 + 1));
            if (v0_1 < 16) {
                if (this.a.size() == 16) {
                    java.util.List v1_8 = ((androidx.datastore.preferences.protobuf.x0) this.a.remove(15));
                    this.f().put(v1_8.a, v1_8.b);
                }
                this.a.add(v0_1, new androidx.datastore.preferences.protobuf.x0(this, p5, p6));
                return 0;
            } else {
                return this.f().put(p5, p6);
            }
        } else {
            return ((androidx.datastore.preferences.protobuf.x0) this.a.get(v0_2)).setValue(p6);
        }
    }

    public final int hashCode()
    {
        int v0_4 = this.a.size();
        int v1 = 0;
        int v2 = 0;
        while (v1 < v0_4) {
            v2 += ((androidx.datastore.preferences.protobuf.x0) this.a.get(v1)).hashCode();
            v1++;
        }
        if (this.b.size() <= 0) {
            return v2;
        } else {
            return (this.b.hashCode() + v2);
        }
    }

    public final Object i(int p6)
    {
        this.c();
        Object v6_3 = ((androidx.datastore.preferences.protobuf.x0) this.a.remove(p6)).b;
        if (!this.b.isEmpty()) {
            java.util.Iterator v0_3 = this.f().entrySet().iterator();
            Object v3_1 = ((java.util.Map$Entry) v0_3.next());
            this.a.add(new androidx.datastore.preferences.protobuf.x0(this, ((Comparable) v3_1.getKey()), v3_1.getValue()));
            v0_3.remove();
        }
        return v6_3;
    }

    public final bridge synthetic Object put(Object p1, Object p2)
    {
        return this.h(((Comparable) p1), p2);
    }

    public final Object remove(Object p2)
    {
        this.c();
        java.util.Map v0_0 = this.b(((Comparable) p2));
        if (v0_0 < null) {
            if (!this.b.isEmpty()) {
                return this.b.remove(((Comparable) p2));
            } else {
                return 0;
            }
        } else {
            return this.i(v0_0);
        }
    }

    public final int size()
    {
        return (this.b.size() + this.a.size());
    }
}
