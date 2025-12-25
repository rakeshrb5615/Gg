package t;
public final class j extends t.h {
    public final synthetic t.k n;

    public j(t.k p1)
    {
        this.n = p1;
        return;
    }

    public final String h()
    {
        String v0_6 = ((t.i) this.n.a.get());
        if (v0_6 != null) {
            StringBuilder v1_1 = new StringBuilder("tag=[");
            v1_1.append(v0_6.a);
            v1_1.append("]");
            return v1_1.toString();
        } else {
            return "Completer object has been garbage collected, future will fail soon";
        }
    }
}
