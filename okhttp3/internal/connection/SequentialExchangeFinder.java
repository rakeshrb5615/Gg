package okhttp3.internal.connection;
public final class SequentialExchangeFinder implements okhttp3.internal.connection.ExchangeFinder {
    public final okhttp3.internal.connection.RealRoutePlanner a;

    public SequentialExchangeFinder(okhttp3.internal.connection.RealRoutePlanner p1)
    {
        this.a = p1;
        return;
    }

    public final okhttp3.internal.connection.RealConnection a()
    {
        okhttp3.internal.connection.RealConnection v0_0 = this.a;
        java.io.IOException v2 = 0;
        while (!v0_0.k.w) {
            i7.g v3_0 = v0_0.d();
            if (!v3_0.e()) {
                okhttp3.internal.connection.RoutePlanner$Plan v5_2;
                Throwable v4_1 = v3_0.g();
                if ((v4_1.b != null) || (v4_1.c != null)) {
                    v5_2 = 0;
                } else {
                    v5_2 = 1;
                }
                if (v5_2 != null) {
                    v4_1 = v3_0.c();
                }
                okhttp3.internal.connection.RoutePlanner$Plan v5_3 = v4_1.b;
                Throwable v4_2 = v4_1.c;
                if (v4_2 != null) {
                    throw v4_2;
                } else {
                    if (v5_3 != null) {
                        v0_0.p.addFirst(v5_3);
                    }
                }
            }
            return v3_0.d();
        }
        throw new java.io.IOException("Canceled");
    }

    public final okhttp3.internal.connection.RoutePlanner b()
    {
        return this.a;
    }
}
