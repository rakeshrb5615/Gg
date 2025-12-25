package l2;
public class b extends androidx.fragment.app.e0 {
    public l2.a0 a;
    public android.view.ViewGroup b;
    public android.widget.TextView c;
    public com.google.android.material.slider.Slider[] d;
    public com.google.android.material.materialswitch.MaterialSwitch[] e;
    public android.widget.ImageButton[] f;
    public android.widget.TextView[] m;
    public android.widget.ImageButton n;
    public final int[] o;

    public b()
    {
        this.o = new int[] {0, 0, 100, 100});
        return;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        return p2.inflate(2131558543, p3, 0);
    }

    public final void onViewCreated(android.view.View p10, android.os.Bundle p11)
    {
        this.a = ((l2.a0) this.getParentFragment());
        this.b = ((android.view.ViewGroup) p10.findViewById(2131362372));
        this.c = ((android.widget.TextView) p10.findViewById(2131362391));
        this.n = ((android.widget.ImageButton) p10.findViewById(2131362393));
        this.m = new android.widget.TextView[] {((android.widget.TextView) p10.findViewById(2131361916)), ((android.widget.TextView) p10.findViewById(2131362152))});
        this.e = new com.google.android.material.materialswitch.MaterialSwitch[] {((com.google.android.material.materialswitch.MaterialSwitch) p10.findViewById(2131362154)), ((com.google.android.material.materialswitch.MaterialSwitch) p10.findViewById(2131361875))});
        com.google.android.material.slider.Slider v11_35 = this.a;
        int v0_13 = v11_35.E2.e;
        if ((v0_13 != 0) && (v0_13.length != 0)) {
            boolean[] v4_5 = new boolean[2];
            v4_5 = {0, 1};
            int v5_1 = 0;
            while (v5_1 < v0_13.length) {
                int v6_2 = v0_13[v5_1];
                if (v6_2 != 0) {
                    v11_35.G(v6_2, new String[] {v11_35.T0, v11_35.S0})[v5_1], v4_5[v5_1]);
                }
                v5_1++;
            }
        }
        String[] v3_12 = ((android.widget.ImageButton) p10.findViewById(2131362437));
        p10.findViewById(2131362461);
        p10.findViewById(2131361905);
        p10.findViewById(2131362615);
        p10.findViewById(2131361903);
        com.google.android.material.slider.Slider v11_51 = new android.widget.ImageButton[] {v3_12, ((android.widget.ImageButton) p10.findViewById(2131362329))});
        this.f = v11_51;
        this.a.p(v11_51, this.c);
        String[] v3_1 = ((com.google.android.material.slider.Slider) p10.findViewById(2131362028));
        p10.findViewById(2131361915);
        p10.findViewById(2131361880);
        p10.findViewById(2131362364);
        p10.findViewById(2131362003);
        java.util.ArrayList v10_2 = new com.google.android.material.slider.Slider[] {v3_1, ((com.google.android.material.slider.Slider) p10.findViewById(2131362096))});
        this.d = v10_2;
        this.a.q(new com.google.android.material.slider.Slider[] {v10_2[0], v10_2[3], v10_2[4], v10_2[5]}), new String[] {this.getString(2131951815), this.getString(2131951785), this.getString(2131951803), this.getString(2131951876)}), this.o);
        java.util.ArrayList v10_5 = this.a;
        com.google.android.material.slider.Slider v11_21 = this.d[1];
        v10_5.getClass();
        i2.y.c(v11_21);
        v10_5.z(v11_21, v10_5.U0, 0);
        v11_21.s.add(new l2.h(v10_5, 1));
        java.util.ArrayList v10_7 = this.a;
        com.google.android.material.slider.Slider v11_24 = this.d[2];
        v10_7.getClass();
        i2.y.c(v11_24);
        v10_7.z(v11_24, v10_7.b1, 100);
        v11_24.s.add(new l2.g(v10_7, v10_7.Z1.b, 1));
        return;
    }
}
