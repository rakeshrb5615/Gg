package com.google.android.recaptcha;
public final class RecaptchaDefinitions {
    public static final long DEFAULT_TIMEOUT_EXECUTE = 10000;
    public static final long DEFAULT_TIMEOUT_INIT = 10000;
    public static final com.google.android.recaptcha.RecaptchaDefinitions INSTANCE = None;
    public static final long MIN_TIMEOUT_EXECUTE = 5000;
    public static final long MIN_TIMEOUT_INIT = 5000;

    static RecaptchaDefinitions()
    {
        com.google.android.recaptcha.RecaptchaDefinitions.INSTANCE = new com.google.android.recaptcha.RecaptchaDefinitions();
        return;
    }

    private RecaptchaDefinitions()
    {
        return;
    }
}
