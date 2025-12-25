package i7;
public abstract class i extends i7.l {

    public static void Y(Iterable p1, java.util.AbstractCollection p2)
    {
        kotlin.jvm.internal.j.e(p1, "elements");
        if (!(p1 instanceof java.util.Collection)) {
            java.util.Iterator v1_2 = p1.iterator();
            while (v1_2.hasNext()) {
                p2.add(v1_2.next());
            }
            return;
        } else {
            p2.addAll(((java.util.Collection) p1));
            return;
        }
    }

    public static boolean Z(Iterable p3, Object p4)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        if (!(p3 instanceof java.util.Collection)) {
            int v3_1;
            if (!(p3 instanceof java.util.List)) {
                int v3_7 = p3.iterator();
                int v0_2 = 0;
                while (v3_7.hasNext()) {
                    boolean v2_1 = v3_7.next();
                    if (v0_2 < 0) {
                        a.a.V();
                        throw 0;
                    } else {
                        if (!kotlin.jvm.internal.j.a(p4, v2_1)) {
                            v0_2++;
                        } else {
                            v3_1 = v0_2;
                        }
                    }
                }
                v3_1 = -1;
            } else {
                v3_1 = ((java.util.List) p3).indexOf(p4);
            }
            if (v3_1 < 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return ((java.util.Collection) p3).contains(p4);
        }
    }

    public static final void a0(Iterable p1, StringBuilder p2, CharSequence p3, CharSequence p4, CharSequence p5, CharSequence p6, u7.l p7)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        p2.append(p4);
        java.util.Iterator v1_1 = p1.iterator();
        int v4_1 = 0;
        while (v1_1.hasNext()) {
            Object v6_1 = v1_1.next();
            v4_1++;
            if (v4_1 > 1) {
                p2.append(p3);
            }
            c4.b.d(p2, v6_1, p7);
        }
        p2.append(p5);
        return;
    }

    public static synthetic void b0(java.util.ArrayList p7, StringBuilder p8)
    {
        i7.i.a0(p7, p8, "\n", "", "", "...", 0);
        return;
    }

    public static String c0(Iterable p7, String p8, String p9, String p10, u7.l p11, int p12)
    {
        if ((p12 & 1) != 0) {
            p8 = ", ";
        }
        String v3;
        if ((p12 & 2) == 0) {
            v3 = p9;
        } else {
            v3 = "";
        }
        String v4;
        if ((p12 & 4) == 0) {
            v4 = p10;
        } else {
            v4 = "";
        }
        if ((p12 & 32) != 0) {
            p11 = 0;
        }
        kotlin.jvm.internal.j.e(p7, "<this>");
        kotlin.jvm.internal.j.e(v3, "prefix");
        StringBuilder v1_1 = new StringBuilder();
        i7.i.a0(p7, v1_1, p8, v3, v4, "...", p11);
        return v1_1.toString();
    }

    public static Object d0(java.util.List p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        if (p1.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        } else {
            return p1.get(a.a.y(p1));
        }
    }

    public static java.util.ArrayList e0(java.util.Collection p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        java.util.ArrayList v0_2 = new java.util.ArrayList((p4.size() + p3.size()));
        v0_2.addAll(p3);
        v0_2.addAll(p4);
        return v0_2;
    }

    public static java.util.List f0(int p6, java.util.List p7)
    {
        kotlin.jvm.internal.j.e(p7, "<this>");
        if (p6 < null) {
            throw new IllegalArgumentException(v1.a.j("Requested element count ", p6, " is less than zero.").toString());
        } else {
            String v0_1 = i7.n.a;
            if (p6 != null) {
                if (p6 < p7.size()) {
                    if (p6 != 1) {
                        java.util.ArrayList v3_1 = new java.util.ArrayList(p6);
                        String v7_2 = p7.iterator();
                        int v4 = 0;
                        while (v7_2.hasNext()) {
                            v3_1.add(v7_2.next());
                            v4++;
                            if (v4 == p6) {
                                break;
                            }
                        }
                        java.util.List v6_1 = v3_1.size();
                        if (v6_1 == null) {
                            return v0_1;
                        } else {
                            if (v6_1 == 1) {
                                return a.a.G(v3_1.get(0));
                            } else {
                                return v3_1;
                            }
                        }
                    } else {
                        if (p7.isEmpty()) {
                            throw new java.util.NoSuchElementException("List is empty.");
                        } else {
                            return a.a.G(p7.get(0));
                        }
                    }
                } else {
                    return i7.i.j0(p7);
                }
            } else {
                return v0_1;
            }
        }
    }

    public static byte[] g0(java.util.ArrayList p6)
    {
        byte[] v0_1 = new byte[p6.size()];
        int v1 = p6.size();
        int v2 = 0;
        int v3 = 0;
        while (v3 < v1) {
            byte v4_0 = p6.get(v3);
            v3++;
            int v5 = (v2 + 1);
            v0_1[v2] = ((Number) v4_0).byteValue();
            v2 = v5;
        }
        return v0_1;
    }

    public static final void h0(Iterable p1, java.util.AbstractCollection p2)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        java.util.Iterator v1_1 = p1.iterator();
        while (v1_1.hasNext()) {
            p2.add(v1_1.next());
        }
        return;
    }

    public static int[] i0(java.util.ArrayList p6)
    {
        int[] v0_1 = new int[p6.size()];
        int v1 = p6.size();
        int v2 = 0;
        int v3 = 0;
        while (v3 < v1) {
            int v4_0 = p6.get(v3);
            v3++;
            int v5 = (v2 + 1);
            v0_1[v2] = ((Number) v4_0).intValue();
            v2 = v5;
        }
        return v0_1;
    }

    public static java.util.List j0(Iterable p5)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        boolean v1_1 = i7.n.a;
        if (!(p5 instanceof java.util.Collection)) {
            java.util.List v5_8 = i7.i.m0(p5);
            java.util.ArrayList v0_1 = ((java.util.ArrayList) v5_8);
            int v4_0 = v0_1.size();
            if (v4_0 == 0) {
                return v1_1;
            } else {
                if (v4_0 == 1) {
                    return a.a.G(v0_1.get(0));
                } else {
                    return v5_8;
                }
            }
        } else {
            int v4_1 = ((java.util.Collection) p5).size();
            if (v4_1 == 0) {
                return v1_1;
            } else {
                if (v4_1 == 1) {
                    java.util.List v5_4;
                    if (!(p5 instanceof java.util.List)) {
                        v5_4 = ((java.util.Collection) p5).iterator().next();
                    } else {
                        v5_4 = ((java.util.List) p5).get(0);
                    }
                    return a.a.G(v5_4);
                } else {
                    return i7.i.l0(((java.util.Collection) p5));
                }
            }
        }
    }

    public static long[] k0(java.util.List p5)
    {
        kotlin.jvm.internal.j.e(p5, "<this>");
        long[] v0_2 = new long[p5.size()];
        java.util.Iterator v5_1 = p5.iterator();
        int v1 = 0;
        while (v5_1.hasNext()) {
            int v4 = (v1 + 1);
            v0_2[v1] = ((Number) v5_1.next()).longValue();
            v1 = v4;
        }
        return v0_2;
    }

    public static java.util.ArrayList l0(java.util.Collection p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        return new java.util.ArrayList(p1);
    }

    public static final java.util.List m0(Iterable p1)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        if (!(p1 instanceof java.util.Collection)) {
            java.util.ArrayList v0_3 = new java.util.ArrayList();
            i7.i.h0(p1, v0_3);
            return v0_3;
        } else {
            return i7.i.l0(((java.util.Collection) p1));
        }
    }

    public static java.util.Set n0(Iterable p4)
    {
        kotlin.jvm.internal.j.e(p4, "<this>");
        if (!(p4 instanceof java.util.Collection)) {
            int v0_8 = new java.util.LinkedHashSet();
            i7.i.h0(p4, v0_8);
            java.util.Set v4_1 = v0_8.size();
            if (v4_1 != null) {
                if (v4_1 == 1) {
                    java.util.Set v4_4 = java.util.Collections.singleton(v0_8.iterator().next());
                    kotlin.jvm.internal.j.d(v4_4, "singleton(...)");
                    return v4_4;
                } else {
                    return v0_8;
                }
            }
        } else {
            int v3 = ((java.util.Collection) p4).size();
            if (v3 != 0) {
                if (v3 == 1) {
                    java.util.Set v4_7;
                    if (!(p4 instanceof java.util.List)) {
                        v4_7 = ((java.util.Collection) p4).iterator().next();
                    } else {
                        v4_7 = ((java.util.List) p4).get(0);
                    }
                    java.util.Set v4_9 = java.util.Collections.singleton(v4_7);
                    kotlin.jvm.internal.j.d(v4_9, "singleton(...)");
                    return v4_9;
                } else {
                    java.util.LinkedHashSet v1_2 = new java.util.LinkedHashSet(i7.r.l0(((java.util.Collection) p4).size()));
                    i7.i.h0(p4, v1_2);
                    return v1_2;
                }
            }
        }
        return i7.p.a;
    }
}
