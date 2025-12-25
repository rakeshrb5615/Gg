package v3;
public final class n extends j5.t1 {

    public final void x(v3.z p7, float p8, float p9)
    {
        float v9_1 = (p9 * p8);
        p7.d(0, v9_1, 1127481344, 1119092736);
        float v9_6 = (v9_1 * 1073741824);
        int v3_2 = new v3.v(0, 0, v9_6, v9_6);
        v3_2.f = 1127481344;
        v3_2.g = 1119092736;
        p7.g.add(v3_2);
        float v1_2 = new v3.t(v3_2);
        p7.a(1127481344);
        p7.h.add(v1_2);
        p7.e = 1132920832;
        float v1_4 = ((0 + v9_6) * 1056964608);
        float v9_3 = ((v9_6 - 0) / 1073741824);
        p7.c = ((((float) Math.cos(Math.toRadians(((double) 1132920832)))) * v9_3) + v1_4);
        p7.d = ((v9_3 * ((float) Math.sin(Math.toRadians(((double) 1132920832))))) + v1_4);
        return;
    }
}
