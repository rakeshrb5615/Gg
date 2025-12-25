package i1;
public final class e implements android.text.method.KeyListener {
    public final android.text.method.KeyListener a;
    public final a6.e b;

    public e(android.text.method.KeyListener p2)
    {
        a6.e v0_1 = new a6.e();
        this.a = p2;
        this.b = v0_1;
        return;
    }

    public final void clearMetaKeyState(android.view.View p2, android.text.Editable p3, int p4)
    {
        this.a.clearMetaKeyState(p2, p3, p4);
        return;
    }

    public final int getInputType()
    {
        return this.a.getInputType();
    }

    public final boolean onKeyDown(android.view.View p4, android.text.Editable p5, int p6, android.view.KeyEvent p7)
    {
        android.text.method.KeyListener v0_1;
        this.b.getClass();
        if (p6 == 67) {
            v0_1 = b8.g.c(p5, p7, 0);
        } else {
            if (p6 == 112) {
                v0_1 = b8.g.c(p5, p7, 1);
            } else {
                v0_1 = 0;
            }
        }
        android.text.method.KeyListener v0_2;
        if (v0_1 == null) {
            v0_2 = 0;
        } else {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(p5);
            v0_2 = 1;
        }
        if ((v0_2 == null) && (!this.a.onKeyDown(p4, p5, p6, p7))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean onKeyOther(android.view.View p2, android.text.Editable p3, android.view.KeyEvent p4)
    {
        return this.a.onKeyOther(p2, p3, p4);
    }

    public final boolean onKeyUp(android.view.View p2, android.text.Editable p3, int p4, android.view.KeyEvent p5)
    {
        return this.a.onKeyUp(p2, p3, p4, p5);
    }
}
