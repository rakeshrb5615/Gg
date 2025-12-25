package com.android.billingclient.api;
public class ProxyBillingActivity extends android.app.Activity {
    private static final String KEY_ACTIVITY_CODE = "activity_code";
    static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    private static final int RESULT_CODE_PLAY_CANCELED_WITH_ON_CREATE_RUNTIME_EXCEPTION = 5;
    static final int RESULT_CODE_PLAY_CANCELLED = 3;
    static final int RESULT_CODE_PLAY_CANCELLED_WITHOUT_COMPLETE_ACTION = 4;
    private static final String TAG = "ProxyBillingActivity";
    private int activityCode;
    private long billingClientTransactionId;
    private android.os.ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    private boolean sendCancelledBroadcastIfFinished;
    private boolean wasServiceAutoReconnected;

    public ProxyBillingActivity()
    {
        return;
    }

    private com.google.android.gms.internal.play_billing.zzie getReasonForNullData(int p2)
    {
        if (p2 == -1) {
            return com.google.android.gms.internal.play_billing.zzie.zzbi;
        } else {
            if (p2 == null) {
                return com.google.android.gms.internal.play_billing.zzie.zzbj;
            } else {
                if (p2 == 3) {
                    return com.google.android.gms.internal.play_billing.zzie.zzbk;
                } else {
                    if (p2 == 4) {
                        return com.google.android.gms.internal.play_billing.zzie.zzbl;
                    } else {
                        if (p2 == 5) {
                            return com.google.android.gms.internal.play_billing.zzie.zzbn;
                        } else {
                            return com.google.android.gms.internal.play_billing.zzie.zzbm;
                        }
                    }
                }
            }
        }
    }

    private android.content.Intent makeAlternativeBillingIntent(String p3)
    {
        android.content.Intent v0_1 = new android.content.Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        v0_1.setPackage(this.getApplicationContext().getPackageName());
        v0_1.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", p3);
        return v0_1;
    }

    private android.content.Intent makePurchaseUpdatedIntentWithInternalErrorReason(com.google.android.gms.internal.play_billing.zzie p6, long p7)
    {
        android.content.Intent v0 = this.makePurchasesUpdatedIntent();
        v0.putExtra("RESPONSE_CODE", 6);
        v0.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        String v1_5 = com.android.billingclient.api.BillingResult.newBuilder();
        v1_5.setResponseCode(6);
        v1_5.setDebugMessage("An internal error occurred.");
        v0.putExtra("FAILURE_LOGGING_PAYLOAD", com.android.billingclient.api.zzcg.zzb(p6, 2, v1_5.build(), 0, com.google.android.gms.internal.play_billing.zzil.zza).zzM());
        v0.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        v0.putExtra("billingClientTransactionId", p7);
        v0.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
        return v0;
    }

    private android.content.Intent makePurchasesUpdatedIntent()
    {
        android.content.Intent v0_1 = new android.content.Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        v0_1.setPackage(this.getApplicationContext().getPackageName());
        return v0_1;
    }

    public void onActivityResult(int p6, int p7, android.content.Intent p8)
    {
        super.onActivityResult(p6, p7, p8);
        if ((p6 != 100) && (p6 != 110)) {
            if (p6 != 101) {
                android.content.Intent v7_1 = new StringBuilder("Got onActivityResult with wrong requestCode: ");
                v7_1.append(p6);
                v7_1.append("; skipping...");
                com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivity", v7_1.toString());
            } else {
                String v6_3 = com.google.android.gms.internal.play_billing.zzc.zza(p8, "ProxyBillingActivity");
                android.content.Intent v7_2 = this.inAppMessageResultReceiver;
                if (v7_2 != null) {
                    boolean v8_1;
                    if (p8) {
                        v8_1 = p8.getExtras();
                    } else {
                        v8_1 = 0;
                    }
                    v7_2.send(v6_3, v8_1);
                }
            }
        } else {
            String v0_2 = com.google.android.gms.internal.play_billing.zzc.zzh(p8, "ProxyBillingActivity").getResponseCode();
            int v3_0 = -1;
            if (p7 != -1) {
                int v3_2 = new StringBuilder("Activity finished with resultCode ");
                v3_2.append(p7);
                v3_2.append(" and billing\'s responseCode: ");
                v3_2.append(v0_2);
                com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivity", v3_2.toString());
                v3_0 = p7;
            } else {
                if (v0_2 != null) {
                    p7 = -1;
                }
            }
            android.content.Intent v7_7;
            if (!p8) {
                android.content.Intent v7_4 = new StringBuilder("Got null data with resultCode ");
                v7_4.append(v3_0);
                v7_4.append("!");
                com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivity", v7_4.toString());
                v7_7 = this.makePurchaseUpdatedIntentWithInternalErrorReason(this.getReasonForNullData(v3_0), this.billingClientTransactionId);
            } else {
                if (p8.getExtras() == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                    v7_7 = this.makePurchaseUpdatedIntentWithInternalErrorReason(com.google.android.gms.internal.play_billing.zzie.zzv, this.billingClientTransactionId);
                } else {
                    android.content.Intent v7_13 = p8.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (v7_13 == null) {
                        v7_7 = this.makePurchasesUpdatedIntent();
                        v7_7.putExtras(p8.getExtras());
                        v7_7.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        v7_7 = this.makeAlternativeBillingIntent(v7_13);
                        v7_7.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                    v7_7.putExtra("billingClientTransactionId", this.billingClientTransactionId);
                    v7_7.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
                }
            }
            if (p6 == 110) {
                v7_7.putExtra("IS_FIRST_PARTY_PURCHASE", 1);
            }
            this.sendBroadcast(v7_7);
        }
        this.sendCancelledBroadcastIfFinished = 0;
        this.finish();
        return;
    }

    public void onCreate(android.os.Bundle p13)
    {
        this = super.onCreate(p13);
        if (p13 != null) {
            com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.sendCancelledBroadcastIfFinished = p13.getBoolean("send_cancelled_broadcast_if_finished", 0);
            if (p13.containsKey("in_app_message_result_receiver")) {
                this.inAppMessageResultReceiver = ((android.os.ResultReceiver) p13.getParcelable("in_app_message_result_receiver"));
            }
            this.isFlowFromFirstPartyClient = p13.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", 0);
            this.activityCode = p13.getInt("activity_code", 100);
            if (p13.containsKey("billingClientTransactionId")) {
                this.billingClientTransactionId = p13.getLong("billingClientTransactionId");
            }
            if (p13.containsKey("wasServiceAutoReconnected")) {
                this.wasServiceAutoReconnected = p13.getBoolean("wasServiceAutoReconnected");
            }
            return;
        } else {
            android.content.Intent v0_10;
            com.google.android.gms.internal.play_billing.zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
            this.activityCode = 100;
            if (!this.getIntent().hasExtra("BUY_INTENT")) {
                if (!this.getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    v0_10 = 0;
                } else {
                    v0_10 = ((android.app.PendingIntent) this.getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT"));
                    this.inAppMessageResultReceiver = ((android.os.ResultReceiver) this.getIntent().getParcelableExtra("in_app_message_result_receiver"));
                    this.activityCode = 101;
                }
            } else {
                v0_10 = ((android.app.PendingIntent) this.getIntent().getParcelableExtra("BUY_INTENT"));
                if ((this.getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT")) && (this.getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", 0))) {
                    this.isFlowFromFirstPartyClient = 1;
                    this.activityCode = 110;
                }
            }
            if (this.getIntent().hasExtra("billingClientTransactionId")) {
                this.billingClientTransactionId = this.getIntent().getLongExtra("billingClientTransactionId", 0);
            }
            if (this.getIntent().hasExtra("wasServiceAutoReconnected")) {
                this.wasServiceAutoReconnected = this.getIntent().getBooleanExtra("wasServiceAutoReconnected", 0);
            }
            try {
                this.sendCancelledBroadcastIfFinished = 1;
                this.startIntentSenderForResult(v0_10.getIntentSender(), this.activityCode, new android.content.Intent(), 0, 0, 0);
                return;
            } catch (android.content.Intent v0_0) {
                com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", v0_0);
                android.content.Intent v0_1 = this.inAppMessageResultReceiver;
                if (v0_1 == null) {
                    android.content.Intent v0_3 = this.makePurchaseUpdatedIntentWithInternalErrorReason(com.google.android.gms.internal.play_billing.zzie.zzbG, this.billingClientTransactionId);
                    if (this.isFlowFromFirstPartyClient) {
                        v0_3.putExtra("IS_FIRST_PARTY_PURCHASE", 1);
                    }
                    this.sendBroadcast(v0_3);
                } else {
                    v0_1.send(0, 0);
                }
                this.sendCancelledBroadcastIfFinished = 0;
                this.finish();
                return;
            }
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if ((this.isFinishing()) && (this.sendCancelledBroadcastIfFinished)) {
            android.content.Intent v0_2 = this.makePurchasesUpdatedIntent();
            v0_2.putExtra("RESPONSE_CODE", 1);
            v0_2.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.isFlowFromFirstPartyClient) {
                v0_2.putExtra("IS_FIRST_PARTY_PURCHASE", 1);
            }
            long v1_3 = this.activityCode;
            if ((v1_3 == 110) || (v1_3 == 100)) {
                v0_2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                v0_2.putExtra("billingClientTransactionId", this.billingClientTransactionId);
            }
            this.sendBroadcast(v0_2);
        }
        return;
    }

    public void onSaveInstanceState(android.os.Bundle p4)
    {
        super.onSaveInstanceState(p4);
        boolean v0_0 = this.inAppMessageResultReceiver;
        if (v0_0) {
            p4.putParcelable("in_app_message_result_receiver", v0_0);
        }
        p4.putBoolean("send_cancelled_broadcast_if_finished", this.sendCancelledBroadcastIfFinished);
        p4.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
        p4.putInt("activity_code", this.activityCode);
        p4.putLong("billingClientTransactionId", this.billingClientTransactionId);
        p4.putBoolean("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
        return;
    }
}
