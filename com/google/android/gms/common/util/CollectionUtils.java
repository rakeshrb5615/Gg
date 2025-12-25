package com.google.android.gms.common.util;
public final class CollectionUtils {

    private CollectionUtils()
    {
        return;
    }

    public static boolean isEmpty(java.util.Collection p0)
    {
        if ((p0 != 0) && (!p0.isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static java.util.List listOf()
    {
        return java.util.Collections.EMPTY_LIST;
    }

    public static java.util.List listOf(Object p0)
    {
        return java.util.Collections.singletonList(p0);
    }

    public static varargs java.util.List listOf(Object[] p2)
    {
        int v0_0 = p2.length;
        if (v0_0 == 0) {
            return java.util.Collections.EMPTY_LIST;
        } else {
            if (v0_0 == 1) {
                return java.util.Collections.singletonList(p2[0]);
            } else {
                return java.util.Collections.unmodifiableList(java.util.Arrays.asList(p2));
            }
        }
    }

    public static java.util.Map mapOf(Object p2, Object p3, Object p4, Object p5, Object p6, Object p7)
    {
        java.util.Map v0_1 = com.google.android.gms.common.util.CollectionUtils.zzb(3, 0);
        v0_1.put(p2, p3);
        v0_1.put(p4, p5);
        v0_1.put(p6, p7);
        return java.util.Collections.unmodifiableMap(v0_1);
    }

    public static java.util.Map mapOf(Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12, Object p13)
    {
        java.util.Map v0_1 = com.google.android.gms.common.util.CollectionUtils.zzb(6, 0);
        v0_1.put(p2, p3);
        v0_1.put(p4, p5);
        v0_1.put(p6, p7);
        v0_1.put(p8, p9);
        v0_1.put(p10, p11);
        v0_1.put(p12, p13);
        return java.util.Collections.unmodifiableMap(v0_1);
    }

    public static java.util.Map mapOfKeyValueArrays(Object[] p4, Object[] p5)
    {
        java.util.Map v0_0 = p4.length;
        java.util.Map v1_0 = p5.length;
        if (v0_0 != v1_0) {
            String v3_1 = new StringBuilder(((String.valueOf(v0_0).length() + 44) + String.valueOf(v1_0).length()));
            v3_1.append("Key and values array lengths not equal: ");
            v3_1.append(v0_0);
            v3_1.append(" != ");
            v3_1.append(v1_0);
            throw new IllegalArgumentException(v3_1.toString());
        } else {
            if (v0_0 == null) {
                return java.util.Collections.EMPTY_MAP;
            } else {
                int v2_1 = 0;
                if (v0_0 == 1) {
                    return java.util.Collections.singletonMap(p4[0], p5[0]);
                } else {
                    java.util.Map v0_1 = com.google.android.gms.common.util.CollectionUtils.zzb(v0_0, 0);
                    while (v2_1 < p4.length) {
                        v0_1.put(p4[v2_1], p5[v2_1]);
                        v2_1++;
                    }
                    return java.util.Collections.unmodifiableMap(v0_1);
                }
            }
        }
    }

    public static java.util.Set mutableSetOfWithSize(int p1)
    {
        if (p1 != null) {
            return com.google.android.gms.common.util.CollectionUtils.zza(p1, 1);
        } else {
            return new r.f(0);
        }
    }

    public static java.util.Set setOf(Object p2, Object p3, Object p4)
    {
        java.util.Set v0_1 = com.google.android.gms.common.util.CollectionUtils.zza(3, 0);
        v0_1.add(p2);
        v0_1.add(p3);
        v0_1.add(p4);
        return java.util.Collections.unmodifiableSet(v0_1);
    }

    public static varargs java.util.Set setOf(Object[] p6)
    {
        java.util.Set v0_0 = p6.length;
        if (v0_0 == null) {
            return java.util.Collections.EMPTY_SET;
        } else {
            if (v0_0 == 1) {
                return java.util.Collections.singleton(p6[0]);
            } else {
                if (v0_0 == 2) {
                    java.util.Set v0_1 = p6[0];
                    java.util.Set v6_1 = p6[1];
                    java.util.Set v1_0 = com.google.android.gms.common.util.CollectionUtils.zza(2, 0);
                    v1_0.add(v0_1);
                    v1_0.add(v6_1);
                    return java.util.Collections.unmodifiableSet(v1_0);
                } else {
                    if (v0_0 == 3) {
                        return com.google.android.gms.common.util.CollectionUtils.setOf(p6[0], p6[1], p6[2]);
                    } else {
                        if (v0_0 == 4) {
                            java.util.Set v0_3 = p6[0];
                            java.util.Set v1_2 = p6[1];
                            java.util.Set v3_1 = p6[2];
                            java.util.Set v6_6 = p6[3];
                            java.util.Set v2_0 = com.google.android.gms.common.util.CollectionUtils.zza(4, 0);
                            v2_0.add(v0_3);
                            v2_0.add(v1_2);
                            v2_0.add(v3_1);
                            v2_0.add(v6_6);
                            return java.util.Collections.unmodifiableSet(v2_0);
                        } else {
                            java.util.Set v0_4 = com.google.android.gms.common.util.CollectionUtils.zza(v0_0, 0);
                            java.util.Collections.addAll(v0_4, p6);
                            return java.util.Collections.unmodifiableSet(v0_4);
                        }
                    }
                }
            }
        }
    }

    private static java.util.Set zza(int p2, boolean p3)
    {
        int v1;
        if (1 == p3) {
            v1 = 128;
        } else {
            v1 = 256;
        }
        if (p2 > v1) {
            int v3_3;
            if (1 == p3) {
                v3_3 = 1061158912;
            } else {
                v3_3 = 1065353216;
            }
            return new java.util.HashSet(p2, v3_3);
        } else {
            return new r.f(p2);
        }
    }

    private static java.util.Map zzb(int p1, boolean p2)
    {
        if (p1 > 256) {
            return new java.util.HashMap(p1, 1065353216);
        } else {
            return new r.e(p1);
        }
    }
}
