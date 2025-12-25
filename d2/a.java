package d2;
public final class a {
    public static volatile d2.a d;
    public static final Object e;
    public final java.util.HashMap a;
    public final java.util.HashSet b;
    public final android.content.Context c;

    static a()
    {
        d2.a.e = new Object();
        return;
    }

    public a(android.content.Context p1)
    {
        this.c = p1.getApplicationContext();
        this.b = new java.util.HashSet();
        this.a = new java.util.HashMap();
        return;
    }

    public static d2.a c(android.content.Context p2)
    {
        if (d2.a.d == null) {
            if (d2.a.d == null) {
                d2.a.d = new d2.a(p2);
            }
        }
        return d2.a.d;
    }

    public final void a(android.os.Bundle p7)
    {
        Class v0_4 = this.c.getString(2131951683);
        if (p7 != null) {
            java.util.HashSet v1_2 = new java.util.HashSet();
            java.util.Iterator v2_0 = p7.keySet().iterator();
            do {
                java.util.HashSet v4 = this.b;
                if (!v2_0.hasNext()) {
                    java.util.Iterator v7_1 = v4.iterator();
                    while (v7_1.hasNext()) {
                        this.b(((Class) v7_1.next()), v1_2);
                    }
                } else {
                    Class v3_2 = ((String) v2_0.next());
                    if (v0_4.equals(p7.getString(v3_2, 0))) {
                        Class v3_3 = Class.forName(v3_2);
                    }
                }
            } while(!d2.b.isAssignableFrom(v3_3));
            v4.add(v3_3);
        }
        return;
    }

    public final Object b(Class p6, java.util.HashSet p7)
    {
        java.util.HashMap v0 = this.a;
        if (j5.t1.I()) {
            j5.t1.c(p6.getSimpleName());
        }
        if (p7.contains(p6)) {
            Throwable v6_1 = p6.getName();
            a5.o v7_2 = new StringBuilder("Cannot initialize ");
            v7_2.append(v6_1);
            v7_2.append(". Cycle detected.");
            throw new IllegalStateException(v7_2.toString());
        } else {
            Object v1_2;
            if (v0.containsKey(p6)) {
                v1_2 = v0.get(p6);
            } else {
                p7.add(p6);
                Object v1_5 = ((d2.b) p6.getDeclaredConstructor(0).newInstance(0));
                android.content.Context v2_2 = v1_5.a();
                if (!v2_2.isEmpty()) {
                    android.content.Context v2_3 = v2_2.iterator();
                    while (v2_3.hasNext()) {
                        Class v3_3 = ((Class) v2_3.next());
                        if (!v0.containsKey(v3_3)) {
                            this.b(v3_3, p7);
                        }
                    }
                }
                v1_2 = v1_5.b(this.c);
                p7.remove(p6);
                v0.put(p6, v1_2);
            }
            android.os.Trace.endSection();
            return v1_2;
        }
    }
}
