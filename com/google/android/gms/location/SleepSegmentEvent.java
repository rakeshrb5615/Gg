package com.google.android.gms.location;
public class SleepSegmentEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL;
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static SleepSegmentEvent()
    {
        com.google.android.gms.location.SleepSegmentEvent.CREATOR = new com.google.android.gms.location.zzap();
        return;
    }

    public SleepSegmentEvent(long p3, long p5, int p7, int p8, int p9)
    {
        int v0_1;
        if (p3 > p5) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = p3;
        this.zzb = p5;
        this.zzc = p7;
        this.zzd = p8;
        this.zze = p9;
        return;
    }

    public static java.util.List extractEvents(android.content.Intent p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (com.google.android.gms.location.SleepSegmentEvent.hasEvents(p5)) {
            java.util.List v5_5 = ((java.util.ArrayList) p5.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT"));
            if (v5_5 != null) {
                java.util.ArrayList v0_0 = new java.util.ArrayList(v5_5.size());
                int v1_1 = v5_5.size();
                int v2 = 0;
                while (v2 < v1_1) {
                    com.google.android.gms.location.SleepSegmentEvent v3_1 = ((byte[]) v5_5.get(v2));
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_1);
                    v0_0.add(((com.google.android.gms.location.SleepSegmentEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(v3_1, com.google.android.gms.location.SleepSegmentEvent.CREATOR)));
                    v2++;
                }
                return java.util.Collections.unmodifiableList(v0_0);
            } else {
                return java.util.Collections.EMPTY_LIST;
            }
        } else {
            return java.util.Collections.EMPTY_LIST;
        }
    }

    public static boolean hasEvents(android.content.Intent p1)
    {
        if (p1) {
            return p1.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        } else {
            return 0;
        }
    }

    public boolean equals(Object p7)
    {
        if ((!(p7 instanceof com.google.android.gms.location.SleepSegmentEvent)) || ((this.zza != ((com.google.android.gms.location.SleepSegmentEvent) p7).getStartTimeMillis()) || ((this.zzb != ((com.google.android.gms.location.SleepSegmentEvent) p7).getEndTimeMillis()) || ((this.zzc != ((com.google.android.gms.location.SleepSegmentEvent) p7).getStatus()) || ((this.zzd != ((com.google.android.gms.location.SleepSegmentEvent) p7).zzd) || (this.zze != ((com.google.android.gms.location.SleepSegmentEvent) p7).zze)))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public long getEndTimeMillis()
    {
        return this.zzb;
    }

    public long getSegmentDurationMillis()
    {
        return (this.zzb - this.zza);
    }

    public long getStartTimeMillis()
    {
        return this.zza;
    }

    public int getStatus()
    {
        return this.zzc;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)}));
    }

    public String toString()
    {
        String v0_0 = this.zza;
        long v3 = this.zzb;
        int v6 = this.zzc;
        StringBuilder v5_1 = new StringBuilder(((((String.valueOf(v0_0).length() + 24) + String.valueOf(v3).length()) + 9) + String.valueOf(v6).length()));
        v5_1.append("startMillis=");
        v5_1.append(v0_0);
        v5_1.append(", endMillis=");
        v5_1.append(v3);
        v5_1.append(", status=");
        v5_1.append(v6);
        return v5_1.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 1, this.getStartTimeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.getEndTimeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 3, this.getStatus());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
