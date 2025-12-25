package a6;
public final class d implements a6.f, a6.g {
    public final a5.r a;
    public final android.content.Context b;
    public final c6.b c;
    public final java.util.Set d;
    public final java.util.concurrent.Executor e;

    public d(android.content.Context p4, String p5, java.util.Set p6, c6.b p7, java.util.concurrent.Executor p8)
    {
        a5.r v0_1 = new a5.r(new a5.h(1, p4, p5));
        this.a = v0_1;
        this.d = p6;
        this.e = p8;
        this.c = p7;
        this.b = p4;
        return;
    }

    public final void a()
    {
        if (this.d.size() > 0) {
            if (((android.os.UserManager) this.b.getSystemService(android.os.UserManager)).isUserUnlocked()) {
                com.google.android.gms.tasks.Tasks.call(this.e, new a6.c(this, 1));
                return;
            } else {
                com.google.android.gms.tasks.Tasks.forResult(0);
                return;
            }
        } else {
            com.google.android.gms.tasks.Tasks.forResult(0);
            return;
        }
    }
}
