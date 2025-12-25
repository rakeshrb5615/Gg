package z4;
public final class c extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements y4.b0 {
    public static final android.os.Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean m;
    public String n;

    static c()
    {
        z4.c.CREATOR = new z4.b(0);
        return;
    }

    public c(String p1, String p2, String p3, String p4, String p5, String p6, boolean p7, String p8)
    {
        this.a = p1;
        this.b = p2;
        this.e = p3;
        this.f = p4;
        this.c = p5;
        this.d = p6;
        if (!android.text.TextUtils.isEmpty(p6)) {
            android.net.Uri.parse(p6);
        }
        this.m = p7;
        this.n = p8;
        return;
    }

    public static z4.c x(String p10)
    {
        try {
            com.google.android.gms.internal.firebase-auth-api.zzaao v0_1 = new org.json.JSONObject(p10);
            return new z4.c(v0_1.optString("userId"), v0_1.optString("providerId"), v0_1.optString("email"), v0_1.optString("phoneNumber"), v0_1.optString("displayName"), v0_1.optString("photoUrl"), v0_1.optBoolean("isEmailVerified"), v0_1.optString("rawUserInfo"));
        } catch (com.google.android.gms.internal.firebase-auth-api.zzaao v0_2) {
            org.json.JSONException v10_7 = v0_2;
            android.util.Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v10_7);
        }
    }

    public final String s()
    {
        return this.b;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.d, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 5, this.e, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 6, this.f, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 7, this.m);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 8, this.n, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final String zzb()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        try {
            v0_1.putOpt("userId", this.a);
            v0_1.putOpt("providerId", this.b);
            v0_1.putOpt("displayName", this.c);
            v0_1.putOpt("photoUrl", this.d);
            v0_1.putOpt("email", this.e);
            v0_1.putOpt("phoneNumber", this.f);
            v0_1.putOpt("isEmailVerified", Boolean.valueOf(this.m));
            v0_1.putOpt("rawUserInfo", this.n);
            return v0_1.toString();
        } catch (org.json.JSONException v0_3) {
            android.util.Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new com.google.android.gms.internal.firebase-auth-api.zzaao(v0_3);
        }
    }
}
