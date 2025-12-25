package l2;
public final synthetic class z implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic k2.c b;
    public final synthetic String c;

    public synthetic z(k2.c p1, String p2, int p3)
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
                android.widget.Toast v0_11 = ((l2.a0) this.b.c).a;
                String v1_5 = new StringBuilder("Error: ");
                v1_5.append(this.c);
                android.widget.Toast.makeText(v0_11, v1_5.toString(), 1).show();
                return;
            default:
                android.widget.Toast v0_5 = ((l2.a0) this.b.c);
                android.widget.Toast.makeText(v0_5.a, v0_5.getString(2131951966), 0).show();
                v0_5.v.edit().putString("lastLocation", this.c).apply();
                return;
        }
    }
}
