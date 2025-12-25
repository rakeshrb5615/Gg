package u6;
public final class a implements u6.p {
    public final android.os.Bundle a;

    public a(android.content.Context p3)
    {
        kotlin.jvm.internal.j.e(p3, "appContext");
        android.os.Bundle v3_1 = p3.getPackageManager().getApplicationInfo(p3.getPackageName(), 128).metaData;
        if (v3_1 == null) {
            v3_1 = android.os.Bundle.EMPTY;
        }
        this.a = v3_1;
        return;
    }

    public final Boolean a()
    {
        int v0_0 = this.a;
        if (!v0_0.containsKey("firebase_sessions_enabled")) {
            return 0;
        } else {
            return Boolean.valueOf(v0_0.getBoolean("firebase_sessions_enabled"));
        }
    }

    public final Double b()
    {
        int v0_0 = this.a;
        if (!v0_0.containsKey("firebase_sessions_sampling_rate")) {
            return 0;
        } else {
            return Double.valueOf(v0_0.getDouble("firebase_sessions_sampling_rate"));
        }
    }

    public final Object c(l7.c p1)
    {
        return h7.l.a;
    }

    public final c8.a d()
    {
        int v0_0 = this.a;
        if (!v0_0.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return 0;
        } else {
            return new c8.a(j5.t1.U(v0_0.getInt("firebase_sessions_sessions_restart_timeout"), c8.c.d));
        }
    }
}
