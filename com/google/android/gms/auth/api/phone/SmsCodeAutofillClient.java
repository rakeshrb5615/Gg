package com.google.android.gms.auth.api.phone;
public interface SmsCodeAutofillClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task checkPermissionState();

    public abstract com.google.android.gms.tasks.Task hasOngoingSmsRequest();

    public abstract com.google.android.gms.tasks.Task startSmsCodeRetriever();
}
