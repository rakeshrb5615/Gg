package com.google.android.gms.common.internal.safeparcel;
public abstract class AbstractSafeParcelable implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {

    public AbstractSafeParcelable()
    {
        return;
    }

    public final int describeContents()
    {
        return 0;
    }
}
