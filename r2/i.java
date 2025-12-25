package r2;
public final class i {
    public final String a;
    public final Integer b;
    public final r2.m c;
    public final long d;
    public final long e;
    public final java.util.Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public i(String p1, Integer p2, r2.m p3, long p4, long p6, java.util.HashMap p8, Integer p9, String p10, byte[] p11, byte[] p12)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p6;
        this.f = p8;
        this.g = p9;
        this.h = p10;
        this.i = p11;
        this.j = p12;
        return;
    }

    public final String a(String p2)
    {
        String v2_2 = ((String) this.f.get(p2));
        if (v2_2 == null) {
            v2_2 = "";
        }
        return v2_2;
    }

    public final int b(String p2)
    {
        int v2_3 = ((String) this.f.get(p2));
        if (v2_3 != 0) {
            return Integer.valueOf(v2_3).intValue();
        } else {
            return 0;
        }
    }

    public final r2.h c()
    {
        NullPointerException v0_1 = new r2.h();
        String v1_5 = this.a;
        if (v1_5 == null) {
            throw new NullPointerException("Null transportName");
        } else {
            v0_1.a = v1_5;
            v0_1.b = this.b;
            v0_1.g = this.g;
            v0_1.h = this.h;
            v0_1.i = this.i;
            v0_1.j = this.j;
            String v1_4 = this.c;
            if (v1_4 == null) {
                throw new NullPointerException("Null encodedPayload");
            } else {
                v0_1.c = v1_4;
                v0_1.d = Long.valueOf(this.d);
                v0_1.e = Long.valueOf(this.e);
                v0_1.f = new java.util.HashMap(this.f);
                return v0_1;
            }
        }
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof r2.i)) {
                byte[] v1_5 = ((r2.i) p9).h;
                byte[] v3_3 = ((r2.i) p9).g;
                Integer v4_10 = ((r2.i) p9).b;
                if (this.a.equals(((r2.i) p9).a)) {
                    java.util.Map v5_1 = this.b;
                    if (v5_1 != null) {
                        if (!v5_1.equals(v4_10)) {
                            return 0;
                        }
                    } else {
                        if (v4_10 != null) {
                            return 0;
                        }
                    }
                    if ((this.c.equals(((r2.i) p9).c)) && ((this.d == ((r2.i) p9).d) && ((this.e == ((r2.i) p9).e) && (this.f.equals(((r2.i) p9).f))))) {
                        Integer v4_9 = this.g;
                        if (v4_9 != null) {
                            if (!v4_9.equals(v3_3)) {
                                return 0;
                            }
                        } else {
                            if (v3_3 != null) {
                                return 0;
                            }
                        }
                        byte[] v3_1 = this.h;
                        if (v3_1 != null) {
                            if (!v3_1.equals(v1_5)) {
                                return 0;
                            }
                        } else {
                            if (v1_5 != null) {
                                return 0;
                            }
                        }
                        if ((java.util.Arrays.equals(this.i, ((r2.i) p9).i)) && (java.util.Arrays.equals(this.j, ((r2.i) p9).j))) {
                            return 1;
                        }
                    }
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        String v3_0;
        int v0_17 = ((this.a.hashCode() ^ 1000003) * 1000003);
        int v2_0 = 0;
        String v3_14 = this.b;
        if (v3_14 != null) {
            v3_0 = v3_14.hashCode();
        } else {
            v3_0 = 0;
        }
        String v3_12;
        String v3_3 = this.d;
        String v3_6 = this.e;
        int v0_11 = ((((((((((v0_17 ^ v3_0) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (v3_3 ^ (v3_3 >> 32)))) * int v1_0) ^ ((int) (v3_6 ^ (v3_6 >> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003);
        String v3_11 = this.g;
        if (v3_11 != null) {
            v3_12 = v3_11.hashCode();
        } else {
            v3_12 = 0;
        }
        int v0_14 = ((v0_11 ^ v3_12) * 1000003);
        String v3_13 = this.h;
        if (v3_13 != null) {
            v2_0 = v3_13.hashCode();
        }
        return (((((v0_14 ^ v2_0) * 1000003) ^ java.util.Arrays.hashCode(this.i)) * 1000003) ^ java.util.Arrays.hashCode(this.j));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("EventInternal{transportName=");
        v0_1.append(this.a);
        v0_1.append(", code=");
        v0_1.append(this.b);
        v0_1.append(", encodedPayload=");
        v0_1.append(this.c);
        v0_1.append(", eventMillis=");
        v0_1.append(this.d);
        v0_1.append(", uptimeMillis=");
        v0_1.append(this.e);
        v0_1.append(", autoMetadata=");
        v0_1.append(this.f);
        v0_1.append(", productId=");
        v0_1.append(this.g);
        v0_1.append(", pseudonymousId=");
        v0_1.append(this.h);
        v0_1.append(", experimentIdsClear=");
        v0_1.append(java.util.Arrays.toString(this.i));
        v0_1.append(", experimentIdsEncrypted=");
        v0_1.append(java.util.Arrays.toString(this.j));
        v0_1.append("}");
        return v0_1.toString();
    }
}
