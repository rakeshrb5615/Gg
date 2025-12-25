package l2;
public final synthetic class e implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic l2.a0 b;

    public synthetic e(l2.a0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                float v1_9;
                l2.e v0_5 = this.b;
                float v1_7 = (v0_5.G2 + 350);
                v0_5.G2 = v1_7;
                if (v1_7 <= 1000) {
                    v1_9 = 0;
                } else {
                    v1_9 = 1;
                }
                if ((v0_5.v.getBoolean(v0_5.G0, 0)) && (v1_9 != 0)) {
                    float v1_11 = m2.a.a();
                    v0_5.H.setValue(((float) ((int) (v1_11 / 1015580809))));
                    v0_5.F(v1_11);
                }
                v0_5.v.edit().putInt(v0_5.F0, ((int) v0_5.H.getValue())).apply();
                v0_5.K1.postDelayed(v0_5.L1, 350);
                return;
            case 1:
                l2.e v0_3 = this.b;
                if (v0_3.j2) {
                    v0_3.L();
                    v0_3.j2 = 0;
                }
                v0_3.M1.postDelayed(v0_3.N1, 33);
                return;
            case 2:
                l2.e v0_1 = this.b;
                float v1_10 = v0_1.C.isSelected();
                com.google.android.material.slider.Slider v2_7 = v0_1.D.isSelected();
                android.view.ViewGroup v3_2 = ((android.view.ViewGroup) v0_1.requireView().findViewById(2131362342));
                if ((v1_10 != 0) || (v2_7 != null)) {
                    v3_2.removeView(v0_1.d);
                    v3_2.addView(v0_1.d, 0);
                    i2.y.f(v0_1.d);
                }
                return;
            default:
                this.b.j2 = 1;
                return;
        }
    }
}
