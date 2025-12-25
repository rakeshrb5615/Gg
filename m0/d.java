package m0;
public final class d {
    public boolean a;
    public m0.c b;
    public boolean c;

    public final void a(m0.c p2)
    {
        while (this.c) {
            this.wait();
        }
        if (this.b != p2) {
            this.b = p2;
            if (!this.a) {
            } else {
                p2.onCancel();
                return;
            }
        } else {
        }
        return;
    }
}
