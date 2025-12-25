package i1;
public final class f extends a.a {
    public final android.widget.TextView b;
    public final i1.d c;
    public boolean d;

    public f(android.widget.TextView p2)
    {
        this.b = p2;
        this.d = 1;
        this.c = new i1.d(p2);
        return;
    }

    public final boolean B()
    {
        return this.d;
    }

    public final void O(boolean p2)
    {
        if (p2 != null) {
            android.widget.TextView v2_1 = this.b;
            v2_1.setTransformationMethod(this.W(v2_1.getTransformationMethod()));
        }
        return;
    }

    public final void R(boolean p2)
    {
        this.d = p2;
        android.widget.TextView v2_1 = this.b;
        v2_1.setTransformationMethod(this.W(v2_1.getTransformationMethod()));
        v2_1.setFilters(this.x(v2_1.getFilters()));
        return;
    }

    public final android.text.method.TransformationMethod W(android.text.method.TransformationMethod p2)
    {
        if (!this.d) {
            if ((p2 instanceof i1.j)) {
                p2 = ((i1.j) p2).a;
            }
            return p2;
        } else {
            if (!(p2 instanceof i1.j)) {
                if (!(p2 instanceof android.text.method.PasswordTransformationMethod)) {
                    return new i1.j(p2);
                } else {
                    return p2;
                }
            } else {
                return p2;
            }
        }
    }

    public final android.text.InputFilter[] x(android.text.InputFilter[] p7)
    {
        int v1 = 0;
        if (this.d) {
            int v0_3 = p7.length;
            int v3_0 = 0;
            while(true) {
                int v4_3 = this.c;
                if (v3_0 >= v0_3) {
                    break;
                }
                if (p7[v3_0] != v4_3) {
                    v3_0++;
                } else {
                    return p7;
                }
            }
            int v2_0 = new android.text.InputFilter[(p7.length + 1)];
            System.arraycopy(p7, 0, v2_0, 0, v0_3);
            v2_0[v0_3] = v4_3;
            return v2_0;
        } else {
            int v0_2 = new android.util.SparseArray(1);
            int v2_2 = 0;
            while (v2_2 < p7.length) {
                int v3_5 = p7[v2_2];
                if ((v3_5 instanceof i1.d)) {
                    v0_2.put(v2_2, v3_5);
                }
                v2_2++;
            }
            if (v0_2.size() != 0) {
                int v2_4 = p7.length;
                int v3_4 = new android.text.InputFilter[(p7.length - v0_2.size())];
                int v4_1 = 0;
                while (v1 < v2_4) {
                    if (v0_2.indexOfKey(v1) < 0) {
                        v3_4[v4_1] = p7[v1];
                        v4_1++;
                    }
                    v1++;
                }
                return v3_4;
            } else {
                return p7;
            }
        }
    }
}
