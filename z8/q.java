package z8;
public final class q extends z8.s {
    public final z8.f d;
    public final boolean e;

    public q(z8.p0 p1, okhttp3.Call$Factory p2, z8.m p3, z8.f p4, boolean p5)
    {
        super(p1, p2, p3);
        super.d = p4;
        super.e = p5;
        return;
    }

    public final Object b(z8.z p2, Object[] p3)
    {
        m7.a v2_7 = ((z8.d) this.d.a(p2));
        l7.c v3_2 = ((l7.c) p3[(p3.length - 1)]);
        try {
            if (!this.e) {
                return z8.z0.b(v2_7, v3_2);
            } else {
                kotlin.jvm.internal.j.c(v2_7, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
                return z8.z0.c(v2_7, v3_2);
            }
        } catch (m7.a v2_6) {
        } catch (m7.a v2_6) {
        } catch (m7.a v2_6) {
        } catch (m7.a v2_3) {
            z8.z0.q(v2_3, v3_2);
            return m7.a.a;
        }
        throw v2_6;
    }
}
