package com.google.android.gms.common.api;
public final class ApiMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.common.api.ApiMetadata zza;
    private static final com.google.android.gms.common.api.ApiMetadata zzb;
    private final com.google.android.gms.common.api.ComplianceOptions zzc;
    private final boolean zzd;
    private boolean zze;

    static ApiMetadata()
    {
        com.google.android.gms.common.api.ApiMetadata.CREATOR = com.google.android.gms.common.api.zza.zza();
        com.google.android.gms.common.api.ApiMetadata.zzb = com.google.android.gms.common.api.ApiMetadata.newBuilder().build();
        com.google.android.gms.common.api.ApiMetadata v0_4 = com.google.android.gms.common.api.ApiMetadata.newBuilder();
        v0_4.zza(1);
        com.google.android.gms.common.api.ApiMetadata.zza = v0_4.build();
        return;
    }

    public ApiMetadata(com.google.android.gms.common.api.ComplianceOptions p1, boolean p2)
    {
        this.zzc = p1;
        this.zzd = p2;
        return;
    }

    public static final com.google.android.gms.common.api.ApiMetadata fromComplianceOptions(com.google.android.gms.common.api.ComplianceOptions p1)
    {
        com.google.android.gms.common.api.ApiMetadata$Builder v0 = com.google.android.gms.common.api.ApiMetadata.newBuilder();
        v0.setComplianceOptions(p1);
        return v0.build();
    }

    public static final com.google.android.gms.common.api.ApiMetadata getEmptyInstance()
    {
        return com.google.android.gms.common.api.ApiMetadata.zzb;
    }

    public static com.google.android.gms.common.api.ApiMetadata$Builder newBuilder()
    {
        return new com.google.android.gms.common.api.ApiMetadata$Builder();
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.common.api.ApiMetadata)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.common.api.ApiMetadata) p4).zzc)) || ((this.zze != ((com.google.android.gms.common.api.ApiMetadata) p4).zze) || (this.zzd != ((com.google.android.gms.common.api.ApiMetadata) p4).zzd))) {
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
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zzc, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzd)}));
    }

    public com.google.android.gms.common.api.ApiMetadata$Builder toBuilder()
    {
        com.google.android.gms.common.api.ApiMetadata$Builder v0 = com.google.android.gms.common.api.ApiMetadata.newBuilder();
        v0.setComplianceOptions(this.zzc);
        v0.setCallbackSupportEnabled(this.zzd);
        v0.zza(this.zze);
        return v0;
    }

    public final String toString()
    {
        String v0_2 = String.valueOf(this.zzc);
        return v1.a.o(new StringBuilder((v0_2.length() + 31)), "ApiMetadata(complianceOptions=", v0_2, ")");
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        if (!this.zze) {
            p5.writeInt(-204102970);
            int v0_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zzc, p6, 0);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 2, this.zzd);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0_2);
            return;
        } else {
            p5.setDataPosition((p5.dataPosition() - 4));
            p5.setDataSize((p5.dataSize() - 4));
            return;
        }
    }

    public final synthetic void zza(boolean p1)
    {
        this.zze = p1;
        return;
    }
}
