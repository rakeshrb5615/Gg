package com.google.android.gms.internal.play_billing;
public final class zzbj {

    public static varargs String zza(String p10, Object[] p11)
    {
        int v1_0 = 0;
        int v2_0 = 0;
        while(true) {
            int v0_2 = p11.length;
            if (v2_0 >= v0_2) {
                break;
            }
            int v0_7;
            String v3_0 = p11[v2_0];
            if (v3_0 != null) {
                try {
                    v0_7 = v3_0.toString();
                } catch (int v0_8) {
                    Exception v8 = v0_8;
                    int v0_12 = g2.g.e(v3_0.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(v3_0)));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(v0_12), v8);
                    String v3_7 = v8.getClass().getName();
                    int v4_6 = new StringBuilder("<");
                    v4_6.append(v0_12);
                    v4_6.append(" threw ");
                    v4_6.append(v3_7);
                    v4_6.append(">");
                    v0_7 = v4_6.toString();
                }
            } else {
                v0_7 = "null";
            }
            p11[v2_0] = v0_7;
            v2_0++;
        }
        String v3_8 = new StringBuilder((p10.length() + (v0_2 * 16)));
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
            int v0_1 = (v1_0 + 1);
            v3_8.append(p11[v1_0]);
            v1_0 = v0_1;
            v0_0 = (v4_1 + 2);
        }
        v3_8.append(p10, v0_0, p10.length());
        if (v1_0 < v2_1) {
            v3_8.append(" [");
            int v10_2 = (v1_0 + 1);
            v3_8.append(p11[v1_0]);
            while (v10_2 < p11.length) {
                v3_8.append(", ");
                int v0_6 = (v10_2 + 1);
                v3_8.append(p11[v10_2]);
                v10_2 = v0_6;
            }
            v3_8.append(93);
        }
        return v3_8.toString();
    }

    public static String zzb(String p0)
    {
        if (p0 == null) {
            p0 = "";
        }
        return p0;
    }
}
