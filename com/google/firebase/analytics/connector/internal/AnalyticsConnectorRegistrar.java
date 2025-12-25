package com.google.firebase.analytics.connector.internal;
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {

    public AnalyticsConnectorRegistrar()
    {
        return;
    }

    private static u4.b lambda$getComponents$0(a5.d p6)
    {
        com.google.android.gms.measurement.api.AppMeasurementSdk v0_2 = ((q4.f) p6.a(q4.f));
        android.content.Context v1_2 = ((android.content.Context) p6.a(android.content.Context));
        u4.c v6_2 = ((x5.c) p6.a(x5.c));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_2.getApplicationContext());
        if (u4.c.c == null) {
            if (u4.c.c == null) {
                android.os.Bundle v3_2 = new android.os.Bundle(1);
                v0_2.a();
                if ("[DEFAULT]".equals(v0_2.b)) {
                    ((a5.p) v6_2).a(h.o.b, c5.c.c);
                    v3_2.putBoolean("dataCollectionDefaultEnabled", v0_2.j());
                }
                u4.c.c = new u4.c(com.google.android.gms.internal.measurement.zzfb.zza(v1_2, v3_2).zzb());
            }
        }
        return u4.c.c;
    }

    public static synthetic u4.b zza(a5.d p0)
    {
        return com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar.lambda$getComponents$0(p0);
    }

    public java.util.List getComponents()
    {
        java.util.List v0_1 = a5.c.b(u4.b);
        v0_1.a(a5.m.c(q4.f));
        v0_1.a(a5.m.c(android.content.Context));
        v0_1.a(a5.m.c(x5.c));
        v0_1.f = v3.f.d;
        v0_1.c(2);
        return java.util.Arrays.asList(new a5.c[] {v0_1.b(), j5.t1.j("fire-analytics", "23.0.0")}));
    }
}
