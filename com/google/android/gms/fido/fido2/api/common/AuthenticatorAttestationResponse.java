package com.google.android.gms.fido.fido2.api.common;
public class AuthenticatorAttestationResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final String[] zzd;

    static AuthenticatorAttestationResponse()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzk();
        return;
    }

    public AuthenticatorAttestationResponse(byte[] p1, byte[] p2, byte[] p3, String[] p4)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzd = ((String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse)) {
            if ((!java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) p4).zza)) || ((!java.util.Arrays.equals(this.zzb, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) p4).zzb)) || (!java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) p4).zzc)))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public byte[] getAttestationObject()
    {
        return this.zzc;
    }

    public byte[] getClientDataJSON()
    {
        return this.zzb;
    }

    public byte[] getKeyHandle()
    {
        return this.zza;
    }

    public String[] getTransports()
    {
        return this.zzd;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(java.util.Arrays.hashCode(this.zza)), Integer.valueOf(java.util.Arrays.hashCode(this.zzb)), Integer.valueOf(java.util.Arrays.hashCode(this.zzc))}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.internal.fido.zzan.zza(this);
        String v2_5 = this.zza;
        v0_0.zzb("keyHandle", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_5, 0, v2_5.length));
        String v2_0 = this.zzb;
        v0_0.zzb("clientDataJSON", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_0, 0, v2_0.length));
        String v2_2 = this.zzc;
        v0_0.zzb("attestationObject", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_2, 0, v2_2.length));
        v0_0.zzb("transports", java.util.Arrays.toString(this.zzd));
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getKeyHandle(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.getClientDataJSON(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 4, this.getAttestationObject(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(p4, 5, this.getTransports(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final org.json.JSONObject zza()
    {
        IllegalArgumentException v0_10 = new org.json.JSONObject();
        String v2_16 = this.zzb;
        if (v2_16 != null) {
            v0_10.put("clientDataJSON", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(v2_16));
        }
        String v2_31 = this.zzc;
        if (v2_31 != null) {
            v0_10.put("attestationObject", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(v2_31));
        }
        String v2_4 = new org.json.JSONArray();
        byte[] v4_5 = 0;
        while(true) {
            byte[] v5_17 = this.zzd;
            if (v4_5 >= v5_17.length) {
                break;
            }
            if (!v5_17[v4_5].equals(com.google.android.gms.fido.common.Transport.HYBRID.toString())) {
                v2_4.put(v4_5, this.zzd[v4_5]);
            } else {
                v2_4.put(v4_5, "hybrid");
            }
            v4_5++;
        }
        v0_10.put("transports", v2_4);
        try {
            String v2_21 = ((com.google.android.gms.internal.fido.zzdr) com.google.android.gms.internal.fido.zzdr.zzj(this.zzc).zzh().zzc().get(com.google.android.gms.internal.fido.zzdr.zzi("authData")));
        } catch (IllegalArgumentException v0_20) {
            throw new IllegalArgumentException("authData value has wrong type", v0_20);
        }
        if (v2_21 == null) {
            throw new IllegalArgumentException("attestation object missing authData");
        } else {
            String v2_24 = v2_21.zze().zzc();
            byte[] v4_18 = v2_24.zzi();
            try {
                v4_18.position((v4_18.position() + 32));
            } catch (IllegalArgumentException v0_23) {
                throw new IllegalArgumentException("ill-formed authenticator data", v0_23);
            }
            if ((v4_18.get() & 64) == 0) {
                throw new IllegalArgumentException("authData does not include credential data");
            } else {
                v4_18.position((v4_18.position() + 4));
                v4_18.position((v4_18.position() + 16));
                v4_18.position((v4_18.position() + v4_18.getShort()));
                byte[] v4_1 = com.google.android.gms.internal.fido.zzdr.zzk(v2_24.zzg(v4_18.position(), v2_24.zzd()).zzh()).zzh();
                byte[] v5_2 = ((com.google.android.gms.internal.fido.zzdr) v4_1.zzc().get(com.google.android.gms.internal.fido.zzdr.zzg(3)));
                byte[] v7_4 = ((com.google.android.gms.internal.fido.zzdr) v4_1.zzc().get(com.google.android.gms.internal.fido.zzdr.zzg(1)));
                if ((v5_2 == null) || (v7_4 == null)) {
                    throw new IllegalArgumentException("COSE key missing required fields");
                } else {
                    byte[] v7_7;
                    long v11 = v5_2.zzf().zzc();
                    long v13 = v7_4.zzf().zzc();
                    if (v13 == 1) {
                        byte[] v5_9 = ((com.google.android.gms.internal.fido.zzdr) v4_1.zzc().get(com.google.android.gms.internal.fido.zzdr.zzg(-1)));
                        if (v5_9 == null) {
                            throw new IllegalArgumentException("COSE key missing required fields");
                        } else {
                            long v17_1 = v5_9.zzf().zzc();
                            if ((v13 != 2) || (v17_1 != 1)) {
                                if ((v13 != 1) || (v17_1 != 6)) {
                                    v7_7 = 0;
                                } else {
                                    byte[] v4_4 = ((com.google.android.gms.internal.fido.zzdr) v4_1.zzc().get(com.google.android.gms.internal.fido.zzdr.zzg(-2)));
                                    if (v4_4 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    } else {
                                        byte[] v4_7 = v4_4.zze().zzc();
                                        if (v4_7.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        } else {
                                            v7_7 = com.google.android.gms.internal.fido.zzcl.zza(new byte[][] {android.util.Base64.decode("MCowBQYDK2VwAyEA", 0), v4_7.zzm()}));
                                        }
                                    }
                                }
                            } else {
                                byte[] v5_21 = ((com.google.android.gms.internal.fido.zzdr) v4_1.zzc().get(com.google.android.gms.internal.fido.zzdr.zzg(-2)));
                                byte[] v4_11 = ((com.google.android.gms.internal.fido.zzdr) v4_1.zzc().get(com.google.android.gms.internal.fido.zzdr.zzg(-3)));
                                if ((v5_21 == null) || (v4_11 == null)) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                } else {
                                    byte[] v5_23 = v5_21.zze().zzc();
                                    byte[] v4_14 = v4_11.zze().zzc();
                                    if ((v5_23.zzd() != 32) || (v4_14.zzd() != 32)) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    } else {
                                        v7_7 = com.google.android.gms.internal.fido.zzcl.zza(new byte[][] {android.util.Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), v5_23.zzm(), v4_14.zzm()}));
                                    }
                                }
                            }
                        }
                    } else {
                        if (v13 != 2) {
                        } else {
                            v13 = 2;
                        }
                    }
                    v0_10.put("authenticatorData", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(v2_24.zzm()));
                    v0_10.put("publicKeyAlgorithm", v11);
                    if (v7_7 != null) {
                        v0_10.put("publicKey", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(v7_7));
                    }
                    return v0_10;
                }
            }
        }
    }
}
