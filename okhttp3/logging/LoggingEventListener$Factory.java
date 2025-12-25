package okhttp3.logging;
public class LoggingEventListener$Factory implements okhttp3.EventListener$Factory {
    public final okhttp3.logging.HttpLoggingInterceptor$Logger a;

    public LoggingEventListener$Factory()
    {
        okhttp3.logging.HttpLoggingInterceptor$Logger v0 = okhttp3.logging.HttpLoggingInterceptor$Logger.a;
        kotlin.jvm.internal.j.e(v0, "logger");
        this.a = v0;
        return;
    }
}
