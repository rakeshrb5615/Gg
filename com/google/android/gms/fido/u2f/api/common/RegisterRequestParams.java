package com.google.android.gms.fido.u2f.api.common;
public class RegisterRequestParams extends com.google.android.gms.fido.u2f.api.common.RequestParams {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final Integer zza;
    private final Double zzb;
    private final android.net.Uri zzc;
    private final java.util.List zzd;
    private final java.util.List zze;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
    private final String zzg;
    private java.util.Set zzh;

    static RegisterRequestParams()
    {
        com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzh();
        return;
    }

    public RegisterRequestParams(Integer p4, Double p5, android.net.Uri p6, java.util.List p7, java.util.List p8, com.google.android.gms.fido.u2f.api.common.ChannelIdValue p9, String p10)
    {
        String v0_0;
        this.zza = p4;
        this.zzb = p5;
        this.zzc = p6;
        int v4_1 = 0;
        if ((p7 == 0) || (p7.isEmpty())) {
            v0_0 = 0;
        } else {
            v0_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_0, "empty list of register requests is provided");
        this.zzd = p7;
        this.zze = p8;
        this.zzf = p9;
        java.util.HashSet v9_2 = new java.util.HashSet();
        if (p6 != 0) {
            v9_2.add(p6);
        }
        int v7_1 = p7.iterator();
        while (v7_1.hasNext()) {
            String v1_3;
            String v0_6 = ((com.google.android.gms.fido.u2f.api.common.RegisterRequest) v7_1.next());
            if ((p6 == 0) && (v0_6.getAppId() == null)) {
                v1_3 = 0;
            } else {
                v1_3 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(v1_3, "register request has null appId and no request appId is provided");
            if (v0_6.getAppId() != null) {
                v9_2.add(android.net.Uri.parse(v0_6.getAppId()));
            }
        }
        int v7_2 = p8.iterator();
        while (v7_2.hasNext()) {
            String v0_3;
            android.net.Uri v8_3 = ((com.google.android.gms.fido.u2f.api.common.RegisteredKey) v7_2.next());
            if ((p6 == 0) && (v8_3.getAppId() == null)) {
                v0_3 = 0;
            } else {
                v0_3 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(v0_3, "registered key has null appId and no request appId is provided");
            if (v8_3.getAppId() != null) {
                v9_2.add(android.net.Uri.parse(v8_3.getAppId()));
            }
        }
        this.zzh = v9_2;
        if ((p10 == null) || (p10.length() <= 80)) {
            v4_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v4_1, "Display Hint cannot be longer than 80 characters");
        this.zzg = p10;
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequestParams)) {
                if ((com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zza)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zzb)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zzc)) && (com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zzd))))) {
                    boolean v1_7 = this.zze;
                    if ((v1_7) || (((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zze != null)) {
                        if (!v1_7) {
                            return 0;
                        } else {
                            java.util.List v3_4 = ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zze;
                            if ((v3_4 == null) || ((!v1_7.containsAll(v3_4)) || (!((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zze.containsAll(this.zze)))) {
                                return 0;
                            }
                        }
                    }
                    if ((com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zzf)) && (com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) p5).zzg))) {
                        return 1;
                    }
                }
                return 0;
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

    public String getDisplayHint()
    {
        return this.zzg;
    }

    public java.util.List getRegisterRequests()
    {
        return this.zzd;
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
        java.util.List v4 = this.zze;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzg}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(p5, 2, this.getRequestId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(p5, 3, this.getTimeoutSeconds(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.getAppId(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 5, this.getRegisterRequests(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 6, this.getRegisteredKeys(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.getChannelIdValue(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.getDisplayHint(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
