package v5;
public final synthetic class a implements t5.d {
    public final synthetic int a;

    public synthetic a(int p1)
    {
        this.a = p1;
        return;
    }

    public final void a(Object p3, Object p4)
    {
        switch (this.a) {
            case 0:
                t5.c v0_2 = new StringBuilder("Couldn\'t find encoder for type ");
                v0_2.append(p3.getClass().getCanonicalName());
                throw new t5.b(v0_2.toString());
                break;
            case 1:
                ((t5.e) p4).f(w5.f.g, ((java.util.Map$Entry) p3).getKey());
                ((t5.e) p4).f(w5.f.h, ((java.util.Map$Entry) p3).getValue());
                return;
            default:
                t5.c v0_4 = new StringBuilder("Couldn\'t find encoder for type ");
                v0_4.append(p3.getClass().getCanonicalName());
                throw new t5.b(v0_4.toString());
        }
    }
}
