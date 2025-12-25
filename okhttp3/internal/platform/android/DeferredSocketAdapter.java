package okhttp3.internal.platform.android;
public final class DeferredSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public final okhttp3.internal.platform.android.DeferredSocketAdapter$Factory a;
    public okhttp3.internal.platform.android.SocketAdapter b;

    public DeferredSocketAdapter(okhttp3.internal.platform.android.DeferredSocketAdapter$Factory p2)
    {
        kotlin.jvm.internal.j.e(p2, "socketAdapterFactory");
        this.a = p2;
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p2)
    {
        return this.a.a(p2);
    }

    public final boolean b()
    {
        return 1;
    }

    public final String c(javax.net.ssl.SSLSocket p2)
    {
        okhttp3.internal.platform.android.SocketAdapter v0 = this.e(p2);
        if (v0 == null) {
            return 0;
        } else {
            return v0.c(p2);
        }
    }

    public final void d(javax.net.ssl.SSLSocket p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "protocols");
        okhttp3.internal.platform.android.SocketAdapter v0_1 = this.e(p2);
        if (v0_1 != null) {
            v0_1.d(p2, p3, p4);
        }
        return;
    }

    public final declared_synchronized okhttp3.internal.platform.android.SocketAdapter e(javax.net.ssl.SSLSocket p2)
    {
        if ((this.b == null) && (this.a.a(p2))) {
            this.b = this.a.b(p2);
        }
        return this.b;
    }
}
