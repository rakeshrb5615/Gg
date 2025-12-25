package c4;
public final class g implements d4.c {
    public final d4.c a;

    public synthetic g(c4.f p5)
    {
        c4.g v0_3 = new l6.c(p5, 9);
        this.a = d4.b.a(new c4.g(d4.b.a(new b8.g(d4.b.a(new k2.c(5, v0_3, d4.b.a(new c4.d(v0_3, 1)))), d4.b.a(new c4.d(v0_3, 0)), v0_3, 1))));
        return;
    }

    public g(d4.c p1)
    {
        this.a = p1;
        return;
    }

    public Object zza()
    {
        NullPointerException v0_2 = ((c4.e) this.a.zza());
        if (v0_2 == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else {
            return v0_2;
        }
    }
}
