package y6;
public final class m extends java.util.AbstractSet {
    public final synthetic int a;
    public final synthetic y6.o b;

    public synthetic m(y6.o p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void clear()
    {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object p5)
    {
        switch (this.a) {
            case 0:
                int v1 = 0;
                if ((p5 instanceof java.util.Map$Entry)) {
                    int v0_1;
                    int v0_4 = this.b;
                    Object v2_1 = ((java.util.Map$Entry) p5).getKey();
                    int v3 = 0;
                    try {
                        if (v2_1 == null) {
                            v0_1 = 0;
                        } else {
                            v0_1 = v0_4.b(v2_1, 0);
                        }
                    } catch (ClassCastException) {
                    }
                    if ((v0_1 != 0) && (java.util.Objects.equals(v0_1.n, ((java.util.Map$Entry) p5).getValue()))) {
                        v3 = v0_1;
                    }
                    if (v3 != 0) {
                        v1 = 1;
                    }
                }
                return v1;
            default:
                return this.b.containsKey(p5);
        }
    }

    public final java.util.Iterator iterator()
    {
        switch (this.a) {
            case 0:
                return new y6.l(this.b, 0);
            default:
                return new y6.l(this.b, 1);
        }
    }

    public final boolean remove(Object p6)
    {
        switch (this.a) {
            case 0:
                int v1_0 = 0;
                if ((p6 instanceof java.util.Map$Entry)) {
                    java.util.Map$Entry v0_1;
                    java.util.Map$Entry v0_4 = ((java.util.Map$Entry) p6).getKey();
                    y6.o v2_1 = this.b;
                    java.util.Map$Entry v3 = 0;
                    try {
                        if (v0_4 == null) {
                            v0_1 = 0;
                        } else {
                            v0_1 = v2_1.b(v0_4, 0);
                        }
                    } catch (ClassCastException) {
                    }
                    if ((v0_1 != null) && (java.util.Objects.equals(v0_1.n, ((java.util.Map$Entry) p6).getValue()))) {
                        v3 = v0_1;
                    }
                    if (v3 != null) {
                        v1_0 = 1;
                        v2_1.d(v3, 1);
                    }
                }
                return v1_0;
            default:
                java.util.Map$Entry v0_3 = 0;
                int v1_1 = this.b;
                y6.o v2_0 = 0;
                try {
                    if (p6) {
                        v2_0 = v1_1.b(p6, 0);
                    }
                } catch (ClassCastException) {
                }
                if (v2_0 != null) {
                    v1_1.d(v2_0, 1);
                }
                if (v2_0 != null) {
                    v0_3 = 1;
                }
                return v0_3;
        }
    }

    public final int size()
    {
        switch (this.a) {
            case 0:
                return this.b.d;
            default:
                return this.b.d;
        }
    }
}
