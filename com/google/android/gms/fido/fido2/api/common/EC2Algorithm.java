package com.google.android.gms.fido.fido2.api.common;
public final enum class EC2Algorithm extends java.lang.Enum implements com.google.android.gms.fido.fido2.api.common.Algorithm {
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ECDH_HKDF_256;
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ED25519;
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ED256;
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ED512;
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ES256;
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ES384;
    public static final enum com.google.android.gms.fido.fido2.api.common.EC2Algorithm ES512;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] zza;
    private final int zzb;

    static EC2Algorithm()
    {
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] v0_1 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ED256", 0, -260);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ED256 = v0_1;
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ED512 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ED512", 1, -261);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ED25519 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ED25519", 2, -8);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ES256 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ES256", 3, -7);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ECDH_HKDF_256 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ECDH_HKDF_256", 4, -25);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ES384 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ES384", 5, -35);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm v6_4 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm("ES512", 6, -36);
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ES512 = v6_4;
        com.google.android.gms.fido.fido2.api.common.EC2Algorithm.zza = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] {v0_1, v6_4});
        return;
    }

    private EC2Algorithm(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.EC2Algorithm valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.EC2Algorithm) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.EC2Algorithm, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.EC2Algorithm[]) com.google.android.gms.fido.fido2.api.common.EC2Algorithm.zza.clone());
    }

    public int getAlgoValue()
    {
        return this.zzb;
    }
}
