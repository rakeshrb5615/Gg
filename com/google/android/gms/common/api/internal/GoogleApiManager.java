package com.google.android.gms.common.api.internal;
public class GoogleApiManager implements android.os.Handler$Callback {
    public static final com.google.android.gms.common.api.Status zaa;
    private static final com.google.android.gms.common.api.Status zab;
    private static final Object zac;
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private long zae;
    private boolean zaf;
    private com.google.android.gms.common.internal.TelemetryData zag;
    private com.google.android.gms.common.internal.TelemetryLoggingClient zah;
    private final android.content.Context zai;
    private final com.google.android.gms.common.GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final java.util.concurrent.atomic.AtomicInteger zal;
    private final java.util.concurrent.atomic.AtomicInteger zam;
    private final java.util.Map zan;
    private com.google.android.gms.common.api.internal.zaae zao;
    private final java.util.Set zap;
    private final java.util.Set zaq;
    private final android.os.Handler zar;
    private volatile boolean zas;

    static GoogleApiManager()
    {
        com.google.android.gms.common.api.internal.GoogleApiManager.zaa = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");
        com.google.android.gms.common.api.internal.GoogleApiManager.zab = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");
        com.google.android.gms.common.api.internal.GoogleApiManager.zac = new Object();
        return;
    }

    private GoogleApiManager(android.content.Context p6, android.os.Looper p7, com.google.android.gms.common.GoogleApiAvailability p8)
    {
        this.zae = 10000;
        this.zaf = 0;
        this.zal = new java.util.concurrent.atomic.AtomicInteger(1);
        this.zam = new java.util.concurrent.atomic.AtomicInteger(0);
        this.zan = new java.util.concurrent.ConcurrentHashMap(5, 1061158912, 1);
        this.zao = 0;
        this.zap = new r.f(0);
        this.zaq = new r.f(0);
        this.zas = 1;
        this.zai = p6;
        com.google.android.gms.internal.base.zau v1_9 = new com.google.android.gms.internal.base.zau(p7, this);
        this.zar = v1_9;
        this.zaj = p8;
        this.zak = new com.google.android.gms.common.internal.zal(p8);
        if (com.google.android.gms.common.util.DeviceProperties.isAuto(p6)) {
            this.zas = 0;
        }
        v1_9.sendMessage(v1_9.obtainMessage(6));
        return;
    }

    public static void reportSignOut()
    {
        android.os.Handler v1_0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad;
        if (v1_0 != null) {
            v1_0.zam.incrementAndGet();
            android.os.Handler v1_2 = v1_0.zar;
            v1_2.sendMessageAtFrontOfQueue(v1_2.obtainMessage(10));
        }
        return;
    }

    public static bridge synthetic boolean zaC(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zas;
    }

    private static com.google.android.gms.common.api.Status zaF(com.google.android.gms.common.api.internal.ApiKey p4, com.google.android.gms.common.ConnectionResult p5)
    {
        return new com.google.android.gms.common.api.Status(p5, g2.g.f("API: ", p4.zaa(), " is not available on this device. Connection failed with: ", String.valueOf(p5)));
    }

    private final com.google.android.gms.common.api.internal.zabq zaG(com.google.android.gms.common.api.GoogleApi p3)
    {
        com.google.android.gms.common.api.internal.zabq v0_0 = this.zan;
        com.google.android.gms.common.api.internal.ApiKey v1 = p3.getApiKey();
        com.google.android.gms.common.api.internal.zabq v0_2 = ((com.google.android.gms.common.api.internal.zabq) v0_0.get(v1));
        if (v0_2 == null) {
            v0_2 = new com.google.android.gms.common.api.internal.zabq(this, p3);
            this.zan.put(v1, v0_2);
        }
        if (v0_2.zaA()) {
            this.zaq.add(v1);
        }
        v0_2.zao();
        return v0_2;
    }

    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaH()
    {
        if (this.zah == null) {
            this.zah = com.google.android.gms.common.internal.TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    private final void zaI()
    {
        int v0_0 = this.zag;
        if (v0_0 != 0) {
            if ((v0_0.zaa() > 0) || (this.zaD())) {
                this.zaH().log(v0_0);
            }
            this.zag = 0;
        }
        return;
    }

    private final void zaJ(com.google.android.gms.tasks.TaskCompletionSource p2, int p3, com.google.android.gms.common.api.GoogleApi p4)
    {
        if (p3 != null) {
            com.google.android.gms.common.api.internal.zacd v3_1 = com.google.android.gms.common.api.internal.zacd.zaa(this, p3, p4.getApiKey());
            if (v3_1 != null) {
                com.google.android.gms.tasks.Task v2_1 = p2.getTask();
                android.os.Handler v4_2 = this.zar;
                v4_2.getClass();
                v2_1.addOnCompleteListener(new com.google.android.gms.common.api.internal.zabk(v4_2), v3_1);
            }
        }
        return;
    }

    public static bridge synthetic long zab(com.google.android.gms.common.api.internal.GoogleApiManager p2)
    {
        return p2.zae;
    }

    public static bridge synthetic android.content.Context zac(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zai;
    }

    public static bridge synthetic android.os.Handler zad(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zar;
    }

    public static bridge synthetic com.google.android.gms.common.GoogleApiAvailability zae(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zaj;
    }

    public static bridge synthetic com.google.android.gms.common.api.Status zaf()
    {
        return com.google.android.gms.common.api.internal.GoogleApiManager.zab;
    }

    public static bridge synthetic com.google.android.gms.common.api.Status zag(com.google.android.gms.common.api.internal.ApiKey p0, com.google.android.gms.common.ConnectionResult p1)
    {
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaF(p0, p1);
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.zaae zah(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zao;
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zaj()
    {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.api.internal.GoogleApiManager.zad, "Must guarantee manager is non-null before using getInstance");
            return com.google.android.gms.common.api.internal.GoogleApiManager.zad;
        } catch (Throwable v1_2) {
            throw v1_2;
        }
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zak(android.content.Context p4)
    {
        if (com.google.android.gms.common.api.internal.GoogleApiManager.zad == null) {
            com.google.android.gms.common.api.internal.GoogleApiManager.zad = new com.google.android.gms.common.api.internal.GoogleApiManager(p4.getApplicationContext(), com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread().getLooper(), com.google.android.gms.common.GoogleApiAvailability.getInstance());
        }
        return com.google.android.gms.common.api.internal.GoogleApiManager.zad;
    }

    public static bridge synthetic com.google.android.gms.common.internal.zal zal(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zak;
    }

    public static bridge synthetic Object zaq()
    {
        return com.google.android.gms.common.api.internal.GoogleApiManager.zac;
    }

    public static bridge synthetic java.util.Map zar(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zan;
    }

    public static bridge synthetic java.util.Set zas(com.google.android.gms.common.api.internal.GoogleApiManager p0)
    {
        return p0.zap;
    }

    public static bridge synthetic void zat(com.google.android.gms.common.api.internal.GoogleApiManager p0, boolean p1)
    {
        p0.zaf = 1;
        return;
    }

    public final boolean handleMessage(android.os.Message p10)
    {
        com.google.android.gms.common.internal.TelemetryData v0_0 = p10.what;
        String v2_4 = 300000;
        com.google.android.gms.common.api.internal.zabq v5 = 0;
        switch (v0_0) {
            case 1:
                if (1 == ((Boolean) p10.obj).booleanValue()) {
                    v2_4 = 10000;
                }
                this.zae = v2_4;
                this.zar.removeMessages(12);
                com.google.android.gms.common.api.Status v10_50 = this.zan.keySet().iterator();
                while (v10_50.hasNext()) {
                    String v2_12 = this.zar;
                    v2_12.sendMessageDelayed(v2_12.obtainMessage(12, ((com.google.android.gms.common.api.internal.ApiKey) v10_50.next())), this.zae);
                }
                break;
            case 2:
                com.google.android.gms.common.api.Status v10_43 = ((com.google.android.gms.common.api.internal.zal) p10.obj);
                com.google.android.gms.common.internal.TelemetryData v0_42 = v10_43.zab().iterator();
                while (v0_42.hasNext()) {
                    String v2_11 = ((com.google.android.gms.common.api.internal.ApiKey) v0_42.next());
                    String v3_6 = ((com.google.android.gms.common.api.internal.zabq) this.zan.get(v2_11));
                    if (v3_6 != null) {
                        if (!v3_6.zaz()) {
                            com.google.android.gms.common.ConnectionResult v4_1 = v3_6.zad();
                            if (v4_1 == null) {
                                v3_6.zat(v10_43);
                                v3_6.zao();
                            } else {
                                v10_43.zac(v2_11, v4_1, 0);
                            }
                        } else {
                            v10_43.zac(v2_11, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS, v3_6.zaf().getEndpointPackageName());
                        }
                    } else {
                        v10_43.zac(v2_11, new com.google.android.gms.common.ConnectionResult(13), 0);
                        break;
                    }
                }
                break;
            case 3:
                com.google.android.gms.common.api.Status v10_41 = this.zan.values().iterator();
                while (v10_41.hasNext()) {
                    com.google.android.gms.common.internal.TelemetryData v0_40 = ((com.google.android.gms.common.api.internal.zabq) v10_41.next());
                    v0_40.zan();
                    v0_40.zao();
                }
                break;
            case 4:
            case 8:
            case 13:
                com.google.android.gms.common.api.Status v10_36 = ((com.google.android.gms.common.api.internal.zach) p10.obj);
                com.google.android.gms.common.internal.TelemetryData v0_35 = ((com.google.android.gms.common.api.internal.zabq) this.zan.get(v10_36.zac.getApiKey()));
                if (v0_35 == null) {
                    v0_35 = this.zaG(v10_36.zac);
                }
                if ((!v0_35.zaA()) || (this.zam.get() == v10_36.zab)) {
                    v0_35.zap(v10_36.zaa);
                } else {
                    v10_36.zaa.zad(com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
                    v0_35.zav();
                }
                break;
            case 5:
                com.google.android.gms.common.internal.TelemetryData v0_25 = p10.arg1;
                com.google.android.gms.common.api.Status v10_29 = ((com.google.android.gms.common.ConnectionResult) p10.obj);
                String v2_3 = this.zan.values().iterator();
                while (v2_3.hasNext()) {
                    String v3_2 = ((com.google.android.gms.common.api.internal.zabq) v2_3.next());
                    if (v3_2.zab() == v0_25) {
                        v5 = v3_2;
                        break;
                    }
                }
                if (v5 == null) {
                    android.util.Log.wtf("GoogleApiManager", v1.a.j("Could not find API instance ", v0_25, " while trying to fail enqueued calls."), new Exception());
                } else {
                    if (v10_29.getErrorCode() != 13) {
                        com.google.android.gms.common.api.internal.zabq.zai(v5, com.google.android.gms.common.api.internal.GoogleApiManager.zaF(com.google.android.gms.common.api.internal.zabq.zag(v5), v10_29));
                    } else {
                        com.google.android.gms.common.api.internal.zabq.zai(v5, new com.google.android.gms.common.api.Status(17, g2.g.f("Error resolution was canceled by the user, original error message: ", this.zaj.getErrorString(v10_29.getErrorCode()), ": ", v10_29.getErrorMessage())));
                    }
                }
                break;
            case 6:
                if (!(this.zai.getApplicationContext() instanceof android.app.Application)) {
                } else {
                    com.google.android.gms.common.api.internal.BackgroundDetector.initialize(((android.app.Application) this.zai.getApplicationContext()));
                    com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new com.google.android.gms.common.api.internal.zabl(this));
                    if (com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().readCurrentStateIfPossible(1)) {
                    } else {
                        this.zae = 300000;
                    }
                }
                break;
            case 7:
                this.zaG(((com.google.android.gms.common.api.GoogleApi) p10.obj));
                break;
            case 9:
                if (!this.zan.containsKey(p10.obj)) {
                } else {
                    ((com.google.android.gms.common.api.internal.zabq) this.zan.get(p10.obj)).zau();
                }
                break;
            case 10:
                com.google.android.gms.common.api.Status v10_12 = this.zaq.iterator();
                while (v10_12.hasNext()) {
                    com.google.android.gms.common.internal.TelemetryData v0_18 = ((com.google.android.gms.common.api.internal.zabq) this.zan.remove(((com.google.android.gms.common.api.internal.ApiKey) v10_12.next())));
                    if (v0_18 != null) {
                        v0_18.zav();
                    }
                }
                this.zaq.clear();
                break;
            case 11:
                if (!this.zan.containsKey(p10.obj)) {
                } else {
                    ((com.google.android.gms.common.api.internal.zabq) this.zan.get(p10.obj)).zaw();
                }
                break;
            case 12:
                if (!this.zan.containsKey(p10.obj)) {
                } else {
                    ((com.google.android.gms.common.api.internal.zabq) this.zan.get(p10.obj)).zaB();
                }
                break;
            case 14:
                com.google.android.gms.common.api.Status v10_63 = ((com.google.android.gms.common.api.internal.zaaf) p10.obj);
                com.google.android.gms.common.internal.TelemetryData v0_64 = v10_63.zaa();
                if (this.zan.containsKey(v0_64)) {
                    v10_63.zab().setResult(Boolean.valueOf(com.google.android.gms.common.api.internal.zabq.zay(((com.google.android.gms.common.api.internal.zabq) this.zan.get(v0_64)), 0)));
                } else {
                    v10_63.zab().setResult(Boolean.FALSE);
                }
                break;
            case 15:
                com.google.android.gms.common.api.Status v10_61 = ((com.google.android.gms.common.api.internal.zabs) p10.obj);
                if (!this.zan.containsKey(com.google.android.gms.common.api.internal.zabs.zab(v10_61))) {
                } else {
                    com.google.android.gms.common.api.internal.zabq.zal(((com.google.android.gms.common.api.internal.zabq) this.zan.get(com.google.android.gms.common.api.internal.zabs.zab(v10_61))), v10_61);
                }
                break;
            case 16:
                com.google.android.gms.common.api.Status v10_59 = ((com.google.android.gms.common.api.internal.zabs) p10.obj);
                if (!this.zan.containsKey(com.google.android.gms.common.api.internal.zabs.zab(v10_59))) {
                } else {
                    com.google.android.gms.common.api.internal.zabq.zam(((com.google.android.gms.common.api.internal.zabq) this.zan.get(com.google.android.gms.common.api.internal.zabs.zab(v10_59))), v10_59);
                }
                break;
            case 17:
                this.zaI();
                break;
            case 18:
                com.google.android.gms.common.api.Status v10_3 = ((com.google.android.gms.common.api.internal.zace) p10.obj);
                if (v10_3.zac != 0) {
                    com.google.android.gms.common.internal.TelemetryData v0_22 = this.zag;
                    if (v0_22 != null) {
                        com.google.android.gms.common.internal.MethodInvocation v1_6 = v0_22.zab();
                        if ((v0_22.zaa() == v10_3.zab) && ((v1_6 == null) || (v1_6.size() < v10_3.zad))) {
                            this.zag.zac(v10_3.zaa);
                        } else {
                            this.zar.removeMessages(17);
                            this.zaI();
                        }
                    }
                    if (this.zag != null) {
                    } else {
                        com.google.android.gms.common.internal.TelemetryData v0_50 = new java.util.ArrayList();
                        v0_50.add(v10_3.zaa);
                        this.zag = new com.google.android.gms.common.internal.TelemetryData(v10_3.zab, v0_50);
                        com.google.android.gms.common.internal.TelemetryData v0_51 = this.zar;
                        v0_51.sendMessageDelayed(v0_51.obtainMessage(17), v10_3.zac);
                    }
                } else {
                    this.zaH().log(new com.google.android.gms.common.internal.TelemetryData(v10_3.zab, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation[] {v10_3.zaa}))));
                }
                break;
            case 19:
                this.zaf = 0;
                break;
            default:
                com.google.android.gms.common.api.Status v10_52 = new StringBuilder("Unknown message id: ");
                v10_52.append(v0_0);
                android.util.Log.w("GoogleApiManager", v10_52.toString());
                return 0;
        }
        return 1;
    }

    public final void zaA(com.google.android.gms.common.api.internal.zaae p3)
    {
        if (this.zao != p3) {
            this.zao = p3;
            this.zap.clear();
        }
        this.zap.addAll(p3.zaa());
        return;
    }

    public final void zaB(com.google.android.gms.common.api.internal.zaae p3)
    {
        if (this.zao == p3) {
            this.zao = 0;
            this.zap.clear();
        }
        return;
    }

    public final boolean zaD()
    {
        if (!this.zaf) {
            int v0_5 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if ((v0_5 != 0) && (!v0_5.getMethodInvocationTelemetryEnabled())) {
                return 0;
            } else {
                int v0_2 = this.zak.zaa(this.zai, 203400000);
                if ((v0_2 != -1) && (v0_2 != 0)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } else {
            return 0;
        }
    }

    public final boolean zaE(com.google.android.gms.common.ConnectionResult p3, int p4)
    {
        return this.zaj.zah(this.zai, p3, p4);
    }

    public final int zaa()
    {
        return this.zal.getAndIncrement();
    }

    public final com.google.android.gms.common.api.internal.zabq zai(com.google.android.gms.common.api.internal.ApiKey p2)
    {
        return ((com.google.android.gms.common.api.internal.zabq) this.zan.get(p2));
    }

    public final com.google.android.gms.tasks.Task zam(Iterable p3)
    {
        com.google.android.gms.common.api.internal.zal v0_1 = new com.google.android.gms.common.api.internal.zal(p3);
        this.zar.sendMessage(this.zar.obtainMessage(2, v0_1));
        return v0_1.zaa();
    }

    public final com.google.android.gms.tasks.Task zan(com.google.android.gms.common.api.GoogleApi p3)
    {
        com.google.android.gms.common.api.internal.zaaf v0_1 = new com.google.android.gms.common.api.internal.zaaf(p3.getApiKey());
        this.zar.sendMessage(this.zar.obtainMessage(14, v0_1));
        return v0_1.zab().getTask();
    }

    public final com.google.android.gms.tasks.Task zao(com.google.android.gms.common.api.GoogleApi p4, com.google.android.gms.common.api.internal.RegisterListenerMethod p5, com.google.android.gms.common.api.internal.UnregisterListenerMethod p6, Runnable p7)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zaJ(v0_1, p5.zaa(), p4);
        this.zar.sendMessage(this.zar.obtainMessage(8, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zaf(new com.google.android.gms.common.api.internal.zaci(p5, p6, p7), v0_1), this.zam.get(), p4)));
        return v0_1.getTask();
    }

    public final com.google.android.gms.tasks.Task zap(com.google.android.gms.common.api.GoogleApi p3, com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p4, int p5)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zaJ(v0_1, p5, p3);
        this.zar.sendMessage(this.zar.obtainMessage(13, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zah(p4, v0_1), this.zam.get(), p3)));
        return v0_1.getTask();
    }

    public final void zau(com.google.android.gms.common.api.GoogleApi p2, int p3, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p4)
    {
        this.zar.sendMessage(this.zar.obtainMessage(4, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zae(p3, p4), this.zam.get(), p2)));
        return;
    }

    public final void zav(com.google.android.gms.common.api.GoogleApi p2, int p3, com.google.android.gms.common.api.internal.TaskApiCall p4, com.google.android.gms.tasks.TaskCompletionSource p5, com.google.android.gms.common.api.internal.StatusExceptionMapper p6)
    {
        this.zaJ(p5, p4.zaa(), p2);
        this.zar.sendMessage(this.zar.obtainMessage(4, new com.google.android.gms.common.api.internal.zach(new com.google.android.gms.common.api.internal.zag(p3, p4, p5, p6), this.zam.get(), p2)));
        return;
    }

    public final void zaw(com.google.android.gms.common.internal.MethodInvocation p7, int p8, long p9, int p11)
    {
        this.zar.sendMessage(this.zar.obtainMessage(18, new com.google.android.gms.common.api.internal.zace(p7, p8, p9, p11)));
        return;
    }

    public final void zax(com.google.android.gms.common.ConnectionResult p4, int p5)
    {
        if (!this.zaE(p4, p5)) {
            android.os.Handler v0_1 = this.zar;
            v0_1.sendMessage(v0_1.obtainMessage(5, p5, 0, p4));
        }
        return;
    }

    public final void zay()
    {
        android.os.Handler v0 = this.zar;
        v0.sendMessage(v0.obtainMessage(3));
        return;
    }

    public final void zaz(com.google.android.gms.common.api.GoogleApi p3)
    {
        android.os.Handler v0 = this.zar;
        v0.sendMessage(v0.obtainMessage(7, p3));
        return;
    }
}
