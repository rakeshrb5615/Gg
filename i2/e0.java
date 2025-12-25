package i2;
public final synthetic class e0 {
    public final synthetic com.chilllive.chillwallpaperproject.MainActivity a;

    public synthetic e0(com.chilllive.chillwallpaperproject.MainActivity p1)
    {
        this.a = p1;
        return;
    }

    public final void a(com.google.android.play.core.install.zza p12)
    {
        boolean v0_0 = this.a;
        if (p12.a != 11) {
            return;
        } else {
            y3.l v1_7 = v0_0.findViewById(16908290);
            Object v2_1 = v1_7.getResources().getText(2131951624);
            int v4_0 = 0;
            while (!(v1_7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
                if ((v1_7 instanceof android.widget.FrameLayout)) {
                    if (v1_7.getId() != 16908290) {
                        v4_0 = ((android.view.ViewGroup) v1_7);
                    } else {
                        y3.l v1_8 = ((android.view.ViewGroup) v1_7);
                        if (v1_8 == null) {
                            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
                        } else {
                            y3.l v5_12;
                            Throwable v12_6 = v1_8.getContext();
                            int v4_3 = android.view.LayoutInflater.from(v12_6);
                            y3.l v5_11 = v12_6.obtainStyledAttributes(y3.j.C);
                            int v6 = 0;
                            int v8 = v5_11.getResourceId(0, -1);
                            int v10 = v5_11.getResourceId(1, -1);
                            v5_11.recycle();
                            if ((v8 == -1) || (v10 == -1)) {
                                v5_12 = 2131558438;
                            } else {
                                v5_12 = 2131558507;
                            }
                            y3.l v5_14 = new y3.j(v12_6, v1_8, ((com.google.android.material.snackbar.SnackbarContentLayout) v4_3.inflate(v5_12, v1_8, 0)), ((com.google.android.material.snackbar.SnackbarContentLayout) v4_3.inflate(v5_12, v1_8, 0)));
                            ((com.google.android.material.snackbar.SnackbarContentLayout) v5_14.i.getChildAt(0)).getMessageView().setText(v2_1);
                            v5_14.k = -2;
                            y3.l v1_15 = new i2.z(v0_0, 5);
                            Throwable v12_8 = v12_6.getText(2131952292);
                            boolean v0_14 = ((com.google.android.material.snackbar.SnackbarContentLayout) v5_14.i.getChildAt(0)).getActionView();
                            if (android.text.TextUtils.isEmpty(v12_8)) {
                                v0_14.setVisibility(8);
                                v0_14.setOnClickListener(0);
                                v5_14.B = 0;
                            } else {
                                v5_14.B = 1;
                                v0_14.setVisibility(0);
                                v0_14.setText(v12_8);
                                v0_14.setOnClickListener(new i2.b0(4, v5_14, v1_15));
                            }
                            Throwable v12_1 = j6.s.h();
                            boolean v0_1 = v5_14.g();
                            y3.l v1_0 = v5_14.t;
                            if (!v12_1.l(v1_0)) {
                                y3.l v5_2 = ((y3.l) v12_1.e);
                                if ((v5_2 != null) && (v5_2.a.get() == v1_0)) {
                                    v6 = 1;
                                }
                                if (v6 == 0) {
                                    v12_1.e = new y3.l(v0_1, v1_0);
                                } else {
                                    ((y3.l) v12_1.e).b = v0_1;
                                }
                                boolean v0_3 = ((y3.l) v12_1.d);
                                if ((!v0_3) || (!v12_1.c(v0_3, 4))) {
                                    v12_1.d = 0;
                                    v12_1.s();
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                y3.l v1_4 = ((y3.l) v12_1.d);
                                v1_4.b = v0_1;
                                ((android.os.Handler) v12_1.c).removeCallbacksAndMessages(v1_4);
                                v12_1.r(((y3.l) v12_1.d));
                                return;
                            }
                        }
                    }
                }
                y3.l v1_5 = v1_7.getParent();
                if (!(v1_5 instanceof android.view.View)) {
                    v1_7 = 0;
                } else {
                    v1_7 = ((android.view.View) v1_5);
                }
                if (v1_7 == null) {
                    v1_8 = v4_0;
                }
            }
            v1_8 = ((android.view.ViewGroup) v1_7);
        }
    }
}
