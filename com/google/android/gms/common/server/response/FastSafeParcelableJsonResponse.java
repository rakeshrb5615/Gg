package com.google.android.gms.common.server.response;
public abstract class FastSafeParcelableJsonResponse extends com.google.android.gms.common.server.response.FastJsonResponse implements com.google.android.gms.common.internal.safeparcel.SafeParcelable {

    public FastSafeParcelableJsonResponse()
    {
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public boolean equals(Object p6)
    {
        if (p6 != null) {
            if (this != p6) {
                if (this.getClass().isInstance(p6)) {
                    java.util.Iterator v2_2 = this.getFieldMappings().values().iterator();
                    while (v2_2.hasNext()) {
                        boolean v3_2 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v2_2.next());
                        if (!this.isFieldSet(v3_2)) {
                            if (((com.google.android.gms.common.server.response.FastJsonResponse) p6).isFieldSet(v3_2)) {
                                return 0;
                            }
                        } else {
                            if ((!((com.google.android.gms.common.server.response.FastJsonResponse) p6).isFieldSet(v3_2)) || (!com.google.android.gms.common.internal.Objects.equal(this.getFieldValue(v3_2), ((com.google.android.gms.common.server.response.FastJsonResponse) p6).getFieldValue(v3_2)))) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public Object getValueObject(String p1)
    {
        return 0;
    }

    public int hashCode()
    {
        java.util.Iterator v0_2 = this.getFieldMappings().values().iterator();
        int v1_1 = 0;
        while (v0_2.hasNext()) {
            int v2_1 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field) v0_2.next());
            if (this.isFieldSet(v2_1)) {
                v1_1 = ((v1_1 * 31) + com.google.android.gms.common.internal.Preconditions.checkNotNull(this.getFieldValue(v2_1)).hashCode());
            }
        }
        return v1_1;
    }

    public boolean isPrimitiveFieldSet(String p1)
    {
        return 0;
    }

    public byte[] toByteArray()
    {
        android.os.Parcel v0 = android.os.Parcel.obtain();
        this.writeToParcel(v0, 0);
        byte[] v1_1 = v0.marshall();
        v0.recycle();
        return v1_1;
    }
}
