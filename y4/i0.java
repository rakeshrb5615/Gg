package y4;
public final class i0 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic com.google.firebase.auth.FirebaseAuth b;

    public i0(com.google.firebase.auth.FirebaseAuth p2)
    {
        this.a = 1;
        this.b = p2;
        return;
    }

    public i0(com.google.firebase.auth.FirebaseAuth p1, h6.b p2)
    {
        this.a = 0;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                ClassCastException v0_5 = this.b;
                boolean v1_3 = v0_5.d.iterator();
                if (v1_3.hasNext()) {
                    throw v1.a.e(v1_3);
                } else {
                    ClassCastException v0_3 = v0_5.b.iterator();
                    if (v0_3.hasNext()) {
                        throw v1.a.e(v0_3);
                    } else {
                        return;
                    }
                }
            default:
                ClassCastException v0_8 = this.b.c.iterator();
                if (v0_8.hasNext()) {
                    throw v1.a.e(v0_8);
                } else {
                    return;
                }
        }
    }
}
