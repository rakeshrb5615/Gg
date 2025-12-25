package n;
public class c0 {
    public static final int[] d;
    public final synthetic int a;
    public android.view.View b;
    public Object c;

    static c0()
    {
        n.c0.d = new int[] {16843067, 16843068});
        return;
    }

    public synthetic c0()
    {
        this.a = 2;
        return;
    }

    public c0(android.widget.AbsSeekBar p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public c0(android.widget.EditText p2)
    {
        this.a = 1;
        this.b = p2;
        this.c = new l6.c(p2);
        return;
    }

    public android.text.method.KeyListener a(android.text.method.KeyListener p2)
    {
        if ((p2 instanceof android.text.method.NumberKeyListener)) {
            return p2;
        } else {
            ((k2.c) ((l6.c) this.c).b).getClass();
            if (!(p2 instanceof i1.e)) {
                if (p2 != 0) {
                    if (!(p2 instanceof android.text.method.NumberKeyListener)) {
                        return new i1.e(p2);
                    } else {
                        return p2;
                    }
                } else {
                    return 0;
                }
            } else {
                return p2;
            }
        }
    }

    public void b(android.util.AttributeSet p9, int p10)
    {
        switch (this.a) {
            case 0:
                boolean v0_2 = ((android.widget.AbsSeekBar) this.b);
                b8.g v9_2 = b8.g.p(v0_2.getContext(), p9, n.c0.d, p10);
                android.graphics.drawable.AnimationDrawable v1_0 = v9_2.j(0);
                if (v1_0 != null) {
                    if ((v1_0 instanceof android.graphics.drawable.AnimationDrawable)) {
                        android.graphics.drawable.AnimationDrawable v1_1 = ((android.graphics.drawable.AnimationDrawable) v1_0);
                        int v3_1 = v1_1.getNumberOfFrames();
                        android.graphics.drawable.AnimationDrawable v4_1 = new android.graphics.drawable.AnimationDrawable();
                        v4_1.setOneShot(v1_1.isOneShot());
                        int v5_1 = 0;
                        while (v5_1 < v3_1) {
                            android.graphics.drawable.Drawable v7_1 = this.e(v1_1.getFrame(v5_1), 1);
                            v7_1.setLevel(10000);
                            v4_1.addFrame(v7_1, v1_1.getDuration(v5_1));
                            v5_1++;
                        }
                        v4_1.setLevel(10000);
                        v1_0 = v4_1;
                    }
                    v0_2.setIndeterminateDrawable(v1_0);
                }
                android.graphics.drawable.AnimationDrawable v1_2 = v9_2.j(1);
                if (v1_2 != null) {
                    v0_2.setProgressDrawable(this.e(v1_2, 0));
                }
                v9_2.r();
                return;
            default:
                b8.g v9_1 = ((android.widget.EditText) this.b).getContext().obtainStyledAttributes(p9, g.a.i, p10, 0);
                try {
                    android.graphics.drawable.AnimationDrawable v1_5 = 1;
                } catch (android.graphics.drawable.Drawable v10_3) {
                    v9_1.recycle();
                    throw v10_3;
                }
                if (v9_1.hasValue(14)) {
                    v1_5 = v9_1.getBoolean(14, 1);
                }
                v9_1.recycle();
                this.d(v1_5);
                return;
        }
    }

    public i1.b c(android.view.inputmethod.InputConnection p3, android.view.inputmethod.EditorInfo p4)
    {
        android.widget.EditText v0_1 = ((l6.c) this.c);
        if (p3 != null) {
            android.widget.EditText v0_4 = ((k2.c) v0_1.b);
            v0_4.getClass();
            if (!(p3 instanceof i1.b)) {
                p3 = new i1.b(((android.widget.EditText) v0_4.b), p3, p4);
            }
        } else {
            v0_1.getClass();
            p3 = 0;
        }
        return ((i1.b) p3);
    }

    public void d(boolean p6)
    {
        java.util.concurrent.locks.Lock v0_8 = ((i1.i) ((k2.c) ((l6.c) this.c).b).c);
        if (v0_8.c != p6) {
            if (v0_8.b != null) {
                java.util.concurrent.locks.Lock v1_0 = g1.i.a();
                i1.h v2 = v0_8.b;
                v1_0.getClass();
                p0.e.d(v2, "initCallback cannot be null");
                java.util.concurrent.locks.ReentrantReadWriteLock v3_1 = v1_0.a;
                v3_1.writeLock().lock();
                try {
                    v1_0.b.remove(v2);
                    v3_1.writeLock().unlock();
                } catch (Throwable v6_1) {
                    v3_1.writeLock().unlock();
                    throw v6_1;
                }
            }
            v0_8.c = p6;
            if (p6 != null) {
                i1.i.a(v0_8.a, g1.i.a().b());
            }
        }
        return;
    }

    public android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable p8, boolean p9)
    {
        if (!(p8 instanceof i0.a)) {
            if (!(p8 instanceof android.graphics.drawable.LayerDrawable)) {
                if ((p8 instanceof android.graphics.drawable.BitmapDrawable)) {
                    int v0_16 = ((android.graphics.drawable.BitmapDrawable) p8).getBitmap();
                    if (((android.graphics.Bitmap) this.c) == null) {
                        this.c = v0_16;
                    }
                    int v3_1 = new float[8];
                    v3_1 = {1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584};
                    int v2_3 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(v3_1, 0, 0));
                    v2_3.getPaint().setShader(new android.graphics.BitmapShader(v0_16, android.graphics.Shader$TileMode.REPEAT, android.graphics.Shader$TileMode.CLAMP));
                    v2_3.getPaint().setColorFilter(((android.graphics.drawable.BitmapDrawable) p8).getPaint().getColorFilter());
                    if (p9 == 0) {
                        return v2_3;
                    } else {
                        return new android.graphics.drawable.ClipDrawable(v2_3, 3, 1);
                    }
                }
            } else {
                int v9_3 = ((android.graphics.drawable.LayerDrawable) p8).getNumberOfLayers();
                int v0_4 = new android.graphics.drawable.Drawable[v9_3];
                int v2_4 = 0;
                int v3_4 = 0;
                while (v3_4 < v9_3) {
                    android.graphics.drawable.Drawable v4_4;
                    android.graphics.drawable.Drawable v4_3 = ((android.graphics.drawable.LayerDrawable) p8).getId(v3_4);
                    android.graphics.Shader$TileMode v5_2 = ((android.graphics.drawable.LayerDrawable) p8).getDrawable(v3_4);
                    if ((v4_3 != 16908301) && (v4_3 != 16908303)) {
                        v4_4 = 0;
                    } else {
                        v4_4 = 1;
                    }
                    v0_4[v3_4] = this.e(v5_2, v4_4);
                    v3_4++;
                }
                android.graphics.drawable.LayerDrawable v1_2 = new android.graphics.drawable.LayerDrawable(v0_4);
                while (v2_4 < v9_3) {
                    v1_2.setId(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getId(v2_4));
                    v1_2.setLayerGravity(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerGravity(v2_4));
                    v1_2.setLayerWidth(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerWidth(v2_4));
                    v1_2.setLayerHeight(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerHeight(v2_4));
                    v1_2.setLayerInsetLeft(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerInsetLeft(v2_4));
                    v1_2.setLayerInsetRight(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerInsetRight(v2_4));
                    v1_2.setLayerInsetTop(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerInsetTop(v2_4));
                    v1_2.setLayerInsetBottom(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerInsetBottom(v2_4));
                    v1_2.setLayerInsetStart(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerInsetStart(v2_4));
                    v1_2.setLayerInsetEnd(v2_4, ((android.graphics.drawable.LayerDrawable) p8).getLayerInsetEnd(v2_4));
                    v2_4++;
                }
                return v1_2;
            }
        } else {
            ((i0.b) ((i0.a) p8)).getClass();
        }
        return p8;
    }
}
