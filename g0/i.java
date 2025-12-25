package g0;
public final class i {
    public final android.content.res.ColorStateList a;
    public final android.content.res.Configuration b;
    public final int c;

    public i(android.content.res.ColorStateList p1, android.content.res.Configuration p2, android.content.res.Resources$Theme p3)
    {
        int v1_1;
        this.a = p1;
        this.b = p2;
        if (p3 != null) {
            v1_1 = p3.hashCode();
        } else {
            v1_1 = 0;
        }
        this.c = v1_1;
        return;
    }
}
