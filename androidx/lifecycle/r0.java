package androidx.lifecycle;
public final class r0 implements b2.d {
    public final b2.e a;
    public boolean b;
    public android.os.Bundle c;
    public final h7.j d;

    public r0(b2.e p2, androidx.lifecycle.b1 p3)
    {
        kotlin.jvm.internal.j.e(p2, "savedStateRegistry");
        this.a = p2;
        this.d = a.a.F(new a8.j(p3, 1));
        return;
    }

    public final android.os.Bundle a()
    {
        android.os.Bundle v1_0 = new h7.f[0];
        android.os.Bundle v1_3 = c4.b.f(((h7.f[]) java.util.Arrays.copyOf(v1_0, 0)));
        java.util.Iterator v2_6 = this.c;
        if (v2_6 != null) {
            v1_3.putAll(v2_6);
        }
        java.util.Iterator v2_5 = ((androidx.lifecycle.s0) this.d.getValue()).b.entrySet().iterator();
        while (v2_5.hasNext()) {
            android.os.Bundle v3_2 = ((java.util.Map$Entry) v2_5.next());
            String v4_1 = ((String) v3_2.getKey());
            android.os.Bundle v3_8 = ((c.f) ((androidx.lifecycle.n0) v3_2.getValue()).a.f).a();
            if (!v3_8.isEmpty()) {
                kotlin.jvm.internal.j.e(v4_1, "key");
                v1_3.putBundle(v4_1, v3_8);
            }
        }
        this.b = 0;
        return v1_3;
    }

    public final void b()
    {
        if (!this.b) {
            androidx.lifecycle.s0 v0_5 = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            android.os.Bundle v2_1 = new h7.f[0];
            android.os.Bundle v1_1 = c4.b.f(((h7.f[]) java.util.Arrays.copyOf(v2_1, 0)));
            android.os.Bundle v2_0 = this.c;
            if (v2_0 != null) {
                v1_1.putAll(v2_0);
            }
            if (v0_5 != null) {
                v1_1.putAll(v0_5);
            }
            this.c = v1_1;
            this.b = 1;
            this.d.getValue();
        }
        return;
    }
}
