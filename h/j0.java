package h;
public final class j0 {
    public static h.j0 d;
    public long a;
    public long b;
    public int c;

    public final void a(double p15, double p17, long p19)
    {
        long v2_6 = (((float) (p19 - 946728000000)) / 1285868416);
        int v3_5 = ((1015868197 * v2_6) + 1086828178);
        float v4_10 = ((double) v3_5);
        long v8_13 = ((((Math.sin(((double) (v3_5 * 1077936128))) * 4527795603731644416) + ((Math.sin(((double) (1073741824 * v3_5))) * 4555074754578481152) + ((Math.sin(v4_10) * 4584977093208571904) + v4_10))) + 4610769955021710130) + 4614256656552045848);
        double v6_12 = ((- p17) / 4645040803167600640);
        long v2_16 = ((Math.sin((4611686018427387904 * v8_13)) * -4648766856319305620) + ((Math.sin(v4_10) * 4572760506128099233) + (((double) (((float) Math.round((((double) (v2_6 - 980151802)) - v6_12))) + 980151802)) + v6_12)));
        float v4_4 = Math.asin((Math.sin(4601044547609296896) * Math.sin(v8_13)));
        double v6_19 = (4580687790437564416 * p15);
        long v8_17 = ((Math.sin(-4631161762379464704) - (Math.sin(v4_4) * Math.sin(v6_19))) / (Math.cos(v4_4) * Math.cos(v6_19)));
        if (v8_17 < 4607182418800017408) {
            if (v8_17 > -4616189618054758400) {
                double v6_1 = ((double) ((float) (Math.acos(v8_17) / 4618760256179416344)));
                this.a = (Math.round(((v2_16 + v6_1) * 4725570615333879808)) + 946728000000);
                long v2_4 = (Math.round(((v2_16 - v6_1) * 4725570615333879808)) + 946728000000);
                this.b = v2_4;
                if ((v2_4 >= p19) || (this.a <= p19)) {
                    this.c = 1;
                    return;
                } else {
                    this.c = 0;
                    return;
                }
            } else {
                this.c = 0;
                this.a = -1;
                this.b = -1;
                return;
            }
        } else {
            this.c = 1;
            this.a = -1;
            this.b = -1;
            return;
        }
    }
}
