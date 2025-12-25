package i2;
public final class p extends com.google.android.gms.location.LocationCallback {
    public final synthetic boolean a;
    public final synthetic i2.q b;

    public p(i2.q p1, boolean p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void onLocationResult(com.google.android.gms.location.LocationResult p3)
    {
        android.location.Location v3_1 = p3.getLastLocation();
        if (v3_1 != null) {
            this.b.c(v3_1, this.a);
        }
        return;
    }
}
