package okhttp3.internal.platform.android;
public final class Android10SocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.Android10SocketAdapter$Companion a;

    static Android10SocketAdapter()
    {
        okhttp3.internal.platform.android.Android10SocketAdapter.a = new okhttp3.internal.platform.android.Android10SocketAdapter$Companion(0);
        return;
    }

    public Android10SocketAdapter()
    {
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p1)
    {
        return android.net.ssl.SSLSockets.isSupportedSocket(p1);
    }

    public final boolean b()
    {
        okhttp3.internal.platform.android.Android10SocketAdapter.a.getClass();
        okhttp3.internal.platform.Platform.a.getClass();
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        if (android.os.Build$VERSION.SDK_INT < 29) {
            return 0;
        } else {
            return 1;
        }
    }

    public final String c(javax.net.ssl.SSLSocket p2)
    {
        try {
            int v2_1 = p2.getApplicationProtocol();
        } catch (UnsupportedOperationException) {
            return 0;
        }
        if ((v2_1 != 0) && (!v2_1.equals(""))) {
            return v2_1;
        } else {
            return 0;
        }
    }

    public final void d(javax.net.ssl.SSLSocket p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "protocols");
        try {
            android.net.ssl.SSLSockets.setUseSessionTickets(p2, 1);
            java.io.IOException v3_4 = p2.getSSLParameters();
            okhttp3.internal.platform.Platform.a.getClass();
            String[] v0_1 = new String[0];
            v3_4.setApplicationProtocols(((String[]) okhttp3.internal.platform.Platform$Companion.a(p4).toArray(v0_1)));
            p2.setSSLParameters(v3_4);
            return;
        } catch (IllegalArgumentException v2_1) {
            throw new java.io.IOException("Android internal error", v2_1);
        }
    }
}
