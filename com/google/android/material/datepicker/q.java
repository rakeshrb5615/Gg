package com.google.android.material.datepicker;
public class q extends androidx.fragment.app.s {
    public v3.k A;
    public boolean B;
    public CharSequence C;
    public CharSequence D;
    public final java.util.LinkedHashSet a;
    public final java.util.LinkedHashSet b;
    public int c;
    public com.google.android.material.datepicker.x d;
    public com.google.android.material.datepicker.b e;
    public com.google.android.material.datepicker.n f;
    public int m;
    public CharSequence n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public int s;
    public CharSequence t;
    public int u;
    public CharSequence v;
    public int w;
    public CharSequence x;
    public android.widget.TextView y;
    public com.google.android.material.internal.CheckableImageButton z;

    public q()
    {
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        this.a = new java.util.LinkedHashSet();
        this.b = new java.util.LinkedHashSet();
        return;
    }

    public static int h(android.content.Context p6)
    {
        int v6_1 = p6.getResources();
        int v0_2 = v6_1.getDimensionPixelOffset(2131166064);
        int v1_5 = com.google.android.material.datepicker.a0.b();
        v1_5.set(5, 1);
        int v1_0 = com.google.android.material.datepicker.a0.a(v1_5);
        v1_0.get(2);
        v1_0.get(1);
        int v5_1 = v1_0.getMaximum(7);
        v1_0.getActualMaximum(5);
        v1_0.getTimeInMillis();
        return (((v5_1 - 1) * v6_1.getDimensionPixelOffset(2131166084)) + ((v6_1.getDimensionPixelSize(2131166070) * v5_1) + (v0_2 * 2)));
    }

    public static boolean i(android.content.Context p2, int p3)
    {
        android.content.res.TypedArray v2_1 = p2.obtainStyledAttributes(c4.b.W(p2, 2130969456, com.google.android.material.datepicker.n.getCanonicalName()).data, new int[] {p3}));
        boolean v3_2 = v2_1.getBoolean(0, 0);
        v2_1.recycle();
        return v3_2;
    }

    public final void g()
    {
        if (this.getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        } else {
            return;
        }
    }

    public final void onCancel(android.content.DialogInterface p3)
    {
        java.util.Iterator v0_1 = this.a.iterator();
        while (v0_1.hasNext()) {
            ((android.content.DialogInterface$OnCancelListener) v0_1.next()).onCancel(p3);
        }
        return;
    }

    public final void onCreate(android.os.Bundle p4)
    {
        super.onCreate(p4);
        if (p4 == null) {
            p4 = this.getArguments();
        }
        this.c = p4.getInt("OVERRIDE_THEME_RES_ID");
        if (p4.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        } else {
            this.e = ((com.google.android.material.datepicker.b) p4.getParcelable("CALENDAR_CONSTRAINTS_KEY"));
            if (p4.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
                throw new ClassCastException();
            } else {
                this.m = p4.getInt("TITLE_TEXT_RES_ID_KEY");
                this.n = p4.getCharSequence("TITLE_TEXT_KEY");
                this.p = p4.getInt("INPUT_MODE_KEY");
                this.q = p4.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.r = p4.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.s = p4.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.t = p4.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.u = p4.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.v = p4.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.w = p4.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.x = p4.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                String v4_6 = this.n;
                if (v4_6 == null) {
                    v4_6 = this.requireContext().getResources().getText(this.m);
                }
                this.C = v4_6;
                if (v4_6 == null) {
                    v4_6 = 0;
                } else {
                    String[] v0_32 = android.text.TextUtils.split(String.valueOf(v4_6), "\n");
                    if (v0_32.length > 1) {
                        v4_6 = v0_32[0];
                    }
                }
                this.D = v4_6;
                return;
            }
        }
    }

    public final android.app.Dialog onCreateDialog(android.os.Bundle p6)
    {
        v3.k v0_1 = this.requireContext();
        this.requireContext();
        float v1_10 = this.c;
        if (v1_10 == 0) {
            this.g();
            throw 0;
        } else {
            android.app.Dialog v6_1 = new android.app.Dialog(v0_1, v1_10);
            v3.k v0_0 = v6_1.getContext();
            this.o = com.google.android.material.datepicker.q.i(v0_0, 16843277);
            this.A = new v3.k(v0_0, 0, 2130969456, 2132018392);
            float v1_5 = v0_0.obtainStyledAttributes(0, c3.a.m, 2130969456, 2132018392);
            int v2_1 = v1_5.getColor(1, 0);
            v1_5.recycle();
            this.A.l(v0_0);
            this.A.o(android.content.res.ColorStateList.valueOf(v2_1));
            this.A.n(v6_1.getWindow().getDecorView().getElevation());
            return v6_1;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p6, android.view.ViewGroup p7, android.os.Bundle p8)
    {
        int v8_4;
        if (!this.o) {
            v8_4 = 2131558510;
        } else {
            v8_4 = 2131558511;
        }
        android.widget.Button v6_1 = p6.inflate(v8_4, p7);
        int v7_4 = v6_1.getContext();
        if (!this.o) {
            v6_1.findViewById(2131362224).setLayoutParams(new android.widget.LinearLayout$LayoutParams(com.google.android.material.datepicker.q.h(v7_4), -1));
        } else {
            v6_1.findViewById(2131362223).setLayoutParams(new android.widget.LinearLayout$LayoutParams(com.google.android.material.datepicker.q.h(v7_4), -2));
        }
        ((android.widget.TextView) v6_1.findViewById(2131362235)).setAccessibilityLiveRegion(1);
        this.z = ((com.google.android.material.internal.CheckableImageButton) v6_1.findViewById(2131362237));
        this.y = ((android.widget.TextView) v6_1.findViewById(2131362241));
        this.z.setTag("TOGGLE_BUTTON_TAG");
        int v8_16 = this.z;
        int v1_4 = new android.graphics.drawable.StateListDrawable();
        v1_4.addState(new int[] {16842912}), j5.t1.A(v7_4, 2131231281));
        int v2_4 = 0;
        int[] v3_2 = new int[0];
        v1_4.addState(v3_2, j5.t1.A(v7_4, 2131231283));
        v8_16.setImageDrawable(v1_4);
        if (this.p != 0) {
            v2_4 = 1;
        }
        int v7_7;
        this.z.setChecked(v2_4);
        q0.q0.n(this.z, 0);
        int v7_5 = this.z;
        if (this.p != 1) {
            v7_7 = v7_5.getContext().getString(2131952167);
        } else {
            v7_7 = v7_5.getContext().getString(2131952165);
        }
        this.z.setContentDescription(v7_7);
        this.z.setOnClickListener(new com.google.android.material.datepicker.o(this, 0));
        v6_1.findViewById(2131361979);
        this.g();
        throw 0;
    }

    public final void onDismiss(android.content.DialogInterface p3)
    {
        android.view.ViewGroup v0_1 = this.b.iterator();
        while (v0_1.hasNext()) {
            ((android.content.DialogInterface$OnDismissListener) v0_1.next()).onDismiss(p3);
        }
        android.view.ViewGroup v0_3 = ((android.view.ViewGroup) this.getView());
        if (v0_3 != null) {
            v0_3.removeAllViews();
        }
        super.onDismiss(p3);
        return;
    }

    public final void onSaveInstanceState(android.os.Bundle p15)
    {
        android.os.Bundle v7_4;
        super.onSaveInstanceState(p15);
        p15.putInt("OVERRIDE_THEME_RES_ID", this.c);
        p15.putParcelable("DATE_SELECTOR_KEY", 0);
        long v2_4 = this.e;
        String v0_18 = new com.google.android.material.datepicker.a();
        long v3 = com.google.android.material.datepicker.a.b;
        long v3_1 = v2_4.a.f;
        long v5_1 = v2_4.b.f;
        v0_18.a = Long.valueOf(v2_4.d.f);
        int v13 = v2_4.e;
        long v2_0 = v2_4.c;
        android.os.Bundle v7_3 = this.f;
        if (v7_3 != null) {
            v7_4 = v7_3.d;
        } else {
            v7_4 = 0;
        }
        if (v7_4 != null) {
            v0_18.a = Long.valueOf(v7_4.f);
        }
        com.google.android.material.datepicker.s v12;
        android.os.Bundle v7_8 = new android.os.Bundle();
        v7_8.putParcelable("DEEP_COPY_VALIDATOR_KEY", v2_0);
        com.google.android.material.datepicker.s v9 = com.google.android.material.datepicker.s.b(v3_1);
        com.google.android.material.datepicker.s v10 = com.google.android.material.datepicker.s.b(v5_1);
        String v0_2 = v0_18.a;
        if (v0_2 != null) {
            v12 = com.google.android.material.datepicker.s.b(v0_2.longValue());
        } else {
            v12 = 0;
        }
        p15.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.b(v9, v10, ((com.google.android.material.datepicker.d) v7_8.getParcelable("DEEP_COPY_VALIDATOR_KEY")), v12, v13));
        p15.putParcelable("DAY_VIEW_DECORATOR_KEY", 0);
        p15.putInt("TITLE_TEXT_RES_ID_KEY", this.m);
        p15.putCharSequence("TITLE_TEXT_KEY", this.n);
        p15.putInt("INPUT_MODE_KEY", this.p);
        p15.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.q);
        p15.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.r);
        p15.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.s);
        p15.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.t);
        p15.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.u);
        p15.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.v);
        p15.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.w);
        p15.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x);
        return;
    }

    public final void onStart()
    {
        super.onStart();
        java.util.WeakHashMap v0_6 = this.requireDialog().getWindow();
        if (!this.o) {
            v0_6.setLayout(-2, -2);
            int v7_2 = this.getResources().getDimensionPixelOffset(2131166072);
            q0.t1 v1_11 = new android.graphics.Rect(v7_2, v7_2, v7_2, v7_2);
            v0_6.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(this.A, v7_2, v7_2, v7_2, v7_2));
            v0_6.getDecorView().setOnTouchListener(new n3.a(this.requireDialog(), v1_11));
        } else {
            v0_6.setLayout(-1, -1);
            v0_6.setBackgroundDrawable(this.A);
            if (!this.B) {
                q0.t1 v1_25;
                String v6_2 = this.requireView().findViewById(2131362087);
                q0.t1 v1_24 = f2.b0.d(v6_2.getBackground());
                if (v1_24 == null) {
                    v1_25 = 0;
                } else {
                    v1_25 = Integer.valueOf(v1_24.getDefaultColor());
                }
                com.google.android.material.datepicker.p v5_12;
                int v4_0 = 0;
                if ((v1_25 != null) && (v1_25.intValue() != 0)) {
                    v5_12 = 0;
                } else {
                    v5_12 = 1;
                }
                int v7_6 = j5.t1.t(v0_6.getContext(), 16842801, -16777216);
                if (v5_12 != null) {
                    v1_25 = Integer.valueOf(v7_6);
                }
                com.google.android.material.datepicker.p v5_14;
                j5.t1.R(v0_6, 0);
                v0_6.getContext();
                com.google.android.material.datepicker.p v5_13 = v0_6.getContext();
                int v8_9 = android.os.Build$VERSION.SDK_INT;
                if (v8_9 >= 27) {
                    v5_14 = 0;
                } else {
                    v5_14 = h0.a.h(j5.t1.t(v5_13, 16843858, -16777216), 128);
                }
                q0.t1 v1_31;
                v0_6.setStatusBarColor(0);
                v0_6.setNavigationBarColor(v5_14);
                q0.t1 v1_29 = j5.t1.H(v1_25.intValue());
                if ((!j5.t1.H(0)) && (v1_29 == null)) {
                    v1_31 = 0;
                } else {
                    v1_31 = 1;
                }
                int v8_1;
                int v10_5 = new v3.f(v0_6.getDecorView());
                if (v8_9 < 35) {
                    if (v8_9 < 30) {
                        v8_1 = new q0.t1(v0_6, v10_5);
                    } else {
                        v8_1 = new q0.u1(v0_6, v10_5);
                    }
                } else {
                    v8_1 = new q0.w1(v0_6, v10_5);
                }
                v8_1.Q(v1_31);
                q0.t1 v1_0 = j5.t1.H(v7_6);
                if ((j5.t1.H(v5_14)) || ((v5_14 == null) && (v1_0 != null))) {
                    v4_0 = 1;
                }
                q0.t1 v1_5;
                com.google.android.material.datepicker.p v5_1 = new v3.f(v0_6.getDecorView());
                q0.t1 v1_3 = android.os.Build$VERSION.SDK_INT;
                if (v1_3 < 35) {
                    if (v1_3 < 30) {
                        v1_5 = new q0.t1(v0_6, v5_1);
                    } else {
                        v1_5 = new q0.u1(v0_6, v5_1);
                    }
                } else {
                    v1_5 = new q0.w1(v0_6, v5_1);
                }
                v1_5.P(v4_0);
                q0.i0.j(v6_2, new com.google.android.material.datepicker.p(v6_2, v6_2.getLayoutParams().height, v6_2.getPaddingLeft(), v6_2.getPaddingTop(), v6_2.getPaddingRight()));
                this.B = 1;
            }
        }
        this.requireContext();
        java.util.WeakHashMap v0_1 = this.c;
        if (v0_1 == null) {
            this.g();
            throw 0;
        } else {
            this.g();
            q0.t1 v1_8 = this.e;
            int v4_3 = new com.google.android.material.datepicker.n();
            com.google.android.material.datepicker.p v5_5 = new android.os.Bundle();
            v5_5.putInt("THEME_RES_ID_KEY", v0_1);
            v5_5.putParcelable("GRID_SELECTOR_KEY", 0);
            v5_5.putParcelable("CALENDAR_CONSTRAINTS_KEY", v1_8);
            v5_5.putParcelable("DAY_VIEW_DECORATOR_KEY", 0);
            v5_5.putParcelable("CURRENT_MONTH_KEY", v1_8.d);
            v4_3.setArguments(v5_5);
            this.f = v4_3;
            if (this.p == 1) {
                this.g();
                q0.t1 v1_13 = this.e;
                v4_3 = new com.google.android.material.datepicker.r();
                com.google.android.material.datepicker.p v5_7 = new android.os.Bundle();
                v5_7.putInt("THEME_RES_ID_KEY", v0_1);
                v5_7.putParcelable("DATE_SELECTOR_KEY", 0);
                v5_7.putParcelable("CALENDAR_CONSTRAINTS_KEY", v1_13);
                v4_3.setArguments(v5_7);
            }
            q0.t1 v1_18;
            this.d = v4_3;
            if ((this.p != 1) || (this.getResources().getConfiguration().orientation != 2)) {
                v1_18 = this.C;
            } else {
                v1_18 = this.D;
            }
            this.y.setText(v1_18);
            this.g();
            this.getContext();
            throw 0;
        }
    }

    public final void onStop()
    {
        this.d.a.clear();
        super.onStop();
        return;
    }
}
