package com.google.android.gms.common.api;
public final class PendingResults {

    private PendingResults()
    {
        return;
    }

    public static com.google.android.gms.common.api.PendingResult canceledPendingResult()
    {
        com.google.android.gms.common.api.internal.StatusPendingResult v0_1 = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        v0_1.cancel();
        return v0_1;
    }

    public static com.google.android.gms.common.api.PendingResult canceledPendingResult(com.google.android.gms.common.api.Result p2)
    {
        com.google.android.gms.common.api.zaf v0_5;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Result must not be null");
        if (p2.getStatus().getStatusCode() != 16) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_5, "Status code must be CommonStatusCodes.CANCELED");
        com.google.android.gms.common.api.zaf v0_2 = new com.google.android.gms.common.api.zaf(p2);
        v0_2.cancel();
        return v0_2;
    }

    public static com.google.android.gms.common.api.PendingResult immediateFailedResult(com.google.android.gms.common.api.Result p2, com.google.android.gms.common.api.GoogleApiClient p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Result must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument((p2.getStatus().isSuccess() ^ 1), "Status code must not be SUCCESS");
        com.google.android.gms.common.api.zag v0_1 = new com.google.android.gms.common.api.zag(p3, p2);
        v0_1.setResult(p2);
        return v0_1;
    }

    public static com.google.android.gms.common.api.OptionalPendingResult immediatePendingResult(com.google.android.gms.common.api.Result p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Result must not be null");
        com.google.android.gms.common.api.zah v0_2 = new com.google.android.gms.common.api.zah(0);
        v0_2.setResult(p2);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(v0_2);
    }

    public static com.google.android.gms.common.api.OptionalPendingResult immediatePendingResult(com.google.android.gms.common.api.Result p1, com.google.android.gms.common.api.GoogleApiClient p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Result must not be null");
        com.google.android.gms.common.api.zah v0_2 = new com.google.android.gms.common.api.zah(p2);
        v0_2.setResult(p1);
        return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(v0_2);
    }

    public static com.google.android.gms.common.api.PendingResult immediatePendingResult(com.google.android.gms.common.api.Status p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult v0_2 = new com.google.android.gms.common.api.internal.StatusPendingResult(android.os.Looper.getMainLooper());
        v0_2.setResult(p2);
        return v0_2;
    }

    public static com.google.android.gms.common.api.PendingResult immediatePendingResult(com.google.android.gms.common.api.Status p1, com.google.android.gms.common.api.GoogleApiClient p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Result must not be null");
        com.google.android.gms.common.api.internal.StatusPendingResult v0_2 = new com.google.android.gms.common.api.internal.StatusPendingResult(p2);
        v0_2.setResult(p1);
        return v0_2;
    }
}
