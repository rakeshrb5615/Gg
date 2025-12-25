package z3;
public final class v extends z3.p {
    public final int e;
    public android.widget.EditText f;
    public final com.google.android.material.datepicker.o g;

    public v(z3.o p2, int p3)
    {
        super(p2);
        super.e = 2131231168;
        super.g = new com.google.android.material.datepicker.o(super, 4);
        if (p3 != 0) {
            super.e = p3;
        }
        return;
    }

    public final void b()
    {
        this.p();
        return;
    }

    public final int c()
    {
        return 2131952217;
    }

    public final int d()
    {
        return this.e;
    }

    public final android.view.View$OnClickListener f()
    {
        return this.g;
    }

    public final boolean j()
    {
        return 1;
    }

    public final boolean k()
    {
        int v0_3;
        int v0_0 = this.f;
        if ((v0_0 == 0) || (!(v0_0.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod))) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        return (v0_3 ^ 1);
    }

    public final void l(android.widget.EditText p1)
    {
        this.f = p1;
        this.p();
        return;
    }

    public final void q()
    {
        int v0_0 = this.f;
        if ((v0_0 != 0) && ((v0_0.getInputType() == 16) || ((v0_0.getInputType() == 128) || ((v0_0.getInputType() == 144) || (v0_0.getInputType() == 224))))) {
            this.f.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
        return;
    }

    public final void r()
    {
        android.widget.EditText v0 = this.f;
        if (v0 != null) {
            v0.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
        return;
    }
}
