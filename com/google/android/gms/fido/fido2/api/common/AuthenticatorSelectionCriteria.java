package com.google.android.gms.fido.fido2.api.common;
public class AuthenticatorSelectionCriteria extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.Attachment zza;
    private final Boolean zzb;
    private final com.google.android.gms.fido.fido2.api.common.zzay zzc;
    private final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzd;

    static AuthenticatorSelectionCriteria()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzm();
        return;
    }

    public AuthenticatorSelectionCriteria(String p2, Boolean p3, String p4, String p5)
    {
        com.google.android.gms.fido.fido2.api.common.zzay v2_3;
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement v0 = 0;
        try {
            if (p2 != null) {
                v2_3 = com.google.android.gms.fido.fido2.api.common.Attachment.fromString(p2);
                com.google.android.gms.fido.fido2.api.common.zzay v2_1;
                this.zza = v2_3;
                this.zzb = p3;
                if (p4 != null) {
                    v2_1 = com.google.android.gms.fido.fido2.api.common.zzay.zza(p4);
                } else {
                    v2_1 = 0;
                }
                this.zzc = v2_1;
                if (p5 != null) {
                    v0 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.fromString(p5);
                } else {
                }
                this.zzd = v0;
                return;
            } else {
                v2_3 = 0;
            }
        } catch (com.google.android.gms.fido.fido2.api.common.zzay v2_2) {
        } catch (com.google.android.gms.fido.fido2.api.common.zzay v2_2) {
        } catch (com.google.android.gms.fido.fido2.api.common.zzay v2_2) {
        }
        throw new IllegalArgumentException(v2_2);
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) p4).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) p4).zzc)) || (!com.google.android.gms.common.internal.Objects.equal(this.getResidentKeyRequirement(), ((com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) p4).getResidentKeyRequirement()))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.Attachment getAttachment()
    {
        return this.zza;
    }

    public String getAttachmentAsString()
    {
        String v0_0 = this.zza;
        if (v0_0 != null) {
            return v0_0.toString();
        } else {
            return 0;
        }
    }

    public Boolean getRequireResidentKey()
    {
        return this.zzb;
    }

    public com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement getResidentKeyRequirement()
    {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement v0_0 = this.zzd;
        if (v0_0 != null) {
            return v0_0;
        } else {
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement v0_2 = this.zzb;
            if (v0_2 == null) {
                return 0;
            } else {
                if (v0_2.booleanValue()) {
                    return com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
                } else {
                    return 0;
                }
            }
        }
    }

    public String getResidentKeyRequirementAsString()
    {
        if (this.getResidentKeyRequirement() != null) {
            return this.getResidentKeyRequirement().toString();
        } else {
            return 0;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb, this.zzc, this.getResidentKeyRequirement()}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v0_1;
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getAttachmentAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(p4, 3, this.getRequireResidentKey(), 0);
        int v0_0 = this.zzc;
        if (v0_0 != 0) {
            v0_1 = v0_0.toString();
        } else {
            v0_1 = 0;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, v0_1, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 5, this.getResidentKeyRequirementAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
