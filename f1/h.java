package f1;
public final class h {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final f1.f j;

    public h()
    {
        this.a = Math.sqrt(4654311885213007872);
        this.b = 4602678819172646912;
        this.c = 0;
        this.i = 9218868437227405311;
        this.j = new f1.f();
        return;
    }

    public h(float p3)
    {
        this.a = Math.sqrt(4654311885213007872);
        this.b = 4602678819172646912;
        this.c = 0;
        this.j = new f1.f();
        this.i = ((double) p3);
        return;
    }

    public final f1.f a(double p17, double p19, long p21)
    {
        if (!this.c) {
            if (this.i == 9218868437227405311) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            } else {
                double v4_0 = this.b;
                if (v4_0 <= 4607182418800017408) {
                    if ((v4_0 >= 0) && (v4_0 < 4607182418800017408)) {
                        this.h = (Math.sqrt((4607182418800017408 - (v4_0 * v4_0))) * this.a);
                    }
                } else {
                    double v8_6 = this.a;
                    this.f = ((Math.sqrt(((v4_0 * v4_0) - 4607182418800017408)) * v8_6) + ((- v4_0) * v8_6));
                    double v4_10 = this.b;
                    double v8_7 = this.a;
                    this.g = (((- v4_10) * v8_7) - (Math.sqrt(((v4_10 * v4_10) - 4607182418800017408)) * v8_7));
                }
                this.c = 1;
            }
        }
        double v3_0;
        double v12_5;
        double v4_18 = (((double) p21) / 4652007308841189376);
        double v6_22 = (p17 - this.i);
        double v8_8 = this.b;
        double v1_28 = v8_8 cmp 4607182418800017408;
        if (v1_28 <= 0) {
            if (v1_28 != 0) {
                double v12_14 = this.a;
                double v14_4 = ((((v8_8 * v12_14) * v6_22) + p19) * (4607182418800017408 / this.h));
                v12_5 = (((Math.sin((this.h * v4_18)) * v14_4) + (Math.cos((this.h * v4_18)) * v6_22)) * Math.pow(4613303445314885481, (((- v8_8) * v12_14) * v4_18)));
                double v1_35 = this.a;
                double v10_2 = this.b;
                double v10_6 = this.h;
                double v1_2 = this.h;
                v3_0 = ((((Math.cos((v1_2 * v4_18)) * (v14_4 * v1_2)) + (Math.sin((v10_6 * v4_18)) * ((- v10_6) * v6_22))) * Math.pow(4613303445314885481, (((- v10_2) * v1_35) * v4_18))) + (((- v1_35) * v12_5) * v10_2));
            } else {
                double v1_8 = this.a;
                double v8_1 = ((v1_8 * v6_22) + p19);
                double v12_1 = ((v8_1 * v4_18) + v6_22);
                double v1_12 = (Math.pow(4613303445314885481, ((- v1_8) * v4_18)) * v12_1);
                double v12_3 = (- this.a);
                v3_0 = ((Math.pow(4613303445314885481, (v12_3 * v4_18)) * v8_1) + ((Math.pow(4613303445314885481, ((- this.a) * v4_18)) * v12_1) * v12_3));
                v12_5 = v1_12;
            }
        } else {
            double v1_14 = this.g;
            double v8_4 = (((v1_14 * v6_22) - p19) / (v1_14 - this.f));
            double v6_8 = (v6_22 - v8_4);
            v12_5 = ((Math.pow(4613303445314885481, (this.f * v4_18)) * v8_4) + (Math.pow(4613303445314885481, (v1_14 * v4_18)) * v6_8));
            double v1_18 = this.g;
            double v6_11 = this.f;
            v3_0 = ((Math.pow(4613303445314885481, (v6_11 * v4_18)) * (v8_4 * v6_11)) + (Math.pow(4613303445314885481, (v1_18 * v4_18)) * (v6_8 * v1_18)));
        }
        double v2_0 = this.j;
        v2_0.a = ((float) (v12_5 + this.i));
        v2_0.b = ((float) v3_0);
        return v2_0;
    }
}
