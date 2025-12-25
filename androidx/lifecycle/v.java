package androidx.lifecycle;
public final class v {
    public androidx.lifecycle.o a;
    public androidx.lifecycle.s b;

    public final void a(androidx.lifecycle.u p4, androidx.lifecycle.n p5)
    {
        androidx.lifecycle.o v0 = p5.a();
        androidx.lifecycle.s v1_1 = this.a;
        kotlin.jvm.internal.j.e(v1_1, "state1");
        if (v0.compareTo(v1_1) < 0) {
            v1_1 = v0;
        }
        this.a = v1_1;
        this.b.c(p4, p5);
        this.a = v0;
        return;
    }
}
