package i2;
public final class i0 implements android.hardware.SensorEventListener {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic i0(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    private final void a(android.hardware.Sensor p1, int p2)
    {
        return;
    }

    private final void b(android.hardware.Sensor p1, int p2)
    {
        return;
    }

    public final void onAccuracyChanged(android.hardware.Sensor p1, int p2)
    {
        return;
    }

    public final void onSensorChanged(android.hardware.SensorEvent p2)
    {
        switch (this.a) {
            case 0:
                ((com.chilllive.chillwallpaperproject.MainActivity) this.b).T.q(p2);
                return;
            default:
                i2.v0 v0_6 = ((i2.n0) this.b).b;
                if (v0_6 != null) {
                    v0_6.q(p2);
                }
                return;
        }
    }
}
