package l2;
public final synthetic class j implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic com.google.android.material.materialswitch.MaterialSwitch b;

    public synthetic j(com.google.android.material.materialswitch.MaterialSwitch p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p1)
    {
        switch (this.a) {
            case 0:
                this.b.performClick();
                return;
            case 1:
                this.b.performClick();
                return;
            default:
                this.b.toggle();
                return;
        }
    }
}
