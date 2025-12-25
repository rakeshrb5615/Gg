package l2;
public class b0 extends androidx.fragment.app.e0 {
    public android.content.Context a;
    public android.view.ViewGroup b;
    public android.widget.TextView c;
    public android.widget.ImageButton[] d;
    public android.widget.ImageButton[] e;
    public com.google.android.material.button.MaterialButtonToggleGroup f;
    public android.widget.TextView m;
    public l2.a0 n;
    public android.widget.ImageButton o;
    public android.widget.ImageButton p;
    public android.widget.ImageView q;
    public android.widget.ImageView r;
    public com.google.android.material.materialswitch.MaterialSwitch s;
    public com.google.android.material.materialswitch.MaterialSwitch t;

    public b0()
    {
        return;
    }

    public final void f()
    {
        l2.a0 v0_0 = this.n;
        if (v0_0 != null) {
            v0_0.m(this.e, -1);
            this.n.v(this.d);
            l2.a0 v0_3 = this.n;
            com.google.android.material.button.MaterialButtonToggleGroup v1_3 = this.d;
            int v4 = 0;
            v0_3.Y = v0_3.v.getBoolean(v0_3.I0, 0);
            int v2_2 = v1_3.length;
            while (v4 < v2_2) {
                v1_3[v4].setEnabled((v0_3.Y ^ 1));
                v4++;
            }
            this.n.E(this.f);
            return;
        } else {
            return;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        return p2.inflate(2131558549, p3, 0);
    }

    public final void onViewCreated(android.view.View p11, android.os.Bundle p12)
    {
        this.a = this.requireContext();
        this.n = ((l2.a0) this.getParentFragment());
        this.b = ((android.view.ViewGroup) p11.findViewById(2131362410));
        this.o = ((android.widget.ImageButton) p11.findViewById(2131362609));
        this.p = ((android.widget.ImageButton) p11.findViewById(2131362393));
        this.q = ((android.widget.ImageView) p11.findViewById(2131362352));
        this.r = ((android.widget.ImageView) p11.findViewById(2131362162));
        this.c = ((android.widget.TextView) p11.findViewById(2131362605));
        android.widget.TextView v0_7 = ((android.widget.ImageButton) p11.findViewById(2131362463));
        p11.findViewById(2131362298);
        p11.findViewById(2131361974);
        p11.findViewById(2131362289);
        p11.findViewById(2131362327);
        p11.findViewById(2131362427);
        p11.findViewById(2131362511);
        p11.findViewById(2131362512);
        p11.findViewById(2131361798);
        l2.a0 v12_64 = new android.widget.ImageButton[] {v0_7, ((android.widget.ImageButton) p11.findViewById(2131361800))});
        this.d = v12_64;
        android.widget.TextView v0_8 = this.n;
        android.widget.ImageButton v1_5 = this.c;
        v0_8.getClass();
        android.widget.ImageButton v3_7 = 0;
        while (v3_7 < 10) {
            v12_64[v3_7].setOnClickListener(new l2.c(v0_8, v12_64, v3_7, v1_5));
            v3_7++;
        }
        v0_8.K(v1_5);
        this.n.v(this.d);
        l2.a0 v12_4 = ((com.google.android.material.button.MaterialButtonToggleGroup) p11.findViewById(2131362351));
        this.f = v12_4;
        android.widget.TextView v0_0 = this.n;
        v0_0.getClass();
        v12_4.q.add(new l2.i(v0_0, 0));
        v0_0.E(v12_4);
        l2.a0 v12_7 = ((com.google.android.material.materialswitch.MaterialSwitch) p11.findViewById(2131362049));
        this.s = v12_7;
        this.n.n(v12_7);
        l2.a0 v12_11 = ((com.google.android.material.materialswitch.MaterialSwitch) p11.findViewById(2131362161));
        this.t = v12_11;
        android.widget.TextView v0_2 = this.n;
        android.widget.ImageButton v1_2 = this.a;
        v0_2.getClass();
        ((android.widget.LinearLayout) v12_11.getParent()).setOnClickListener(new l2.j(v12_11, 1));
        v12_11.setChecked(v0_2.v.getBoolean(v0_2.H0, 0));
        v12_11.setOnClickListener(new k2.b(v0_2, v12_11, v1_2, 1));
        this.m = ((android.widget.TextView) p11.findViewById(2131362391));
        android.widget.TextView v0_4 = ((android.widget.ImageButton) p11.findViewById(2131362437));
        p11.findViewById(2131362461);
        p11.findViewById(2131361905);
        p11.findViewById(2131362615);
        p11.findViewById(2131361903);
        android.widget.ImageButton[] v11_2 = new android.widget.ImageButton[] {v0_4, ((android.widget.ImageButton) p11.findViewById(2131362329))});
        this.e = v11_2;
        this.n.p(v11_2, this.m);
        return;
    }
}
