package com.google.android.gms.internal.auth;
final class zzbn extends com.google.android.gms.internal.auth.zzbd {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzbn(com.google.android.gms.internal.auth.zzbo p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzc(String p3)
    {
        com.google.android.gms.common.api.Status v0_1;
        if (p3 == null) {
            v0_1 = new com.google.android.gms.common.api.Status(3006);
        } else {
            v0_1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(v0_1, p3, this.zza);
        return;
    }
}
