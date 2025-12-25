package com.google.android.gms.fido.fido2.api.common;
public class AuthenticationExtensions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
    private final com.google.android.gms.fido.fido2.api.common.zzs zzb;
    private final com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzc;
    private final com.google.android.gms.fido.fido2.api.common.zzz zzd;
    private final com.google.android.gms.fido.fido2.api.common.zzab zze;
    private final com.google.android.gms.fido.fido2.api.common.zzad zzf;
    private final com.google.android.gms.fido.fido2.api.common.zzu zzg;
    private final com.google.android.gms.fido.fido2.api.common.zzag zzh;
    private final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
    private final com.google.android.gms.fido.fido2.api.common.zzai zzj;

    static AuthenticationExtensions()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzd();
        return;
    }

    public AuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension p1, com.google.android.gms.fido.fido2.api.common.zzs p2, com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension p3, com.google.android.gms.fido.fido2.api.common.zzz p4, com.google.android.gms.fido.fido2.api.common.zzab p5, com.google.android.gms.fido.fido2.api.common.zzad p6, com.google.android.gms.fido.fido2.api.common.zzu p7, com.google.android.gms.fido.fido2.api.common.zzag p8, com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension p9, com.google.android.gms.fido.fido2.api.common.zzai p10)
    {
        this.zza = p1;
        this.zzc = p3;
        this.zzb = p2;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        this.zzh = p8;
        this.zzi = p9;
        this.zzj = p10;
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzc)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzd)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zze, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zze)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzf)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzg)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzh, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzh)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzi, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzi)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzj, ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) p4).zzj))))))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension getFidoAppIdExtension()
    {
        return this.zza;
    }

    public com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension getUserVerificationMethodExtension()
    {
        return this.zzc;
    }

    public int hashCode()
    {
        com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension v2 = this.zzc;
        com.google.android.gms.fido.fido2.api.common.zzab v4 = this.zze;
        com.google.android.gms.fido.fido2.api.common.zzu v6 = this.zzg;
        com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension v8 = this.zzi;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzj}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getFidoAppIdExtension(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.getUserVerificationMethodExtension(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 6, this.zze, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.zzf, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 8, this.zzg, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 9, this.zzh, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 10, this.zzi, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 11, this.zzj, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzs zza()
    {
        return this.zzb;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzu zzb()
    {
        return this.zzg;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzz zzc()
    {
        return this.zzd;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzab zzd()
    {
        return this.zze;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzad zze()
    {
        return this.zzf;
    }

    public final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzf()
    {
        return this.zzi;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzag zzg()
    {
        return this.zzh;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzai zzh()
    {
        return this.zzj;
    }
}
