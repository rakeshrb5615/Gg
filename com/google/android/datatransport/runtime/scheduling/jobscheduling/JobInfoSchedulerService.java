package com.google.android.datatransport.runtime.scheduling.jobscheduling;
public class JobInfoSchedulerService extends android.app.job.JobService {
    public static final synthetic int a;

    public JobInfoSchedulerService()
    {
        return;
    }

    public final boolean onStartJob(android.app.job.JobParameters p6)
    {
        o5.d v0_6 = p6.getExtras().getString("backendName");
        r2.j v1_3 = p6.getExtras().getString("extras");
        a5.i v2_1 = p6.getExtras().getInt("priority");
        int v3_2 = p6.getExtras().getInt("attemptNumber");
        r2.r.b(this.getApplicationContext());
        x2.e v4_2 = r2.j.a();
        v4_2.t(v0_6);
        v4_2.d = b3.a.b(v2_1);
        if (v1_3 != null) {
            v4_2.c = android.util.Base64.decode(v1_3, 0);
        }
        o5.d v0_5 = r2.r.a().d;
        ((java.util.concurrent.Executor) v0_5.e).execute(new x2.e(v0_5, v4_2.a(), v3_2, new a5.i(14, this, p6)));
        return 1;
    }

    public final boolean onStopJob(android.app.job.JobParameters p1)
    {
        return 1;
    }
}
