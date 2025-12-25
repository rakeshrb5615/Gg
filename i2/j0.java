package i2;
public final class j0 implements android.view.Choreographer$FrameCallback {
    public final synthetic com.chilllive.chillwallpaperproject.MainActivity a;

    public j0(com.chilllive.chillwallpaperproject.MainActivity p1)
    {
        this.a = p1;
        return;
    }

    public final void doFrame(long p1)
    {
        android.view.Choreographer v1_1 = this.a.n;
        if (v1_1 != null) {
            v1_1.requestRender();
        }
        android.view.Choreographer.getInstance().postFrameCallback(this);
        return;
    }
}
