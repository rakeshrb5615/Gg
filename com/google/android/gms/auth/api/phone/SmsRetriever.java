package com.google.android.gms.auth.api.phone;
public final class SmsRetriever {
    public static final String EXTRA_CONSENT_INTENT = "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT";
    public static final String EXTRA_SIM_SUBSCRIPTION_ID = "com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID";
    public static final String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SEND_PERMISSION = "com.google.android.gms.auth.api.phone.permission.SEND";
    public static final String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";

    private SmsRetriever()
    {
        return;
    }

    public static com.google.android.gms.auth.api.phone.SmsRetrieverClient getClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.auth-api-phone.zzab(p1);
    }

    public static com.google.android.gms.auth.api.phone.SmsRetrieverClient getClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.auth-api-phone.zzab(p1);
    }
}
