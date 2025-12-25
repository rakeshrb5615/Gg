package com.google.android.gms.tasks;
public final class Tasks {

    private Tasks()
    {
        return;
    }

    public static Object await(com.google.android.gms.tasks.Task p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread();
        com.google.android.gms.common.internal.Preconditions.checkNotGoogleApiHandlerThread();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Task must not be null");
        if (!p2.isComplete()) {
            com.google.android.gms.tasks.zzad v0_3 = new com.google.android.gms.tasks.zzad(0);
            com.google.android.gms.tasks.Tasks.zzb(p2, v0_3);
            v0_3.zza();
            return com.google.android.gms.tasks.Tasks.zza(p2);
        } else {
            return com.google.android.gms.tasks.Tasks.zza(p2);
        }
    }

    public static Object await(com.google.android.gms.tasks.Task p2, long p3, java.util.concurrent.TimeUnit p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread();
        com.google.android.gms.common.internal.Preconditions.checkNotGoogleApiHandlerThread();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Task must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "TimeUnit must not be null");
        if (!p2.isComplete()) {
            com.google.android.gms.tasks.zzad v0_0 = new com.google.android.gms.tasks.zzad(0);
            com.google.android.gms.tasks.Tasks.zzb(p2, v0_0);
            if (!v0_0.zzb(p3, p5)) {
                throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
            } else {
                return com.google.android.gms.tasks.Tasks.zza(p2);
            }
        } else {
            return com.google.android.gms.tasks.Tasks.zza(p2);
        }
    }

    public static com.google.android.gms.tasks.Task call(java.util.concurrent.Callable p1)
    {
        return com.google.android.gms.tasks.Tasks.call(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p1);
    }

    public static com.google.android.gms.tasks.Task call(java.util.concurrent.Executor p2, java.util.concurrent.Callable p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Callback must not be null");
        com.google.android.gms.tasks.zzw v0_3 = new com.google.android.gms.tasks.zzw();
        p2.execute(new com.google.android.gms.tasks.zzz(v0_3, p3));
        return v0_3;
    }

    public static com.google.android.gms.tasks.Task forCanceled()
    {
        com.google.android.gms.tasks.zzw v0_1 = new com.google.android.gms.tasks.zzw();
        v0_1.zzc();
        return v0_1;
    }

    public static com.google.android.gms.tasks.Task forException(Exception p1)
    {
        com.google.android.gms.tasks.zzw v0_1 = new com.google.android.gms.tasks.zzw();
        v0_1.zza(p1);
        return v0_1;
    }

    public static com.google.android.gms.tasks.Task forResult(Object p1)
    {
        com.google.android.gms.tasks.zzw v0_1 = new com.google.android.gms.tasks.zzw();
        v0_1.zzb(p1);
        return v0_1;
    }

    public static com.google.android.gms.tasks.Task whenAll(java.util.Collection p3)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            String v0_3 = p3.iterator();
            while (v0_3.hasNext()) {
                if (((com.google.android.gms.tasks.Task) v0_3.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            String v0_0 = new com.google.android.gms.tasks.zzw();
            com.google.android.gms.tasks.zzaf v1_1 = new com.google.android.gms.tasks.zzaf(p3.size(), v0_0);
            NullPointerException v3_1 = p3.iterator();
            while (v3_1.hasNext()) {
                com.google.android.gms.tasks.Tasks.zzb(((com.google.android.gms.tasks.Task) v3_1.next()), v1_1);
            }
            return v0_0;
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public static varargs com.google.android.gms.tasks.Task whenAll(com.google.android.gms.tasks.Task[] p1)
    {
        if ((p1 != null) && (p1.length != 0)) {
            return com.google.android.gms.tasks.Tasks.whenAll(java.util.Arrays.asList(p1));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public static com.google.android.gms.tasks.Task whenAllComplete(java.util.Collection p1)
    {
        return com.google.android.gms.tasks.Tasks.whenAllComplete(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p1);
    }

    public static com.google.android.gms.tasks.Task whenAllComplete(java.util.concurrent.Executor p2, java.util.Collection p3)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            return com.google.android.gms.tasks.Tasks.whenAll(p3).continueWithTask(p2, new com.google.android.gms.tasks.zzab(p3));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(java.util.Collections.EMPTY_LIST);
        }
    }

    public static varargs com.google.android.gms.tasks.Task whenAllComplete(java.util.concurrent.Executor p1, com.google.android.gms.tasks.Task[] p2)
    {
        if ((p2 != null) && (p2.length != 0)) {
            return com.google.android.gms.tasks.Tasks.whenAllComplete(p1, java.util.Arrays.asList(p2));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(java.util.Collections.EMPTY_LIST);
        }
    }

    public static varargs com.google.android.gms.tasks.Task whenAllComplete(com.google.android.gms.tasks.Task[] p1)
    {
        if ((p1 != null) && (p1.length != 0)) {
            return com.google.android.gms.tasks.Tasks.whenAllComplete(java.util.Arrays.asList(p1));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(java.util.Collections.EMPTY_LIST);
        }
    }

    public static com.google.android.gms.tasks.Task whenAllSuccess(java.util.Collection p1)
    {
        return com.google.android.gms.tasks.Tasks.whenAllSuccess(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, p1);
    }

    public static com.google.android.gms.tasks.Task whenAllSuccess(java.util.concurrent.Executor p2, java.util.Collection p3)
    {
        if ((p3 != null) && (!p3.isEmpty())) {
            return com.google.android.gms.tasks.Tasks.whenAll(p3).continueWith(p2, new com.google.android.gms.tasks.zzaa(p3));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(java.util.Collections.EMPTY_LIST);
        }
    }

    public static varargs com.google.android.gms.tasks.Task whenAllSuccess(java.util.concurrent.Executor p1, com.google.android.gms.tasks.Task[] p2)
    {
        if ((p2 != null) && (p2.length != 0)) {
            return com.google.android.gms.tasks.Tasks.whenAllSuccess(p1, java.util.Arrays.asList(p2));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(java.util.Collections.EMPTY_LIST);
        }
    }

    public static varargs com.google.android.gms.tasks.Task whenAllSuccess(com.google.android.gms.tasks.Task[] p1)
    {
        if ((p1 != null) && (p1.length != 0)) {
            return com.google.android.gms.tasks.Tasks.whenAllSuccess(java.util.Arrays.asList(p1));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(java.util.Collections.EMPTY_LIST);
        }
    }

    public static com.google.android.gms.tasks.Task withTimeout(com.google.android.gms.tasks.Task p4, long p5, java.util.concurrent.TimeUnit p7)
    {
        com.google.android.gms.tasks.zzb v0_5;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Task must not be null");
        if (p5 <= 0) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_5, "Timeout must be positive");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7, "TimeUnit must not be null");
        com.google.android.gms.tasks.zzb v0_2 = new com.google.android.gms.tasks.zzb();
        com.google.android.gms.tasks.TaskCompletionSource v1_1 = new com.google.android.gms.tasks.TaskCompletionSource(v0_2);
        com.google.android.gms.internal.tasks.zza v2_1 = new com.google.android.gms.internal.tasks.zza(android.os.Looper.getMainLooper());
        v2_1.postDelayed(new com.google.android.gms.tasks.zzx(v1_1), p7.toMillis(p5));
        p4.addOnCompleteListener(new com.google.android.gms.tasks.zzy(v2_1, v1_1, v0_2));
        return v1_1.getTask();
    }

    private static Object zza(com.google.android.gms.tasks.Task p1)
    {
        if (!p1.isSuccessful()) {
            if (!p1.isCanceled()) {
                throw new java.util.concurrent.ExecutionException(p1.getException());
            } else {
                throw new java.util.concurrent.CancellationException("Task is already canceled");
            }
        } else {
            return p1.getResult();
        }
    }

    private static void zzb(com.google.android.gms.tasks.Task p1, com.google.android.gms.tasks.zzae p2)
    {
        java.util.concurrent.Executor v0 = com.google.android.gms.tasks.TaskExecutors.zza;
        p1.addOnSuccessListener(v0, p2);
        p1.addOnFailureListener(v0, p2);
        p1.addOnCanceledListener(v0, p2);
        return;
    }
}
