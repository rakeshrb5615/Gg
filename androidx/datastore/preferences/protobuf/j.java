package androidx.datastore.preferences.protobuf;
public abstract class j {
    public int a;
    public Object b;

    public abstract void a();

    public abstract int b();

    public abstract boolean c();

    public abstract void d();

    public abstract int e();

    public abstract boolean f();

    public abstract androidx.datastore.preferences.protobuf.g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x();

    public void y()
    {
        do {
            androidx.datastore.preferences.protobuf.z v0_0 = this.u();
            if (v0_0 == null) {
                break;
            }
            String v1_3 = this.a;
            if (v1_3 >= 100) {
                throw new androidx.datastore.preferences.protobuf.z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            } else {
                this.a = (v1_3 + 1);
                androidx.datastore.preferences.protobuf.z v0_1 = this.x(v0_0);
                this.a = (this.a - 1);
            }
        } while(v0_1 != null);
        return;
    }
}
