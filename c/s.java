package c;
public final class s {
    public final androidx.fragment.app.t0 a;
    public final androidx.lifecycle.u b;

    public s(androidx.fragment.app.t0 p2, androidx.lifecycle.u p3)
    {
        kotlin.jvm.internal.j.e(p2, "callback");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof c.s)) {
                if (kotlin.jvm.internal.j.a(this.a, ((c.s) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((c.s) p5).b)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
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
        int v1_1;
        int v0_2 = (this.a.hashCode() * 31);
        int v1_0 = this.b;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        return (v0_2 + v1_1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("OnBackPressedCallbackInfo(callback=");
        v0_2.append(this.a);
        v0_2.append(", owner=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
