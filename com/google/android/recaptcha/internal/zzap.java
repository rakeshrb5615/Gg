package com.google.android.recaptcha.internal;
public final class zzap {

    public static final String zza(android.content.ContentResolver p7)
    {
        String v7_1 = p7.query(android.net.Uri.parse("content://com.google.android.gsf.gservices"), 0, 0, new String[] {"android_id"}), 0);
        if ((v7_1 != null) && ((v7_1.moveToFirst()) && (v7_1.getColumnCount() >= 2))) {
            String v0_6 = String.valueOf(Long.parseLong(v7_1.getString(1)));
            v7_1.close();
            return v0_6;
        } else {
            return "";
        }
    }
}
