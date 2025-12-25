package f3;
public final class e implements java.lang.Runnable {
    public final android.view.View a;
    public final boolean b;
    public final synthetic com.google.android.material.behavior.SwipeDismissBehavior c;

    public e(com.google.android.material.behavior.SwipeDismissBehavior p1, android.view.View p2, boolean p3)
    {
        this.c = p1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final void run()
    {
        y3.e v0_0 = this.c;
        boolean v1_0 = v0_0.a;
        android.view.View v2 = this.a;
        if ((!v1_0) || (!v1_0.f())) {
            if (this.b) {
                y3.e v0_1 = v0_0.b;
                if (v0_1 != null) {
                    v0_1.a(v2);
                }
            }
            return;
        } else {
            v2.postOnAnimation(this);
            return;
        }
    }
}
