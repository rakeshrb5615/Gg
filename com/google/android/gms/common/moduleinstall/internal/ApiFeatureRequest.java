package com.google.android.gms.common.moduleinstall.internal;
public class ApiFeatureRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private static final java.util.Comparator zaa;
    private final java.util.List zab;
    private final boolean zac;
    private final String zad;
    private final String zae;

    static ApiFeatureRequest()
    {
        com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.CREATOR = new com.google.android.gms.common.moduleinstall.internal.zac();
        com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa = com.google.android.gms.common.moduleinstall.internal.zab.zaa;
        return;
    }

    public ApiFeatureRequest(java.util.List p1, boolean p2, String p3, String p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zab = p1;
        this.zac = p2;
        this.zad = p3;
        this.zae = p4;
        return;
    }

    public static com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest fromModuleInstallRequest(com.google.android.gms.common.moduleinstall.ModuleInstallRequest p1)
    {
        return com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa(p1.getApis(), 1);
    }

    public static com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zaa(java.util.List p2, boolean p3)
    {
        int v0_2 = new java.util.TreeSet(com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa);
        com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest v2_2 = p2.iterator();
        while (v2_2.hasNext()) {
            java.util.Collections.addAll(v0_2, ((com.google.android.gms.common.api.OptionalModuleApi) v2_2.next()).getOptionalFeatures());
        }
        return new com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest(new java.util.ArrayList(v0_2), p3, 0, 0);
    }

    public final boolean equals(Object p4)
    {
        if (p4 != 0) {
            if ((p4 instanceof com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest)) {
                if ((this.zac != ((com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest) p4).zac) || ((!com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest) p4).zab)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zad, ((com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest) p4).zad)) || (!com.google.android.gms.common.internal.Objects.equal(this.zae, ((com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest) p4).zae))))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public java.util.List getApiFeatures()
    {
        return this.zab;
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Boolean.valueOf(this.zac), this.zab, this.zad, this.zae}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, this.getApiFeatures(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 2, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zad, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.zae, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
