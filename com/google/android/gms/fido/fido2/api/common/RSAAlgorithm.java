package com.google.android.gms.fido.fido2.api.common;
public final enum class RSAAlgorithm extends java.lang.Enum implements com.google.android.gms.fido.fido2.api.common.Algorithm {
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm LEGACY_RS1;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm PS256;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm PS384;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm PS512;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS1;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS256;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS384;
    public static final enum com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS512;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] zza;
    private final int zzb;

    static RSAAlgorithm()
    {
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] v0_1 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("RS256", 0, -257);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS256 = v0_1;
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS384 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("RS384", 1, -258);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS512 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("RS512", 2, -259);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.LEGACY_RS1 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("LEGACY_RS1", 3, -262);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.PS256 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("PS256", 4, -37);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.PS384 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("PS384", 5, -38);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.PS512 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("PS512", 6, -39);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm v7_4 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm("RS1", 7, -65535);
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS1 = v7_4;
        com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.zza = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] {v0_1, v7_4});
        return;
    }

    private RSAAlgorithm(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.RSAAlgorithm valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.RSAAlgorithm) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.RSAAlgorithm, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[]) com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.zza.clone());
    }

    public int getAlgoValue()
    {
        return this.zzb;
    }
}
