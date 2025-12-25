package q3;
public final class g {
    public CharSequence a;
    public final android.text.TextPaint b;
    public final int c;
    public int d;
    public android.text.Layout$Alignment e;
    public int f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public boolean k;
    public android.text.TextUtils$TruncateAt l;
    public a5.a m;

    public g(CharSequence p1, android.text.TextPaint p2, int p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p1.length();
        this.e = android.text.Layout$Alignment.ALIGN_NORMAL;
        this.f = 2147483647;
        this.g = 0;
        this.h = 1065353216;
        this.i = 1;
        this.j = 1;
        this.l = 0;
        return;
    }

    public final android.text.StaticLayout a()
    {
        if (this.a == null) {
            this.a = "";
        }
        android.text.StaticLayout v0_5 = Math.max(0, this.c);
        float v2_0 = this.a;
        android.text.TextPaint v4 = this.b;
        if (this.f == 1) {
            v2_0 = android.text.TextUtils.ellipsize(v2_0, v4, ((float) v0_5), this.l);
        }
        int v3_2 = Math.min(v2_0.length(), this.d);
        this.d = v3_2;
        if ((this.k) && (this.f == 1)) {
            this.e = android.text.Layout$Alignment.ALIGN_OPPOSITE;
        }
        int v1_3;
        android.text.StaticLayout v0_2 = android.text.StaticLayout$Builder.obtain(v2_0, 0, v3_2, v4, v0_5);
        v0_2.setAlignment(this.e);
        v0_2.setIncludePad(this.j);
        if (!this.k) {
            v1_3 = android.text.TextDirectionHeuristics.LTR;
        } else {
            v1_3 = android.text.TextDirectionHeuristics.RTL;
        }
        v0_2.setTextDirection(v1_3);
        int v1_4 = this.l;
        if (v1_4 != 0) {
            v0_2.setEllipsize(v1_4);
        }
        v0_2.setMaxLines(this.f);
        int v1_6 = this.g;
        if ((v1_6 != 0) || (this.h != 1065353216)) {
            v0_2.setLineSpacing(v1_6, this.h);
        }
        if (this.f > 1) {
            v0_2.setHyphenationFrequency(this.i);
        }
        int v1_10 = this.m;
        if (v1_10 != 0) {
            v0_2.setBreakStrategy(((com.google.android.material.textfield.TextInputLayout) v1_10.b).A.getBreakStrategy());
        }
        return v0_2.build();
    }
}
