package h;
public class f0 extends androidx.fragment.app.s {

    public f0()
    {
        return;
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle p3)
    {
        return new h.e0(this.getContext(), this.getTheme());
    }

    public final void setupDialog(android.app.Dialog p4, int p5)
    {
        if (!(p4 instanceof h.e0)) {
            super.setupDialog(p4, p5);
            return;
        } else {
            if ((p5 != 1) && (p5 != 2)) {
                if (p5 == 3) {
                    p4.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            ((h.e0) p4).c().k(1);
            return;
        }
    }
}
