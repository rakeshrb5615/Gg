package l3;
public final synthetic class a implements android.widget.CompoundButton$OnCheckedChangeListener {
    public final synthetic com.google.android.material.chip.Chip a;

    public synthetic a(com.google.android.material.chip.Chip p1)
    {
        this.a = p1;
        return;
    }

    public final void onCheckedChanged(android.widget.CompoundButton p2, boolean p3)
    {
        android.widget.CompoundButton$OnCheckedChangeListener v0_1 = this.a.o;
        if (v0_1 != null) {
            v0_1.onCheckedChanged(p2, p3);
        }
        return;
    }
}
