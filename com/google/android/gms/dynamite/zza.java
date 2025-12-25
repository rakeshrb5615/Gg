package com.google.android.gms.dynamite;
final class zza extends java.lang.Thread {

    public zza(ThreadGroup p1, String p2)
    {
        super(p1, "GmsDynamite");
        return;
    }

    public final void run()
    {
        android.os.Process.setThreadPriority(19);
        try {
            while(true) {
                this.wait();
            }
        } catch (Throwable v0_1) {
            throw v0_1;
        }
    }
}
