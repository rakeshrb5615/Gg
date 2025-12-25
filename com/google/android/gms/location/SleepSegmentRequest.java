package com.google.android.gms.location;
public class SleepSegmentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;
    private final java.util.List zza;
    private final int zzb;

    static SleepSegmentRequest()
    {
        com.google.android.gms.location.SleepSegmentRequest.CREATOR = new com.google.android.gms.location.zzaq();
        return;
    }

    public SleepSegmentRequest(int p2)
    {
        this(0, p2);
        return;
    }

    public SleepSegmentRequest(java.util.List p1, int p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.location.SleepSegmentRequest getDefaultSleepSegmentRequest()
    {
        return new com.google.android.gms.location.SleepSegmentRequest(0, 0);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.location.SleepSegmentRequest)) {
                if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.location.SleepSegmentRequest) p5).zza)) || (this.zzb != ((com.google.android.gms.location.SleepSegmentRequest) p5).zzb)) {
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

    public int getRequestedDataType()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, Integer.valueOf(this.zzb)}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getRequestedDataType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
