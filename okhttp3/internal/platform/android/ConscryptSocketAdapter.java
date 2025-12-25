package okhttp3.internal.platform.android;
public final class ConscryptSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion a;
    public static final okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1 b;
    public static final boolean c;

    static ConscryptSocketAdapter()
    {
        int v1 = 0;
        okhttp3.internal.platform.android.ConscryptSocketAdapter.a = new okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion(0);
        okhttp3.internal.platform.android.ConscryptSocketAdapter.b = new okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1();
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", 0, okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion.getClassLoader());
        } catch (ClassNotFoundException) {
            okhttp3.internal.platform.android.ConscryptSocketAdapter.c = v1;
            return;
        }
        if ((!org.conscrypt.Conscrypt.isAvailable()) || (!okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion.a())) {
            okhttp3.internal.platform.android.ConscryptSocketAdapter.c = v1;
            return;
        } else {
            v1 = 1;
            okhttp3.internal.platform.android.ConscryptSocketAdapter.c = v1;
            return;
        }
    }

    public ConscryptSocketAdapter()
    {
        return;
    }

    public final boolean a(javax.net.ssl.SSLSocket p1)
    {
        return org.conscrypt.Conscrypt.isConscrypt(p1);
    }

    public final boolean b()
    {
        return okhttp3.internal.platform.android.ConscryptSocketAdapter.c;
    }

    public final String c(javax.net.ssl.SSLSocket p2)
    {
        if (!this.a(p2)) {
            return 0;
        } else {
            return org.conscrypt.Conscrypt.getApplicationProtocol(p2);
        }
    }

    public final void d(javax.net.ssl.SSLSocket p1, String p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.e(p3, "protocols");
        if (this.a(p1)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(p1, 1);
            okhttp3.internal.platform.Platform.a.getClass();
            String[] v3_2 = new String[0];
            org.conscrypt.Conscrypt.setApplicationProtocols(p1, ((String[]) okhttp3.internal.platform.Platform$Companion.a(p3).toArray(v3_2)));
        }
        return;
    }
}
