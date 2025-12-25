package androidx.datastore.preferences.protobuf;
public enum class p1 extends java.lang.Enum {
    public static final enum androidx.datastore.preferences.protobuf.l1 c;
    public static final enum androidx.datastore.preferences.protobuf.m1 d;
    public static final enum androidx.datastore.preferences.protobuf.n1 e;
    public static final synthetic androidx.datastore.preferences.protobuf.p1[] f;
    public final androidx.datastore.preferences.protobuf.q1 a;
    public final int b;

    static p1()
    {
        androidx.datastore.preferences.protobuf.p1 v0_2 = new androidx.datastore.preferences.protobuf.p1("DOUBLE", 0, androidx.datastore.preferences.protobuf.q1.d, 1);
        int v1_1 = new androidx.datastore.preferences.protobuf.p1("FLOAT", 1, androidx.datastore.preferences.protobuf.q1.c, 5);
        androidx.datastore.preferences.protobuf.p1[] v5_2 = androidx.datastore.preferences.protobuf.q1.b;
        androidx.datastore.preferences.protobuf.p1 v2_3 = new androidx.datastore.preferences.protobuf.p1("INT64", 2, v5_2, 0);
        androidx.datastore.preferences.protobuf.p1 v7_2 = new androidx.datastore.preferences.protobuf.p1("UINT64", 3, v5_2, 0);
        String v11_1 = androidx.datastore.preferences.protobuf.q1.a;
        androidx.datastore.preferences.protobuf.p1 v9_2 = new androidx.datastore.preferences.protobuf.p1("INT32", 4, v11_1, 0);
        androidx.datastore.preferences.protobuf.p1 v12_2 = new androidx.datastore.preferences.protobuf.p1("FIXED64", 5, v5_2, 1);
        androidx.datastore.preferences.protobuf.p1 v14_2 = new androidx.datastore.preferences.protobuf.p1("FIXED32", 6, v11_1, 5);
        androidx.datastore.preferences.protobuf.p1 v15_2 = new androidx.datastore.preferences.protobuf.p1("BOOL", 7, androidx.datastore.preferences.protobuf.q1.e, 0);
        androidx.datastore.preferences.protobuf.l1 v4_3 = new androidx.datastore.preferences.protobuf.l1("STRING", 8, androidx.datastore.preferences.protobuf.q1.f, 2);
        androidx.datastore.preferences.protobuf.p1.c = v4_3;
        int v13_5 = androidx.datastore.preferences.protobuf.q1.o;
        androidx.datastore.preferences.protobuf.m1 v6_3 = new androidx.datastore.preferences.protobuf.m1("GROUP", 9, v13_5, 3);
        androidx.datastore.preferences.protobuf.p1.d = v6_3;
        androidx.datastore.preferences.protobuf.p1 v26 = v0_2;
        androidx.datastore.preferences.protobuf.n1 v3_4 = new androidx.datastore.preferences.protobuf.n1("MESSAGE", 10, v13_5, 2);
        androidx.datastore.preferences.protobuf.p1.e = v3_4;
        androidx.datastore.preferences.protobuf.p1 v28 = v1_1;
        androidx.datastore.preferences.protobuf.o1 v8_4 = new androidx.datastore.preferences.protobuf.o1("BYTES", 11, androidx.datastore.preferences.protobuf.q1.m, 2);
        androidx.datastore.preferences.protobuf.p1 v31 = new androidx.datastore.preferences.protobuf.p1("UINT32", 12, v11_1, 0);
        androidx.datastore.preferences.protobuf.p1 v32 = v2_3;
        androidx.datastore.preferences.protobuf.p1 v10_5 = new androidx.datastore.preferences.protobuf.p1("ENUM", 13, androidx.datastore.preferences.protobuf.q1.n, 0);
        androidx.datastore.preferences.protobuf.p1 v35 = new androidx.datastore.preferences.protobuf.p1("SFIXED32", 14, v11_1, 5);
        androidx.datastore.preferences.protobuf.p1 v37 = new androidx.datastore.preferences.protobuf.p1("SFIXED64", 15, v5_2, 1);
        androidx.datastore.preferences.protobuf.p1 v0_1 = new androidx.datastore.preferences.protobuf.p1("SINT32", 16, v11_1, 0);
        androidx.datastore.preferences.protobuf.p1 v2_1 = new androidx.datastore.preferences.protobuf.p1("SINT64", 17, v5_2, 0);
        androidx.datastore.preferences.protobuf.p1[] v5_1 = new androidx.datastore.preferences.protobuf.p1[18];
        v5_1[0] = v26;
        v5_1[1] = v28;
        v5_1[2] = v32;
        v5_1[3] = v7_2;
        v5_1[4] = v9_2;
        v5_1[5] = v12_2;
        v5_1[6] = v14_2;
        v5_1[7] = v15_2;
        v5_1[8] = v4_3;
        v5_1[9] = v6_3;
        v5_1[10] = v3_4;
        v5_1[11] = v8_4;
        v5_1[12] = v31;
        v5_1[13] = v10_5;
        v5_1[14] = v35;
        v5_1[15] = v37;
        v5_1[16] = v0_1;
        v5_1[17] = v2_1;
        androidx.datastore.preferences.protobuf.p1.f = v5_1;
        return;
    }

    public p1(String p1, int p2, androidx.datastore.preferences.protobuf.q1 p3, int p4)
    {
        super(p1, p2);
        super.a = p3;
        super.b = p4;
        return;
    }

    public static androidx.datastore.preferences.protobuf.p1 valueOf(String p1)
    {
        return ((androidx.datastore.preferences.protobuf.p1) Enum.valueOf(androidx.datastore.preferences.protobuf.p1, p1));
    }

    public static androidx.datastore.preferences.protobuf.p1[] values()
    {
        return ((androidx.datastore.preferences.protobuf.p1[]) androidx.datastore.preferences.protobuf.p1.f.clone());
    }
}
