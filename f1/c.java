package f1;
public final synthetic class c implements android.view.Choreographer$FrameCallback {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic c(androidx.profileinstaller.ProfileInstallerInitializer p1, android.content.Context p2)
    {
        this.a = 1;
        this.b = p2;
        return;
    }

    public synthetic c(Runnable p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public final void doFrame(long p5)
    {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            default:
                android.os.Handler v6_1;
                Runnable v5_4 = ((android.content.Context) this.b);
                if (android.os.Build$VERSION.SDK_INT < 28) {
                    v6_1 = new android.os.Handler(android.os.Looper.getMainLooper());
                } else {
                    v6_1 = y1.d.a(android.os.Looper.getMainLooper());
                }
                v6_1.postDelayed(new h.k(v5_4, 2), ((long) (new java.util.Random().nextInt(Math.max(1000, 1)) + 5000)));
                return;
        }
    }
}
