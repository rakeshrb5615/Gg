package com.google.android.recaptcha.internal;
final class zzqa extends java.lang.ThreadLocal {

    public zzqa()
    {
        return;
    }

    public final synthetic Object initialValue()
    {
        java.text.SimpleDateFormat v0_1 = new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss", java.util.Locale.ENGLISH);
        java.util.GregorianCalendar v1_2 = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
        v1_2.setGregorianChange(new java.util.Date(-9223372036854775808));
        v0_1.setCalendar(v1_2);
        return v0_1;
    }
}
