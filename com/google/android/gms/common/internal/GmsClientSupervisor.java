package com.google.android.gms.common.internal;
public abstract class GmsClientSupervisor {
    static android.os.HandlerThread zza = None;
    private static final Object zzb = None;
    private static int zzc = 9;
    private static com.google.android.gms.common.internal.zzq zzd = None;
    private static java.util.concurrent.Executor zze = None;
    private static boolean zzf = False;

    static GmsClientSupervisor()
    {
        com.google.android.gms.common.internal.GmsClientSupervisor.zzb = new Object();
        return;
    }

    public GmsClientSupervisor()
    {
        return;
    }

    public static int getDefaultBindFlags()
    {
        return 4225;
    }

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context p4)
    {
        if (com.google.android.gms.common.internal.GmsClientSupervisor.zzd == null) {
            android.os.Looper v4_2;
            android.content.Context v2 = p4.getApplicationContext();
            if (!com.google.android.gms.common.internal.GmsClientSupervisor.zzf) {
                v4_2 = p4.getMainLooper();
            } else {
                v4_2 = com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread().getLooper();
            }
            com.google.android.gms.common.internal.GmsClientSupervisor.zzd = new com.google.android.gms.common.internal.zzq(v2, v4_2, com.google.android.gms.common.internal.GmsClientSupervisor.zze);
        }
        return com.google.android.gms.common.internal.GmsClientSupervisor.zzd;
    }

    public static android.os.HandlerThread getOrStartHandlerThread()
    {
        android.os.HandlerThread v1_0 = com.google.android.gms.common.internal.GmsClientSupervisor.zza;
        if (v1_0 == null) {
            android.os.HandlerThread v1_3 = new android.os.HandlerThread("GoogleApiHandler", com.google.android.gms.common.internal.GmsClientSupervisor.zzc);
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = v1_3;
            v1_3.start();
            return com.google.android.gms.common.internal.GmsClientSupervisor.zza;
        } else {
            return v1_0;
        }
    }

    public static android.os.HandlerThread getOrStartHandlerThread(int p3)
    {
        android.os.HandlerThread v1_0 = com.google.android.gms.common.internal.GmsClientSupervisor.zza;
        if (v1_0 == null) {
            android.os.HandlerThread v1_2 = new android.os.HandlerThread("GoogleApiHandler", p3);
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = v1_2;
            v1_2.start();
            return com.google.android.gms.common.internal.GmsClientSupervisor.zza;
        } else {
            return v1_0;
        }
    }

    public static void setDefaultBindExecutor(java.util.concurrent.Executor p2)
    {
        com.google.android.gms.common.internal.zzq v1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd;
        if (v1 != null) {
            v1.zze(p2);
        }
        com.google.android.gms.common.internal.GmsClientSupervisor.zze = p2;
        return;
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int p2)
    {
        if (com.google.android.gms.common.internal.GmsClientSupervisor.zza != null) {
            return 0;
        } else {
            com.google.android.gms.common.internal.GmsClientSupervisor.zzc = p2;
            return 1;
        }
    }

    public static void setUseHandlerThreadForCallbacks()
    {
        int v1_0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd;
        if ((v1_0 != 0) && (!com.google.android.gms.common.internal.GmsClientSupervisor.zzf)) {
            v1_0.zzd(com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread().getLooper());
        }
        com.google.android.gms.common.internal.GmsClientSupervisor.zzf = 1;
        return;
    }

    public boolean bindService(android.content.ComponentName p3, android.content.ServiceConnection p4, String p5)
    {
        return this.zza(new com.google.android.gms.common.internal.zzn(p3, 4225), p4, p5, 0).isSuccess();
    }

    public boolean bindService(android.content.ComponentName p3, android.content.ServiceConnection p4, String p5, java.util.concurrent.Executor p6)
    {
        return this.zza(new com.google.android.gms.common.internal.zzn(p3, 4225), p4, p5, p6).isSuccess();
    }

    public boolean bindService(String p4, android.content.ServiceConnection p5, String p6)
    {
        return this.zza(new com.google.android.gms.common.internal.zzn(p4, 4225, 0), p5, p6, 0).isSuccess();
    }

    public void unbindService(android.content.ComponentName p3, android.content.ServiceConnection p4, String p5)
    {
        this.zzc(new com.google.android.gms.common.internal.zzn(p3, 4225), p4, p5);
        return;
    }

    public void unbindService(String p4, android.content.ServiceConnection p5, String p6)
    {
        this.zzc(new com.google.android.gms.common.internal.zzn(p4, 4225, 0), p5, p6);
        return;
    }

    public abstract com.google.android.gms.common.ConnectionResult zza();

    public final void zzb(String p2, String p3, int p4, android.content.ServiceConnection p5, String p6, boolean p7)
    {
        this.zzc(new com.google.android.gms.common.internal.zzn(p2, p3, 4225, p7), p5, p6);
        return;
    }

    public abstract void zzc();
}
