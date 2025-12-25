package k5;
public final class a {
    public static final j6.o a;

    static a()
    {
        v5.d v0_1 = new v5.d();
        j6.o v1_11 = j5.d.a;
        v0_1.a(j5.n2, v1_11);
        v0_1.a(j5.b0, v1_11);
        j6.o v1_22 = j5.j.a;
        v0_1.a(j5.m2, v1_22);
        v0_1.a(j5.j0, v1_22);
        j6.o v1_4 = j5.g.a;
        v0_1.a(j5.u1, v1_4);
        v0_1.a(j5.k0, v1_4);
        j6.o v1_10 = j5.h.a;
        v0_1.a(j5.t1, v1_10);
        v0_1.a(j5.l0, v1_10);
        j6.o v1_12 = j5.z.a;
        v0_1.a(j5.l2, v1_12);
        v0_1.a(j5.j1, v1_12);
        j6.o v1_13 = j5.y.a;
        v0_1.a(j5.k2, v1_13);
        v0_1.a(j5.i1, v1_13);
        j6.o v1_14 = j5.i.a;
        v0_1.a(j5.v1, v1_14);
        v0_1.a(j5.n0, v1_14);
        j6.o v1_15 = j5.t.a;
        v0_1.a(j5.j2, v1_15);
        v0_1.a(j5.p0, v1_15);
        j6.o v1_16 = j5.k.a;
        v0_1.a(j5.d2, v1_16);
        v0_1.a(j5.q0, v1_16);
        j6.o v1_17 = j5.m.a;
        v0_1.a(j5.b2, v1_17);
        v0_1.a(j5.r0, v1_17);
        j6.o v1_18 = j5.p.a;
        v0_1.a(j5.a2, v1_18);
        v0_1.a(j5.v0, v1_18);
        j6.o v1_19 = j5.q.a;
        v0_1.a(j5.z1, v1_19);
        v0_1.a(j5.x0, v1_19);
        j6.o v1_20 = j5.n.a;
        v0_1.a(j5.x1, v1_20);
        v0_1.a(j5.t0, v1_20);
        j6.o v1_21 = j5.b.a;
        v0_1.a(j5.p1, v1_21);
        v0_1.a(j5.d0, v1_21);
        j6.o v1_23 = j5.a.a;
        v0_1.a(j5.o1, v1_23);
        v0_1.a(j5.e0, v1_23);
        j6.o v1_24 = j5.o.a;
        v0_1.a(j5.y1, v1_24);
        v0_1.a(j5.u0, v1_24);
        j6.o v1_25 = j5.l.a;
        v0_1.a(j5.w1, v1_25);
        v0_1.a(j5.s0, v1_25);
        j6.o v1_26 = j5.c.a;
        v0_1.a(j5.q1, v1_26);
        v0_1.a(j5.f0, v1_26);
        j6.o v1_27 = j5.r.a;
        v0_1.a(j5.c2, v1_27);
        v0_1.a(j5.z0, v1_27);
        j6.o v1_28 = j5.s.a;
        v0_1.a(j5.e2, v1_28);
        v0_1.a(j5.b1, v1_28);
        j6.o v1_0 = j5.u.a;
        v0_1.a(j5.f2, v1_0);
        v0_1.a(j5.c1, v1_0);
        j6.o v1_1 = j5.x.a;
        v0_1.a(j5.i2, v1_1);
        v0_1.a(j5.g1, v1_1);
        j6.o v1_2 = j5.v.a;
        v0_1.a(j5.h2, v1_2);
        v0_1.a(j5.e1, v1_2);
        j6.o v1_3 = j5.w.a;
        v0_1.a(j5.g2, v1_3);
        v0_1.a(j5.f1, v1_3);
        j6.o v1_5 = j5.e.a;
        v0_1.a(j5.s1, v1_5);
        v0_1.a(j5.g0, v1_5);
        j6.o v1_6 = j5.f.a;
        v0_1.a(j5.r1, v1_6);
        v0_1.a(j5.h0, v1_6);
        v0_1.d = 1;
        k5.a.a = new j6.o(v0_1, 19);
        return;
    }

    public static j5.x0 a(android.util.JsonReader p7)
    {
        String v0_1 = new j5.w0();
        p7.beginObject();
        while (p7.hasNext()) {
            byte v1_0 = p7.nextName();
            v1_0.getClass();
            int v6 = -1;
            switch (v1_0.hashCode()) {
                case -1019779949:
                    if (v1_0.equals("offset")) {
                        v6 = 0;
                    } else {
                    }
                    break;
                case -887523944:
                    if (v1_0.equals("symbol")) {
                        v6 = 1;
                    } else {
                    }
                    break;
                case 3571:
                    if (v1_0.equals("pc")) {
                        v6 = 2;
                    } else {
                    }
                    break;
                case 3143036:
                    if (v1_0.equals("file")) {
                        v6 = 3;
                    } else {
                    }
                    break;
                case 2125650548:
                    if (v1_0.equals("importance")) {
                        v6 = 4;
                    } else {
                    }
                    break;
                default:
            }
            switch (v6) {
                case 0:
                    v0_1.d = p7.nextLong();
                    v0_1.f = ((byte) (v0_1.f | 2));
                    break;
                case 1:
                    byte v1_16 = p7.nextString();
                    if (v1_16 == 0) {
                        throw new NullPointerException("Null symbol");
                    } else {
                        v0_1.b = v1_16;
                    }
                    break;
                case 2:
                    v0_1.a = p7.nextLong();
                    v0_1.f = ((byte) (v0_1.f | 1));
                    break;
                case 3:
                    v0_1.c = p7.nextString();
                    break;
                case 4:
                    v0_1.e = p7.nextInt();
                    v0_1.f = ((byte) (v0_1.f | 4));
                    break;
                default:
                    p7.skipValue();
            }
        }
        p7.endObject();
        return v0_1.a();
    }

    public static j5.f0 b(android.util.JsonReader p4)
    {
        p4.beginObject();
        IllegalStateException v0_0 = 0;
        String v1_0 = 0;
        while (p4.hasNext()) {
            boolean v2_0 = p4.nextName();
            v2_0.getClass();
            if (v2_0.equals("key")) {
                v0_0 = p4.nextString();
                if (v0_0 == null) {
                    throw new NullPointerException("Null key");
                }
            } else {
                if (v2_0.equals("value")) {
                    v1_0 = p4.nextString();
                    if (v1_0 == null) {
                        throw new NullPointerException("Null value");
                    }
                } else {
                    p4.skipValue();
                }
            }
        }
        p4.endObject();
        if ((v0_0 != null) && (v1_0 != null)) {
            return new j5.f0(v0_0, v1_0);
        } else {
            String v4_3 = new StringBuilder();
            if (v0_0 == null) {
                v4_3.append(" key");
            }
            if (v1_0 == null) {
                v4_3.append(" value");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v4_3));
        }
    }

    public static j5.d0 c(android.util.JsonReader p8)
    {
        String v0_1 = new j5.c0();
        p8.beginObject();
        while (p8.hasNext()) {
            byte v1_6 = p8.nextName();
            v1_6.getClass();
            int v7 = -1;
            switch (v1_6.hashCode()) {
                case -1516200806:
                    if (v1_6.equals("buildIdMappingForArch")) {
                        v7 = 0;
                    } else {
                    }
                    break;
                case 110987:
                    if (v1_6.equals("pid")) {
                        v7 = 1;
                    } else {
                    }
                    break;
                case 111312:
                    if (v1_6.equals("pss")) {
                        v7 = 2;
                    } else {
                    }
                    break;
                case 113234:
                    if (v1_6.equals("rss")) {
                        v7 = 3;
                    } else {
                    }
                    break;
                case 55126294:
                    if (v1_6.equals("timestamp")) {
                        v7 = 4;
                    } else {
                    }
                    break;
                case 202325402:
                    if (v1_6.equals("processName")) {
                        v7 = 5;
                    } else {
                    }
                    break;
                case 722137681:
                    if (v1_6.equals("reasonCode")) {
                        v7 = 6;
                    } else {
                    }
                    break;
                case 723857505:
                    if (v1_6.equals("traceFile")) {
                        v7 = 7;
                    } else {
                    }
                    break;
                case 2125650548:
                    if (v1_6.equals("importance")) {
                        v7 = 8;
                    } else {
                    }
                    break;
                default:
            }
            switch (v7) {
                case 0:
                    v0_1.i = k5.a.d(p8, new a5.t(24));
                    break;
                case 1:
                    v0_1.a = p8.nextInt();
                    v0_1.j = ((byte) (v0_1.j | 1));
                    break;
                case 2:
                    v0_1.e = p8.nextLong();
                    v0_1.j = ((byte) (v0_1.j | 8));
                    break;
                case 3:
                    v0_1.f = p8.nextLong();
                    v0_1.j = ((byte) (v0_1.j | 16));
                    break;
                case 4:
                    v0_1.g = p8.nextLong();
                    v0_1.j = ((byte) (v0_1.j | 32));
                    break;
                case 5:
                    byte v1_35 = p8.nextString();
                    if (v1_35 == 0) {
                        throw new NullPointerException("Null processName");
                    } else {
                        v0_1.b = v1_35;
                    }
                    break;
                case 6:
                    v0_1.c = p8.nextInt();
                    v0_1.j = ((byte) (v0_1.j | 2));
                    break;
                case 7:
                    v0_1.h = p8.nextString();
                    break;
                case 8:
                    v0_1.d = p8.nextInt();
                    v0_1.j = ((byte) (v0_1.j | 4));
                    break;
                default:
                    p8.skipValue();
            }
        }
        p8.endObject();
        return v0_1.a();
    }

    public static java.util.List d(android.util.JsonReader p22, a5.t p23)
    {
        String v0_1 = new java.util.ArrayList();
        p22.beginArray();
        while (p22.hasNext()) {
            byte v2_8;
            String v3_1;
            int v9_1 = 0;
            switch (p23.a) {
                case 24:
                    p22.beginObject();
                    byte v2_11 = 0;
                    String v3_22 = 0;
                    while (p22.hasNext()) {
                        String v4_15;
                        String v4_13 = p22.nextName();
                        v4_13.getClass();
                        switch (v4_13.hashCode()) {
                            case -609862170:
                                if (v4_13.equals("libraryName")) {
                                    v4_15 = 0;
                                } else {
                                    v4_15 = -1;
                                }
                                break;
                            case 3002454:
                                if (v4_13.equals("arch")) {
                                    v4_15 = 1;
                                }
                                break;
                            case 230943785:
                                if (v4_13.equals("buildId")) {
                                    v4_15 = 2;
                                }
                                break;
                            default:
                        }
                        switch (v4_15) {
                            case 0:
                                v2_11 = p22.nextString();
                                if (v2_11 == 0) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                            case 1:
                                String v4_18 = p22.nextString();
                                if (v4_18 == null) {
                                    throw new NullPointerException("Null arch");
                                } else {
                                    v9_1 = v4_18;
                                }
                                break;
                            case 2:
                                v3_22 = p22.nextString();
                                if (v3_22 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                            default:
                                p22.skipValue();
                        }
                    }
                    p22.endObject();
                    if ((v9_1 != 0) && ((v2_11 != 0) && (v3_22 != null))) {
                        v2_8 = new j5.e0(v9_1, v2_11, v3_22);
                    } else {
                        String v0_30 = new StringBuilder();
                        if (v9_1 == 0) {
                            v0_30.append(" arch");
                        }
                        if (v2_11 == 0) {
                            v0_30.append(" libraryName");
                        }
                        if (v3_22 == null) {
                            v0_30.append(" buildId");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_30));
                    }
                    break;
                case 25:
                    p22.beginObject();
                    byte v2_9 = 0;
                    while (p22.hasNext()) {
                        String v3_19 = p22.nextName();
                        v3_19.getClass();
                        if (v3_19.equals("filename")) {
                            String v3_20 = p22.nextString();
                            if (v3_20 == null) {
                                throw new NullPointerException("Null filename");
                            } else {
                                v9_1 = v3_20;
                            }
                        } else {
                            if (v3_19.equals("contents")) {
                                v2_9 = android.util.Base64.decode(p22.nextString(), 2);
                                if (v2_9 == 0) {
                                    throw new NullPointerException("Null contents");
                                }
                            } else {
                                p22.skipValue();
                            }
                        }
                    }
                    p22.endObject();
                    if ((v9_1 != 0) && (v2_9 != 0)) {
                        v3_1 = new j5.h0(v9_1, v2_9);
                        v2_8 = v3_1;
                    } else {
                        String v0_23 = new StringBuilder();
                        if (v9_1 == 0) {
                            v0_23.append(" filename");
                        }
                        if (v2_9 == 0) {
                            v0_23.append(" contents");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_23));
                    }
                    break;
                case 26:
                    byte v2_7 = new j5.d1();
                    p22.beginObject();
                    while (p22.hasNext()) {
                        String v3_6;
                        String v3_4 = p22.nextName();
                        v3_4.getClass();
                        switch (v3_4.hashCode()) {
                            case -1536268810:
                                if (v3_4.equals("parameterKey")) {
                                    v3_6 = 0;
                                } else {
                                    v3_6 = -1;
                                }
                                break;
                            case -1027290370:
                                if (v3_4.equals("templateVersion")) {
                                    v3_6 = 1;
                                }
                                break;
                            case 1098747284:
                                if (v3_4.equals("rolloutVariant")) {
                                    v3_6 = 2;
                                }
                                break;
                            case 1124454216:
                                if (v3_4.equals("parameterValue")) {
                                    v3_6 = 3;
                                }
                                break;
                            default:
                        }
                        switch (v3_6) {
                            case 0:
                                String v3_16 = p22.nextString();
                                if (v3_16 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                } else {
                                    v2_7.b = v3_16;
                                }
                                break;
                            case 1:
                                v2_7.d = p22.nextLong();
                                v2_7.e = ((byte) (v2_7.e | 1));
                                break;
                            case 2:
                                p22.beginObject();
                                String v3_11 = 0;
                                String v4_6 = 0;
                                while (p22.hasNext()) {
                                    j5.f1 v5_4 = p22.nextName();
                                    v5_4.getClass();
                                    if (v5_4.equals("variantId")) {
                                        v4_6 = p22.nextString();
                                        if (v4_6 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else {
                                        if (v5_4.equals("rolloutId")) {
                                            v3_11 = p22.nextString();
                                            if (v3_11 == null) {
                                                throw new NullPointerException("Null rolloutId");
                                            }
                                        } else {
                                            p22.skipValue();
                                        }
                                    }
                                }
                                p22.endObject();
                                if ((v3_11 != null) && (v4_6 != null)) {
                                    v2_7.a = new j5.f1(v3_11, v4_6);
                                } else {
                                    String v0_14 = new StringBuilder();
                                    if (v3_11 == null) {
                                        v0_14.append(" rolloutId");
                                    }
                                    if (v4_6 == null) {
                                        v0_14.append(" variantId");
                                    }
                                    throw new IllegalStateException(g2.g.g("Missing required properties:", v0_14));
                                }
                                break;
                            case 3:
                                String v3_10 = p22.nextString();
                                if (v3_10 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                } else {
                                    v2_7.c = v3_10;
                                }
                                break;
                            default:
                                p22.skipValue();
                        }
                    }
                    p22.endObject();
                    v2_8 = v2_7.a();
                    break;
                case 27:
                    p22.beginObject();
                    byte v2_2 = 0;
                    byte v6_0 = 0;
                    String v13_0 = 0;
                    while (p22.hasNext()) {
                        android.util.JsonReader v14_4;
                        android.util.JsonReader v14_2 = p22.nextName();
                        v14_2.getClass();
                        switch (v14_2.hashCode()) {
                            case -1266514778:
                                if (v14_2.equals("frames")) {
                                    v14_4 = 0;
                                } else {
                                    v14_4 = -1;
                                }
                                break;
                            case 3373707:
                                if (v14_2.equals("name")) {
                                    v14_4 = 1;
                                }
                                break;
                            case 2125650548:
                                if (v14_2.equals("importance")) {
                                    v14_4 = 2;
                                }
                                break;
                            default:
                        }
                        switch (v14_4) {
                            case 0:
                                v2_2 = k5.a.d(p22, new a5.t(29));
                                if (v2_2 == 0) {
                                    throw new NullPointerException("Null frames");
                                }
                                break;
                            case 1:
                                v9_1 = p22.nextString();
                                if (v9_1 == 0) {
                                    throw new NullPointerException("Null name");
                                }
                                break;
                            case 2:
                                v13_0 = p22.nextInt();
                                v6_0 = ((byte) (v6_0 | 1));
                                break;
                            default:
                                p22.skipValue();
                        }
                    }
                    p22.endObject();
                    if ((v6_0 == 1) && ((v9_1 != 0) && (v2_2 != 0))) {
                        v3_1 = new j5.v0(v9_1, v13_0, v2_2);
                    } else {
                        String v0_5 = new StringBuilder();
                        if (v9_1 == 0) {
                            v0_5.append(" name");
                        }
                        if ((v6_0 & 1) == 0) {
                            v0_5.append(" importance");
                        }
                        if (v2_2 == 0) {
                            v0_5.append(" frames");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_5));
                    }
                    break;
                case 28:
                    p22.beginObject();
                    int v20 = 0;
                    String v21 = 0;
                    byte v2_1 = 0;
                    long v16 = 0;
                    long v18 = 0;
                    while (p22.hasNext()) {
                        int v9_5;
                        int v9_3 = p22.nextName();
                        v9_3.getClass();
                        switch (v9_3.hashCode()) {
                            case 3373707:
                                if (v9_3.equals("name")) {
                                    v9_5 = 0;
                                } else {
                                    v9_5 = -1;
                                }
                                break;
                            case 3530753:
                                if (v9_3.equals("size")) {
                                    v9_5 = 1;
                                }
                                break;
                            case 3601339:
                                if (v9_3.equals("uuid")) {
                                    v9_5 = 2;
                                }
                                break;
                            case 1153765347:
                                if (v9_3.equals("baseAddress")) {
                                    v9_5 = 3;
                                }
                                break;
                            default:
                        }
                        switch (v9_5) {
                            case 0:
                                int v9_0 = p22.nextString();
                                if (v9_0 == 0) {
                                    throw new NullPointerException("Null name");
                                } else {
                                    v20 = v9_0;
                                }
                                break;
                            case 1:
                                v2_1 = ((byte) (v2_1 | 2));
                                v18 = p22.nextLong();
                                break;
                            case 2:
                                v21 = new String(android.util.Base64.decode(p22.nextString(), 2), j5.n2.a);
                                break;
                            case 3:
                                v2_1 = ((byte) (v2_1 | 1));
                                v16 = p22.nextLong();
                                break;
                            default:
                                p22.skipValue();
                        }
                    }
                    p22.endObject();
                    if ((v2_1 == 3) && (v20 != 0)) {
                        v2_8 = new j5.s0(v16, v18, v20, v21);
                    } else {
                        String v0_37 = new StringBuilder();
                        if ((v2_1 & 1) == 0) {
                            v0_37.append(" baseAddress");
                        }
                        if ((v2_1 & 2) == 0) {
                            v0_37.append(" size");
                        }
                        if (v20 == 0) {
                            v0_37.append(" name");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_37));
                    }
                    break;
                default:
                    v2_8 = k5.a.a(p22);
            }
            v0_1.add(v2_8);
        }
        p22.endArray();
        return java.util.Collections.unmodifiableList(v0_1);
    }

    public static j5.p0 e(android.util.JsonReader p28)
    {
        IllegalStateException v1_5 = new j5.o0();
        p28.beginObject();
        while (p28.hasNext()) {
            byte v2_3;
            byte v2_0 = p28.nextName();
            v2_0.getClass();
            switch (v2_0.hashCode()) {
                case -1335157162:
                    if (v2_0.equals("device")) {
                        v2_3 = 0;
                    } else {
                        v2_3 = -1;
                    }
                    break;
                case -259312414:
                    if (v2_0.equals("rollouts")) {
                        v2_3 = 1;
                    }
                    break;
                case 96801:
                    if (v2_0.equals("app")) {
                        v2_3 = 2;
                    }
                    break;
                case 107332:
                    if (v2_0.equals("log")) {
                        v2_3 = 3;
                    }
                    break;
                case 3575610:
                    if (v2_0.equals("type")) {
                        v2_3 = 4;
                    }
                    break;
                case 55126294:
                    if (v2_0.equals("timestamp")) {
                        v2_3 = 5;
                    }
                    break;
                default:
            }
            switch (v2_3) {
                case 0:
                    byte v2_17 = new j5.a1();
                    p28.beginObject();
                    while (p28.hasNext()) {
                        java.util.ArrayList v3_20;
                        java.util.ArrayList v3_17 = p28.nextName();
                        v3_17.getClass();
                        switch (v3_17.hashCode()) {
                            case -1708606089:
                                if (v3_17.equals("batteryLevel")) {
                                    v3_20 = 0;
                                } else {
                                    v3_20 = -1;
                                }
                                break;
                            case -1455558134:
                                if (v3_17.equals("batteryVelocity")) {
                                    v3_20 = 1;
                                }
                                break;
                            case -1439500848:
                                if (v3_17.equals("orientation")) {
                                    v3_20 = 2;
                                }
                                break;
                            case 279795450:
                                if (v3_17.equals("diskUsed")) {
                                    v3_20 = 3;
                                }
                                break;
                            case 976541947:
                                if (v3_17.equals("ramUsed")) {
                                    v3_20 = 4;
                                }
                                break;
                            case 1516795582:
                                if (v3_17.equals("proximityOn")) {
                                    v3_20 = 5;
                                }
                                break;
                            default:
                        }
                        switch (v3_20) {
                            case 0:
                                v2_17.a = Double.valueOf(p28.nextDouble());
                                break;
                            case 1:
                                v2_17.b = p28.nextInt();
                                v2_17.g = ((byte) (v2_17.g | 1));
                                break;
                            case 2:
                                v2_17.d = p28.nextInt();
                                v2_17.g = ((byte) (v2_17.g | 4));
                                break;
                            case 3:
                                v2_17.f = p28.nextLong();
                                v2_17.g = ((byte) (v2_17.g | 16));
                                break;
                            case 4:
                                v2_17.e = p28.nextLong();
                                v2_17.g = ((byte) (v2_17.g | 8));
                                break;
                            case 5:
                                v2_17.c = p28.nextBoolean();
                                v2_17.g = ((byte) (v2_17.g | 2));
                                break;
                            default:
                                p28.skipValue();
                        }
                    }
                    p28.endObject();
                    v1_5.d = v2_17.a();
                    break;
                case 1:
                    p28.beginObject();
                    java.util.ArrayList v3_14 = 0;
                    while (p28.hasNext()) {
                        byte v2_10 = p28.nextName();
                        v2_10.getClass();
                        if (v2_10.equals("assignments")) {
                            byte v2_15 = k5.a.d(p28, new a5.t(26));
                            if (v2_15 == 0) {
                                throw new NullPointerException("Null rolloutAssignments");
                            } else {
                                v3_14 = v2_15;
                            }
                        } else {
                            p28.skipValue();
                        }
                    }
                    p28.endObject();
                    if (v3_14 == null) {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    } else {
                        v1_5.f = new j5.g1(v3_14);
                    }
                    break;
                case 2:
                    p28.beginObject();
                    byte v2_1 = 0;
                    int v18 = 0;
                    j5.r0 v12 = 0;
                    java.util.List v13 = 0;
                    java.util.List v14 = 0;
                    Boolean v15 = 0;
                    j5.z0 v16 = 0;
                    java.util.List v17 = 0;
                    while (p28.hasNext()) {
                        j5.u0 v4_2;
                        long v11_3 = p28.nextName();
                        v11_3.getClass();
                        switch (v11_3.hashCode()) {
                            case -1405314732:
                                if (v11_3.equals("appProcessDetails")) {
                                    v4_2 = 0;
                                } else {
                                    v4_2 = -1;
                                }
                                break;
                            case -1332194002:
                                if (v11_3.equals("background")) {
                                    v4_2 = 1;
                                }
                                break;
                            case -1090974952:
                                if (v11_3.equals("execution")) {
                                    v4_2 = 2;
                                }
                                break;
                            case -80231855:
                                if (v11_3.equals("internalKeys")) {
                                    v4_2 = 3;
                                }
                                break;
                            case 555169704:
                                if (v11_3.equals("customAttributes")) {
                                    v4_2 = 4;
                                }
                                break;
                            case 928737948:
                                if (v11_3.equals("uiOrientation")) {
                                    v4_2 = 5;
                                }
                                break;
                            case 1847730860:
                                if (v11_3.equals("currentProcessDetails")) {
                                    v4_2 = 6;
                                }
                                break;
                            default:
                        }
                        switch (v4_2) {
                            case 0:
                                int v27 = 2;
                                java.util.ArrayList v3_12 = new java.util.ArrayList();
                                p28.beginArray();
                                while (p28.hasNext()) {
                                    v3_12.add(k5.a.g(p28));
                                }
                                p28.endArray();
                                v17 = java.util.Collections.unmodifiableList(v3_12);
                                break;
                            case 1:
                                v27 = 2;
                                v15 = Boolean.valueOf(p28.nextBoolean());
                                break;
                            case 2:
                                p28.beginObject();
                                java.util.List v21 = 0;
                                j5.t0 v22 = 0;
                                j5.d0 v23 = 0;
                                j5.u0 v24 = 0;
                                java.util.List v25 = 0;
                                while (p28.hasNext()) {
                                    j5.u0 v4_22;
                                    j5.u0 v4_20 = p28.nextName();
                                    v4_20.getClass();
                                    switch (v4_20.hashCode()) {
                                        case -1375141843:
                                            if (v4_20.equals("appExitInfo")) {
                                                v4_22 = 0;
                                            } else {
                                                v4_22 = -1;
                                            }
                                            break;
                                        case -1337936983:
                                            if (v4_20.equals("threads")) {
                                                v4_22 = 1;
                                            }
                                            break;
                                        case -902467928:
                                            if (v4_20.equals("signal")) {
                                                v4_22 = 2;
                                            }
                                            break;
                                        case 937615455:
                                            if (v4_20.equals("binaries")) {
                                                v4_22 = 3;
                                            }
                                            break;
                                        case 1481625679:
                                            if (v4_20.equals("exception")) {
                                                v4_22 = 4;
                                            }
                                            break;
                                        default:
                                    }
                                    switch (v4_22) {
                                        case 0:
                                            v27 = 2;
                                            v23 = k5.a.c(p28);
                                            break;
                                        case 1:
                                            v27 = 2;
                                            v21 = k5.a.d(p28, new a5.t(27));
                                            break;
                                        case 2:
                                            p28.beginObject();
                                            long v11_11 = 0;
                                            j5.u0 v4_29 = 0;
                                            String v5_0 = 0;
                                            String v6 = 0;
                                            while (p28.hasNext()) {
                                                long v7_2;
                                                long v7_0 = p28.nextName();
                                                v7_0.getClass();
                                                switch (v7_0.hashCode()) {
                                                    case -1147692044:
                                                        if (v7_0.equals("address")) {
                                                            v7_2 = 0;
                                                        } else {
                                                            v7_2 = -1;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (v7_0.equals("code")) {
                                                            v7_2 = 1;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (v7_0.equals("name")) {
                                                            v7_2 = 2;
                                                        }
                                                        break;
                                                    default:
                                                        v7_2 = -1;
                                                }
                                                switch (v7_2) {
                                                    case 0:
                                                        v4_29 = ((byte) (v4_29 | 1));
                                                        v11_11 = p28.nextLong();
                                                        break;
                                                    case 1:
                                                        v6 = p28.nextString();
                                                        if (v6 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        v5_0 = p28.nextString();
                                                        if (v5_0 == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        p28.skipValue();
                                                }
                                            }
                                            p28.endObject();
                                            if ((v4_29 == 1) && ((v5_0 != null) && (v6 != null))) {
                                                v24 = new j5.u0(v5_0, v6, v11_11);
                                            } else {
                                                String v0_10 = new StringBuilder();
                                                if (v5_0 == null) {
                                                    v0_10.append(" name");
                                                }
                                                if (v6 == null) {
                                                    v0_10.append(" code");
                                                }
                                                if ((v4_29 & 1) == 0) {
                                                    v0_10.append(" address");
                                                }
                                                throw new IllegalStateException(g2.g.g("Missing required properties:", v0_10));
                                            }
                                            break;
                                        case 3:
                                            v25 = k5.a.d(p28, new a5.t(28));
                                            if (v25 == null) {
                                                throw new NullPointerException("Null binaries");
                                            } else {
                                            }
                                            break;
                                        case 4:
                                            v22 = k5.a.f(p28);
                                            break;
                                        default:
                                            p28.skipValue();
                                    }
                                    v27 = 2;
                                }
                                v27 = 2;
                                p28.endObject();
                                if ((v24 != null) && (v25 != null)) {
                                    v12 = new j5.r0(v21, v22, v23, v24, v25);
                                } else {
                                    String v0_5 = new StringBuilder();
                                    if (v24 == null) {
                                        v0_5.append(" signal");
                                    }
                                    if (v25 == null) {
                                        v0_5.append(" binaries");
                                    }
                                    throw new IllegalStateException(g2.g.g("Missing required properties:", v0_5));
                                }
                                break;
                            case 3:
                                java.util.ArrayList v3_5 = new java.util.ArrayList();
                                p28.beginArray();
                                while (p28.hasNext()) {
                                    v3_5.add(k5.a.b(p28));
                                }
                                p28.endArray();
                                v14 = java.util.Collections.unmodifiableList(v3_5);
                                break;
                            case 4:
                                java.util.ArrayList v3_3 = new java.util.ArrayList();
                                p28.beginArray();
                                while (p28.hasNext()) {
                                    v3_3.add(k5.a.b(p28));
                                }
                                p28.endArray();
                                v13 = java.util.Collections.unmodifiableList(v3_3);
                                break;
                            case 5:
                                v18 = p28.nextInt();
                                v2_1 = ((byte) 1);
                                break;
                            case 6:
                                v16 = k5.a.g(p28);
                                break;
                            default:
                                p28.skipValue();
                        }
                        v27 = 2;
                    }
                    p28.endObject();
                    if ((v2_1 == 1) && (v12 != null)) {
                        v1_5.c = new j5.q0(v12, v13, v14, v15, v16, v17, v18);
                    } else {
                        String v0_2 = new StringBuilder();
                        if (v12 == null) {
                            v0_2.append(" execution");
                        }
                        if (v2_1 == 0) {
                            v0_2.append(" uiOrientation");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
                    }
                    break;
                case 3:
                    p28.beginObject();
                    java.util.ArrayList v3_48 = 0;
                    while (p28.hasNext()) {
                        if (!p28.nextName().equals("content")) {
                            p28.skipValue();
                        } else {
                            byte v2_31 = p28.nextString();
                            if (v2_31 == 0) {
                                throw new NullPointerException("Null content");
                            } else {
                                v3_48 = v2_31;
                            }
                        }
                    }
                    p28.endObject();
                    if (v3_48 == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    } else {
                        v1_5.e = new j5.c1(v3_48);
                    }
                    break;
                case 4:
                    byte v2_25 = p28.nextString();
                    if (v2_25 == 0) {
                        throw new NullPointerException("Null type");
                    } else {
                        v1_5.b = v2_25;
                    }
                    break;
                case 5:
                    v1_5.a = p28.nextLong();
                    v1_5.g = ((byte) (v1_5.g | 1));
                    break;
                default:
                    p28.skipValue();
            }
        }
        p28.endObject();
        return v1_5.a();
    }

    public static j5.t0 f(android.util.JsonReader p11)
    {
        p11.beginObject();
        int v7 = 0;
        j5.t0 v3 = 0;
        String v4 = 0;
        j5.t0 v5_0 = 0;
        j5.t0 v6 = 0;
        String v1_3 = 0;
        while(true) {
            int v8_0 = 1;
            if (!p11.hasNext()) {
                break;
            }
            j5.t0 v2_3 = p11.nextName();
            v2_3.getClass();
            switch (v2_3.hashCode()) {
                case -1266514778:
                    if (v2_3.equals("frames")) {
                        v8_0 = 0;
                    } else {
                        v8_0 = -1;
                    }
                    break;
                case -934964668:
                    if (v2_3.equals("reason")) {
                    }
                    break;
                case 3575610:
                    if (v2_3.equals("type")) {
                        v8_0 = 2;
                    }
                    break;
                case 91997906:
                    if (v2_3.equals("causedBy")) {
                        v8_0 = 3;
                    }
                    break;
                case 581754413:
                    if (v2_3.equals("overflowCount")) {
                        v8_0 = 4;
                    }
                    break;
                default:
            }
            switch (v8_0) {
                case 0:
                    j5.t0 v2_14 = k5.a.d(p11, new a5.t(29));
                    if (v2_14 == null) {
                        throw new NullPointerException("Null frames");
                    } else {
                        v5_0 = v2_14;
                    }
                    break;
                case 1:
                    v4 = p11.nextString();
                    break;
                case 2:
                    j5.t0 v2_10 = p11.nextString();
                    if (v2_10 == null) {
                        throw new NullPointerException("Null type");
                    } else {
                        v3 = v2_10;
                    }
                    break;
                case 3:
                    v6 = k5.a.f(p11);
                    break;
                case 4:
                    v7 = p11.nextInt();
                    v1_3 = ((byte) (v1_3 | 1));
                    break;
                default:
                    p11.skipValue();
            }
        }
        p11.endObject();
        if ((v1_3 == 1) && ((v3 != null) && (v5_0 != null))) {
            return new j5.t0(v3, v4, v5_0, v6, v7);
        } else {
            String v11_2 = new StringBuilder();
            if (v3 == null) {
                v11_2.append(" type");
            }
            if (v5_0 == null) {
                v11_2.append(" frames");
            }
            if ((v1_3 & 1) == 0) {
                v11_2.append(" overflowCount");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v11_2));
        }
    }

    public static j5.z0 g(android.util.JsonReader p6)
    {
        String v0_1 = new j5.y0();
        p6.beginObject();
        while (p6.hasNext()) {
            byte v1_0 = p6.nextName();
            v1_0.getClass();
            int v5 = -1;
            switch (v1_0.hashCode()) {
                case 110987:
                    if (v1_0.equals("pid")) {
                        v5 = 0;
                    } else {
                    }
                    break;
                case 202325402:
                    if (v1_0.equals("processName")) {
                        v5 = 1;
                    } else {
                    }
                    break;
                case 1694598382:
                    if (v1_0.equals("defaultProcess")) {
                        v5 = 2;
                    } else {
                    }
                    break;
                case 2125650548:
                    if (v1_0.equals("importance")) {
                        v5 = 3;
                    } else {
                    }
                    break;
                default:
            }
            switch (v5) {
                case 0:
                    v0_1.b = p6.nextInt();
                    v0_1.e = ((byte) (v0_1.e | 1));
                    break;
                case 1:
                    byte v1_14 = p6.nextString();
                    if (v1_14 == 0) {
                        throw new NullPointerException("Null processName");
                    } else {
                        v0_1.a = v1_14;
                    }
                    break;
                case 2:
                    v0_1.d = p6.nextBoolean();
                    v0_1.e = ((byte) (v0_1.e | 4));
                    break;
                case 3:
                    v0_1.c = p6.nextInt();
                    v0_1.e = ((byte) (v0_1.e | 2));
                    break;
                default:
                    p6.skipValue();
            }
        }
        p6.endObject();
        return v0_1.a();
    }

    public static j5.b0 h(android.util.JsonReader p29)
    {
        NullPointerException v0_4 = new j5.a0();
        p29.beginObject();
        while (p29.hasNext()) {
            String v1_9;
            String v1_1 = p29.nextName();
            v1_1.getClass();
            switch (v1_1.hashCode()) {
                case -2118372775:
                    if (v1_1.equals("ndkPayload")) {
                        v1_9 = 0;
                    } else {
                        v1_9 = -1;
                    }
                    break;
                case -1962630338:
                    if (v1_1.equals("sdkVersion")) {
                        v1_9 = 1;
                    }
                    break;
                case -1907185581:
                    if (v1_1.equals("appQualitySessionId")) {
                        v1_9 = 2;
                    }
                    break;
                case -1375141843:
                    if (v1_1.equals("appExitInfo")) {
                        v1_9 = 3;
                    }
                    break;
                case -911706486:
                    if (v1_1.equals("buildVersion")) {
                        v1_9 = 4;
                    }
                    break;
                case -401988390:
                    if (v1_1.equals("firebaseAuthenticationToken")) {
                        v1_9 = 5;
                    }
                    break;
                case 344431858:
                    if (v1_1.equals("gmpAppId")) {
                        v1_9 = 6;
                    }
                    break;
                case 719853845:
                    if (v1_1.equals("installationUuid")) {
                        v1_9 = 7;
                    }
                    break;
                case 1047652060:
                    if (v1_1.equals("firebaseInstallationId")) {
                        v1_9 = 8;
                    }
                    break;
                case 1874684019:
                    if (v1_1.equals("platform")) {
                        v1_9 = 9;
                    }
                    break;
                case 1975623094:
                    if (v1_1.equals("displayVersion")) {
                        v1_9 = 10;
                    }
                    break;
                case 1984987798:
                    if (v1_1.equals("session")) {
                        v1_9 = 11;
                    }
                    break;
                default:
            }
            switch (v1_9) {
                case 0:
                    p29.beginObject();
                    String v1_37 = 0;
                    String v2_6 = 0;
                    while (p29.hasNext()) {
                        j5.k0 v3_52 = p29.nextName();
                        v3_52.getClass();
                        if (v3_52.equals("files")) {
                            v1_37 = k5.a.d(p29, new a5.t(25));
                            if (v1_37 == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else {
                            if (v3_52.equals("orgId")) {
                                v2_6 = p29.nextString();
                            } else {
                                p29.skipValue();
                            }
                        }
                    }
                    p29.endObject();
                    if (v1_37 == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    } else {
                        v0_4.k = new j5.g0(v1_37, v2_6);
                    }
                    break;
                case 1:
                    String v1_35 = p29.nextString();
                    if (v1_35 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    } else {
                        v0_4.a = v1_35;
                    }
                    break;
                case 2:
                    v0_4.g = p29.nextString();
                    break;
                case 3:
                    v0_4.l = k5.a.c(p29);
                    break;
                case 4:
                    String v1_31 = p29.nextString();
                    if (v1_31 == null) {
                        throw new NullPointerException("Null buildVersion");
                    } else {
                        v0_4.h = v1_31;
                    }
                    break;
                case 5:
                    v0_4.f = p29.nextString();
                    break;
                case 6:
                    String v1_28 = p29.nextString();
                    if (v1_28 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    } else {
                        v0_4.b = v1_28;
                    }
                    break;
                case 7:
                    String v1_26 = p29.nextString();
                    if (v1_26 == null) {
                        throw new NullPointerException("Null installationUuid");
                    } else {
                        v0_4.d = v1_26;
                    }
                    break;
                case 8:
                    v0_4.e = p29.nextString();
                    break;
                case 9:
                    v0_4.c = p29.nextInt();
                    v0_4.m = ((byte) (v0_4.m | 1));
                    break;
                case 10:
                    String v1_19 = p29.nextString();
                    if (v1_19 == null) {
                        throw new NullPointerException("Null displayVersion");
                    } else {
                        v0_4.i = v1_19;
                    }
                    break;
                case 11:
                    String v1_48 = new j5.i0();
                    v1_48.f = 0;
                    v1_48.m = ((byte) (v1_48.m | 2));
                    p29.beginObject();
                    while (p29.hasNext()) {
                        j5.k0 v3_2;
                        j5.k0 v3_0 = p29.nextName();
                        v3_0.getClass();
                        switch (v3_0.hashCode()) {
                            case -2128794476:
                                if (v3_0.equals("startedAt")) {
                                    v3_2 = 0;
                                } else {
                                    v3_2 = -1;
                                }
                                break;
                            case -1907185581:
                                if (v3_0.equals("appQualitySessionId")) {
                                    v3_2 = 1;
                                }
                                break;
                            case -1618432855:
                                if (v3_0.equals("identifier")) {
                                    v3_2 = 2;
                                }
                                break;
                            case -1606742899:
                                if (v3_0.equals("endedAt")) {
                                    v3_2 = 3;
                                }
                                break;
                            case -1335157162:
                                if (v3_0.equals("device")) {
                                    v3_2 = 4;
                                }
                                break;
                            case -1291329255:
                                if (v3_0.equals("events")) {
                                    v3_2 = 5;
                                }
                                break;
                            case 3556:
                                if (v3_0.equals("os")) {
                                    v3_2 = 6;
                                }
                                break;
                            case 96801:
                                if (v3_0.equals("app")) {
                                    v3_2 = 7;
                                }
                                break;
                            case 3599307:
                                if (v3_0.equals("user")) {
                                    v3_2 = 8;
                                }
                                break;
                            case 286956243:
                                if (v3_0.equals("generator")) {
                                    v3_2 = 9;
                                }
                                break;
                            case 1025385094:
                                if (v3_0.equals("crashed")) {
                                    v3_2 = 10;
                                }
                                break;
                            case 2047016109:
                                if (v3_0.equals("generatorType")) {
                                    v3_2 = 11;
                                }
                                break;
                            default:
                        }
                        switch (v3_2) {
                            case 0:
                                v1_48.d = p29.nextLong();
                                v1_48.m = ((byte) (v1_48.m | 1));
                                break;
                            case 1:
                                v1_48.c = p29.nextString();
                                break;
                            case 2:
                                v1_48.b = new String(android.util.Base64.decode(p29.nextString(), 2), j5.n2.a);
                                break;
                            case 3:
                                v1_48.e = Long.valueOf(p29.nextLong());
                                break;
                            case 4:
                                j5.k0 v3_41 = new j5.m0();
                                p29.beginObject();
                                while (p29.hasNext()) {
                                    byte v6_25;
                                    byte v6_23 = p29.nextName();
                                    v6_23.getClass();
                                    switch (v6_23.hashCode()) {
                                        case -1981332476:
                                            if (v6_23.equals("simulator")) {
                                                v6_25 = 0;
                                            } else {
                                                v6_25 = -1;
                                            }
                                            break;
                                        case -1969347631:
                                            if (v6_23.equals("manufacturer")) {
                                                v6_25 = 1;
                                            }
                                            break;
                                        case 112670:
                                            if (v6_23.equals("ram")) {
                                                v6_25 = 2;
                                            }
                                            break;
                                        case 3002454:
                                            if (v6_23.equals("arch")) {
                                                v6_25 = 3;
                                            }
                                            break;
                                        case 81784169:
                                            if (v6_23.equals("diskSpace")) {
                                                v6_25 = 4;
                                            }
                                            break;
                                        case 94848180:
                                            if (v6_23.equals("cores")) {
                                                v6_25 = 5;
                                            }
                                            break;
                                        case 104069929:
                                            if (v6_23.equals("model")) {
                                                v6_25 = 6;
                                            }
                                            break;
                                        case 109757585:
                                            if (v6_23.equals("state")) {
                                                v6_25 = 7;
                                            }
                                            break;
                                        case 2078953423:
                                            if (v6_23.equals("modelClass")) {
                                                v6_25 = 8;
                                            }
                                            break;
                                        default:
                                    }
                                    switch (v6_25) {
                                        case 0:
                                            v3_41.f = p29.nextBoolean();
                                            v3_41.j = ((byte) (v3_41.j | 16));
                                            break;
                                        case 1:
                                            byte v6_54 = p29.nextString();
                                            if (v6_54 == 0) {
                                                throw new NullPointerException("Null manufacturer");
                                            } else {
                                                v3_41.h = v6_54;
                                            }
                                            break;
                                        case 2:
                                            v3_41.d = p29.nextLong();
                                            v3_41.j = ((byte) (v3_41.j | 4));
                                            break;
                                        case 3:
                                            v3_41.a = p29.nextInt();
                                            v3_41.j = ((byte) (v3_41.j | 1));
                                            break;
                                        case 4:
                                            v3_41.e = p29.nextLong();
                                            v3_41.j = ((byte) (v3_41.j | 8));
                                            break;
                                        case 5:
                                            v3_41.c = p29.nextInt();
                                            v3_41.j = ((byte) (v3_41.j | 2));
                                            break;
                                        case 6:
                                            byte v6_39 = p29.nextString();
                                            if (v6_39 == 0) {
                                                throw new NullPointerException("Null model");
                                            } else {
                                                v3_41.b = v6_39;
                                            }
                                            break;
                                        case 7:
                                            v3_41.g = p29.nextInt();
                                            v3_41.j = ((byte) (v3_41.j | 32));
                                            break;
                                        case 8:
                                            byte v6_34 = p29.nextString();
                                            if (v6_34 == 0) {
                                                throw new NullPointerException("Null modelClass");
                                            } else {
                                                v3_41.i = v6_34;
                                            }
                                            break;
                                        default:
                                            p29.skipValue();
                                    }
                                }
                                p29.endObject();
                                v1_48.j = v3_41.a();
                                break;
                            case 5:
                                j5.k0 v3_38 = new java.util.ArrayList();
                                p29.beginArray();
                                while (p29.hasNext()) {
                                    v3_38.add(k5.a.e(p29));
                                }
                                p29.endArray();
                                v1_48.k = java.util.Collections.unmodifiableList(v3_38);
                                break;
                            case 6:
                                j5.k0 v3_35 = new j5.h1();
                                p29.beginObject();
                                while (p29.hasNext()) {
                                    byte v6_6;
                                    byte v6_4 = p29.nextName();
                                    v6_4.getClass();
                                    switch (v6_4.hashCode()) {
                                        case -911706486:
                                            if (v6_4.equals("buildVersion")) {
                                                v6_6 = 0;
                                            } else {
                                                v6_6 = -1;
                                            }
                                            break;
                                        case -293026577:
                                            if (v6_4.equals("jailbroken")) {
                                                v6_6 = 1;
                                            }
                                            break;
                                        case 351608024:
                                            if (v6_4.equals("version")) {
                                                v6_6 = 2;
                                            }
                                            break;
                                        case 1874684019:
                                            if (v6_4.equals("platform")) {
                                                v6_6 = 3;
                                            }
                                            break;
                                        default:
                                    }
                                    switch (v6_6) {
                                        case 0:
                                            byte v6_19 = p29.nextString();
                                            if (v6_19 == 0) {
                                                throw new NullPointerException("Null buildVersion");
                                            } else {
                                                v3_35.c = v6_19;
                                            }
                                            break;
                                        case 1:
                                            v3_35.d = p29.nextBoolean();
                                            v3_35.e = ((byte) (v3_35.e | 2));
                                            break;
                                        case 2:
                                            byte v6_14 = p29.nextString();
                                            if (v6_14 == 0) {
                                                throw new NullPointerException("Null version");
                                            } else {
                                                v3_35.b = v6_14;
                                            }
                                            break;
                                        case 3:
                                            v3_35.a = p29.nextInt();
                                            v3_35.e = ((byte) (v3_35.e | 1));
                                            break;
                                        default:
                                            p29.skipValue();
                                    }
                                }
                                p29.endObject();
                                v1_48.i = v3_35.a();
                                break;
                            case 7:
                                p29.beginObject();
                                String v23 = 0;
                                String v24 = 0;
                                String v25 = 0;
                                String v26 = 0;
                                String v27 = 0;
                                String v28 = 0;
                                while (p29.hasNext()) {
                                    int v14_0;
                                    j5.k0 v3_27 = p29.nextName();
                                    v3_27.getClass();
                                    switch (v3_27.hashCode()) {
                                        case -1618432855:
                                            if (v3_27.equals("identifier")) {
                                                v14_0 = 0;
                                            } else {
                                                v14_0 = -1;
                                            }
                                            break;
                                        case -519438642:
                                            if (v3_27.equals("developmentPlatform")) {
                                                v14_0 = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (v3_27.equals("developmentPlatformVersion")) {
                                                v14_0 = 2;
                                            }
                                            break;
                                        case 351608024:
                                            if (v3_27.equals("version")) {
                                                v14_0 = 3;
                                            }
                                            break;
                                        case 719853845:
                                            if (v3_27.equals("installationUuid")) {
                                                v14_0 = 4;
                                            }
                                            break;
                                        case 1975623094:
                                            if (v3_27.equals("displayVersion")) {
                                                v14_0 = 5;
                                            }
                                            break;
                                        default:
                                    }
                                    switch (v14_0) {
                                        case 0:
                                            v23 = p29.nextString();
                                            if (v23 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            v27 = p29.nextString();
                                            break;
                                        case 2:
                                            v28 = p29.nextString();
                                            break;
                                        case 3:
                                            v24 = p29.nextString();
                                            if (v24 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            v26 = p29.nextString();
                                            break;
                                        case 5:
                                            v25 = p29.nextString();
                                            break;
                                        default:
                                            p29.skipValue();
                                    }
                                }
                                p29.endObject();
                                if ((v23 != null) && (v24 != null)) {
                                    v1_48.g = new j5.k0(v23, v24, v25, v26, v27, v28);
                                } else {
                                    NullPointerException v0_10 = new StringBuilder();
                                    if (v23 == null) {
                                        v0_10.append(" identifier");
                                    }
                                    if (v24 == null) {
                                        v0_10.append(" version");
                                    }
                                    throw new IllegalStateException(g2.g.g("Missing required properties:", v0_10));
                                }
                                break;
                            case 8:
                                p29.beginObject();
                                j5.k0 v3_23 = 0;
                                while (p29.hasNext()) {
                                    if (!p29.nextName().equals("identifier")) {
                                        p29.skipValue();
                                    } else {
                                        v3_23 = p29.nextString();
                                        if (v3_23 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    }
                                }
                                p29.endObject();
                                if (v3_23 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                } else {
                                    v1_48.h = new j5.j1(v3_23);
                                }
                                break;
                            case 9:
                                j5.k0 v3_22 = p29.nextString();
                                if (v3_22 == null) {
                                    throw new NullPointerException("Null generator");
                                } else {
                                    v1_48.a = v3_22;
                                }
                                break;
                            case 10:
                                v1_48.f = p29.nextBoolean();
                                v1_48.m = ((byte) (v1_48.m | 2));
                                break;
                            case 11:
                                v1_48.l = p29.nextInt();
                                v1_48.m = ((byte) (v1_48.m | 4));
                                break;
                            default:
                                p29.skipValue();
                        }
                    }
                    p29.endObject();
                    v0_4.j = v1_48.a();
                    break;
                default:
                    p29.skipValue();
            }
        }
        p29.endObject();
        return v0_4.a();
    }

    public static j5.b0 i(String p2)
    {
        try {
            Throwable v0_3 = new android.util.JsonReader(new java.io.StringReader(p2));
            try {
                Throwable v2_2 = k5.a.h(v0_3);
            } catch (Throwable v2_3) {
                try {
                    v0_3.close();
                } catch (Throwable v0_4) {
                    v2_3.addSuppressed(v0_4);
                }
                throw v2_3;
            }
            v0_3.close();
            return v2_2;
        } catch (Throwable v2_1) {
            throw new java.io.IOException(v2_1);
        }
    }
}
