package com.google.android.gms.common.moduleinstall.internal;
public final class zay extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.moduleinstall.ModuleInstallClient {
    public static final synthetic int zab;
    private static final com.google.android.gms.common.api.Api$ClientKey zac;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zad;
    private static final com.google.android.gms.common.api.Api zae;

    static zay()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.common.moduleinstall.internal.zay.zac = v0_1;
        com.google.android.gms.common.moduleinstall.internal.zaq v1_1 = new com.google.android.gms.common.moduleinstall.internal.zaq();
        com.google.android.gms.common.moduleinstall.internal.zay.zad = v1_1;
        com.google.android.gms.common.moduleinstall.internal.zay.zae = new com.google.android.gms.common.api.Api("ModuleInstall.API", v1_1, v0_1);
        return;
    }

    public zay(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.common.moduleinstall.internal.zay.zae, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zay(android.content.Context p4)
    {
        super(p4, com.google.android.gms.common.moduleinstall.internal.zay.zae, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public static final varargs com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zad(boolean p4, com.google.android.gms.common.api.OptionalModuleApi[] p5)
    {
        com.google.android.gms.common.api.OptionalModuleApi v2_1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "Requested APIs must not be null.");
        int v0_1 = p5.length;
        int v1 = 0;
        if (v0_1 <= 0) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v2_1, "Please provide at least one OptionalModuleApi.");
        while (v1 < v0_1) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p5[v1], "Requested API must not be null.");
            v1++;
        }
        return com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa(java.util.Arrays.asList(p5), p4);
    }

    public final varargs com.google.android.gms.tasks.Task areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi[] p4)
    {
        com.google.android.gms.tasks.Task v4_1 = com.google.android.gms.common.moduleinstall.internal.zay.zad(0, p4);
        if (!v4_1.getApiFeatures().isEmpty()) {
            com.google.android.gms.common.api.internal.TaskApiCall$Builder v1_3 = com.google.android.gms.common.api.internal.TaskApiCall.builder();
            v1_3.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zav.zaa}));
            v1_3.setMethodKey(27301);
            v1_3.setAutoResolveMissingFeatures(0);
            v1_3.run(new com.google.android.gms.common.moduleinstall.internal.zal(this, v4_1));
            return this.doRead(v1_3.build());
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse(1, 0));
        }
    }

    public final varargs com.google.android.gms.tasks.Task deferredInstall(com.google.android.gms.common.api.OptionalModuleApi[] p4)
    {
        com.google.android.gms.tasks.Task v4_1 = com.google.android.gms.common.moduleinstall.internal.zay.zad(0, p4);
        if (!v4_1.getApiFeatures().isEmpty()) {
            com.google.android.gms.common.api.internal.TaskApiCall$Builder v1_2 = com.google.android.gms.common.api.internal.TaskApiCall.builder();
            v1_2.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zav.zaa}));
            v1_2.setMethodKey(27302);
            v1_2.setAutoResolveMissingFeatures(0);
            v1_2.run(new com.google.android.gms.common.moduleinstall.internal.zap(this, v4_1));
            return this.doRead(v1_2.build());
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public final varargs com.google.android.gms.tasks.Task getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi[] p3)
    {
        com.google.android.gms.tasks.Task v3_1 = com.google.android.gms.common.moduleinstall.internal.zay.zad(1, p3);
        if (!v3_1.getApiFeatures().isEmpty()) {
            com.google.android.gms.common.api.internal.TaskApiCall$Builder v0_4 = com.google.android.gms.common.api.internal.TaskApiCall.builder();
            v0_4.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zav.zaa}));
            v0_4.setMethodKey(27307);
            v0_4.run(new com.google.android.gms.common.moduleinstall.internal.zan(this, v3_1));
            return this.doRead(v0_4.build());
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse(0));
        }
    }

    public final com.google.android.gms.tasks.Task installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest p8)
    {
        com.google.android.gms.common.api.internal.RegistrationMethods$Builder v4_0 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.fromModuleInstallRequest(p8);
        com.google.android.gms.common.moduleinstall.internal.zaj v3_2 = p8.getListener();
        com.google.android.gms.tasks.Task v8_8 = p8.getListenerExecutor();
        if (!v4_0.getApiFeatures().isEmpty()) {
            if (v3_2 != null) {
                com.google.android.gms.tasks.Task v8_1;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_2);
                if (v8_8 != null) {
                    v8_1 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(v3_2, v8_8, "InstallStatusListener");
                } else {
                    v8_1 = this.registerListener(v3_2, "InstallStatusListener");
                }
                com.google.android.gms.common.moduleinstall.internal.zaab v5_1 = new com.google.android.gms.common.moduleinstall.internal.zaab(v8_1);
                java.util.concurrent.atomic.AtomicReference v2_1 = new java.util.concurrent.atomic.AtomicReference();
                com.google.android.gms.common.moduleinstall.internal.zak v0_2 = new com.google.android.gms.common.moduleinstall.internal.zai(this, v2_1, v3_2, v4_0, v5_1);
                com.google.android.gms.common.moduleinstall.internal.zaj v3_1 = new com.google.android.gms.common.moduleinstall.internal.zaj(this, v5_1);
                com.google.android.gms.common.api.internal.RegistrationMethods$Builder v4_1 = com.google.android.gms.common.api.internal.RegistrationMethods.builder();
                v4_1.withHolder(v8_1);
                v4_1.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zav.zaa}));
                v4_1.setAutoResolveMissingFeatures(1);
                v4_1.register(v0_2);
                v4_1.unregister(v3_1);
                v4_1.setMethodKey(27305);
                return this.doRegisterEventListener(v4_1.build()).onSuccessTask(new com.google.android.gms.common.moduleinstall.internal.zak(v2_1));
            } else {
                com.google.android.gms.tasks.Task v8_9 = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                v8_9.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zav.zaa}));
                v8_9.setAutoResolveMissingFeatures(1);
                v8_9.setMethodKey(27304);
                v8_9.run(new com.google.android.gms.common.moduleinstall.internal.zao(this, v4_0));
                return this.doRead(v8_9.build());
            }
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.gms.common.moduleinstall.ModuleInstallResponse(0));
        }
    }

    public final varargs com.google.android.gms.tasks.Task releaseModules(com.google.android.gms.common.api.OptionalModuleApi[] p4)
    {
        com.google.android.gms.tasks.Task v4_1 = com.google.android.gms.common.moduleinstall.internal.zay.zad(0, p4);
        if (!v4_1.getApiFeatures().isEmpty()) {
            com.google.android.gms.common.api.internal.TaskApiCall$Builder v1_2 = com.google.android.gms.common.api.internal.TaskApiCall.builder();
            v1_2.setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.internal.base.zav.zaa}));
            v1_2.setMethodKey(27303);
            v1_2.setAutoResolveMissingFeatures(0);
            v1_2.run(new com.google.android.gms.common.moduleinstall.internal.zam(this, v4_1));
            return this.doRead(v1_2.build());
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
    }

    public final com.google.android.gms.tasks.Task unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener p2)
    {
        return this.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(p2, "InstallStatusListener"), 27306);
    }
}
