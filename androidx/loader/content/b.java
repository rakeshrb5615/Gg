package androidx.loader.content;
public abstract class b extends androidx.loader.content.e {
    static final boolean DEBUG = False;
    static final String TAG = "AsyncTaskLoader";
    volatile androidx.loader.content.a mCancellingTask;
    private final java.util.concurrent.Executor mExecutor;
    android.os.Handler mHandler;
    long mLastLoadCompleteTime;
    volatile androidx.loader.content.a mTask;
    long mUpdateThrottle;

    public b(android.content.Context p4)
    {
        this.mStarted = 0;
        this.mAbandoned = 0;
        this.mReset = 1;
        this.mContentChanged = 0;
        this.mProcessingChange = 0;
        this.mContext = p4.getApplicationContext();
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = androidx.loader.content.a.o;
        return;
    }

    public void cancelLoadInBackground()
    {
        return;
    }

    public void dispatchOnCancelled(androidx.loader.content.a p1, Object p2)
    {
        this.onCanceled(p2);
        if (this.mCancellingTask == p1) {
            this.rollbackContentChanged();
            this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
            this.mCancellingTask = 0;
            this.deliverCancellation();
            this.executePendingTask();
        }
        return;
    }

    public void dispatchOnLoadComplete(androidx.loader.content.a p3, Object p4)
    {
        if (this.mTask == p3) {
            if (!this.isAbandoned()) {
                this.commitContentChanged();
                this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
                this.mTask = 0;
                this.deliverResult(p4);
                return;
            } else {
                this.onCanceled(p4);
                return;
            }
        } else {
            this.dispatchOnCancelled(p3, p4);
            return;
        }
    }

    public void dump(String p5, java.io.FileDescriptor p6, java.io.PrintWriter p7, String[] p8)
    {
        p7.print(p5);
        p7.print("mId=");
        p7.print(this.mId);
        p7.print(" mListener=");
        p7.println(this.mListener);
        if ((this.mStarted) || ((this.mContentChanged) || (this.mProcessingChange))) {
            p7.print(p5);
            p7.print("mStarted=");
            p7.print(this.mStarted);
            p7.print(" mContentChanged=");
            p7.print(this.mContentChanged);
            p7.print(" mProcessingChange=");
            p7.println(this.mProcessingChange);
        }
        if ((this.mAbandoned) || (this.mReset)) {
            p7.print(p5);
            p7.print("mAbandoned=");
            p7.print(this.mAbandoned);
            p7.print(" mReset=");
            p7.println(this.mReset);
        }
        if (this.mTask != null) {
            p7.print(p5);
            p7.print("mTask=");
            p7.print(this.mTask);
            p7.print(" waiting=");
            p7.println(this.mTask.m);
        }
        if (this.mCancellingTask != null) {
            p7.print(p5);
            p7.print("mCancellingTask=");
            p7.print(this.mCancellingTask);
            p7.print(" waiting=");
            p7.println(this.mCancellingTask.m);
        }
        if (this.mUpdateThrottle != 0) {
            p7.print(p5);
            p7.print("mUpdateThrottle=");
            p0.e.e(this.mUpdateThrottle, p7);
            p7.print(" mLastLoadCompleteTime=");
            long v5_4 = this.mLastLoadCompleteTime;
            long v0_1 = android.os.SystemClock.uptimeMillis();
            if (v5_4 != 0) {
                p0.e.e((v5_4 - v0_1), p7);
            } else {
                p7.print("--");
            }
            p7.println();
        }
        return;
    }

    public void executePendingTask()
    {
        if ((this.mCancellingTask == null) && (this.mTask != null)) {
            if (this.mTask.m) {
                this.mTask.m = 0;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if ((this.mUpdateThrottle <= 0) || (android.os.SystemClock.uptimeMillis() >= (this.mLastLoadCompleteTime + this.mUpdateThrottle))) {
                IllegalStateException v0_6 = this.mTask;
                long v2_2 = this.mExecutor;
                if (v0_6.c == 1) {
                    v0_6.c = 2;
                    v0_6.a.getClass();
                    v2_2.execute(v0_6.b);
                } else {
                    IllegalStateException v0_9 = u.e.c(v0_6.c);
                    if (v0_9 == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    } else {
                        if (v0_9 == 2) {
                            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        } else {
                            throw new IllegalStateException("We should never reach this state");
                        }
                    }
                }
            } else {
                this.mTask.m = 1;
                this.mHandler.postAtTime(this.mTask, (this.mLastLoadCompleteTime + this.mUpdateThrottle));
                return;
            }
        }
        return;
    }

    public boolean isLoadInBackgroundCanceled()
    {
        if (this.mCancellingTask == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public abstract Object loadInBackground();

    public boolean onCancelLoad()
    {
        if (this.mTask == null) {
            return 0;
        } else {
            if (!this.mStarted) {
                this.mContentChanged = 1;
            }
            if (this.mCancellingTask == null) {
                if (!this.mTask.m) {
                    boolean v0_3 = this.mTask;
                    v0_3.d.set(1);
                    boolean v0_5 = v0_3.b.cancel(0);
                    if (v0_5) {
                        this.mCancellingTask = this.mTask;
                        this.cancelLoadInBackground();
                    }
                    this.mTask = 0;
                    return v0_5;
                } else {
                    this.mTask.m = 0;
                    this.mHandler.removeCallbacks(this.mTask);
                    this.mTask = 0;
                    return 0;
                }
            } else {
                if (this.mTask.m) {
                    this.mTask.m = 0;
                    this.mHandler.removeCallbacks(this.mTask);
                }
                this.mTask = 0;
                return 0;
            }
        }
    }

    public void onCanceled(Object p1)
    {
        return;
    }

    public void onForceLoad()
    {
        this.cancelLoad();
        this.mTask = new androidx.loader.content.a(this);
        this.executePendingTask();
        return;
    }

    public Object onLoadInBackground()
    {
        return this.loadInBackground();
    }

    public void setUpdateThrottle(long p3)
    {
        this.mUpdateThrottle = p3;
        if (p3 != 0) {
            this.mHandler = new android.os.Handler();
        }
        return;
    }

    public void waitForLoader()
    {
        java.util.concurrent.CountDownLatch v0_0 = this.mTask;
        try {
            if (v0_0 != null) {
                v0_0.f.await();
            }
        } catch (InterruptedException) {
        }
        return;
    }
}
