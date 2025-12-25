package c2;
public final class a {
    public final b2.g a;
    public final a8.j b;
    public final v3.f c;
    public final java.util.LinkedHashMap d;
    public boolean e;
    public android.os.Bundle f;
    public boolean g;
    public boolean h;

    public a(b2.g p1, a8.j p2)
    {
        this.a = p1;
        this.b = p2;
        this.c = new v3.f();
        this.d = new java.util.LinkedHashMap();
        this.h = 1;
        return;
    }

    public final void a()
    {
        IllegalStateException v0_0 = this.a;
        if (((androidx.lifecycle.w) v0_0.getLifecycle()).c != androidx.lifecycle.o.b) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        } else {
            if (this.e) {
                throw new IllegalStateException("SavedStateRegistry was already attached.");
            } else {
                this.b.invoke();
                v0_0.getLifecycle().a(new c.e(this, 2));
                this.e = 1;
                return;
            }
        }
    }
}
