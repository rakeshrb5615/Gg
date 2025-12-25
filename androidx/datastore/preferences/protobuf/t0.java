package androidx.datastore.preferences.protobuf;
public final class t0 {
    public final androidx.datastore.preferences.protobuf.a a;
    public final String b;
    public final Object[] c;
    public final int d;

    public t0(androidx.datastore.preferences.protobuf.v p4, String p5, Object[] p6)
    {
        this.a = p4;
        this.b = p5;
        this.c = p6;
        int v4_4 = p5.charAt(0);
        if (v4_4 >= 55296) {
            int v4_2 = (v4_4 & 8191);
            int v0 = 13;
            int v1_0 = 1;
            while(true) {
                int v2 = (v1_0 + 1);
                int v1_1 = p5.charAt(v1_0);
                if (v1_1 < 55296) {
                    break;
                }
                v4_2 |= ((v1_1 & 8191) << v0);
                v0 += 13;
                v1_0 = v2;
            }
            this.d = (v4_2 | (v1_1 << v0));
            return;
        } else {
            this.d = v4_4;
            return;
        }
    }

    public final int a()
    {
        int v0_0 = this.d;
        if ((v0_0 & 1) == 0) {
            if ((v0_0 & 4) != 4) {
                return 2;
            } else {
                return 3;
            }
        } else {
            return 1;
        }
    }
}
