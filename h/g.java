package h;
public final class g extends h.e0 implements android.content.DialogInterface {
    public final h.e m;

    public g(android.view.ContextThemeWrapper p2, int p3)
    {
        super(p2, h.g.e(p2, p3));
        super.m = new h.e(super.getContext(), super, super.getWindow());
        return;
    }

    public static int e(android.content.Context p2, int p3)
    {
        if (((p3 >> 24) & 255) < 1) {
            android.util.TypedValue v3_2 = new android.util.TypedValue();
            p2.getTheme().resolveAttribute(2130968624, v3_2, 1);
            return v3_2.resourceId;
        } else {
            return p3;
        }
    }

    public final void onCreate(android.os.Bundle p18)
    {
        int v1_0 = super.onCreate(p18).m;
        v1_0.b.setContentView(v1_0.q);
        androidx.core.widget.NestedScrollView v2_26 = v1_0.a;
        android.view.View v3_3 = v1_0.c;
        int v4_0 = v3_3.findViewById(2131362294);
        android.view.ViewGroup v6_0 = v4_0.findViewById(2131362539);
        int v8_5 = v4_0.findViewById(2131361987);
        int v10_0 = v4_0.findViewById(2131361934);
        int v4_4 = ((android.view.ViewGroup) v4_0.findViewById(2131362000));
        v3_3.setFlags(131072, 131072);
        v4_4.setVisibility(8);
        android.view.View v5_6 = v4_4.findViewById(2131362539);
        int v7_5 = v4_4.findViewById(2131361987);
        int v9_2 = v4_4.findViewById(2131361934);
        android.view.View v5_7 = h.e.a(v5_6, v6_0);
        android.view.ViewGroup v6_1 = h.e.a(v7_5, v8_5);
        int v7_6 = h.e.a(v9_2, v10_0);
        int v8_20 = ((androidx.core.widget.NestedScrollView) v3_3.findViewById(2131362377));
        v1_0.i = v8_20;
        int v9_1 = 0;
        v8_20.setFocusable(0);
        v1_0.i.setNestedScrollingEnabled(0);
        int v8_24 = ((android.widget.TextView) v6_1.findViewById(16908299));
        v1_0.m = v8_24;
        if (v8_24 != 0) {
            v8_24.setVisibility(8);
            v1_0.i.removeView(v1_0.m);
            if (v1_0.e == null) {
                v6_1.setVisibility(8);
            } else {
                int v8_29 = ((android.view.ViewGroup) v1_0.i.getParent());
                int v12_12 = v8_29.indexOfChild(v1_0.i);
                v8_29.removeViewAt(v12_12);
                v8_29.addView(v1_0.e, v12_12, new android.view.ViewGroup$LayoutParams(-1, -1));
            }
        }
        int v13_0;
        int v8_32 = ((android.widget.Button) v7_6.findViewById(16908313));
        v1_0.f = v8_32;
        int v12_13 = v1_0.w;
        v8_32.setOnClickListener(v12_13);
        if (!android.text.TextUtils.isEmpty(0)) {
            v1_0.f.setText(0);
            v1_0.f.setVisibility(0);
            v13_0 = 1;
        } else {
            v1_0.f.setVisibility(8);
            v13_0 = 0;
        }
        int v15_17 = ((android.widget.Button) v7_6.findViewById(16908314));
        v1_0.g = v15_17;
        v15_17.setOnClickListener(v12_13);
        if (!android.text.TextUtils.isEmpty(0)) {
            v1_0.g.setText(0);
            v1_0.g.setVisibility(0);
            v13_0 |= 2;
        } else {
            v1_0.g.setVisibility(8);
        }
        int v15_6 = ((android.widget.Button) v7_6.findViewById(16908315));
        v1_0.h = v15_6;
        v15_6.setOnClickListener(v12_13);
        if (!android.text.TextUtils.isEmpty(0)) {
            v1_0.h.setText(0);
            v1_0.h.setVisibility(0);
            v13_0 |= 4;
        } else {
            v1_0.h.setVisibility(8);
        }
        int v12_5 = new android.util.TypedValue();
        v2_26.getTheme().resolveAttribute(2130968622, v12_5, 1);
        if (v12_5.data != 0) {
            if (v13_0 != 1) {
                if (v13_0 != 2) {
                    if (v13_0 == 4) {
                        int v8_1 = v1_0.h;
                        int v15_9 = ((android.widget.LinearLayout$LayoutParams) v8_1.getLayoutParams());
                        v15_9.gravity = 1;
                        v15_9.weight = 1056964608;
                        v8_1.setLayoutParams(v15_9);
                    }
                } else {
                    int v8_2 = v1_0.g;
                    int v15_11 = ((android.widget.LinearLayout$LayoutParams) v8_2.getLayoutParams());
                    v15_11.gravity = 1;
                    v15_11.weight = 1056964608;
                    v8_2.setLayoutParams(v15_11);
                }
            } else {
                int v15_12 = v1_0.f;
                int v8_4 = ((android.widget.LinearLayout$LayoutParams) v15_12.getLayoutParams());
                v8_4.gravity = 1;
                v8_4.weight = 1056964608;
                v15_12.setLayoutParams(v8_4);
            }
        }
        if (v13_0 == 0) {
            v7_6.setVisibility(8);
        }
        if (v1_0.n == null) {
            v1_0.k = ((android.widget.ImageView) v3_3.findViewById(16908294));
            if ((android.text.TextUtils.isEmpty(v1_0.d)) || (!v1_0.u)) {
                v3_3.findViewById(2131362521).setVisibility(8);
                v1_0.k.setVisibility(8);
                v5_7.setVisibility(8);
            } else {
                androidx.core.widget.NestedScrollView v2_14 = ((android.widget.TextView) v3_3.findViewById(2131361881));
                v1_0.l = v2_14;
                v2_14.setText(v1_0.d);
                androidx.core.widget.NestedScrollView v2_15 = v1_0.j;
                if (v2_15 == null) {
                    v1_0.l.setPadding(v1_0.k.getPaddingLeft(), v1_0.k.getPaddingTop(), v1_0.k.getPaddingRight(), v1_0.k.getPaddingBottom());
                    v1_0.k.setVisibility(8);
                } else {
                    v1_0.k.setImageDrawable(v2_15);
                }
            }
        } else {
            v5_7.addView(v1_0.n, 0, new android.view.ViewGroup$LayoutParams(-1, -2));
            v3_3.findViewById(2131362521).setVisibility(8);
        }
        androidx.core.widget.NestedScrollView v2_22;
        if (v4_4.getVisibility() == 8) {
            v2_22 = 0;
        } else {
            v2_22 = 1;
        }
        if ((v5_7 == null) || (v5_7.getVisibility() == 8)) {
            int v4_3 = 0;
        } else {
            v4_3 = 1;
        }
        int v7_2;
        if (v7_6.getVisibility() == 8) {
            v7_2 = 0;
        } else {
            v7_2 = 1;
        }
        if (v7_2 == 0) {
            int v8_12 = v6_1.findViewById(2131362496);
            if (v8_12 != 0) {
                v8_12.setVisibility(0);
            }
        }
        if (v4_3 == 0) {
            android.view.View v5_2 = v6_1.findViewById(2131362497);
            if (v5_2 != null) {
                v5_2.setVisibility(0);
            }
        } else {
            int v8_13 = v1_0.i;
            if (v8_13 != 0) {
                v8_13.setClipToPadding(1);
            }
            int v8_15;
            if (v1_0.e == null) {
                v8_15 = 0;
            } else {
                v8_15 = v5_7.findViewById(2131362519);
            }
            if (v8_15 != 0) {
                v8_15.setVisibility(0);
            }
        }
        android.view.View v5_3 = v1_0.e;
        if ((v5_3 != null) && ((v7_2 == 0) || (v4_3 == 0))) {
            int v11_3;
            int v8_17 = v5_3.getPaddingLeft();
            if (v4_3 == 0) {
                v11_3 = v5_3.a;
            } else {
                v11_3 = v5_3.getPaddingTop();
            }
            int v13_5;
            int v12_9 = v5_3.getPaddingRight();
            if (v7_2 == 0) {
                v13_5 = v5_3.b;
            } else {
                v13_5 = v5_3.getPaddingBottom();
            }
            v5_3.setPadding(v8_17, v11_3, v12_9, v13_5);
        }
        if (v2_22 == null) {
            androidx.core.widget.NestedScrollView v2_23 = v1_0.e;
            if (v2_23 == null) {
                v2_23 = v1_0.i;
            }
            if (v2_23 != null) {
                if (v7_2 != 0) {
                    v9_1 = 2;
                }
                int v4_5 = (v4_3 | v9_1);
                android.view.View v5_5 = v3_3.findViewById(2131362376);
                android.view.View v3_0 = v3_3.findViewById(2131362375);
                q0.j0.b(v2_23, v4_5, 3);
                if (v5_5 != null) {
                    v6_1.removeView(v5_5);
                }
                if (v3_0 != null) {
                    v6_1.removeView(v3_0);
                }
            }
        }
        androidx.core.widget.NestedScrollView v2_24 = v1_0.e;
        if (v2_24 != null) {
            android.view.View v3_1 = v1_0.o;
            if (v3_1 != null) {
                v2_24.setAdapter(v3_1);
                int v1_1 = v1_0.p;
                if (v1_1 > -1) {
                    v2_24.setItemChecked(v1_1, 1);
                    v2_24.setSelection(v1_1);
                }
            }
        }
        return;
    }

    public final boolean onKeyDown(int p2, android.view.KeyEvent p3)
    {
        boolean v0_1 = this.m.i;
        if ((!v0_1) || (!v0_1.i(p3))) {
            return super.onKeyDown(p2, p3);
        } else {
            return 1;
        }
    }

    public final boolean onKeyUp(int p2, android.view.KeyEvent p3)
    {
        boolean v0_1 = this.m.i;
        if ((!v0_1) || (!v0_1.i(p3))) {
            return super.onKeyUp(p2, p3);
        } else {
            return 1;
        }
    }

    public final void setTitle(CharSequence p2)
    {
        super.setTitle(p2);
        android.widget.TextView v0_0 = this.m;
        v0_0.d = p2;
        android.widget.TextView v0_1 = v0_0.l;
        if (v0_1 != null) {
            v0_1.setText(p2);
        }
        return;
    }
}
