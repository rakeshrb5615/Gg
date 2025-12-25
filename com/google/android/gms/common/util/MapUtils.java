package com.google.android.gms.common.util;
public class MapUtils {

    public MapUtils()
    {
        return;
    }

    public static void writeStringMapToJson(StringBuilder p4, java.util.HashMap p5)
    {
        p4.append("{");
        java.util.Iterator v0_2 = p5.keySet().iterator();
        int v1_4 = 1;
        while (v0_2.hasNext()) {
            int v2_1 = ((String) v0_2.next());
            if (v1_4 == 0) {
                p4.append(",");
            }
            int v1_2 = ((String) p5.get(v2_1));
            p4.append("\"");
            p4.append(v2_1);
            p4.append("\":");
            if (v1_2 != 0) {
                p4.append("\"");
                p4.append(v1_2);
                p4.append("\"");
            } else {
                p4.append("null");
            }
            v1_4 = 0;
        }
        p4.append("}");
        return;
    }
}
