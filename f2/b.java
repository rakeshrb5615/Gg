package f2;
public final class b extends android.util.Property {
    public final synthetic int a;

    public synthetic b(String p1, int p2, Class p3)
    {
        this.a = p2;
        super(p3, p1);
        return;
    }

    public final Object get(Object p2)
    {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return Float.valueOf(f2.c0.a.G(((android.view.View) p2)));
            case 6:
                return ((android.view.View) p2).getClipBounds();
            default:
                return Float.valueOf(((androidx.appcompat.widget.SwitchCompat) p2).F);
        }
    }

    public final void set(Object p5, Object p6)
    {
        switch (this.a) {
            case 0:
                ((f2.e) p5).getClass();
                ((f2.e) p5).a = Math.round(((android.graphics.PointF) p6).x);
                int v6_22 = Math.round(((android.graphics.PointF) p6).y);
                ((f2.e) p5).b = v6_22;
                android.view.View v0_15 = (((f2.e) p5).f + 1);
                ((f2.e) p5).f = v0_15;
                if (v0_15 == ((f2.e) p5).g) {
                    f2.c0.a(((f2.e) p5).e, ((f2.e) p5).a, v6_22, ((f2.e) p5).c, ((f2.e) p5).d);
                    ((f2.e) p5).f = 0;
                    ((f2.e) p5).g = 0;
                }
                return;
            case 1:
                ((f2.e) p5).getClass();
                ((f2.e) p5).c = Math.round(((android.graphics.PointF) p6).x);
                int v6_16 = Math.round(((android.graphics.PointF) p6).y);
                ((f2.e) p5).d = v6_16;
                android.view.View v0_10 = (((f2.e) p5).g + 1);
                ((f2.e) p5).g = v0_10;
                if (((f2.e) p5).f == v0_10) {
                    f2.c0.a(((f2.e) p5).e, ((f2.e) p5).a, ((f2.e) p5).b, ((f2.e) p5).c, v6_16);
                    ((f2.e) p5).f = 0;
                    ((f2.e) p5).g = 0;
                }
                return;
            case 2:
                f2.c0.a(((android.view.View) p5), ((android.view.View) p5).getLeft(), ((android.view.View) p5).getTop(), Math.round(((android.graphics.PointF) p6).x), Math.round(((android.graphics.PointF) p6).y));
                return;
            case 3:
                android.view.View v5_4 = ((android.view.View) p5);
                f2.c0.a(v5_4, Math.round(((android.graphics.PointF) p6).x), Math.round(((android.graphics.PointF) p6).y), v5_4.getRight(), ((android.view.View) p5).getBottom());
                return;
            case 4:
                android.view.View v0_3 = Math.round(((android.graphics.PointF) p6).x);
                int v6_6 = Math.round(((android.graphics.PointF) p6).y);
                f2.c0.a(((android.view.View) p5), v0_3, v6_6, (android.view.View v5_2.getWidth() + v0_3), (((android.view.View) p5).getHeight() + v6_6));
                return;
            case 5:
                f2.c0.a.S(((android.view.View) p5), ((Float) p6).floatValue());
                return;
            case 6:
                ((android.view.View) p5).setClipBounds(((android.graphics.Rect) p6));
                return;
            default:
                ((androidx.appcompat.widget.SwitchCompat) p5).setThumbPosition(((Float) p6).floatValue());
                return;
        }
    }
}
