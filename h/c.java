package h;
public final class c extends android.os.Handler {
    public final synthetic int a;
    public Object b;

    public synthetic c()
    {
        this.a = 0;
        return;
    }

    public c(r1.a p2, android.os.Looper p3)
    {
        this.a = 1;
        this.b = p2;
        super(p3);
        return;
    }

    public final void handleMessage(android.os.Message p5)
    {
        switch (this.a) {
            case 0:
                java.util.HashMap v0_2 = p5.what;
                if ((v0_2 == -3) || ((v0_2 == -2) || (v0_2 == -1))) {
                    ((android.content.DialogInterface$OnClickListener) p5.obj).onClick(((android.content.DialogInterface) ((ref.WeakReference) this.b).get()), p5.what);
                } else {
                    if (v0_2 == 1) {
                        ((android.content.DialogInterface) p5.obj).dismiss();
                    }
                }
                return;
            default:
                if (p5.what == 1) {
                    int v5_5 = ((r1.a) this.b);
                    do {
                        int v1_8 = v5_5.d.size();
                        if (v1_8 > 0) {
                            c4.b[] v2 = new c4.b[v1_8];
                            v5_5.d.toArray(v2);
                            v5_5.d.clear();
                        } else {
                        }
                    } while(v1_8 > 0);
                    throw 0;
                } else {
                    super.handleMessage(p5);
                }
                return;
        }
    }
}
