package g2;
public final class k extends g2.l {
    public final android.graphics.Matrix a;
    public final java.util.ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final android.graphics.Matrix j;
    public String k;

    public k()
    {
        this.a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 1065353216;
        this.g = 1065353216;
        this.h = 0;
        this.i = 0;
        this.j = new android.graphics.Matrix();
        this.k = 0;
        return;
    }

    public k(g2.k p7, r.e p8)
    {
        this.a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 1065353216;
        this.g = 1065353216;
        this.h = 0;
        this.i = 0;
        int v2_2 = new android.graphics.Matrix();
        this.j = v2_2;
        this.k = 0;
        this.c = p7.c;
        this.d = p7.d;
        this.e = p7.e;
        this.f = p7.f;
        this.g = p7.g;
        this.h = p7.h;
        this.i = p7.i;
        g2.i v3_11 = p7.k;
        this.k = v3_11;
        if (v3_11 != null) {
            p8.put(v3_11, this);
        }
        v2_2.set(p7.j);
        IllegalStateException v7_1 = p7.b;
        int v2_0 = 0;
        while (v2_0 < v7_1.size()) {
            g2.i v3_14 = v7_1.get(v2_0);
            if (!(v3_14 instanceof g2.k)) {
                g2.i v4_5;
                if (!(v3_14 instanceof g2.j)) {
                    if (!(v3_14 instanceof g2.i)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        v4_5 = new g2.i(((g2.i) v3_14));
                    }
                } else {
                    g2.i v3_16 = ((g2.j) v3_14);
                    v4_5 = new g2.j(v3_16);
                    v4_5.e = 0;
                    v4_5.g = 1065353216;
                    v4_5.h = 1065353216;
                    v4_5.i = 0;
                    v4_5.j = 1065353216;
                    v4_5.k = 0;
                    v4_5.l = android.graphics.Paint$Cap.BUTT;
                    v4_5.m = android.graphics.Paint$Join.MITER;
                    v4_5.n = 1082130432;
                    v4_5.d = v3_16.d;
                    v4_5.e = v3_16.e;
                    v4_5.g = v3_16.g;
                    v4_5.f = v3_16.f;
                    v4_5.c = v3_16.c;
                    v4_5.h = v3_16.h;
                    v4_5.i = v3_16.i;
                    v4_5.j = v3_16.j;
                    v4_5.k = v3_16.k;
                    v4_5.l = v3_16.l;
                    v4_5.m = v3_16.m;
                    v4_5.n = v3_16.n;
                }
                this.b.add(v4_5);
                g2.i v3_1 = v4_5.b;
                if (v3_1 != null) {
                    p8.put(v3_1, v4_5);
                }
            } else {
                this.b.add(new g2.k(((g2.k) v3_14), p8));
            }
            v2_0++;
        }
        return;
    }

    public final boolean a()
    {
        int v1 = 0;
        while(true) {
            boolean v2_1 = this.b;
            if (v1 >= v2_1.size()) {
                break;
            }
            if (!((g2.l) v2_1.get(v1)).a()) {
                v1++;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public final boolean b(int[] p5)
    {
        int v0 = 0;
        int v1 = 0;
        while(true) {
            boolean v2_1 = this.b;
            if (v0 >= v2_1.size()) {
                break;
            }
            v1 |= ((g2.l) v2_1.get(v0)).b(p5);
            v0++;
        }
        return v1;
    }

    public final void c()
    {
        android.graphics.Matrix v0 = this.j;
        v0.reset();
        v0.postTranslate((- this.d), (- this.e));
        v0.postScale(this.f, this.g);
        v0.postRotate(this.c, 0, 0);
        v0.postTranslate((this.h + this.d), (this.i + this.e));
        return;
    }

    public String getGroupName()
    {
        return this.k;
    }

    public android.graphics.Matrix getLocalMatrix()
    {
        return this.j;
    }

    public float getPivotX()
    {
        return this.d;
    }

    public float getPivotY()
    {
        return this.e;
    }

    public float getRotation()
    {
        return this.c;
    }

    public float getScaleX()
    {
        return this.f;
    }

    public float getScaleY()
    {
        return this.g;
    }

    public float getTranslateX()
    {
        return this.h;
    }

    public float getTranslateY()
    {
        return this.i;
    }

    public void setPivotX(float p2)
    {
        if (p2 != this.d) {
            this.d = p2;
            this.c();
        }
        return;
    }

    public void setPivotY(float p2)
    {
        if (p2 != this.e) {
            this.e = p2;
            this.c();
        }
        return;
    }

    public void setRotation(float p2)
    {
        if (p2 != this.c) {
            this.c = p2;
            this.c();
        }
        return;
    }

    public void setScaleX(float p2)
    {
        if (p2 != this.f) {
            this.f = p2;
            this.c();
        }
        return;
    }

    public void setScaleY(float p2)
    {
        if (p2 != this.g) {
            this.g = p2;
            this.c();
        }
        return;
    }

    public void setTranslateX(float p2)
    {
        if (p2 != this.h) {
            this.h = p2;
            this.c();
        }
        return;
    }

    public void setTranslateY(float p2)
    {
        if (p2 != this.i) {
            this.i = p2;
            this.c();
        }
        return;
    }
}
