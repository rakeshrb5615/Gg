package androidx.lifecycle;
public final class c {
    public final int a;
    public final reflect.Method b;

    public c(reflect.Method p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        p1.setAccessible(1);
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof androidx.lifecycle.c)) {
                if ((this.a != ((androidx.lifecycle.c) p5).a) || (!this.b.getName().equals(((androidx.lifecycle.c) p5).b.getName()))) {
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

    public final int hashCode()
    {
        return (this.b.getName().hashCode() + (this.a * 31));
    }
}
