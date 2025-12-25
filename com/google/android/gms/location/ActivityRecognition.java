package com.google.android.gms.location;
public class ActivityRecognition {
    public static final com.google.android.gms.common.api.Api API;
    public static final com.google.android.gms.location.ActivityRecognitionApi ActivityRecognitionApi;

    static ActivityRecognition()
    {
        com.google.android.gms.location.ActivityRecognition.API = com.google.android.gms.internal.location.zzaj.zzb;
        com.google.android.gms.location.ActivityRecognition.ActivityRecognitionApi = new com.google.android.gms.internal.location.zzaf();
        return;
    }

    private ActivityRecognition()
    {
        return;
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.location.zzaj(p1);
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.location.zzaj(p1);
    }
}
