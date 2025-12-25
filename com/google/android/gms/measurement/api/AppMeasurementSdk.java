package com.google.android.gms.measurement.api;
public class AppMeasurementSdk {
    private final com.google.android.gms.internal.measurement.zzfb zza;

    public AppMeasurementSdk(com.google.android.gms.internal.measurement.zzfb p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context p1)
    {
        return com.google.android.gms.internal.measurement.zzfb.zza(p1, 0).zzb();
    }

    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context p0, String p1, String p2, String p3, android.os.Bundle p4)
    {
        return com.google.android.gms.internal.measurement.zzfb.zza(p0, p4).zzb();
    }

    public void beginAdUnitExposure(String p2)
    {
        this.zza.zzu(p2);
        return;
    }

    public void clearConditionalUserProperty(String p2, String p3, android.os.Bundle p4)
    {
        this.zza.zzm(p2, p3, p4);
        return;
    }

    public void endAdUnitExposure(String p2)
    {
        this.zza.zzv(p2);
        return;
    }

    public long generateEventId()
    {
        return this.zza.zzz();
    }

    public String getAppIdOrigin()
    {
        return this.zza.zzI();
    }

    public String getAppInstanceId()
    {
        return this.zza.zzy();
    }

    public java.util.List getConditionalUserProperties(String p2, String p3)
    {
        return this.zza.zzn(p2, p3);
    }

    public String getCurrentScreenClass()
    {
        return this.zza.zzB();
    }

    public String getCurrentScreenName()
    {
        return this.zza.zzA();
    }

    public String getGmpAppId()
    {
        return this.zza.zzx();
    }

    public int getMaxUserProperties(String p2)
    {
        return this.zza.zzF(p2);
    }

    public java.util.Map getUserProperties(String p2, String p3, boolean p4)
    {
        return this.zza.zzC(p2, p3, p4);
    }

    public void logEvent(String p2, String p3, android.os.Bundle p4)
    {
        this.zza.zzi(p2, p3, p4);
        return;
    }

    public void logEventNoInterceptor(String p7, String p8, android.os.Bundle p9, long p10)
    {
        this.zza.zzj(p7, p8, p9, p10);
        return;
    }

    public void performAction(android.os.Bundle p3)
    {
        this.zza.zzE(p3, 0);
        return;
    }

    public android.os.Bundle performActionWithResponse(android.os.Bundle p3)
    {
        return this.zza.zzE(p3, 1);
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener p2)
    {
        this.zza.zzf(p2);
        return;
    }

    public void setConditionalUserProperty(android.os.Bundle p2)
    {
        this.zza.zzl(p2);
        return;
    }

    public void setConsent(android.os.Bundle p1)
    {
        return;
    }

    public void setCurrentScreen(android.app.Activity p2, String p3, String p4)
    {
        this.zza.zzp(com.google.android.gms.internal.measurement.zzdf.zza(p2), p3, p4);
        return;
    }

    public void setEventInterceptor(com.google.android.gms.measurement.api.AppMeasurementSdk$EventInterceptor p2)
    {
        this.zza.zzd(p2);
        return;
    }

    public void setMeasurementEnabled(Boolean p1)
    {
        return;
    }

    public void setMeasurementEnabled(boolean p1)
    {
        return;
    }

    public void setUserProperty(String p3, String p4, Object p5)
    {
        this.zza.zzk(p3, p4, p5, 1);
        return;
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener p2)
    {
        this.zza.zzg(p2);
        return;
    }

    public final void zza(boolean p2)
    {
        this.zza.zzK(p2);
        return;
    }
}
