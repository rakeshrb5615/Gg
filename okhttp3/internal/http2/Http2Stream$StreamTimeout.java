package okhttp3.internal.http2;
public final class Http2Stream$StreamTimeout extends x8.d {
    public final synthetic okhttp3.internal.http2.Http2Stream n;

    public Http2Stream$StreamTimeout(okhttp3.internal.http2.Http2Stream p1)
    {
        this.n = p1;
        return;
    }

    public final java.io.IOException j(java.io.IOException p2)
    {
        return new java.net.SocketTimeoutException("timeout");
    }

    public final void k()
    {
        this.n.g(okhttp3.internal.http2.ErrorCode.n);
        int v0_3 = this.n.b;
        try {
            a8.j v3_6 = v0_3.s;
        } catch (okhttp3.internal.concurrent.TaskQueue v1_4) {
            throw v1_4;
        }
        if (v0_3.t >= v3_6) {
            v0_3.s = (v3_6 + 1);
            v0_3.u = (System.nanoTime() + ((long) 1000000000));
            okhttp3.internal.concurrent.TaskQueue.b(v0_3.n, v1.a.n(new StringBuilder(), v0_3.c, " ping"), new a8.j(v0_3, 5), 6);
            return;
        } else {
            return;
        }
    }

    public final void l()
    {
        if (this.i()) {
            throw this.j(0);
        } else {
            return;
        }
    }
}
