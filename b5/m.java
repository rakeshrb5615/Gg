package b5;
public final class m implements java.util.concurrent.Executor {
    public static final java.util.logging.Logger f;
    public final java.util.concurrent.Executor a;
    public final java.util.ArrayDeque b;
    public int c;
    public long d;
    public final b5.l e;

    static m()
    {
        b5.m.f = java.util.logging.Logger.getLogger(b5.m.getName());
        return;
    }

    public m(java.util.concurrent.Executor p3)
    {
        this.b = new java.util.ArrayDeque();
        this.c = 1;
        this.d = 0;
        this.e = new b5.l(this);
        this.a = ((java.util.concurrent.Executor) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        return;
    }

    public final void execute(Runnable p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        try {
            int v1_1 = this.c;
        } catch (boolean v8_8) {
            throw v8_8;
        }
        if (v1_1 != 4) {
            if (v1_1 != 3) {
                int v3_1 = this.d;
                int v1_0 = new b5.k(p8, 0);
                this.b.add(v1_0);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                } catch (java.util.ArrayDeque v0_2) {
                    int v3_0 = this.c;
                    int v4 = 1;
                    if (v3_0 == 1) {
                        if (!this.b.removeLastOccurrence(v1_0)) {
                            v4 = 0;
                        } else {
                        }
                    } else {
                        if (v3_0 != 2) {
                        }
                    }
                    if ((v0_2 instanceof java.util.concurrent.RejectedExecutionException)) {
                        if (v4 == 0) {
                            return;
                        }
                    }
                    throw v0_2;
                } catch (java.util.ArrayDeque v0_2) {
                }
                if (this.c == 2) {
                    if ((this.d == v3_1) && (this.c == 2)) {
                        this.c = 3;
                    }
                    return;
                }
            } else {
            }
        }
        this.b.add(p8);
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("SequentialExecutor@");
        v0_2.append(System.identityHashCode(this));
        v0_2.append("{");
        v0_2.append(this.a);
        v0_2.append("}");
        return v0_2.toString();
    }
}
