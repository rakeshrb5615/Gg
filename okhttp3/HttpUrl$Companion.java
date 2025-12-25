package okhttp3;
public final class HttpUrl$Companion {

    private HttpUrl$Companion()
    {
        return;
    }

    public synthetic HttpUrl$Companion(int p1)
    {
        return;
    }

    public static int a(String p1)
    {
        kotlin.jvm.internal.j.e(p1, "scheme");
        if (!p1.equals("http")) {
            if (!p1.equals("https")) {
                return -1;
            } else {
                return 443;
            }
        } else {
            return 80;
        }
    }
}
