package g5;
public final class m implements java.util.concurrent.Callable {
    public final synthetic long a;
    public final synthetic g5.n b;

    public m(g5.n p1, long p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final Object call()
    {
        int v0_1 = new android.os.Bundle();
        v0_1.putInt("fatal", 1);
        v0_1.putLong("timestamp", this.a);
        this.b.k.g(v0_1);
        return 0;
    }
}
