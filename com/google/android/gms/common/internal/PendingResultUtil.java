package com.google.android.gms.common.internal;
public class PendingResultUtil {
    private static final com.google.android.gms.common.internal.zas zaa;

    static PendingResultUtil()
    {
        com.google.android.gms.common.internal.PendingResultUtil.zaa = new com.google.android.gms.common.internal.zao();
        return;
    }

    public PendingResultUtil()
    {
        return;
    }

    public static com.google.android.gms.tasks.Task toResponseTask(com.google.android.gms.common.api.PendingResult p1, com.google.android.gms.common.api.Response p2)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(p1, new com.google.android.gms.common.internal.zaq(p2));
    }

    public static com.google.android.gms.tasks.Task toTask(com.google.android.gms.common.api.PendingResult p3, com.google.android.gms.common.internal.PendingResultUtil$ResultConverter p4)
    {
        com.google.android.gms.tasks.TaskCompletionSource v1_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        p3.addStatusListener(new com.google.android.gms.common.internal.zap(p3, v1_1, p4, com.google.android.gms.common.internal.PendingResultUtil.zaa));
        return v1_1.getTask();
    }

    public static com.google.android.gms.tasks.Task toVoidTask(com.google.android.gms.common.api.PendingResult p1)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(p1, new com.google.android.gms.common.internal.zar());
    }
}
