package com.google.android.material.datepicker;
public final synthetic class o implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic o(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p4)
    {
        switch (this.a) {
            case 0:
                ((com.google.android.material.datepicker.q) this.b).g();
                throw 0;
                break;
            case 1:
                ((com.chilllive.chillwallpaperproject.MainActivity) ((l2.d0) this.b).requireActivity()).onclickContact(p4);
                return;
            case 2:
                z3.k v4_9 = ((z3.d) this.b);
                android.text.Editable v0_8 = v4_9.i;
                if (v0_8 != null) {
                    android.text.Editable v0_1 = v0_8.getText();
                    if (v0_1 != null) {
                        v0_1.clear();
                    }
                    v4_9.p();
                }
                return;
            case 3:
                ((z3.k) this.b).t();
                return;
            default:
                z3.k v4_6 = ((z3.v) this.b);
                android.text.Editable v0_6 = v4_6.f;
                if (v0_6 != null) {
                    android.text.Editable v0_7 = v0_6.getSelectionEnd();
                    android.widget.EditText v1_0 = v4_6.f;
                    if ((v1_0 == null) || (!(v1_0.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod))) {
                        v4_6.f.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                    } else {
                        v4_6.f.setTransformationMethod(0);
                    }
                    if (v0_7 >= null) {
                        v4_6.f.setSelection(v0_7);
                    }
                    v4_6.p();
                }
                return;
        }
    }
}
