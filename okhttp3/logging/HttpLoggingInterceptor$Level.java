package okhttp3.logging;
public final enum class HttpLoggingInterceptor$Level extends java.lang.Enum {
    public static final enum okhttp3.logging.HttpLoggingInterceptor$Level a;
    public static final enum okhttp3.logging.HttpLoggingInterceptor$Level b;
    public static final enum okhttp3.logging.HttpLoggingInterceptor$Level c;
    public static final synthetic okhttp3.logging.HttpLoggingInterceptor$Level[] d;

    static HttpLoggingInterceptor$Level()
    {
        okhttp3.logging.HttpLoggingInterceptor$Level[] v0_2 = new okhttp3.logging.HttpLoggingInterceptor$Level("NONE", 0);
        okhttp3.logging.HttpLoggingInterceptor$Level.a = v0_2;
        okhttp3.logging.HttpLoggingInterceptor$Level v1_2 = new okhttp3.logging.HttpLoggingInterceptor$Level("BASIC", 1);
        okhttp3.logging.HttpLoggingInterceptor$Level v2_0 = new okhttp3.logging.HttpLoggingInterceptor$Level("HEADERS", 2);
        okhttp3.logging.HttpLoggingInterceptor$Level.b = v2_0;
        okhttp3.logging.HttpLoggingInterceptor$Level v3_2 = new okhttp3.logging.HttpLoggingInterceptor$Level("BODY", 3);
        okhttp3.logging.HttpLoggingInterceptor$Level.c = v3_2;
        okhttp3.logging.HttpLoggingInterceptor$Level[] v0_1 = new okhttp3.logging.HttpLoggingInterceptor$Level[] {v0_2, v1_2, v2_0, v3_2});
        okhttp3.logging.HttpLoggingInterceptor$Level.d = v0_1;
        c4.b.x(v0_1);
        return;
    }

    public static okhttp3.logging.HttpLoggingInterceptor$Level valueOf(String p1)
    {
        return ((okhttp3.logging.HttpLoggingInterceptor$Level) Enum.valueOf(okhttp3.logging.HttpLoggingInterceptor$Level, p1));
    }

    public static okhttp3.logging.HttpLoggingInterceptor$Level[] values()
    {
        return ((okhttp3.logging.HttpLoggingInterceptor$Level[]) okhttp3.logging.HttpLoggingInterceptor$Level.d.clone());
    }
}
