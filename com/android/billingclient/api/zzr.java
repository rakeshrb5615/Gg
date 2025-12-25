package com.android.billingclient.api;
final class zzr extends android.content.BroadcastReceiver {
    final synthetic com.android.billingclient.api.zzs zza;
    private boolean zzb;
    private final boolean zzc;

    public zzr(com.android.billingclient.api.zzs p1, boolean p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzc = p2;
        return;
    }

    private final void zzd(android.os.Bundle p3, com.android.billingclient.api.BillingResult p4, int p5, com.google.android.gms.internal.play_billing.zzil p6, long p7, boolean p9)
    {
        try {
            if (p3.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                com.android.billingclient.api.zzs.zzb(this.zza).zzd(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzw, p5, p4, 0, p6), p7, p9);
                return;
            } else {
                com.android.billingclient.api.zzs.zzb(this.zza).zzd(com.google.android.gms.internal.play_billing.zzhx.zzA(p3.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzeu.zza()), p7, p9);
                return;
            }
        } catch (Throwable) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
            return;
        }
    }

    public final void onReceive(android.content.Context p14, android.content.Intent p15)
    {
        com.android.billingclient.api.zzb v14_1;
        com.android.billingclient.api.zzb v14_0 = p15.getAction();
        com.android.billingclient.api.zzr v0_9 = v14_0.hashCode();
        if (v0_9 == -1484087650) {
            if (!v14_0.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                v14_1 = com.google.android.gms.internal.play_billing.zzil.zza;
            } else {
                v14_1 = com.google.android.gms.internal.play_billing.zzil.zzb;
            }
        } else {
            if (v0_9 == -337612916) {
                if (!v14_0.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                } else {
                    v14_1 = com.google.android.gms.internal.play_billing.zzil.zzc;
                }
            } else {
                if ((v0_9 != 345207161) || (!v14_0.equals("com.android.vending.billing.ALTERNATIVE_BILLING"))) {
                } else {
                    v14_1 = com.google.android.gms.internal.play_billing.zzil.zzd;
                }
            }
        }
        com.android.billingclient.api.zzr v0_15;
        com.google.android.gms.internal.play_billing.zzhx v3;
        com.google.android.gms.internal.play_billing.zzil v4 = v14_1;
        com.android.billingclient.api.zzb v14_28 = com.google.android.gms.internal.play_billing.zzil.zzc;
        if ((!v4.equals(v14_28)) && (!v4.equals(com.google.android.gms.internal.play_billing.zzil.zzd))) {
            com.android.billingclient.api.zzr v0_14;
            if (!v4.equals(com.google.android.gms.internal.play_billing.zzil.zzb)) {
                v0_14 = 1;
            } else {
                v0_14 = 32;
            }
            v3 = v0_14;
            v0_15 = 2;
        } else {
            v0_15 = 2;
            v3 = 2;
        }
        org.json.JSONArray v1_19 = p15.getExtras();
        if (v1_19 != null) {
            com.google.android.gms.internal.play_billing.zzib v15_25;
            int v10 = 0;
            if (v3 != v0_15) {
                v15_25 = com.google.android.gms.internal.play_billing.zzc.zzh(p15, "BillingBroadcastManager");
            } else {
                java.util.ArrayList v2_14;
                com.android.billingclient.api.zzr v0_16 = com.android.billingclient.api.BillingResult.newBuilder();
                v0_16.setResponseCode(com.google.android.gms.internal.play_billing.zzc.zzb(p15.getExtras(), "BillingBroadcastManager"));
                java.util.ArrayList v2_8 = p15.getExtras();
                if (v2_8 != null) {
                    java.util.ArrayList v2_9 = v2_8.get("SUB_RESPONSE_CODE");
                    if (v2_9 != null) {
                        if (!(v2_9 instanceof Integer)) {
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(v2_9.getClass().getName()));
                            v2_14 = 0;
                        } else {
                            v2_14 = ((Integer) v2_9).intValue();
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
                }
                v0_16.setOnPurchasesUpdatedSubResponseCode(v2_14);
                v0_16.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(p15.getExtras(), "BillingBroadcastManager"));
                v15_25 = v0_16.build();
            }
            java.util.ArrayList v2_17 = v15_25;
            String v5_0 = v1_19.getLong("billingClientTransactionId", 0);
            boolean v7 = v1_19.getBoolean("wasServiceAutoReconnected", 0);
            if ((!v4.equals(com.google.android.gms.internal.play_billing.zzil.zzb)) && (!v4.equals(v14_28))) {
                if (v4.equals(com.google.android.gms.internal.play_billing.zzil.zzd)) {
                    if (v2_17.getResponseCode() == 0) {
                        com.android.billingclient.api.zzb v14_6 = this.zza;
                        if ((com.android.billingclient.api.zzs.zza(v14_6) == null) && (com.android.billingclient.api.zzs.zze(v14_6) == null)) {
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                            com.android.billingclient.api.zzb v14_8 = this.zza;
                            java.util.ArrayList v2_0 = com.android.billingclient.api.zzcj.zzh;
                            com.android.billingclient.api.zzs.zzb(v14_8).zzd(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzay, v3, v2_0, 0, v4), v5_0, v7);
                            com.android.billingclient.api.zzs.zzc(v14_8).onPurchasesUpdated(v2_0, com.google.android.gms.internal.play_billing.zzbt.zzk());
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzib v15_9 = v1_19.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (v15_9 == null) {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Couldn\'t find alternative billing user choice data in bundle.");
                                java.util.ArrayList v2_1 = com.android.billingclient.api.zzcj.zzh;
                                com.android.billingclient.api.zzs.zzb(v14_6).zzd(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzp, v3, v2_1, 0, v4), v5_0, v7);
                                com.android.billingclient.api.zzs.zzc(v14_6).onPurchasesUpdated(v2_1, com.google.android.gms.internal.play_billing.zzbt.zzk());
                            } else {
                                try {
                                    if (com.android.billingclient.api.zzs.zze(v14_6) == null) {
                                        org.json.JSONArray v1_8 = new org.json.JSONObject(v15_9).optJSONArray("products");
                                        java.util.ArrayList v2_4 = new java.util.ArrayList();
                                        if (v1_8 != null) {
                                            while (v10 < v1_8.length()) {
                                                org.json.JSONObject v11_1 = v1_8.optJSONObject(v10);
                                                if (v11_1 != null) {
                                                    v2_4.add(new com.android.billingclient.api.zzc(v11_1, 0));
                                                }
                                                v10++;
                                            }
                                        } else {
                                        }
                                        com.android.billingclient.api.zzs.zza(v14_6).zza();
                                    } else {
                                        com.android.billingclient.api.zzs.zze(v14_6).userSelectedAlternativeBilling(new com.android.billingclient.api.UserChoiceDetails(v15_9));
                                    }
                                } catch (org.json.JSONException) {
                                    com.android.billingclient.api.zzb v14_15 = new StringBuilder("Error when parsing invalid user choice data: [");
                                    v14_15.append(v15_9);
                                    v14_15.append("]");
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", v14_15.toString());
                                    com.android.billingclient.api.zzb v14_17 = this.zza;
                                    java.util.ArrayList v2_5 = com.android.billingclient.api.zzcj.zzh;
                                    com.android.billingclient.api.zzs.zzb(v14_17).zzd(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzq, v3, v2_5, 0, v4), v5_0, v7);
                                    com.android.billingclient.api.zzs.zzc(v14_17).onPurchasesUpdated(v2_5, com.google.android.gms.internal.play_billing.zzbt.zzk());
                                    return;
                                }
                                com.android.billingclient.api.zzs.zzb(this.zza).zzh(com.android.billingclient.api.zzcg.zzc(v3, v4), v5_0, v7);
                                return;
                            }
                        }
                    } else {
                        com.android.billingclient.api.zzs.zzc(this.zzd(v1_19, v2_17, v3, v4, v5_0, v7).zza).onPurchasesUpdated(v2_17, com.google.android.gms.internal.play_billing.zzbt.zzk());
                        return;
                    }
                }
            } else {
                com.android.billingclient.api.zzr v0_5 = this;
                com.android.billingclient.api.zzb v14_24 = com.google.android.gms.internal.play_billing.zzc.zzl(v1_19);
                if (v2_17.getResponseCode() != 0) {
                    v0_5 = this.zzd(v1_19, v2_17, v3, v4, v5_0, v7);
                } else {
                    com.android.billingclient.api.zzs.zzb(this.zza).zzh(com.android.billingclient.api.zzcg.zzc(v3, v4), v5_0, v7);
                }
                com.android.billingclient.api.zzs.zzc(v0_5.zza).onPurchasesUpdated(v2_17, v14_24);
                return;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            com.android.billingclient.api.zzb v14_26 = this.zza;
            org.json.JSONArray v1_16 = com.android.billingclient.api.zzcj.zzh;
            com.android.billingclient.api.zzs.zzb(v14_26).zza(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzk, v3, v1_16, 0, v4));
            if (com.android.billingclient.api.zzs.zzc(v14_26) != null) {
                com.android.billingclient.api.zzs.zzc(v14_26).onPurchasesUpdated(v1_16, 0);
                return;
            }
        }
        return;
    }

    public final declared_synchronized void zza(android.content.Context p4, android.content.IntentFilter p5)
    {
        if (!this.zzb) {
            if (android.os.Build$VERSION.SDK_INT < 33) {
                p4.registerReceiver(this, p5);
            } else {
                int v0_1;
                if (1 == this.zzc) {
                    v0_1 = 2;
                } else {
                    v0_1 = 4;
                }
                p4.registerReceiver(this, p5, v0_1);
            }
            this.zzb = 1;
            return;
        } else {
            return;
        }
    }

    public final declared_synchronized void zzb(android.content.Context p8, android.content.IntentFilter p9, String p10)
    {
        if (!this.zzb) {
            com.android.billingclient.api.zzr v1;
            if (android.os.Build$VERSION.SDK_INT < 33) {
                v1 = this;
                p8.registerReceiver(this, p9, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 0);
            } else {
                int v10_2;
                if (1 == this.zzc) {
                    v10_2 = 2;
                } else {
                    v10_2 = 4;
                }
                v1 = this;
                p8.registerReceiver(this, p9, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 0, v10_2);
            }
            v1.zzb = 1;
            return;
        } else {
            return;
        }
        throw int v0_2;
    }

    public final declared_synchronized void zzc(android.content.Context p2)
    {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingBroadcastManager", "Receiver is not registered.");
            return;
        } else {
            p2.unregisterReceiver(this);
            this.zzb = 0;
            return;
        }
    }
}
