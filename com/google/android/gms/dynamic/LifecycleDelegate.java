package com.google.android.gms.dynamic;
public interface LifecycleDelegate {

    public abstract void onCreate();

    public abstract android.view.View onCreateView();

    public abstract void onDestroy();

    public abstract void onDestroyView();

    public abstract void onInflate();

    public abstract void onLowMemory();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onSaveInstanceState();

    public abstract void onStart();

    public abstract void onStop();
}
