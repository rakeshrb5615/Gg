package com.google.android.gms.auth.api.signin;
public final class GoogleSignInStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes()
    {
        return;
    }

    public static String getStatusCodeString(int p0)
    {
        switch (p0) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case 12501:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(p0);
        }
    }
}
