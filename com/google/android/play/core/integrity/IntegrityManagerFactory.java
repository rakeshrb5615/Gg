package com.google.android.play.core.integrity;
public class IntegrityManagerFactory {

    private IntegrityManagerFactory()
    {
        return;
    }

    public static com.google.android.play.core.integrity.IntegrityManager create(android.content.Context p0)
    {
        return com.google.android.play.core.integrity.z.a(p0).a();
    }

    public static com.google.android.play.core.integrity.StandardIntegrityManager createStandard(android.content.Context p0)
    {
        return com.google.android.play.core.integrity.ax.a(p0).a();
    }
}
