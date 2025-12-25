package okhttp3.internal.ws;
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader$FrameCallback, okhttp3.internal.concurrent.Lockable {
    public static final java.util.List a;

    static RealWebSocket()
    {
        new okhttp3.internal.ws.RealWebSocket$Companion(0);
        okhttp3.internal.ws.RealWebSocket.a = a.a.G(okhttp3.Protocol.d);
        return;
    }
}
