package com.google.android.datatransport.runtime.scheduling.jobscheduling;
public class AlarmManagerSchedulerBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final synthetic int a;

    public AlarmManagerSchedulerBroadcastReceiver()
    {
        return;
    }

    public final void onReceive(android.content.Context p5, android.content.Intent p6)
    {
        o5.d v0_6 = p6.getData().getQueryParameter("backendName");
        x2.a v1_4 = p6.getData().getQueryParameter("extras");
        java.util.concurrent.Executor v2_3 = Integer.valueOf(p6.getData().getQueryParameter("priority")).intValue();
        int v6_2 = p6.getExtras().getInt("attemptNumber");
        r2.r.b(p5);
        r2.j v5_1 = r2.j.a();
        v5_1.t(v0_6);
        v5_1.d = b3.a.b(v2_3);
        if (v1_4 != null) {
            v5_1.c = android.util.Base64.decode(v1_4, 0);
        }
        o5.d v0_5 = r2.r.a().d;
        ((java.util.concurrent.Executor) v0_5.e).execute(new x2.e(v0_5, v5_1.a(), v6_2, new x2.a()));
        return;
    }
}
