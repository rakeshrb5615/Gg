package z;
public final class g {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public g(android.content.Context p7, android.content.res.XmlResourceParser p8)
    {
        this.a = 2143289344;
        this.b = 2143289344;
        this.c = 2143289344;
        this.d = 2143289344;
        this.e = -1;
        android.content.res.TypedArray v8_1 = p7.obtainStyledAttributes(android.util.Xml.asAttributeSet(p8), z.r.j);
        int v0_2 = v8_1.getIndexCount();
        int v1 = 0;
        while (v1 < v0_2) {
            String v2_0 = v8_1.getIndex(v1);
            if (v2_0 != null) {
                if (v2_0 != 1) {
                    if (v2_0 != 2) {
                        if (v2_0 != 3) {
                            if (v2_0 != 4) {
                                android.util.Log.v("ConstraintLayoutStates", "Unknown tag");
                            } else {
                                this.a = v8_1.getDimension(v2_0, this.a);
                            }
                        } else {
                            this.c = v8_1.getDimension(v2_0, this.c);
                        }
                    } else {
                        this.b = v8_1.getDimension(v2_0, this.b);
                    }
                } else {
                    this.d = v8_1.getDimension(v2_0, this.d);
                }
            } else {
                String v2_6 = v8_1.getResourceId(v2_0, this.e);
                this.e = v2_6;
                String v3_11 = p7.getResources().getResourceTypeName(v2_6);
                p7.getResources().getResourceName(v2_6);
                if ("layout".equals(v3_11)) {
                    new z.n().b(((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(p7).inflate(v2_6, 0)));
                }
            }
            v1++;
        }
        v8_1.recycle();
        return;
    }
}
