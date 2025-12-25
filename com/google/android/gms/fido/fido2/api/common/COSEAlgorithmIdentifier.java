package com.google.android.gms.fido.fido2.api.common;
public class COSEAlgorithmIdentifier implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.Algorithm zza;

    static COSEAlgorithmIdentifier()
    {
        com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzp();
        return;
    }

    public COSEAlgorithmIdentifier(com.google.android.gms.fido.fido2.api.common.Algorithm p1)
    {
        this.zza = ((com.google.android.gms.fido.fido2.api.common.Algorithm) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier fromCoseValue(int p7)
    {
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm v7_1;
        if (p7 != com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] v1_3 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.values();
            int v3 = 0;
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm v4_1 = 0;
            while (v4_1 < v1_3.length) {
                int v5_1 = v1_3[v4_1];
                if (v5_1.getAlgoValue() != p7) {
                    v4_1++;
                } else {
                    v7_1 = v5_1;
                }
            }
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] v1_1 = com.google.android.gms.fido.fido2.api.common.EC2Algorithm.values();
            while (v3 < v1_1.length) {
                com.google.android.gms.fido.fido2.api.common.EC2Algorithm v4_0 = v1_1[v3];
                if (v4_0.getAlgoValue() != p7) {
                    v3++;
                } else {
                    v7_1 = v4_0;
                }
            }
            throw new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(p7);
        } else {
            v7_1 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS1;
        }
        return new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier(v7_1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier)) {
            if (this.zza.getAlgoValue() != ((com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier) p3).zza.getAlgoValue()) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza}));
    }

    public int toCoseValue()
    {
        return this.zza.getAlgoValue();
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.zza.getAlgoValue());
        return;
    }
}
