package i2;
public final synthetic class b0 implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic b0(int p1, Object p2, Object p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public synthetic b0(l2.a0 p2, android.app.Dialog p3)
    {
        this.a = 1;
        this.c = p2;
        this.b = p3;
        return;
    }

    public final void onClick(android.view.View p4)
    {
        switch (this.a) {
            case 0:
                Throwable v4_10 = ((android.app.Dialog) this.b);
                android.os.LocaleList v0_10 = ((java.util.concurrent.atomic.AtomicReference) this.c);
                v4_10.dismiss();
                android.os.LocaleList v0_13 = m0.h.a(String.valueOf(v0_10));
                Object vtmp3 = java.util.Objects.requireNonNull(v0_13);
                if (android.os.Build$VERSION.SDK_INT < 33) {
                    if (!v0_13.equals(h.p.c)) {
                        try {
                            h.p.c = v0_13;
                            h.p.a();
                        } catch (Throwable v4_11) {
                            throw v4_11;
                        }
                    }
                } else {
                    Object v1_7 = h.p.c();
                    if (v1_7 != null) {
                        h.m.b(v1_7, h.l.a(v0_13.a.a.toLanguageTags()));
                    }
                }
                v4_10.dismiss();
                return;
            case 1:
                Object v1_3 = ((android.app.Dialog) this.b);
                ((l2.a0) this.c).Y1.onClickStoreButton(p4);
                v1_3.dismiss();
                return;
            case 2:
                Throwable v4_5 = ((l2.a0) this.b);
                android.os.LocaleList v0_2 = ((android.widget.TextView) this.c);
                v4_5.getClass();
                i2.y.b(v0_2);
                v0_2.setSelected(1);
                v4_5.B.setSelected(0);
                v4_5.A.setSelected(0);
                v4_5.C.setSelected(0);
                v4_5.z.setSelected(0);
                return;
            case 3:
                Throwable v4_8 = ((l2.d0) this.b);
                i2.y.b(((android.widget.ImageButton) this.c));
                ((com.chilllive.chillwallpaperproject.MainActivity) v4_8.requireActivity()).getOnBackPressedDispatcher().c.a();
                return;
            default:
                android.os.LocaleList v0_20 = ((y3.j) this.b);
                ((i2.z) this.c).onClick(p4);
                v0_20.a(1);
                return;
        }
    }
}
