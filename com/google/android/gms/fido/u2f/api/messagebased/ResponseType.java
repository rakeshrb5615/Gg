package com.google.android.gms.fido.u2f.api.messagebased;
public final enum class ResponseType extends java.lang.Enum {
    public static final enum com.google.android.gms.fido.u2f.api.messagebased.ResponseType REGISTER;
    public static final enum com.google.android.gms.fido.u2f.api.messagebased.ResponseType SIGN;
    private static final synthetic com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] zza;
    private final String zzb;

    static ResponseType()
    {
        com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] v0_2 = new com.google.android.gms.fido.u2f.api.messagebased.ResponseType("REGISTER", 0, "u2f_register_response");
        com.google.android.gms.fido.u2f.api.messagebased.ResponseType.REGISTER = v0_2;
        com.google.android.gms.fido.u2f.api.messagebased.ResponseType v1_1 = new com.google.android.gms.fido.u2f.api.messagebased.ResponseType("SIGN", 1, "u2f_sign_response");
        com.google.android.gms.fido.u2f.api.messagebased.ResponseType.SIGN = v1_1;
        com.google.android.gms.fido.u2f.api.messagebased.ResponseType.zza = new com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] {v0_2, v1_1});
        return;
    }

    private ResponseType(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType getResponseTypeForRequestType(com.google.android.gms.fido.u2f.api.messagebased.RequestType p2)
    {
        if (p2 == null) {
            throw new com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException(0);
        } else {
            com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException v0_3 = p2.ordinal();
            if (v0_3 == null) {
                return com.google.android.gms.fido.u2f.api.messagebased.ResponseType.REGISTER;
            } else {
                if (v0_3 != 1) {
                    throw new com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException(p2.toString());
                } else {
                    return com.google.android.gms.fido.u2f.api.messagebased.ResponseType.SIGN;
                }
            }
        }
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType valueOf(String p1)
    {
        return ((com.google.android.gms.fido.u2f.api.messagebased.ResponseType) Enum.valueOf(com.google.android.gms.fido.u2f.api.messagebased.ResponseType, p1));
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType[] values()
    {
        return ((com.google.android.gms.fido.u2f.api.messagebased.ResponseType[]) com.google.android.gms.fido.u2f.api.messagebased.ResponseType.zza.clone());
    }

    public String toString()
    {
        return this.zzb;
    }
}
