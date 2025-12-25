package q0;
public final class p0 {
    public static final java.util.ArrayList d;
    public java.util.WeakHashMap a;
    public android.util.SparseArray b;
    public ref.WeakReference c;

    static p0()
    {
        q0.p0.d = new java.util.ArrayList();
        return;
    }

    public final android.view.View a(android.view.View p4)
    {
        int v0_0 = this.a;
        if ((v0_0 != 0) && (v0_0.containsKey(p4))) {
            if ((p4 instanceof android.view.ViewGroup)) {
                int v1_1 = (((android.view.ViewGroup) p4).getChildCount() - 1);
                while (v1_1 >= 0) {
                    android.view.View v2_1 = this.a(((android.view.ViewGroup) p4).getChildAt(v1_1));
                    if (v2_1 == null) {
                        v1_1--;
                    } else {
                        return v2_1;
                    }
                }
            }
            ClassCastException v4_2 = ((java.util.ArrayList) p4.getTag(2131362488));
            if (v4_2 != null) {
                int v0_3 = (v4_2.size() - 1);
                if (v0_3 >= 0) {
                    v4_2.get(v0_3).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return 0;
    }
}
