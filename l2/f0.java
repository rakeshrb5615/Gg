package l2;
public class f0 extends androidx.fragment.app.e0 {
    public l2.a0 a;
    public android.view.ViewGroup b;
    public android.widget.TextView c;
    public android.widget.ImageButton[] d;
    public com.google.android.material.slider.Slider[] e;
    public android.widget.ImageButton f;
    public com.google.android.material.button.MaterialButtonToggleGroup m;
    public android.widget.ImageView n;
    public com.google.android.material.materialswitch.MaterialSwitch o;
    public final int[] p;

    public f0()
    {
        this.p = new int[] {15, 65, 50});
        return;
    }

    public final void f()
    {
        l2.a0 v0_0 = this.a;
        if (v0_0 != null) {
            v0_0.v(this.d);
            l2.a0 v0_4 = this.a;
            com.google.android.material.button.MaterialButtonToggleGroup v1_4 = this.d;
            int v4 = 0;
            v0_4.Y = v0_4.v.getBoolean(v0_4.I0, 0);
            int v2_1 = v1_4.length;
            com.google.android.material.button.MaterialButtonToggleGroup v3_0 = 0;
            while (v3_0 < v2_1) {
                v1_4[v3_0].setEnabled((v0_4.Y ^ 1));
                v3_0++;
            }
            l2.a0 v0_1 = this.a;
            com.google.android.material.button.MaterialButtonToggleGroup v1_0 = this.e;
            if (v1_0 != null) {
                v0_1.Y = v0_1.v.getBoolean(v0_1.I0, 0);
                int v2_4 = v1_0.length;
                while (v4 < v2_4) {
                    v1_0[v4].setEnabled((v0_1.Y ^ 1));
                    v4++;
                }
                v0_1.s();
            } else {
                v0_1.getClass();
            }
            this.a.x(this.e);
            this.a.E(this.m);
            return;
        } else {
            return;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        return p2.inflate(2131558554, p3, 0);
    }

    public final void onViewCreated(android.view.View p11, android.os.Bundle p12)
    {
        this.a = ((l2.a0) this.getParentFragment());
        this.b = ((android.view.ViewGroup) p11.findViewById(2131362608));
        this.c = ((android.widget.TextView) p11.findViewById(2131362605));
        String[] v12_8 = ((com.google.android.material.materialswitch.MaterialSwitch) p11.findViewById(2131362049));
        this.o = v12_8;
        this.a.n(v12_8);
        this.f = ((android.widget.ImageButton) p11.findViewById(2131362609));
        this.n = ((android.widget.ImageView) p11.findViewById(2131362352));
        this.m = ((com.google.android.material.button.MaterialButtonToggleGroup) p11.findViewById(2131362351));
        l2.a0 v0_8 = ((android.widget.ImageButton) p11.findViewById(2131362463));
        p11.findViewById(2131362298);
        p11.findViewById(2131361974);
        p11.findViewById(2131362289);
        p11.findViewById(2131362327);
        p11.findViewById(2131362427);
        p11.findViewById(2131362511);
        p11.findViewById(2131362512);
        p11.findViewById(2131361798);
        String[] v12_42 = new android.widget.ImageButton[] {v0_8, ((android.widget.ImageButton) p11.findViewById(2131361800))});
        this.d = v12_42;
        l2.a0 v0_9 = this.a;
        int[] v1_8 = this.c;
        v0_9.getClass();
        int v2_3 = 0;
        while (v2_3 < 10) {
            v12_42[v2_3].setOnClickListener(new l2.c(v0_9, v12_42, v2_3, v1_8));
            v2_3++;
        }
        v0_9.K(v1_8);
        String[] v12_44 = this.a;
        l2.a0 v0_10 = this.m;
        v12_44.getClass();
        v0_10.q.add(new l2.i(v12_44, 0));
        v12_44.E(v0_10);
        String[] v12_4 = new String[] {this.getString(2131951749), this.getString(2131952244), this.getString(2131952500)});
        com.google.android.material.slider.Slider[] v11_3 = new com.google.android.material.slider.Slider[] {((com.google.android.material.slider.Slider) p11.findViewById(2131361972)), ((com.google.android.material.slider.Slider) p11.findViewById(2131362319)), ((com.google.android.material.slider.Slider) p11.findViewById(2131362613))});
        this.e = v11_3;
        this.a.q(v11_3, v12_4, this.p);
        return;
    }
}
