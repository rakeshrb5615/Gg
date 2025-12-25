package d0;
public final class j {
    public final android.os.Bundle a;
    public androidx.core.graphics.drawable.IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final android.app.PendingIntent g;

    public j(int p5, String p6, android.app.PendingIntent p7)
    {
        int v5_3;
        if (p5 != 0) {
            v5_3 = androidx.core.graphics.drawable.IconCompat.a(p5);
        } else {
            v5_3 = 0;
        }
        android.os.Bundle v0_1 = new android.os.Bundle();
        this.d = 1;
        this.b = v5_3;
        if ((v5_3 != 0) && (v5_3.c() == 2)) {
            this.e = v5_3.b();
        }
        this.f = d0.p.b(p6);
        this.g = p7;
        this.a = v0_1;
        this.c = 1;
        this.d = 1;
        return;
    }
}
