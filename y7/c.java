package y7;
public final class c extends y7.a {

    static c()
    {
        new y7.c(1, 0);
        return;
    }

    public final boolean equals(Object p5)
    {
        if ((p5 instanceof y7.c)) {
            char v0_1 = this.a;
            char v1 = this.b;
            if (((kotlin.jvm.internal.j.f(v0_1, v1) > 0) && (kotlin.jvm.internal.j.f(((y7.c) p5).a, ((y7.c) p5).b) > 0)) || ((v0_1 == ((y7.c) p5).a) && (v1 == ((y7.c) p5).b))) {
                return 1;
            }
        }
        return 0;
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        char v1 = this.b;
        if (kotlin.jvm.internal.j.f(v0_0, v1) <= 0) {
            return ((v0_0 * 31) + v1);
        } else {
            return -1;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append("..");
        v0_1.append(this.b);
        return v0_1.toString();
    }
}
