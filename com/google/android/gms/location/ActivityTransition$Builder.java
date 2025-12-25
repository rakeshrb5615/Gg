package com.google.android.gms.location;
public class ActivityTransition$Builder {
    private int zza;
    private int zzb;

    public ActivityTransition$Builder()
    {
        this.zza = -1;
        this.zzb = -1;
        return;
    }

    public com.google.android.gms.location.ActivityTransition build()
    {
        com.google.android.gms.location.ActivityTransition v0_4;
        int v1_0 = 0;
        if (this.zza == -1) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v0_4, "Activity type not set.");
        if (this.zzb != -1) {
            v1_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v1_0, "Activity transition type not set.");
        return new com.google.android.gms.location.ActivityTransition(this.zza, this.zzb);
    }

    public com.google.android.gms.location.ActivityTransition$Builder setActivityTransition(int p1)
    {
        com.google.android.gms.location.ActivityTransition.zza(p1);
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.location.ActivityTransition$Builder setActivityType(int p1)
    {
        this.zza = p1;
        return this;
    }
}
