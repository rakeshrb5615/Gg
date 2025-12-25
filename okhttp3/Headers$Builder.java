package okhttp3;
public final class Headers$Builder {
    public final java.util.ArrayList a;

    public Headers$Builder()
    {
        this.a = new java.util.ArrayList(20);
        return;
    }

    public final void a(String p2, String p3)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        kotlin.jvm.internal.j.e(p3, "value");
        okhttp3.internal._HeadersCommonKt.b(p2);
        okhttp3.internal._HeadersCommonKt.c(p3, p2);
        okhttp3.internal._HeadersCommonKt.a(this, p2, p3);
        return;
    }

    public final void b(String p2, String p3)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        kotlin.jvm.internal.j.e(p3, "value");
        okhttp3.internal._HeadersCommonKt.a(this, p2, p3);
        return;
    }

    public final okhttp3.Headers c()
    {
        String[] v1_1 = new String[0];
        return new okhttp3.Headers(((String[]) this.a.toArray(v1_1)));
    }

    public final void d(String p4)
    {
        kotlin.jvm.internal.j.e(p4, "name");
        int v0_1 = 0;
        while(true) {
            java.util.ArrayList v1 = this.a;
            if (v0_1 >= v1.size()) {
                break;
            }
            if (p4.equalsIgnoreCase(((String) v1.get(v0_1)))) {
                v1.remove(v0_1);
                v1.remove(v0_1);
                v0_1 -= 2;
            }
            v0_1 += 2;
        }
        return;
    }
}
