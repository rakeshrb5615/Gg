package com.google.android.gms.location;
public class SleepClassifyEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final boolean zzh;
    private final int zzi;

    static SleepClassifyEvent()
    {
        com.google.android.gms.location.SleepClassifyEvent.CREATOR = new com.google.android.gms.location.zzao();
        return;
    }

    public SleepClassifyEvent(int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, int p9)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        this.zzh = p8;
        this.zzi = p9;
        return;
    }

    public static java.util.List extractEvents(android.content.Intent p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        if (com.google.android.gms.location.SleepClassifyEvent.hasEvents(p5)) {
            java.util.List v5_5 = ((java.util.ArrayList) p5.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT"));
            if (v5_5 != null) {
                java.util.ArrayList v0_0 = new java.util.ArrayList(v5_5.size());
                int v1_1 = v5_5.size();
                int v2 = 0;
                while (v2 < v1_1) {
                    com.google.android.gms.location.SleepClassifyEvent v3_1 = ((byte[]) v5_5.get(v2));
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_1);
                    v0_0.add(((com.google.android.gms.location.SleepClassifyEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(v3_1, com.google.android.gms.location.SleepClassifyEvent.CREATOR)));
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
            return p1.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        } else {
            return 0;
        }
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.location.SleepClassifyEvent)) {
                if ((this.zza != ((com.google.android.gms.location.SleepClassifyEvent) p5).zza) || (this.zzb != ((com.google.android.gms.location.SleepClassifyEvent) p5).zzb)) {
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

    public int getConfidence()
    {
        return this.zzb;
    }

    public int getLight()
    {
        return this.zzd;
    }

    public int getMotion()
    {
        return this.zzc;
    }

    public long getTimestampMillis()
    {
        return (((long) this.zza) * 1000);
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), Integer.valueOf(this.zzb)}));
    }

    public String toString()
    {
        String v0_0 = this.zza;
        int v2 = this.zzb;
        int v4 = this.zzc;
        int v6 = this.zzd;
        StringBuilder v3_1 = new StringBuilder(((((((String.valueOf(v0_0).length() + 6) + String.valueOf(v2).length()) + 8) + String.valueOf(v4).length()) + 7) + String.valueOf(v6).length()));
        v3_1.append(v0_0);
        v3_1.append(" Conf:");
        v3_1.append(v2);
        v3_1.append(" Motion:");
        v3_1.append(v4);
        v3_1.append(" Light:");
        v3_1.append(v6);
        return v3_1.toString();
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        int v4_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, v4_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 2, this.getConfidence());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 3, this.getMotion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 4, this.getLight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, v0);
        return;
    }
}
