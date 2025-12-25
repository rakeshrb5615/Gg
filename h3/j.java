package h3;
public class j extends h.f0 {

    public j()
    {
        return;
    }

    public final void dismiss()
    {
        boolean v0_0 = this.getDialog();
        if ((v0_0 instanceof h3.i)) {
            boolean v0_1 = ((h3.i) v0_0);
            if (v0_1.m == null) {
                v0_1.e();
            }
        }
        super.dismiss();
        return;
    }

    public final void dismissAllowingStateLoss()
    {
        boolean v0_0 = this.getDialog();
        if ((v0_0 instanceof h3.i)) {
            boolean v0_1 = ((h3.i) v0_0);
            if (v0_1.m == null) {
                v0_1.e();
            }
        }
        super.dismissAllowingStateLoss();
        return;
    }

    public final android.app.Dialog onCreateDialog(android.os.Bundle p6)
    {
        android.content.res.TypedArray v0_0 = this.getContext();
        int v1_0 = this.getTheme();
        if (v1_0 == 0) {
            int v1_6 = new android.util.TypedValue();
            if (!v0_0.getTheme().resolveAttribute(2130968711, v1_6, 1)) {
                v1_0 = 2132017815;
            } else {
                v1_0 = v1_6.resourceId;
            }
        }
        h3.i v6_1 = new h3.i(v0_0, v1_0);
        v6_1.q = 1;
        v6_1.r = 1;
        v6_1.w = new h3.g(v6_1);
        v6_1.c().k(1);
        android.content.res.TypedArray v0_6 = v6_1.getContext().getTheme().obtainStyledAttributes(new int[] {2130969060}));
        v6_1.u = v0_6.getBoolean(0, 0);
        v0_6.recycle();
        return v6_1;
    }
}
