package com.google.android.gms.auth.api.phone;
public final class SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever()
    {
        return;
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.auth-api-phone.zzr(p1);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.auth-api-phone.zzr(p1);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.auth-api-phone.zzv(p1);
    }

    public static com.google.android.gms.auth.api.phone.SmsCodeBrowserClient getBrowserClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.auth-api-phone.zzv(p1);
    }
}
