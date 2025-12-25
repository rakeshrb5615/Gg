package com.pairip.licensecheck;
 class LicenseClient$DelayedTaskExecutorImpl implements com.pairip.licensecheck.LicenseClient$DelayedTaskExecutor {
    private final android.os.Handler handler;

    private LicenseClient$DelayedTaskExecutorImpl()
    {
        this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        return;
    }

    synthetic LicenseClient$DelayedTaskExecutorImpl(com.pairip.licensecheck.LicenseClient-IA p1)
    {
        return;
    }

    public void schedule(Runnable p2, long p3)
    {
        this.handler.postDelayed(p2, p3);
        return;
    }
}
