package z3;
public final synthetic class i implements android.widget.AutoCompleteTextView$OnDismissListener {
    public final synthetic z3.k a;

    public synthetic i(z3.k p1)
    {
        this.a = p1;
        return;
    }

    public final void onDismiss()
    {
        z3.k v1 = this.a;
        v1.m = 1;
        v1.o = android.os.SystemClock.uptimeMillis();
        v1.s(0);
        return;
    }
}
