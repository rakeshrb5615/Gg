package i2;
public final synthetic class b implements com.android.billingclient.api.AcknowledgePurchaseResponseListener, com.android.billingclient.api.PurchasesResponseListener {
    public final synthetic int a;
    public final synthetic i2.f b;

    public synthetic b(i2.f p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public void onAcknowledgePurchaseResponse(com.android.billingclient.api.BillingResult p2)
    {
        i2.f v0 = this.b;
        v0.getClass();
        if (p2.getResponseCode() == 0) {
            v0.f();
            v0.g();
        }
        return;
    }

    public void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult p7, java.util.List p8)
    {
        switch (this.a) {
            case 1:
                boolean v0_5 = this.b;
                int v1_1 = v0_5.Q;
                if (p7.getResponseCode() == 0) {
                    java.util.Iterator v7_4 = p8.iterator();
                    while (v7_4.hasNext()) {
                        com.android.billingclient.api.Purchase v8_3 = ((com.android.billingclient.api.Purchase) v7_4.next());
                        if (v8_3.getPurchaseState() == 1) {
                            String v2_7 = v8_3.getProducts().iterator();
                            while (v2_7.hasNext()) {
                                boolean v4_12 = ((String) v2_7.next());
                                if (v0_5.R.contains(v4_12)) {
                                    if (v4_12.equals(v1_1.l)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.p)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.i)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.j)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.f)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.g)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.h)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.k)) {
                                        v1_1.g(v1_1.e(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.a)) {
                                        v1_1.g(v1_1.f(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.b)) {
                                        v1_1.g(v1_1.f(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.c)) {
                                        v1_1.g(v1_1.f(v4_12), 1);
                                    }
                                    if (v4_12.equals(v1_1.d)) {
                                        v1_1.g(v1_1.f(v4_12), 1);
                                    }
                                    if ((!v0_5.n.equals(v4_12)) && ((!v0_5.o.equals(v4_12)) && ((!v0_5.d.equals(v4_12)) && ((!v0_5.e.equals(v4_12)) && ((!v0_5.v.equals(v4_12)) && (!v0_5.m.equals(v4_12))))))) {
                                        v0_5.w.equals(v4_12);
                                    }
                                }
                            }
                            if (!v8_3.isAcknowledged()) {
                                v0_5.c(v8_3);
                            }
                        }
                    }
                }
                return;
            default:
                if (p7.getResponseCode() == 0) {
                    java.util.Iterator v7_2 = p8.iterator();
                    while (v7_2.hasNext()) {
                        com.android.billingclient.api.Purchase v8_6 = ((com.android.billingclient.api.Purchase) v7_2.next());
                        if (v8_6.getPurchaseState() == 1) {
                            boolean v0_3 = v8_6.getProducts().iterator();
                            do {
                                i2.f v3_0 = this.b;
                                if (!v0_3.hasNext()) {
                                    if (!v8_6.isAcknowledged()) {
                                        v3_0.c(v8_6);
                                    }
                                } else {
                                    String v2_3 = ((String) v0_3.next());
                                }
                            } while(!v3_0.S.contains(v2_3));
                            boolean v4_2 = v3_0.Q;
                            if (v2_3.equals(v4_2.m)) {
                                v4_2.g(v4_2.e(v2_3), 1);
                            }
                            if (v2_3.equals(v4_2.n)) {
                                v4_2.g(v4_2.e(v2_3), 1);
                            }
                            if (v2_3.equals(v4_2.e)) {
                                v4_2.g(v4_2.e(v2_3), 1);
                            }
                            if (v2_3.equals(v4_2.o)) {
                                v4_2.g(v4_2.e(v2_3), 1);
                            }
                            if (v2_3.equals(v3_0.d)) {
                                v3_0.h(v8_6, v3_0.d);
                            }
                            if (v2_3.equals(v3_0.e)) {
                                v3_0.h(v8_6, v3_0.e);
                            }
                            if (v2_3.equals(v3_0.f)) {
                                v3_0.h(v8_6, v3_0.f);
                            }
                        }
                    }
                }
                return;
        }
    }
}
