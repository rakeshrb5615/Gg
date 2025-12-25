package androidx.fragment.app;
public final class z implements androidx.lifecycle.e0 {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic z(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public void a(Object p4)
    {
        android.app.Dialog v0_2 = ((androidx.fragment.app.s) this.b);
        if ((((androidx.lifecycle.u) p4) != null) && (androidx.fragment.app.s.access$200(v0_2))) {
            IllegalStateException v4_5 = v0_2.requireView();
            if (v4_5.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            } else {
                if (androidx.fragment.app.s.access$000(v0_2) != null) {
                    if (androidx.fragment.app.b1.H(3)) {
                        String v1_5 = new StringBuilder("DialogFragment ");
                        v1_5.append(this);
                        v1_5.append(" setting the content view on ");
                        v1_5.append(androidx.fragment.app.s.access$000(v0_2));
                        android.util.Log.d("FragmentManager", v1_5.toString());
                    }
                    androidx.fragment.app.s.access$000(v0_2).setContentView(v4_5);
                    return;
                }
            }
        }
        return;
    }
}
