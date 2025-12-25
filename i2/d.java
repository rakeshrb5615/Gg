package i2;
public final synthetic class d implements com.android.billingclient.api.ProductDetailsResponseListener {
    public final synthetic int a;
    public final synthetic i2.f b;
    public final synthetic java.util.concurrent.atomic.AtomicInteger c;

    public synthetic d(i2.f p1, java.util.concurrent.atomic.AtomicInteger p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void onProductDetailsResponse(com.android.billingclient.api.BillingResult p2, com.android.billingclient.api.QueryProductDetailsResult p3)
    {
        switch (this.a) {
            case 0:
                i2.f v0_2 = this.b;
                if (p2.getResponseCode() == 0) {
                    v0_2.T.addAll(p3.getProductDetailsList());
                }
                if (this.c.decrementAndGet() == 0) {
                    v0_2.e();
                }
                return;
            default:
                i2.f v0_1 = this.b;
                if (p2.getResponseCode() == 0) {
                    v0_1.T.addAll(p3.getProductDetailsList());
                }
                if (this.c.decrementAndGet() == 0) {
                    v0_1.e();
                }
                return;
        }
    }
}
