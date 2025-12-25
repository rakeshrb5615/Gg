package com.google.android.gms.internal.auth;
final class zzab extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.internal.auth.zzg {
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;
    private static final com.google.android.gms.common.logging.Logger zzd;
    private final android.content.Context zze;

    static zzab()
    {
        com.google.android.gms.common.logging.Logger v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.auth.zzab.zza = v0_1;
        com.google.android.gms.internal.auth.zzv v1_1 = new com.google.android.gms.internal.auth.zzv();
        com.google.android.gms.internal.auth.zzab.zzb = v1_1;
        com.google.android.gms.internal.auth.zzab.zzc = new com.google.android.gms.common.api.Api("GoogleAuthService.API", v1_1, v0_1);
        com.google.android.gms.internal.auth.zzab.zzd = com.google.android.gms.auth.zzd.zza(new String[] {"GoogleAuthServiceClient"}));
        return;
    }

    public zzab(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.auth.zzab.zzc, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        super.zze = p4;
        return;
    }

    public static bridge synthetic void zzf(com.google.android.gms.common.api.Status p0, Object p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        if (!com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(p0, p1, p2)) {
            Object[] v1_2 = new Object[0];
            com.google.android.gms.internal.auth.zzab.zzd.w("The task is already complete.", v1_2);
        }
        return;
    }

    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.auth.zzbw p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzj})).run(new com.google.android.gms.internal.auth.zzt(this, p3)).setMethodKey(1513).build());
    }

    public final com.google.android.gms.tasks.Task zzb(com.google.android.gms.auth.AccountChangeEventsRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "request cannot be null.");
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzi})).run(new com.google.android.gms.internal.auth.zzu(this, p3)).setMethodKey(1515).build());
    }

    public final com.google.android.gms.tasks.Task zzc(android.accounts.Account p3, String p4, android.os.Bundle p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Account name cannot be null!");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4, "Scope cannot be null!");
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzj})).run(new com.google.android.gms.internal.auth.zzs(this, p3, p4, p5)).setMethodKey(1512).build());
    }

    public final com.google.android.gms.tasks.Task zzd(android.accounts.Account p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "account cannot be null.");
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzi})).run(new com.google.android.gms.internal.auth.zzr(this, p3)).setMethodKey(1517).build());
    }

    public final com.google.android.gms.tasks.Task zze(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Client package name cannot be null!");
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzi})).run(new com.google.android.gms.internal.auth.zzq(this, p3)).setMethodKey(1514).build());
    }
}
