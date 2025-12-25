package b2;
public final class a implements b2.d {
    public final synthetic int a;
    public final Object b;

    public a(b2.e p2)
    {
        this.a = 0;
        this.b = new java.util.LinkedHashSet();
        p2.c("androidx.savedstate.Restarter", this);
        return;
    }

    public a(com.chilllive.chillwallpaperproject.MainActivity p2)
    {
        this.a = 1;
        this.b = p2;
        return;
    }

    public final android.os.Bundle a()
    {
        switch (this.a) {
            case 0:
                java.util.ArrayList v1_2;
                java.util.ArrayList v1_6 = new h7.f[0];
                android.os.Bundle v0_6 = c4.b.f(((h7.f[]) java.util.Arrays.copyOf(v1_6, 0)));
                java.util.ArrayList v1_1 = i7.i.j0(((java.util.LinkedHashSet) this.b));
                if (!(v1_1 instanceof java.util.ArrayList)) {
                    v1_2 = new java.util.ArrayList(v1_1);
                } else {
                    v1_2 = ((java.util.ArrayList) v1_1);
                }
                v0_6.putStringArrayList("classes_to_restore", v1_2);
                return v0_6;
            default:
                android.os.Bundle v0_3 = new android.os.Bundle();
                ((com.chilllive.chillwallpaperproject.MainActivity) this.b).h().getClass();
                return v0_3;
        }
    }
}
