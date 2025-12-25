package com.google.android.play.core.integrity;
final class ar extends android.os.ResultReceiver {
    final synthetic com.google.android.play.core.integrity.as a;

    public ar(com.google.android.play.core.integrity.as p1, android.os.Handler p2)
    {
        this.a = p1;
        super(p2);
        return;
    }

    public final void onReceiveResult(int p3, android.os.Bundle p4)
    {
        if (p3 == 1) {
            this.a.a.trySetResult(Integer.valueOf(3));
            return;
        } else {
            if (p3 == 2) {
                this.a.a.trySetResult(Integer.valueOf(2));
                return;
            } else {
                if (p3 == 3) {
                    this.a.a.trySetResult(Integer.valueOf(1));
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
