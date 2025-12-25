package com.google.android.gms.common.util;
public final class DataUtils {

    public DataUtils()
    {
        return;
    }

    public static void copyStringToBuffer(String p3, android.database.CharArrayBuffer p4)
    {
        if (!android.text.TextUtils.isEmpty(p3)) {
            int v0_3 = p4.data;
            if ((v0_3 != 0) && (v0_3.length >= p3.length())) {
                p3.getChars(0, p3.length(), p4.data, 0);
            } else {
                p4.data = p3.toCharArray();
            }
            p4.sizeCopied = p3.length();
            return;
        } else {
            p4.sizeCopied = 0;
            return;
        }
    }

    public static byte[] loadImageBytes(android.graphics.Bitmap p3)
    {
        java.io.ByteArrayOutputStream v0_1 = new java.io.ByteArrayOutputStream();
        p3.compress(android.graphics.Bitmap$CompressFormat.JPEG, 100, v0_1);
        return v0_1.toByteArray();
    }
}
