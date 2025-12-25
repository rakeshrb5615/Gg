package com.google.android.gms.fido.fido2.api.common;
public class AuthenticationExtensionsClientOutputs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.UvmEntries zza;
    private final com.google.android.gms.fido.fido2.api.common.zzf zzb;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs zzc;
    private final com.google.android.gms.fido.fido2.api.common.zzh zzd;

    static AuthenticationExtensionsClientOutputs()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzc();
        return;
    }

    public AuthenticationExtensionsClientOutputs(com.google.android.gms.fido.fido2.api.common.UvmEntries p1, com.google.android.gms.fido.fido2.api.common.zzf p2, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs p3, com.google.android.gms.fido.fido2.api.common.zzh p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) p4).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) p4).zzc)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) p4).zzd))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs getCredProps()
    {
        return this.zzc;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntries getUvmEntries()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb, this.zzc, this.zzd}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getUvmEntries(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getCredProps(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final org.json.JSONObject zza()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        org.json.JSONObject v1_3 = this.zzc;
        if (v1_3 != null) {
            v0_1.put("credProps", v1_3.zza());
        }
        org.json.JSONObject v1_7 = this.zza;
        if (v1_7 != null) {
            v0_1.put("uvm", v1_7.zza());
        }
        org.json.JSONObject v1_1 = this.zzd;
        if (v1_1 != null) {
            v0_1.put("prf", v1_1.zza());
        }
        return v0_1;
    }
}
