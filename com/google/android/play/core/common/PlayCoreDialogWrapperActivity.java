package com.google.android.play.core.common;
public class PlayCoreDialogWrapperActivity extends android.app.Activity {
    public android.os.ResultReceiver a;

    public PlayCoreDialogWrapperActivity()
    {
        return;
    }

    public final void onActivityResult(int p1, int p2, android.content.Intent p3)
    {
        super.onActivityResult(p1, p2, p3);
        if (p1 == null) {
            android.os.ResultReceiver v1_1 = this.a;
            if (v1_1 != null) {
                if (p2 != -1) {
                    if (p2 == null) {
                        v1_1.send(2, new android.os.Bundle());
                    }
                } else {
                    v1_1.send(1, new android.os.Bundle());
                }
            }
        }
        this.finish();
        return;
    }

    public final void onCreate(android.os.Bundle p12)
    {
        int v7;
        int v0_5 = this.getIntent().getIntExtra("window_flags", 0);
        android.os.Bundle v1_2 = 0;
        if (v0_5 == 0) {
            v7 = 0;
        } else {
            this.getWindow().getDecorView().setSystemUiVisibility(v0_5);
            android.content.Intent v3_3 = new android.content.Intent();
            v3_3.putExtra("window_flags", v0_5);
            v7 = v3_3;
        }
        super.onCreate(p12);
        if (p12 != null) {
            this.a = ((android.os.ResultReceiver) p12.getParcelable("result_receiver"));
            return;
        } else {
            this.a = ((android.os.ResultReceiver) this.getIntent().getParcelableExtra("result_receiver"));
            android.os.ResultReceiver v12_7 = this.getIntent().getExtras();
            if (v12_7 != null) {
                v1_2 = ((android.app.PendingIntent) v12_7.get("confirmation_intent"));
            }
            if ((v12_7 != null) && (v1_2 != null)) {
                try {
                    com.google.android.play.core.common.PlayCoreDialogWrapperActivity v4_1 = this;
                } catch (android.content.IntentSender$SendIntentException) {
                    v4_1 = this;
                    android.os.ResultReceiver v12_8 = v4_1.a;
                    if (v12_8 != null) {
                        v12_8.send(3, new android.os.Bundle());
                    }
                    this.finish();
                    return;
                } catch (android.content.IntentSender$SendIntentException) {
                }
                this.startIntentSenderForResult(v1_2.getIntentSender(), 0, v7, 0, 0, 0);
                return;
            } else {
                android.os.ResultReceiver v12_9 = this.a;
                if (v12_9 != null) {
                    v12_9.send(3, new android.os.Bundle());
                }
                this.finish();
                return;
            }
        }
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        p3.putParcelable("result_receiver", this.a);
        return;
    }
}
