package okhttp3;
public final class ResponseBody$BomAwareReader extends java.io.Reader {
    public final x8.i a;
    public final java.nio.charset.Charset b;
    public boolean c;
    public java.io.InputStreamReader d;

    public ResponseBody$BomAwareReader(x8.i p2, java.nio.charset.Charset p3)
    {
        kotlin.jvm.internal.j.e(p2, "source");
        kotlin.jvm.internal.j.e(p3, "charset");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final void close()
    {
        this.c = 1;
        x8.i v0_1 = this.d;
        if (v0_1 == null) {
            this.a.close();
            return;
        } else {
            v0_1.close();
            return;
        }
    }

    public final int read(char[] p5, int p6, int p7)
    {
        kotlin.jvm.internal.j.e(p5, "cbuf");
        if (this.c) {
            throw new java.io.IOException("Stream closed");
        } else {
            java.io.InputStreamReader v0_2 = this.d;
            if (v0_2 == null) {
                java.nio.charset.Charset v1_0 = this.a;
                v0_2 = new java.io.InputStreamReader(v1_0.w(), okhttp3.internal._UtilJvmKt.e(v1_0, this.b));
                this.d = v0_2;
            }
            return v0_2.read(p5, p6, p7);
        }
    }
}
