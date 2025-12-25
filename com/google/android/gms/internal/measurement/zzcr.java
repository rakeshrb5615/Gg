package com.google.android.gms.internal.measurement;
public interface zzcr implements android.os.IInterface {

    public abstract void beginAdUnitExposure();

    public abstract void clearConditionalUserProperty();

    public abstract void clearMeasurementEnabled();

    public abstract void endAdUnitExposure();

    public abstract void generateEventId();

    public abstract void getAppInstanceId();

    public abstract void getCachedAppInstanceId();

    public abstract void getConditionalUserProperties();

    public abstract void getCurrentScreenClass();

    public abstract void getCurrentScreenName();

    public abstract void getGmpAppId();

    public abstract void getMaxUserProperties();

    public abstract void getSessionId();

    public abstract void getTestFlag();

    public abstract void getUserProperties();

    public abstract void initForTests();

    public abstract void initialize();

    public abstract void isDataCollectionEnabled();

    public abstract void logEvent();

    public abstract void logEventAndBundle();

    public abstract void logHealthData();

    public abstract void onActivityCreated();

    public abstract void onActivityCreatedByScionActivityInfo();

    public abstract void onActivityDestroyed();

    public abstract void onActivityDestroyedByScionActivityInfo();

    public abstract void onActivityPaused();

    public abstract void onActivityPausedByScionActivityInfo();

    public abstract void onActivityResumed();

    public abstract void onActivityResumedByScionActivityInfo();

    public abstract void onActivitySaveInstanceState();

    public abstract void onActivitySaveInstanceStateByScionActivityInfo();

    public abstract void onActivityStarted();

    public abstract void onActivityStartedByScionActivityInfo();

    public abstract void onActivityStopped();

    public abstract void onActivityStoppedByScionActivityInfo();

    public abstract void performAction();

    public abstract void registerOnMeasurementEventListener();

    public abstract void resetAnalyticsData();

    public abstract void retrieveAndUploadBatches();

    public abstract void setConditionalUserProperty();

    public abstract void setConsent();

    public abstract void setConsentThirdParty();

    public abstract void setCurrentScreen();

    public abstract void setCurrentScreenByScionActivityInfo();

    public abstract void setDataCollectionEnabled();

    public abstract void setDefaultEventParameters();

    public abstract void setEventInterceptor();

    public abstract void setInstanceIdProvider();

    public abstract void setMeasurementEnabled();

    public abstract void setMinimumSessionDuration();

    public abstract void setSessionTimeoutDuration();

    public abstract void setSgtmDebugInfo();

    public abstract void setUserId();

    public abstract void setUserProperty();

    public abstract void unregisterOnMeasurementEventListener();
}
