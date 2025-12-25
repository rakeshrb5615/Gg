package com.google.android.gms.common.data;
public interface Freezable {

    public abstract Object freeze();

    public abstract boolean isDataValid();
}
