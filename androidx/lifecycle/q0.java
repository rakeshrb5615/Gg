package androidx.lifecycle;
public abstract class q0 {
    public static final a6.e a;
    public static final c5.c b;
    public static final v3.f c;

    static q0()
    {
        androidx.lifecycle.q0.a = new a6.e();
        androidx.lifecycle.q0.b = new c5.c();
        androidx.lifecycle.q0.c = new v3.f();
        return;
    }

    public static final void a(androidx.lifecycle.v0 p2, b2.e p3, androidx.lifecycle.p p4)
    {
        androidx.lifecycle.g v2_2;
        kotlin.jvm.internal.j.e(p3, "registry");
        kotlin.jvm.internal.j.e(p4, "lifecycle");
        androidx.lifecycle.g v2_11 = p2.a;
        if (v2_11 == null) {
            v2_2 = 0;
        } else {
            try {
                v2_2 = ((AutoCloseable) v2_11.b.get("androidx.lifecycle.savedstate.vm.tag"));
            } catch (androidx.lifecycle.g v2_3) {
                throw v2_3;
            }
        }
        androidx.lifecycle.g v2_4 = ((androidx.lifecycle.o0) v2_2);
        if ((v2_4 != null) && (!v2_4.c)) {
            v2_4.f(p3, p4);
            androidx.lifecycle.g v2_7 = ((androidx.lifecycle.w) p4).c;
            if ((v2_7 != androidx.lifecycle.o.b) && (v2_7.compareTo(androidx.lifecycle.o.d) < 0)) {
                p4.a(new androidx.lifecycle.g(1, p4, p3));
                return;
            } else {
                p3.d();
            }
        }
        return;
    }

    public static androidx.lifecycle.n0 b(android.os.Bundle p3, android.os.Bundle p4)
    {
        if (p3 == null) {
            p3 = p4;
        }
        if (p3 != null) {
            a2.b v4_10 = androidx.lifecycle.n0.getClassLoader();
            kotlin.jvm.internal.j.b(v4_10);
            p3.setClassLoader(v4_10);
            j7.f v0_1 = new j7.f(p3.size());
            a2.b v4_2 = p3.keySet().iterator();
            while (v4_2.hasNext()) {
                String v1_2 = ((String) v4_2.next());
                kotlin.jvm.internal.j.b(v1_2);
                v0_1.put(v1_2, p3.get(v1_2));
            }
            v0_1.c();
            v0_1.s = 1;
            if (v0_1.o <= 0) {
                v0_1 = j7.f.t;
                kotlin.jvm.internal.j.c(v0_1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
            }
            androidx.lifecycle.n0 v3_5 = new androidx.lifecycle.n0();
            new java.util.LinkedHashMap();
            v3_5.a = new a2.b(v0_1);
            return v3_5;
        } else {
            androidx.lifecycle.n0 v3_7 = new androidx.lifecycle.n0();
            new java.util.LinkedHashMap();
            v3_7.a = new a2.b(i7.o.a);
            return v3_7;
        }
    }

    public static final androidx.lifecycle.n0 c(o1.c p7)
    {
        IllegalStateException v7_1 = p7.a;
        androidx.lifecycle.n0 v0_7 = ((b2.g) v7_1.get(androidx.lifecycle.q0.a));
        if (v0_7 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        } else {
            java.util.LinkedHashMap v1_2 = ((androidx.lifecycle.b1) v7_1.get(androidx.lifecycle.q0.b));
            if (v1_2 == null) {
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            } else {
                android.os.Bundle v2_2 = ((android.os.Bundle) v7_1.get(androidx.lifecycle.q0.c));
                IllegalStateException v7_5 = ((String) v7_1.get(androidx.lifecycle.z0.b));
                if (v7_5 == null) {
                    throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                } else {
                    androidx.lifecycle.n0 v0_6;
                    androidx.lifecycle.n0 v0_5 = v0_7.getSavedStateRegistry().b();
                    android.os.Bundle v4 = 0;
                    if (!(v0_5 instanceof androidx.lifecycle.r0)) {
                        v0_6 = 0;
                    } else {
                        v0_6 = ((androidx.lifecycle.r0) v0_5);
                    }
                    if (v0_6 == null) {
                        throw new IllegalStateException("enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call");
                    } else {
                        java.util.LinkedHashMap v1_4 = androidx.lifecycle.q0.e(v1_2).b;
                        boolean v3_3 = ((androidx.lifecycle.n0) v1_4.get(v7_5));
                        if (v3_3) {
                            return v3_3;
                        } else {
                            v0_6.b();
                            boolean v3_4 = v0_6.c;
                            if ((v3_4) && (v3_4.containsKey(v7_5))) {
                                android.os.Bundle v5_1 = v3_4.getBundle(v7_5);
                                if (v5_1 == null) {
                                    h7.f[] v6 = new h7.f[0];
                                    v5_1 = c4.b.f(((h7.f[]) java.util.Arrays.copyOf(v6, 0)));
                                }
                                v3_4.remove(v7_5);
                                if (v3_4.isEmpty()) {
                                    v0_6.c = 0;
                                }
                                v4 = v5_1;
                            }
                            androidx.lifecycle.n0 v0_10 = androidx.lifecycle.q0.b(v4, v2_2);
                            v1_4.put(v7_5, v0_10);
                            return v0_10;
                        }
                    }
                }
            }
        }
    }

    public static final void d(b2.g p3)
    {
        androidx.lifecycle.r0 v0_6 = ((androidx.lifecycle.w) p3.getLifecycle()).c;
        if ((v0_6 != androidx.lifecycle.o.b) && (v0_6 != androidx.lifecycle.o.c)) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            if (p3.getSavedStateRegistry().b() == null) {
                androidx.lifecycle.r0 v0_5 = new androidx.lifecycle.r0(p3.getSavedStateRegistry(), ((androidx.lifecycle.b1) p3));
                p3.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", v0_5);
                p3.getLifecycle().a(new androidx.lifecycle.e(v0_5, 1));
            }
            return;
        }
    }

    public static final androidx.lifecycle.s0 e(androidx.lifecycle.b1 p3)
    {
        o1.a v1_1;
        String v0_1 = new androidx.lifecycle.p0();
        if (!(p3 instanceof androidx.lifecycle.j)) {
            v1_1 = o1.a.b;
        } else {
            v1_1 = ((androidx.lifecycle.j) p3).getDefaultViewModelCreationExtras();
        }
        kotlin.jvm.internal.j.e(v1_1, "extras");
        androidx.lifecycle.s0 v3_1 = p3.getViewModelStore();
        kotlin.jvm.internal.j.e(v3_1, "store");
        return ((androidx.lifecycle.s0) new j6.s(v3_1, v0_1, v1_1).i(kotlin.jvm.internal.s.a(androidx.lifecycle.s0), "androidx.lifecycle.internal.SavedStateHandlesVM"));
    }
}
