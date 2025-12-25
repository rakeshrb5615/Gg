package androidx.datastore.preferences.protobuf;
public abstract class b extends java.util.AbstractList implements androidx.datastore.preferences.protobuf.w {
    public boolean a;

    public final void a()
    {
        if (!this.a) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final boolean addAll(int p1, java.util.Collection p2)
    {
        this.a();
        return super.addAll(p1, p2);
    }

    public final boolean addAll(java.util.Collection p1)
    {
        this.a();
        return super.addAll(p1);
    }

    public final void clear()
    {
        this.a();
        super.clear();
        return;
    }

    public final boolean equals(Object p7)
    {
        if (p7 != this) {
            if ((p7 instanceof java.util.List)) {
                if ((p7 instanceof java.util.RandomAccess)) {
                    int v1_2 = this.size();
                    if (v1_2 == ((java.util.List) p7).size()) {
                        int v3_1 = 0;
                        while (v3_1 < v1_2) {
                            if (this.get(v3_1).equals(((java.util.List) p7).get(v3_1))) {
                                v3_1++;
                            } else {
                                return 0;
                            }
                        }
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return super.equals(p7);
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
        int v0 = this.size();
        int v1_0 = 1;
        int v2 = 0;
        while (v2 < v0) {
            v1_0 = ((v1_0 * 31) + this.get(v2).hashCode());
            v2++;
        }
        return v1_0;
    }

    public abstract Object remove();

    public final boolean remove(Object p2)
    {
        this.a();
        int v2_1 = this.indexOf(p2);
        if (v2_1 != -1) {
            this.remove(v2_1);
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean removeAll(java.util.Collection p1)
    {
        this.a();
        return super.removeAll(p1);
    }

    public final boolean retainAll(java.util.Collection p1)
    {
        this.a();
        return super.retainAll(p1);
    }
}
