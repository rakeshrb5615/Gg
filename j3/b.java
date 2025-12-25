package j3;
public final class b extends a2.q0 {
    public final android.graphics.Paint a;
    public final java.util.List b;

    public b()
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        this.a = v0_1;
        this.b = java.util.Collections.unmodifiableList(new java.util.ArrayList());
        v0_1.setStrokeWidth(1084227584);
        v0_1.setColor(-65281);
        return;
    }

    public final void b(android.graphics.Canvas p8, androidx.recyclerview.widget.RecyclerView p9)
    {
        android.graphics.Paint v6 = this.a;
        v6.setStrokeWidth(p9.getResources().getDimension(2131165442));
        java.util.Iterator v0_3 = this.b.iterator();
        while (v0_3.hasNext()) {
            int v1_9;
            ((j3.d) v0_3.next()).getClass();
            v6.setColor(h0.a.d(-65281, -16776961, 0));
            if (!((com.google.android.material.carousel.CarouselLayoutManager) p9.getLayoutManager()).E0()) {
                int v8_5;
                v1_9 = p8;
                int v8_3 = ((com.google.android.material.carousel.CarouselLayoutManager) p9.getLayoutManager()).q;
                switch (v8_3.b) {
                    case 0:
                        v8_5 = v8_3.c.D();
                        break;
                    default:
                        v8_5 = 0;
                }
                int v8_11;
                int v2_2 = ((float) v8_5);
                int v8_8 = ((com.google.android.material.carousel.CarouselLayoutManager) p9.getLayoutManager()).q;
                switch (v8_8.b) {
                    case 0:
                        int v8_9 = v8_8.c;
                        v8_11 = (v8_9.n - v8_9.E());
                        break;
                    default:
                        v8_11 = v8_8.c.n;
                }
                p8.drawLine(v2_2, 0, ((float) v8_11), 0, v6);
            } else {
                int v1_13;
                int v1_12 = ((com.google.android.material.carousel.CarouselLayoutManager) p9.getLayoutManager()).q;
                switch (v1_12.b) {
                    case 0:
                        v1_13 = 0;
                        break;
                    default:
                        v1_13 = v1_12.c.F();
                }
                int v2_5;
                int v3_4 = ((float) v1_13);
                int v1_17 = ((com.google.android.material.carousel.CarouselLayoutManager) p9.getLayoutManager()).q;
                switch (v1_17.b) {
                    case 0:
                        v2_5 = v1_17.c.o;
                        break;
                    default:
                        int v1_19 = v1_17.c;
                        v2_5 = (v1_19.o - v1_19.C());
                }
                v1_9 = p8;
                p8.drawLine(0, v3_4, 0, ((float) v2_5), v6);
            }
            p8 = v1_9;
        }
        return;
    }
}
