package l2;
public final synthetic class y implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic i2.m b;
    public final synthetic String c;

    public synthetic y(i2.m p1, String p2, int p3)
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
                android.widget.Toast v0_10 = ((l2.a0) this.b.b).a;
                String v1_3 = new StringBuilder("Error: ");
                v1_3.append(this.c);
                android.widget.Toast.makeText(v0_10, v1_3.toString(), 1).show();
                return;
            default:
                android.widget.Toast.makeText(((l2.a0) this.b.b).a, this.c, 0).show();
                return;
        }
    }
}
