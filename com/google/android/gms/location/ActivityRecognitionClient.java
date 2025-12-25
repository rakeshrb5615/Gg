package com.google.android.gms.location;
public interface ActivityRecognitionClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task removeActivityTransitionUpdates();

    public abstract com.google.android.gms.tasks.Task removeActivityUpdates();

    public abstract com.google.android.gms.tasks.Task removeSleepSegmentUpdates();

    public abstract com.google.android.gms.tasks.Task requestActivityTransitionUpdates();

    public abstract com.google.android.gms.tasks.Task requestActivityUpdates();

    public abstract com.google.android.gms.tasks.Task requestSleepSegmentUpdates();
}
