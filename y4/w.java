package y4;
public final class w extends y4.p {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    static w()
    {
        y4.w.CREATOR = new a2.z(25);
        return;
    }

    public w(long p1, String p3, String p4, String p5)
    {
        this.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        this.b = p4;
        this.c = p1;
        this.d = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        return;
    }

    public static y4.w y(org.json.JSONObject p8)
    {
        if (!p8.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        } else {
            return new y4.w(p8.optLong("enrollmentTimestamp"), p8.optString("uid"), p8.optString("displayName"), p8.optString("phoneNumber"));
        }
    }

    public final org.json.JSONObject toJson()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        try {
            v0_1.putOpt("factorIdKey", "phone");
            v0_1.putOpt("uid", this.a);
            v0_1.putOpt("displayName", this.b);
            v0_1.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            v0_1.putOpt("phoneNumber", this.d);
            return v0_1;
        } catch (org.json.JSONException v0_2) {
            android.util.Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v0_2);
        }
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        p7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 4, this.d, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, p7);
        return;
    }

    public final String x()
    {
        return "phone";
    }
}
