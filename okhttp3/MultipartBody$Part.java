package okhttp3;
public final class MultipartBody$Part {
    public static final okhttp3.MultipartBody$Part$Companion c;
    public final okhttp3.Headers a;
    public final okhttp3.RequestBody b;

    static MultipartBody$Part()
    {
        okhttp3.MultipartBody$Part.c = new okhttp3.MultipartBody$Part$Companion(0);
        return;
    }

    public MultipartBody$Part(okhttp3.Headers p1, okhttp3.RequestBody p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }
}
