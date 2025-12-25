package androidx.fragment.app;
public final synthetic class x1 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic androidx.fragment.app.n b;
    public final synthetic androidx.fragment.app.y1 c;

    public synthetic x1(androidx.fragment.app.n p1, androidx.fragment.app.y1 p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                android.view.View v1_2 = this.c;
                if (this.b.b.contains(v1_2)) {
                    int v0_6 = v1_2.a;
                    android.view.View v1_0 = v1_2.c.mView;
                    kotlin.jvm.internal.j.d(v1_0, "operation.fragment.mView");
                    v1.a.a(v1_0, v0_6);
                }
                return;
            default:
                int v0_1 = this.b;
                String v2_1 = this.c;
                v0_1.b.remove(v2_1);
                v0_1.c.remove(v2_1);
                return;
        }
    }
}
