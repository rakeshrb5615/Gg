package com.google.android.play.core.integrity;
public final class j implements com.google.android.play.core.integrity.k {

    public j()
    {
        return;
    }

    public final com.google.android.gms.common.api.ApiException a(android.os.Bundle p3)
    {
        int v3_1 = p3.getInt("error");
        if (v3_1 != 0) {
            return new com.google.android.play.core.integrity.StandardIntegrityException(v3_1, 0);
        } else {
            return 0;
        }
    }
}
