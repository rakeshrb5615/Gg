package l2;
public final synthetic class q implements android.widget.TextView$OnEditorActionListener {
    public final synthetic l2.a0 a;
    public final synthetic android.widget.EditText b;

    public synthetic q(l2.a0 p1, android.widget.EditText p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean onEditorAction(android.widget.TextView p3, int p4, android.view.KeyEvent p5)
    {
        l2.a0 v0 = this.a;
        if (p4 != 6) {
            v0.getClass();
            return 0;
        } else {
            android.view.inputmethod.InputMethodManager v4_1 = ((android.view.inputmethod.InputMethodManager) v0.a.getSystemService("input_method"));
            if (v4_1 != null) {
                v4_1.hideSoftInputFromWindow(p3.getWindowToken(), 0);
            }
            this.b.clearFocus();
            return 1;
        }
    }
}
