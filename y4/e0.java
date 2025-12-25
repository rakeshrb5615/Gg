package y4;
public final class e0 extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static e0()
    {
        y4.e0.CREATOR = new a2.z(23);
        return;
    }

    public e0(String p1, String p2, String p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzah x(org.json.JSONArray p7)
    {
        if ((p7 != null) && (p7.length() != 0)) {
            com.google.android.gms.internal.firebase-auth-api.zzak v0_1 = com.google.android.gms.internal.firebase-auth-api.zzah.zzf();
            int v1 = 0;
            while (v1 < p7.length()) {
                String v2_0 = p7.getJSONObject(v1);
                v0_1.zza(new y4.e0(v2_0.getString("credentialId"), v2_0.getString("name"), v2_0.getString("displayName")));
                v1++;
            }
            return v0_1.zza();
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzah.zzg();
        }
    }

    public static final y4.e0 y(org.json.JSONObject p4)
    {
        return new y4.e0(p4.getString("credentialId"), p4.getString("name"), p4.getString("displayName"));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, this.a, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.b, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.c, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
