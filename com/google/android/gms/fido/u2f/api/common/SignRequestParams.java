package com.google.android.gms.fido.u2f.api.common;
public class SignRequestParams extends com.google.android.gms.fido.u2f.api.common.RequestParams {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final Integer zza;
    private final Double zzb;
    private final android.net.Uri zzc;
    private final byte[] zzd;
    private final java.util.List zze;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
    private final String zzg;
    private final java.util.Set zzh;

    static SignRequestParams()
    {
        com.google.android.gms.fido.u2f.api.common.SignRequestParams.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzk();
        return;
    }

    public SignRequestParams(Integer p3, Double p4, android.net.Uri p5, byte[] p6, java.util.List p7, com.google.android.gms.fido.u2f.api.common.ChannelIdValue p8, String p9)
    {
        int v6_1;
        this.zza = p3;
        this.zzb = p4;
        this.zzc = p5;
        this.zzd = p6;
        int v3_1 = 0;
        if ((p7 == null) || (p7.isEmpty())) {
            v6_1 = 0;
        } else {
            v6_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v6_1, "registeredKeys must not be null or empty");
        this.zze = p7;
        this.zzf = p8;
        int v6_3 = new java.util.HashSet();
        if (p5 != 0) {
            v6_3.add(p5);
        }
        java.util.Iterator v7_1 = p7.iterator();
        while (v7_1.hasNext()) {
            String v0_2;
            android.net.Uri v8_3 = ((com.google.android.gms.fido.u2f.api.common.RegisteredKey) v7_1.next());
            if ((v8_3.getAppId() == null) && (p5 == 0)) {
                v0_2 = 0;
            } else {
                v0_2 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "registered key has null appId and no request appId is provided");
            v8_3.getChallengeValue();
            com.google.android.gms.common.internal.Preconditions.checkArgument(1, "register request has null challenge and no default challenge isprovided");
            if (v8_3.getAppId() != null) {
                v6_3.add(android.net.Uri.parse(v8_3.getAppId()));
            }
        }
        this.zzh = v6_3;
        if ((p9 == null) || (p9.length() <= 80)) {
            v3_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v3_1, "Display Hint cannot be longer than 80 characters");
        this.zzg = p9;
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.SignRequestParams)) {
                if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zzc)) || ((!java.util.Arrays.equals(this.zzd, ((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zzd)) || ((!this.zze.containsAll(((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zze)) || ((!((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zze.containsAll(this.zze)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zzf)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.fido.u2f.api.common.SignRequestParams) p5).zzg))))))))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public java.util.Set getAllAppIds()
    {
        return this.zzh;
    }

    public android.net.Uri getAppId()
    {
        return this.zzc;
    }

    public com.google.android.gms.fido.u2f.api.common.ChannelIdValue getChannelIdValue()
    {
        return this.zzf;
    }

    public byte[] getDefaultSignChallenge()
    {
        return this.zzd;
    }

    public String getDisplayHint()
    {
        return this.zzg;
    }

    public java.util.List getRegisteredKeys()
    {
        return this.zze;
    }

    public Integer getRequestId()
    {
        return this.zza;
    }

    public Double getTimeoutSeconds()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        Double v2 = this.zzb;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue v4 = this.zzf;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, Integer.valueOf(java.util.Arrays.hashCode(this.zzd))}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(p5, 2, this.getRequestId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(p5, 3, this.getTimeoutSeconds(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.getAppId(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p5, 5, this.getDefaultSignChallenge(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 6, this.getRegisteredKeys(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.getChannelIdValue(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.getDisplayHint(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
