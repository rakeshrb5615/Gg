package r6;
public final class c0 {
    public final android.content.Context a;
    public final h7.j b;
    public final int c;
    public final h7.j d;
    public final h7.j e;
    public boolean f;

    public c0(android.content.Context p2, r6.h1 p3)
    {
        kotlin.jvm.internal.j.e(p2, "appContext");
        kotlin.jvm.internal.j.e(p3, "uuidGenerator");
        this.a = p2;
        this.b = a.a.F(new r6.b0(this, 0));
        this.c = android.os.Process.myPid();
        this.d = a.a.F(new a8.j(p3, 6));
        this.e = a.a.F(new r6.b0(this, 1));
        return;
    }

    public final String a()
    {
        return ((String) this.b.getValue());
    }

    public final java.util.Map b(java.util.Map p5)
    {
        h7.f v0_0 = this.d;
        if (p5 == null) {
            return i7.r.m0(new h7.f(this.a(), new r6.a0(android.os.Process.myPid(), ((String) v0_0.getValue()))));
        } else {
            java.util.Map v5_2 = i7.r.s0(p5);
            v5_2.put(this.a(), new r6.a0(android.os.Process.myPid(), ((String) v0_0.getValue())));
            return i7.r.r0(v5_2);
        }
    }
}
