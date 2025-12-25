package c1;
public final class d {
    public final a1.p a;
    public final d1.i b;
    public final android.content.Context c;
    public final String d;
    public final h7.j e;
    public final java.util.Set f;

    public d(android.content.Context p3, String p4, java.util.Set p5, a1.p p6, d1.i p7)
    {
        java.util.LinkedHashSet v3_4;
        kotlin.jvm.internal.j.e(p3, "context");
        kotlin.jvm.internal.j.e(p4, "sharedPreferencesName");
        kotlin.jvm.internal.j.e(p5, "keysToMigrate");
        c1.a v0_4 = new c1.a(p3, p4, 0);
        this.a = p6;
        this.b = p7;
        this.c = p3;
        this.d = p4;
        this.e = a.a.F(v0_4);
        if (p5 != c1.e.a) {
            v3_4 = new java.util.LinkedHashSet(p5);
        } else {
            v3_4 = 0;
        }
        this.f = v3_4;
        return;
    }

    public final Object a(Object p5, n7.c p6)
    {
        int v0_2;
        if (!(p6 instanceof c1.c)) {
            v0_2 = new c1.c(this, p6);
        } else {
            v0_2 = ((c1.c) p6);
            boolean v1_2 = ((c1.c) p6).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((c1.c) p6).d = (v1_2 - -2147483648);
            }
        }
        Boolean v5_1;
        java.util.Iterator v6_1 = v0_2.b;
        boolean v1_1 = m7.a.a;
        int v2_0 = v0_2.d;
        int v3_0 = 1;
        if (v2_0 == 0) {
            c4.b.e0(v6_1);
            v0_2.a = this;
            v0_2.d = 1;
            v6_1 = this.a.invoke(p5, v0_2);
            if (v6_1 != v1_1) {
                v5_1 = this;
            } else {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v5_1 = v0_2.a;
                c4.b.e0(v6_1);
            }
        }
        if (((Boolean) v6_1).booleanValue()) {
            java.util.Iterator v6_6 = v5_1.f;
            Boolean v5_4 = v5_1.e;
            if (v6_6 != null) {
                Boolean v5_6 = ((android.content.SharedPreferences) v5_4.getValue());
                if (!v6_6.isEmpty()) {
                    java.util.Iterator v6_7 = v6_6.iterator();
                    while (v6_7.hasNext()) {
                        if (v5_6.contains(((String) v6_7.next()))) {
                        }
                    }
                    v3_0 = 0;
                }
            } else {
                Boolean v5_9 = ((android.content.SharedPreferences) v5_4.getValue()).getAll();
                kotlin.jvm.internal.j.d(v5_9, "sharedPrefs.all");
                if (v5_9.isEmpty()) {
                }
            }
            return Boolean.valueOf(v3_0);
        } else {
            return Boolean.FALSE;
        }
    }
}
