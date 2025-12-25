package com.google.android.gms.common.internal;
public abstract class BaseGmsClient {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = None;
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final com.google.android.gms.common.Feature[] zze;
    private volatile String zzA;
    private volatile com.google.android.gms.common.wrappers.AttributionSourceWrapper zzB;
    private com.google.android.gms.common.ConnectionResult zzC;
    private boolean zzD;
    private volatile com.google.android.gms.common.internal.zzj zzE;
    com.google.android.gms.common.internal.zzs zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;

    static BaseGmsClient()
    {
        String[] v0_1 = new com.google.android.gms.common.Feature[0];
        com.google.android.gms.common.internal.BaseGmsClient.zze = v0_1;
        com.google.android.gms.common.internal.BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = new String[] {"service_esmobile", "service_googleme"});
        return;
    }

    public BaseGmsClient(android.content.Context p4, android.os.Handler p5, com.google.android.gms.common.internal.GmsClientSupervisor p6, com.google.android.gms.common.GoogleApiAvailabilityLight p7, int p8, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks p9, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener p10)
    {
        this.zzk = 0;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzC = 0;
        this.zzD = 0;
        this.zzE = 0;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Context must not be null");
        this.zzl = p4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "Handler must not be null");
        this.zzb = p5;
        this.zzm = p5.getLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "Supervisor must not be null");
        this.zzn = p6;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7, "API availability must not be null");
        this.zzo = p7;
        this.zzy = p8;
        this.zzw = p9;
        this.zzx = p10;
        this.zzz = 0;
        return;
    }

    public BaseGmsClient(android.content.Context p10, android.os.Looper p11, int p12, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks p13, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener p14, String p15)
    {
        com.google.android.gms.common.internal.GmsClientSupervisor v3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(p10);
        com.google.android.gms.common.GoogleApiAvailabilityLight v4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p13);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p14);
        this(p10, p11, v3, v4, p12, p13, p14, p15);
        return;
    }

    public BaseGmsClient(android.content.Context p3, android.os.Looper p4, com.google.android.gms.common.internal.GmsClientSupervisor p5, com.google.android.gms.common.GoogleApiAvailabilityLight p6, int p7, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks p8, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener p9, String p10)
    {
        this.zzk = 0;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzC = 0;
        this.zzD = 0;
        this.zzE = 0;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Context must not be null");
        this.zzl = p3;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Looper must not be null");
        this.zzm = p4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "Supervisor must not be null");
        this.zzn = p5;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "API availability must not be null");
        this.zzo = p6;
        this.zzb = new com.google.android.gms.common.internal.zzb(this, p4);
        this.zzy = p7;
        this.zzw = p8;
        this.zzx = p9;
        this.zzz = p10;
        return;
    }

    private final void zzp(int p13, android.os.IInterface p14)
    {
        Object v3;
        android.os.Bundle v0_0 = 0;
        if (p13 == 4) {
            v3 = 1;
        } else {
            v3 = 0;
        }
        String v4_10;
        if (p14 != 0) {
            v4_10 = 1;
        } else {
            v4_10 = 0;
        }
        if (v3 == v4_10) {
            v0_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_0);
        this.zzv = p13;
        this.zzs = p14;
        android.os.Bundle v0_1 = 0;
        if (p13 == 1) {
            java.util.concurrent.Executor v8_3 = this.zzu;
            if (v8_3 != null) {
                String v4_8 = this.zzn;
                String v5_8 = this.zza.zza();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_8);
                v4_8.zzb(v5_8, this.zza.zzb(), 4225, v8_3, this.zza(), this.zza.zzc());
                this.zzu = 0;
            }
        } else {
            if ((p13 == 2) || (p13 == 3)) {
                com.google.android.gms.common.internal.zzn v9_5 = this.zzu;
                if (v9_5 != null) {
                    String v5_9 = this.zza;
                    if (v5_9 != null) {
                        StringBuilder v7_9 = v5_9.zza();
                        String v5_10 = v5_9.zzb();
                        int v10_6 = new StringBuilder(((String.valueOf(v7_9).length() + 70) + String.valueOf(v5_10).length()));
                        v10_6.append("Calling connect() while still connected, missing disconnect() for ");
                        v10_6.append(v7_9);
                        v10_6.append(" on ");
                        v10_6.append(v5_10);
                        android.util.Log.e("GmsClient", v10_6.toString());
                        String v5_11 = this.zzn;
                        int v6_9 = this.zza.zza();
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_9);
                        v5_11.zzb(v6_9, this.zza.zzb(), 4225, v9_5, this.zza(), this.zza.zzc());
                        this.zzd.incrementAndGet();
                    }
                }
                String v5_1;
                int v13_18 = new com.google.android.gms.common.internal.zze(this, this.zzd.get());
                this.zzu = v13_18;
                if ((this.zzv != 3) || (this.getLocalStartServiceAction() == null)) {
                    v5_1 = new com.google.android.gms.common.internal.zzs(this.getStartServicePackage(), this.getStartServiceAction(), 0, 4225, this.getUseDynamicLookup());
                } else {
                    v5_1 = new com.google.android.gms.common.internal.zzs(this.getContext().getPackageName(), this.getLocalStartServiceAction(), 1, 4225, 0);
                }
                this.zza = v5_1;
                if (v5_1.zzc()) {
                    if (this.getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.zza())));
                    } else {
                    }
                }
                String v1_1 = this.zzn;
                String v4_5 = this.zza.zza();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_5);
                int v13_3 = v1_1.zza(new com.google.android.gms.common.internal.zzn(v4_5, this.zza.zzb(), 4225, this.zza.zzc()), v13_18, this.zza(), this.getBindServiceExecutor());
                if (!v13_3.isSuccess()) {
                    int v14_7;
                    String v4_7 = this.zza.zza();
                    String v5_7 = this.zza.zzb();
                    StringBuilder v7_7 = new StringBuilder(((String.valueOf(v4_7).length() + 34) + String.valueOf(v5_7).length()));
                    v7_7.append("unable to connect to service: ");
                    v7_7.append(v4_7);
                    v7_7.append(" on ");
                    v7_7.append(v5_7);
                    android.util.Log.w("GmsClient", v7_7.toString());
                    if (v13_3.getErrorCode() != -1) {
                        v14_7 = v13_3.getErrorCode();
                    } else {
                        v14_7 = 16;
                    }
                    if (v13_3.getResolution() != null) {
                        v0_1 = new android.os.Bundle();
                        v0_1.putParcelable("pendingIntent", v13_3.getResolution());
                    }
                    this.zzb(v14_7, v0_1, this.zzd.get());
                }
            } else {
                if (p13 == 4) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(p14);
                    this.onConnectedLocked(((android.os.IInterface) p14));
                } else {
                }
            }
        }
        return;
    }

    public void checkAvailabilityAndConnect()
    {
        com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter v0_1 = this.zzo.isGooglePlayServicesAvailable(this.zzl, this.getMinApkVersion());
        if (v0_1 == null) {
            this.connect(new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter(this));
            return;
        } else {
            this.zzp(1, 0);
            this.triggerNotAvailable(new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter(this), v0_1, 0);
            return;
        }
    }

    public final void checkConnected()
    {
        if (!this.isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else {
            return;
        }
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Connection progress callbacks cannot be null.");
        this.zzc = p2;
        this.zzp(2, 0);
        return;
    }

    public abstract android.os.IInterface createServiceInterface();

    public void disconnect()
    {
        this.zzd.incrementAndGet();
        Throwable v0_2 = this.zzt;
        int v1_2 = v0_2.size();
        int v2 = 0;
        while (v2 < v1_2) {
            ((com.google.android.gms.common.internal.zzc) v0_2.get(v2)).zzf();
            v2++;
        }
        v0_2.clear();
        this.zzr = 0;
        this.zzp(1, 0);
        return;
    }

    public void disconnect(String p1)
    {
        this.zzk = p1;
        this.disconnect();
        return;
    }

    public void dump(String p19, java.io.FileDescriptor p20, java.io.PrintWriter p21, String[] p22)
    {
        String v4_22 = this.zzv;
        String v5_1 = this.zzs;
        int v3_10 = this.zzr;
        p21.append(p19).append("mConnectState=");
        if (v4_22 == 1) {
            p21.print("DISCONNECTED");
        } else {
            if (v4_22 == 2) {
                p21.print("REMOTE_CONNECTING");
            } else {
                if (v4_22 == 3) {
                    p21.print("LOCAL_CONNECTING");
                } else {
                    if (v4_22 == 4) {
                        p21.print("CONNECTED");
                    } else {
                        if (v4_22 == 5) {
                            p21.print("DISCONNECTING");
                        } else {
                            p21.print("UNKNOWN");
                        }
                    }
                }
            }
        }
        p21.append(" mService=");
        if (v5_1 != null) {
            p21.append(this.getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(v5_1.asBinder())));
        } else {
            p21.append("null");
        }
        p21.append(" mServiceBroker=");
        if (v3_10 != 0) {
            p21.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(v3_10.asBinder())));
        } else {
            p21.println("null");
        }
        String v16;
        int v3_9 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzh <= 0) {
            v16 = 0;
        } else {
            String v4_34 = p21.append(p19).append("lastConnectedTime=");
            int v11_3 = this.zzh;
            String v13_2 = v3_9.format(new java.util.Date(v11_3));
            v16 = 0;
            String v9_1 = new StringBuilder(((String.valueOf(v11_3).length() + 1) + String.valueOf(v13_2).length()));
            v9_1.append(v11_3);
            v9_1.append(" ");
            v9_1.append(v13_2);
            v4_34.println(v9_1.toString());
        }
        if (this.zzg > v16) {
            p21.append(p19).append("lastSuspendedCause=");
            String v4_2 = this.zzf;
            if (v4_2 == 1) {
                p21.append("CAUSE_SERVICE_DISCONNECTED");
            } else {
                if (v4_2 == 2) {
                    p21.append("CAUSE_NETWORK_LOST");
                } else {
                    if (v4_2 == 3) {
                        p21.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    } else {
                        p21.append(String.valueOf(v4_2));
                    }
                }
            }
            String v4_8 = p21.append(" lastSuspendedTime=");
            String v6_1 = this.zzg;
            String v9_7 = v3_9.format(new java.util.Date(v6_1));
            StringBuilder v12_1 = new StringBuilder(((String.valueOf(v6_1).length() + 1) + String.valueOf(v9_7).length()));
            v12_1.append(v6_1);
            v12_1.append(" ");
            v12_1.append(v9_7);
            v4_8.println(v12_1.toString());
        }
        if (this.zzj > v16) {
            p21.append(p19).append("lastFailedStatus=").append(com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzi));
            java.io.PrintWriter v0_4 = p21.append(" lastFailedTime=");
            String v6_5 = this.zzj;
            String v2_2 = v3_9.format(new java.util.Date(v6_5));
            StringBuilder v8_2 = new StringBuilder(((String.valueOf(v6_5).length() + 1) + String.valueOf(v2_2).length()));
            v8_2.append(v6_5);
            v8_2.append(" ");
            v8_2.append(v2_2);
            v0_4.println(v8_2.toString());
        }
        return;
    }

    public boolean enableLocalFallback()
    {
        return 0;
    }

    public android.accounts.Account getAccount()
    {
        return 0;
    }

    public com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.common.internal.BaseGmsClient.zze;
    }

    public com.google.android.gms.common.wrappers.AttributionSourceWrapper getAttributionSourceWrapper()
    {
        return this.zzB;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures()
    {
        com.google.android.gms.common.Feature[] v0_0 = this.zzE;
        if (v0_0 != null) {
            return v0_0.zzb;
        } else {
            return 0;
        }
    }

    public java.util.concurrent.Executor getBindServiceExecutor()
    {
        return 0;
    }

    public android.os.Bundle getConnectionHint()
    {
        return 0;
    }

    public final android.content.Context getContext()
    {
        return this.zzl;
    }

    public String getEndpointPackageName()
    {
        if (this.isConnected()) {
            String v0_2 = this.zza;
            if (v0_2 != null) {
                return v0_2.zzb();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId()
    {
        return this.zzy;
    }

    public android.os.Bundle getGetServiceRequestExtraArgs()
    {
        return new android.os.Bundle();
    }

    public String getLastDisconnectMessage()
    {
        return this.zzk;
    }

    public String getLocalStartServiceAction()
    {
        return 0;
    }

    public final android.os.Looper getLooper()
    {
        return this.zzm;
    }

    public int getMinApkVersion()
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor p19, java.util.Set p20)
    {
        com.google.android.gms.common.internal.zzd v4_2;
        int v2_2 = this.getGetServiceRequestExtraArgs();
        if (android.os.Build$VERSION.SDK_INT >= 31) {
            if (this.zzB != null) {
                com.google.android.gms.common.internal.zzd v4_1 = this.zzB.getAttributionSource();
                if (v4_1 != null) {
                    if (v4_1.getAttributionTag() != null) {
                        v4_2 = v4_1.getAttributionTag();
                    } else {
                        v4_2 = this.zzA;
                    }
                } else {
                    v4_2 = this.zzA;
                }
            } else {
                v4_2 = this.zzA;
            }
        } else {
            v4_2 = this.zzA;
        }
        com.google.android.gms.common.Feature[] v12 = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        String v3_3 = new com.google.android.gms.common.internal.GetServiceRequest(6, this.zzy, com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, 0, 0, com.google.android.gms.common.internal.GetServiceRequest.zza, new android.os.Bundle(), 0, v12, v12, 1, 0, 0, v4_2);
        v3_3.zzf = this.zzl.getPackageName();
        v3_3.zzi = v2_2;
        if (p20 != null) {
            int v2_4 = new com.google.android.gms.common.api.Scope[0];
            v3_3.zzh = ((com.google.android.gms.common.api.Scope[]) p20.toArray(v2_4));
        }
        if (!this.requiresSignIn()) {
            if (this.requiresAccount()) {
                v3_3.zzj = this.getAccount();
            }
        } else {
            String v0_11 = this.getAccount();
            if (v0_11 == null) {
                v0_11 = new android.accounts.Account("<<default account>>", "com.google");
            }
            v3_3.zzj = v0_11;
            if (p19 != null) {
                v3_3.zzg = p19.asBinder();
            }
        }
        v3_3.zzk = com.google.android.gms.common.internal.BaseGmsClient.zze;
        v3_3.zzl = this.getApiFeatures();
        if (this.usesClientTelemetry()) {
            v3_3.zzo = 1;
        }
        try {
        } catch (String v0_4) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", v0_4);
            this.triggerConnectionSuspended(3);
            return;
        } catch (String v0_3) {
            throw v0_3;
        } catch (String v0_21) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", v0_21);
            this.onPostInitHandler(8, 0, 0, this.zzd.get());
            return;
        } catch (String v0_21) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", v0_21);
            this.onPostInitHandler(8, 0, 0, this.zzd.get());
            return;
        }
        String v0_18 = this.zzr;
        if (v0_18 == null) {
            android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
        } else {
            v0_18.getService(new com.google.android.gms.common.internal.zzd(this, this.zzd.get()), v3_3);
        }
        return;
    }

    public java.util.Set getScopes()
    {
        return java.util.Collections.EMPTY_SET;
    }

    public final android.os.IInterface getService()
    {
        if (this.zzv == 5) {
            throw new android.os.DeadObjectException();
        } else {
            this.checkConnected();
            android.os.DeadObjectException v1_5 = this.zzs;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_5, "Client is connected but service is null");
            return ((android.os.IInterface) v1_5);
        }
    }

    public android.os.IBinder getServiceBrokerBinder()
    {
        android.os.IBinder v1_0 = this.zzr;
        if (v1_0 != null) {
            return v1_0.asBinder();
        } else {
            return 0;
        }
    }

    public abstract String getServiceDescriptor();

    public android.content.Intent getSignInIntent()
    {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage()
    {
        return "com.google.android.gms";
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration()
    {
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration v0_0 = this.zzE;
        if (v0_0 != null) {
            return v0_0.zzd;
        } else {
            return 0;
        }
    }

    public boolean getUseDynamicLookup()
    {
        if (this.getMinApkVersion() < 211700000) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean hasConnectionInfo()
    {
        if (this.zzE == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isConnected()
    {
        try {
            int v1_1;
            if (this.zzv != 4) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
        } catch (int v1_2) {
            throw v1_2;
        }
        return v1_1;
    }

    public boolean isConnecting()
    {
        try {
            Throwable v1_0 = this.zzv;
            int v3 = 1;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
        if (v1_0 != 2) {
            if (v1_0 != 3) {
                v3 = 0;
            } else {
            }
        }
        return v3;
    }

    public void onConnectedLocked(android.os.IInterface p3)
    {
        this.zzh = System.currentTimeMillis();
        return;
    }

    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult p3)
    {
        this.zzi = p3.getErrorCode();
        this.zzj = System.currentTimeMillis();
        return;
    }

    public void onConnectionSuspended(int p3)
    {
        this.zzf = p3;
        this.zzg = System.currentTimeMillis();
        return;
    }

    public void onPostInitHandler(int p2, android.os.IBinder p3, android.os.Bundle p4, int p5)
    {
        android.os.Handler v2_1 = this.zzb;
        v2_1.sendMessage(v2_1.obtainMessage(1, p5, -1, new com.google.android.gms.common.internal.zzf(this, p2, p3, p4)));
        return;
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks p1)
    {
        p1.onSignOutComplete();
        return;
    }

    public boolean providesSignIn()
    {
        return 0;
    }

    public boolean requiresAccount()
    {
        return 0;
    }

    public boolean requiresGooglePlayServices()
    {
        return 1;
    }

    public boolean requiresSignIn()
    {
        return 0;
    }

    public void setAttributionSourceWrapper(com.google.android.gms.common.wrappers.AttributionSourceWrapper p1)
    {
        this.zzB = p1;
        return;
    }

    public void setAttributionTag(String p1)
    {
        this.zzA = p1;
        return;
    }

    public void triggerConnectionSuspended(int p4)
    {
        android.os.Handler v1 = this.zzb;
        v1.sendMessage(v1.obtainMessage(6, this.zzd.get(), p4));
        return;
    }

    public void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks p3, int p4, android.app.PendingIntent p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Connection progress callbacks cannot be null.");
        this.zzc = p3;
        android.os.Handler v0_1 = this.zzb;
        v0_1.sendMessage(v0_1.obtainMessage(3, this.zzd.get(), p4, p5));
        return;
    }

    public boolean usesClientTelemetry()
    {
        return 0;
    }

    public final String zza()
    {
        String v0_0 = this.zzz;
        if (v0_0 == null) {
            v0_0 = this.zzl.getClass().getName();
        }
        return v0_0;
    }

    public final void zzb(int p3, android.os.Bundle p4, int p5)
    {
        android.os.Handler v3_1 = this.zzb;
        v3_1.sendMessage(v3_1.obtainMessage(7, p5, -1, new com.google.android.gms.common.internal.zzg(this, p3, p4)));
        return;
    }

    public final synthetic void zzc(com.google.android.gms.common.internal.zzj p2)
    {
        this.zzE = p2;
        if (this.usesClientTelemetry()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration v2_1;
            com.google.android.gms.common.internal.RootTelemetryConfiguration v2_2 = p2.zzd;
            com.google.android.gms.common.internal.RootTelemetryConfigManager v0_1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance();
            if (v2_2 != null) {
                v2_1 = v2_2.zza();
            } else {
                v2_1 = 0;
            }
            v0_1.zza(v2_1);
        }
        return;
    }

    public final synthetic void zzd(int p1, android.os.IInterface p2)
    {
        this.zzp(p1, 0);
        return;
    }

    public final synthetic boolean zze(int p3, int p4, android.os.IInterface p5)
    {
        if (this.zzv == p3) {
            this.zzp(p4, p5);
            return 1;
        } else {
            return 0;
        }
    }

    public final synthetic void zzf(int p4)
    {
        android.os.Message v4_2;
        if (this.zzv != 3) {
            v4_2 = 4;
        } else {
            this.zzD = 1;
            v4_2 = 5;
        }
        android.os.Handler v0_1 = this.zzb;
        v0_1.sendMessage(v0_1.obtainMessage(v4_2, this.zzd.get(), 16));
        return;
    }

    public final synthetic boolean zzg()
    {
        if (!this.zzD) {
            if (!android.text.TextUtils.isEmpty(this.getServiceDescriptor())) {
                if (!android.text.TextUtils.isEmpty(this.getLocalStartServiceAction())) {
                    try {
                        Class.forName(this.getServiceDescriptor());
                        return 1;
                    } catch (ClassNotFoundException) {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final synthetic Object zzh()
    {
        return this.zzq;
    }

    public final synthetic void zzi(com.google.android.gms.common.internal.IGmsServiceBroker p1)
    {
        this.zzr = p1;
        return;
    }

    public final synthetic java.util.ArrayList zzj()
    {
        return this.zzt;
    }

    public final synthetic com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks zzk()
    {
        return this.zzw;
    }

    public final synthetic com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener zzl()
    {
        return this.zzx;
    }

    public final synthetic com.google.android.gms.common.ConnectionResult zzm()
    {
        return this.zzC;
    }

    public final synthetic void zzn(com.google.android.gms.common.ConnectionResult p1)
    {
        this.zzC = p1;
        return;
    }

    public final synthetic boolean zzo()
    {
        return this.zzD;
    }
}
