package com.google.android.gms.tasks;
public class NativeOnCompleteListener implements com.google.android.gms.tasks.OnCompleteListener {
    private final long zza;

    public NativeOnCompleteListener(long p1)
    {
        this.zza = p1;
        return;
    }

    public static void createAndAddCallback(com.google.android.gms.tasks.Task p1, long p2)
    {
        p1.addOnCompleteListener(new com.google.android.gms.tasks.NativeOnCompleteListener(p2));
        return;
    }

    public native void nativeOnComplete();

    public void onComplete(com.google.android.gms.tasks.Task p10)
    {
        int v5;
        String v8;
        if (!p10.isSuccessful()) {
            if (!p10.isCanceled()) {
                String v0_4 = p10.getException();
                if (v0_4 != null) {
                    v8 = v0_4.getMessage();
                    v5 = 0;
                    this.nativeOnComplete(this.zza, v5, p10.isSuccessful(), p10.isCanceled(), v8);
                    return;
                }
            }
            v5 = 0;
            v8 = 0;
        } else {
            v5 = p10.getResult();
            v8 = 0;
        }
        this.nativeOnComplete(this.zza, v5, p10.isSuccessful(), p10.isCanceled(), v8);
        return;
    }
}
