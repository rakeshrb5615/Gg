package i1;
public final class h extends g1.g implements java.lang.Runnable {
    public final ref.WeakReference a;

    public h(android.widget.EditText p2)
    {
        this.a = new ref.WeakReference(p2);
        return;
    }

    public final void b()
    {
        android.os.Handler v0_2 = ((android.widget.EditText) this.a.get());
        if (v0_2 != null) {
            android.os.Handler v0_3 = v0_2.getHandler();
            if (v0_3 != null) {
                v0_3.post(this);
                return;
            }
        }
        return;
    }

    public final void run()
    {
        i1.i.a(((android.widget.EditText) this.a.get()), 1);
        return;
    }
}
