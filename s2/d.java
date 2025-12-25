package s2;
public final class d {
    public final n0.a a;
    public final b8.g b;
    public final java.util.HashMap c;

    public d(android.content.Context p2, b8.g p3)
    {
        n0.a v0_1 = new n0.a(p2);
        this.c = new java.util.HashMap();
        this.a = v0_1;
        this.b = p3;
        return;
    }

    public final declared_synchronized s2.e a(String p6)
    {
        if (!this.c.containsKey(p6)) {
            s2.e v0_5 = this.a.e(p6);
            if (v0_5 != null) {
                java.util.HashMap v1_3 = this.b;
                s2.e v0_1 = v0_5.create(new s2.b(((android.content.Context) v1_3.b), ((a3.a) v1_3.c), ((a3.a) v1_3.d), p6));
                this.c.put(p6, v0_1);
                return v0_1;
            } else {
                return 0;
            }
        } else {
            return ((s2.e) this.c.get(p6));
        }
    }
}
