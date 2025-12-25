package f6;
public final class d {
    public static final long d;
    public static final long e;
    public final d6.j a;
    public long b;
    public int c;

    static d()
    {
        f6.d.d = java.util.concurrent.TimeUnit.HOURS.toMillis(24);
        f6.d.e = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
        return;
    }

    public d()
    {
        if (v3.f.b == null) {
            v3.f.b = new v3.f();
        }
        if (d6.j.d == null) {
            d6.j.d = new d6.j(v3.f.b);
        }
        this.a = d6.j.d;
        return;
    }

    public final declared_synchronized boolean a()
    {
        int v0_2;
        if (this.c == 0) {
            v0_2 = 1;
        } else {
            this.a.a.getClass();
            if (System.currentTimeMillis() <= this.b) {
                v0_2 = 0;
            }
        }
        return v0_2;
    }

    public final declared_synchronized void b(int p7)
    {
        try {
            if (((p7 < 200) || (p7 >= 300)) && ((p7 != 401) && (p7 != 404))) {
                long v0_4;
                this.c = (this.c + 1);
                if ((p7 != 429) && ((p7 < 500) || (p7 >= 600))) {
                    v0_4 = f6.d.d;
                } else {
                    long v0_7 = Math.pow(4611686018427387904, ((double) this.c));
                    this.a.getClass();
                    v0_4 = ((long) Math.min((v0_7 + ((double) ((long) (Math.random() * 4652007308841189376)))), ((double) f6.d.e)));
                }
                this.a.a.getClass();
                this.b = (System.currentTimeMillis() + v0_4);
                return;
            } else {
                this.c = 0;
                return;
            }
        } catch (v3.f v7_8) {
            throw v7_8;
        }
    }
}
