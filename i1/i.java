package i1;
public final class i implements android.text.TextWatcher {
    public final android.widget.EditText a;
    public i1.h b;
    public boolean c;

    public i(android.widget.EditText p1)
    {
        this.a = p1;
        this.c = 1;
        return;
    }

    public static void a(android.widget.EditText p4, int p5)
    {
        if ((p5 == 1) && ((p4 != null) && (p4.isAttachedToWindow()))) {
            int v3;
            android.text.Editable v4_1 = p4.getEditableText();
            int v5_2 = android.text.Selection.getSelectionStart(v4_1);
            int v0_1 = android.text.Selection.getSelectionEnd(v4_1);
            g1.i v1 = g1.i.a();
            if (v4_1 != null) {
                v1.getClass();
                v3 = v4_1.length();
            } else {
                v3 = 0;
            }
            v1.e(v4_1, 0, v3);
            if ((v5_2 < 0) || (v0_1 < 0)) {
                if (v5_2 < 0) {
                    if (v0_1 >= 0) {
                        android.text.Selection.setSelection(v4_1, v0_1);
                    }
                } else {
                    android.text.Selection.setSelection(v4_1, v5_2);
                    return;
                }
            } else {
                android.text.Selection.setSelection(v4_1, v5_2, v0_1);
                return;
            }
        }
        return;
    }

    public final void afterTextChanged(android.text.Editable p1)
    {
        return;
    }

    public final void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        return;
    }

    public final void onTextChanged(CharSequence p3, int p4, int p5, int p6)
    {
        android.widget.EditText v0 = this.a;
        if ((!v0.isInEditMode()) && ((this.c) && ((g1.i.k != null) && ((p5 <= p6) && ((p3 instanceof android.text.Spannable)))))) {
            g1.i v5_2 = g1.i.a().b();
            if (v5_2 != null) {
                if (v5_2 == 1) {
                    g1.i.a().e(((android.text.Spannable) p3), p4, (p6 + p4));
                    return;
                } else {
                    if (v5_2 != 3) {
                        return;
                    }
                }
            }
            android.text.Spannable v3_3 = g1.i.a();
            if (this.b == null) {
                this.b = new i1.h(v0);
            }
            v3_3.f(this.b);
        }
        return;
    }
}
