package a1;
public final class m extends kotlin.jvm.internal.k implements u7.a {
    public final synthetic int a;
    public final synthetic a1.g0 b;

    public synthetic m(a1.g0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        super(0);
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                return ((a1.o0) this.b.j.getValue()).c;
            default:
                String v0_1 = this.b.a;
                java.io.File v2_3 = ((java.io.File) v0_1.c.invoke()).getCanonicalFile();
                try {
                    a1.k0 v4_0 = v2_3.getAbsolutePath();
                    int v5_0 = a1.l0.d;
                } catch (String v0_8) {
                    throw v0_8;
                }
                if (v5_0.contains(v4_0)) {
                    String v0_4 = new StringBuilder("There are multiple DataStores active for the same file: ");
                    v0_4.append(v4_0);
                    v0_4.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled).");
                    throw new IllegalStateException(v0_4.toString().toString());
                } else {
                    kotlin.jvm.internal.j.d(v4_0, "path");
                    v5_0.add(v4_0);
                    return new a1.o0(v2_3, v0_1.a, ((a1.s0) v0_1.b.invoke(v2_3)), new a1.k0(v2_3, 0));
                }
        }
    }
}
