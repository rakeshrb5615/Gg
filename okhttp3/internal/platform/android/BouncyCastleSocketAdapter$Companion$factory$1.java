package okhttp3.internal.platform.android;
public final class BouncyCastleSocketAdapter$Companion$factory$1 implements okhttp3.internal.platform.android.DeferredSocketAdapter$Factory {

    public BouncyCastleSocketAdapter$Companion$factory$1()
    {
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p1)
    {
        okhttp3.internal.platform.android.BouncyCastleSocketAdapter.a.getClass();
        return 0;
    }

    public final okhttp3.internal.platform.android.SocketAdapter b(javax.net.ssl.SSLSocket p1)
    {
        return new okhttp3.internal.platform.android.BouncyCastleSocketAdapter();
    }
}
