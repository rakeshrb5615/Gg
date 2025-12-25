package com.google.android.gms.location;
public class ActivityTransitionRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final java.util.Comparator IS_SAME_TRANSITION;
    private final java.util.List zza;
    private final String zzb;
    private final java.util.List zzc;
    private String zzd;

    static ActivityTransitionRequest()
    {
        com.google.android.gms.location.ActivityTransitionRequest.CREATOR = new com.google.android.gms.location.zzh();
        com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION = new com.google.android.gms.location.zzg();
        return;
    }

    public ActivityTransitionRequest(java.util.List p2)
    {
        this(p2, 0, 0, 0);
        return;
    }

    public ActivityTransitionRequest(java.util.List p6, String p7, java.util.List p8, String p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "transitions can\'t be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument((p6.isEmpty() ^ 1), "transitions can\'t be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        java.util.TreeSet v0_1 = new java.util.TreeSet(com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION);
        java.util.Iterator v1_1 = p6.iterator();
        while (v1_1.hasNext()) {
            String v2_2 = ((com.google.android.gms.location.ActivityTransition) v1_1.next());
            com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1.add(v2_2), String.format("Found duplicated transition: %s.", new Object[] {v2_2})));
        }
        java.util.List v6_2;
        this.zza = java.util.Collections.unmodifiableList(p6);
        this.zzb = p7;
        if (p8 != null) {
            v6_2 = java.util.Collections.unmodifiableList(p8);
        } else {
            v6_2 = java.util.Collections.EMPTY_LIST;
        }
        this.zzc = v6_2;
        this.zzd = p9;
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((!p5) || ((this.getClass() != p5.getClass()) || ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.location.ActivityTransitionRequest) p5).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.location.ActivityTransitionRequest) p5).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.location.ActivityTransitionRequest) p5).zzd)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.location.ActivityTransitionRequest) p5).zzc))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        String v1_4;
        int v0_7 = (this.zza.hashCode() * 31);
        String v1_3 = this.zzb;
        int v2 = 0;
        if (v1_3 == null) {
            v1_4 = 0;
        } else {
            v1_4 = v1_3.hashCode();
        }
        String v1_1;
        int v0_2 = ((v0_7 + v1_4) * 31);
        String v1_0 = this.zzc;
        if (v1_0 == null) {
            v1_1 = 0;
        } else {
            v1_1 = v1_0.hashCode();
        }
        int v0_4 = ((v0_2 + v1_1) * 31);
        String v1_2 = this.zzd;
        if (v1_2 != null) {
            v2 = v1_2.hashCode();
        }
        return (v0_4 + v2);
    }

    public void serializeToIntentExtra(android.content.Intent p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this, p2, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
        return;
    }

    public String toString()
    {
        String v0_0 = this.zzc;
        String v1_1 = String.valueOf(this.zza);
        String v0_4 = String.valueOf(v0_0);
        String v2 = this.zzd;
        String v4 = this.zzb;
        StringBuilder v5_3 = new StringBuilder((((((((v1_1.length() + 48) + String.valueOf(v4).length()) + 12) + v0_4.length()) + 18) + String.valueOf(v2).length()) + 1));
        v5_3.append("ActivityTransitionRequest [mTransitions=");
        v5_3.append(v1_1);
        v5_3.append(", mTag=\'");
        v5_3.append(v4);
        v5_3.append("\', mClients=");
        v5_3.append(v0_4);
        v5_3.append(", mAttributionTag=");
        v5_3.append(v2);
        v5_3.append("]");
        return v5_3.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }

    public final com.google.android.gms.location.ActivityTransitionRequest zza(String p1)
    {
        this.zzd = p1;
        return this;
    }
}
