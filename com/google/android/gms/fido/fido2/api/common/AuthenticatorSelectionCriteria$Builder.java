package com.google.android.gms.fido.fido2.api.common;
public class AuthenticatorSelectionCriteria$Builder {
    private com.google.android.gms.fido.fido2.api.common.Attachment zza;
    private Boolean zzb;
    private com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzc;

    public AuthenticatorSelectionCriteria$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria build()
    {
        String v1_1;
        String v1_0 = this.zza;
        if (v1_0 != null) {
            v1_1 = v1_0.toString();
        } else {
            v1_1 = 0;
        }
        String v4_0;
        Boolean v3 = this.zzb;
        String v4_1 = this.zzc;
        if (v4_1 != null) {
            v4_0 = v4_1.toString();
        } else {
            v4_0 = 0;
        }
        return new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria(v1_1, v3, 0, v4_0);
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria$Builder setAttachment(com.google.android.gms.fido.fido2.api.common.Attachment p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria$Builder setRequireResidentKey(Boolean p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria$Builder setResidentKeyRequirement(com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement p1)
    {
        this.zzc = p1;
        return this;
    }
}
