package com.google.android.gms.internal.firebase-auth-api;
public final class zzac {

    private static String zza(Object p6)
    {
        if (p6 != null) {
            try {
                String v6_4 = p6.toString();
                return v6_4;
            } catch (String v0_4) {
                Exception v5 = v0_4;
                String v6_3 = g2.g.e(v6_4.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(v6_4)));
                java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", g2.g.l("Exception during lenientFormat for ", v6_3), v5);
                String v0_3 = v5.getClass().getName();
                StringBuilder v1_3 = new StringBuilder("<");
                v1_3.append(v6_3);
                v1_3.append(" threw ");
                v1_3.append(v0_3);
                v1_3.append(">");
                return v1_3.toString();
            }
        } else {
            return "null";
        }
    }

    public static String zza(String p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzp.zzb(p0);
    }

    public static varargs String zza(String p6, Object[] p7)
    {
        int v6_1 = String.valueOf(p6);
        int v0_0 = 0;
        if (p7 != null) {
            int v1_0 = 0;
            while (v1_0 < p7.length) {
                p7[v1_0] = com.google.android.gms.internal.firebase-auth-api.zzac.zza(p7[v1_0]);
                v1_0++;
            }
        } else {
            p7 = new Object[1];
            p7[0] = "(Object[])null";
        }
        int v1_3 = new StringBuilder(((p7.length * 16) + v6_1.length()));
        int v2_1 = 0;
        while (v0_0 < p7.length) {
            int v3_5 = v6_1.indexOf("%s", v2_1);
            if (v3_5 == -1) {
                break;
            }
            v1_3.append(v6_1, v2_1, v3_5);
            int v2_3 = (v0_0 + 1);
            v1_3.append(p7[v0_0]);
            v2_1 = (v3_5 + 2);
            v0_0 = v2_3;
        }
        v1_3.append(v6_1, v2_1, v6_1.length());
        if (v0_0 < p7.length) {
            v1_3.append(" [");
            int v6_4 = (v0_0 + 1);
            v1_3.append(p7[v0_0]);
            while (v6_4 < p7.length) {
                v1_3.append(", ");
                int v0_4 = (v6_4 + 1);
                v1_3.append(p7[v6_4]);
                v6_4 = v0_4;
            }
            v1_3.append(93);
        }
        return v1_3.toString();
    }

    public static String zzb(String p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzp.zzc(p0);
    }

    public static boolean zzc(String p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzp.zzd(p0);
    }
}
