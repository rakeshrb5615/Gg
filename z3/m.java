package z3;
public final class m {
    public final synthetic z3.o a;

    public m(z3.o p1)
    {
        this.a = p1;
        return;
    }

    public final void a(com.google.android.material.textfield.TextInputLayout p5)
    {
        z3.o v0 = this.a;
        android.widget.EditText v1_0 = v0.B;
        if (v0.y != p5.getEditText()) {
            android.widget.EditText v2_3 = v0.y;
            if (v2_3 != null) {
                v2_3.removeTextChangedListener(v1_0);
                if (v0.y.getOnFocusChangeListener() == v0.b().e()) {
                    v0.y.setOnFocusChangeListener(0);
                }
            }
            z3.p v5_1 = p5.getEditText();
            v0.y = v5_1;
            if (v5_1 != null) {
                v5_1.addTextChangedListener(v1_0);
            }
            v0.b().l(v0.y);
            v0.j(v0.b());
            return;
        } else {
            return;
        }
    }
}
