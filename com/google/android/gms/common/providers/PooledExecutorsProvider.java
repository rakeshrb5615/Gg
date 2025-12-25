package com.google.android.gms.common.providers;
public class PooledExecutorsProvider {
    private static com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory zza;

    private PooledExecutorsProvider()
    {
        return;
    }

    public static declared_synchronized com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory getInstance()
    {
        if (com.google.android.gms.common.providers.PooledExecutorsProvider.zza == null) {
            com.google.android.gms.common.providers.PooledExecutorsProvider.zza = new com.google.android.gms.common.providers.zza();
        }
        return com.google.android.gms.common.providers.PooledExecutorsProvider.zza;
    }
}
