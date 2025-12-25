package com.google.android.gms.fido.fido2.api.common;
public class TokenBinding extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.fido.fido2.api.common.TokenBinding NOT_SUPPORTED;
    public static final com.google.android.gms.fido.fido2.api.common.TokenBinding SUPPORTED;
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus zza;
    private final String zzb;

    static TokenBinding()
    {
        com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzau();
        com.google.android.gms.fido.fido2.api.common.TokenBinding.SUPPORTED = new com.google.android.gms.fido.fido2.api.common.TokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.SUPPORTED.toString(), 0);
        com.google.android.gms.fido.fido2.api.common.TokenBinding.NOT_SUPPORTED = new com.google.android.gms.fido.fido2.api.common.TokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.NOT_SUPPORTED.toString(), 0);
        return;
    }

    public TokenBinding(String p2)
    {
        this(com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.PRESENT.toString(), ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)));
        return;
    }

    public TokenBinding(String p1, String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        try {
            this.zza = com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.fromString(p1);
            this.zzb = p2;
            return;
        } catch (com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException v1_2) {
            throw new IllegalArgumentException(v1_2);
        }
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.TokenBinding)) {
            if ((!com.google.android.gms.internal.fido.zzao.zza(this.zza, ((com.google.android.gms.fido.fido2.api.common.TokenBinding) p4).zza)) || (!com.google.android.gms.internal.fido.zzao.zza(this.zzb, ((com.google.android.gms.fido.fido2.api.common.TokenBinding) p4).zzb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getTokenBindingId()
    {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString()
    {
        return this.zza.toString();
    }

    public int hashCode()
    {
        return java.util.Arrays.hashCode(new Object[] {this.zza, this.zzb}));
    }

    public org.json.JSONObject toJsonObject()
    {
        try {
            return new org.json.JSONObject().put("status", this.zza).put("id", this.zzb);
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException(v0_2);
        }
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getTokenBindingStatusAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getTokenBindingId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
