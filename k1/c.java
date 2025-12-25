package k1;
public abstract class c {
    public static final k1.b a;

    static c()
    {
        k1.c.a = k1.b.a;
        return;
    }

    public static k1.b a(androidx.fragment.app.e0 p2)
    {
        while (p2 != null) {
            if (p2.isAdded()) {
                kotlin.jvm.internal.j.d(p2.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            p2 = p2.getParentFragment();
        }
        return k1.c.a;
    }

    public static void b(k1.g p2)
    {
        if (androidx.fragment.app.b1.H(3)) {
            android.util.Log.d("FragmentManager", "StrictMode violation in ".concat(p2.a.getClass().getName()), p2);
        }
        return;
    }

    public static final void c(androidx.fragment.app.e0 p3, String p4)
    {
        kotlin.jvm.internal.j.e(p3, "fragment");
        kotlin.jvm.internal.j.e(p4, "previousFragmentId");
        StringBuilder v1_1 = new StringBuilder("Attempting to reuse fragment ");
        v1_1.append(p3);
        v1_1.append(" with previous ID ");
        v1_1.append(p4);
        k1.c.b(new k1.a(p3, v1_1.toString()));
        k1.c.a(p3).getClass();
        return;
    }
}
