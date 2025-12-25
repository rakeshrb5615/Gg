package com.google.android.play.core.integrity;
final class z {
    private static com.google.android.play.core.integrity.s a;

    public static declared_synchronized com.google.android.play.core.integrity.s a(android.content.Context p3)
    {
        if (com.google.android.play.core.integrity.z.a == null) {
            com.google.android.play.core.integrity.q v1_2 = new com.google.android.play.core.integrity.q(0);
            android.content.Context v2_1 = p3.getApplicationContext();
            if (v2_1 != null) {
                p3 = v2_1;
            }
            v1_2.a(p3);
            com.google.android.play.core.integrity.z.a = v1_2.b();
        }
        return com.google.android.play.core.integrity.z.a;
    }
}
