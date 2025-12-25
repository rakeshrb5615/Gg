package x1;
public final class c extends x1.e {

    public c(android.content.Context p1, int p2)
    {
        switch (p2) {
            case 1:
                android.adservices.measurement.MeasurementManager v1_2 = p1.getSystemService(android.adservices.measurement.MeasurementManager);
                kotlin.jvm.internal.j.d(v1_2, "context.getSystemService\u2026ementManager::class.java)");
                super(((android.adservices.measurement.MeasurementManager) v1_2));
                return;
            default:
                android.adservices.measurement.MeasurementManager v1_1 = android.adservices.measurement.MeasurementManager.get(p1);
                kotlin.jvm.internal.j.d(v1_1, "get(context)");
                super(v1_1);
                return;
        }
    }
}
