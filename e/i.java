package e;
public abstract class i {
    public final java.util.LinkedHashMap a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashMap c;
    public final java.util.ArrayList d;
    public final transient java.util.LinkedHashMap e;
    public final java.util.LinkedHashMap f;
    public final android.os.Bundle g;

    public i()
    {
        this.a = new java.util.LinkedHashMap();
        this.b = new java.util.LinkedHashMap();
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.ArrayList();
        this.e = new java.util.LinkedHashMap();
        this.f = new java.util.LinkedHashMap();
        this.g = new android.os.Bundle();
        return;
    }

    public final boolean a(int p4, int p5, android.content.Intent p6)
    {
        int v4_5 = ((String) this.a.get(Integer.valueOf(p4)));
        if (v4_5 != 0) {
            java.util.ArrayList v1_0;
            f.a v0_1 = ((e.f) this.e.get(v4_5));
            if (v0_1 == null) {
                v1_0 = 0;
            } else {
                v1_0 = v0_1.a;
            }
            if (v1_0 == null) {
                this.f.remove(v4_5);
                this.g.putParcelable(v4_5, new e.a(p5, p6));
            } else {
                java.util.ArrayList v1_1 = this.d;
                if (!v1_1.contains(v4_5)) {
                } else {
                    v0_1.a.onActivityResult(v0_1.b.c(p5, p6));
                    v1_1.remove(v4_5);
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public abstract void b();

    public final e.h c(String p5, androidx.lifecycle.u p6, f.a p7, e.b p8)
    {
        kotlin.jvm.internal.j.e(p5, "key");
        kotlin.jvm.internal.j.e(p7, "contract");
        kotlin.jvm.internal.j.e(p8, "callback");
        e.d v0_5 = p6.getLifecycle();
        e.g v1_4 = ((androidx.lifecycle.w) v0_5);
        if (v1_4.c.compareTo(androidx.lifecycle.o.d) >= 0) {
            String v5_2 = new StringBuilder("LifecycleOwner ");
            v5_2.append(p6);
            v5_2.append(" is attempting to register while current state is ");
            v5_2.append(v1_4.c);
            v5_2.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(v5_2.toString().toString());
        } else {
            this.e(p5);
            e.h v6_6 = this.c;
            e.g v1_1 = ((e.g) v6_6.get(p5));
            if (v1_1 == null) {
                v1_1 = new e.g(v0_5);
            }
            e.d v0_4 = new e.d(this, p5, p8, p7);
            v1_1.a.a(v0_4);
            v1_1.b.add(v0_4);
            v6_6.put(p5, v1_1);
            return new e.h(this, p5, p7, 0);
        }
    }

    public final e.h d(String p3, f.a p4, e.b p5)
    {
        kotlin.jvm.internal.j.e(p3, "key");
        this.e(p3);
        this.e.put(p3, new e.f(p4, p5));
        int v0_7 = this.f;
        if (v0_7.containsKey(p3)) {
            android.content.Intent v1_0 = v0_7.get(p3);
            v0_7.remove(p3);
            p5.onActivityResult(v1_0);
        }
        int v0_1 = this.g;
        android.content.Intent v1_2 = ((e.a) a.a.z(v0_1, p3));
        if (v1_2 != null) {
            v0_1.remove(p3);
            p5.onActivityResult(p4.c(v1_2.a, v1_2.b));
        }
        return new e.h(this, p3, p4, 1);
    }

    public final void e(String p6)
    {
        String v0_0 = this.b;
        if (((Integer) v0_0.get(p6)) == null) {
            Integer v1_8 = new e.e();
            Integer v1_2 = new a8.a(new a8.e(v1_8, new a6.i(v1_8, 1), 0)).iterator();
            while (v1_2.hasNext()) {
                Integer v2_3 = ((Number) v1_2.next());
                java.util.LinkedHashMap v4_1 = this.a;
                if (!v4_1.containsKey(Integer.valueOf(v2_3.intValue()))) {
                    Integer v1_5 = v2_3.intValue();
                    v4_1.put(Integer.valueOf(v1_5), p6);
                    v0_0.put(p6, Integer.valueOf(v1_5));
                    return;
                }
            }
            throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
        } else {
            return;
        }
    }

    public final void f(String p8)
    {
        kotlin.jvm.internal.j.e(p8, "key");
        if (!this.d.contains(p8)) {
            java.util.LinkedHashMap v0_9 = ((Integer) this.b.remove(p8));
            if (v0_9 != null) {
                this.a.remove(v0_9);
            }
        }
        this.e.remove(p8);
        java.util.LinkedHashMap v0_2 = this.f;
        if (v0_2.containsKey(p8)) {
            e.g v1_2 = v1.a.q("Dropping pending result for request ", p8, ": ");
            v1_2.append(v0_2.get(p8));
            android.util.Log.w("ActivityResultRegistry", v1_2.toString());
            v0_2.remove(p8);
        }
        java.util.LinkedHashMap v0_4 = this.g;
        if (v0_4.containsKey(p8)) {
            e.g v1_6 = ((e.a) a.a.z(v0_4, p8));
            androidx.lifecycle.s v5_2 = new StringBuilder("Dropping pending result for request ");
            v5_2.append(p8);
            v5_2.append(": ");
            v5_2.append(v1_6);
            android.util.Log.w("ActivityResultRegistry", v5_2.toString());
            v0_4.remove(p8);
        }
        java.util.LinkedHashMap v0_6 = this.c;
        e.g v1_9 = ((e.g) v0_6.get(p8));
        if (v1_9 != null) {
            java.util.ArrayList v2_1 = v1_9.b;
            int v3_1 = v2_1.size();
            int v4_1 = 0;
            while (v4_1 < v3_1) {
                androidx.lifecycle.s v5_3 = v2_1.get(v4_1);
                v4_1++;
                v1_9.a.b(((androidx.lifecycle.s) v5_3));
            }
            v2_1.clear();
            v0_6.remove(p8);
        }
        return;
    }
}
