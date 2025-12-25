package com.google.android.gms.fido.fido2.api.common;
public final enum class PublicKeyCredentialType extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType PUBLIC_KEY;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] zza;
    private final String zzb;

    static PublicKeyCredentialType()
    {
        com.google.android.gms.fido.fido2.api.common.zzaq v0_2 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType("PUBLIC_KEY", 0, "public-key");
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.PUBLIC_KEY = v0_2;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.zza = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] {v0_2});
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaq();
        return;
    }

    private PublicKeyCredentialType(String p1, int p2, String p3)
    {
        super("PUBLIC_KEY", 0);
        super.zzb = "public-key";
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType fromString(String p5)
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException v0_0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.values();
        int v2_0 = 0;
        while (v2_0 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType v3 = v0_0[v2_0];
            if (!p5.equals(v3.zzb)) {
                v2_0++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(v1.a.l("PublicKeyCredentialType ", p5, " not supported"));
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType[]) com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.zza.clone());
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.zzb);
        return;
    }
}
