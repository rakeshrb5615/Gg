package com.google.android.gms.fido.fido2.api.common;
public class FidoAppIdExtension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;

    static FidoAppIdExtension()
    {
        com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzx();
        return;
    }

    public FidoAppIdExtension(String p1)
    {
        this.zza = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return;
    }

    public boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension)) {
            return this.zza.equals(((com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) p2).zza);
        } else {
            return 0;
        }
    }

    public String getAppId()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza}));
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getAppId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
