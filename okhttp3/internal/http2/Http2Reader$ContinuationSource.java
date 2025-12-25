package okhttp3.internal.http2;
public final class Http2Reader$ContinuationSource implements x8.h0 {
    public final x8.i a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public Http2Reader$ContinuationSource(x8.i p2)
    {
        kotlin.jvm.internal.j.e(p2, "source");
        this.a = p2;
        return;
    }

    public final x8.j0 b()
    {
        return this.a.b();
    }

    public final void close()
    {
        return;
    }

    public final long t(x8.g p9, long p10)
    {
        kotlin.jvm.internal.j.e(p9, "sink");
        do {
            int v0_3 = this.e;
            int v3_0 = this.a;
            if (v0_3 != 0) {
                java.io.IOException v9_1 = v3_0.t(p9, Math.min(p10, ((long) v0_3)));
                if (v9_1 != -1) {
                    this.e = (this.e - ((int) v9_1));
                    return v9_1;
                }
            } else {
                v3_0.skip(((long) this.f));
                this.f = 0;
                if ((this.c & 4) == 0) {
                    int v0_7 = this.d;
                    int v1_0 = okhttp3.internal._UtilCommonKt.l(v3_0);
                    this.e = v1_0;
                    this.b = v1_0;
                    int v1_3 = (v3_0.readByte() & 255);
                    this.c = (v3_0.readByte() & 255);
                    okhttp3.internal.http2.Http2Reader.d.getClass();
                    int v2_3 = okhttp3.internal.http2.Http2Reader.e;
                    if (v2_3.isLoggable(java.util.logging.Level.FINE)) {
                        int v5 = this.d;
                        int v6 = this.b;
                        int v7 = this.c;
                        okhttp3.internal.http2.Http2.a.getClass();
                        v2_3.fine(okhttp3.internal.http2.Http2.b(1, v5, v6, v1_3, v7));
                    }
                    int v2_5 = (v3_0.readInt() & 2147483647);
                    this.d = v2_5;
                    if (v1_3 != 9) {
                        String v10_2 = new StringBuilder();
                        v10_2.append(v1_3);
                        v10_2.append(" != TYPE_CONTINUATION");
                        throw new java.io.IOException(v10_2.toString());
                    } else {
                    }
                }
            }
            return -1;
        } while(v2_5 != v0_7);
        throw new java.io.IOException("TYPE_CONTINUATION streamId changed");
    }
}
