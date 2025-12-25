package com.google.android.recaptcha.internal;
final class zzar extends kotlin.jvm.internal.k implements u7.l {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;
    final synthetic d8.i0 zzb;

    public zzar(com.google.android.gms.tasks.TaskCompletionSource p1, d8.i0 p2)
    {
        this.zza = p1;
        this.zzb = p2;
        super(1);
        return;
    }

    public final bridge synthetic Object invoke(Object p3)
    {
        if (!(((Throwable) p3) instanceof java.util.concurrent.CancellationException)) {
            com.google.android.gms.tasks.TaskCompletionSource v3_6 = this.zzb.getCompletionExceptionOrNull();
            if (v3_6 != null) {
                com.google.android.gms.tasks.RuntimeExecutionException v1_0;
                com.google.android.gms.tasks.TaskCompletionSource v0_4 = this.zza;
                if (!(v3_6 instanceof Exception)) {
                    v1_0 = 0;
                } else {
                    v1_0 = ((Exception) v3_6);
                }
                if (v1_0 == null) {
                    v1_0 = new com.google.android.gms.tasks.RuntimeExecutionException(v3_6);
                }
                v0_4.setException(v1_0);
            } else {
                this.zza.setResult(this.zzb.getCompleted());
            }
        } else {
            this.zza.setException(((Exception) ((Throwable) p3)));
        }
        return h7.l.a;
    }
}
