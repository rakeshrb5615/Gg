package com.google.android.gms.auth.api.phone;
public final class SmsRetrieverStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    private SmsRetrieverStatusCodes()
    {
        return;
    }

    public static String getStatusCodeString(int p0)
    {
        switch (p0) {
            case 36500:
                return "PLATFORM_NOT_SUPPORTED";
            case 36501:
                return "API_NOT_AVAILABLE";
            case 36502:
                return "USER_PERMISSION_REQUIRED";
            default:
                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(p0);
        }
    }
}
