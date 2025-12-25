package com.google.android.gms.internal.measurement;
public abstract class zzcq extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcr {

    public zzcq()
    {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return;
    }

    public static com.google.android.gms.internal.measurement.zzcr asInterface(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.internal.measurement.zzcp v0_1 = p2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
            if (!(v0_1 instanceof com.google.android.gms.internal.measurement.zzcr)) {
                return new com.google.android.gms.internal.measurement.zzcp(p2);
            } else {
                return ((com.google.android.gms.internal.measurement.zzcr) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final boolean zza(int p9, android.os.Parcel p10, android.os.Parcel p11, int p12)
    {
        com.google.android.gms.internal.measurement.zzcv v4_2 = 0;
        switch (p9) {
            case 1:
                long v2_57 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                int v3_38 = ((com.google.android.gms.internal.measurement.zzdd) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdd.CREATOR));
                com.google.android.gms.internal.measurement.zzcv v4_56 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.initialize(v2_57, v3_38, v4_56);
                break;
            case 2:
                int v1_65 = p10.readString();
                long v2_55 = p10.readString();
                int v3_35 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.internal.measurement.zzcv v4_55 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                long v5_9 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                long v6 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.logEvent(v1_65, v2_55, v3_35, v4_55, v5_9, v6);
                break;
            case 3:
                int v1_64 = p10.readString();
                long v2_54 = p10.readString();
                com.google.android.gms.internal.measurement.zzcq v0_6 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                long v5_7 = p10.readStrongBinder();
                if (v5_7 != 0) {
                    int v3_31 = v5_7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_31 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v5_7);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_31);
                    }
                }
                long v5_8 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.logEventAndBundle(v1_64, v2_54, v0_6, v4_2, v5_8);
                break;
            case 4:
                int v1_63 = p10.readString();
                long v2_51 = p10.readString();
                int v3_30 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                com.google.android.gms.internal.measurement.zzcv v4_51 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                long v5_6 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setUserProperty(v1_63, v2_51, v3_30, v4_51, v5_6);
                break;
            case 5:
                int v1_62 = p10.readString();
                long v2_49 = p10.readString();
                long v5_5 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                android.os.IBinder v7 = p10.readStrongBinder();
                if (v7 != null) {
                    int v3_28 = v7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_28 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v7);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_28);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getUserProperties(v1_62, v2_49, v5_5, v4_2);
                break;
            case 6:
                int v1_61 = p10.readString();
                long v2_48 = p10.readStrongBinder();
                if (v2_48 != 0) {
                    int v3_27 = v2_48.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_27 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v2_48);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_27);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getMaxUserProperties(v1_61, v4_2);
                break;
            case 7:
                int v1_60 = p10.readString();
                long v2_47 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setUserId(v1_60, v2_47);
                break;
            case 8:
                int v1_59 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                long v2_45 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setConditionalUserProperty(v1_59, v2_45);
                break;
            case 9:
                int v1_56 = p10.readString();
                long v2_44 = p10.readString();
                int v3_25 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.clearConditionalUserProperty(v1_56, v2_44, v3_25);
                break;
            case 10:
                int v1_55 = p10.readString();
                long v2_42 = p10.readString();
                long v5_4 = p10.readStrongBinder();
                if (v5_4 != 0) {
                    int v3_22 = v5_4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_22 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v5_4);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_22);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getConditionalUserProperties(v1_55, v2_42, v4_2);
                break;
            case 11:
                int v1_54 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                long v2_40 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setMeasurementEnabled(v1_54, v2_40);
                break;
            case 12:
                int v1_53 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.resetAnalyticsData(v1_53);
                break;
            case 13:
                int v1_52 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setMinimumSessionDuration(v1_52);
                break;
            case 14:
                int v1_51 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setSessionTimeoutDuration(v1_51);
                break;
            case 15:
                int v1_50 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_38 = p10.readString();
                int v3_21 = p10.readString();
                com.google.android.gms.internal.measurement.zzcv v4_41 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setCurrentScreen(v1_50, v2_38, v3_21, v4_41);
                break;
            case 16:
                int v1_48 = p10.readStrongBinder();
                if (v1_48 != 0) {
                    long v2_37 = v1_48.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_37 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_48);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_37);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getCurrentScreenName(v4_2);
                break;
            case 17:
                int v1_47 = p10.readStrongBinder();
                if (v1_47 != 0) {
                    long v2_36 = v1_47.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_36 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_47);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_36);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getCurrentScreenClass(v4_2);
                break;
            case 18:
                int v1_46 = p10.readStrongBinder();
                if (v1_46 != 0) {
                    long v2_35 = v1_46.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (!(v2_35 instanceof com.google.android.gms.internal.measurement.zzdc)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzdb(v1_46);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzdc) v2_35);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setInstanceIdProvider(v4_2);
                break;
            case 19:
                int v1_45 = p10.readStrongBinder();
                if (v1_45 != 0) {
                    long v2_31 = v1_45.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_31 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_45);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_31);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getCachedAppInstanceId(v4_2);
                break;
            case 20:
                int v1_44 = p10.readStrongBinder();
                if (v1_44 != 0) {
                    long v2_30 = v1_44.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_30 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_44);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_30);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getAppInstanceId(v4_2);
                break;
            case 21:
                int v1_43 = p10.readStrongBinder();
                if (v1_43 != 0) {
                    long v2_28 = v1_43.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_28 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_43);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_28);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getGmpAppId(v4_2);
                break;
            case 22:
                int v1_42 = p10.readStrongBinder();
                if (v1_42 != 0) {
                    long v2_27 = v1_42.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_27 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_42);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_27);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.generateEventId(v4_2);
                break;
            case 23:
                int v1_41 = p10.readString();
                long v2_26 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.beginAdUnitExposure(v1_41, v2_26);
                break;
            case 24:
                int v1_40 = p10.readString();
                long v2_25 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.endAdUnitExposure(v1_40, v2_25);
                break;
            case 25:
                int v1_39 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_24 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityStarted(v1_39, v2_24);
                break;
            case 26:
                int v1_37 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_23 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityStopped(v1_37, v2_23);
                break;
            case 27:
                int v1_35 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_22 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                int v3_12 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityCreated(v1_35, v2_22, v3_12);
                break;
            case 28:
                int v1_33 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_19 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityDestroyed(v1_33, v2_19);
                break;
            case 29:
                int v1_31 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_18 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityPaused(v1_31, v2_18);
                break;
            case 30:
                int v1_29 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_17 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityResumed(v1_29, v2_17);
                break;
            case 31:
                int v1_27 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v2_15 = p10.readStrongBinder();
                if (v2_15 != 0) {
                    int v3_11 = v2_15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_11 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v2_15);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_11);
                    }
                }
                long v2_16 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivitySaveInstanceState(v1_27, v4_2, v2_16);
                break;
            case 32:
                int v1_25 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                long v2_13 = p10.readStrongBinder();
                if (v2_13 != 0) {
                    int v3_9 = v2_13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_9 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v2_13);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_9);
                    }
                }
                long v2_14 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.performAction(v1_25, v4_2, v2_14);
                break;
            case 33:
                int v1_22 = p10.readInt();
                long v2_12 = p10.readString();
                int v3_8 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                com.google.android.gms.internal.measurement.zzcv v4_17 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                long v5_2 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(p10.readStrongBinder());
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.logHealthData(v1_22, v2_12, v3_8, v4_17, v5_2);
                break;
            case 34:
                int v1_21 = p10.readStrongBinder();
                if (v1_21 != 0) {
                    long v2_11 = v1_21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (!(v2_11 instanceof com.google.android.gms.internal.measurement.zzda)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcy(v1_21);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzda) v2_11);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setEventInterceptor(v4_2);
                break;
            case 35:
                int v1_20 = p10.readStrongBinder();
                if (v1_20 != 0) {
                    long v2_9 = v1_20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (!(v2_9 instanceof com.google.android.gms.internal.measurement.zzda)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcy(v1_20);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzda) v2_9);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.registerOnMeasurementEventListener(v4_2);
                break;
            case 36:
                int v1_19 = p10.readStrongBinder();
                if (v1_19 != 0) {
                    long v2_7 = v1_19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (!(v2_7 instanceof com.google.android.gms.internal.measurement.zzda)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcy(v1_19);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzda) v2_7);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.unregisterOnMeasurementEventListener(v4_2);
                break;
            case 37:
                int v1_18 = com.google.android.gms.internal.measurement.zzbn.zze(p10);
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.initForTests(v1_18);
                break;
            case 38:
                int v1_16 = p10.readStrongBinder();
                if (v1_16 != 0) {
                    long v2_5 = v1_16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_5 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_16);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_5);
                    }
                }
                int v1_17 = p10.readInt();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getTestFlag(v4_2, v1_17);
                break;
            case 39:
                int v1_15 = com.google.android.gms.internal.measurement.zzbn.zza(p10);
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setDataCollectionEnabled(v1_15);
                break;
            case 40:
                int v1_14 = p10.readStrongBinder();
                if (v1_14 != 0) {
                    long v2_4 = v1_14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_4 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_14);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_4);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.isDataCollectionEnabled(v4_2);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return 0;
            case 42:
                int v1_13 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setDefaultEventParameters(v1_13);
                break;
            case 43:
                int v1_10 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.clearMeasurementEnabled(v1_10);
                break;
            case 44:
                int v1_9 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                long v2_3 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setConsent(v1_9, v2_3);
                break;
            case 45:
                int v1_6 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                long v2_2 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setConsentThirdParty(v1_6, v2_2);
                break;
            case 46:
                int v1_3 = p10.readStrongBinder();
                if (v1_3 != 0) {
                    long v2_1 = v1_3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v2_1 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v1_3);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v2_1);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.getSessionId(v4_2);
                break;
            case 48:
                int v1_2 = ((android.content.Intent) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.content.Intent.CREATOR));
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setSgtmDebugInfo(v1_2);
                break;
            case 50:
                int v1_67 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                long v2_70 = p10.readString();
                int v3_46 = p10.readString();
                com.google.android.gms.internal.measurement.zzcv v4_58 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.setCurrentScreenByScionActivityInfo(v1_67, v2_70, v3_46, v4_58);
                break;
            case 51:
                long v2_66 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                int v3_44 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityStartedByScionActivityInfo(v2_66, v3_44);
                break;
            case 52:
                long v2_63 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                int v3_43 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityStoppedByScionActivityInfo(v2_63, v3_43);
                break;
            case 53:
                long v2_60 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                int v3_41 = ((android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(p10, android.os.Bundle.CREATOR));
                com.google.android.gms.internal.measurement.zzcv v4_57 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityCreatedByScionActivityInfo(v2_60, v3_41, v4_57);
                break;
            case 54:
                long v2_53 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                int v3_33 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityDestroyedByScionActivityInfo(v2_53, v3_33);
                break;
            case 55:
                long v2_43 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                int v3_26 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityPausedByScionActivityInfo(v2_43, v3_26);
                break;
            case 56:
                long v2_34 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                int v3_19 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivityResumedByScionActivityInfo(v2_34, v3_19);
                break;
            case 57:
                long v2_10 = ((com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(p10, com.google.android.gms.internal.measurement.zzdf.CREATOR));
                long v5_0 = p10.readStrongBinder();
                if (v5_0 != 0) {
                    int v3_10 = v5_0.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (!(v3_10 instanceof com.google.android.gms.internal.measurement.zzcu)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcs(v5_0);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcu) v3_10);
                    }
                }
                long v5_3 = p10.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.onActivitySaveInstanceStateByScionActivityInfo(v2_10, v4_2, v5_3);
                break;
            case 58:
                long v2_46 = p10.readStrongBinder();
                if (v2_46 != 0) {
                    int v3_45 = v2_46.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (!(v3_45 instanceof com.google.android.gms.internal.measurement.zzcx)) {
                        v4_2 = new com.google.android.gms.internal.measurement.zzcv(v2_46);
                    } else {
                        v4_2 = ((com.google.android.gms.internal.measurement.zzcx) v3_45);
                    }
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(p10);
                this.retrieveAndUploadBatches(v4_2);
                break;
        }
        p11.writeNoException();
        return 1;
    }
}
