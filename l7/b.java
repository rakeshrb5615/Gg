package l7;
public final class b implements l7.h, java.io.Serializable {
    public final l7.h a;
    public final l7.f b;

    public b(l7.f p2, l7.h p3)
    {
        kotlin.jvm.internal.j.e(p3, "left");
        kotlin.jvm.internal.j.e(p2, "element");
        this.a = p3;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((p7 instanceof l7.b)) {
                l7.f v0_1 = 2;
                l7.g v2_0 = ((l7.b) p7);
                l7.f v3_0 = 2;
                while(true) {
                    l7.g v2_8 = v2_0.a;
                    if (!(v2_8 instanceof l7.b)) {
                        v2_0 = 0;
                    } else {
                        v2_0 = ((l7.b) v2_8);
                    }
                    if (v2_0 == null) {
                        break;
                    }
                    v3_0++;
                }
                l7.g v2_1 = this;
                while(true) {
                    l7.g v2_2 = v2_1.a;
                    if (!(v2_2 instanceof l7.b)) {
                        v2_1 = 0;
                    } else {
                        v2_1 = ((l7.b) v2_2);
                    }
                    if (v2_1 == null) {
                        break;
                    }
                    v0_1++;
                }
                if (v3_0 == v0_1) {
                    l7.f v0_2 = this;
                    while(true) {
                        boolean v7_3;
                        l7.g v2_3 = v0_2.b;
                        if (kotlin.jvm.internal.j.a(((l7.b) p7).get(v2_3.getKey()), v2_3)) {
                            l7.f v0_3 = v0_2.a;
                            if (!(v0_3 instanceof l7.b)) {
                                break;
                            }
                            v0_2 = ((l7.b) v0_3);
                        } else {
                            v7_3 = 0;
                        }
                        if (v7_3) {
                            return 1;
                        }
                    }
                    kotlin.jvm.internal.j.c(v0_3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    l7.f v0_4 = ((l7.f) v0_3);
                    v7_3 = kotlin.jvm.internal.j.a(((l7.b) p7).get(v0_4.getKey()), v0_4);
                }
            }
            return 0;
        }
        return 1;
    }

    public final Object fold(Object p2, u7.p p3)
    {
        return p3.invoke(this.a.fold(p2, p3), this.b);
    }

    public final l7.f get(l7.g p3)
    {
        kotlin.jvm.internal.j.e(p3, "key");
        l7.b v0_1 = this;
        while(true) {
            boolean v1_1 = v0_1.b.get(p3);
            if (!v1_1) {
                l7.b v0_2 = v0_1.a;
                if (!(v0_2 instanceof l7.b)) {
                    break;
                }
                v0_1 = ((l7.b) v0_2);
            } else {
                return v1_1;
            }
        }
        return v0_2.get(p3);
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + this.a.hashCode());
    }

    public final l7.h minusKey(l7.g p4)
    {
        kotlin.jvm.internal.j.e(p4, "key");
        l7.f v0_1 = this.b;
        l7.h v2 = this.a;
        if (v0_1.get(p4) == null) {
            l7.h v4_1 = v2.minusKey(p4);
            if (v4_1 != v2) {
                if (v4_1 != l7.i.a) {
                    return new l7.b(v0_1, v4_1);
                } else {
                    return v0_1;
                }
            } else {
                return this;
            }
        } else {
            return v2;
        }
    }

    public final l7.h plus(l7.h p3)
    {
        kotlin.jvm.internal.j.e(p3, "context");
        if (p3 != l7.i.a) {
            return ((l7.h) p3.fold(this, new d8.x(8)));
        } else {
            return this;
        }
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("[");
        v0_2.append(((String) this.fold("", new d8.x(7))));
        v0_2.append(93);
        return v0_2.toString();
    }
}
