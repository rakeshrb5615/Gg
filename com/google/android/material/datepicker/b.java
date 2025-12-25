package com.google.android.material.datepicker;
public final class b implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final com.google.android.material.datepicker.s a;
    public final com.google.android.material.datepicker.s b;
    public final com.google.android.material.datepicker.d c;
    public final com.google.android.material.datepicker.s d;
    public final int e;
    public final int f;
    public final int m;

    static b()
    {
        com.google.android.material.datepicker.b.CREATOR = new a2.z(8);
        return;
    }

    public b(com.google.android.material.datepicker.s p2, com.google.android.material.datepicker.s p3, com.google.android.material.datepicker.d p4, com.google.android.material.datepicker.s p5, int p6)
    {
        java.util.Objects.requireNonNull(p2, "start cannot be null");
        java.util.Objects.requireNonNull(p3, "end cannot be null");
        java.util.Objects.requireNonNull(p4, "validator cannot be null");
        this.a = p2;
        this.b = p3;
        this.d = p5;
        this.e = p6;
        this.c = p4;
        if ((p5 != 0) && (p2.a.compareTo(p5.a) > 0)) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else {
            if ((p5 != 0) && (p5.a.compareTo(p3.a) > 0)) {
                throw new IllegalArgumentException("current Month cannot be after end Month");
            } else {
                if ((p6 < 0) || (p6 > com.google.android.material.datepicker.a0.c(0).getMaximum(7))) {
                    throw new IllegalArgumentException("firstDayOfWeek is not valid");
                } else {
                    this.m = (p2.d(p3) + 1);
                    this.f = ((p3.c - p2.c) + 1);
                    return;
                }
            }
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.material.datepicker.b)) {
                if ((!this.a.equals(((com.google.android.material.datepicker.b) p5).a)) || ((!this.b.equals(((com.google.android.material.datepicker.b) p5).b)) || ((!java.util.Objects.equals(this.d, ((com.google.android.material.datepicker.b) p5).d)) || ((this.e != ((com.google.android.material.datepicker.b) p5).e) || (!this.c.equals(((com.google.android.material.datepicker.b) p5).c)))))) {
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
        return java.util.Arrays.hashCode(new Object[] {this.a, this.b, this.d, Integer.valueOf(this.e), this.c}));
    }

    public final void writeToParcel(android.os.Parcel p2, int p3)
    {
        p2.writeParcelable(this.a, 0);
        p2.writeParcelable(this.b, 0);
        p2.writeParcelable(this.d, 0);
        p2.writeParcelable(this.c, 0);
        p2.writeInt(this.e);
        return;
    }
}
