package v4;
public final class b implements com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener {
    public final synthetic v4.c a;

    public b(v4.c p1)
    {
        this.a = p1;
        return;
    }

    public final void onEvent(String p1, String p2, android.os.Bundle p3, long p4)
    {
        k2.c v1_0 = this.a;
        if (v1_0.a.contains(p2)) {
            android.os.Bundle v3_3 = new android.os.Bundle();
            String v4_1 = com.google.android.gms.measurement.internal.zzjm.zza(p2);
            if (v4_1 != null) {
                p2 = v4_1;
            }
            v3_3.putString("events", p2);
            v1_0.b.x(2, v3_3);
            return;
        } else {
            return;
        }
    }
}
