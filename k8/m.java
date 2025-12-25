package k8;
public final class m {
    public static final synthetic java.util.concurrent.atomic.AtomicReferenceFieldUpdater b;
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater c;
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater d;
    public static final synthetic java.util.concurrent.atomic.AtomicIntegerFieldUpdater e;
    public final java.util.concurrent.atomic.AtomicReferenceArray a;
    private volatile synthetic int blockingTasksInBuffer$volatile;
    private volatile synthetic int consumerIndex$volatile;
    private volatile synthetic Object lastScheduledTask$volatile;
    private volatile synthetic int producerIndex$volatile;

    static m()
    {
        k8.m.b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(k8.m, Object, "lastScheduledTask$volatile");
        k8.m.c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(k8.m, "producerIndex$volatile");
        k8.m.d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(k8.m, "consumerIndex$volatile");
        k8.m.e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(k8.m, "blockingTasksInBuffer$volatile");
        return;
    }

    public m()
    {
        this.a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
        return;
    }

    public final k8.i a()
    {
        do {
            k8.i v0_0 = k8.m.d;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater v1_1 = v0_0.get(this);
            if ((v1_1 - k8.m.c.get(this)) != 0) {
                if (v0_0.compareAndSet(this, v1_1, (v1_1 + 1))) {
                    k8.i v0_4 = ((k8.i) this.a.getAndSet((v1_1 & 127), 0));
                }
            } else {
                return 0;
            }
        } while(v0_4 != null);
        if (v0_4.b) {
            k8.m.e.decrementAndGet(this);
        }
        return v0_4;
    }

    public final k8.i b(int p5, boolean p6)
    {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater v5_1 = (p5 & 127);
        java.util.concurrent.atomic.AtomicReferenceArray v0 = this.a;
        k8.i v1_1 = ((k8.i) v0.get(v5_1));
        if ((v1_1 != null) && (v1_1.b == p6)) {
            while (!v0.compareAndSet(v5_1, v1_1, 0)) {
                if (v0.get(v5_1) != v1_1) {
                }
            }
            if (p6) {
                k8.m.e.decrementAndGet(this);
            }
            return v1_1;
        }
        return 0;
    }
}
