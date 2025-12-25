package com.google.android.gms.internal.common;
public final class zzx {

    public static varargs String zza(String p10, Object[] p11)
    {
        int v1_0 = 0;
        int v2_0 = 0;
        while(true) {
            int v0_5 = p11.length;
            if (v2_0 >= v0_5) {
                break;
            }
            int v0_3;
            String v3_0 = p11[v2_0];
            if (v3_0 != null) {
                try {
                    v0_3 = v3_0.toString();
                } catch (int v0_10) {
                    Exception v8 = v0_10;
                    int v0_12 = v3_0.getClass().getName();
                    String v3_2 = Integer.toHexString(System.identityHashCode(v3_0));
                    int v0_14 = v1.a.o(new StringBuilder(((v0_12.length() + 1) + String.valueOf(v3_2).length())), v0_12, "@", v3_2);
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(v0_14), v8);
                    String v3_7 = v8.getClass().getName();
                    int v4_11 = new StringBuilder(((v3_7.length() + (v0_14.length() + 8)) + 1));
                    v4_11.append("<");
                    v4_11.append(v0_14);
                    v4_11.append(" threw ");
                    v4_11.append(v3_7);
                    v4_11.append(">");
                    v0_3 = v4_11.toString();
                }
            } else {
                v0_3 = "null";
            }
            p11[v2_0] = v0_3;
            v2_0++;
        }
        String v3_8 = new StringBuilder((p10.length() + (v0_5 * 16)));
        int v0_0 = 0;
        while(true) {
            int v2_1 = p11.length;
            if (v1_0 >= v2_1) {
                break;
            }
            int v4_1 = p10.indexOf("%s", v0_0);
            if (v4_1 == -1) {
                break;
            }
            v3_8.append(p10, v0_0, v4_1);
            int v0_4 = (v1_0 + 1);
            v3_8.append(p11[v1_0]);
            v1_0 = v0_4;
            v0_0 = (v4_1 + 2);
        }
        v3_8.append(p10, v0_0, p10.length());
        if (v1_0 < v2_1) {
            v3_8.append(" [");
            int v10_2 = (v1_0 + 1);
            v3_8.append(p11[v1_0]);
            while (v10_2 < p11.length) {
                v3_8.append(", ");
                int v0_9 = (v10_2 + 1);
                v3_8.append(p11[v10_2]);
                v10_2 = v0_9;
            }
            v3_8.append(93);
        }
        return v3_8.toString();
    }
}
