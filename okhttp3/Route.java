package okhttp3;
public final class Route {
    public final okhttp3.Address a;
    public final java.net.Proxy b;
    public final java.net.InetSocketAddress c;

    public Route(okhttp3.Address p2, java.net.Proxy p3, java.net.InetSocketAddress p4)
    {
        kotlin.jvm.internal.j.e(p4, "socketAddress");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof okhttp3.Route)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Route) p3).a, this.a)) || ((!kotlin.jvm.internal.j.a(((okhttp3.Route) p3).b, this.b)) || (!kotlin.jvm.internal.j.a(((okhttp3.Route) p3).c, this.c))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31));
    }

    public final String toString()
    {
        String v4_1;
        String v0_1 = new StringBuilder();
        int v1_1 = this.a.h;
        java.net.Proxy v2_0 = v1_1.d;
        java.net.InetSocketAddress v3 = this.c;
        String v4_2 = v3.getAddress();
        if (v4_2 == null) {
            v4_1 = 0;
        } else {
            String v4_0 = v4_2.getHostAddress();
            if (v4_0 == null) {
            } else {
                v4_1 = okhttp3.internal._HostnamesCommonKt.b(v4_0);
            }
        }
        if (!b8.i.r0(v2_0, 58)) {
            v0_1.append(v2_0);
        } else {
            v0_1.append("[");
            v0_1.append(v2_0);
            v0_1.append("]");
        }
        if ((v1_1.e != v3.getPort()) || (v2_0.equals(v4_1))) {
            v0_1.append(":");
            v0_1.append(v1_1.e);
        }
        if (!v2_0.equals(v4_1)) {
            if (!this.b.equals(java.net.Proxy.NO_PROXY)) {
                v0_1.append(" via proxy ");
            } else {
                v0_1.append(" at ");
            }
            if (v4_1 != null) {
                if (!b8.i.r0(v4_1, 58)) {
                    v0_1.append(v4_1);
                } else {
                    v0_1.append("[");
                    v0_1.append(v4_1);
                    v0_1.append("]");
                }
            } else {
                v0_1.append("<unresolved>");
            }
            v0_1.append(":");
            v0_1.append(v3.getPort());
        }
        return v0_1.toString();
    }
}
