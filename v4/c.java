package v4;
public final class c {
    public final java.util.HashSet a;
    public final k2.c b;

    public c(com.google.android.gms.measurement.api.AppMeasurementSdk p1, k2.c p2)
    {
        this.b = p2;
        p1.registerOnMeasurementEventListener(new v4.b(this));
        this.a = new java.util.HashSet();
        return;
    }
}
