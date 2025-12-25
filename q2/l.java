package q2;
public final class l extends q2.a {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public l(Integer p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10;
        this.k = p11;
        this.l = p12;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof q2.a)) {
                String v1_38 = this.a;
                if (v1_38 != null) {
                    if (!v1_38.equals(((q2.l) ((q2.a) p5)).a)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).a != null) {
                        return 0;
                    }
                }
                String v1_21 = this.b;
                if (v1_21 != null) {
                    if (!v1_21.equals(((q2.l) ((q2.a) p5)).b)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).b != null) {
                        return 0;
                    }
                }
                String v1_27 = this.c;
                if (v1_27 != null) {
                    if (!v1_27.equals(((q2.l) ((q2.a) p5)).c)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).c != null) {
                        return 0;
                    }
                }
                String v1_32 = this.d;
                if (v1_32 != null) {
                    if (!v1_32.equals(((q2.l) ((q2.a) p5)).d)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).d != null) {
                        return 0;
                    }
                }
                String v1_37 = this.e;
                if (v1_37 != null) {
                    if (!v1_37.equals(((q2.l) ((q2.a) p5)).e)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).e != null) {
                        return 0;
                    }
                }
                String v1_43 = this.f;
                if (v1_43 != null) {
                    if (!v1_43.equals(((q2.l) ((q2.a) p5)).f)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).f != null) {
                        return 0;
                    }
                }
                String v1_48 = this.g;
                if (v1_48 != null) {
                    if (!v1_48.equals(((q2.l) ((q2.a) p5)).g)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).g != null) {
                        return 0;
                    }
                }
                String v1_53 = this.h;
                if (v1_53 != null) {
                    if (!v1_53.equals(((q2.l) ((q2.a) p5)).h)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).h != null) {
                        return 0;
                    }
                }
                String v1_1 = this.i;
                if (v1_1 != null) {
                    if (!v1_1.equals(((q2.l) ((q2.a) p5)).i)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).i != null) {
                        return 0;
                    }
                }
                String v1_6 = this.j;
                if (v1_6 != null) {
                    if (!v1_6.equals(((q2.l) ((q2.a) p5)).j)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).j != null) {
                        return 0;
                    }
                }
                String v1_12 = this.k;
                if (v1_12 != null) {
                    if (!v1_12.equals(((q2.l) ((q2.a) p5)).k)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).k != null) {
                        return 0;
                    }
                }
                String v1_17 = this.l;
                if (v1_17 != null) {
                    if (!v1_17.equals(((q2.l) ((q2.a) p5)).l)) {
                        return 0;
                    }
                } else {
                    if (((q2.l) ((q2.a) p5)).l != null) {
                        return 0;
                    }
                }
                return 1;
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_9;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_9 = v1_0.hashCode();
        } else {
            v1_9 = 0;
        }
        int v3_0;
        int v1_23 = ((v1_9 ^ 1000003) * 1000003);
        int v3_19 = this.b;
        if (v3_19 != 0) {
            v3_0 = v3_19.hashCode();
        } else {
            v3_0 = 0;
        }
        int v3_2;
        int v1_2 = ((v1_23 ^ v3_0) * 1000003);
        int v3_1 = this.c;
        if (v3_1 != 0) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        int v3_4;
        int v1_4 = ((v1_2 ^ v3_2) * 1000003);
        int v3_3 = this.d;
        if (v3_3 != 0) {
            v3_4 = v3_3.hashCode();
        } else {
            v3_4 = 0;
        }
        int v3_6;
        int v1_6 = ((v1_4 ^ v3_4) * 1000003);
        int v3_5 = this.e;
        if (v3_5 != 0) {
            v3_6 = v3_5.hashCode();
        } else {
            v3_6 = 0;
        }
        int v3_8;
        int v1_8 = ((v1_6 ^ v3_6) * 1000003);
        int v3_7 = this.f;
        if (v3_7 != 0) {
            v3_8 = v3_7.hashCode();
        } else {
            v3_8 = 0;
        }
        int v3_10;
        int v1_11 = ((v1_8 ^ v3_8) * 1000003);
        int v3_9 = this.g;
        if (v3_9 != 0) {
            v3_10 = v3_9.hashCode();
        } else {
            v3_10 = 0;
        }
        int v3_12;
        int v1_13 = ((v1_11 ^ v3_10) * 1000003);
        int v3_11 = this.h;
        if (v3_11 != 0) {
            v3_12 = v3_11.hashCode();
        } else {
            v3_12 = 0;
        }
        int v3_14;
        int v1_15 = ((v1_13 ^ v3_12) * 1000003);
        int v3_13 = this.i;
        if (v3_13 != 0) {
            v3_14 = v3_13.hashCode();
        } else {
            v3_14 = 0;
        }
        int v3_16;
        int v1_17 = ((v1_15 ^ v3_14) * 1000003);
        int v3_15 = this.j;
        if (v3_15 != 0) {
            v3_16 = v3_15.hashCode();
        } else {
            v3_16 = 0;
        }
        int v3_18;
        int v1_20 = ((v1_17 ^ v3_16) * 1000003);
        int v3_17 = this.k;
        if (v3_17 != 0) {
            v3_18 = v3_17.hashCode();
        } else {
            v3_18 = 0;
        }
        int v1_22 = ((v1_20 ^ v3_18) * 1000003);
        String v2_1 = this.l;
        if (v2_1 != null) {
            v0_0 = v2_1.hashCode();
        }
        return (v0_0 ^ v1_22);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        v0_1.append(this.a);
        v0_1.append(", model=");
        v0_1.append(this.b);
        v0_1.append(", hardware=");
        v0_1.append(this.c);
        v0_1.append(", device=");
        v0_1.append(this.d);
        v0_1.append(", product=");
        v0_1.append(this.e);
        v0_1.append(", osBuild=");
        v0_1.append(this.f);
        v0_1.append(", manufacturer=");
        v0_1.append(this.g);
        v0_1.append(", fingerprint=");
        v0_1.append(this.h);
        v0_1.append(", locale=");
        v0_1.append(this.i);
        v0_1.append(", country=");
        v0_1.append(this.j);
        v0_1.append(", mccMnc=");
        v0_1.append(this.k);
        v0_1.append(", applicationBuild=");
        return v1.a.n(v0_1, this.l, "}");
    }
}
