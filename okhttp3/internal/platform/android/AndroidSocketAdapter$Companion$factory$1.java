package okhttp3.internal.platform.android;
public final class AndroidSocketAdapter$Companion$factory$1 implements okhttp3.internal.platform.android.DeferredSocketAdapter$Factory {

    public final boolean a(javax.net.ssl.SSLSocket p2)
    {
        return b8.p.p0(p2.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    public final okhttp3.internal.platform.android.SocketAdapter b(javax.net.ssl.SSLSocket p4)
    {
        String v4_3 = p4.getClass();
        okhttp3.internal.platform.android.AndroidSocketAdapter.e.getClass();
        AssertionError v0_1 = v4_3;
        while (!v0_1.getSimpleName().equals("OpenSSLSocketImpl")) {
            v0_1 = v0_1.getSuperclass();
            if (v0_1 == null) {
                StringBuilder v1_1 = new StringBuilder("No OpenSSLSocketImpl superclass of socket of type ");
                v1_1.append(v4_3);
                throw new AssertionError(v1_1.toString());
            }
        }
        return new okhttp3.internal.platform.android.AndroidSocketAdapter(v0_1);
    }
}
