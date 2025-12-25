package v4;
public final class d implements com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener {
    public final synthetic v4.e a;

    public d(v4.e p1)
    {
        this.a = p1;
        return;
    }

    public final void onEvent(String p2, String p3, android.os.Bundle p4, long p5)
    {
        if ((p2 != null) && (!v4.a.a.contains(p3))) {
            android.os.Bundle v2_4 = new android.os.Bundle();
            v2_4.putString("name", p3);
            v2_4.putLong("timestampInMillis", p5);
            v2_4.putBundle("params", p4);
            this.a.a.x(3, v2_4);
        }
        return;
    }
}
