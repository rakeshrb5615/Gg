package com.google.android.play.core.integrity;
public abstract class IntegrityTokenResponse {

    public IntegrityTokenResponse()
    {
        return;
    }

    public abstract com.google.android.gms.tasks.Task showDialog();

    public abstract String token();
}
