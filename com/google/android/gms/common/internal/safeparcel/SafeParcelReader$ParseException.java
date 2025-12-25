package com.google.android.gms.common.internal.safeparcel;
public class SafeParcelReader$ParseException extends java.lang.RuntimeException {

    public SafeParcelReader$ParseException(String p5, android.os.Parcel p6)
    {
        int v0 = p6.dataPosition();
        int v6_1 = p6.dataSize();
        StringBuilder v2_2 = new StringBuilder(((((String.valueOf(p5).length() + 13) + String.valueOf(v0).length()) + 6) + String.valueOf(v6_1).length()));
        v2_2.append(p5);
        v2_2.append(" Parcel: pos=");
        v2_2.append(v0);
        v2_2.append(" size=");
        v2_2.append(v6_1);
        super(v2_2.toString());
        return;
    }
}
