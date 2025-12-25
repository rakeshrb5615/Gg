package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredentialDescriptor extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private static final com.google.android.gms.internal.fido.zzbc zza;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zzb;
    private final byte[] zzc;
    private final java.util.List zzd;

    static PublicKeyCredentialDescriptor()
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.zza = com.google.android.gms.internal.fido.zzbc.zzk(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzam();
        return;
    }

    public PublicKeyCredentialDescriptor(String p1, byte[] p2, java.util.List p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        try {
            this.zzb = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(p1);
            this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
            this.zzd = p3;
            return;
        } catch (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException v1_1) {
            throw new IllegalArgumentException(v1_1);
        }
    }

    public boolean equals(Object p5)
    {
        if ((p5 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor)) {
            if (this.zzb.equals(((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) p5).zzb)) {
                if (java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) p5).zzc)) {
                    java.util.List v0_2 = this.zzd;
                    if ((v0_2 == null) && (((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) p5).zzd == null)) {
                        return 1;
                    } else {
                        if (v0_2 != null) {
                            java.util.List v3_1 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) p5).zzd;
                            if ((v3_1 != null) && ((v0_2.containsAll(v3_1)) && (((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) p5).zzd.containsAll(this.zzd)))) {
                                return 1;
                            }
                        }
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public byte[] getId()
    {
        return this.zzc;
    }

    public java.util.List getTransports()
    {
        return this.zzd;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType()
    {
        return this.zzb;
    }

    public String getTypeAsString()
    {
        return this.zzb.toString();
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zzb, Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), this.zzd}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getTypeAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 4, this.getTransports(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
