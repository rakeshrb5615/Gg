package l2;
public final synthetic class m implements android.content.DialogInterface$OnCancelListener {
    public final synthetic l2.a0 a;
    public final synthetic com.google.android.material.materialswitch.MaterialSwitch b;

    public synthetic m(l2.a0 p1, com.google.android.material.materialswitch.MaterialSwitch p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onCancel(android.content.DialogInterface p2)
    {
        p2 = this.a;
        if ((!p2.R1.getText().toString().isEmpty()) && ((!p2.S1.getText().toString().isEmpty()) || (!p2.T1.getText().toString().isEmpty()))) {
            return;
        } else {
            p2.t(this.b);
            return;
        }
    }
}
