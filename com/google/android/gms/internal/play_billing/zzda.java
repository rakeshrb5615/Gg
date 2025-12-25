package com.google.android.gms.internal.play_billing;
final class zzda {

    public static void zza(Throwable p1)
    {
        if (!(p1 instanceof Error)) {
            return;
        } else {
            if (!(p1 instanceof StackOverflowError)) {
                throw ((Error) p1);
            } else {
                return;
            }
        }
    }
}
