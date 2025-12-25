package m;
public final class h extends android.widget.BaseAdapter {
    public int a;
    public final synthetic m.i b;

    public h(m.i p1)
    {
        this.b = p1;
        this.a = -1;
        this.a();
        return;
    }

    public final void a()
    {
        int v0_1 = this.b.c;
        m.o v1 = v0_1.v;
        if (v1 != null) {
            v0_1.i();
            int v0_3 = v0_1.j;
            int v2 = v0_3.size();
            int v3 = 0;
            while (v3 < v2) {
                if (((m.o) v0_3.get(v3)) != v1) {
                    v3++;
                } else {
                    this.a = v3;
                    return;
                }
            }
        }
        this.a = -1;
        return;
    }

    public final m.o b(int p3)
    {
        int v0_0 = this.b;
        java.util.ArrayList v1_0 = v0_0.c;
        v1_0.i();
        java.util.ArrayList v1_1 = v1_0.j;
        v0_0.getClass();
        int v0_1 = this.a;
        if ((v0_1 >= 0) && (p3 >= v0_1)) {
            p3++;
        }
        return ((m.o) v1_1.get(p3));
    }

    public final int getCount()
    {
        int v0_0 = this.b;
        int v1_0 = v0_0.c;
        v1_0.i();
        int v1_2 = v1_0.j.size();
        v0_0.getClass();
        if (this.a >= 0) {
            return (v1_2 - 1);
        } else {
            return v1_2;
        }
    }

    public final bridge synthetic Object getItem(int p1)
    {
        return this.b(p1);
    }

    public final long getItemId(int p3)
    {
        return ((long) p3);
    }

    public final android.view.View getView(int p3, android.view.View p4, android.view.ViewGroup p5)
    {
        if (p4 == null) {
            p4 = this.b.b.inflate(2131558416, p5, 0);
        }
        ((m.z) p4).a(this.b(p3));
        return p4;
    }

    public final void notifyDataSetChanged()
    {
        this.a();
        super.notifyDataSetChanged();
        return;
    }
}
