package com.google.android.play.core.integrity;
final class ax {
    private static com.google.android.play.core.integrity.aw a;

    public static declared_synchronized com.google.android.play.core.integrity.aw a(android.content.Context p3)
    {
        if (com.google.android.play.core.integrity.ax.a == null) {
            com.google.android.play.core.integrity.u v1_2 = new com.google.android.play.core.integrity.u(0);
            android.content.Context v2_1 = p3.getApplicationContext();
            if (v2_1 != null) {
                p3 = v2_1;
            }
            v1_2.a(p3);
            com.google.android.play.core.integrity.ax.a = v1_2.b();
        }
        return com.google.android.play.core.integrity.ax.a;
    }
}
