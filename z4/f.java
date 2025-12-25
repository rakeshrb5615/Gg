package z4;
public final class f implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final long a;
    public final long b;

    static f()
    {
        z4.f.CREATOR = new z4.b(2);
        return;
    }

    public f(long p1, long p3)
    {
        this.a = p1;
        this.b = p3;
        return;
    }

    public static z4.f a(org.json.JSONObject p5)
    {
        if (p5 != null) {
            try {
                return new z4.f(p5.getLong("lastSignInTimestamp"), p5.getLong("creationTimestamp"));
            } catch (org.json.JSONException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 1, this.a);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
