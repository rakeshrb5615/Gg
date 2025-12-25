package i2;
public final synthetic class v implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic android.view.View b;

    public synthetic v(android.view.View p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        android.view.View v2 = this.b;
        switch (this.a) {
            case 0:
                v2.animate().scaleX(1065353216).scaleY(1065353216).setDuration(((long) 50)).start();
                return;
            case 1:
                v2.setVisibility(8);
                return;
            case 2:
                v2.setVisibility(8);
                return;
            case 3:
                v2.setVisibility(8);
                return;
            default:
                ((android.view.inputmethod.InputMethodManager) e0.c.getSystemService(v2.getContext(), android.view.inputmethod.InputMethodManager)).showSoftInput(v2, 1);
                return;
        }
    }
}
