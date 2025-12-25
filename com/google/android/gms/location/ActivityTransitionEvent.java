package com.google.android.gms.location;
public class ActivityTransitionEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final long zzc;

    static ActivityTransitionEvent()
    {
        com.google.android.gms.location.ActivityTransitionEvent.CREATOR = new com.google.android.gms.location.zzf();
        return;
    }

    public ActivityTransitionEvent(int p1, int p2, long p3)
    {
        com.google.android.gms.location.ActivityTransition.zza(p2);
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.gms.location.ActivityTransitionEvent)) {
                if ((this.zza != ((com.google.android.gms.location.ActivityTransitionEvent) p8).zza) || ((this.zzb != ((com.google.android.gms.location.ActivityTransitionEvent) p8).zzb) || (this.zzc != ((com.google.android.gms.location.ActivityTransitionEvent) p8).zzc))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int getActivityType()
    {
        return this.zza;
    }

    public long getElapsedRealTimeNanos()
    {
        return this.zzc;
    }

    public int getTransitionType()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc)}));
    }

    public String toString()
    {
        String v0_1 = new StringBuilder();
        String v1_2 = this.zza;
        String v3_9 = new StringBuilder((String.valueOf(v1_2).length() + 13));
        v3_9.append("ActivityType ");
        v3_9.append(v1_2);
        v0_1.append(v3_9.toString());
        v0_1.append(" ");
        String v2_1 = this.zzb;
        StringBuilder v4_1 = new StringBuilder((String.valueOf(v2_1).length() + 15));
        v4_1.append("TransitionType ");
        v4_1.append(v2_1);
        v0_1.append(v4_1.toString());
        v0_1.append(" ");
        String v1_3 = this.zzc;
        StringBuilder v4_3 = new StringBuilder((String.valueOf(v1_3).length() + 21));
        v4_3.append("ElapsedRealTimeNanos ");
        v4_3.append(v1_3);
        v0_1.append(v4_3.toString());
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.getActivityType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getTransitionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 3, this.getElapsedRealTimeNanos());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
