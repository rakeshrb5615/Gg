package com.google.android.gms.common.internal;
public class ViewUtils {

    private ViewUtils()
    {
        return;
    }

    public static String getXmlAttributeString(String p4, String p5, android.content.Context p6, android.util.AttributeSet p7, boolean p8, boolean p9, String p10)
    {
        String v4_1;
        if (p7 != null) {
            v4_1 = p7.getAttributeValue(p4, p5);
        } else {
            v4_1 = 0;
        }
        if ((v4_1 != null) && ((v4_1.startsWith("@string/")) && (p8 != 0))) {
            int v8_1 = v4_1.substring(8);
            String v1 = p6.getPackageName();
            android.util.TypedValue v2_1 = new android.util.TypedValue();
            try {
                String v6_1 = p6.getResources();
                String v7_5 = new StringBuilder(((String.valueOf(v1).length() + 8) + String.valueOf(v8_1).length()));
                v7_5.append(v1);
                v7_5.append(":string/");
                v7_5.append(v8_1);
                v6_1.getValue(v7_5.toString(), v2_1, 1);
            } catch (android.content.res.Resources$NotFoundException) {
                int v8_4 = new StringBuilder(((String.valueOf(p5).length() + 30) + v4_1.length()));
                v8_4.append("Could not find resource for ");
                v8_4.append(p5);
                v8_4.append(": ");
                v8_4.append(v4_1);
                android.util.Log.w(p10, v8_4.toString());
            }
            String v6_9 = v2_1.string;
            if (v6_9 == null) {
                String v6_10 = v2_1.toString();
                StringBuilder v0_2 = new StringBuilder(((String.valueOf(p5).length() + 28) + v6_10.length()));
                v0_2.append("Resource ");
                v0_2.append(p5);
                v0_2.append(" was not a string: ");
                v0_2.append(v6_10);
                android.util.Log.w(p10, v0_2.toString());
            } else {
                v4_1 = v6_9.toString();
            }
        }
        if ((p9) && (v4_1 == null)) {
            String v7_17 = new StringBuilder((String.valueOf(p5).length() + 33));
            v7_17.append("Required XML attribute \"");
            v7_17.append(p5);
            v7_17.append("\" missing");
            android.util.Log.w(p10, v7_17.toString());
        }
        return v4_1;
    }
}
