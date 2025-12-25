package okhttp3.internal.connection;
public abstract class ConnectionListener {
    public static final okhttp3.internal.connection.ConnectionListener$Companion a;
    public static final okhttp3.internal.connection.ConnectionListener$Companion$NONE$1 b;

    static ConnectionListener()
    {
        okhttp3.internal.connection.ConnectionListener.a = new okhttp3.internal.connection.ConnectionListener$Companion(0);
        okhttp3.internal.connection.ConnectionListener.b = new okhttp3.internal.connection.ConnectionListener$Companion$NONE$1();
        return;
    }

    public ConnectionListener()
    {
        return;
    }
}
