package t;
public final class i {
    public Object a;
    public t.k b;
    public t.l c;
    public boolean d;

    public final void finalize()
    {
        t.l v0_0 = this.b;
        if (v0_0 != null) {
            t.l v0_3 = v0_0.b;
            if (!v0_3.isDone()) {
                String v2_2 = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                v2_2.append(this.a);
                v0_3.k(new t.b(v2_2.toString(), 1));
            }
        }
        if (!this.d) {
            t.l v0_2 = this.c;
            if (v0_2 != null) {
                v0_2.j(0);
            }
        }
        return;
    }
}
