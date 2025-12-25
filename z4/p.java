package z4;
public final class p {
    public static final com.google.android.gms.internal.firebase-auth-api.zzah a;
    public static final z4.p b;

    static p()
    {
        z4.p.a = com.google.android.gms.internal.firebase-auth-api.zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
        z4.p.b = new z4.p();
        return;
    }

    public static void a(android.content.Context p2, com.google.android.gms.common.api.Status p3)
    {
        android.content.SharedPreferences$Editor v2_2 = p2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        v2_2.putInt("statusCode", p3.getStatusCode());
        v2_2.putString("statusMessage", p3.getStatusMessage());
        v2_2.putLong("timestamp", com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis());
        v2_2.commit();
        return;
    }

    public static void b(android.content.SharedPreferences p4)
    {
        android.content.SharedPreferences$Editor v4_1 = p4.edit();
        com.google.android.gms.internal.firebase-auth-api.zzah v0 = z4.p.a;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            String v3_0 = v0.get(v2);
            v2++;
            v4_1.remove(((String) v3_0));
        }
        v4_1.commit();
        return;
    }
}
