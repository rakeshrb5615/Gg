package okhttp3.internal.proxy;
public final class NullProxySelector extends java.net.ProxySelector {
    public static final okhttp3.internal.proxy.NullProxySelector a;

    static NullProxySelector()
    {
        okhttp3.internal.proxy.NullProxySelector.a = new okhttp3.internal.proxy.NullProxySelector();
        return;
    }

    private NullProxySelector()
    {
        return;
    }

    public final void connectFailed(java.net.URI p1, java.net.SocketAddress p2, java.io.IOException p3)
    {
        return;
    }

    public final java.util.List select(java.net.URI p2)
    {
        if (p2 == null) {
            throw new IllegalArgumentException("uri must not be null");
        } else {
            return a.a.G(java.net.Proxy.NO_PROXY);
        }
    }
}
