package i2;
public final synthetic class r0 implements android.view.View$OnClickListener {
    public final synthetic i2.t0 a;
    public final synthetic int b;

    public synthetic r0(i2.t0 p1, int p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void onClick(android.view.View p7)
    {
        android.content.SharedPreferences$Editor v0_0 = p7.getScaleX();
        int v1_3 = (1064514355 * v0_0);
        p7.animate().scaleX(v1_3).scaleY(v1_3).setDuration(((long) 80)).withEndAction(new i2.r(p7, v0_0, 1)).start();
        l2.a0 v7_3 = this.a.h;
        if (v7_3 != null) {
            android.content.SharedPreferences$Editor v0_2;
            l2.a0 v7_4 = v7_3.a;
            int v1_2 = this.b;
            if (v7_4.p != v1_2) {
                v0_2 = 0;
            } else {
                v0_2 = 1;
            }
            v7_4.v.edit().putInt(v7_4.B1, v7_4.r).apply();
            if (v0_2 != null) {
                if (v1_2 == 7) {
                    v7_4.v.edit().putInt(v7_4.z0, 100).apply();
                }
                if (v1_2 == v7_4.v.getInt(v7_4.z0, 0)) {
                    v7_4.v.edit().putString(v7_4.A0, String.valueOf(i2.k0.a.nextInt(900000))).apply();
                }
                v7_4.v.edit().putInt(v7_4.z0, v1_2).apply();
                v7_4.c1 = v1_2;
                v7_4.r();
            }
        }
        return;
    }
}
