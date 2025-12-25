package com.google.android.gms.internal.measurement;
public final class zzch {
    private static final reflect.Method zza;
    private static final reflect.Method zzb;

    static zzch()
    {
        try {
            String v0_1 = android.app.job.JobScheduler.getDeclaredMethod("scheduleAsPackage", new Class[] {android.app.job.JobInfo, String, Integer.TYPE, String}));
        } catch (NoSuchMethodException) {
            if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                android.util.Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            v0_1 = 0;
        }
        com.google.android.gms.internal.measurement.zzch.zza = v0_1;
        try {
            reflect.Method v3_0 = android.os.UserHandle.getDeclaredMethod("myUserId", 0);
        } catch (NoSuchMethodException) {
            if (!android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
            } else {
                android.util.Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        com.google.android.gms.internal.measurement.zzch.zzb = v3_0;
        return;
    }

    public static int zza(android.content.Context p3, android.app.job.JobInfo p4, String p5, String p6)
    {
        android.app.job.JobScheduler v5_2 = ((android.app.job.JobScheduler) p3.getSystemService("jobscheduler"));
        v5_2.getClass();
        if ((com.google.android.gms.internal.measurement.zzch.zza != null) && (p3.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0)) {
            reflect.InvocationTargetException v3_5;
            reflect.InvocationTargetException v3_1 = com.google.android.gms.internal.measurement.zzch.zzb;
            String v6_0 = 0;
            if (v3_1 == null) {
                v3_5 = 0;
            } else {
                try {
                    reflect.InvocationTargetException v3_3 = ((Integer) v3_1.invoke(android.os.UserHandle, 0));
                } catch (reflect.InvocationTargetException v3_4) {
                    if (!android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    } else {
                        android.util.Log.e("JobSchedulerCompat", "myUserId invocation illegal", v3_4);
                    }
                } catch (reflect.InvocationTargetException v3_4) {
                }
                if (v3_3 == null) {
                } else {
                    v3_5 = v3_3.intValue();
                }
            }
            reflect.Method v2 = com.google.android.gms.internal.measurement.zzch.zza;
            if (v2 == null) {
                v6_0 = v5_2.schedule(p4);
            } else {
                try {
                    reflect.InvocationTargetException v3_9 = ((Integer) v2.invoke(v5_2, new Object[] {p4, "com.google.android.gms", Integer.valueOf(v3_5), "UploadAlarm"})));
                } catch (reflect.InvocationTargetException v3_10) {
                    android.util.Log.e("UploadAlarm", "error calling scheduleAsPackage", v3_10);
                } catch (reflect.InvocationTargetException v3_10) {
                }
                if (v3_9 != null) {
                    v6_0 = v3_9.intValue();
                }
            }
            return v6_0;
        } else {
            return v5_2.schedule(p4);
        }
    }
}
