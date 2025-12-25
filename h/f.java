package h;
public final class f implements r0.l {
    public final synthetic int a;
    public int b;
    public Object c;

    public f(int p1)
    {
        this.a = p1;
        switch (p1) {
            case 5:
                this.b = 1;
                this.c = java.util.Collections.singletonList(0);
                return;
            default:
                this.c = new java.util.ArrayList();
                this.b = 128;
                return;
        }
    }

    public f(int p2, String p3)
    {
        this.a = 4;
        this.b = p2;
        this.c = p3;
        return;
    }

    public synthetic f(int p1, boolean p2)
    {
        this.a = p1;
        return;
    }

    public f(android.content.Context p5)
    {
        this.a = 0;
        int v0_1 = h.g.e(p5, 0);
        this.c = new h.b(new android.view.ContextThemeWrapper(p5, h.g.e(p5, v0_1)));
        this.b = v0_1;
        return;
    }

    public synthetic f(Object p1, int p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public f(java.util.ArrayList p2)
    {
        this.a = 5;
        this.b = 0;
        this.c = p2;
        return;
    }

    public boolean a(android.view.View p2)
    {
        ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.c).H(this.b);
        return 1;
    }

    public h.g b()
    {
        m.n v1_1 = ((h.b) this.c);
        h.g v0_1 = new h.g(v1_1.a, this.b);
        androidx.appcompat.app.AlertController$RecycleListView v2_6 = v1_1.e;
        h.e v3_1 = v0_1.m;
        if (v2_6 == null) {
            androidx.appcompat.app.AlertController$RecycleListView v2_7 = v1_1.d;
            if (v2_7 != null) {
                v3_1.d = v2_7;
                android.widget.ImageView v4_0 = v3_1.l;
                if (v4_0 != null) {
                    v4_0.setText(v2_7);
                }
            }
            androidx.appcompat.app.AlertController$RecycleListView v2_0 = v1_1.c;
            if (v2_0 != null) {
                v3_1.j = v2_0;
                android.widget.ImageView v4_1 = v3_1.k;
                if (v4_1 != null) {
                    v4_1.setVisibility(0);
                    v3_1.k.setImageDrawable(v2_0);
                }
            }
        } else {
            v3_1.n = v2_6;
        }
        if (v1_1.g != null) {
            boolean v6_2;
            androidx.appcompat.app.AlertController$RecycleListView v2_5 = ((androidx.appcompat.app.AlertController$RecycleListView) v1_1.b.inflate(v3_1.r, 0));
            if (!v1_1.i) {
                v6_2 = v3_1.t;
            } else {
                v6_2 = v3_1.s;
            }
            h.d v7_0 = v1_1.g;
            if (v7_0 == null) {
                v7_0 = new h.d(v1_1.a, v6_2, 16908308, 0);
            }
            v3_1.o = v7_0;
            v3_1.p = v1_1.j;
            if (v1_1.h != null) {
                v2_5.setOnItemClickListener(new h.a(v1_1, v3_1));
            }
            if (v1_1.i) {
                v2_5.setChoiceMode(1);
            }
            v3_1.e = v2_5;
        }
        v0_1.setCancelable(1);
        v0_1.setCanceledOnTouchOutside(1);
        v0_1.setOnCancelListener(0);
        v0_1.setOnDismissListener(0);
        m.n v1_2 = v1_1.f;
        if (v1_2 != null) {
            v0_1.setOnKeyListener(v1_2);
        }
        return v0_1;
    }

    public void c(int p3, int p4)
    {
        String v4_1 = (p4 + p3);
        char[] v0_1 = ((char[]) this.c);
        if (v0_1.length <= v4_1) {
            char[] v3_1 = (p3 * 2);
            if (v4_1 < v3_1) {
                v4_1 = v3_1;
            }
            char[] v3_2 = java.util.Arrays.copyOf(v0_1, v4_1);
            kotlin.jvm.internal.j.d(v3_2, "copyOf(...)");
            this.c = v3_2;
        }
        return;
    }

    public declared_synchronized java.util.List d()
    {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(((java.util.ArrayList) this.c)));
    }

    public void e(int p9, x8.d p10)
    {
        while(true) {
            x8.d[] v0_0 = (p9 >> 1);
            if (v0_0 == null) {
                break;
            }
            x8.d v1_2 = ((x8.d[]) this.c)[v0_0];
            kotlin.jvm.internal.j.b(v1_2);
            if (kotlin.jvm.internal.j.g(0, (p10.g - v1_2.g)) <= 0) {
                break;
            }
            v1_2.f = p9;
            ((x8.d[]) this.c)[p9] = v1_2;
            p9 = v0_0;
        }
        ((x8.d[]) this.c)[p9] = p10;
        p10.f = p9;
        return;
    }

    public void f()
    {
        u8.b v0 = u8.b.c;
        Throwable v1_2 = ((char[]) this.c);
        v0.getClass();
        kotlin.jvm.internal.j.e(v1_2, "array");
        try {
            i7.g v2_4 = v0.a;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
        if ((v1_2.length + v2_4) < u8.a.a) {
            v0.a = (v2_4 + v1_2.length);
            ((i7.g) v0.b).addLast(v1_2);
        }
        return;
    }

    public void g(x8.d p10)
    {
        int v0_0 = p10.f;
        if (v0_0 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            int v2_1 = this.b;
            x8.d v3_0 = ((x8.d[]) this.c)[v2_1];
            kotlin.jvm.internal.j.b(v3_0);
            p10.f = -1;
            ((x8.d[]) this.c)[v2_1] = 0;
            this.b = (v2_1 - 1);
            if (p10 != v3_0) {
                x8.d[] v10_1 = kotlin.jvm.internal.j.g(0, (v3_0.g - p10.g));
                if (v10_1 != null) {
                    if (v10_1 >= null) {
                        this.e(v0_0, v3_0);
                        return;
                    }
                    while(true) {
                        x8.d[] v10_4;
                        x8.d[] v10_3 = (v0_0 << 1);
                        int v4_3 = (v10_3 + 1);
                        x8.d[] v5_0 = this.b;
                        if (v4_3 > v5_0) {
                            if (v10_3 > v5_0) {
                                break;
                            }
                            v10_4 = ((x8.d[]) this.c)[v10_3];
                            kotlin.jvm.internal.j.b(v10_4);
                            if (kotlin.jvm.internal.j.g(0, (v10_4.g - v3_0.g)) <= 0) {
                                break;
                            }
                            int v4_9 = v10_4.f;
                            v10_4.f = v0_0;
                            ((x8.d[]) this.c)[v0_0] = v10_4;
                            v0_0 = v4_9;
                        } else {
                            v10_4 = ((x8.d[]) this.c)[v10_3];
                            kotlin.jvm.internal.j.b(v10_4);
                            int v4_6 = ((x8.d[]) this.c)[v4_3];
                            kotlin.jvm.internal.j.b(v4_6);
                            if (kotlin.jvm.internal.j.g(0, (v4_6.g - v10_4.g)) >= 0) {
                                v10_4 = v4_6;
                            }
                        }
                    }
                    ((x8.d[]) this.c)[v0_0] = v3_0;
                    v3_0.f = v0_0;
                    return;
                } else {
                    ((x8.d[]) this.c)[v0_0] = v3_0;
                    v3_0.f = v0_0;
                    return;
                }
            } else {
                return;
            }
        }
    }

    public declared_synchronized boolean h(java.util.List p4)
    {
        ((java.util.ArrayList) this.c).clear();
        if (p4.size() <= this.b) {
            return ((java.util.ArrayList) this.c).addAll(p4);
        } else {
            int v1_2 = new StringBuilder("Ignored 0 entries when adding rollout assignments. Maximum allowable: ");
            v1_2.append(this.b);
            android.util.Log.w("FirebaseCrashlytics", v1_2.toString(), 0);
            return ((java.util.ArrayList) this.c).addAll(p4.subList(0, this.b));
        }
    }

    public void i(String p6)
    {
        kotlin.jvm.internal.j.e(p6, "text");
        int v0_1 = p6.length();
        if (v0_1 != 0) {
            this.c(this.b, v0_1);
            p6.getChars(0, p6.length(), ((char[]) this.c), this.b);
            this.b = (this.b + v0_1);
            return;
        } else {
            return;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 6:
                return new String(((char[]) this.c), 0, this.b);
            default:
                return super.toString();
        }
    }
}
