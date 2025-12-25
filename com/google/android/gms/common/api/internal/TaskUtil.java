package com.google.android.gms.common.api.internal;
public class TaskUtil {

    public TaskUtil()
    {
        return;
    }

    public static void setResultOrApiException(com.google.android.gms.common.api.Status p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p1, 0, p2);
        return;
    }

    public static void setResultOrApiException(com.google.android.gms.common.api.Status p1, Object p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        if (!p1.isSuccess()) {
            p3.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(p1));
            return;
        } else {
            p3.setResult(p2);
            return;
        }
    }

    public static com.google.android.gms.tasks.Task toVoidTaskThatFailsOnFalse(com.google.android.gms.tasks.Task p1)
    {
        return p1.continueWith(new com.google.android.gms.common.api.internal.zacx());
    }

    public static boolean trySetResultOrApiException(com.google.android.gms.common.api.Status p1, Object p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        if (!p1.isSuccess()) {
            return p3.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(p1));
        } else {
            return p3.trySetResult(p2);
        }
    }
}
