package z;
public final class a extends z.c {
    public int n;
    public int o;
    public w.a p;

    public boolean getAllowsGoneWidget()
    {
        return this.p.t0;
    }

    public int getMargin()
    {
        return this.p.u0;
    }

    public int getType()
    {
        return this.n;
    }

    public final void h(w.d p6, boolean p7)
    {
        int v0 = this.n;
        this.o = v0;
        if (p7 == 0) {
            if (v0 != 5) {
                if (v0 == 6) {
                    this.o = 1;
                }
            } else {
                this.o = 0;
            }
        } else {
            if (v0 != 5) {
                if (v0 == 6) {
                    this.o = 0;
                }
            } else {
                this.o = 1;
            }
        }
        if ((p6 instanceof w.a)) {
            ((w.a) p6).s0 = this.o;
        }
        return;
    }

    public void setAllowsGoneWidget(boolean p2)
    {
        this.p.t0 = p2;
        return;
    }

    public void setDpMargin(int p2)
    {
        this.p.u0 = ((int) ((((float) p2) * this.getResources().getDisplayMetrics().density) + 1056964608));
        return;
    }

    public void setMargin(int p2)
    {
        this.p.u0 = p2;
        return;
    }

    public void setType(int p1)
    {
        this.n = p1;
        return;
    }
}
