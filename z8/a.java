package z8;
public class a implements z8.m {
    public static final z8.a b;
    public static final z8.a c;
    public static final z8.a d;
    public static final z8.a e;
    public static final z8.a f;
    public static final z8.a m;
    public final synthetic int a;

    static synthetic a()
    {
        z8.a.b = new z8.a(0);
        z8.a.c = new z8.a(1);
        z8.a.d = new z8.a(2);
        z8.a.e = new z8.a(3);
        z8.a.f = new z8.a(4);
        z8.a.m = new z8.a(5);
        return;
    }

    public synthetic a(int p1)
    {
        this.a = p1;
        return;
    }

    public java.util.List a(java.util.concurrent.Executor p2)
    {
        return java.util.Collections.singletonList(new z8.o(p2));
    }

    public java.util.List b()
    {
        return java.util.Collections.EMPTY_LIST;
    }

    public String c(reflect.Method p2, int p3)
    {
        String v2_1 = new StringBuilder("parameter #");
        v2_1.append((p3 + 1));
        return v2_1.toString();
    }

    public Object d(reflect.Method p1, Object p2, Object[] p3)
    {
        throw new AssertionError();
    }

    public Object e(Object p6)
    {
        switch (this.a) {
            case 0:
                return p6.toString();
            case 1:
                try {
                    Throwable v0_2 = new x8.g();
                    ((okhttp3.ResponseBody) p6).i().p(v0_2);
                    okhttp3.MediaType v1_1 = ((okhttp3.ResponseBody) p6).f();
                    long v2 = ((okhttp3.ResponseBody) p6).c();
                    okhttp3.ResponseBody.b.getClass();
                    okhttp3.ResponseBody$Companion$asResponseBody$1 v4_2 = new okhttp3.ResponseBody$Companion$asResponseBody$1(v1_1, v2, v0_2);
                    ((okhttp3.ResponseBody) p6).close();
                    return v4_2;
                } catch (Throwable v0_3) {
                    ((okhttp3.ResponseBody) p6).close();
                    throw v0_3;
                }
            case 2:
                return ((okhttp3.RequestBody) p6);
            case 3:
                return ((okhttp3.ResponseBody) p6);
            case 4:
                ((okhttp3.ResponseBody) p6).close();
                return h7.l.a;
            default:
                ((okhttp3.ResponseBody) p6).close();
                return 0;
        }
    }

    public boolean f(reflect.Method p1)
    {
        return 0;
    }
}
