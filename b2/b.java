package b2;
public final class b implements androidx.lifecycle.s {
    public final synthetic int a;
    public final b2.g b;

    public synthetic b(b2.g p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void c(androidx.lifecycle.u p9, androidx.lifecycle.n p10)
    {
        switch (this.a) {
            case 0:
                if (p10 != androidx.lifecycle.n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                } else {
                    p9.getLifecycle().b(this);
                    String v9_1 = this.b;
                    IllegalStateException v10_2 = v9_1.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (v10_2 != null) {
                        IllegalStateException v10_3 = v10_2.getStringArrayList("classes_to_restore");
                        if (v10_3 == null) {
                            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        } else {
                            String v0_4 = v10_3.size();
                            int v2 = 0;
                            while (v2 < v0_4) {
                                boolean v3_3 = v10_3.get(v2);
                                v2++;
                                boolean v3_4 = ((String) v3_3);
                                try {
                                    java.util.HashSet v5_8 = Class.forName(v3_4, 0, b2.b.getClassLoader()).asSubclass(b2.c);
                                    kotlin.jvm.internal.j.b(v5_8);
                                    try {
                                        b2.e v4_1 = v5_8.getDeclaredConstructor(0);
                                        v4_1.setAccessible(1);
                                        try {
                                            kotlin.jvm.internal.j.b(v4_1.newInstance(0));
                                            boolean v3_5 = (v9_1 instanceof androidx.lifecycle.b1);
                                        } catch (String v9_11) {
                                            throw new RuntimeException(g2.g.l("Failed to instantiate ", v3_5), v9_11);
                                        }
                                        if (!v3_5) {
                                            IllegalStateException v10_13 = new StringBuilder("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                            v10_13.append(v9_1);
                                            throw new IllegalStateException(v10_13.toString().toString());
                                        } else {
                                            boolean v3_8 = ((androidx.lifecycle.b1) v9_1).getViewModelStore();
                                            b2.e v4_3 = v9_1.getSavedStateRegistry();
                                            v3_8.getClass();
                                            boolean v3_0 = v3_8.a;
                                            java.util.HashSet v5_2 = new java.util.HashSet(v3_0.keySet()).iterator();
                                            while (v5_2.hasNext()) {
                                                androidx.lifecycle.v0 v6_3 = ((String) v5_2.next());
                                                kotlin.jvm.internal.j.e(v6_3, "key");
                                                androidx.lifecycle.v0 v6_5 = ((androidx.lifecycle.v0) v3_0.get(v6_3));
                                                if (v6_5 != null) {
                                                    androidx.lifecycle.q0.a(v6_5, v4_3, v9_1.getLifecycle());
                                                }
                                            }
                                            if (!new java.util.HashSet(v3_0.keySet()).isEmpty()) {
                                                v4_3.d();
                                            }
                                        }
                                    } catch (String v9_9) {
                                        String v0_8 = new StringBuilder(v4_1);
                                        v0_8.append(1.getSimpleName());
                                        v0_8.append(" must have default constructor in order to be automatically recreated");
                                        throw new IllegalStateException(v0_8.toString(), v9_9);
                                    }
                                } catch (String v9_8) {
                                    throw new RuntimeException(v1.a.l("Class ", v3_4, " wasn\'t found"), v9_8);
                                }
                            }
                        }
                    }
                    return;
                }
            default:
                String v9_3 = ((c.n) this.b);
                c.n.access$ensureViewModelStore(v9_3);
                v9_3.getLifecycle().b(this);
                return;
        }
    }
}
