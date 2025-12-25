package i1;
public final class d implements android.text.InputFilter {
    public final android.widget.TextView a;
    public i1.c b;

    public d(android.widget.TextView p1)
    {
        this.a = p1;
        return;
    }

    public final CharSequence filter(CharSequence p4, int p5, int p6, android.text.Spanned p7, int p8, int p9)
    {
        android.widget.TextView v0 = this.a;
        if (!v0.isInEditMode()) {
            int v1_2 = g1.i.a().b();
            if (v1_2 != 0) {
                if (v1_2 == 1) {
                    if (((p9 == 0) && ((p8 == 0) && ((p7.length() == 0) && (p4 == v0.getText())))) || (p4 == null)) {
                        return p4;
                    } else {
                        if ((p5 != null) || (p6 != p4.length())) {
                            p4 = p4.subSequence(p5, p6);
                        }
                        p4 = g1.i.a().e(p4, 0, p4.length());
                        return p4;
                    }
                } else {
                    if (v1_2 != 3) {
                        return p4;
                    }
                }
            }
            g1.i v5_3 = g1.i.a();
            if (this.b == null) {
                this.b = new i1.c(v0, this);
            }
            v5_3.f(this.b);
            return p4;
        }
        return p4;
    }
}
