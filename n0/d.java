package n0;
public final class d {
    public final String a;
    public final String b;
    public final String c;
    public final java.util.List d;
    public final String e;

    public d(String p1, String p2, String p3, java.util.List p4)
    {
        p1.getClass();
        this.a = p1;
        p2.getClass();
        this.b = p2;
        this.c = p3;
        p4.getClass();
        this.d = p4;
        StringBuilder v4_2 = new StringBuilder();
        v4_2.append(p1);
        v4_2.append("-");
        v4_2.append(p2);
        v4_2.append("-");
        v4_2.append(p3);
        this.e = v4_2.toString();
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        String v1_4 = new StringBuilder("FontRequest {mProviderAuthority: ");
        v1_4.append(this.a);
        v1_4.append(", mProviderPackage: ");
        v1_4.append(this.b);
        v1_4.append(", mQuery: ");
        v1_4.append(this.c);
        v1_4.append(", mCertificates:");
        v0_1.append(v1_4.toString());
        int v2_3 = 0;
        while(true) {
            String v3_0 = this.d;
            if (v2_3 >= v3_0.size()) {
                break;
            }
            v0_1.append(" [");
            String v3_2 = ((java.util.List) v3_0.get(v2_3));
            int v4_2 = 0;
            while (v4_2 < v3_2.size()) {
                v0_1.append(" \"");
                v0_1.append(android.util.Base64.encodeToString(((byte[]) v3_2.get(v4_2)), 0));
                v0_1.append("\"");
                v4_2++;
            }
            v0_1.append(" ]");
            v2_3++;
        }
        v0_1.append("}mCertificatesArray: 0");
        return v0_1.toString();
    }
}
