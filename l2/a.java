package l2;
public class a extends androidx.fragment.app.e0 {
    public android.view.ViewGroup a;
    public com.google.android.material.slider.Slider[] b;
    public com.google.android.material.materialswitch.MaterialSwitch[] c;
    public l2.a0 d;
    public android.view.View e;

    public a()
    {
        return;
    }

    public final android.view.View getView()
    {
        return this.e;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        return p2.inflate(2131558487, p3, 0);
    }

    public final void onViewCreated(android.view.View p8, android.os.Bundle p9)
    {
        this.e = p8;
        this.d = ((l2.a0) this.getParentFragment());
        this.a = ((android.view.ViewGroup) p8.findViewById(2131362210));
        this.c = new com.google.android.material.materialswitch.MaterialSwitch[] {((com.google.android.material.materialswitch.MaterialSwitch) p8.findViewById(2131362470)), ((com.google.android.material.materialswitch.MaterialSwitch) p8.findViewById(2131362514)), ((com.google.android.material.materialswitch.MaterialSwitch) p8.findViewById(2131362316))});
        int[] v9_5 = this.d;
        l2.a0 v0_4 = v9_5.C2.c;
        if ((v0_4 != null) && (v0_4.length != 0)) {
            boolean[] v2_2 = new boolean[4];
            v2_2 = {1, 1, 0, 0};
            int v3_1 = 0;
            while (v3_1 < v0_4.length) {
                l2.a0 v4_2 = v0_4[v3_1];
                if (v4_2 != null) {
                    v9_5.G(v4_2, new String[] {v9_5.N0, v9_5.O0, v9_5.P0, v9_5.Q0})[v3_1], v2_2[v3_1]);
                }
                v3_1++;
            }
        }
        this.b = new com.google.android.material.slider.Slider[] {((com.google.android.material.slider.Slider) p8.findViewById(2131362419)), ((com.google.android.material.slider.Slider) p8.findViewById(2131362420))});
        this.d.q(this.b, new String[] {this.getString(2131951692), this.getString(2131952379)}), new int[] {20, 40}));
        return;
    }
}
