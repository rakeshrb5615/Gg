package h;
public final synthetic class k implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic android.content.Context b;

    public synthetic k(android.content.Context p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                android.os.LocaleList v0_4 = android.os.Build$VERSION.SDK_INT;
                if (v0_4 >= 33) {
                    android.content.Context v5_0 = this.b;
                    android.content.ComponentName v3_1 = new android.content.ComponentName(v5_0, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (v5_0.getPackageManager().getComponentEnabledSetting(v3_1) != 1) {
                        Object v2_2;
                        if (v0_4 < 33) {
                            v2_2 = h.p.c;
                            if (v2_2 == null) {
                                v2_2 = m0.h.b;
                            }
                        } else {
                            android.os.LocaleList v0_5 = h.p.c();
                            if (v0_5 == null) {
                            } else {
                                v2_2 = new m0.h(new m0.i(h.m.a(v0_5)));
                            }
                        }
                        if (v2_2.b()) {
                            android.os.LocaleList v0_8 = d0.d.e(v5_0);
                            Object v2_5 = v5_0.getSystemService("locale");
                            if (v2_5 != null) {
                                h.m.b(v2_5, h.l.a(v0_8));
                            }
                        }
                        v5_0.getPackageManager().setComponentEnabledSetting(v3_1, 1, 1);
                    }
                }
                h.p.f = 1;
                return;
            case 1:
                h.p.p(this.b);
                return;
            case 2:
                new java.util.concurrent.ThreadPoolExecutor(0, 1, 0, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new h.k(this.b, 3));
                return;
            default:
                y1.c.t(this.b, new x1.d(), y1.c.a, 0);
                return;
        }
    }
}
