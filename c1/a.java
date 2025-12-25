package c1;
public final class a extends kotlin.jvm.internal.k implements u7.a {
    public final synthetic int a;
    public final synthetic android.content.Context b;
    public final synthetic Object c;

    public synthetic a(android.content.Context p1, Object p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        super(0);
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                android.content.SharedPreferences v0_9 = this.b.getSharedPreferences(((String) this.c), 0);
                kotlin.jvm.internal.j.d(v0_9, "context.getSharedPrefere\u2026me, Context.MODE_PRIVATE)");
                return v0_9;
            default:
                String v1_0 = this.b;
                kotlin.jvm.internal.j.d(v1_0, "applicationContext");
                android.content.SharedPreferences v0_4 = ((d1.a) this.c).a;
                kotlin.jvm.internal.j.e(v0_4, "name");
                return x1.b.a(v1_0, v0_4.concat(".preferences_pb"));
        }
    }
}
