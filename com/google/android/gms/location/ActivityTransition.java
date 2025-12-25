package com.google.android.gms.location;
public class ActivityTransition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final int zzb;

    static ActivityTransition()
    {
        com.google.android.gms.location.ActivityTransition.CREATOR = new com.google.android.gms.location.zze();
        return;
    }

    public ActivityTransition(int p1, int p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static void zza(int p3)
    {
        String v0 = 0;
        if ((p3 >= null) && (p3 <= 1)) {
            v0 = 1;
        }
        StringBuilder v2_0 = new StringBuilder((String.valueOf(p3).length() + 30));
        v2_0.append("Transition type ");
        v2_0.append(p3);
        v2_0.append(" is not valid.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, v2_0.toString());
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.location.ActivityTransition)) {
                if ((this.zza != ((com.google.android.gms.location.ActivityTransition) p5).zza) || (this.zzb != ((com.google.android.gms.location.ActivityTransition) p5).zzb)) {
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

    public int getTransitionType()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), Integer.valueOf(this.zzb)}));
    }

    public String toString()
    {
        String v0_0 = this.zza;
        int v2 = this.zzb;
        StringBuilder v3_1 = new StringBuilder((((String.valueOf(v0_0).length() + 52) + String.valueOf(v2).length()) + 1));
        v3_1.append("ActivityTransition [mActivityType=");
        v3_1.append(v0_0);
        v3_1.append(", mTransitionType=");
        v3_1.append(v2);
        v3_1.append("]");
        return v3_1.toString();
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, this.getActivityType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 2, this.getTransitionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
