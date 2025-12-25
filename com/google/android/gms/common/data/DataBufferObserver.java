package com.google.android.gms.common.data;
public interface DataBufferObserver {

    public abstract void onDataChanged();

    public abstract void onDataRangeChanged();

    public abstract void onDataRangeInserted();

    public abstract void onDataRangeMoved();

    public abstract void onDataRangeRemoved();
}
