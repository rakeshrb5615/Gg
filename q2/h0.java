package q2;
public final enum class h0 extends java.lang.Enum {
    public static final android.util.SparseArray a;
    public static final synthetic q2.h0[] b;

    static h0()
    {
        int v1_18 = new q2.h0("MOBILE", 0);
        q2.h0 v2_9 = new q2.h0("WIFI", 1);
        q2.h0 v3_0 = new q2.h0("MOBILE_MMS", 2);
        q2.h0 v4_1 = new q2.h0("MOBILE_SUPL", 3);
        q2.h0 v5_3 = new q2.h0("MOBILE_DUN", 4);
        q2.h0 v6_2 = new q2.h0("MOBILE_HIPRI", 5);
        q2.h0 v7_3 = new q2.h0("WIMAX", 6);
        q2.h0 v8_2 = new q2.h0("BLUETOOTH", 7);
        q2.h0 v9_3 = new q2.h0("DUMMY", 8);
        q2.h0 v10_3 = new q2.h0("ETHERNET", 9);
        q2.h0 v11_3 = new q2.h0("MOBILE_FOTA", 10);
        q2.h0 v12_3 = new q2.h0("MOBILE_IMS", 11);
        q2.h0 v13_3 = new q2.h0("MOBILE_CBS", 12);
        q2.h0 v14_3 = new q2.h0("WIFI_P2P", 13);
        q2.h0 v21 = v1_18;
        q2.h0 v15_6 = new q2.h0("MOBILE_IA", 14);
        q2.h0 v19 = new q2.h0("NONE", 18);
        int v1_25 = v21;
        q2.h0 v2_12 = v2_9;
        q2.h0 v29 = v19;
        q2.h0.b = new q2.h0[] {v1_25, v19});
        android.util.SparseArray v0_2 = new android.util.SparseArray();
        q2.h0.a = v0_2;
        q2.h0 v17_0 = v15_6;
        v0_2.put(0, v1_25);
        v0_2.put(1, v2_12);
        v0_2.put(2, v3_0);
        v0_2.put(3, v4_1);
        v0_2.put(4, v5_3);
        v0_2.put(5, v6_2);
        v0_2.put(6, v7_3);
        v0_2.put(7, v8_2);
        v0_2.put(8, v9_3);
        v0_2.put(9, v10_3);
        v0_2.put(10, v11_3);
        v0_2.put(11, v12_3);
        v0_2.put(12, v13_3);
        v0_2.put(13, v14_3);
        v0_2.put(14, v17_0);
        v0_2.put(15, new q2.h0("MOBILE_EMERGENCY", 15));
        v0_2.put(16, new q2.h0("PROXY", 16));
        v0_2.put(17, new q2.h0("VPN", 17));
        v0_2.put(-1, v29);
        return;
    }

    public static q2.h0 valueOf(String p1)
    {
        return ((q2.h0) Enum.valueOf(q2.h0, p1));
    }

    public static q2.h0[] values()
    {
        return ((q2.h0[]) q2.h0.b.clone());
    }
}
