package z3;
public final class x implements android.text.TextWatcher {
    public int a;
    public final synthetic android.widget.EditText b;
    public final synthetic com.google.android.material.textfield.TextInputLayout c;

    public x(com.google.android.material.textfield.TextInputLayout p1, android.widget.EditText p2)
    {
        this.c = p1;
        this.b = p2;
        this.a = p2.getLineCount();
        return;
    }

    public final void afterTextChanged(android.text.Editable p4)
    {
        int v0_0 = this.c;
        v0_0.w((v0_0.H0 ^ 1), 0);
        if (v0_0.r) {
            v0_0.p(p4);
        }
        if (v0_0.z) {
            v0_0.x(p4);
        }
        android.widget.EditText v4_1 = this.b;
        int v1_1 = v4_1.getLineCount();
        int v2_0 = this.a;
        if (v1_1 != v2_0) {
            if (v1_1 < v2_0) {
                int v0_1 = v0_0.A0;
                if (v4_1.getMinimumHeight() != v0_1) {
                    v4_1.setMinimumHeight(v0_1);
                }
            }
            this.a = v1_1;
        }
        return;
    }

    public final void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        return;
    }

    public final void onTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        return;
    }
}
