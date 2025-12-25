package b2;
public final class f {
    public final c2.a a;
    public final b2.e b;

    public f(c2.a p2)
    {
        this.a = p2;
        this.b = new b2.e(p2);
        return;
    }

    public final void a(android.os.Bundle p5)
    {
        String v0_0 = this.a;
        android.os.Bundle v1_0 = v0_0.a;
        if (!v0_0.e) {
            v0_0.a();
        }
        if (((androidx.lifecycle.w) v1_0.getLifecycle()).c.compareTo(androidx.lifecycle.o.d) >= 0) {
            int v5_2 = new StringBuilder("performRestore cannot be called when owner is ");
            v5_2.append(((androidx.lifecycle.w) v1_0.getLifecycle()).c);
            throw new IllegalStateException(v5_2.toString().toString());
        } else {
            if (v0_0.g) {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            } else {
                android.os.Bundle v1_2 = 0;
                if ((p5 != 0) && (p5.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key"))) {
                    v1_2 = j5.t1.E(p5, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                v0_0.f = v1_2;
                v0_0.g = 1;
                return;
            }
        }
    }

    public final void b(android.os.Bundle p7)
    {
        String v0_0 = this.a;
        v3.f v2_0 = new h7.f[0];
        android.os.Bundle v1_3 = c4.b.f(((h7.f[]) java.util.Arrays.copyOf(v2_0, 0)));
        v3.f v2_1 = v0_0.f;
        if (v2_1 != null) {
            v1_3.putAll(v2_1);
        }
        try {
            String v0_3 = v0_0.d.entrySet().iterator();
        } catch (Throwable v7_1) {
            throw v7_1;
        }
        while (v0_3.hasNext()) {
            android.os.Bundle v3_2 = ((java.util.Map$Entry) v0_3.next());
            String v4_1 = ((String) v3_2.getKey());
            android.os.Bundle v3_5 = ((b2.d) v3_2.getValue()).a();
            kotlin.jvm.internal.j.e(v4_1, "key");
            v1_3.putBundle(v4_1, v3_5);
        }
        if (!v1_3.isEmpty()) {
            p7.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", v1_3);
        }
        return;
    }
}
