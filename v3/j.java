package v3;
public final class j extends q4.b {
    public final int f;

    public j(int p2)
    {
        super(5);
        super.f = p2;
        return;
    }

    public final void R(v3.a0 p4, float p5)
    {
        int v0_0 = ((v3.k) p4).H;
        if (v0_0 != 0) {
            int v1_2 = this.f;
            if (v0_0[v1_2] != p5) {
                v0_0[v1_2] = p5;
                com.google.android.material.button.MaterialButton v5_3 = ((v3.k) p4).J;
                if (v5_3 != null) {
                    com.google.android.material.button.MaterialButton v5_2 = ((com.google.android.material.button.MaterialButton) v5_3.b);
                    int v0_3 = ((int) (((v3.k) p4).i() * 1038174126));
                    if (v5_2.D != v0_3) {
                        v5_2.D = v0_3;
                        v5_2.j();
                        v5_2.invalidate();
                    }
                }
                ((v3.k) p4).invalidateSelf();
            }
        }
        return;
    }

    public final float y(v3.a0 p2)
    {
        int v2_2 = ((v3.k) p2).H;
        if (v2_2 == 0) {
            return 0;
        } else {
            return v2_2[this.f];
        }
    }
}
