package androidx.preference;
public class DropDownPreference extends androidx.preference.ListPreference {
    public final android.widget.ArrayAdapter p;

    public DropDownPreference(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5, 2130969044);
        android.widget.ArrayAdapter v5_2 = new android.widget.ArrayAdapter(p4, 17367049);
        super.p = v5_2;
        v5_2.clear();
        CharSequence[] v4_1 = super.n;
        if (v4_1 != null) {
            int v0_2 = v4_1.length;
            int v1 = 0;
            while (v1 < v0_2) {
                v5_2.add(v4_1[v1].toString());
                v1++;
            }
        }
        return;
    }

    public final void b()
    {
        android.widget.ArrayAdapter v0 = this.p;
        if (v0 != null) {
            v0.notifyDataSetChanged();
        }
        return;
    }
}
