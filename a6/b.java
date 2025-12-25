package a6;
public final synthetic class b implements a5.f {
    public final synthetic int a;
    public final synthetic a5.x b;

    public synthetic b(a5.x p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object e(a5.z p7)
    {
        switch (this.a) {
            case 0:
                return new a6.d(((android.content.Context) p7.a(android.content.Context)), ((q4.f) p7.a(q4.f)).f(), p7.c(a5.x.a(a6.e)), p7.f(l6.b), ((java.util.concurrent.Executor) p7.e(this.b)));
            case 1:
                return com.google.firebase.messaging.FirebaseMessagingRegistrar.a(this.b, p7);
            default:
                return com.google.firebase.remoteconfig.RemoteConfigRegistrar.a(this.b, p7);
        }
    }
}
