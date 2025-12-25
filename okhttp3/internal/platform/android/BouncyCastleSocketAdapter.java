package okhttp3.internal.platform.android;
public final class BouncyCastleSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion a;
    public static final okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1 b;
    public static final boolean c;

    static BouncyCastleSocketAdapter()
    {
        okhttp3.internal.platform.android.BouncyCastleSocketAdapter.a = new okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion(0);
        okhttp3.internal.platform.android.BouncyCastleSocketAdapter.b = new okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1();
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", 0, okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion.getClassLoader());
        } catch (ClassNotFoundException) {
        }
        okhttp3.internal.platform.android.BouncyCastleSocketAdapter.c = 1;
        return;
    }

    public BouncyCastleSocketAdapter()
    {
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p1)
    {
        return 0;
    }

    public final boolean b()
    {
        return okhttp3.internal.platform.android.BouncyCastleSocketAdapter.c;
    }

    public final String c(javax.net.ssl.SSLSocket p2)
    {
        int v2_2 = ((org.bouncycastle.jsse.BCSSLSocket) p2).getApplicationProtocol();
        if ((v2_2 != 0) && (!v2_2.equals(""))) {
            return v2_2;
        } else {
            return 0;
        }
    }

    public final void d(javax.net.ssl.SSLSocket p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "protocols");
        if (this.a(p2)) {
            org.bouncycastle.jsse.BCSSLParameters v3_2 = ((org.bouncycastle.jsse.BCSSLSocket) p2).getParameters();
            okhttp3.internal.platform.Platform.a.getClass();
            String[] v0_1 = new String[0];
            v3_2.setApplicationProtocols(((String[]) okhttp3.internal.platform.Platform$Companion.a(p4).toArray(v0_1)));
            ((org.bouncycastle.jsse.BCSSLSocket) p2).setParameters(v3_2);
        }
        return;
    }
}
