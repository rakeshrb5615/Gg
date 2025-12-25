package com.google.android.gms.common.api;
public class AvailabilityException extends java.lang.Exception {
    private final r.e zaa;

    public AvailabilityException(r.e p1)
    {
        this.zaa = p1;
        return;
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi p5)
    {
        r.e v0_1;
        r.e v0_0 = this.zaa;
        com.google.android.gms.common.ConnectionResult v5_3 = p5.getApiKey();
        r.e v0_3 = v0_0.get(v5_3);
        String vtmp4 = v1.a.l("The given API (", v5_3.zaa(), ") was not part of the availability request.");
        if (v0_3 == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1, vtmp4);
        return ((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.ConnectionResult) this.zaa.get(v5_3))));
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey p5)
    {
        r.e v0_1;
        r.e v0_0 = this.zaa;
        com.google.android.gms.common.ConnectionResult v5_3 = p5.getApiKey();
        r.e v0_3 = v0_0.get(v5_3);
        String vtmp4 = v1.a.l("The given API (", v5_3.zaa(), ") was not part of the availability request.");
        if (v0_3 == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1, vtmp4);
        return ((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.ConnectionResult) this.zaa.get(v5_3))));
    }

    public String getMessage()
    {
        String v0_1 = new java.util.ArrayList();
        StringBuilder v1_5 = ((r.b) this.zaa.keySet()).iterator();
        int v3 = 1;
        while(true) {
            String v4_1 = ((r.a) v1_5);
            if (!v4_1.hasNext()) {
                break;
            }
            String v4_3 = ((com.google.android.gms.common.api.internal.ApiKey) v4_1.next());
            String v5_5 = ((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.ConnectionResult) this.zaa.get(v4_3))));
            v3 &= (v5_5.isSuccess() ^ 1);
            String v4_4 = v4_3.zaa();
            String v5_6 = String.valueOf(v5_5);
            StringBuilder v6_3 = new StringBuilder();
            v6_3.append(v4_4);
            v6_3.append(": ");
            v6_3.append(v5_6);
            v0_1.add(v6_3.toString());
        }
        StringBuilder v1_1 = new StringBuilder();
        if (v3 == 0) {
            v1_1.append("Some of the queried APIs are unavailable. ");
        } else {
            v1_1.append("None of the queried APIs are available. ");
        }
        v1_1.append(android.text.TextUtils.join("; ", v0_1));
        return v1_1.toString();
    }
}
