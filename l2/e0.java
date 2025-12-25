package l2;
public class e0 extends androidx.fragment.app.e0 {
    public com.google.android.material.materialswitch.MaterialSwitch[] a;
    public android.view.ViewGroup b;

    public e0()
    {
        return;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater p2, android.view.ViewGroup p3, android.os.Bundle p4)
    {
        return p2.inflate(2131558453, p3, 0);
    }

    public final void onViewCreated(android.view.View p12, android.os.Bundle p13)
    {
        this.b = ((android.view.ViewGroup) p12.findViewById(2131362058));
        String[] v0_4 = ((com.google.android.material.materialswitch.MaterialSwitch) p12.findViewById(2131362318));
        p12.findViewById(2131362510);
        p12.findViewById(2131362462);
        p12.findViewById(2131362217);
        p12.findViewById(2131362328);
        p12.findViewById(2131362297);
        p12.findViewById(2131362612);
        p12.findViewById(2131362405);
        p12.findViewById(2131361991);
        this.a = new com.google.android.material.materialswitch.MaterialSwitch[] {v0_4, ((com.google.android.material.materialswitch.MaterialSwitch) p12.findViewById(2131362054))});
        l2.a0 v12_4 = ((l2.a0) this.getParentFragment());
        if (v12_4 != null) {
            com.google.android.material.materialswitch.MaterialSwitch[] v13_22 = v12_4.F2.a;
            if ((v13_22 != null) && (v13_22.length != 0)) {
                int v1_1 = v12_4.o0;
                String v3 = v12_4.r0;
                String v5 = v12_4.s0;
                v12_4.getString(2131952499);
                String v8 = v12_4.u0;
                int v1_2 = 0;
                while (v1_2 < v13_22.length) {
                    com.google.android.material.materialswitch.MaterialSwitch v2_2 = v13_22[v1_2];
                    if (v2_2 != null) {
                        v12_4.G(v2_2, new String[] {v1_1, v12_4.w0})[v1_2], 1);
                    }
                    v1_2++;
                }
            }
        }
        return;
    }
}
