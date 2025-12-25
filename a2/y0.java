package a2;
public final class y0 {
    public android.util.SparseArray a;
    public int b;
    public java.util.Set c;

    public final a2.x0 a(int p3)
    {
        android.util.SparseArray v0 = this.a;
        a2.x0 v1_1 = ((a2.x0) v0.get(p3));
        if (v1_1 == null) {
            v1_1 = new a2.x0();
            v0.put(p3, v1_1);
        }
        return v1_1;
    }
}
