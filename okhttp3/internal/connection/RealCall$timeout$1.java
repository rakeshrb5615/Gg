package okhttp3.internal.connection;
public final class RealCall$timeout$1 extends x8.d {
    public final synthetic okhttp3.internal.connection.RealCall n;

    public RealCall$timeout$1(okhttp3.internal.connection.RealCall p1)
    {
        this.n = p1;
        return;
    }

    public final void k()
    {
        this.n.cancel();
        return;
    }
}
