package com.google.android.play.core.integrity;
final class as extends k4.x {
    final com.google.android.gms.tasks.TaskCompletionSource a;
    final k4.d b;
    private final k4.z c;
    private final String d;
    private final com.google.android.play.core.integrity.k e;
    private final android.app.Activity f;

    public as(android.content.Context p3, com.google.android.play.core.integrity.k p4, android.app.Activity p5, com.google.android.gms.tasks.TaskCompletionSource p6, k4.d p7)
    {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        super.c = new k4.z("RequestDialogCallbackImpl");
        super.d = p3.getPackageName();
        super.e = p4;
        super.a = p6;
        super.f = p5;
        super.b = p7;
        return;
    }

    public final void b(android.os.Bundle p6)
    {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", new Object[] {this.d}));
        Integer v0_1 = this.e.a(p6);
        if (v0_1 == null) {
            android.app.Activity v6_2 = ((android.app.PendingIntent) p6.getParcelable("dialog.intent"));
            if (v6_2 != null) {
                String v3_1 = new android.content.Intent(this.f, com.google.android.play.core.common.PlayCoreDialogWrapperActivity);
                v3_1.putExtra("confirmation_intent", v6_2);
                v3_1.setFlags(536870912);
                v3_1.putExtra("result_receiver", new com.google.android.play.core.integrity.ar(this, this.b.a()));
                android.app.Activity v6_7 = this.c;
                Object[] v2_4 = new Object[0];
                v6_7.getClass();
                if (android.util.Log.isLoggable("PlayCore", 3)) {
                    android.util.Log.d("PlayCore", k4.z.c(v6_7.a, "Starting dialog intent...", v2_4));
                }
                this.f.startActivityForResult(v3_1, 0);
                return;
            } else {
                android.app.Activity v6_11 = this.c;
                Object[] v2_6 = new Object[] {this.d});
                v6_11.getClass();
                if (android.util.Log.isLoggable("PlayCore", 6)) {
                    android.util.Log.e("PlayCore", k4.z.c(v6_11.a, "onRequestDialog(%s): got null dialog intent", v2_6));
                }
                this.a.trySetResult(Integer.valueOf(0));
                return;
            }
        } else {
            this.a.trySetException(v0_1);
            return;
        }
    }
}
