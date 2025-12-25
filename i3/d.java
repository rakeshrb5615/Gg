package i3;
public final synthetic class d implements java.util.Comparator {
    public final synthetic com.google.android.material.button.MaterialButtonToggleGroup a;

    public synthetic d(com.google.android.material.button.MaterialButtonToggleGroup p1)
    {
        this.a = p1;
        return;
    }

    public final int compare(Object p3, Object p4)
    {
        com.google.android.material.button.MaterialButtonToggleGroup v0_6 = Boolean.valueOf(((com.google.android.material.button.MaterialButton) p3).u).compareTo(Boolean.valueOf(((com.google.android.material.button.MaterialButton) p4).u));
        if (v0_6 == null) {
            com.google.android.material.button.MaterialButtonToggleGroup v0_3 = Boolean.valueOf(((com.google.android.material.button.MaterialButton) p3).isPressed()).compareTo(Boolean.valueOf(((com.google.android.material.button.MaterialButton) p4).isPressed()));
            if (v0_3 == null) {
                com.google.android.material.button.MaterialButtonToggleGroup v0_4 = this.a;
                return Integer.compare(v0_4.indexOfChild(((com.google.android.material.button.MaterialButton) p3)), v0_4.indexOfChild(((com.google.android.material.button.MaterialButton) p4)));
            } else {
                return v0_3;
            }
        } else {
            return v0_6;
        }
    }
}
