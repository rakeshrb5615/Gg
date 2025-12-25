package com.google.android.gms.common.internal;
public class TelemetryLogging {

    private TelemetryLogging()
    {
        return;
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context p1)
    {
        return com.google.android.gms.common.internal.TelemetryLogging.getClient(p1, com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa);
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context p1, com.google.android.gms.common.internal.TelemetryLoggingOptions p2)
    {
        return new com.google.android.gms.common.internal.service.zao(p1, p2);
    }
}
