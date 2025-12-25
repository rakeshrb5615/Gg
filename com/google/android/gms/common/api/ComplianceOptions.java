package com.google.android.gms.common.api;
public final class ComplianceOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.common.api.ComplianceOptions zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;

    static ComplianceOptions()
    {
        com.google.android.gms.common.api.zzc v0_0 = com.google.android.gms.common.api.ComplianceOptions.newBuilder();
        v0_0.setCallerProductId(-1);
        v0_0.setDataOwnerProductId(-1);
        v0_0.setProcessingReason(0);
        v0_0.setIsUserData(1);
        com.google.android.gms.common.api.ComplianceOptions.zza = v0_0.build();
        com.google.android.gms.common.api.ComplianceOptions.CREATOR = new com.google.android.gms.common.api.zzc();
        return;
    }

    public ComplianceOptions(int p1, int p2, int p3, boolean p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p4;
        return;
    }

    public static com.google.android.gms.common.api.ComplianceOptions$Builder newBuilder()
    {
        return new com.google.android.gms.common.api.ComplianceOptions$Builder();
    }

    public static final com.google.android.gms.common.api.ComplianceOptions$Builder newBuilder(android.content.Context p0)
    {
        return com.google.android.gms.common.api.ComplianceOptions.newBuilder();
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.common.api.ComplianceOptions)) {
            if ((this.zzb != ((com.google.android.gms.common.api.ComplianceOptions) p4).zzb) || ((this.zzc != ((com.google.android.gms.common.api.ComplianceOptions) p4).zzc) || ((this.zzd != ((com.google.android.gms.common.api.ComplianceOptions) p4).zzd) || (this.zze != ((com.google.android.gms.common.api.ComplianceOptions) p4).zze)))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze)}));
    }

    public com.google.android.gms.common.api.ComplianceOptions$Builder toBuilder()
    {
        com.google.android.gms.common.api.ComplianceOptions$Builder v0_1 = new com.google.android.gms.common.api.ComplianceOptions$Builder();
        v0_1.setCallerProductId(this.zzb);
        v0_1.setDataOwnerProductId(this.zzc);
        v0_1.setProcessingReason(this.zzd);
        v0_1.setIsUserData(this.zze);
        return v0_1;
    }

    public final String toString()
    {
        String v0_0 = this.zzb;
        int v2 = this.zzc;
        int v4 = this.zzd;
        boolean v6 = this.zze;
        StringBuilder v3_1 = new StringBuilder((((((((String.valueOf(v0_0).length() + 55) + String.valueOf(v2).length()) + 19) + String.valueOf(v4).length()) + 13) + String.valueOf(v6).length()) + 1));
        v3_1.append("ComplianceOptions{callerProductId=");
        v3_1.append(v0_0);
        v3_1.append(", dataOwnerProductId=");
        v3_1.append(v2);
        v3_1.append(", processingReason=");
        v3_1.append(v4);
        v3_1.append(", isUserData=");
        v3_1.append(v6);
        v3_1.append("}");
        return v3_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        int v4_0 = this.zzb;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, v4_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 4, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, v0);
        return;
    }
}
