package androidx.profileinstaller;
public class ProfileInstallerInitializer implements d2.b {

    public ProfileInstallerInitializer()
    {
        return;
    }

    public final java.util.List a()
    {
        return java.util.Collections.EMPTY_LIST;
    }

    public final Object b(android.content.Context p3)
    {
        android.view.Choreographer.getInstance().postFrameCallback(new f1.c(this, p3.getApplicationContext()));
        return new v3.f();
    }
}
