package y8;
public final class i extends x8.d {
    public final java.net.Socket n;

    public i(java.net.Socket p1)
    {
        this.n = p1;
        return;
    }

    public final java.io.IOException j(java.io.IOException p3)
    {
        java.net.SocketTimeoutException v0_1 = new java.net.SocketTimeoutException("timeout");
        if (p3 != null) {
            v0_1.initCause(p3);
        }
        return v0_1;
    }

    public final void k()
    {
        java.net.Socket v1 = this.n;
        try {
            v1.close();
            return;
        } catch (AssertionError v2_0) {
            StringBuilder v5_3 = new StringBuilder("Failed to close timed out socket ");
            v5_3.append(v1);
            y8.m.a.log(java.util.logging.Level.WARNING, v5_3.toString(), v2_0);
            return;
        } catch (AssertionError v2_1) {
            if (!y8.m.a(v2_1)) {
                throw v2_1;
            } else {
                StringBuilder v5_1 = new StringBuilder("Failed to close timed out socket ");
                v5_1.append(v1);
                y8.m.a.log(java.util.logging.Level.WARNING, v5_1.toString(), v2_1);
                return;
            }
        }
    }
}
