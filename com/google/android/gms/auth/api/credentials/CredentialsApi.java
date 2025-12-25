package com.google.android.gms.auth.api.credentials;
public interface CredentialsApi {
    public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
    public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
    public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
    public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;

    public abstract com.google.android.gms.common.api.PendingResult delete();

    public abstract com.google.android.gms.common.api.PendingResult disableAutoSignIn();

    public abstract android.app.PendingIntent getHintPickerIntent();

    public abstract com.google.android.gms.common.api.PendingResult request();

    public abstract com.google.android.gms.common.api.PendingResult save();
}
