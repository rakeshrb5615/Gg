package com.google.android.recaptcha;
public final enum class RecaptchaErrorCode extends java.lang.Enum {
    private static final synthetic o7.a $ENTRIES;
    private static final synthetic com.google.android.recaptcha.RecaptchaErrorCode[] $VALUES;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode INTERNAL_ERROR;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode INVALID_ACTION;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode INVALID_KEYTYPE;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode INVALID_PACKAGE_NAME;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode INVALID_SITEKEY;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode INVALID_TIMEOUT;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode NETWORK_ERROR;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode NO_NETWORK_FOUND;
    public static final enum com.google.android.recaptcha.RecaptchaErrorCode UNKNOWN_ERROR;
    private final int errorCode;
    private final String errorMessage;

    private static final synthetic com.google.android.recaptcha.RecaptchaErrorCode[] $values()
    {
        com.google.android.recaptcha.RecaptchaErrorCode v2 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY;
        com.google.android.recaptcha.RecaptchaErrorCode v4 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_PACKAGE_NAME;
        com.google.android.recaptcha.RecaptchaErrorCode v6 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT;
        return new com.google.android.recaptcha.RecaptchaErrorCode[] {com.google.android.recaptcha.RecaptchaErrorCode.UNKNOWN_ERROR, com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR});
    }

    static RecaptchaErrorCode()
    {
        com.google.android.recaptcha.RecaptchaErrorCode.UNKNOWN_ERROR = new com.google.android.recaptcha.RecaptchaErrorCode("UNKNOWN_ERROR", 0, 0, "Unknown Error");
        com.google.android.recaptcha.RecaptchaErrorCode.NETWORK_ERROR = new com.google.android.recaptcha.RecaptchaErrorCode("NETWORK_ERROR", 1, 1, "Network Error");
        com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY = new com.google.android.recaptcha.RecaptchaErrorCode("INVALID_SITEKEY", 2, 2, "Site key invalid");
        com.google.android.recaptcha.RecaptchaErrorCode.INVALID_KEYTYPE = new com.google.android.recaptcha.RecaptchaErrorCode("INVALID_KEYTYPE", 3, 3, "Key type invalid");
        com.google.android.recaptcha.RecaptchaErrorCode.INVALID_PACKAGE_NAME = new com.google.android.recaptcha.RecaptchaErrorCode("INVALID_PACKAGE_NAME", 4, 4, "Package name not allowed");
        com.google.android.recaptcha.RecaptchaErrorCode.INVALID_ACTION = new com.google.android.recaptcha.RecaptchaErrorCode("INVALID_ACTION", 5, 5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information");
        com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT = new com.google.android.recaptcha.RecaptchaErrorCode("INVALID_TIMEOUT", 6, 6, "Invalid timeout, minimum value is 5_000L milliseconds");
        com.google.android.recaptcha.RecaptchaErrorCode.NO_NETWORK_FOUND = new com.google.android.recaptcha.RecaptchaErrorCode("NO_NETWORK_FOUND", 7, 7, "No network found on device");
        com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR = new com.google.android.recaptcha.RecaptchaErrorCode("INTERNAL_ERROR", 8, 100, "Internal Error");
        o7.b v0_17 = com.google.android.recaptcha.RecaptchaErrorCode.$values();
        com.google.android.recaptcha.RecaptchaErrorCode.$VALUES = v0_17;
        com.google.android.recaptcha.RecaptchaErrorCode.$ENTRIES = c4.b.x(v0_17);
        return;
    }

    private RecaptchaErrorCode(String p1, int p2, int p3, String p4)
    {
        super(p1, p2);
        super.errorCode = p3;
        super.errorMessage = p4;
        return;
    }

    public static o7.a getEntries()
    {
        return com.google.android.recaptcha.RecaptchaErrorCode.$ENTRIES;
    }

    public static com.google.android.recaptcha.RecaptchaErrorCode valueOf(String p1)
    {
        return ((com.google.android.recaptcha.RecaptchaErrorCode) Enum.valueOf(com.google.android.recaptcha.RecaptchaErrorCode, p1));
    }

    public static com.google.android.recaptcha.RecaptchaErrorCode[] values()
    {
        return ((com.google.android.recaptcha.RecaptchaErrorCode[]) com.google.android.recaptcha.RecaptchaErrorCode.$VALUES.clone());
    }

    public final int getErrorCode()
    {
        return this.errorCode;
    }

    public final String getErrorMessage()
    {
        return this.errorMessage;
    }
}
