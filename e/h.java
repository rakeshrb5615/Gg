package e;
public final class h extends e.c {
    public final synthetic int a;
    public final synthetic e.i b;
    public final synthetic String c;
    public final synthetic f.a d;

    public synthetic h(e.i p1, String p2, f.a p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public final void a(Object p6)
    {
        switch (this.a) {
            case 0:
                IllegalStateException v0_3 = this.b;
                String v1_2 = v0_3.d;
                String v3_1 = this.c;
                int v2_7 = v0_3.b.get(v3_1);
                f.a v4_1 = this.d;
                if (v2_7 == 0) {
                    IllegalStateException v0_2 = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    v0_2.append(v4_1);
                    v0_2.append(" and input ");
                    v0_2.append(p6);
                    v0_2.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    throw new IllegalStateException(v0_2.toString().toString());
                } else {
                    int v2_1 = ((Number) v2_7).intValue();
                    v1_2.add(v3_1);
                    try {
                        v0_3.b(v2_1, v4_1, p6);
                        return;
                    } catch (Exception v6_4) {
                        v1_2.remove(v3_1);
                        throw v6_4;
                    }
                }
            default:
                IllegalStateException v0_6 = this.b;
                String v1_3 = v0_6.d;
                String v3_0 = this.c;
                int v2_4 = v0_6.b.get(v3_0);
                f.a v4_0 = this.d;
                if (v2_4 == 0) {
                    IllegalStateException v0_8 = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    v0_8.append(v4_0);
                    v0_8.append(" and input ");
                    v0_8.append(p6);
                    v0_8.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    throw new IllegalStateException(v0_8.toString().toString());
                } else {
                    int v2_6 = ((Number) v2_4).intValue();
                    v1_3.add(v3_0);
                    try {
                        v0_6.b(v2_6, v4_0, p6);
                        return;
                    } catch (Exception v6_8) {
                        v1_3.remove(v3_0);
                        throw v6_8;
                    }
                }
        }
    }

    public void b()
    {
        this.b.f(this.c);
        return;
    }
}
