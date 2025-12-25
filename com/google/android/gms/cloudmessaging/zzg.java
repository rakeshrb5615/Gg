package com.google.android.gms.cloudmessaging;
public final synthetic class zzg implements java.lang.Runnable {
    public final synthetic android.content.Context zza;
    public final synthetic com.google.android.gms.cloudmessaging.CloudMessage zzb;
    public final synthetic java.util.concurrent.CountDownLatch zzc;

    public synthetic zzg(android.content.Context p1, com.google.android.gms.cloudmessaging.CloudMessage p2, java.util.concurrent.CountDownLatch p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void run()
    {
        com.google.android.gms.tasks.Task v0_5;
        com.google.android.gms.tasks.Task v0_0 = this.zzb;
        if (!android.text.TextUtils.isEmpty(v0_0.getMessageId())) {
            java.util.concurrent.CountDownLatch v1_4 = new android.os.Bundle();
            v1_4.putString("google.message_id", v0_0.getMessageId());
            com.google.android.gms.tasks.Task v0_1 = v0_0.zza();
            if (v0_1 != null) {
                v1_4.putInt("google.product_id", v0_1.intValue());
            }
            com.google.android.gms.tasks.Task v0_3 = this.zza;
            v1_4.putBoolean("supports_message_handled", 1);
            v0_5 = com.google.android.gms.cloudmessaging.zzv.zzb(v0_3).zzc(2, v1_4);
        } else {
            v0_5 = com.google.android.gms.tasks.Tasks.forResult(0);
        }
        v0_5.addOnCompleteListener(com.google.android.gms.cloudmessaging.zze.zza, new com.google.android.gms.cloudmessaging.zzf(this.zzc));
        return;
    }
}
