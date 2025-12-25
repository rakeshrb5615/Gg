package okhttp3;
public final class FormBody extends okhttp3.RequestBody {
    public static final okhttp3.MediaType d;
    public final java.util.List b;
    public final java.util.List c;

    static FormBody()
    {
        new okhttp3.FormBody$Companion(0);
        okhttp3.MediaType.e.getClass();
        okhttp3.FormBody.d = okhttp3.MediaType$Companion.a("application/x-www-form-urlencoded");
        return;
    }

    public FormBody(java.util.ArrayList p2, java.util.ArrayList p3)
    {
        kotlin.jvm.internal.j.e(p2, "encodedNames");
        kotlin.jvm.internal.j.e(p3, "encodedValues");
        this.b = okhttp3.internal._UtilJvmKt.i(p2);
        this.c = okhttp3.internal._UtilJvmKt.i(p3);
        return;
    }

    public final long a()
    {
        return this.e(0, 1);
    }

    public final okhttp3.MediaType b()
    {
        return okhttp3.FormBody.d;
    }

    public final void d(x8.h p2)
    {
        this.e(p2, 0);
        return;
    }

    public final long e(x8.h p5, boolean p6)
    {
        long v5_2;
        if (!p6) {
            kotlin.jvm.internal.j.b(p5);
            v5_2 = p5.a();
        } else {
            v5_2 = new x8.g();
        }
        long v0_1 = this.b;
        int v1 = v0_1.size();
        int v2 = 0;
        while (v2 < v1) {
            if (v2 > 0) {
                v5_2.M(38);
            }
            v5_2.S(((String) v0_1.get(v2)));
            v5_2.M(61);
            v5_2.S(((String) this.c.get(v2)));
            v2++;
        }
        if (!p6) {
            return 0;
        } else {
            long v0_0 = v5_2.b;
            v5_2.s();
            return v0_0;
        }
    }
}
