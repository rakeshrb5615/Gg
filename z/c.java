package z;
public abstract class c extends android.view.View {
    public int[] a;
    public int b;
    public android.content.Context c;
    public w.i d;
    public String e;
    public String f;
    public java.util.HashMap m;

    public final void a(String p6)
    {
        String v0_0 = this.c;
        if ((p6 != null) && ((p6.length() != 0) && (v0_0 != null))) {
            String v1_1;
            String v6_3 = p6.trim();
            if (!(this.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
                v1_1 = 0;
            } else {
                v1_1 = ((androidx.constraintlayout.widget.ConstraintLayout) this.getParent());
            }
            if ((!this.isInEditMode()) || (v1_1 == null)) {
                int v3_5 = 0;
            } else {
                int v3_3;
                if (v6_3 == null) {
                    v3_3 = 0;
                } else {
                    int v3_1 = v1_1.s;
                    if ((v3_1 == 0) || (!v3_1.containsKey(v6_3))) {
                    } else {
                        v3_3 = v1_1.s.get(v6_3);
                    }
                }
                if (!(v3_3 instanceof Integer)) {
                } else {
                    v3_5 = ((Integer) v3_3).intValue();
                }
            }
            if ((v3_5 == 0) && (v1_1 != null)) {
                v3_5 = this.f(v1_1, v6_3);
            }
            try {
                if (v3_5 == 0) {
                    v3_5 = z.q.getField(v6_3).getInt(0);
                }
            } catch (Exception) {
            }
            if (v3_5 == 0) {
                v3_5 = v0_0.getResources().getIdentifier(v6_3, "id", v0_0.getPackageName());
            }
            if (v3_5 == 0) {
                String v0_3 = new StringBuilder("Could not find id of \"");
                v0_3.append(v6_3);
                v0_3.append("\"");
                android.util.Log.w("ConstraintHelper", v0_3.toString());
            } else {
                this.m.put(Integer.valueOf(v3_5), v6_3);
                this.b(v3_5);
            }
        }
        return;
    }

    public final void b(int p4)
    {
        if (p4 != this.getId()) {
            int v1_2 = this.a;
            if ((this.b + 1) > v1_2.length) {
                this.a = java.util.Arrays.copyOf(v1_2, (v1_2.length * 2));
            }
            int v1_0 = this.b;
            this.a[v1_0] = p4;
            this.b = (v1_0 + 1);
            return;
        } else {
            return;
        }
    }

    public final void c(String p8)
    {
        if ((p8 != null) && ((p8.length() != 0) && (this.c != null))) {
            int v0_1;
            String v8_2 = p8.trim();
            if (!(this.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
                v0_1 = 0;
            } else {
                v0_1 = ((androidx.constraintlayout.widget.ConstraintLayout) this.getParent());
            }
            if (v0_1 != 0) {
                int v2 = v0_1.getChildCount();
                int v3 = 0;
                while (v3 < v2) {
                    int v4_0 = v0_1.getChildAt(v3);
                    StringBuilder v5_0 = v4_0.getLayoutParams();
                    if (((v5_0 instanceof z.e)) && (v8_2.equals(((z.e) v5_0).Y))) {
                        if (v4_0.getId() != -1) {
                            this.b(v4_0.getId());
                        } else {
                            StringBuilder v5_6 = new StringBuilder("to use ConstraintTag view ");
                            v5_6.append(v4_0.getClass().getSimpleName());
                            v5_6.append(" must have an ID");
                            android.util.Log.w("ConstraintHelper", v5_6.toString());
                        }
                    }
                    v3++;
                }
            } else {
                android.util.Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
        }
        return;
    }

    public final void d(androidx.constraintlayout.widget.ConstraintLayout p6)
    {
        int v0 = this.getVisibility();
        float v1 = this.getElevation();
        int v2 = 0;
        while (v2 < this.b) {
            android.view.View v3_1 = ((android.view.View) p6.a.get(this.a[v2]));
            if (v3_1 != null) {
                v3_1.setVisibility(v0);
                if (v1 > 0) {
                    v3_1.setTranslationZ((v3_1.getTranslationZ() + v1));
                }
            }
            v2++;
        }
        return;
    }

    public void e(androidx.constraintlayout.widget.ConstraintLayout p1)
    {
        return;
    }

    public final int f(androidx.constraintlayout.widget.ConstraintLayout p8, String p9)
    {
        if (p9 != null) {
            android.content.res.Resources v1_1 = this.c.getResources();
            if (v1_1 != null) {
                int v2 = p8.getChildCount();
                int v3 = 0;
                while (v3 < v2) {
                    android.view.View v4 = p8.getChildAt(v3);
                    if (v4.getId() != -1) {
                        try {
                            boolean v5_2 = v1_1.getResourceEntryName(v4.getId());
                        } catch (android.content.res.Resources$NotFoundException) {
                            v5_2 = 0;
                        }
                        if (p9.equals(v5_2)) {
                            return v4.getId();
                        }
                    }
                    v3++;
                }
            }
        }
        return 0;
    }

    public void g(android.util.AttributeSet p5)
    {
        if (p5 != null) {
            android.content.res.TypedArray v5_1 = this.getContext().obtainStyledAttributes(p5, z.r.b);
            int v0_1 = v5_1.getIndexCount();
            int v1_0 = 0;
            while (v1_0 < v0_1) {
                String v2_0 = v5_1.getIndex(v1_0);
                if (v2_0 != 35) {
                    if (v2_0 == 36) {
                        String v2_1 = v5_1.getString(v2_0);
                        this.f = v2_1;
                        this.setReferenceTags(v2_1);
                    }
                } else {
                    String v2_2 = v5_1.getString(v2_0);
                    this.e = v2_2;
                    this.setIds(v2_2);
                }
                v1_0++;
            }
            v5_1.recycle();
        }
        return;
    }

    public int[] getReferencedIds()
    {
        return java.util.Arrays.copyOf(this.a, this.b);
    }

    public abstract void h();

    public final void i()
    {
        if (this.d != null) {
            z.e v0_1 = this.getLayoutParams();
            if ((v0_1 instanceof z.e)) {
                ((z.e) v0_1).p0 = this.d;
            }
        }
        return;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String v0_0 = this.e;
        if (v0_0 != null) {
            this.setIds(v0_0);
        }
        String v0_1 = this.f;
        if (v0_1 != null) {
            this.setReferenceTags(v0_1);
        }
        return;
    }

    public final void onDraw(android.graphics.Canvas p1)
    {
        return;
    }

    public void onMeasure(int p1, int p2)
    {
        this.setMeasuredDimension(0, 0);
        return;
    }

    public void setIds(String p4)
    {
        this.e = p4;
        if (p4 != null) {
            int v0_1 = 0;
            this.b = 0;
            while(true) {
                int v1_1 = p4.indexOf(44, v0_1);
                if (v1_1 == -1) {
                    break;
                }
                this.a(p4.substring(v0_1, v1_1));
                v0_1 = (v1_1 + 1);
            }
            this.a(p4.substring(v0_1));
            return;
        } else {
            return;
        }
    }

    public void setReferenceTags(String p4)
    {
        this.f = p4;
        if (p4 != null) {
            int v0_1 = 0;
            this.b = 0;
            while(true) {
                int v1_1 = p4.indexOf(44, v0_1);
                if (v1_1 == -1) {
                    break;
                }
                this.c(p4.substring(v0_1, v1_1));
                v0_1 = (v1_1 + 1);
            }
            this.c(p4.substring(v0_1));
            return;
        } else {
            return;
        }
    }

    public void setReferencedIds(int[] p3)
    {
        this.e = 0;
        int v0_1 = 0;
        this.b = 0;
        while (v0_1 < p3.length) {
            this.b(p3[v0_1]);
            v0_1++;
        }
        return;
    }

    public final void setTag(int p1, Object p2)
    {
        super.setTag(p1, p2);
        if ((p2 == null) && (this.e == null)) {
            this.b(p1);
        }
        return;
    }
}
