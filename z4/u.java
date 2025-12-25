package z4;
public final class u implements com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener {
    public final synthetic z4.s a;

    public u(z4.s p1)
    {
        this.a = p1;
        return;
    }

    public final void onBackgroundStateChanged(boolean p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zze v0_0 = this.a;
        if (p2 == null) {
            v0_0.getClass();
            v0_0.getClass();
            return;
        } else {
            v0_0.getClass();
            b5.l v2_1 = v0_0.a;
            v2_1.c.removeCallbacks(v2_1.d);
            return;
        }
    }
}
