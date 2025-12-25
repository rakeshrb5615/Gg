package okhttp3.internal.http2;
public final enum class ErrorCode extends java.lang.Enum {
    public static final okhttp3.internal.http2.ErrorCode$Companion b;
    public static final enum okhttp3.internal.http2.ErrorCode c;
    public static final enum okhttp3.internal.http2.ErrorCode d;
    public static final enum okhttp3.internal.http2.ErrorCode e;
    public static final enum okhttp3.internal.http2.ErrorCode f;
    public static final enum okhttp3.internal.http2.ErrorCode m;
    public static final enum okhttp3.internal.http2.ErrorCode n;
    public static final synthetic okhttp3.internal.http2.ErrorCode[] o;
    public final int a;

    static ErrorCode()
    {
        okhttp3.internal.http2.ErrorCode$Companion v0_1 = new okhttp3.internal.http2.ErrorCode("NO_ERROR", 0, 0);
        okhttp3.internal.http2.ErrorCode.c = v0_1;
        okhttp3.internal.http2.ErrorCode.d = new okhttp3.internal.http2.ErrorCode("PROTOCOL_ERROR", 1, 1);
        okhttp3.internal.http2.ErrorCode.e = new okhttp3.internal.http2.ErrorCode("INTERNAL_ERROR", 2, 2);
        okhttp3.internal.http2.ErrorCode.f = new okhttp3.internal.http2.ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
        new okhttp3.internal.http2.ErrorCode("SETTINGS_TIMEOUT", 4, 4);
        new okhttp3.internal.http2.ErrorCode("STREAM_CLOSED", 5, 5);
        new okhttp3.internal.http2.ErrorCode("FRAME_SIZE_ERROR", 6, 6);
        okhttp3.internal.http2.ErrorCode.m = new okhttp3.internal.http2.ErrorCode("REFUSED_STREAM", 7, 7);
        okhttp3.internal.http2.ErrorCode.n = new okhttp3.internal.http2.ErrorCode("CANCEL", 8, 8);
        new okhttp3.internal.http2.ErrorCode("COMPRESSION_ERROR", 9, 9);
        new okhttp3.internal.http2.ErrorCode("CONNECT_ERROR", 10, 10);
        new okhttp3.internal.http2.ErrorCode("ENHANCE_YOUR_CALM", 11, 11);
        new okhttp3.internal.http2.ErrorCode("INADEQUATE_SECURITY", 12, 12);
        okhttp3.internal.http2.ErrorCode$Companion v0_2 = new okhttp3.internal.http2.ErrorCode[] {v0_1, new okhttp3.internal.http2.ErrorCode("HTTP_1_1_REQUIRED", 13, 13)});
        okhttp3.internal.http2.ErrorCode.o = v0_2;
        c4.b.x(v0_2);
        okhttp3.internal.http2.ErrorCode.b = new okhttp3.internal.http2.ErrorCode$Companion(0);
        return;
    }

    public ErrorCode(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.a = p3;
        return;
    }

    public static okhttp3.internal.http2.ErrorCode valueOf(String p1)
    {
        return ((okhttp3.internal.http2.ErrorCode) Enum.valueOf(okhttp3.internal.http2.ErrorCode, p1));
    }

    public static okhttp3.internal.http2.ErrorCode[] values()
    {
        return ((okhttp3.internal.http2.ErrorCode[]) okhttp3.internal.http2.ErrorCode.o.clone());
    }
}
