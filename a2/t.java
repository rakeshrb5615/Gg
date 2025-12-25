package a2;
public final class t implements java.lang.Runnable {
    public static final ThreadLocal e;
    public static final a2.q f;
    public final java.util.ArrayList a;
    public long b;
    public long c;
    public final java.util.ArrayList d;

    static t()
    {
        a2.t.e = new ThreadLocal();
        a2.t.f = new a2.q(0);
        return;
    }

    public t()
    {
        this.a = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        return;
    }

    public static a2.k1 c(androidx.recyclerview.widget.RecyclerView p5, int p6, long p7)
    {
        a2.z0 v0_1 = p5.f.u();
        String v2_2 = 0;
        while (v2_2 < v0_1) {
            boolean v3_2 = androidx.recyclerview.widget.RecyclerView.M(p5.f.t(v2_2));
            if ((v3_2.c != p6) || (v3_2.f())) {
                v2_2++;
            } else {
                return 0;
            }
        }
        a2.z0 v0_2 = p5.c;
        if ((p7 == 9223372036854775807) && (m0.j.a())) {
            android.os.Trace.beginSection("RV Prefetch forced - needed next frame");
        }
        p5.T();
        Throwable v6_1 = v0_2.l(p6, p7);
        if (v6_1 != null) {
            if ((!v6_1.e()) || (v6_1.f())) {
                v0_2.a(v6_1, 0);
            } else {
                v0_2.i(v6_1.a);
            }
        }
        p5.U(0);
        android.os.Trace.endSection();
        return v6_1;
    }

    public final void a(androidx.recyclerview.widget.RecyclerView p5, int p6, int p7)
    {
        if (p5.x) {
            if ((androidx.recyclerview.widget.RecyclerView.F0) && (!this.a.contains(p5))) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else {
                if (this.b == 0) {
                    this.b = p5.getNanoTime();
                    p5.post(this);
                }
            }
        }
        IllegalStateException v5_2 = p5.j0;
        v5_2.a = p6;
        v5_2.b = p7;
        return;
    }

    public final void b(long p18)
    {
        Throwable v0_2 = this.a;
        a2.s v4_3 = v0_2.size();
        androidx.recyclerview.widget.RecyclerView v5_3 = 0;
        int v6_0 = 0;
        a2.z0 v7_1 = 0;
        while (v6_0 < v4_3) {
            int v8_2 = ((androidx.recyclerview.widget.RecyclerView) v0_2.get(v6_0));
            int v10_2 = v8_2.j0;
            if (v8_2.getWindowVisibility() == 0) {
                v10_2.b(v8_2, 0);
                v7_1 += v10_2.c;
            }
            v6_0++;
        }
        int v6_1 = this.d;
        v6_1.ensureCapacity(v7_1);
        a2.z0 v7_0 = 0;
        int v8_0 = 0;
        while (v7_0 < v4_3) {
            int v10_1 = ((androidx.recyclerview.widget.RecyclerView) v0_2.get(v7_0));
            if (v10_1.getWindowVisibility() == 0) {
                a2.r v11_1 = v10_1.j0;
                int v13_2 = (Math.abs(v11_1.b) + Math.abs(v11_1.a));
                int v12_2 = v5_3;
                while (v12_2 < (v11_1.c * 2)) {
                    a2.s v14_4;
                    if (v8_0 < v6_1.size()) {
                        v14_4 = ((a2.s) v6_1.get(v8_0));
                    } else {
                        v14_4 = new a2.s();
                        v6_1.add(v14_4);
                    }
                    int v9_1;
                    int[] v15_1 = ((int[]) v11_1.d);
                    androidx.recyclerview.widget.RecyclerView v5_1 = v15_1[(v12_2 + 1)];
                    if (v5_1 > v13_2) {
                        v9_1 = 0;
                    } else {
                        v9_1 = 1;
                    }
                    v14_4.a = v9_1;
                    v14_4.b = v13_2;
                    v14_4.c = v5_1;
                    v14_4.d = v10_1;
                    v14_4.e = v15_1[v12_2];
                    v8_0++;
                    v12_2 += 2;
                }
            }
            v7_0++;
            v5_3 = 0;
        }
        java.util.Collections.sort(v6_1, a2.t.f);
        Throwable v0_0 = 0;
        while (v0_0 < v6_1.size()) {
            a2.s v4_2 = ((a2.s) v6_1.get(v0_0));
            androidx.recyclerview.widget.RecyclerView v5_4 = v4_2.d;
            if (v5_4 == null) {
                break;
            }
            int v10_3;
            if (!v4_2.a) {
                v10_3 = p18;
            } else {
                v10_3 = 9223372036854775807;
            }
            androidx.recyclerview.widget.RecyclerView v5_5 = a2.t.c(v5_4, v4_2.e, v10_3);
            if ((v5_5 != null) && ((v5_5.b != null) && ((v5_5.e()) && (!v5_5.f())))) {
                androidx.recyclerview.widget.RecyclerView v5_8 = ((androidx.recyclerview.widget.RecyclerView) v5_5.b.get());
                if (v5_8 != null) {
                    if ((v5_8.G) && (v5_8.f.u() != 0)) {
                        a2.z0 v7_10 = v5_8.c;
                        int v10_4 = v5_8.P;
                        if (v10_4 != 0) {
                            v10_4.e();
                        }
                        int v10_5 = v5_8.s;
                        if (v10_5 != 0) {
                            v10_5.j0(v7_10);
                            v5_8.s.k0(v7_10);
                        }
                        v7_10.a.clear();
                        v7_10.g();
                    }
                    a2.z0 v7_11 = v5_8.j0;
                    v7_11.b(v5_8, 1);
                    if (v7_11.c != 0) {
                        int v8_6;
                        if (p18 != 9223372036854775807) {
                            v8_6 = "RV Nested Prefetch forced - needed next frame";
                        } else {
                            v8_6 = "RV Nested Prefetch";
                        }
                        android.os.Trace.beginSection(v8_6);
                        int v8_7 = v5_8.k0;
                        int v9_3 = v5_8.r;
                        v8_7.d = 1;
                        v8_7.e = v9_3.a();
                        v8_7.g = 0;
                        v8_7.h = 0;
                        v8_7.i = 0;
                        int v9_6 = 0;
                        while (v9_6 < (v7_11.c * 2)) {
                            a2.t.c(v5_8, ((int[]) v7_11.d)[v9_6], p18);
                            v9_6 += 2;
                        }
                        android.os.Trace.endSection();
                    }
                }
            }
            v4_2.a = 0;
            v4_2.b = 0;
            v4_2.c = 0;
            v4_2.d = 0;
            v4_2.e = 0;
            v0_0++;
        }
        return;
    }

    public final void run()
    {
        java.util.concurrent.TimeUnit v0_0 = this.a;
        android.os.Trace.beginSection("RV Prefetch");
        if (!v0_0.isEmpty()) {
            long v3_4 = v0_0.size();
            int v4 = 0;
            long v5_0 = 0;
            while (v4 < v3_4) {
                long v7_1 = ((androidx.recyclerview.widget.RecyclerView) v0_0.get(v4));
                if (v7_1.getWindowVisibility() == 0) {
                    v5_0 = Math.max(v7_1.getDrawingTime(), v5_0);
                }
                v4++;
            }
            if (v5_0 != 0) {
                this.b((java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(v5_0) + this.c));
            } else {
            }
        }
        this.b = 0;
        android.os.Trace.endSection();
        return;
    }
}
