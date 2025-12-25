package u4;
public final class c implements u4.b {
    public static volatile u4.c c;
    public final com.google.android.gms.measurement.api.AppMeasurementSdk a;
    public final java.util.concurrent.ConcurrentHashMap b;

    public c(com.google.android.gms.measurement.api.AppMeasurementSdk p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.a = p1;
        this.b = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public final void a(String p4, String p5, android.os.Bundle p6)
    {
        if ((v4.a.a(p4)) && ((v4.a.b(p6, p5)) && (v4.a.d(p4, p5, p6)))) {
            if (("clx".equals(p4)) && ("_ae".equals(p5))) {
                p6.putLong("_r", 1);
            }
            this.a.logEvent(p4, p5, p6);
        }
        return;
    }

    public final a6.e b(String p5, k2.c p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        if (v4.a.a(p5)) {
            java.util.concurrent.ConcurrentHashMap v2 = this.b;
            if ((p5.isEmpty()) || ((!v2.containsKey(p5)) || (v2.get(p5) == null))) {
                int v0_7;
                com.google.android.gms.measurement.api.AppMeasurementSdk v3 = this.a;
                if (!"fiam".equals(p5)) {
                    if (!"clx".equals(p5)) {
                        v0_7 = 0;
                    } else {
                        v0_7 = new v4.e(v3, p6);
                    }
                } else {
                    v0_7 = new v4.c(v3, p6);
                }
                if (v0_7 != 0) {
                    v2.put(p5, v0_7);
                    return new a6.e();
                }
            }
        }
        return 0;
    }
}
