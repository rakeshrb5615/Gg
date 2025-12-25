package com.google.android.gms.auth.api.signin;
public final class RevocationBoundService extends android.app.Service {

    public RevocationBoundService()
    {
        return;
    }

    public android.os.IBinder onBind(android.content.Intent p4)
    {
        if ((!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(p4.getAction())) && (!"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(p4.getAction()))) {
            android.util.Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(p4.getAction())));
            return 0;
        } else {
            if (android.util.Log.isLoggable("RevocationService", 2)) {
                android.util.Log.v("RevocationService", "RevocationBoundService handling ".concat(String.valueOf(p4.getAction())));
            }
            return new com.google.android.gms.auth.api.signin.internal.zbt(this);
        }
    }
}
