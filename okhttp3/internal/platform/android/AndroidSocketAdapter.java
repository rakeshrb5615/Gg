package okhttp3.internal.platform.android;
public class AndroidSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter$Companion e;
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1 f;
    public final Class a;
    public final reflect.Method b;
    public final reflect.Method c;
    public final reflect.Method d;

    static AndroidSocketAdapter()
    {
        okhttp3.internal.platform.android.AndroidSocketAdapter.e = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion(0);
        okhttp3.internal.platform.android.AndroidSocketAdapter.f = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1();
        return;
    }

    public AndroidSocketAdapter(Class p3)
    {
        this.a = p3;
        Class[] v0_8 = p3.getDeclaredMethod("setUseSessionTickets", new Class[] {Boolean.TYPE}));
        kotlin.jvm.internal.j.d(v0_8, "getDeclaredMethod(...)");
        this.b = v0_8;
        p3.getMethod("setHostname", new Class[] {String}));
        this.c = p3.getMethod("getAlpnSelectedProtocol", 0);
        this.d = p3.getMethod("setAlpnProtocols", new Class[] {byte[]}));
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p2)
    {
        return this.a.isInstance(p2);
    }

    public final boolean b()
    {
        okhttp3.internal.platform.AndroidPlatform.f.getClass();
        return okhttp3.internal.platform.AndroidPlatform.h;
    }

    public final String c(javax.net.ssl.SSLSocket p4)
    {
        if (this.a.isInstance(p4)) {
            try {
                reflect.InvocationTargetException v4_4 = ((byte[]) this.c.invoke(p4, 0));
            } catch (reflect.InvocationTargetException v4_2) {
                throw new AssertionError(v4_2);
            } catch (reflect.InvocationTargetException v4_1) {
                AssertionError v0_1 = v4_1.getCause();
                if ((v0_1 instanceof NullPointerException)) {
                    if (kotlin.jvm.internal.j.a(((NullPointerException) v0_1).getMessage(), "ssl == null")) {
                        return 0;
                    }
                }
                throw new AssertionError(v4_1);
            }
            if (v4_4 != null) {
                return new String(v4_4, b8.a.a);
            }
        }
        return 0;
    }

    public final void d(javax.net.ssl.SSLSocket p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "protocols");
        if (!this.a.isInstance(p2)) {
            return;
        } else {
            try {
                this.b.invoke(p2, new Object[] {Boolean.TRUE}));
                AssertionError v3_1 = this.d;
                okhttp3.internal.platform.Platform.a.getClass();
                v3_1.invoke(p2, new Object[] {okhttp3.internal.platform.Platform$Companion.b(p4)}));
                return;
            } catch (reflect.InvocationTargetException v2_2) {
                throw new AssertionError(v2_2);
            } catch (reflect.InvocationTargetException v2_1) {
                throw new AssertionError(v2_1);
            }
        }
    }
}
