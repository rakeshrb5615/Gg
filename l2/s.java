package l2;
public final synthetic class s implements android.widget.CompoundButton$OnCheckedChangeListener {
    public final synthetic int a;
    public final synthetic l2.a0 b;
    public final synthetic String c;

    public synthetic s(l2.a0 p1, String p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void onCheckedChanged(android.widget.CompoundButton p2, boolean p3)
    {
        switch (this.a) {
            case 0:
                this.b.v.edit().putBoolean(this.c, p3).apply();
                return;
            default:
                this.b.v.edit().putBoolean(this.c, p3).apply();
                return;
        }
    }
}
