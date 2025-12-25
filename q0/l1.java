package q0;
public class l1 extends q0.k1 {

    public l1(q0.s1 p1, android.view.WindowInsets p2)
    {
        super(p1, p2);
        return;
    }

    public q0.s1 a()
    {
        return q0.s1.g(0, this.c.consumeDisplayCutout());
    }

    public q0.j e()
    {
        int v0_1 = this.c.getDisplayCutout();
        if (v0_1 != 0) {
            return new q0.j(v0_1);
        } else {
            return 0;
        }
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof q0.l1)) {
                if ((!java.util.Objects.equals(this.c, ((q0.l1) p5).c)) || ((!java.util.Objects.equals(this.g, ((q0.l1) p5).g)) || (!q0.j1.y(this.h, ((q0.l1) p5).h)))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return this.c.hashCode();
    }
}
