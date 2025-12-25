package com.google.android.gms.common.api;
public class ApiException extends java.lang.Exception {
    protected final com.google.android.gms.common.api.Status mStatus;

    public ApiException(com.google.android.gms.common.api.Status p6)
    {
        String v1_1;
        String v0_0 = p6.getStatusCode();
        if (p6.getStatusMessage() == null) {
            v1_1 = "";
        } else {
            v1_1 = p6.getStatusMessage();
        }
        StringBuilder v4_1 = new StringBuilder(((String.valueOf(v0_0).length() + 2) + String.valueOf(v1_1).length()));
        v4_1.append(v0_0);
        v4_1.append(": ");
        v4_1.append(v1_1);
        super(v4_1.toString());
        super.mStatus = p6;
        return;
    }

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this.mStatus;
    }

    public int getStatusCode()
    {
        return this.mStatus.getStatusCode();
    }

    public String getStatusMessage()
    {
        return this.mStatus.getStatusMessage();
    }
}
