package com.google.android.gms.internal.auth-api;
public final class zbn {

    public static android.app.PendingIntent zba(android.content.Context p2, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p3, com.google.android.gms.auth.api.credentials.HintRequest p4, String p5)
    {
        android.content.Intent v3_1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "request must not be null");
        if (!android.text.TextUtils.isEmpty(p5)) {
            v3_1 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5));
        } else {
            v3_1 = com.google.android.gms.internal.auth-api.zbbj.zba();
        }
        android.content.Intent v3_3 = new android.content.Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", 0).putExtra("logSessionId", v3_1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(p4, v3_3, "com.google.android.gms.credentials.HintRequest");
        return android.app.PendingIntent.getActivity(p2, 2000, v3_3, (com.google.android.gms.internal.auth-api.zbbk.zba | 134217728));
    }
}
