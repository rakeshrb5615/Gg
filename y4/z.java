package y4;
public final class z extends y4.p {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final long c;
    public final com.google.android.gms.internal.firebase-auth-api.zzaiz d;

    static z()
    {
        y4.z.CREATOR = new a2.z(27);
        return;
    }

    public z(String p1, String p2, long p3, com.google.android.gms.internal.firebase-auth-api.zzaiz p5)
    {
        this.a = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.b = p2;
        this.c = p3;
        this.d = ((com.google.android.gms.internal.firebase-auth-api.zzaiz) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "totpInfo cannot be null."));
        return;
    }

    public static y4.z y(org.json.JSONObject p8)
    {
        if (!p8.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        } else {
            long v5 = p8.optLong("enrollmentTimestamp");
            if (p8.opt("totpInfo") == null) {
                throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
            } else {
                return new y4.z(p8.optString("uid"), p8.optString("displayName"), v5, new com.google.android.gms.internal.firebase-auth-api.zzaiz());
            }
        }
    }

    public final org.json.JSONObject toJson()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        try {
            v0_1.putOpt("factorIdKey", "totp");
            v0_1.putOpt("uid", this.a);
            v0_1.putOpt("displayName", this.b);
            v0_1.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            v0_1.putOpt("totpInfo", this.d);
            return v0_1;
        } catch (org.json.JSONException v0_2) {
            android.util.Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v0_2);
        }
    }

    public final void writeToParcel(android.os.Parcel p7, int p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p7);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p7, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p7, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p7, 3, this.c);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p7, 4, this.d, p8, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p7, v0);
        return;
    }

    public final String x()
    {
        return "totp";
    }
}
