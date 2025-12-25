package com.google.android.material.datepicker;
public final class s implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final java.util.Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String m;

    static s()
    {
        com.google.android.material.datepicker.s.CREATOR = new a2.z(10);
        return;
    }

    public s(java.util.Calendar p4)
    {
        p4.set(5, 1);
        java.util.Calendar v4_1 = com.google.android.material.datepicker.a0.a(p4);
        this.a = v4_1;
        this.b = v4_1.get(2);
        this.c = v4_1.get(1);
        this.d = v4_1.getMaximum(7);
        this.e = v4_1.getActualMaximum(5);
        this.f = v4_1.getTimeInMillis();
        return;
    }

    public static com.google.android.material.datepicker.s a(int p2, int p3)
    {
        java.util.Calendar v0_1 = com.google.android.material.datepicker.a0.c(0);
        v0_1.set(1, p2);
        v0_1.set(2, p3);
        return new com.google.android.material.datepicker.s(v0_1);
    }

    public static com.google.android.material.datepicker.s b(long p1)
    {
        java.util.Calendar v0_1 = com.google.android.material.datepicker.a0.c(0);
        v0_1.setTimeInMillis(p1);
        return new com.google.android.material.datepicker.s(v0_1);
    }

    public final String c()
    {
        if (this.m == null) {
            String v0_4 = this.a.getTimeInMillis();
            android.icu.text.DateFormat v2_0 = android.icu.text.DateFormat.getInstanceForSkeleton("yMMMM", java.util.Locale.getDefault());
            v2_0.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
            v2_0.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.m = v2_0.format(new java.util.Date(v0_4));
        }
        return this.m;
    }

    public final int compareTo(Object p2)
    {
        return this.a.compareTo(((com.google.android.material.datepicker.s) p2).a);
    }

    public final int d(com.google.android.material.datepicker.s p3)
    {
        if (!(this.a instanceof java.util.GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        } else {
            return ((p3.b - this.b) + ((p3.c - this.c) * 12));
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.material.datepicker.s)) {
                if ((this.b != ((com.google.android.material.datepicker.s) p5).b) || (this.c != ((com.google.android.material.datepicker.s) p5).c)) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {Integer.valueOf(this.b), Integer.valueOf(this.c)}));
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.c);
        p1.writeInt(this.b);
        return;
    }
}
