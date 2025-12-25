package q4;
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j(String p3, String p4, String p5, String p6, String p7, String p8, String p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkState((com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(p3) ^ 1), "ApplicationId must be set.");
        this.b = p3;
        this.a = p4;
        this.c = p5;
        this.d = p6;
        this.e = p7;
        this.f = p8;
        this.g = p9;
        return;
    }

    public static q4.j a(android.content.Context p9)
    {
        com.google.android.gms.common.internal.StringResourceValueReader v0_1 = new com.google.android.gms.common.internal.StringResourceValueReader(p9);
        String v2 = v0_1.getString("google_app_id");
        if (!android.text.TextUtils.isEmpty(v2)) {
            return new q4.j(v2, v0_1.getString("google_api_key"), v0_1.getString("firebase_database_url"), v0_1.getString("ga_trackingId"), v0_1.getString("gcm_defaultSenderId"), v0_1.getString("google_storage_bucket"), v0_1.getString("project_id"));
        } else {
            return 0;
        }
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof q4.j)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.b, ((q4.j) p4).b)) || ((!com.google.android.gms.common.internal.Objects.equal(this.a, ((q4.j) p4).a)) || ((!com.google.android.gms.common.internal.Objects.equal(this.c, ((q4.j) p4).c)) || ((!com.google.android.gms.common.internal.Objects.equal(this.d, ((q4.j) p4).d)) || ((!com.google.android.gms.common.internal.Objects.equal(this.e, ((q4.j) p4).e)) || ((!com.google.android.gms.common.internal.Objects.equal(this.f, ((q4.j) p4).f)) || (!com.google.android.gms.common.internal.Objects.equal(this.g, ((q4.j) p4).g)))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        String v2 = this.c;
        String v4 = this.e;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.b, this.g}));
    }

    public final String toString()
    {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}
