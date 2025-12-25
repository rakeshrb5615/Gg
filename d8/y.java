package d8;
public final synthetic class y implements u7.l {
    public final synthetic int a;

    public synthetic y(int p1)
    {
        this.a = p1;
        return;
    }

    public final Object invoke(Object p3)
    {
        switch (this.a) {
            case 0:
                int v3_3;
                if (!(((l7.f) p3) instanceof d8.a0)) {
                    v3_3 = 0;
                } else {
                    v3_3 = ((d8.a0) ((l7.f) p3));
                }
                return v3_3;
            default:
                kotlin.jvm.internal.j.e(((a1.b) p3), "ex");
                android.util.Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ((a1.b) p3));
                return u6.i.b;
        }
    }
}
