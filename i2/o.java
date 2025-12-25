package i2;
public final synthetic class o implements com.google.android.gms.tasks.OnCompleteListener, com.google.android.gms.tasks.OnSuccessListener {
    public final synthetic boolean a;
    public final synthetic Object b;

    public synthetic o(Object p1, boolean p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public void onComplete(com.google.android.gms.tasks.Task p5)
    {
        i2.q v0_1 = ((i2.q) this.b);
        v0_1.getClass();
        com.google.android.gms.location.LocationRequest v5_10 = ((android.location.Location) p5.getResult());
        com.google.android.gms.location.FusedLocationProviderClient v1_1 = this.a;
        if (v5_10 == null) {
            v0_1.a.requestLocationUpdates(new com.google.android.gms.location.LocationRequest$Builder(10000).setIntervalMillis(10000).setMinUpdateIntervalMillis(1000).setPriority(104).setMaxUpdateDelayMillis(1).setMaxUpdates(2).build(), new i2.p(v0_1, v1_1), android.os.Looper.getMainLooper());
            return;
        } else {
            v0_1.c(v5_10, v1_1);
            return;
        }
    }

    public void onSuccess(Object p3)
    {
        android.content.SharedPreferences$Editor v3_2 = c4.b.C(((android.content.Context) this.b)).edit();
        v3_2.putBoolean("proxy_retention", this.a);
        v3_2.apply();
        return;
    }
}
