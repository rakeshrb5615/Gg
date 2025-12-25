package s1;
public abstract class l extends s1.e {
    public final android.window.OnBackInvokedDispatcher c;
    public final int d;
    public final android.window.OnBackInvokedCallback e;
    public boolean f;

    public l(android.window.OnBackInvokedDispatcher p1, int p2)
    {
        s1.k v1_1;
        this.c = p1;
        this.d = p2;
        if (android.os.Build$VERSION.SDK_INT != 33) {
            v1_1 = new s1.k(this);
        } else {
            v1_1 = new h.v(this, 3);
        }
        this.e = v1_1;
        return;
    }

    public final void b(boolean p3)
    {
        if ((p3 == 0) || (this.f)) {
            if ((p3 == 0) && (this.f)) {
                this.c.unregisterOnBackInvokedCallback(this.e);
                this.f = 0;
            }
            return;
        } else {
            this.c.registerOnBackInvokedCallback(this.d, this.e);
            this.f = 1;
            return;
        }
    }
}
