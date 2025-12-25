package com.google.android.gms.common.internal;
public final class Objects {

    private Objects()
    {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean checkBundlesEquality(android.os.Bundle p5, android.os.Bundle p6)
    {
        if ((p5 != null) && (p6 != null)) {
            if (p5.size() == p6.size()) {
                java.util.Iterator v2_0 = p5.keySet();
                if (v2_0.containsAll(p6.keySet())) {
                    java.util.Iterator v2_1 = v2_0.iterator();
                    while (v2_1.hasNext()) {
                        boolean v3_4 = ((String) v2_1.next());
                        if (!com.google.android.gms.common.internal.Objects.equal(p5.get(v3_4), p6.get(v3_4))) {
                            return 0;
                        }
                    }
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            if (p5 != p6) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static boolean equal(Object p2, Object p3)
    {
        if (p2 == p3) {
            return 1;
        } else {
            if ((!p2) || (!p2.equals(p3))) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static varargs int hashCode(Object[] p0)
    {
        return java.util.Arrays.hashCode(p0);
    }

    public static com.google.android.gms.common.internal.Objects$ToStringHelper toStringHelper(Object p2)
    {
        return new com.google.android.gms.common.internal.Objects$ToStringHelper(p2, 0);
    }
}
