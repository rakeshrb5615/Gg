package com.google.android.gms.common.api.internal;
final class zacx implements com.google.android.gms.tasks.Continuation {

    public zacx()
    {
        return;
    }

    public final bridge synthetic Object then(com.google.android.gms.tasks.Task p4)
    {
        if (!((Boolean) p4.getResult()).booleanValue()) {
            throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, "listener already unregistered"));
        } else {
            return 0;
        }
    }
}
