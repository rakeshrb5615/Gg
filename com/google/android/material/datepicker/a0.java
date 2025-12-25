package com.google.android.material.datepicker;
public abstract class a0 {
    public static final java.util.concurrent.atomic.AtomicReference a;

    static a0()
    {
        com.google.android.material.datepicker.a0.a = new java.util.concurrent.atomic.AtomicReference();
        return;
    }

    public static java.util.Calendar a(java.util.Calendar p4)
    {
        int v4_1 = com.google.android.material.datepicker.a0.c(p4);
        java.util.Calendar v0_1 = com.google.android.material.datepicker.a0.c(0);
        v0_1.set(v4_1.get(1), v4_1.get(2), v4_1.get(5));
        return v0_1;
    }

    public static java.util.Calendar b()
    {
        com.google.android.material.datepicker.a0.a.get();
        java.util.Calendar v0_2 = java.util.Calendar.getInstance();
        v0_2.set(11, 0);
        v0_2.set(12, 0);
        v0_2.set(13, 0);
        v0_2.set(14, 0);
        v0_2.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return v0_2;
    }

    public static java.util.Calendar c(java.util.Calendar p3)
    {
        java.util.Calendar v0_2 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (p3 != null) {
            v0_2.setTimeInMillis(p3.getTimeInMillis());
            return v0_2;
        } else {
            v0_2.clear();
            return v0_2;
        }
    }
}
