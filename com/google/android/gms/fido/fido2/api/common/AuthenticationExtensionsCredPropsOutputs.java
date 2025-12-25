package com.google.android.gms.fido.fido2.api.common;
public class AuthenticationExtensionsCredPropsOutputs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;

    static AuthenticationExtensionsCredPropsOutputs()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs.CREATOR = new com.google.android.gms.fido.fido2.api.common.zze();
        return;
    }

    public AuthenticationExtensionsCredPropsOutputs(boolean p1)
    {
        this.zza = p1;
        return;
    }

    public boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs)) {
            if (this.zza != ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs) p3).zza) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean getIsDiscoverableCredential()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zza)}));
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.getIsDiscoverableCredential());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }

    public final org.json.JSONObject zza()
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONObject();
            v0_1.put("rk", this.zza);
            return v0_1;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", v0_2);
        }
    }
}
