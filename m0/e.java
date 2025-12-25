package m0;
public final class e extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver {
    public final d8.n a;

    public e(d8.n p2)
    {
        super(0);
        super.a = p2;
        return;
    }

    public final void onError(Throwable p3)
    {
        if (this.compareAndSet(0, 1)) {
            this.a.resumeWith(c4.b.p(p3));
        }
        return;
    }

    public final void onResult(Object p3)
    {
        if (this.compareAndSet(0, 1)) {
            this.a.resumeWith(p3);
        }
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("ContinuationOutcomeReceiver(outcomeReceived = ");
        v0_1.append(this.get());
        v0_1.append(41);
        return v0_1.toString();
    }
}
