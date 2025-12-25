package i2;
public final class f implements com.android.billingclient.api.PurchasesUpdatedListener {
    public final android.widget.Button A;
    public final android.widget.Button B;
    public final android.widget.Button C;
    public final android.widget.Button D;
    public final android.widget.Button E;
    public final android.widget.Button F;
    public final android.widget.Button G;
    public final android.widget.Button H;
    public final android.widget.Button I;
    public final android.widget.Button J;
    public final android.widget.Button K;
    public final android.widget.Button L;
    public final android.widget.TextView M;
    public final android.widget.TextView N;
    public final android.widget.Button O;
    public final String P;
    public final i2.o0 Q;
    public final java.util.HashSet R;
    public final java.util.HashSet S;
    public final java.util.ArrayList T;
    public final android.content.Context a;
    public final com.chilllive.chillwallpaperproject.MainActivity b;
    public final com.android.billingclient.api.BillingClient c;
    public final String d;
    public final String e;
    public final String f;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public f(com.chilllive.chillwallpaperproject.MainActivity p13, android.content.Context p14, android.view.View p15)
    {
        this.T = new java.util.ArrayList();
        this.a = p14;
        this.b = p13;
        com.android.billingclient.api.BillingClient v13_25 = i2.p0.b;
        this.d = v13_25[9];
        this.e = v13_25[11];
        this.f = v13_25[8];
        this.m = v13_25[13];
        this.v = v13_25[12];
        this.w = v13_25[15];
        this.x = v13_25[16];
        this.o = v13_25[10];
        this.n = v13_25[2];
        this.t = v13_25[3];
        this.s = v13_25[4];
        this.u = v13_25[5];
        this.z = v13_25[0];
        this.p = v13_25[6];
        this.y = v13_25[14];
        this.q = v13_25[7];
        this.r = v13_25[1];
        this.P = q4.b.l("knTS/S5tSa0GYkGFNXWAZw==");
        int v2 = this.v;
        int v4 = this.x;
        String v6 = this.q;
        String v8 = this.r;
        String v10 = this.t;
        this.R = new java.util.HashSet(java.util.Arrays.asList(new String[] {this.n, this.u})));
        this.S = new java.util.HashSet(java.util.Arrays.asList(new String[] {this.d, this.f, this.m, this.e})));
        this.D = ((android.widget.Button) p15.findViewById(2131362575));
        this.E = ((android.widget.Button) p15.findViewById(2131362576));
        this.A = ((android.widget.Button) p15.findViewById(2131362577));
        this.B = ((android.widget.Button) p15.findViewById(2131362581));
        this.F = ((android.widget.Button) p15.findViewById(2131362586));
        this.C = ((android.widget.Button) p15.findViewById(2131362582));
        p15.findViewById(2131362574);
        android.widget.Button v3_11 = p15.findViewById(2131362340);
        v3_11.findViewById(2131362569);
        v3_11.findViewById(2131362568);
        this.G = ((android.widget.Button) v3_11.findViewById(2131362579));
        this.H = ((android.widget.Button) v3_11.findViewById(2131362580));
        this.I = ((android.widget.Button) v3_11.findViewById(2131362578));
        this.K = ((android.widget.Button) p15.findViewById(2131362575));
        this.L = ((android.widget.Button) p15.findViewById(2131362577));
        this.N = ((android.widget.TextView) p15.findViewById(2131362581));
        this.O = ((android.widget.Button) p15.findViewById(2131362576));
        this.M = ((android.widget.TextView) p15.findViewById(2131362571));
        this.J = ((android.widget.Button) p15.findViewById(2131361992));
        this.Q = i2.o0.c(p14);
        j5.t1.z(p14).edit().putFloat(q4.b.l("fUhJXBGcb7Xlhnci2/ThGQ=="), ((float) Double.longBitsToDouble(4614256656552045848))).apply();
        this.c = com.android.billingclient.api.BillingClient.newBuilder(p14).setListener(this).enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        this.a();
        return;
    }

    public final void a()
    {
        com.android.billingclient.api.BillingClient v0 = this.c;
        if (!v0.isReady()) {
            v0.startConnection(new l6.c(this, 27));
            return;
        } else {
            return;
        }
    }

    public final String b(String p4)
    {
        android.content.SharedPreferences v0_1 = j5.t1.z(this.a);
        int v1_2 = new StringBuilder();
        v1_2.append(this.P);
        v1_2.append(p4);
        return v0_1.getString(v1_2.toString(), 0);
    }

    public final void c(com.android.billingclient.api.Purchase p5)
    {
        if (p5.getPurchaseState() != 1) {
            p5.getPurchaseState();
            return;
        } else {
            com.android.billingclient.api.BillingClient v1_1 = this.c;
            if (!p5.isAcknowledged()) {
                v1_1.acknowledgePurchase(com.android.billingclient.api.AcknowledgePurchaseParams.newBuilder().setPurchaseToken(p5.getPurchaseToken()).build(), new i2.b(this, 0));
            }
            a5.t v0_5 = p5.getProducts().iterator();
            while (v0_5.hasNext()) {
                if (((String) v0_5.next()).equals(this.z)) {
                    v1_1.consumeAsync(com.android.billingclient.api.ConsumeParams.newBuilder().setPurchaseToken(p5.getPurchaseToken()).build(), new a5.t(18));
                    break;
                }
            }
            return;
        }
    }

    public final void d(String p6, String p7)
    {
        com.android.billingclient.api.BillingFlowParams$Builder v0_0 = this.T;
        com.android.billingclient.api.BillingFlowParams$Builder v1_0 = v0_0.size();
        com.chilllive.chillwallpaperproject.MainActivity v2_2 = 0;
        while (v2_2 < v1_0) {
            boolean v3_6 = v0_0.get(v2_2);
            v2_2++;
            boolean v3_4 = ((com.android.billingclient.api.ProductDetails) v3_6);
            if (v3_4.getProductId().equals(p6)) {
            }
            if (v3_4) {
                com.android.billingclient.api.BillingClient v6_1 = this.c;
                if (v6_1.isReady()) {
                    com.android.billingclient.api.BillingFlowParams$Builder v0_3 = com.android.billingclient.api.BillingFlowParams$ProductDetailsParams.newBuilder().setProductDetails(v3_4);
                    com.chilllive.chillwallpaperproject.MainActivity v2_1 = this.b;
                    if (this.S.contains(v3_4.getProductId())) {
                        com.android.billingclient.api.BillingFlowParams$Builder v1_3 = v3_4.getSubscriptionOfferDetails();
                        if ((v1_3 != null) && (!v1_3.isEmpty())) {
                            com.android.billingclient.api.BillingFlowParams$Builder v1_4 = v1_3.iterator();
                            while (v1_4.hasNext()) {
                                boolean v3_3 = ((com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails) v1_4.next());
                                if (v3_3.getOfferTags().isEmpty()) {
                                    com.android.billingclient.api.BillingFlowParams$Builder v1_5 = v3_3.getOfferToken();
                                }
                                if (!v1_5.isEmpty()) {
                                    v0_3.setOfferToken(v1_5);
                                    if ((p7 != null) && (!p7.isEmpty())) {
                                        v6_1.launchBillingFlow(v2_1, com.android.billingclient.api.BillingFlowParams.newBuilder().setProductDetailsParamsList(java.util.Collections.singletonList(v0_3.build())).setSubscriptionUpdateParams(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.newBuilder().setOldPurchaseToken(p7).setSubscriptionReplacementMode(2).build()).build());
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            v1_5 = "";
                        }
                    }
                    v6_1.launchBillingFlow(v2_1, com.android.billingclient.api.BillingFlowParams.newBuilder().setProductDetailsParamsList(java.util.Collections.singletonList(v0_3.build())).build());
                }
            }
            return;
        }
        v3_4 = 0;
    }

    public final void e()
    {
        java.util.HashMap v4_1 = new java.util.HashMap();
        com.chilllive.chillwallpaperproject.MainActivity v2_2 = new java.util.HashMap();
        java.util.HashMap v3_1 = new java.util.HashMap();
        i2.e v0_2 = this.T;
        i2.f v1_1 = v0_2.size();
        int v6 = 0;
        while (v6 < v1_1) {
            String v7_2;
            long v10;
            String v9_4;
            String v7_0 = v0_2.get(v6);
            v6++;
            String v7_1 = ((com.android.billingclient.api.ProductDetails) v7_0);
            String v8 = v7_1.getProductId();
            if (v7_1.getOneTimePurchaseOfferDetails() == null) {
                if ((v7_1.getSubscriptionOfferDetails() == null) || (v7_1.getSubscriptionOfferDetails().isEmpty())) {
                    v9_4 = "";
                    v10 = 0;
                    v7_2 = "";
                } else {
                    String v7_9 = ((com.android.billingclient.api.ProductDetails$PricingPhase) ((com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails) v7_1.getSubscriptionOfferDetails().get(0)).getPricingPhases().getPricingPhaseList().get(0));
                    v9_4 = v7_9.getFormattedPrice();
                    v10 = v7_9.getPriceAmountMicros();
                    v7_2 = v7_9.getPriceCurrencyCode();
                }
            } else {
                String v7_10 = v7_1.getOneTimePurchaseOfferDetails();
                v9_4 = v7_10.getFormattedPrice();
                v10 = v7_10.getPriceAmountMicros();
                v7_2 = v7_10.getPriceCurrencyCode();
            }
            v4_1.put(v8, v9_4);
            v2_2.put(v8, Long.valueOf(v10));
            v3_1.put(v8, v7_2);
        }
        this.b.runOnUiThread(new i2.e(this, v2_2, v3_1, v4_1, 0));
        this.f();
        this.g();
        return;
    }

    public final void f()
    {
        com.android.billingclient.api.QueryPurchasesParams v0_3 = this.R.iterator();
        while (v0_3.hasNext()) {
            String v1_4 = ((String) v0_3.next());
            com.android.billingclient.api.BillingClient v2_2 = this.Q;
            if (v1_4.equals(v2_2.l)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.p)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.i)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.j)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.f)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.g)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.h)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.k)) {
                v2_2.g(v2_2.e(v1_4), 0);
            }
            if (v1_4.equals(v2_2.a)) {
                v2_2.g(v2_2.f(v1_4), 1);
            }
            if (v1_4.equals(v2_2.b)) {
                v2_2.g(v2_2.f(v1_4), 0);
            }
            if (v1_4.equals(v2_2.c)) {
                v2_2.g(v2_2.f(v1_4), 0);
            }
            if (v1_4.equals(v2_2.d)) {
                v2_2.g(v2_2.f(v1_4), 0);
            }
        }
        this.c.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new i2.b(this, 1));
        return;
    }

    public final void g()
    {
        com.android.billingclient.api.QueryPurchasesParams v0_3 = this.S.iterator();
        while (v0_3.hasNext()) {
            String v1_3 = ((String) v0_3.next());
            com.android.billingclient.api.BillingClient v2_2 = this.Q;
            if (v1_3.equals(v2_2.m)) {
                v2_2.g(v2_2.e(v1_3), 0);
            }
            if (v1_3.equals(v2_2.n)) {
                v2_2.g(v2_2.e(v1_3), 0);
            }
            if (v1_3.equals(v2_2.e)) {
                v2_2.g(v2_2.e(v1_3), 0);
            }
            if (v1_3.equals(v2_2.o)) {
                v2_2.g(v2_2.e(v1_3), 0);
            }
        }
        this.c.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType("subs").build(), new i2.b(this, 2));
        return;
    }

    public final void h(com.android.billingclient.api.Purchase p4, String p5)
    {
        android.content.SharedPreferences$Editor v4_1 = p4.getPurchaseToken();
        android.content.SharedPreferences$Editor v0_2 = j5.t1.z(this.a).edit();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append(this.P);
        v1_1.append(p5);
        v0_2.putString(v1_1.toString(), v4_1).apply();
        return;
    }

    public void onPurchasesUpdated(com.android.billingclient.api.BillingResult p6, java.util.List p7)
    {
        if ((p6.getResponseCode() != 0) || (p7 == null)) {
            p6.getResponseCode();
            return;
        } else {
            java.util.Iterator v6_1 = p7.iterator();
            while (v6_1.hasNext()) {
                com.android.billingclient.api.Purchase v7_2 = ((com.android.billingclient.api.Purchase) v6_1.next());
                android.content.SharedPreferences$Editor v0_3 = ((String) v7_2.getProducts().get(0));
                String v1_1 = v7_2.getPurchaseToken();
                if (v0_3.equals(this.d)) {
                    android.content.SharedPreferences$Editor v2_4 = j5.t1.z(this.a).edit();
                    StringBuilder v3_1 = new StringBuilder();
                    v3_1.append(this.P);
                    v3_1.append(v0_3);
                    v2_4.putString(v3_1.toString(), v1_1).apply();
                }
                this.c(v7_2);
            }
            return;
        }
    }
}
