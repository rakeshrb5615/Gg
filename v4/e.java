package v4;
public final class e {
    public final k2.c a;

    public e(com.google.android.gms.measurement.api.AppMeasurementSdk p1, k2.c p2)
    {
        this.a = p2;
        p1.registerOnMeasurementEventListener(new v4.d(this));
        return;
    }
}
