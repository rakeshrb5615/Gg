package n;
public final class p2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int p3, int p4)
    {
        this.c = p3;
        this.d = p4;
        this.h = 1;
        if (!this.g) {
            if (p3 != -2147483648) {
                this.a = p3;
            }
            if (p4 != -2147483648) {
                this.b = p4;
            }
        } else {
            if (p4 != -2147483648) {
                this.a = p4;
            }
            if (p3 != -2147483648) {
                this.b = p3;
                return;
            }
        }
        return;
    }
}
