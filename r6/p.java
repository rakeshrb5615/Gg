package r6;
public final synthetic class p implements u7.a {
    public final synthetic int a;
    public final synthetic android.content.Context b;

    public synthetic p(android.content.Context p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                java.io.File v0_3 = x1.b.a(this.b, "firebaseSessions/sessionConfigsDataStore.data");
                r6.q.c(v0_3);
                return v0_3;
            default:
                java.io.File v0_1 = x1.b.a(this.b, "firebaseSessions/sessionDataStore.data");
                r6.q.c(v0_1);
                return v0_1;
        }
    }
}
