package com.google.android.recaptcha;
public final class RecaptchaException extends java.lang.Exception {
    private final com.google.android.recaptcha.RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode p1, String p2)
    {
        super(p2);
        super.errorCode = p1;
        super.errorMessage = p2;
        return;
    }

    public synthetic RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode p1, String p2, int p3, kotlin.jvm.internal.f p4)
    {
        if ((p3 & 2) != 0) {
            p2 = p1.getErrorMessage();
        }
        this(p1, p2);
        return;
    }

    public final com.google.android.recaptcha.RecaptchaErrorCode getErrorCode()
    {
        return this.errorCode;
    }

    public final String getErrorMessage()
    {
        return this.errorMessage;
    }
}
