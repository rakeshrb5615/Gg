package androidx.constraintlayout.widget;
public class ConstraintLayout extends android.view.ViewGroup {
    public static z.s v;
    public final android.util.SparseArray a;
    public final java.util.ArrayList b;
    public final w.e c;
    public int d;
    public int e;
    public int f;
    public int m;
    public boolean n;
    public int o;
    public z.n p;
    public n0.a q;
    public int r;
    public java.util.HashMap s;
    public final android.util.SparseArray t;
    public final z.f u;

    public ConstraintLayout(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3);
        super.a = new android.util.SparseArray();
        super.b = new java.util.ArrayList(4);
        super.c = new w.e();
        super.d = 0;
        super.e = 0;
        super.f = 2147483647;
        super.m = 2147483647;
        super.n = 1;
        super.o = 257;
        super.p = 0;
        super.q = 0;
        super.r = -1;
        super.s = new java.util.HashMap();
        super.t = new android.util.SparseArray();
        super.u = new z.f(super, super);
        super.i(p3, 0);
        return;
    }

    public ConstraintLayout(android.content.Context p2, android.util.AttributeSet p3, int p4)
    {
        super(p2, p3, p4);
        super.a = new android.util.SparseArray();
        super.b = new java.util.ArrayList(4);
        super.c = new w.e();
        super.d = 0;
        super.e = 0;
        super.f = 2147483647;
        super.m = 2147483647;
        super.n = 1;
        super.o = 257;
        super.p = 0;
        super.q = 0;
        super.r = -1;
        super.s = new java.util.HashMap();
        super.t = new android.util.SparseArray();
        super.u = new z.f(super, super);
        super.i(p3, p4);
        return;
    }

    public static z.e g()
    {
        z.e v0_1 = new z.e(-2, -2);
        v0_1.a = -1;
        v0_1.b = -1;
        v0_1.c = -1082130432;
        v0_1.d = 1;
        v0_1.e = -1;
        v0_1.f = -1;
        v0_1.g = -1;
        v0_1.h = -1;
        v0_1.i = -1;
        v0_1.j = -1;
        v0_1.k = -1;
        v0_1.l = -1;
        v0_1.m = -1;
        v0_1.n = -1;
        v0_1.o = -1;
        v0_1.p = -1;
        v0_1.q = 0;
        v0_1.r = 0;
        v0_1.s = -1;
        v0_1.t = -1;
        v0_1.u = -1;
        v0_1.v = -1;
        v0_1.w = -2147483648;
        v0_1.x = -2147483648;
        v0_1.y = -2147483648;
        v0_1.z = -2147483648;
        v0_1.A = -2147483648;
        v0_1.B = -2147483648;
        v0_1.C = -2147483648;
        v0_1.D = 0;
        v0_1.E = 1056964608;
        v0_1.F = 1056964608;
        v0_1.G = 0;
        v0_1.H = -1082130432;
        v0_1.I = -1082130432;
        v0_1.J = 0;
        v0_1.K = 0;
        v0_1.L = 0;
        v0_1.M = 0;
        v0_1.N = 0;
        v0_1.O = 0;
        v0_1.P = 0;
        v0_1.Q = 0;
        v0_1.R = 1065353216;
        v0_1.S = 1065353216;
        v0_1.T = -1;
        v0_1.U = -1;
        v0_1.V = -1;
        v0_1.W = 0;
        v0_1.X = 0;
        v0_1.Y = 0;
        v0_1.Z = 0;
        v0_1.a0 = 1;
        v0_1.b0 = 1;
        v0_1.c0 = 0;
        v0_1.d0 = 0;
        v0_1.e0 = 0;
        v0_1.f0 = -1;
        v0_1.g0 = -1;
        v0_1.h0 = -1;
        v0_1.i0 = -1;
        v0_1.j0 = -2147483648;
        v0_1.k0 = -2147483648;
        v0_1.l0 = 1056964608;
        v0_1.p0 = new w.d();
        return v0_1;
    }

    private int getPaddingWidth()
    {
        int v2_2 = (Math.max(0, this.getPaddingRight()) + Math.max(0, this.getPaddingLeft()));
        int v1_1 = (Math.max(0, this.getPaddingEnd()) + Math.max(0, this.getPaddingStart()));
        if (v1_1 <= 0) {
            return v2_2;
        } else {
            return v1_1;
        }
    }

    public static z.s getSharedValues()
    {
        if (androidx.constraintlayout.widget.ConstraintLayout.v == null) {
            z.s v0_2 = new z.s();
            new android.util.SparseIntArray();
            new java.util.HashMap();
            androidx.constraintlayout.widget.ConstraintLayout.v = v0_2;
        }
        return androidx.constraintlayout.widget.ConstraintLayout.v;
    }

    public final boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return (p1 instanceof z.e);
    }

    public final void dispatchDraw(android.graphics.Canvas p18)
    {
        float v2_3 = this.b;
        if (v2_3 != 0) {
            float v3_2 = v2_3.size();
            if (v3_2 > 0) {
                int v4_0 = 0;
                while (v4_0 < v3_2) {
                    ((z.c) v2_3.get(v4_0)).getClass();
                    v4_0++;
                }
            }
        }
        super.dispatchDraw(p18);
        if (this.isInEditMode()) {
            float v2_2 = ((float) this.getWidth());
            float v3_1 = ((float) this.getHeight());
            int v4_1 = this.getChildCount();
            int v5_0 = 0;
            while (v5_0 < v4_1) {
                int v6_1 = this.getChildAt(v5_0);
                if (v6_1.getVisibility() != 8) {
                    int v6_2 = v6_1.getTag();
                    if ((v6_2 != 0) && ((v6_2 instanceof String))) {
                        int v6_4 = ((String) v6_2).split(",");
                        if (v6_4.length == 4) {
                            float v7_9 = ((int) ((((float) Integer.parseInt(v6_4[0])) / 1149698048) * v2_2));
                            int v8_8 = ((int) ((((float) Integer.parseInt(v6_4[1])) / 1156579328) * v3_1));
                            int v9_6 = ((int) ((((float) Integer.parseInt(v6_4[2])) / 1149698048) * v2_2));
                            int v6_10 = ((int) ((((float) Integer.parseInt(v6_4[3])) / 1156579328) * v3_1));
                            android.graphics.Paint v15_1 = new android.graphics.Paint();
                            v15_1.setColor(-65536);
                            float v11_1 = ((float) v7_9);
                            float v12_2 = ((float) v8_8);
                            float v13_1 = ((float) (v7_9 + v9_6));
                            p18.drawLine(v11_1, v12_2, v13_1, v12_2, v15_1);
                            float v7_11 = v11_1;
                            float v14_3 = ((float) (v8_8 + v6_10));
                            float v11_2 = v13_1;
                            p18.drawLine(v11_2, v12_2, v13_1, v14_3, v15_1);
                            int v6_11 = v12_2;
                            float v12_3 = v14_3;
                            float v13_2 = v7_11;
                            p18.drawLine(v11_2, v12_3, v13_2, v14_3, v15_1);
                            float v7_12 = v11_2;
                            float v11_3 = v13_2;
                            float v14_4 = v6_11;
                            p18.drawLine(v11_3, v12_3, v13_2, v14_4, v15_1);
                            float v14_0 = v12_3;
                            float v12_0 = v14_4;
                            v15_1.setColor(-16711936);
                            float v13_0 = v7_12;
                            p18.drawLine(v11_3, v12_0, v13_0, v14_0, v15_1);
                            p18.drawLine(v11_3, v14_0, v13_0, v12_0, v15_1);
                        }
                    }
                }
                v5_0++;
            }
        }
        return;
    }

    public final void forceLayout()
    {
        this.n = 1;
        super.forceLayout();
        return;
    }

    public final bridge synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return androidx.constraintlayout.widget.ConstraintLayout.g();
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p13)
    {
        int v1_0 = this.getContext();
        z.e v0_1 = new z.e(v1_0, p13);
        v0_1.a = -1;
        v0_1.b = -1;
        v0_1.c = -1082130432;
        v0_1.d = 1;
        v0_1.e = -1;
        v0_1.f = -1;
        v0_1.g = -1;
        v0_1.h = -1;
        v0_1.i = -1;
        v0_1.j = -1;
        v0_1.k = -1;
        v0_1.l = -1;
        v0_1.m = -1;
        v0_1.n = -1;
        v0_1.o = -1;
        v0_1.p = -1;
        v0_1.q = 0;
        v0_1.r = 0;
        v0_1.s = -1;
        v0_1.t = -1;
        v0_1.u = -1;
        v0_1.v = -1;
        v0_1.w = -2147483648;
        v0_1.x = -2147483648;
        v0_1.y = -2147483648;
        v0_1.z = -2147483648;
        v0_1.A = -2147483648;
        v0_1.B = -2147483648;
        v0_1.C = -2147483648;
        v0_1.D = 0;
        v0_1.E = 1056964608;
        v0_1.F = 1056964608;
        v0_1.G = 0;
        v0_1.H = -1082130432;
        v0_1.I = -1082130432;
        v0_1.J = 0;
        v0_1.K = 0;
        v0_1.L = 0;
        v0_1.M = 0;
        v0_1.N = 0;
        v0_1.O = 0;
        v0_1.P = 0;
        v0_1.Q = 0;
        v0_1.R = 1065353216;
        v0_1.S = 1065353216;
        v0_1.T = -1;
        v0_1.U = -1;
        v0_1.V = -1;
        v0_1.W = 0;
        v0_1.X = 0;
        v0_1.Y = 0;
        v0_1.Z = 0;
        v0_1.a0 = 1;
        v0_1.b0 = 1;
        v0_1.c0 = 0;
        v0_1.d0 = 0;
        v0_1.e0 = 0;
        v0_1.f0 = -1;
        v0_1.g0 = -1;
        v0_1.h0 = -1;
        v0_1.i0 = -1;
        v0_1.j0 = -2147483648;
        v0_1.k0 = -2147483648;
        v0_1.l0 = 1056964608;
        v0_1.p0 = new w.d();
        android.content.res.TypedArray v13_1 = v1_0.obtainStyledAttributes(p13, z.r.b);
        int v1_1 = v13_1.getIndexCount();
        int v3_0 = 0;
        while (v3_0 < v1_1) {
            int v7_60 = v13_1.getIndex(v3_0);
            boolean v8_72 = z.d.a.get(v7_60);
            switch (v8_72) {
                case 1:
                    v0_1.V = v13_1.getInt(v7_60, v0_1.V);
                    break;
                case 2:
                    boolean v8_56 = v13_1.getResourceId(v7_60, v0_1.p);
                    v0_1.p = v8_56;
                    if (v8_56 != -1) {
                    } else {
                        v0_1.p = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 3:
                    v0_1.q = v13_1.getDimensionPixelSize(v7_60, v0_1.q);
                    break;
                case 4:
                    int v7_40 = (v13_1.getFloat(v7_60, v0_1.r) % 1135869952);
                    v0_1.r = v7_40;
                    if (v7_40 >= 0) {
                    } else {
                        v0_1.r = ((1135869952 - v7_40) % 1135869952);
                    }
                    break;
                case 5:
                    v0_1.a = v13_1.getDimensionPixelOffset(v7_60, v0_1.a);
                    break;
                case 6:
                    v0_1.b = v13_1.getDimensionPixelOffset(v7_60, v0_1.b);
                    break;
                case 7:
                    v0_1.c = v13_1.getFloat(v7_60, v0_1.c);
                    break;
                case 8:
                    boolean v8_48 = v13_1.getResourceId(v7_60, v0_1.e);
                    v0_1.e = v8_48;
                    if (v8_48 != -1) {
                    } else {
                        v0_1.e = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 9:
                    boolean v8_46 = v13_1.getResourceId(v7_60, v0_1.f);
                    v0_1.f = v8_46;
                    if (v8_46 != -1) {
                    } else {
                        v0_1.f = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 10:
                    boolean v8_44 = v13_1.getResourceId(v7_60, v0_1.g);
                    v0_1.g = v8_44;
                    if (v8_44 != -1) {
                    } else {
                        v0_1.g = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 11:
                    boolean v8_42 = v13_1.getResourceId(v7_60, v0_1.h);
                    v0_1.h = v8_42;
                    if (v8_42 != -1) {
                    } else {
                        v0_1.h = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 12:
                    boolean v8_40 = v13_1.getResourceId(v7_60, v0_1.i);
                    v0_1.i = v8_40;
                    if (v8_40 != -1) {
                    } else {
                        v0_1.i = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 13:
                    boolean v8_38 = v13_1.getResourceId(v7_60, v0_1.j);
                    v0_1.j = v8_38;
                    if (v8_38 != -1) {
                    } else {
                        v0_1.j = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 14:
                    boolean v8_36 = v13_1.getResourceId(v7_60, v0_1.k);
                    v0_1.k = v8_36;
                    if (v8_36 != -1) {
                    } else {
                        v0_1.k = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 15:
                    boolean v8_34 = v13_1.getResourceId(v7_60, v0_1.l);
                    v0_1.l = v8_34;
                    if (v8_34 != -1) {
                    } else {
                        v0_1.l = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 16:
                    boolean v8_32 = v13_1.getResourceId(v7_60, v0_1.m);
                    v0_1.m = v8_32;
                    if (v8_32 != -1) {
                    } else {
                        v0_1.m = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 17:
                    boolean v8_30 = v13_1.getResourceId(v7_60, v0_1.s);
                    v0_1.s = v8_30;
                    if (v8_30 != -1) {
                    } else {
                        v0_1.s = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 18:
                    boolean v8_28 = v13_1.getResourceId(v7_60, v0_1.t);
                    v0_1.t = v8_28;
                    if (v8_28 != -1) {
                    } else {
                        v0_1.t = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 19:
                    boolean v8_26 = v13_1.getResourceId(v7_60, v0_1.u);
                    v0_1.u = v8_26;
                    if (v8_26 != -1) {
                    } else {
                        v0_1.u = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 20:
                    boolean v8_24 = v13_1.getResourceId(v7_60, v0_1.v);
                    v0_1.v = v8_24;
                    if (v8_24 != -1) {
                    } else {
                        v0_1.v = v13_1.getInt(v7_60, -1);
                    }
                    break;
                case 21:
                    v0_1.w = v13_1.getDimensionPixelSize(v7_60, v0_1.w);
                    break;
                case 22:
                    v0_1.x = v13_1.getDimensionPixelSize(v7_60, v0_1.x);
                    break;
                case 23:
                    v0_1.y = v13_1.getDimensionPixelSize(v7_60, v0_1.y);
                    break;
                case 24:
                    v0_1.z = v13_1.getDimensionPixelSize(v7_60, v0_1.z);
                    break;
                case 25:
                    v0_1.A = v13_1.getDimensionPixelSize(v7_60, v0_1.A);
                    break;
                case 26:
                    v0_1.B = v13_1.getDimensionPixelSize(v7_60, v0_1.B);
                    break;
                case 27:
                    v0_1.W = v13_1.getBoolean(v7_60, v0_1.W);
                    break;
                case 28:
                    v0_1.X = v13_1.getBoolean(v7_60, v0_1.X);
                    break;
                case 29:
                    v0_1.E = v13_1.getFloat(v7_60, v0_1.E);
                    break;
                case 30:
                    v0_1.F = v13_1.getFloat(v7_60, v0_1.F);
                    break;
                case 31:
                    int v7_10 = v13_1.getInt(v7_60, 0);
                    v0_1.L = v7_10;
                    if (v7_10 != 1) {
                    } else {
                        android.util.Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int v7_8 = v13_1.getInt(v7_60, 0);
                    v0_1.M = v7_8;
                    if (v7_8 != 1) {
                    } else {
                        android.util.Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        v0_1.N = v13_1.getDimensionPixelSize(v7_60, v0_1.N);
                    } catch (Exception) {
                        if (v13_1.getInt(v7_60, v0_1.N) != -2) {
                        } else {
                            v0_1.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        v0_1.P = v13_1.getDimensionPixelSize(v7_60, v0_1.P);
                    } catch (Exception) {
                        if (v13_1.getInt(v7_60, v0_1.P) != -2) {
                        } else {
                            v0_1.P = -2;
                        }
                    }
                    break;
                case 35:
                    v0_1.R = Math.max(0, v13_1.getFloat(v7_60, v0_1.R));
                    v0_1.L = 2;
                    break;
                case 36:
                    try {
                        v0_1.O = v13_1.getDimensionPixelSize(v7_60, v0_1.O);
                    } catch (Exception) {
                        if (v13_1.getInt(v7_60, v0_1.O) != -2) {
                        } else {
                            v0_1.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        v0_1.Q = v13_1.getDimensionPixelSize(v7_60, v0_1.Q);
                    } catch (Exception) {
                        if (v13_1.getInt(v7_60, v0_1.Q) != -2) {
                        } else {
                            v0_1.Q = -2;
                        }
                    }
                    break;
                case 38:
                    v0_1.S = Math.max(0, v13_1.getFloat(v7_60, v0_1.S));
                    v0_1.M = 2;
                    break;
                default:
                    switch (v8_72) {
                        case 44:
                            z.n.h(v0_1, v13_1.getString(v7_60));
                            break;
                        case 45:
                            v0_1.H = v13_1.getFloat(v7_60, v0_1.H);
                            break;
                        case 46:
                            v0_1.I = v13_1.getFloat(v7_60, v0_1.I);
                            break;
                        case 47:
                            v0_1.J = v13_1.getInt(v7_60, 0);
                            break;
                        case 48:
                            v0_1.K = v13_1.getInt(v7_60, 0);
                            break;
                        case 49:
                            v0_1.T = v13_1.getDimensionPixelOffset(v7_60, v0_1.T);
                            break;
                        case 50:
                            v0_1.U = v13_1.getDimensionPixelOffset(v7_60, v0_1.U);
                            break;
                        case 51:
                            v0_1.Y = v13_1.getString(v7_60);
                            break;
                        case 52:
                            boolean v8_63 = v13_1.getResourceId(v7_60, v0_1.n);
                            v0_1.n = v8_63;
                            if (v8_63 != -1) {
                            } else {
                                v0_1.n = v13_1.getInt(v7_60, -1);
                            }
                            break;
                        case 53:
                            boolean v8_61 = v13_1.getResourceId(v7_60, v0_1.o);
                            v0_1.o = v8_61;
                            if (v8_61 != -1) {
                            } else {
                                v0_1.o = v13_1.getInt(v7_60, -1);
                            }
                            break;
                        case 54:
                            v0_1.D = v13_1.getDimensionPixelSize(v7_60, v0_1.D);
                            break;
                        case 55:
                            v0_1.C = v13_1.getDimensionPixelSize(v7_60, v0_1.C);
                            break;
                        default:
                            switch (v8_72) {
                                case 64:
                                    z.n.g(v0_1, v13_1, v7_60, 0);
                                    break;
                                case 65:
                                    z.n.g(v0_1, v13_1, v7_60, 1);
                                    break;
                                case 66:
                                    v0_1.Z = v13_1.getInt(v7_60, v0_1.Z);
                                    break;
                                case 67:
                                    v0_1.d = v13_1.getBoolean(v7_60, v0_1.d);
                                    break;
                                default:
                            }
                    }
            }
            v3_0++;
        }
        v13_1.recycle();
        v0_1.a();
        return v0_1;
    }

    public final android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p9)
    {
        z.e v0_1 = new z.e(p9);
        v0_1.a = -1;
        v0_1.b = -1;
        v0_1.c = -1082130432;
        v0_1.d = 1;
        v0_1.e = -1;
        v0_1.f = -1;
        v0_1.g = -1;
        v0_1.h = -1;
        v0_1.i = -1;
        v0_1.j = -1;
        v0_1.k = -1;
        v0_1.l = -1;
        v0_1.m = -1;
        v0_1.n = -1;
        v0_1.o = -1;
        v0_1.p = -1;
        v0_1.q = 0;
        v0_1.r = 0;
        v0_1.s = -1;
        v0_1.t = -1;
        v0_1.u = -1;
        v0_1.v = -1;
        v0_1.w = -2147483648;
        v0_1.x = -2147483648;
        v0_1.y = -2147483648;
        v0_1.z = -2147483648;
        v0_1.A = -2147483648;
        v0_1.B = -2147483648;
        v0_1.C = -2147483648;
        v0_1.D = 0;
        v0_1.E = 1056964608;
        v0_1.F = 1056964608;
        v0_1.G = 0;
        v0_1.H = -1082130432;
        v0_1.I = -1082130432;
        v0_1.J = 0;
        v0_1.K = 0;
        v0_1.L = 0;
        v0_1.M = 0;
        v0_1.N = 0;
        v0_1.O = 0;
        v0_1.P = 0;
        v0_1.Q = 0;
        v0_1.R = 1065353216;
        v0_1.S = 1065353216;
        v0_1.T = -1;
        v0_1.U = -1;
        v0_1.V = -1;
        v0_1.W = 0;
        v0_1.X = 0;
        v0_1.Y = 0;
        v0_1.Z = 0;
        v0_1.a0 = 1;
        v0_1.b0 = 1;
        v0_1.c0 = 0;
        v0_1.d0 = 0;
        v0_1.e0 = 0;
        v0_1.f0 = -1;
        v0_1.g0 = -1;
        v0_1.h0 = -1;
        v0_1.i0 = -1;
        v0_1.j0 = -2147483648;
        v0_1.k0 = -2147483648;
        v0_1.l0 = 1056964608;
        v0_1.p0 = new w.d();
        if ((p9 instanceof android.view.ViewGroup$MarginLayoutParams)) {
            v0_1.leftMargin = ((android.view.ViewGroup$MarginLayoutParams) p9).leftMargin;
            v0_1.rightMargin = ((android.view.ViewGroup$MarginLayoutParams) p9).rightMargin;
            v0_1.topMargin = ((android.view.ViewGroup$MarginLayoutParams) p9).topMargin;
            v0_1.bottomMargin = ((android.view.ViewGroup$MarginLayoutParams) p9).bottomMargin;
            v0_1.setMarginStart(((android.view.ViewGroup$MarginLayoutParams) p9).getMarginStart());
            v0_1.setMarginEnd(((android.view.ViewGroup$MarginLayoutParams) p9).getMarginEnd());
        }
        if ((p9 instanceof z.e)) {
            v0_1.a = ((z.e) p9).a;
            v0_1.b = ((z.e) p9).b;
            v0_1.c = ((z.e) p9).c;
            v0_1.d = ((z.e) p9).d;
            v0_1.e = ((z.e) p9).e;
            v0_1.f = ((z.e) p9).f;
            v0_1.g = ((z.e) p9).g;
            v0_1.h = ((z.e) p9).h;
            v0_1.i = ((z.e) p9).i;
            v0_1.j = ((z.e) p9).j;
            v0_1.k = ((z.e) p9).k;
            v0_1.l = ((z.e) p9).l;
            v0_1.m = ((z.e) p9).m;
            v0_1.n = ((z.e) p9).n;
            v0_1.o = ((z.e) p9).o;
            v0_1.p = ((z.e) p9).p;
            v0_1.q = ((z.e) p9).q;
            v0_1.r = ((z.e) p9).r;
            v0_1.s = ((z.e) p9).s;
            v0_1.t = ((z.e) p9).t;
            v0_1.u = ((z.e) p9).u;
            v0_1.v = ((z.e) p9).v;
            v0_1.w = ((z.e) p9).w;
            v0_1.x = ((z.e) p9).x;
            v0_1.y = ((z.e) p9).y;
            v0_1.z = ((z.e) p9).z;
            v0_1.A = ((z.e) p9).A;
            v0_1.B = ((z.e) p9).B;
            v0_1.C = ((z.e) p9).C;
            v0_1.D = ((z.e) p9).D;
            v0_1.E = ((z.e) p9).E;
            v0_1.F = ((z.e) p9).F;
            v0_1.G = ((z.e) p9).G;
            v0_1.H = ((z.e) p9).H;
            v0_1.I = ((z.e) p9).I;
            v0_1.J = ((z.e) p9).J;
            v0_1.K = ((z.e) p9).K;
            v0_1.W = ((z.e) p9).W;
            v0_1.X = ((z.e) p9).X;
            v0_1.L = ((z.e) p9).L;
            v0_1.M = ((z.e) p9).M;
            v0_1.N = ((z.e) p9).N;
            v0_1.P = ((z.e) p9).P;
            v0_1.O = ((z.e) p9).O;
            v0_1.Q = ((z.e) p9).Q;
            v0_1.R = ((z.e) p9).R;
            v0_1.S = ((z.e) p9).S;
            v0_1.T = ((z.e) p9).T;
            v0_1.U = ((z.e) p9).U;
            v0_1.V = ((z.e) p9).V;
            v0_1.a0 = ((z.e) p9).a0;
            v0_1.b0 = ((z.e) p9).b0;
            v0_1.c0 = ((z.e) p9).c0;
            v0_1.d0 = ((z.e) p9).d0;
            v0_1.f0 = ((z.e) p9).f0;
            v0_1.g0 = ((z.e) p9).g0;
            v0_1.h0 = ((z.e) p9).h0;
            v0_1.i0 = ((z.e) p9).i0;
            v0_1.j0 = ((z.e) p9).j0;
            v0_1.k0 = ((z.e) p9).k0;
            v0_1.l0 = ((z.e) p9).l0;
            v0_1.Y = ((z.e) p9).Y;
            v0_1.Z = ((z.e) p9).Z;
            v0_1.p0 = ((z.e) p9).p0;
            return v0_1;
        } else {
            return v0_1;
        }
    }

    public int getMaxHeight()
    {
        return this.m;
    }

    public int getMaxWidth()
    {
        return this.f;
    }

    public int getMinHeight()
    {
        return this.e;
    }

    public int getMinWidth()
    {
        return this.d;
    }

    public int getOptimizationLevel()
    {
        return this.c.D0;
    }

    public String getSceneString()
    {
        String v0_1 = new StringBuilder();
        w.e v1 = this.c;
        if (v1.j == null) {
            java.util.ArrayList v2_8 = this.getId();
            if (v2_8 == -1) {
                v1.j = "parent";
            } else {
                v1.j = this.getContext().getResources().getResourceEntryName(v2_8);
            }
        }
        if (v1.h0 == null) {
            v1.h0 = v1.j;
            java.util.ArrayList v2_4 = new StringBuilder(" setDebugName ");
            v2_4.append(v1.h0);
            android.util.Log.v("ConstraintLayout", v2_4.toString());
        }
        java.util.ArrayList v2_7 = v1.q0;
        int v6_1 = v2_7.size();
        int v7 = 0;
        while (v7 < v6_1) {
            String v8_0 = v2_7.get(v7);
            v7++;
            String v8_1 = ((w.d) v8_0);
            StringBuilder v9_0 = v8_1.f0;
            if (v9_0 != null) {
                if (v8_1.j == null) {
                    StringBuilder v9_1 = v9_0.getId();
                    if (v9_1 != -1) {
                        v8_1.j = this.getContext().getResources().getResourceEntryName(v9_1);
                    }
                }
                if (v8_1.h0 == null) {
                    v8_1.h0 = v8_1.j;
                    StringBuilder v9_6 = new StringBuilder(" setDebugName ");
                    v9_6.append(v8_1.h0);
                    android.util.Log.v("ConstraintLayout", v9_6.toString());
                }
            }
        }
        v1.n(v0_1);
        return v0_1.toString();
    }

    public final w.d h(android.view.View p2)
    {
        if (p2 != this) {
            if (p2 != null) {
                if (!(p2.getLayoutParams() instanceof z.e)) {
                    p2.setLayoutParams(this.generateLayoutParams(p2.getLayoutParams()));
                    if ((p2.getLayoutParams() instanceof z.e)) {
                        return ((z.e) p2.getLayoutParams()).p0;
                    }
                } else {
                    return ((z.e) p2.getLayoutParams()).p0;
                }
            }
            return 0;
        } else {
            return this.c;
        }
    }

    public final void i(android.util.AttributeSet p8, int p9)
    {
        w.e v0 = this.c;
        v0.f0 = this;
        int v1_1 = this.u;
        v0.u0 = v1_1;
        v0.s0.f = v1_1;
        this.a.put(this.getId(), this);
        this.p = 0;
        if (p8) {
            boolean v8_1 = this.getContext().obtainStyledAttributes(p8, z.r.b, p9, 0);
            int v9_1 = v8_1.getIndexCount();
            int v2_1 = 0;
            while (v2_1 < v9_1) {
                int v3_1 = v8_1.getIndex(v2_1);
                if (v3_1 != 16) {
                    if (v3_1 != 17) {
                        if (v3_1 != 14) {
                            if (v3_1 != 15) {
                                if (v3_1 != 113) {
                                    if (v3_1 != 56) {
                                        if (v3_1 == 34) {
                                            int v3_2 = v8_1.getResourceId(v3_1, 0);
                                            try {
                                                z.n v5_8 = new z.n();
                                                this.p = v5_8;
                                                v5_8.e(this.getContext(), v3_2);
                                            } catch (android.content.res.Resources$NotFoundException) {
                                                this.p = 0;
                                            }
                                            this.r = v3_2;
                                        }
                                    } else {
                                        int v3_3 = v8_1.getResourceId(v3_1, 0);
                                        if (v3_3 != 0) {
                                            try {
                                                this.j(v3_3);
                                            } catch (android.content.res.Resources$NotFoundException) {
                                                this.q = 0;
                                            }
                                        }
                                    }
                                } else {
                                    this.o = v8_1.getInt(v3_1, this.o);
                                }
                            } else {
                                this.m = v8_1.getDimensionPixelOffset(v3_1, this.m);
                            }
                        } else {
                            this.f = v8_1.getDimensionPixelOffset(v3_1, this.f);
                        }
                    } else {
                        this.e = v8_1.getDimensionPixelOffset(v3_1, this.e);
                    }
                } else {
                    this.d = v8_1.getDimensionPixelOffset(v3_1, this.d);
                }
                v2_1++;
            }
            v8_1.recycle();
        }
        v0.D0 = this.o;
        u.c.q = v0.W(512);
        return;
    }

    public final void j(int p9)
    {
        java.io.IOException v1_0 = this.getContext();
        n0.a v0_1 = new n0.a(12);
        v0_1.b = new android.util.SparseArray();
        v0_1.c = new android.util.SparseArray();
        StringBuilder v4_1 = v1_0.getResources().getXml(p9);
        z.g v5_0 = v4_1.getEventType();
        e3.b v6_0 = 0;
        while (v5_0 != 1) {
            if (v5_0 == 2) {
                java.util.ArrayList v7_6;
                z.g v5_1 = v4_1.getName();
                switch (v5_1.hashCode()) {
                    case -1349929691:
                        if (v5_1.equals("ConstraintSet")) {
                            v0_1.l(v1_0, v4_1);
                        }
                        break;
                    case 80204913:
                        if (v5_1.equals("State")) {
                            z.g v5_7 = new e3.b(v1_0, v4_1);
                            ((android.util.SparseArray) v0_1.b).put(v5_7.a, v5_7);
                            v6_0 = v5_7;
                        }
                        break;
                    case 1382829617:
                        v7_6 = "StateSet";
                        break;
                    case 1657696882:
                        v7_6 = "layoutDescription";
                        break;
                    case 1901439077:
                        if (v5_1.equals("Variant")) {
                            z.g v5_4 = new z.g(v1_0, v4_1);
                            if (v6_0 != null) {
                                ((java.util.ArrayList) v6_0.c).add(v5_4);
                            }
                        }
                        break;
                    default:
                }
                v5_1.equals(v7_6);
            } else {
            }
            v5_0 = v4_1.next();
        }
        this.q = v0_1;
        return;
    }

    public final void k(w.e p29, int p30, int p31, int p32)
    {
        int v3_0 = android.view.View$MeasureSpec.getMode(p31);
        int v4_14 = android.view.View$MeasureSpec.getSize(p31);
        int v5_6 = android.view.View$MeasureSpec.getMode(p32);
        int v6_0 = android.view.View$MeasureSpec.getSize(p32);
        b8.g v7_1 = Math.max(0, this.getPaddingTop());
        int v9_3 = Math.max(0, this.getPaddingBottom());
        int v10_8 = (v7_1 + v9_3);
        boolean v11_1 = this.getPaddingWidth();
        w.d v12_10 = this.u;
        v12_10.b = v7_1;
        v12_10.c = v9_3;
        v12_10.d = v11_1;
        v12_10.e = v10_8;
        v12_10.f = p31;
        v12_10.g = p32;
        int v9_7 = Math.max(0, this.getPaddingStart());
        int v13_3 = Math.max(0, this.getPaddingEnd());
        int v14_1 = 1;
        if ((v9_7 <= 0) && (v13_3 <= 0)) {
            v9_7 = Math.max(0, this.getPaddingLeft());
        } else {
            if (((this.getContext().getApplicationInfo().flags & 4194304) != 0) && (1 == this.getLayoutDirection())) {
                v9_7 = v13_3;
            }
        }
        int v17_3;
        int v14_3;
        int v4_13 = (v4_14 - v11_1);
        int v6_30 = (v6_0 - v10_8);
        int v10_44 = v12_10.e;
        boolean v11_9 = v12_10.d;
        w.d v12_20 = this.getChildCount();
        if (v3_0 == -2147483648) {
            if (v12_20 != null) {
                v17_3 = v4_13;
                v14_1 = 2;
            } else {
                v14_3 = Math.max(0, this.d);
                v17_3 = v14_3;
            }
        } else {
            if (v3_0 == 0) {
                if (v12_20 != null) {
                    v17_3 = 0;
                } else {
                    v14_3 = Math.max(0, this.d);
                }
            } else {
                if (v3_0 == 1073741824) {
                    v17_3 = Math.min((this.f - v11_9), v4_13);
                    v14_1 = 1;
                } else {
                    v17_3 = 0;
                }
            }
        }
        int v13_0;
        w.d v12_1;
        w.d v12_0;
        if (v5_6 == -2147483648) {
            if (v12_20 != null) {
                v13_0 = v6_30;
                v12_1 = 2;
            } else {
                v12_0 = Math.max(0, this.e);
                v13_0 = v12_0;
            }
        } else {
            if (v5_6 == 0) {
                if (v12_20 != null) {
                    v13_0 = 0;
                } else {
                    v12_0 = Math.max(0, this.e);
                }
            } else {
                if (v5_6 == 1073741824) {
                    v13_0 = Math.min((this.m - v10_44), v6_30);
                } else {
                    v13_0 = 0;
                }
                v12_1 = 1;
            }
        }
        int v32_1;
        int v8_0 = p29.s0;
        int v19_0 = v10_44;
        boolean v20_0 = p29.C;
        int v10_1 = v17_3;
        if ((v10_1 == p29.q()) && (v13_0 == p29.k())) {
            v32_1 = 1;
        } else {
            v8_0.c = 1;
            v32_1 = 1;
        }
        p29.Y = 0;
        p29.Z = 0;
        v20_0[0] = (this.f - v11_9);
        v20_0[v32_1] = (this.m - v19_0);
        p29.b0 = 0;
        p29.c0 = 0;
        p29.M(v14_1);
        p29.O(v10_1);
        p29.N(v12_1);
        p29.L(v13_0);
        int v10_3 = (this.d - v11_9);
        if (v10_3 >= 0) {
            p29.b0 = v10_3;
        } else {
            p29.b0 = 0;
        }
        int v10_5 = (this.e - v19_0);
        if (v10_5 >= 0) {
            p29.c0 = v10_5;
        } else {
            p29.c0 = 0;
        }
        int v2_1;
        p29.x0 = v9_7;
        p29.y0 = v7_1;
        b8.g v7_2 = p29.r0;
        int v9_1 = ((w.e) v7_2.d);
        int v10_7 = ((java.util.ArrayList) v7_2.b);
        boolean v11_0 = p29.u0;
        w.d v12_6 = p29.q0.size();
        int v13_1 = p29.q();
        int v14_0 = p29.k();
        boolean v15_10 = w.j.c(p30, 128);
        if ((!v15_10) && (!w.j.c(p30, 64))) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        int v24_0;
        int v21_0;
        int v0_3;
        if (v2_1 == 0) {
            v21_0 = v2_1;
            v24_0 = v12_6;
            v0_3 = 1073741824;
        } else {
            int v0_2 = 0;
            while (v0_2 < v12_6) {
                int v26_0;
                int v2_4 = ((w.d) p29.q0.get(v0_2));
                int v23_0 = v2_4.p0;
                v24_0 = v12_6;
                if (v23_0[0] != 3) {
                    v26_0 = 0;
                } else {
                    v26_0 = 1;
                }
                int v0_7;
                if (v23_0[1] != 3) {
                    v0_7 = 0;
                } else {
                    v0_7 = 1;
                }
                if ((v26_0 == 0) || ((v0_7 == 0) || (v2_4.W <= 0))) {
                    int v0_10 = 0;
                } else {
                    v0_10 = 1;
                }
                if (((!v2_4.x()) || (v0_10 == 0)) && (((!v2_4.y()) || (v0_10 == 0)) && ((!(v2_4 instanceof w.g)) && ((!v2_4.x()) && (!v2_4.y()))))) {
                    v0_2++;
                    v12_6 = v24_0;
                } else {
                    v0_3 = 1073741824;
                    v21_0 = 0;
                }
            }
        }
        if (((v3_0 != v0_3) || (v5_6 != v0_3)) && (!v15_10)) {
            int v0_14 = 0;
        } else {
            v0_14 = 1;
        }
        x.g v25_1;
        int v23_1;
        int v0_16;
        int v2_6;
        boolean v20_1;
        int v0_15 = (v21_0 & v0_14);
        if (v0_15 == 0) {
            v20_1 = v0_15;
            v25_1 = v10_7;
            v23_1 = v11_0;
            v0_16 = 0;
            v2_6 = 0;
        } else {
            int v4_0 = Math.min(v20_0[0], v4_13);
            int v2_8 = Math.min(v20_0[1], v6_30);
            int v6_1 = 1073741824;
            if (v3_0 == 1073741824) {
                if (p29.q() != v4_0) {
                    p29.O(v4_0);
                    v8_0.b = 1;
                }
                v6_1 = 1073741824;
            }
            if ((v5_6 == v6_1) && (p29.k() != v2_8)) {
                p29.L(v2_8);
                v8_0.b = 1;
            }
            if ((v3_0 != v6_1) || (v5_6 != v6_1)) {
                boolean v11_2;
                v20_1 = v0_15;
                v25_1 = v10_7;
                v23_1 = v11_0;
                int v0_17 = v8_0.a;
                if (!v8_0.b) {
                    v11_2 = 0;
                } else {
                    int v2_10 = v0_17.q0;
                    int v4_2 = v2_10.size();
                    int v6_3 = 0;
                    while (v6_3 < v4_2) {
                        int v10_9 = v2_10.get(v6_3);
                        v6_3++;
                        int v10_10 = ((w.d) v10_9);
                        v10_10.h();
                        v10_10.a = 0;
                        w.d v12_14 = v10_10.d;
                        int v18_3 = v2_10;
                        v12_14.e.j = 0;
                        v12_14.g = 0;
                        v12_14.n();
                        int v2_17 = v10_10.e;
                        v2_17.e.j = 0;
                        v2_17.g = 0;
                        v2_17.m();
                        v2_10 = v18_3;
                    }
                    v11_2 = 0;
                    v0_17.h();
                    v0_17.a = 0;
                    int v2_11 = v0_17.d;
                    v2_11.e.j = 0;
                    v2_11.g = 0;
                    v2_11.n();
                    int v2_12 = v0_17.e;
                    v2_12.e.j = 0;
                    v2_12.g = 0;
                    v2_12.m();
                    v8_0.c();
                }
                v8_0.b(v8_0.d);
                v0_17.Y = v11_2;
                v0_17.Z = v11_2;
                v0_17.d.h.d(v11_2);
                v0_17.e.h.d(v11_2);
                int v6_4 = 1073741824;
                if (v3_0 != 1073741824) {
                    v0_16 = 0;
                    v2_6 = 1;
                } else {
                    v2_6 = p29.T(v11_2, v15_10);
                    v0_16 = 1;
                }
                if (v5_6 == 1073741824) {
                    v2_6 &= p29.T(1, v15_10);
                    v0_16++;
                }
            } else {
                int v6_7;
                int v2_18 = v8_0.e;
                int v4_6 = v8_0.a;
                if ((!v8_0.b) && (!v8_0.c)) {
                    v20_1 = v0_15;
                    v6_7 = 0;
                } else {
                    int v6_8 = v4_6.q0;
                    w.d v12_15 = v6_8.size();
                    v20_1 = v0_15;
                    int v0_21 = 0;
                    while (v0_21 < v12_15) {
                        int v23_3 = (v0_21 + 1);
                        int v0_32 = ((w.d) v6_8.get(v0_21));
                        v0_32.h();
                        int v22_5 = v6_8;
                        v0_32.a = 0;
                        v0_32.d.n();
                        v0_32.e.m();
                        v6_8 = v22_5;
                        v0_21 = v23_3;
                    }
                    v4_6.h();
                    v6_7 = 0;
                    v4_6.a = 0;
                    v4_6.d.n();
                    v4_6.e.m();
                    v8_0.c = 0;
                }
                v8_0.b(v8_0.d);
                v4_6.Y = v6_7;
                int v0_25 = v4_6.p0;
                v4_6.Z = v6_7;
                w.d v12_16 = v4_6.j(v6_7);
                int v22_1 = v0_25;
                int v0_26 = v4_6.j(1);
                if (v8_0.b) {
                    v8_0.c();
                }
                int v6_17;
                int v26_1;
                int v6_11 = v4_6.r();
                v23_1 = v11_0;
                boolean v11_4 = v4_6.s();
                v25_1 = v10_7;
                v4_6.d.h.d(v6_11);
                v4_6.e.h.d(v11_4);
                v8_0.g();
                if ((v12_16 != 2) && (v0_26 != 2)) {
                    v26_1 = v6_11;
                    v6_17 = 1;
                } else {
                    if (!v15_10) {
                        v26_1 = v6_11;
                    } else {
                        int v10_17 = v2_18.size();
                        v26_1 = v6_11;
                        int v6_12 = 0;
                        while (v6_12 < v10_17) {
                            boolean v27_0 = v2_18.get(v6_12);
                            v6_12++;
                            if (!((x.o) v27_0).k()) {
                                v15_10 = 0;
                                break;
                            }
                        }
                    }
                    if ((v15_10) && (v12_16 == 2)) {
                        v4_6.M(1);
                        v4_6.O(v8_0.d(v4_6, 0));
                        v4_6.d.e.d(v4_6.q());
                    }
                    if ((!v15_10) || (v0_26 != 2)) {
                    } else {
                        v6_17 = 1;
                        v4_6.N(1);
                        v4_6.L(v8_0.d(v4_6, 1));
                        v4_6.e.e.d(v4_6.k());
                    }
                }
                int v6_19;
                int v10_25 = v22_1[0];
                if ((v10_25 != v6_17) && (v10_25 != 4)) {
                    v6_19 = 0;
                } else {
                    int v6_21 = (v4_6.q() + v26_1);
                    v4_6.d.i.d(v6_21);
                    v4_6.d.e.d((v6_21 - v26_1));
                    v8_0.g();
                    int v10_30 = v22_1[1];
                    if ((v10_30 == 1) || (v10_30 == 4)) {
                        int v6_26 = (v4_6.k() + v11_4);
                        v4_6.e.i.d(v6_26);
                        v4_6.e.e.d((v6_26 - v11_4));
                    }
                    v8_0.g();
                    v6_19 = 1;
                }
                int v8_2 = v2_18.size();
                int v10_35 = 0;
                while (v10_35 < v8_2) {
                    boolean v11_14 = v2_18.get(v10_35);
                    v10_35++;
                    boolean v11_15 = ((x.o) v11_14);
                    if ((v11_15.b != v4_6) || (v11_15.g)) {
                        v11_15.e();
                    }
                }
                int v8_3 = v2_18.size();
                int v10_36 = 0;
                while (v10_36 < v8_3) {
                    boolean v11_5 = v2_18.get(v10_36);
                    v10_36++;
                    boolean v11_6 = ((x.o) v11_5);
                    if (((v6_19 != 0) || (v11_6.b != v4_6)) && (((!v11_6.h.j) || ((!v11_6.i.j) && (!(v11_6 instanceof x.i)))) || ((!v11_6.e.j) && ((!(v11_6 instanceof x.c)) && (!(v11_6 instanceof x.i)))))) {
                        v2_6 = 0;
                    }
                    v4_6.M(v12_16);
                    v4_6.N(v0_26);
                    v0_16 = 2;
                    v6_4 = 1073741824;
                }
                v2_6 = 1;
            }
            if (v2_6 != 0) {
                int v3_1;
                if (v3_0 != v6_4) {
                    v3_1 = 0;
                } else {
                    v3_1 = 1;
                }
                int v4_7;
                if (v5_6 != v6_4) {
                    v4_7 = 0;
                } else {
                    v4_7 = 1;
                }
                p29.P(v3_1, v4_7);
            }
        }
        if ((v2_6 != 0) && (v0_16 == 2)) {
            return;
        } else {
            int v0_27 = p29.D0;
            if (v24_0 > 0) {
                int v2_20 = p29.q0.size();
                int v3_3 = p29.W(64);
                int v4_8 = p29.u0;
                boolean v15_24 = 0;
                while (v15_24 < v2_20) {
                    int v5_5 = ((w.d) p29.q0.get(v15_24));
                    if ((!(v5_5 instanceof w.h)) && ((!(v5_5 instanceof w.a)) && (!v5_5.F))) {
                        if (v3_3 != 0) {
                            int v6_50 = v5_5.d;
                            if (v6_50 != 0) {
                                int v8_17 = v5_5.e;
                                if ((v8_17 != 0) && ((v6_50.e.j) && (v8_17.e.j))) {
                                    v15_24++;
                                }
                            }
                        }
                        boolean v11_13;
                        int v8_18 = v5_5.j(0);
                        int v10_47 = v5_5.j(1);
                        if ((v8_18 != 3) || ((v5_5.r == 1) || ((v10_47 != 3) || (v5_5.s == 1)))) {
                            v11_13 = 0;
                        } else {
                            v11_13 = 1;
                        }
                        if ((!v11_13) && ((p29.W(1)) && (!(v5_5 instanceof w.g)))) {
                            if ((v8_18 == 3) && ((v5_5.r == 0) && ((v10_47 != 3) && (!v5_5.x())))) {
                                v11_13 = 1;
                            }
                            if ((v10_47 == 3) && ((v5_5.s == 0) && ((v8_18 != 3) && (!v5_5.x())))) {
                                v11_13 = 1;
                            }
                            if (((v8_18 == 3) || (v10_47 == 3)) && (v5_5.W > 0)) {
                                v11_13 = 1;
                            }
                        }
                        if (!v11_13) {
                            v7_2.o(0, v5_5, v4_8);
                        }
                    }
                }
                int v2_21 = v4_8.a;
                int v3_4 = v2_21.getChildCount();
                int v4_9 = v2_21.b;
                boolean v15_26 = 0;
                while (v15_26 < v3_4) {
                    v2_21.getChildAt(v15_26);
                    v15_26++;
                }
                int v2_22 = v4_9.size();
                if (v2_22 > 0) {
                    boolean v15_27 = 0;
                    while (v15_27 < v2_22) {
                        ((z.c) v4_9.get(v15_27)).getClass();
                        v15_27++;
                    }
                }
            }
            v7_2.v(p29);
            int v2_23 = v25_1.size();
            if (v24_0 > 0) {
                v7_2.u(p29, 0, v13_1, v14_0);
            }
            if (v2_23 > 0) {
                boolean v15_28;
                int v3_5 = p29.p0;
                if (v3_5[0] != 2) {
                    v15_28 = 0;
                } else {
                    v15_28 = 1;
                }
                int v3_7;
                if (v3_5[1] != 2) {
                    v3_7 = 0;
                } else {
                    v3_7 = 1;
                }
                int v4_12 = Math.max(p29.q(), v9_1.b0);
                int v5_2 = Math.max(p29.k(), v9_1.c0);
                int v8_5 = 0;
                int v9_9 = 0;
                while (v8_5 < v2_23) {
                    int v17_4;
                    int v16_2;
                    int v3_13;
                    boolean v11_10 = v25_1;
                    w.d v12_22 = ((w.d) v11_10.get(v8_5));
                    if ((v12_22 instanceof w.g)) {
                        int v6_36 = v12_22.q();
                        int v10_46 = v12_22.k();
                        v16_2 = v3_7;
                        v17_4 = v8_5;
                        v3_13 = v23_1;
                        int v8_9 = (v9_9 | v7_2.o(1, v12_22, v3_13));
                        int v9_18 = v12_22.q();
                        int v19_3 = v8_9;
                        int v8_10 = v12_22.k();
                        if (v9_18 != v6_36) {
                            v12_22.O(v9_18);
                            if ((v15_28) && ((v12_22.r() + v12_22.U) > v4_12)) {
                                v4_12 = Math.max(v4_12, (v12_22.i(4).e() + (v12_22.r() + v12_22.U)));
                            }
                            v19_3 = 1;
                        }
                        if (v8_10 != v10_46) {
                            v12_22.L(v8_10);
                            if ((v16_2 != 0) && ((v12_22.s() + v12_22.V) > v5_2)) {
                                v5_2 = Math.max(v5_2, (v12_22.i(5).e() + (v12_22.s() + v12_22.V)));
                            }
                            v19_3 = 1;
                        }
                        v9_9 = (v19_3 | ((w.g) v12_22).y0);
                    } else {
                        v16_2 = v3_7;
                        v17_4 = v8_5;
                        v3_13 = v23_1;
                    }
                    v8_5 = (v17_4 + 1);
                    v23_1 = v3_13;
                    v25_1 = v11_10;
                    v3_7 = v16_2;
                }
                int v16_1 = v3_7;
                boolean v11_8 = v25_1;
                int v6_29 = 0;
                while(true) {
                    int v3_8 = v23_1;
                    if (v6_29 < 2) {
                        int v8_6 = 0;
                        while (v8_6 < v2_23) {
                            int v19_1;
                            int v17_2;
                            int v24_2;
                            int v23_2;
                            w.d v12_19 = ((w.d) v11_8.get(v8_6));
                            if (((!(v12_19 instanceof w.i)) || ((v12_19 instanceof w.g))) && (!(v12_19 instanceof w.h))) {
                                v17_2 = v2_23;
                                if (((v12_19.g0 != 8) && ((!v20_1) || ((!v12_19.d.e.j) || (!v12_19.e.e.j)))) && (!(v12_19 instanceof w.g))) {
                                    int v2_33 = v12_19.q();
                                    int v10_45 = v12_19.k();
                                    v19_1 = v8_6;
                                    int v8_7 = v12_19.a0;
                                    int v9_10 = 1;
                                    if (v6_29 == 1) {
                                        v9_10 = 2;
                                    }
                                    v9_9 |= v7_2.o(v9_10, v12_19, v3_8);
                                    v23_2 = v3_8;
                                    int v3_9 = v12_19.q();
                                    v24_2 = v6_29;
                                    int v6_31 = v12_19.k();
                                    if (v3_9 != v2_33) {
                                        v12_19.O(v3_9);
                                        if ((v15_28) && ((v12_19.r() + v12_19.U) > v4_12)) {
                                            v4_12 = Math.max(v4_12, (v12_19.i(4).e() + (v12_19.r() + v12_19.U)));
                                        }
                                        v9_9 = 1;
                                    }
                                    if (v6_31 != v10_45) {
                                        v12_19.L(v6_31);
                                        if ((v16_1 != 0) && ((v12_19.s() + v12_19.V) > v5_2)) {
                                            v5_2 = Math.max(v5_2, (v12_19.i(5).e() + (v12_19.s() + v12_19.V)));
                                        }
                                        v9_9 = 1;
                                    }
                                    if ((v12_19.E) && (v8_7 != v12_19.a0)) {
                                        v9_9 = 1;
                                    }
                                } else {
                                    v23_2 = v3_8;
                                    v24_2 = v6_29;
                                    v19_1 = v8_6;
                                    int v6 = 5;
                                }
                            } else {
                                v17_2 = v2_23;
                            }
                            v8_6 = (v19_1 + 1);
                            v2_23 = v17_2;
                            v3_8 = v23_2;
                            v6_29 = v24_2;
                        }
                        int v17_1 = v2_23;
                        v23_1 = v3_8;
                        v6 = 5;
                        if (v9_9 != 0) {
                            int v2_24 = (v6_29 + 1);
                            v7_2.u(p29, v2_24, v13_1, v14_0);
                            v6_29 = v2_24;
                            v2_23 = v17_1;
                            v9_9 = 0;
                        }
                    }
                }
            }
            p29.D0 = v0_27;
            u.c.q = p29.W(512);
            return;
        }
    }

    public final void l(w.d p3, z.e p4, android.util.SparseArray p5, int p6, int p7)
    {
        w.c v0_6 = ((android.view.View) this.a.get(p6));
        w.c v5_3 = ((w.d) p5.get(p6));
        if ((v5_3 != null) && ((v0_6 != null) && ((v0_6.getLayoutParams() instanceof z.e)))) {
            p4.c0 = 1;
            if (p7 == 6) {
                w.c v0_2 = ((z.e) v0_6.getLayoutParams());
                v0_2.c0 = 1;
                v0_2.p0.E = 1;
            }
            p3.i(6).b(v5_3.i(p7), p4.D, p4.C, 1);
            p3.E = 1;
            p3.i(3).j();
            p3.i(5).j();
        }
        return;
    }

    public void onLayout(boolean p5, int p6, int p7, int p8, int p9)
    {
        java.util.ArrayList v5_0 = this.getChildCount();
        int v6_0 = this.isInEditMode();
        p7 = 0;
        z.c v8_2 = 0;
        while (v8_2 < v5_0) {
            p9 = this.getChildAt(v8_2);
            boolean v0_1 = ((z.e) p9.getLayoutParams());
            int v1_0 = v0_1.p0;
            if ((p9.getVisibility() != 8) || ((v0_1.d0) || ((v0_1.e0) || (v6_0 != 0)))) {
                boolean v0_3 = v1_0.r();
                int v2_2 = v1_0.s();
                p9.layout(v0_3, v2_2, (v1_0.q() + v0_3), (v1_0.k() + v2_2));
            }
            v8_2++;
        }
        java.util.ArrayList v5_1 = this.b;
        int v6_1 = v5_1.size();
        if (v6_1 > 0) {
            while (p7 < v6_1) {
                ((z.c) v5_1.get(p7)).getClass();
                p7++;
            }
        }
        return;
    }

    public void onMeasure(int p35, int p36)
    {
        androidx.constraintlayout.widget.ConstraintLayout v0_0 = this;
        int v1_18 = this.n;
        this.n = v1_18;
        float v8_6 = 1;
        int v9_15 = 0;
        if (v1_18 == 0) {
            int v1_36 = this.getChildCount();
            float v2_0 = 0;
            while (v2_0 < v1_36) {
                if (!this.getChildAt(v2_0).isLayoutRequested()) {
                    v2_0++;
                } else {
                    this.n = 1;
                    break;
                }
            }
        }
        if (((this.getContext().getApplicationInfo().flags & 4194304) == 0) || (1 != this.getLayoutDirection())) {
            int v1_19 = 0;
        } else {
            v1_19 = 1;
        }
        w.e v10 = this.c;
        v10.v0 = v1_19;
        if (this.n) {
            this.n = 0;
            int v1_23 = this.getChildCount();
            float v2_9 = 0;
            while (v2_9 < v1_23) {
                if (!this.getChildAt(v2_9).isLayoutRequested()) {
                    v2_9++;
                } else {
                    int v11_6 = 1;
                }
                if (v11_6 != 0) {
                    boolean v12 = this.isInEditMode();
                    int v13 = this.getChildCount();
                    int v1_24 = 0;
                    while (v1_24 < v13) {
                        float v2_40 = this.h(this.getChildAt(v1_24));
                        if (v2_40 != 0) {
                            v2_40.C();
                        }
                        v1_24++;
                    }
                    int v1_26 = this.a;
                    if (v12) {
                        android.util.SparseArray v3_5 = 0;
                        while (v3_5 < v13) {
                            float v4_49 = this.getChildAt(v3_5);
                            try {
                                int v16_1;
                                float v5_39 = this.getResources().getResourceName(v4_49.getId());
                                int v15_7 = Integer.valueOf(v4_49.getId());
                            } catch (android.content.res.Resources$NotFoundException) {
                                v16_1 = v8_6;
                                v3_5++;
                                v8_6 = v16_1;
                            } catch (android.content.res.Resources$NotFoundException) {
                            }
                            if (v5_39 == 0) {
                                v16_1 = v8_6;
                            } else {
                                v16_1 = v8_6;
                                if (this.s == null) {
                                    this.s = new java.util.HashMap();
                                }
                                float v8_21;
                                float v8_20 = v5_39.indexOf("/");
                                if (v8_20 == -1) {
                                    v8_21 = v5_39;
                                } else {
                                    v8_21 = v5_39.substring((v8_20 + 1));
                                }
                                this.s.put(v8_21, v15_7);
                            }
                            float v2_32 = v5_39.indexOf(47);
                            if (v2_32 != -1) {
                                v5_39 = v5_39.substring((v2_32 + 1));
                            }
                            float v2_38;
                            float v2_34 = v4_49.getId();
                            if (v2_34 != 0) {
                                float v4_51 = ((android.view.View) v1_26.get(v2_34));
                                if (v4_51 == 0) {
                                    v4_51 = this.findViewById(v2_34);
                                    if ((v4_51 != 0) && ((v4_51 != this) && (v4_51.getParent() == this))) {
                                        this.onViewAdded(v4_51);
                                    }
                                }
                                if (v4_51 != this) {
                                    if (v4_51 != 0) {
                                        v2_38 = ((z.e) v4_51.getLayoutParams()).p0;
                                    } else {
                                        v2_38 = 0;
                                    }
                                } else {
                                    v2_38 = v10;
                                }
                            }
                            v2_38.h0 = v5_39;
                        }
                    }
                    int v16_0 = v8_6;
                    if (this.r != -1) {
                        float v2_18 = 0;
                        while (v2_18 < v13) {
                            this.getChildAt(v2_18).getId();
                            v2_18++;
                        }
                    }
                    float v2_23 = this.p;
                    if (v2_23 != 0) {
                        v2_23.a(this);
                    }
                    v10.q0.clear();
                    float v2_28 = this.b;
                    android.util.SparseArray v3_7 = v2_28.size();
                    if (v3_7 > null) {
                        float v4_48 = 0;
                        while (v4_48 < v3_7) {
                            float v5_37 = ((z.c) v2_28.get(v4_48));
                            int v15_4 = v5_37.m;
                            if (v5_37.isInEditMode()) {
                                v5_37.setIds(v5_37.e);
                            }
                            w.d v19_1;
                            int v21_2;
                            float v8_13 = v5_37.d;
                            if (v8_13 != 0) {
                                v8_13.r0 = v9_15;
                                java.util.Arrays.fill(v8_13.q0, 0);
                                float v8_15 = v9_15;
                                while (v8_15 < v5_37.b) {
                                    int v21_3;
                                    int v14_11 = v5_37.a[v8_15];
                                    w.d v19_3 = ((android.view.View) v1_26.get(v14_11));
                                    if (v19_3 != null) {
                                        v21_3 = v2_28;
                                    } else {
                                        int v14_14 = ((String) v15_4.get(Integer.valueOf(v14_11)));
                                        int v9_16 = v5_37.f(this, v14_14);
                                        if (v9_16 == 0) {
                                        } else {
                                            v21_3 = v2_28;
                                            v5_37.a[v8_15] = v9_16;
                                            v15_4.put(Integer.valueOf(v9_16), v14_14);
                                            v19_3 = ((android.view.View) v1_26.get(v9_16));
                                        }
                                    }
                                    float v2_20 = v19_3;
                                    w.d v19_5;
                                    if (v2_20 == 0) {
                                        v19_5 = v1_26;
                                    } else {
                                        int v9_17 = v5_37.d;
                                        float v2_21 = this.h(v2_20);
                                        v9_17.getClass();
                                        if ((v2_21 != v9_17) && (v2_21 != 0)) {
                                            v19_5 = v1_26;
                                            int v1_30 = v9_17.q0;
                                            int v22_6 = v2_21;
                                            if ((v9_17.r0 + 1) > v1_30.length) {
                                                v9_17.q0 = ((w.d[]) java.util.Arrays.copyOf(v1_30, (v1_30.length * 2)));
                                            }
                                            float v2_26 = v9_17.r0;
                                            v9_17.q0[v2_26] = v22_6;
                                            v9_17.r0 = (v2_26 + 1);
                                        }
                                    }
                                    v8_15++;
                                    v1_26 = v19_5;
                                    v2_28 = v21_3;
                                }
                                v19_1 = v1_26;
                                v21_2 = v2_28;
                                v5_37.d.S();
                            } else {
                                v19_1 = v1_26;
                                v21_2 = v2_28;
                            }
                            v4_48++;
                            v1_26 = v19_1;
                            v2_28 = v21_2;
                            v9_15 = 0;
                        }
                    }
                    z.e v18_0 = 2;
                    int v1_28 = 0;
                    while (v1_28 < v13) {
                        this.getChildAt(v1_28);
                        v1_28++;
                    }
                    android.util.SparseArray v3_8 = this.t;
                    v3_8.clear();
                    v3_8.put(0, v10);
                    v3_8.put(this.getId(), v10);
                    int v1_27 = 0;
                    while (v1_27 < v13) {
                        float v2_13 = this.getChildAt(v1_27);
                        v3_8.put(v2_13.getId(), this.h(v2_13));
                        v1_27++;
                    }
                    float v8_11 = 0;
                    while (v8_11 < v13) {
                        int v29_0;
                        float v4_44;
                        int v17;
                        int v1_5 = v0_0.getChildAt(v8_11);
                        float v2_6 = v0_0.h(v1_5);
                        if (v2_6 != 0) {
                            float v4_2 = ((z.e) v1_5.getLayoutParams());
                            v10.q0.add(v2_6);
                            float v5_7 = v2_6.T;
                            if (v5_7 != 0) {
                                ((w.e) v5_7).q0.remove(v2_6);
                                v2_6.C();
                            }
                            v2_6.T = v10;
                            v4_2.a();
                            v2_6.g0 = v1_5.getVisibility();
                            v2_6.f0 = v1_5;
                            if ((v1_5 instanceof z.c)) {
                                ((z.c) v1_5).h(v2_6, v10.v0);
                            }
                            if (!v4_2.d0) {
                                float v2_8;
                                int v1_20;
                                int v9_1;
                                int v14_1;
                                int v1_8 = v4_2.f0;
                                float v5_13 = v4_2.g0;
                                int v9_0 = v4_2.h0;
                                int v14_0 = v4_2.i0;
                                int v15_0 = v4_2.j0;
                                v17 = v8_11;
                                float v8_1 = v4_2.l0;
                                w.d v19_0 = v4_2.k0;
                                androidx.constraintlayout.widget.ConstraintLayout v0_2 = v4_2.p;
                                v29_0 = v11_6;
                                if (v0_2 == -1) {
                                    int v23_1;
                                    int v22_0;
                                    int v21_0;
                                    int v22_1;
                                    if (v1_8 == -1) {
                                        v21_0 = v2_6;
                                        v22_0 = 2;
                                        if (v5_13 == -1) {
                                            v23_1 = v22_0;
                                            v22_1 = 4;
                                        } else {
                                            w.d v26_1 = ((w.d) v3_8.get(v5_13));
                                            if (v26_1 == null) {
                                            } else {
                                                v21_0.v(2, 4, v4_2.leftMargin, v15_0, v26_1);
                                                v23_1 = 2;
                                                v22_1 = 4;
                                            }
                                        }
                                    } else {
                                        w.d v26_3 = ((w.d) v3_8.get(v1_8));
                                        if (v26_3 == null) {
                                            v21_0 = v2_6;
                                            v22_0 = 2;
                                        } else {
                                            v21_0 = v2_6;
                                            v22_0 = 2;
                                            v21_0.v(2, 2, v4_2.leftMargin, v15_0, v26_3);
                                        }
                                    }
                                    if (v9_0 == -1) {
                                        v9_1 = v23_1;
                                        if (v14_0 != -1) {
                                            w.d v26_5 = ((w.d) v3_8.get(v14_0));
                                            if (v26_5 != null) {
                                                v21_0.v(v22_1, v22_1, v4_2.rightMargin, v19_0, v26_5);
                                            }
                                        }
                                    } else {
                                        w.d v26_7 = ((w.d) v3_8.get(v9_0));
                                        if (v26_7 != null) {
                                            v21_0.v(v22_1, v23_1, v4_2.rightMargin, v19_0, v26_7);
                                        }
                                        v9_1 = v23_1;
                                    }
                                    int v22_3;
                                    float v5_14;
                                    int v11_2;
                                    v14_1 = v22_1;
                                    androidx.constraintlayout.widget.ConstraintLayout v0_11 = v4_2.i;
                                    if (v0_11 == -1) {
                                        androidx.constraintlayout.widget.ConstraintLayout v0_12 = v4_2.j;
                                        v11_2 = -1;
                                        if (v0_12 != -1) {
                                            w.d v26_9 = ((w.d) v3_8.get(v0_12));
                                            if (v26_9 != null) {
                                                v21_0.v(3, 5, v4_2.topMargin, v4_2.x, v26_9);
                                                v5_14 = 3;
                                                v22_3 = 5;
                                                int v15_1;
                                                androidx.constraintlayout.widget.ConstraintLayout v0_17 = v4_2.k;
                                                if (v0_17 == v11_2) {
                                                    v15_1 = v5_14;
                                                    androidx.constraintlayout.widget.ConstraintLayout v0_18 = v4_2.l;
                                                    if (v0_18 != v11_2) {
                                                        w.d v26_13 = ((w.d) v3_8.get(v0_18));
                                                        if (v26_13 != null) {
                                                            v21_0.v(v22_3, v22_3, v4_2.bottomMargin, v4_2.z, v26_13);
                                                        }
                                                    }
                                                } else {
                                                    w.d v26_15 = ((w.d) v3_8.get(v0_17));
                                                    if (v26_15 == null) {
                                                        v15_1 = v5_14;
                                                    } else {
                                                        int v23_7 = v5_14;
                                                        v21_0.v(v22_3, v23_7, v4_2.bottomMargin, v4_2.z, v26_15);
                                                        v15_1 = v23_7;
                                                    }
                                                }
                                                v2_8 = v4_2;
                                                float v4_3 = v2_8.m;
                                                if (v4_3 == -1) {
                                                    float v4_4 = v2_8.n;
                                                    if (v4_4 == -1) {
                                                        float v4_5 = v2_8.o;
                                                        v0_0 = this;
                                                        v1_20 = v21_0;
                                                        if (v4_5 != -1) {
                                                            this.l(v1_20, v2_8, v3_8, v4_5, v22_3);
                                                        }
                                                    } else {
                                                        v0_0 = this;
                                                        v1_20 = v21_0;
                                                        this.l(v1_20, v2_8, v3_8, v4_4, v15_1);
                                                    }
                                                } else {
                                                    v0_0 = this;
                                                    v1_20 = v21_0;
                                                    this.l(v1_20, v2_8, v3_8, v4_3, 6);
                                                }
                                                if (v8_1 >= 0) {
                                                    v1_20.d0 = v8_1;
                                                }
                                                float v4_7 = v2_8.F;
                                                if (v4_7 >= 0) {
                                                    v1_20.e0 = v4_7;
                                                }
                                                if (v12) {
                                                    float v4_8 = v2_8.T;
                                                    if ((v4_8 != -1) || (v2_8.U != -1)) {
                                                        float v8_4 = v2_8.U;
                                                        v1_20.Y = v4_8;
                                                        v1_20.Z = v8_4;
                                                    }
                                                }
                                                if (v2_8.a0) {
                                                    v1_20.M(v16_0);
                                                    v1_20.O(v2_8.width);
                                                    if (v2_8.width == -2) {
                                                        v1_20.M(v18_0);
                                                    }
                                                } else {
                                                    if (v2_8.width != -1) {
                                                        v1_20.M(3);
                                                        v1_20.O(0);
                                                    } else {
                                                        if (!v2_8.W) {
                                                            v1_20.M(4);
                                                        } else {
                                                            v1_20.M(3);
                                                        }
                                                        v1_20.i(v9_1).g = v2_8.leftMargin;
                                                        v1_20.i(v14_1).g = v2_8.rightMargin;
                                                    }
                                                }
                                                int v15_3;
                                                if (v2_8.b0) {
                                                    v15_3 = -1;
                                                    v1_20.N(1);
                                                    v1_20.L(v2_8.height);
                                                    if (v2_8.height == -2) {
                                                        v1_20.N(2);
                                                    }
                                                } else {
                                                    v15_3 = -1;
                                                    if (v2_8.height != -1) {
                                                        v1_20.N(3);
                                                        v1_20.L(0);
                                                    } else {
                                                        if (!v2_8.X) {
                                                            v1_20.N(4);
                                                        } else {
                                                            v1_20.N(3);
                                                        }
                                                        v1_20.i(3).g = v2_8.topMargin;
                                                        v1_20.i(5).g = v2_8.bottomMargin;
                                                    }
                                                }
                                                float v4_29 = v2_8.G;
                                                if ((v4_29 != 0) && (v4_29.length() != 0)) {
                                                    int v9_6;
                                                    int v11_8;
                                                    float v5_24 = v4_29.length();
                                                    int v9_5 = v4_29.indexOf(44);
                                                    if ((v9_5 <= 0) || (v9_5 >= (v5_24 - 1))) {
                                                        v11_8 = v15_3;
                                                        v9_6 = 0;
                                                    } else {
                                                        int v14_2 = v4_29.substring(0, v9_5);
                                                        if (!v14_2.equalsIgnoreCase("W")) {
                                                            if (!v14_2.equalsIgnoreCase("H")) {
                                                                v11_8 = v15_3;
                                                            } else {
                                                                v11_8 = 1;
                                                            }
                                                        } else {
                                                            v11_8 = 0;
                                                        }
                                                        v9_6 = (v9_5 + 1);
                                                    }
                                                    float v4_31;
                                                    int v14_4 = v4_29.indexOf(58);
                                                    try {
                                                        if ((v14_4 < 0) || (v14_4 >= (v5_24 - 1))) {
                                                            float v4_30 = v4_29.substring(v9_6);
                                                            if (v4_30.length() <= 0) {
                                                                v4_31 = 0;
                                                            } else {
                                                                v4_31 = Float.parseFloat(v4_30);
                                                            }
                                                        } else {
                                                            float v5_27 = v4_29.substring(v9_6, v14_4);
                                                            float v4_32 = v4_29.substring((v14_4 + 1));
                                                            if ((v5_27.length() <= 0) || (v4_32.length() <= 0)) {
                                                            } else {
                                                                float v5_28 = Float.parseFloat(v5_27);
                                                                float v4_33 = Float.parseFloat(v4_32);
                                                                if ((v5_28 <= 0) || (v4_33 <= 0)) {
                                                                } else {
                                                                    if (v11_8 != 1) {
                                                                        v4_31 = Math.abs((v5_28 / v4_33));
                                                                    } else {
                                                                        v4_31 = Math.abs((v4_33 / v5_28));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (v4_31 > 0) {
                                                            v1_20.W = v4_31;
                                                            v1_20.X = v11_8;
                                                        }
                                                    } catch (NumberFormatException) {
                                                    }
                                                } else {
                                                    v1_20.W = 0;
                                                }
                                                float v5_31 = v1_20.k0;
                                                v5_31[0] = v2_8.H;
                                                v16_0 = 1;
                                                v5_31[1] = v2_8.I;
                                                v1_20.i0 = v2_8.J;
                                                v1_20.j0 = v2_8.K;
                                                float v4_40 = v2_8.Z;
                                                if ((v4_40 >= 0) && (v4_40 <= 3)) {
                                                    v1_20.q = v4_40;
                                                }
                                                float v4_41 = v2_8.L;
                                                float v5_32 = v2_8.N;
                                                float v8_7 = v2_8.P;
                                                int v9_12 = v2_8.R;
                                                v1_20.r = v4_41;
                                                v1_20.u = v5_32;
                                                if (v8_7 == 2147483647) {
                                                    v8_7 = 0;
                                                }
                                                v1_20.v = v8_7;
                                                v1_20.w = v9_12;
                                                if ((v9_12 > 0) && ((v9_12 < 1065353216) && (v4_41 == 0))) {
                                                    v1_20.r = 2;
                                                }
                                                float v4_43 = v2_8.M;
                                                float v8_10 = v2_8.O;
                                                int v9_13 = v2_8.Q;
                                                float v2_10 = v2_8.S;
                                                v1_20.s = v4_43;
                                                v1_20.x = v8_10;
                                                if (v9_13 == 2147483647) {
                                                    v9_13 = 0;
                                                }
                                                v1_20.y = v9_13;
                                                v1_20.z = v2_10;
                                                if ((v2_10 <= 0) || ((v2_10 >= 1065353216) || (v4_43 != 0))) {
                                                    v4_44 = 2;
                                                } else {
                                                    v4_44 = 2;
                                                    v1_20.s = 2;
                                                }
                                                v8_11 = (v17 + 1);
                                                v18_0 = v4_44;
                                                v11_6 = v29_0;
                                            }
                                        }
                                        v5_14 = 3;
                                        v22_3 = 5;
                                    } else {
                                        int v22_4;
                                        w.d v26_11 = ((w.d) v3_8.get(v0_11));
                                        if (v26_11 == null) {
                                            v22_4 = 3;
                                        } else {
                                            v22_4 = 3;
                                            v21_0.v(3, 3, v4_2.topMargin, v4_2.x, v26_11);
                                        }
                                        v5_14 = v22_4;
                                        v22_3 = 5;
                                        v11_2 = -1;
                                    }
                                } else {
                                    w.d v26_17 = ((w.d) v3_8.get(v0_2));
                                    if (v26_17 != null) {
                                        androidx.constraintlayout.widget.ConstraintLayout v0_24 = v4_2.r;
                                        v2_6.v(7, 7, v4_2.q, 0, v26_17);
                                        v2_6.D = v0_24;
                                    }
                                    v0_0 = this;
                                    v1_20 = v2_6;
                                    v2_8 = v4_2;
                                    v14_1 = 4;
                                    v9_1 = 2;
                                    int v15 = 3;
                                }
                            } else {
                                float v2_12 = ((w.h) v2_6);
                                int v1_25 = v4_2.m0;
                                float v5_35 = v4_2.n0;
                                float v4_45 = v4_2.o0;
                                int v14_6 = v4_45 cmp -1082130432;
                                if (v14_6 == 0) {
                                    if (v1_25 == -1) {
                                        if ((v5_35 != -1) && (v5_35 > -1)) {
                                            v2_12.q0 = -1082130432;
                                            v2_12.r0 = -1;
                                            v2_12.s0 = v5_35;
                                            v17 = v8_11;
                                            v29_0 = v11_6;
                                            v4_44 = v18_0;
                                        }
                                    } else {
                                        if (v1_25 > -1) {
                                            v2_12.q0 = -1082130432;
                                            v2_12.r0 = v1_25;
                                            v2_12.s0 = -1;
                                        }
                                    }
                                } else {
                                    if (v14_6 <= 0) {
                                    } else {
                                        v2_12.q0 = v4_45;
                                        v2_12.r0 = -1;
                                        v2_12.s0 = -1;
                                    }
                                }
                                v17 = v8_11;
                                v29_0 = v11_6;
                                v4_44 = v18_0;
                            }
                        }
                    }
                }
                if (v11_6 != 0) {
                    v10.r0.v(v10);
                }
            }
            v11_6 = 0;
        }
        v10.w0.getClass();
        v0_0.k(v10, v0_0.o, p35, p36);
        int v1_0 = v10.q();
        android.util.SparseArray v3_0 = v10.E0;
        float v4_0 = v10.F0;
        float v5_0 = v0_0.u;
        float v2_2 = (v10.k() + v5_0.e);
        int v1_3 = (android.view.View.resolveSizeAndState((v1_0 + v5_0.d), p35, 0) & 16777215);
        float v2_4 = (android.view.View.resolveSizeAndState(v2_2, p36, 0) & 16777215);
        int v1_4 = Math.min(v0_0.f, v1_3);
        float v2_5 = Math.min(v0_0.m, v2_4);
        if (v3_0 != null) {
            v1_4 |= 16777216;
        }
        if (v4_0 != 0) {
            v2_5 |= 16777216;
        }
        v0_0.setMeasuredDimension(v1_4, v2_5);
        return;
    }

    public final void onViewAdded(android.view.View p5)
    {
        super.onViewAdded(p5);
        android.util.SparseArray v0_4 = this.h(p5);
        if (((p5 instanceof z.p)) && (!(v0_4 instanceof w.h))) {
            android.util.SparseArray v0_0 = ((z.e) p5.getLayoutParams());
            int v1_1 = new w.h();
            v0_0.p0 = v1_1;
            v0_0.d0 = 1;
            v1_1.S(v0_0.V);
        }
        if ((p5 instanceof z.c)) {
            ((z.c) p5).i();
            ((z.e) p5.getLayoutParams()).e0 = 1;
            int v1_4 = this.b;
            if (!v1_4.contains(((z.c) p5))) {
                v1_4.add(((z.c) p5));
            }
        }
        this.a.put(p5.getId(), p5);
        this.n = 1;
        return;
    }

    public void onViewRemoved(android.view.View p3)
    {
        super.onViewRemoved(p3);
        this.a.remove(p3.getId());
        java.util.ArrayList v0_2 = this.h(p3);
        this.c.q0.remove(v0_2);
        v0_2.C();
        this.b.remove(p3);
        this.n = 1;
        return;
    }

    public final void requestLayout()
    {
        this.n = 1;
        super.requestLayout();
        return;
    }

    public void setConstraintSet(z.n p1)
    {
        this.p = p1;
        return;
    }

    public void setId(int p3)
    {
        android.util.SparseArray v1 = this.a;
        v1.remove(this.getId());
        super.setId(p3);
        v1.put(this.getId(), this);
        return;
    }

    public void setMaxHeight(int p2)
    {
        if (p2 != this.m) {
            this.m = p2;
            this.requestLayout();
            return;
        } else {
            return;
        }
    }

    public void setMaxWidth(int p2)
    {
        if (p2 != this.f) {
            this.f = p2;
            this.requestLayout();
            return;
        } else {
            return;
        }
    }

    public void setMinHeight(int p2)
    {
        if (p2 != this.e) {
            this.e = p2;
            this.requestLayout();
            return;
        } else {
            return;
        }
    }

    public void setMinWidth(int p2)
    {
        if (p2 != this.d) {
            this.d = p2;
            this.requestLayout();
            return;
        } else {
            return;
        }
    }

    public void setOnConstraintsChanged(z.o p1)
    {
        p1 = this.q;
        if (p1 != null) {
            p1.getClass();
        }
        return;
    }

    public void setOptimizationLevel(int p2)
    {
        this.o = p2;
        w.e v0 = this.c;
        v0.D0 = p2;
        u.c.q = v0.W(512);
        return;
    }

    public final boolean shouldDelayChildPressedState()
    {
        return 0;
    }
}
