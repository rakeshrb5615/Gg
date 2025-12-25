package com.google.android.gms.common.api.internal;
final class zacd implements com.google.android.gms.tasks.OnCompleteListener {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(com.google.android.gms.common.api.internal.GoogleApiManager p1, int p2, com.google.android.gms.common.api.internal.ApiKey p3, long p4, long p6, String p8, String p9)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        this.zae = p6;
        return;
    }

    public static com.google.android.gms.common.api.internal.zacd zaa(com.google.android.gms.common.api.internal.GoogleApiManager p11, int p12, com.google.android.gms.common.api.internal.ApiKey p13)
    {
        if (p11.zaD()) {
            boolean v0_1;
            boolean v0_4 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if (!v0_4) {
                v0_1 = 1;
            } else {
                if (!v0_4.getMethodInvocationTelemetryEnabled()) {
                    return 0;
                } else {
                    v0_1 = v0_4.getMethodTimingTelemetryEnabled();
                    com.google.android.gms.common.api.internal.zacd v1_1 = p11.zai(p13);
                    if (v1_1 != null) {
                        if (!(v1_1.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                            return 0;
                        } else {
                            int v2_3 = ((com.google.android.gms.common.internal.BaseGmsClient) v1_1.zaf());
                            if ((v2_3.hasConnectionInfo()) && (!v2_3.isConnecting())) {
                                boolean v0_2 = com.google.android.gms.common.api.internal.zacd.zab(v1_1, v2_3, p12);
                                if (!v0_2) {
                                    return 0;
                                } else {
                                    v1_1.zaq();
                                    v0_1 = v0_2.getMethodTimingTelemetryEnabled();
                                }
                            }
                        }
                    }
                }
            }
            boolean v5;
            int v2_4 = 0;
            if (!v0_1) {
                v5 = 0;
            } else {
                v5 = System.currentTimeMillis();
            }
            if (v0_1) {
                v2_4 = android.os.SystemClock.elapsedRealtime();
            }
            return new com.google.android.gms.common.api.internal.zacd(p11, p12, p13, v5, v2_4, 0, 0);
        }
        return 0;
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq p2, com.google.android.gms.common.internal.BaseGmsClient p3, int p4)
    {
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration v3_1 = p3.getTelemetryConfiguration();
        if ((v3_1 != null) && (v3_1.getMethodInvocationTelemetryEnabled())) {
            int[] v1_2 = v3_1.getMethodInvocationMethodKeyAllowlist();
            if (v1_2 != null) {
                if (!com.google.android.gms.common.util.ArrayUtils.contains(v1_2, p4)) {
                    return 0;
                }
            } else {
                int[] v1_0 = v3_1.getMethodInvocationMethodKeyDisallowlist();
                if ((v1_0 != null) && (com.google.android.gms.common.util.ArrayUtils.contains(v1_0, p4))) {
                    return 0;
                }
            }
            if (p2.zac() < v3_1.getMaxMethodInvocationsLogged()) {
                return v3_1;
            }
        }
        return 0;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p22)
    {
        if (this.zaa.zaD()) {
            int v1_4 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if ((v1_4 == 0) || (v1_4.getMethodInvocationTelemetryEnabled())) {
                com.google.android.gms.common.internal.ConnectionTelemetryConfiguration v2_2 = this.zaa.zai(this.zac);
                if ((v2_2 != null) && ((v2_2.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient))) {
                    Exception v4_2;
                    long v3_4 = ((com.google.android.gms.common.internal.BaseGmsClient) v2_2.zaf());
                    Exception v5_0 = 1;
                    int v8_0 = 0;
                    if (this.zad <= 0) {
                        v4_2 = 0;
                    } else {
                        v4_2 = 1;
                    }
                    long v3_5;
                    int v1_2;
                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration v2_3;
                    int v19 = v3_4.getGCoreServiceId();
                    com.google.android.gms.common.internal.MethodInvocation v9_4 = 100;
                    if (v1_4 == 0) {
                        v1_2 = 0;
                        v3_5 = 100;
                        v2_3 = 5000;
                    } else {
                        v4_2 &= v1_4.getMethodTimingTelemetryEnabled();
                        int v10_3 = v1_4.getBatchPeriodMillis();
                        Exception v11_3 = v1_4.getMaxMethodInvocationsInBatch();
                        v1_2 = v1_4.getVersion();
                        if ((v3_4.hasConnectionInfo()) && (!v3_4.isConnecting())) {
                            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration v2_4 = com.google.android.gms.common.api.internal.zacd.zab(v2_2, v3_4, this.zab);
                            if (v2_4 == null) {
                                return;
                            } else {
                                if ((!v2_4.getMethodTimingTelemetryEnabled()) || (this.zad <= 0)) {
                                    v5_0 = 0;
                                }
                                v11_3 = v2_4.getMaxMethodInvocationsLogged();
                                v4_2 = v5_0;
                            }
                        }
                        v2_3 = v10_3;
                        v3_5 = v11_3;
                    }
                    com.google.android.gms.common.internal.MethodInvocation v12_3;
                    Exception v5_1 = this.zaa;
                    Exception v11_0 = -1;
                    if (!p22.isSuccessful()) {
                        if (!p22.isCanceled()) {
                            int v8_2 = p22.getException();
                            if (!(v8_2 instanceof com.google.android.gms.common.api.ApiException)) {
                                v8_0 = 101;
                            } else {
                                int v8_4 = ((com.google.android.gms.common.api.ApiException) v8_2).getStatus();
                                v9_4 = v8_4.getStatusCode();
                                int v8_5 = v8_4.getConnectionResult();
                                if (v8_5 != 0) {
                                    v12_3 = v8_5.getErrorCode();
                                    v8_0 = v9_4;
                                    int v13_0;
                                    long v15_0;
                                    if (v4_2 == null) {
                                        v13_0 = 0;
                                        v15_0 = 0;
                                    } else {
                                        v11_0 = ((int) (android.os.SystemClock.elapsedRealtime() - this.zae));
                                        v15_0 = System.currentTimeMillis();
                                        v13_0 = this.zad;
                                    }
                                    v5_1.zaw(new com.google.android.gms.common.internal.MethodInvocation(this.zab, v8_0, v12_3, v13_0, v15_0, 0, 0, v19, v11_0), v1_2, ((long) v2_3), v3_5);
                                    return;
                                } else {
                                    v8_0 = v9_4;
                                }
                            }
                        }
                        v12_3 = -1;
                    } else {
                        v12_3 = 0;
                    }
                }
            }
        }
        return;
    }
}
