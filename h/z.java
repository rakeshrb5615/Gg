package h;
public abstract class z {
    public Object a;
    public Object b;

    public z(android.content.Context p1)
    {
        this.a = p1;
        return;
    }

    public z(h.c0 p1)
    {
        this.b = p1;
        return;
    }

    public void c()
    {
        int v0_1 = ((d4.k) this.a);
        if (v0_1 != 0) {
            try {
                ((h.c0) this.b).q.unregisterReceiver(v0_1);
            } catch (IllegalArgumentException) {
            }
            this.a = 0;
        }
        return;
    }

    public abstract android.content.IntentFilter d();

    public abstract int e();

    public android.view.MenuItem f(android.view.MenuItem p3)
    {
        if (!(p3 instanceof j0.a)) {
            return p3;
        } else {
            if (((r.j) this.b) == null) {
                this.b = new r.j(0);
            }
            m.t v0_4 = ((android.view.MenuItem) ((r.j) this.b).get(((j0.a) p3)));
            if (v0_4 == null) {
                v0_4 = new m.t(((android.content.Context) this.a), ((j0.a) p3));
                ((r.j) this.b).put(((j0.a) p3), v0_4);
            }
            return v0_4;
        }
    }

    public abstract void g();

    public void h()
    {
        this.c();
        android.content.IntentFilter v0 = this.d();
        if (v0.countActions() != 0) {
            if (((d4.k) this.a) == null) {
                this.a = new d4.k(this, 1);
            }
            ((h.c0) this.b).q.registerReceiver(((d4.k) this.a), v0);
            return;
        } else {
            return;
        }
    }
}
