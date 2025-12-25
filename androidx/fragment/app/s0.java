package androidx.fragment.app;
public final class s0 implements e.b {
    public final synthetic int a;
    public final synthetic androidx.fragment.app.b1 b;

    public synthetic s0(androidx.fragment.app.b1 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onActivityResult(Object p6)
    {
        switch (this.a) {
            case 0:
                int v2_2 = new String[0];
                String v0_12 = ((String[]) ((java.util.Map) p6).keySet().toArray(v2_2));
                int v2_4 = new java.util.ArrayList(((java.util.Map) p6).values());
                String v6_19 = new int[v2_4.size()];
                int v3_2 = 0;
                while (v3_2 < v2_4.size()) {
                    String v4_5;
                    if (!((Boolean) v2_4.get(v3_2)).booleanValue()) {
                        v4_5 = -1;
                    } else {
                        v4_5 = 0;
                    }
                    v6_19[v3_2] = v4_5;
                    v3_2++;
                }
                androidx.fragment.app.e0 v1_4 = this.b;
                int v2_7 = ((androidx.fragment.app.y0) v1_4.C.pollFirst());
                if (v2_7 != 0) {
                    String v4_1 = v2_7.a;
                    int v2_8 = v2_7.b;
                    androidx.fragment.app.e0 v1_7 = v1_4.c.c(v4_1);
                    if (v1_7 != null) {
                        v1_7.onRequestPermissionsResult(v2_8, v0_12, v6_19);
                    } else {
                        String v6_21 = new StringBuilder("Permission request result delivered for unknown Fragment ");
                        v6_21.append(v4_1);
                        android.util.Log.w("FragmentManager", v6_21.toString());
                    }
                } else {
                    String v6_24 = new StringBuilder("No permissions were requested for ");
                    v6_24.append(this);
                    android.util.Log.w("FragmentManager", v6_24.toString());
                }
                return;
            case 1:
                String v0_9 = this.b;
                androidx.fragment.app.e0 v1_8 = ((androidx.fragment.app.y0) v0_9.C.pollLast());
                if (v1_8 != null) {
                    int v3_0 = v1_8.a;
                    androidx.fragment.app.e0 v1_1 = v1_8.b;
                    String v0_6 = v0_9.c.c(v3_0);
                    if (v0_6 != null) {
                        v0_6.onActivityResult(v1_1, ((e.a) p6).a, ((e.a) p6).b);
                    } else {
                        String v6_11 = new StringBuilder("Activity result delivered for unknown Fragment ");
                        v6_11.append(v3_0);
                        android.util.Log.w("FragmentManager", v6_11.toString());
                    }
                } else {
                    String v6_14 = new StringBuilder("No Activities were started for result for ");
                    v6_14.append(this);
                    android.util.Log.w("FragmentManager", v6_14.toString());
                }
                return;
            default:
                String v0_15 = this.b;
                androidx.fragment.app.e0 v1_11 = ((androidx.fragment.app.y0) v0_15.C.pollFirst());
                if (v1_11 != null) {
                    int v3_1 = v1_11.a;
                    androidx.fragment.app.e0 v1_0 = v1_11.b;
                    String v0_2 = v0_15.c.c(v3_1);
                    if (v0_2 != null) {
                        v0_2.onActivityResult(v1_0, ((e.a) p6).a, ((e.a) p6).b);
                    } else {
                        String v6_3 = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                        v6_3.append(v3_1);
                        android.util.Log.w("FragmentManager", v6_3.toString());
                    }
                } else {
                    String v6_6 = new StringBuilder("No IntentSenders were started for ");
                    v6_6.append(this);
                    android.util.Log.w("FragmentManager", v6_6.toString());
                }
                return;
        }
    }
}
