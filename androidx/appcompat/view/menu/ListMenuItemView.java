package androidx.appcompat.view.menu;
public class ListMenuItemView extends android.widget.LinearLayout implements m.z, android.widget.AbsListView$SelectionBoundsAdjuster {
    public m.o a;
    public android.widget.ImageView b;
    public android.widget.RadioButton c;
    public android.widget.TextView d;
    public android.widget.CheckBox e;
    public android.widget.TextView f;
    public android.widget.ImageView m;
    public android.widget.ImageView n;
    public android.widget.LinearLayout o;
    public final android.graphics.drawable.Drawable p;
    public final int q;
    public final android.content.Context r;
    public boolean s;
    public final android.graphics.drawable.Drawable t;
    public final boolean u;
    public android.view.LayoutInflater v;
    public boolean w;

    public ListMenuItemView(android.content.Context p5, android.util.AttributeSet p6)
    {
        super(p5, p6);
        b8.g v6_1 = b8.g.p(super.getContext(), p6, g.a.r, 2130969413);
        super.p = v6_1.i(5);
        boolean v0_1 = ((android.content.res.TypedArray) v6_1.c);
        super.q = v0_1.getResourceId(1, -1);
        super.s = v0_1.getBoolean(7, 0);
        super.r = p5;
        super.t = v6_1.i(8);
        android.content.res.TypedArray v5_2 = p5.getTheme().obtainStyledAttributes(0, new int[] {16843049}), 2130969042, 0);
        super.u = v5_2.hasValue(0);
        v6_1.r();
        v5_2.recycle();
        return;
    }

    private android.view.LayoutInflater getInflater()
    {
        if (this.v == null) {
            this.v = android.view.LayoutInflater.from(this.getContext());
        }
        return this.v;
    }

    private void setSubMenuArrowVisible(boolean p2)
    {
        android.widget.ImageView v0 = this.m;
        if (v0 != null) {
            int v2_1;
            if (p2 == 0) {
                v2_1 = 8;
            } else {
                v2_1 = 0;
            }
            v0.setVisibility(v2_1);
        }
        return;
    }

    public final void a(m.o p11)
    {
        int v0_17;
        this.a = p11;
        String v1_9 = p11.n;
        int v3 = 0;
        if (!p11.isVisible()) {
            v0_17 = 8;
        } else {
            v0_17 = 0;
        }
        int v0_12;
        this.setVisibility(v0_17);
        this.setTitle(p11.e);
        this.setCheckable(p11.isCheckable());
        if (!v1_9.o()) {
            v0_12 = 0;
        } else {
            int v0_11;
            if (!v1_9.n()) {
                v0_11 = p11.h;
            } else {
                v0_11 = p11.j;
            }
            if (v0_11 == 0) {
            } else {
                v0_12 = 1;
            }
        }
        v1_9.n();
        if (v0_12 == 0) {
            v3 = 8;
        } else {
            int v0_15;
            int v0_13 = this.a;
            String v1_10 = v0_13.n;
            if (!v1_10.o()) {
                v0_15 = 0;
            } else {
                int v0_14;
                if (!v1_10.n()) {
                    v0_14 = v0_13.h;
                } else {
                    v0_14 = v0_13.j;
                }
                if (v0_14 == 0) {
                } else {
                    v0_15 = 1;
                }
            }
            if (v0_15 == 0) {
            }
        }
        if (v3 == 0) {
            char v7_1;
            int v0_16 = this.f;
            String v1_12 = this.a;
            int v5_1 = v1_12.n;
            int v6_0 = v5_1.a;
            if (!v5_1.n()) {
                v7_1 = v1_12.h;
            } else {
                v7_1 = v1_12.j;
            }
            String v1_8;
            if (v7_1 != 0) {
                android.content.res.Resources v8 = v6_0.getResources();
                StringBuilder v9_1 = new StringBuilder();
                if (android.view.ViewConfiguration.get(v6_0).hasPermanentMenuKey()) {
                    v9_1.append(v8.getString(2131951642));
                }
                String v1_13;
                if (!v5_1.n()) {
                    v1_13 = v1_12.i;
                } else {
                    v1_13 = v1_12.k;
                }
                m.o.c(v1_13, 65536, v8.getString(2131951638), v9_1);
                m.o.c(v1_13, 4096, v8.getString(2131951634), v9_1);
                m.o.c(v1_13, 2, v8.getString(2131951633), v9_1);
                m.o.c(v1_13, 1, v8.getString(2131951639), v9_1);
                m.o.c(v1_13, 4, v8.getString(2131951641), v9_1);
                m.o.c(v1_13, 8, v8.getString(2131951637), v9_1);
                if (v7_1 == 8) {
                    v9_1.append(v8.getString(2131951635));
                } else {
                    if (v7_1 == 10) {
                        v9_1.append(v8.getString(2131951636));
                    } else {
                        if (v7_1 == 32) {
                            v9_1.append(v8.getString(2131951640));
                        } else {
                            v9_1.append(v7_1);
                        }
                    }
                }
                v1_8 = v9_1.toString();
            } else {
                v1_8 = "";
            }
            v0_16.setText(v1_8);
        }
        if (this.f.getVisibility() != v3) {
            this.f.setVisibility(v3);
        }
        this.setIcon(p11.getIcon());
        this.setEnabled(p11.isEnabled());
        this.setSubMenuArrowVisible(p11.hasSubMenu());
        this.setContentDescription(p11.q);
        return;
    }

    public final void adjustListItemSelectionBounds(android.graphics.Rect p5)
    {
        int v0_0 = this.n;
        if ((v0_0 != 0) && (v0_0.getVisibility() == 0)) {
            int v0_5 = ((android.widget.LinearLayout$LayoutParams) this.n.getLayoutParams());
            p5.top = (((this.n.getHeight() + v0_5.topMargin) + v0_5.bottomMargin) + p5.top);
        }
        return;
    }

    public m.o getItemData()
    {
        return this.a;
    }

    public final void onFinishInflate()
    {
        super.onFinishInflate();
        this.setBackground(this.p);
        android.widget.LinearLayout v0_15 = ((android.widget.TextView) this.findViewById(2131362518));
        this.d = v0_15;
        int v2 = this.q;
        if (v2 != -1) {
            v0_15.setTextAppearance(this.r, v2);
        }
        this.f = ((android.widget.TextView) this.findViewById(2131362406));
        android.widget.LinearLayout v0_6 = ((android.widget.ImageView) this.findViewById(2131362459));
        this.m = v0_6;
        if (v0_6 != null) {
            v0_6.setImageDrawable(this.t);
        }
        this.n = ((android.widget.ImageView) this.findViewById(2131362093));
        this.o = ((android.widget.LinearLayout) this.findViewById(2131361986));
        return;
    }

    public final void onMeasure(int p4, int p5)
    {
        if ((this.b != null) && (this.s)) {
            android.widget.LinearLayout$LayoutParams v1_2 = ((android.widget.LinearLayout$LayoutParams) this.b.getLayoutParams());
            int v0_1 = this.getLayoutParams().height;
            if ((v0_1 > 0) && (v1_2.width <= 0)) {
                v1_2.width = v0_1;
            }
        }
        super.onMeasure(p4, p5);
        return;
    }

    public void setCheckable(boolean p5)
    {
        if ((p5 != 0) || ((this.c != null) || (this.e != null))) {
            android.widget.RadioButton v1_0;
            android.widget.CheckBox v0_5;
            if ((this.a.x & 4) == 0) {
                if (this.e == null) {
                    android.widget.CheckBox v0_4 = ((android.widget.CheckBox) this.getInflater().inflate(2131558414, this, 0));
                    this.e = v0_4;
                    int v3_1 = this.o;
                    if (v3_1 == 0) {
                        this.addView(v0_4, -1);
                    } else {
                        v3_1.addView(v0_4, -1);
                    }
                }
                v0_5 = this.e;
                v1_0 = this.c;
            } else {
                if (this.c == null) {
                    android.widget.CheckBox v0_10 = ((android.widget.RadioButton) this.getInflater().inflate(2131558417, this, 0));
                    this.c = v0_10;
                    int v3_3 = this.o;
                    if (v3_3 == 0) {
                        this.addView(v0_10, -1);
                    } else {
                        v3_3.addView(v0_10, -1);
                    }
                }
                v0_5 = this.c;
                v1_0 = this.e;
            }
            if (p5 == 0) {
                int v5_1 = this.e;
                if (v5_1 != 0) {
                    v5_1.setVisibility(8);
                }
                int v5_2 = this.c;
                if (v5_2 != 0) {
                    v5_2.setVisibility(8);
                }
            } else {
                v0_5.setChecked(this.a.isChecked());
                if (v0_5.getVisibility() != 0) {
                    v0_5.setVisibility(0);
                }
                if ((v1_0 != null) && (v1_0.getVisibility() != 8)) {
                    v1_0.setVisibility(8);
                    return;
                }
            }
        }
        return;
    }

    public void setChecked(boolean p5)
    {
        android.widget.CheckBox v0_4;
        if ((this.a.x & 4) == 0) {
            if (this.e == null) {
                android.widget.CheckBox v0_3 = ((android.widget.CheckBox) this.getInflater().inflate(2131558414, this, 0));
                this.e = v0_3;
                android.widget.LinearLayout v2_0 = this.o;
                if (v2_0 == null) {
                    this.addView(v0_3, -1);
                } else {
                    v2_0.addView(v0_3, -1);
                }
            }
            v0_4 = this.e;
        } else {
            if (this.c == null) {
                android.widget.CheckBox v0_9 = ((android.widget.RadioButton) this.getInflater().inflate(2131558417, this, 0));
                this.c = v0_9;
                android.widget.LinearLayout v2_1 = this.o;
                if (v2_1 == null) {
                    this.addView(v0_9, -1);
                } else {
                    v2_1.addView(v0_9, -1);
                }
            }
            v0_4 = this.c;
        }
        v0_4.setChecked(p5);
        return;
    }

    public void setForceShowIcon(boolean p1)
    {
        this.w = p1;
        this.s = p1;
        return;
    }

    public void setGroupDividerEnabled(boolean p3)
    {
        android.widget.ImageView v0 = this.n;
        if (v0 != null) {
            if ((this.u) || (p3 == 0)) {
                int v3_1 = 8;
            } else {
                v3_1 = 0;
            }
            v0.setVisibility(v3_1);
        }
        return;
    }

    public void setIcon(android.graphics.drawable.Drawable p5)
    {
        int v0_1 = this.w;
        if ((v0_1 != 0) || (this.s)) {
            android.widget.ImageView v1_6 = this.b;
            if ((v1_6 != null) || ((p5 != null) || (this.s))) {
                if (v1_6 == null) {
                    android.widget.ImageView v1_2 = ((android.widget.ImageView) this.getInflater().inflate(2131558415, this, 0));
                    this.b = v1_2;
                    android.widget.LinearLayout v3_1 = this.o;
                    if (v3_1 == null) {
                        this.addView(v1_2, 0);
                    } else {
                        v3_1.addView(v1_2, 0);
                    }
                }
                if ((p5 == null) && (!this.s)) {
                    this.b.setVisibility(8);
                    return;
                } else {
                    if (v0_1 == 0) {
                        p5 = 0;
                    }
                    this.b.setImageDrawable(p5);
                    if (this.b.getVisibility() != 0) {
                        this.b.setVisibility(0);
                    }
                }
            }
        }
        return;
    }

    public void setTitle(CharSequence p2)
    {
        if (p2 == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(p2);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
                return;
            }
        }
        return;
    }
}
