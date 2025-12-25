package okhttp3.logging;
public interface HttpLoggingInterceptor$Logger {
    public static final okhttp3.logging.HttpLoggingInterceptor$Logger a;

    static HttpLoggingInterceptor$Logger()
    {
        okhttp3.logging.HttpLoggingInterceptor$Logger.a = new okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DefaultLogger();
        return;
    }

    public abstract void a();
}
