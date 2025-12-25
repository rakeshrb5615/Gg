package w5;
public final class h implements t5.g {
    public boolean a;
    public boolean b;
    public t5.c c;
    public final w5.f d;

    public h(w5.f p2)
    {
        this.a = 0;
        this.b = 0;
        this.d = p2;
        return;
    }

    public final t5.g e(String p4)
    {
        if (this.a) {
            throw new t5.b("Cannot encode a second value in the ValueEncoderContext");
        } else {
            this.a = 1;
            this.d.h(this.c, p4, this.b);
            return this;
        }
    }

    public final t5.g g(boolean p4)
    {
        if (this.a) {
            throw new t5.b("Cannot encode a second value in the ValueEncoderContext");
        } else {
            this.a = 1;
            this.d.g(this.c, p4, this.b);
            return this;
        }
    }
}
