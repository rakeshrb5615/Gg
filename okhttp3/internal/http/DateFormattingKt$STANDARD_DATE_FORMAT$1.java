package okhttp3.internal.http;
public final class DateFormattingKt$STANDARD_DATE_FORMAT$1 extends java.lang.ThreadLocal {

    public DateFormattingKt$STANDARD_DATE_FORMAT$1()
    {
        return;
    }

    public final Object initialValue()
    {
        java.text.SimpleDateFormat v0_1 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss \'GMT\'", java.util.Locale.US);
        v0_1.setLenient(0);
        v0_1.setTimeZone(okhttp3.internal._UtilJvmKt.a);
        return v0_1;
    }
}
