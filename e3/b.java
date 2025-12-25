package e3;
public final class b {
    public int a;
    public int b;
    public final Object c;

    public b(android.content.Context p7, android.content.res.XmlResourceParser p8)
    {
        this.c = new java.util.ArrayList();
        this.b = -1;
        android.content.res.TypedArray v8_1 = p7.obtainStyledAttributes(android.util.Xml.asAttributeSet(p8), z.r.h);
        int v0_1 = v8_1.getIndexCount();
        int v1 = 0;
        while (v1 < v0_1) {
            androidx.constraintlayout.widget.ConstraintLayout v2_0 = v8_1.getIndex(v1);
            if (v2_0 != null) {
                if (v2_0 == 1) {
                    androidx.constraintlayout.widget.ConstraintLayout v2_1 = v8_1.getResourceId(v2_0, this.b);
                    this.b = v2_1;
                    z.n v3_3 = p7.getResources().getResourceTypeName(v2_1);
                    p7.getResources().getResourceName(v2_1);
                    if ("layout".equals(v3_3)) {
                        new z.n().b(((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(p7).inflate(v2_1, 0)));
                    }
                }
            } else {
                this.a = v8_1.getResourceId(v2_0, this.a);
            }
            v1++;
        }
        v8_1.recycle();
        return;
    }

    public b(android.view.View p1)
    {
        this.c = p1;
        return;
    }
}
