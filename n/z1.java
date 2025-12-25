package n;
public final class z1 implements android.widget.AdapterView$OnItemSelectedListener {
    public final synthetic n.g2 a;

    public z1(n.g2 p1)
    {
        this.a = p1;
        return;
    }

    public final void onItemSelected(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
    {
        if (p3 != -1) {
            n.t1 v1_2 = this.a.c;
            if (v1_2 != null) {
                v1_2.setListSelectionHidden(0);
            }
        }
        return;
    }

    public final void onNothingSelected(android.widget.AdapterView p1)
    {
        return;
    }
}
