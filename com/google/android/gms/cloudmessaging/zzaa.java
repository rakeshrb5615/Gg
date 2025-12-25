package com.google.android.gms.cloudmessaging;
public final synthetic class zzaa implements com.google.android.gms.tasks.Continuation {
    public static final synthetic com.google.android.gms.cloudmessaging.zzaa zza;

    static synthetic zzaa()
    {
        com.google.android.gms.cloudmessaging.zzaa.zza = new com.google.android.gms.cloudmessaging.zzaa();
        return;
    }

    private synthetic zzaa()
    {
        return;
    }

    public final Object then(com.google.android.gms.tasks.Task p4)
    {
        if (!p4.isSuccessful()) {
            if (android.util.Log.isLoggable("Rpc", 3)) {
                android.util.Log.d("Rpc", "Error making request: ".concat(String.valueOf(p4.getException())));
            }
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", p4.getException());
        } else {
            return ((android.os.Bundle) p4.getResult());
        }
    }
}
