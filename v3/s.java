package v3;
public final class s extends v3.y {
    public final synthetic java.util.ArrayList c;
    public final synthetic android.graphics.Matrix d;

    public s(java.util.ArrayList p1, android.graphics.Matrix p2)
    {
        this.c = p1;
        this.d = p2;
        return;
    }

    public final void a(android.graphics.Matrix p5, u3.a p6, int p7, android.graphics.Canvas p8)
    {
        p5 = this.c;
        int v0 = p5.size();
        int v1 = 0;
        while (v1 < v0) {
            v3.y v2_0 = p5.get(v1);
            v1++;
            ((v3.y) v2_0).a(this.d, p6, p7, p8);
        }
        return;
    }
}
