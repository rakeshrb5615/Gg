package r6;
public final class j0 implements t6.b, t2.b {
    public final synthetic int a;
    public final g7.a b;

    public synthetic j0(g7.a p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object get()
    {
        switch (this.a) {
            case 0:
                return new r6.i0(((r6.t0) this.b.get()));
            case 1:
                NullPointerException v0_11 = ((android.content.Context) this.b.get()).getPackageName();
                if (v0_11 == null) {
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                } else {
                    return v0_11;
                }
            default:
                return new y2.j(((android.content.Context) this.b.get()), Integer.valueOf(y2.j.d).intValue(), "com.google.android.datatransport.events");
        }
    }
}
