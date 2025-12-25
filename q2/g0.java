package q2;
public final enum class g0 extends java.lang.Enum {
    public static final android.util.SparseArray a;
    public static final synthetic q2.g0[] b;

    static g0()
    {
        q2.g0 v1_19 = new q2.g0("UNKNOWN_MOBILE_SUBTYPE", 0);
        int v2_11 = new q2.g0("GPRS", 1);
        q2.g0 v3_0 = new q2.g0("EDGE", 2);
        q2.g0 v4_1 = new q2.g0("UMTS", 3);
        q2.g0 v5_3 = new q2.g0("CDMA", 4);
        q2.g0 v6_2 = new q2.g0("EVDO_0", 5);
        q2.g0 v7_3 = new q2.g0("EVDO_A", 6);
        q2.g0 v8_2 = new q2.g0("RTT", 7);
        q2.g0 v9_3 = new q2.g0("HSDPA", 8);
        q2.g0 v10_3 = new q2.g0("HSUPA", 9);
        q2.g0 v11_3 = new q2.g0("HSPA", 10);
        q2.g0 v12_3 = new q2.g0("IDEN", 11);
        q2.g0 v13_3 = new q2.g0("EVDO_B", 12);
        q2.g0 v14_3 = new q2.g0("LTE", 13);
        q2.g0 v22 = v1_19;
        q2.g0 v15_6 = new q2.g0("EHRPD", 14);
        q2.g0 v1_29 = v22;
        int v2_0 = v2_11;
        q2.g0.b = new q2.g0[] {v1_29, new q2.g0("COMBINED", 20)});
        android.util.SparseArray v0_2 = new android.util.SparseArray();
        q2.g0.a = v0_2;
        q2.g0 v17_1 = v15_6;
        v0_2.put(0, v1_29);
        v0_2.put(1, v2_0);
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
        v0_2.put(14, v17_1);
        v0_2.put(15, new q2.g0("HSPAP", 15));
        v0_2.put(16, new q2.g0("GSM", 16));
        v0_2.put(17, new q2.g0("TD_SCDMA", 17));
        v0_2.put(18, new q2.g0("IWLAN", 18));
        v0_2.put(19, new q2.g0("LTE_CA", 19));
        return;
    }

    public static q2.g0 valueOf(String p1)
    {
        return ((q2.g0) Enum.valueOf(q2.g0, p1));
    }

    public static q2.g0[] values()
    {
        return ((q2.g0[]) q2.g0.b.clone());
    }
}
