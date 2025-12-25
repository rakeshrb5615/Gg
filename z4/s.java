package z4;
public final class s {
    public final z4.i a;

    public s(q4.f p6)
    {
        p6.a();
        z4.u v0_0 = p6.a;
        z4.i v1_1 = new z4.i();
        com.google.android.gms.internal.firebase-auth-api.zze v3_4 = new Object[0];
        z4.i.e.v("Initializing TokenRefresher", v3_4);
        com.google.android.gms.common.api.internal.BackgroundDetector v6_2 = ((q4.f) com.google.android.gms.common.internal.Preconditions.checkNotNull(p6));
        b5.l v2_1 = new android.os.HandlerThread("TokenRefresher", 10);
        v2_1.start();
        v1_1.c = new com.google.android.gms.internal.firebase-auth-api.zze(v2_1.getLooper());
        v6_2.a();
        v1_1.d = new b5.l(v1_1, v6_2.b);
        this.a = v1_1;
        com.google.android.gms.common.api.internal.BackgroundDetector.initialize(((android.app.Application) v0_0.getApplicationContext()));
        com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new z4.u(this));
        return;
    }
}
