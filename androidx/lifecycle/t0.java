package androidx.lifecycle;
public final class t0 implements androidx.lifecycle.x0 {
    public final android.app.Application a;
    public final androidx.lifecycle.w0 b;
    public final android.os.Bundle c;
    public final androidx.lifecycle.p d;
    public final b2.e e;

    public t0(android.app.Application p2, b2.g p3, android.os.Bundle p4)
    {
        androidx.lifecycle.w0 v2_2;
        this.e = p3.getSavedStateRegistry();
        this.d = p3.getLifecycle();
        this.c = p4;
        this.a = p2;
        if (p2 == null) {
            v2_2 = new androidx.lifecycle.w0(0);
        } else {
            if (androidx.lifecycle.w0.c == null) {
                androidx.lifecycle.w0.c = new androidx.lifecycle.w0(p2);
            }
            v2_2 = androidx.lifecycle.w0.c;
            kotlin.jvm.internal.j.b(v2_2);
        }
        this.b = v2_2;
        return;
    }

    public final androidx.lifecycle.v0 a(Class p2)
    {
        String v0_0 = p2.getCanonicalName();
        if (v0_0 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else {
            return this.d(p2, v0_0);
        }
    }

    public final androidx.lifecycle.v0 b(Class p4, o1.c p5)
    {
        androidx.lifecycle.w0 v0_0 = p5.a;
        boolean v1_5 = ((String) v0_0.get(androidx.lifecycle.z0.b));
        if (!v1_5) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else {
            if ((v0_0.get(androidx.lifecycle.q0.a) == null) || (v0_0.get(androidx.lifecycle.q0.b) == null)) {
                if (this.d == null) {
                    throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                } else {
                    return this.d(p4, v1_5);
                }
            } else {
                reflect.Constructor v2_5;
                androidx.lifecycle.w0 v0_2 = ((android.app.Application) v0_0.get(androidx.lifecycle.w0.d));
                boolean v1_4 = androidx.lifecycle.a.isAssignableFrom(p4);
                if ((!v1_4) || (v0_2 == null)) {
                    v2_5 = androidx.lifecycle.u0.a(p4, androidx.lifecycle.u0.b);
                } else {
                    v2_5 = androidx.lifecycle.u0.a(p4, androidx.lifecycle.u0.a);
                }
                if (v2_5 != null) {
                    if ((!v1_4) || (v0_2 == null)) {
                        return androidx.lifecycle.u0.b(p4, v2_5, new Object[] {androidx.lifecycle.q0.c(p5)}));
                    } else {
                        return androidx.lifecycle.u0.b(p4, v2_5, new Object[] {v0_2, androidx.lifecycle.q0.c(p5)}));
                    }
                } else {
                    return this.b.b(p4, p5);
                }
            }
        }
    }

    public final androidx.lifecycle.v0 c(kotlin.jvm.internal.e p1, o1.c p2)
    {
        return this.b(q4.b.u(p1), p2);
    }

    public final androidx.lifecycle.v0 d(Class p8, String p9)
    {
        java.util.LinkedHashMap v0_0 = this.d;
        if (v0_0 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        } else {
            reflect.Constructor v2_2;
            a6.e v1_2 = androidx.lifecycle.a.isAssignableFrom(p8);
            if ((v1_2 == null) || (this.a == null)) {
                v2_2 = androidx.lifecycle.u0.a(p8, androidx.lifecycle.u0.b);
            } else {
                v2_2 = androidx.lifecycle.u0.a(p8, androidx.lifecycle.u0.a);
            }
            if (v2_2 != null) {
                b2.e v3 = this.e;
                kotlin.jvm.internal.j.b(v3);
                androidx.lifecycle.n0 v4_1 = androidx.lifecycle.q0.b(v3.a(p9), this.c);
                androidx.lifecycle.o0 v5_2 = new androidx.lifecycle.o0(p9, v4_1);
                v5_2.f(v3, v0_0);
                AutoCloseable v9_4 = ((androidx.lifecycle.w) v0_0).c;
                if ((v9_4 != androidx.lifecycle.o.b) && (v9_4.compareTo(androidx.lifecycle.o.d) < 0)) {
                    v0_0.a(new androidx.lifecycle.g(1, v0_0, v3));
                } else {
                    v3.d();
                }
                Throwable v8_3;
                if (v1_2 == null) {
                    v8_3 = androidx.lifecycle.u0.b(p8, v2_2, new Object[] {v4_1}));
                } else {
                    AutoCloseable v9_8 = this.a;
                    if (v9_8 == null) {
                    } else {
                        v8_3 = androidx.lifecycle.u0.b(p8, v2_2, new Object[] {v9_8, v4_1}));
                    }
                }
                v8_3.getClass();
                java.util.LinkedHashMap v0_1 = v8_3.a;
                if (v0_1 == null) {
                    return v8_3;
                } else {
                    if (!v0_1.d) {
                        try {
                            p1.a.a(((AutoCloseable) v0_1.b.put("androidx.lifecycle.savedstate.vm.tag", v5_2)));
                            return v8_3;
                        } catch (Throwable v8_4) {
                            throw v8_4;
                        }
                    } else {
                        p1.a.a(v5_2);
                        return v8_3;
                    }
                }
            } else {
                if (this.a == null) {
                    if (androidx.lifecycle.y0.a == null) {
                        androidx.lifecycle.y0.a = new androidx.lifecycle.y0();
                    }
                    kotlin.jvm.internal.j.b(androidx.lifecycle.y0.a);
                    return j5.t1.l(p8);
                } else {
                    return this.b.a(p8);
                }
            }
        }
    }
}
