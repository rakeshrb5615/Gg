package okhttp3.internal.platform.android;
public final class ConscryptSocketAdapter$Companion$factory$1 implements okhttp3.internal.platform.android.DeferredSocketAdapter$Factory {

    public ConscryptSocketAdapter$Companion$factory$1()
    {
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p2)
    {
        okhttp3.internal.platform.android.ConscryptSocketAdapter.a.getClass();
        if ((!okhttp3.internal.platform.android.ConscryptSocketAdapter.c) || (!org.conscrypt.Conscrypt.isConscrypt(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final okhttp3.internal.platform.android.SocketAdapter b(javax.net.ssl.SSLSocket p1)
    {
        return new okhttp3.internal.platform.android.ConscryptSocketAdapter();
    }
}
