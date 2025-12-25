package c4;
public final class e {
    public final c4.l a;
    public final c4.c b;
    public final android.content.Context c;

    public e(c4.l p3, c4.c p4, android.content.Context p5)
    {
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.a = p3;
        this.b = p4;
        this.c = p5;
        return;
    }

    public final declared_synchronized void a(i2.e0 p5)
    {
        try {
            c4.c v0 = this.b;
        } catch (NullPointerException v5_2) {
            throw v5_2;
        }
        Object[] v3_1 = new Object[0];
        v0.a.h("unregisterListener", v3_1);
        if (p5 == null) {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        } else {
            v0.d.remove(p5);
            v0.a();
            return;
        }
    }
}
