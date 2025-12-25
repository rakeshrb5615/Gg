package okhttp3;
final class Dns$Companion$DnsSystem implements okhttp3.Dns {

    public Dns$Companion$DnsSystem()
    {
        return;
    }

    public final java.util.List a(String p4)
    {
        kotlin.jvm.internal.j.e(p4, "hostname");
        try {
            NullPointerException v0_1 = java.net.InetAddress.getAllByName(p4);
            kotlin.jvm.internal.j.d(v0_1, "getAllByName(...)");
            String v4_2 = i7.h.i0(v0_1);
            return v4_2;
        } catch (NullPointerException v0_2) {
            java.net.UnknownHostException v1_1 = new java.net.UnknownHostException("Broken system behaviour for dns lookup of ".concat(v4_2));
            v1_1.initCause(v0_2);
            throw v1_1;
        }
    }
}
