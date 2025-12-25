package com.google.android.gms.common.internal.service;
public final class zao extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.internal.TelemetryLoggingClient {
    public static final synthetic int zab;
    private static final com.google.android.gms.common.api.Api$ClientKey zac;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zad;
    private static final com.google.android.gms.common.api.Api zae;

    static zao()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.common.internal.service.zao.zac = v0_1;
        com.google.android.gms.common.internal.service.zan v1_1 = new com.google.android.gms.common.internal.service.zan();
        com.google.android.gms.common.internal.service.zao.zad = v1_1;
        com.google.android.gms.common.internal.service.zao.zae = new com.google.android.gms.common.api.Api("ClientTelemetry.API", v1_1, v0_1);
        return;
    }

    public zao(android.content.Context p3, com.google.android.gms.common.internal.TelemetryLoggingOptions p4)
    {
        super(p3, com.google.android.gms.common.internal.service.zao.zae, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task log(com.google.android.gms.common.internal.TelemetryData p3)
    {
        com.google.android.gms.common.api.internal.TaskApiCall$Builder v0 = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        v0.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zaf.zaa}));
        v0.setAutoResolveMissingFeatures(0);
        v0.run(new com.google.android.gms.common.internal.service.zam(p3));
        return this.doBestEffortWrite(v0.build());
    }
}
