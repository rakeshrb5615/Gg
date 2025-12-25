package com.google.android.gms.location;
public class ActivityTransitionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zza;
    private android.os.Bundle zzb;

    static ActivityTransitionResult()
    {
        com.google.android.gms.location.ActivityTransitionResult.CREATOR = new com.google.android.gms.location.zzi();
        return;
    }

    public ActivityTransitionResult(java.util.List p8)
    {
        this.zzb = 0;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8, "transitionEvents list can\'t be null.");
        if (!p8.isEmpty()) {
            int v1 = 1;
            while (v1 < p8.size()) {
                int v2_5;
                String v4_0 = (v1 - 1);
                if (((com.google.android.gms.location.ActivityTransitionEvent) p8.get(v1)).getElapsedRealTimeNanos() < ((com.google.android.gms.location.ActivityTransitionEvent) p8.get(v4_0)).getElapsedRealTimeNanos()) {
                    v2_5 = 0;
                } else {
                    v2_5 = 1;
                }
                com.google.android.gms.common.internal.Preconditions.checkArgument(v2_5, "Transition out of order: ts1=%d, ts2=%d", new Object[] {Long.valueOf(((com.google.android.gms.location.ActivityTransitionEvent) p8.get(v1)).getElapsedRealTimeNanos()), Long.valueOf(((com.google.android.gms.location.ActivityTransitionEvent) p8.get(v4_0)).getElapsedRealTimeNanos())}));
                v1++;
            }
        }
        this.zza = java.util.Collections.unmodifiableList(p8);
        return;
    }

    public ActivityTransitionResult(java.util.List p1, android.os.Bundle p2)
    {
        this(p1);
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.location.ActivityTransitionResult extractResult(android.content.Intent p2)
    {
        if (com.google.android.gms.location.ActivityTransitionResult.hasResult(p2)) {
            return ((com.google.android.gms.location.ActivityTransitionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p2, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", com.google.android.gms.location.ActivityTransitionResult.CREATOR));
        } else {
            return 0;
        }
    }

    public static boolean hasResult(android.content.Intent p1)
    {
        if (p1) {
            return p1.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
        } else {
            return 0;
        }
    }

    public boolean equals(Object p3)
    {
        if (this != p3) {
            if ((p3) && (this.getClass() == p3.getClass())) {
                return this.zza.equals(((com.google.android.gms.location.ActivityTransitionResult) p3).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public java.util.List getTransitionEvents()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return this.zza.hashCode();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, this.getTransitionEvents(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
