package android.support.v4.app;
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {

    public RemoteActionCompatParcelizer()
    {
        return;
    }

    public static androidx.core.app.RemoteActionCompat read(h2.a p0)
    {
        return androidx.core.app.RemoteActionCompatParcelizer.read(p0);
    }

    public static void write(androidx.core.app.RemoteActionCompat p0, h2.a p1)
    {
        androidx.core.app.RemoteActionCompatParcelizer.write(p0, p1);
        return;
    }
}
