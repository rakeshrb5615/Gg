package com.google.android.recaptcha.internal;
public final class zzib implements com.google.android.recaptcha.internal.zzih {
    private final android.content.Context zza;

    public zzib(android.content.Context p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic Object cs(Object[] p1)
    {
        return com.google.android.recaptcha.internal.zzie.zza(this, p1);
    }

    public final varargs Object zza(Object[] p20)
    {
        Object[] v1_1;
        Object[] v1_4 = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (android.os.Build$VERSION.SDK_INT < 33) {
            v1_1 = this.zza.registerReceiver(0, v1_4);
        } else {
            v1_1 = this.zza.registerReceiver(0, v1_4, 4);
        }
        if (v1_1 == null) {
            throw new com.google.android.recaptcha.internal.zzce(7, 19, 0);
        } else {
            int v2_4 = v1_1.getIntExtra("health", -1);
            int v4_1 = v1_1.getIntExtra("level", -1);
            int v5_1 = v1_1.getIntExtra("plugged", -1);
            boolean v6_1 = v1_1.getBooleanExtra("present", 0);
            int v7_2 = v1_1.getIntExtra("scale", -1);
            int v8_1 = v1_1.getIntExtra("status", -1);
            // Both branches of the condition point to the same code.
            // if (v1_1.getStringExtra("technology") != null) {
                int v9_3 = v1_1.getIntExtra("temperature", -1);
                Object[] v1_5 = v1_1.getIntExtra("voltage", -1);
                Integer v10_1 = Integer.valueOf(v2_4);
                Integer.valueOf(v4_1);
                Integer.valueOf(v5_1);
                Boolean.valueOf(v6_1);
                Integer.valueOf(v7_2);
                Integer.valueOf(v8_1);
                Integer.valueOf(v9_3);
                return new Object[] {v10_1, Integer.valueOf(v1_5)});
            // }
        }
    }
}
