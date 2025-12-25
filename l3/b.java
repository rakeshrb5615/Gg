package l3;
public final class b extends q4.b {
    public final synthetic int f;
    public final synthetic Object g;

    public synthetic b(Object p1, int p2)
    {
        this.f = p2;
        super(26);
        super.g = p1;
        return;
    }

    private final void V(int p1)
    {
        return;
    }

    public final void I(int p2)
    {
        switch (this.f) {
            case 0:
                break;
            default:
                q3.h v2_2 = ((q3.i) this.g);
                v2_2.d = 1;
                q3.h v2_5 = ((q3.h) v2_2.e.get());
                if (v2_5 == null) {
                } else {
                    v2_5.a();
                }
        }
        return;
    }

    public final void J(android.graphics.Typeface p2, boolean p3)
    {
        switch (this.f) {
            case 0:
                CharSequence v3_3;
                q3.h v2_7 = ((com.google.android.material.chip.Chip) this.g);
                CharSequence v3_2 = v2_7.e;
                if (!v3_2.R0) {
                    v3_3 = v2_7.getText();
                } else {
                    v3_3 = v3_2.T;
                }
                v2_7.setText(v3_3);
                v2_7.requestLayout();
                v2_7.invalidate();
                return;
            default:
                if (p3 == null) {
                    q3.h v2_2 = ((q3.i) this.g);
                    v2_2.d = 1;
                    q3.h v2_6 = ((q3.h) v2_2.e.get());
                    if (v2_6 != null) {
                        v2_6.a();
                    }
                }
                return;
        }
    }
}
