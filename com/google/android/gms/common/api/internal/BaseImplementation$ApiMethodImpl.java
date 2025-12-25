package com.google.android.gms.common.api.internal;
public abstract class BaseImplementation$ApiMethodImpl extends com.google.android.gms.common.api.internal.BasePendingResult implements com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder {
    private final com.google.android.gms.common.api.Api api;
    private final com.google.android.gms.common.api.Api$AnyClientKey clientKey;

    public BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api$AnyClientKey p2, com.google.android.gms.common.api.GoogleApiClient p3)
    {
        super(((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "GoogleApiClient must not be null")));
        super.clientKey = ((com.google.android.gms.common.api.Api$AnyClientKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        super.api = 0;
        return;
    }

    public BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api p2, com.google.android.gms.common.api.GoogleApiClient p3)
    {
        super(((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "GoogleApiClient must not be null")));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Api must not be null");
        super.clientKey = p2.zab();
        super.api = p2;
        return;
    }

    public BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler p1)
    {
        super(p1);
        super.clientKey = new com.google.android.gms.common.api.Api$AnyClientKey();
        super.api = 0;
        return;
    }

    private void setFailedResult(android.os.RemoteException p4)
    {
        this.setFailedResult(new com.google.android.gms.common.api.Status(8, p4.getLocalizedMessage(), 0));
        return;
    }

    public abstract void doExecute();

    public final com.google.android.gms.common.api.Api getApi()
    {
        return this.api;
    }

    public final com.google.android.gms.common.api.Api$AnyClientKey getClientKey()
    {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.Result p1)
    {
        return;
    }

    public final void run(com.google.android.gms.common.api.Api$AnyClient p1)
    {
        try {
            this.doExecute(p1);
            return;
        } catch (android.os.RemoteException v1_2) {
            this.setFailedResult(v1_2);
            throw v1_2;
        } catch (android.os.RemoteException v1_1) {
            this.setFailedResult(v1_1);
            return;
        }
    }

    public final void setFailedResult(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument((p3.isSuccess() ^ 1), "Failed result must not be success");
        com.google.android.gms.common.api.Result v3_1 = this.createFailedResult(p3);
        this.setResult(v3_1);
        this.onSetFailedResult(v3_1);
        return;
    }

    public bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }
}
