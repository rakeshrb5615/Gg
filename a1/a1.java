package a1;
public final synthetic class a1 implements d8.p0 {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic a1(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final void a()
    {
        switch (this.a) {
            case 0:
                Throwable v0_6 = ((String) this.b);
                try {
                    java.util.LinkedHashMap v3 = a1.c1.c;
                    a1.c1 v4_0 = ((a1.c1) v3.get(v0_6));
                } catch (Throwable v0_1) {
                    throw v0_1;
                }
                if (v4_0 != null) {
                    v4_0.a.remove(((a1.b1) this.c));
                    if (v4_0.a.isEmpty()) {
                        v3.remove(v0_6);
                        v4_0.stopWatching();
                    }
                }
                return;
            default:
                ((e8.c) this.b).c.removeCallbacks(((d8.b2) this.c));
                return;
        }
    }
}
