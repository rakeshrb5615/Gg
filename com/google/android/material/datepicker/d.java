package com.google.android.material.datepicker;
public final class d implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final long a;

    static d()
    {
        com.google.android.material.datepicker.d.CREATOR = new a2.z(9);
        return;
    }

    public d(long p1)
    {
        this.a = p1;
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.material.datepicker.d)) {
                if (this.a != ((com.google.android.material.datepicker.d) p8).a) {
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
        return java.util.Arrays.hashCode(new Object[] {Long.valueOf(this.a)}));
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        p3.writeLong(this.a);
        return;
    }
}
