package com.google.android.gms.fido.u2f.api.messagebased;
public final enum class RequestType extends java.lang.Enum {
    public static final enum com.google.android.gms.fido.u2f.api.messagebased.RequestType REGISTER;
    public static final enum com.google.android.gms.fido.u2f.api.messagebased.RequestType SIGN;
    private static final synthetic com.google.android.gms.fido.u2f.api.messagebased.RequestType[] zza;
    private final String zzb;

    static RequestType()
    {
        com.google.android.gms.fido.u2f.api.messagebased.RequestType[] v0_2 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType("REGISTER", 0, "u2f_register_request");
        com.google.android.gms.fido.u2f.api.messagebased.RequestType.REGISTER = v0_2;
        com.google.android.gms.fido.u2f.api.messagebased.RequestType v1_1 = new com.google.android.gms.fido.u2f.api.messagebased.RequestType("SIGN", 1, "u2f_sign_request");
        com.google.android.gms.fido.u2f.api.messagebased.RequestType.SIGN = v1_1;
        com.google.android.gms.fido.u2f.api.messagebased.RequestType.zza = new com.google.android.gms.fido.u2f.api.messagebased.RequestType[] {v0_2, v1_1});
        return;
    }

    private RequestType(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType fromString(String p5)
    {
        com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException v0_0 = com.google.android.gms.fido.u2f.api.messagebased.RequestType.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.u2f.api.messagebased.RequestType v3 = v0_0[v2];
            if (!p5.equals(v3.zzb)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException(p5);
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType valueOf(String p1)
    {
        return ((com.google.android.gms.fido.u2f.api.messagebased.RequestType) Enum.valueOf(com.google.android.gms.fido.u2f.api.messagebased.RequestType, p1));
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType[] values()
    {
        return ((com.google.android.gms.fido.u2f.api.messagebased.RequestType[]) com.google.android.gms.fido.u2f.api.messagebased.RequestType.zza.clone());
    }

    public String toString()
    {
        return this.zzb;
    }
}
