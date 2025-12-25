package n7;
public abstract class a implements l7.c, n7.d, java.io.Serializable {
    private final l7.c completion;

    public a(l7.c p1)
    {
        this.completion = p1;
        return;
    }

    public l7.c create(Object p1, l7.c p2)
    {
        kotlin.jvm.internal.j.e(p2, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public l7.c create(l7.c p2)
    {
        kotlin.jvm.internal.j.e(p2, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public n7.d getCallerFrame()
    {
        int v0_0 = this.completion;
        if (!(v0_0 instanceof n7.d)) {
            return 0;
        } else {
            return ((n7.d) v0_0);
        }
    }

    public final l7.c getCompletion()
    {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement()
    {
        String v0_3 = ((n7.e) this.getClass().getAnnotation(n7.e));
        String v1_3 = 0;
        if ((v0_3 != null) && (v0_3.v() >= 1)) {
            int v2_0 = -1;
            try {
                boolean v4_4;
                boolean v4_2 = this.getClass().getDeclaredField("label");
                v4_2.setAccessible(1);
                boolean v4_3 = v4_2.get(this);
            } catch (Exception) {
                boolean v4_5 = -1;
                if (v4_5) {
                    v2_0 = v0_3.l()[v4_5];
                }
                String v3_3 = n7.f.b;
                boolean v4_7 = n7.f.a;
                if (v3_3 == null) {
                    try {
                        b8.g v7_3 = new b8.g(Class.getDeclaredMethod("getModule", 0), this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", 0), this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", 0), 9);
                        n7.f.b = v7_3;
                        v3_3 = v7_3;
                    } catch (Exception) {
                        n7.f.b = v4_7;
                        v3_3 = v4_7;
                    }
                }
                if (v3_3 != v4_7) {
                    boolean v4_9 = ((reflect.Method) v3_3.b);
                    if (v4_9) {
                        boolean v4_10 = v4_9.invoke(this.getClass(), 0);
                        if (v4_10) {
                            reflect.Method v5_9 = ((reflect.Method) v3_3.c);
                            if (v5_9 != null) {
                                boolean v4_11 = v5_9.invoke(v4_10, 0);
                                if (v4_11) {
                                    String v3_8;
                                    String v3_7 = ((reflect.Method) v3_3.d);
                                    if (v3_7 == null) {
                                        v3_8 = 0;
                                    } else {
                                        v3_8 = v3_7.invoke(v4_11, 0);
                                    }
                                    if ((v3_8 instanceof String)) {
                                        v1_3 = ((String) v3_8);
                                    }
                                }
                            }
                        }
                    }
                }
                String v1_1;
                if (v1_3 != null) {
                    String v3_10 = new StringBuilder();
                    v3_10.append(v1_3);
                    v3_10.append(47);
                    v3_10.append(v0_3.c());
                    v1_1 = v3_10.toString();
                } else {
                    v1_1 = v0_3.c();
                }
                return new StackTraceElement(v1_1, v0_3.m(), v0_3.f(), v2_0);
            }
            if (!(v4_3 instanceof Integer)) {
                v4_4 = 0;
            } else {
                v4_4 = ((Integer) v4_3);
            }
            boolean v4_6;
            if (!v4_4) {
                v4_6 = 0;
            } else {
                v4_6 = v4_4.intValue();
            }
            v4_5 = (v4_6 - 1);
        } else {
            return 0;
        }
    }

    public abstract Object invokeSuspend();

    public void releaseIntercepted()
    {
        return;
    }

    public final void resumeWith(Object p4)
    {
        l7.c v0_0 = this;
        while(true) {
            l7.c v0_1 = ((n7.a) v0_0);
            l7.c v1 = v0_1.completion;
            kotlin.jvm.internal.j.b(v1);
            p4 = v0_1.invokeSuspend(p4);
            if (p4 != m7.a.a) {
                v0_1.releaseIntercepted();
                if (!(v1 instanceof n7.a)) {
                    break;
                }
                v0_0 = v1;
            } else {
                return;
            }
        }
        v1.resumeWith(p4);
        return;
    }

    public String toString()
    {
        String v0_2 = new StringBuilder("Continuation at ");
        String v1_1 = this.getStackTraceElement();
        if (v1_1 == null) {
            v1_1 = this.getClass().getName();
        }
        v0_2.append(v1_1);
        return v0_2.toString();
    }
}
