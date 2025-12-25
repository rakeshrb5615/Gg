package androidx.loader.content;
public abstract class e {
    boolean mAbandoned;
    boolean mContentChanged;
    android.content.Context mContext;
    int mId;
    androidx.loader.content.d mListener;
    androidx.loader.content.c mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public void abandon()
    {
        this.mAbandoned = 1;
        this.onAbandon();
        return;
    }

    public boolean cancelLoad()
    {
        return this.onCancelLoad();
    }

    public void commitContentChanged()
    {
        this.mProcessingChange = 0;
        return;
    }

    public String dataToString(Object p3)
    {
        StringBuilder v0_1 = new StringBuilder(64);
        p0.e.a(p3, v0_1);
        v0_1.append("}");
        return v0_1.toString();
    }

    public void deliverCancellation()
    {
        return;
    }

    public void deliverResult(Object p5)
    {
        androidx.lifecycle.y v0_0 = this.mListener;
        if (v0_0 != null) {
            androidx.lifecycle.y v0_1 = ((q1.c) v0_0);
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                android.os.Handler v2_0;
                if (v0_1.f != androidx.lifecycle.c0.k) {
                    v2_0 = 0;
                } else {
                    v2_0 = 1;
                }
                v0_1.f = p5;
                if (v2_0 != null) {
                    androidx.lifecycle.y v0_2 = v0_1.j;
                    Throwable v5_3 = o.a.V().f;
                    if (v5_3.g == null) {
                        if (v5_3.g == null) {
                            v5_3.g = o.b.V(android.os.Looper.getMainLooper());
                        }
                    }
                    v5_3.g.post(v0_2);
                    return;
                }
            } else {
                v0_1.h(p5);
                return;
            }
        }
        return;
    }

    public abstract void dump();

    public void forceLoad()
    {
        this.onForceLoad();
        return;
    }

    public android.content.Context getContext()
    {
        return this.mContext;
    }

    public int getId()
    {
        return this.mId;
    }

    public boolean isAbandoned()
    {
        return this.mAbandoned;
    }

    public boolean isReset()
    {
        return this.mReset;
    }

    public boolean isStarted()
    {
        return this.mStarted;
    }

    public void onAbandon()
    {
        return;
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged()
    {
        if (!this.mStarted) {
            this.mContentChanged = 1;
            return;
        } else {
            this.forceLoad();
            return;
        }
    }

    public abstract void onForceLoad();

    public void onReset()
    {
        return;
    }

    public abstract void onStartLoading();

    public void onStopLoading()
    {
        return;
    }

    public void registerListener(int p2, androidx.loader.content.d p3)
    {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        } else {
            this.mListener = p3;
            this.mId = p2;
            return;
        }
    }

    public void registerOnLoadCanceledListener(androidx.loader.content.c p1)
    {
        return;
    }

    public void reset()
    {
        this.onReset();
        this.mReset = 1;
        this.mStarted = 0;
        this.mAbandoned = 0;
        this.mContentChanged = 0;
        this.mProcessingChange = 0;
        return;
    }

    public void rollbackContentChanged()
    {
        if (this.mProcessingChange) {
            this.onContentChanged();
        }
        return;
    }

    public final void startLoading()
    {
        this.mStarted = 1;
        this.mReset = 0;
        this.mAbandoned = 0;
        this.onStartLoading();
        return;
    }

    public void stopLoading()
    {
        this.mStarted = 0;
        this.onStopLoading();
        return;
    }

    public boolean takeContentChanged()
    {
        boolean v0 = this.mContentChanged;
        this.mContentChanged = 0;
        this.mProcessingChange = (this.mProcessingChange | v0);
        return v0;
    }

    public String toString()
    {
        String v0_2 = new StringBuilder(64);
        p0.e.a(this, v0_2);
        v0_2.append(" id=");
        v0_2.append(this.mId);
        v0_2.append("}");
        return v0_2.toString();
    }

    public void unregisterListener(androidx.loader.content.d p2)
    {
        String v0_0 = this.mListener;
        if (v0_0 == null) {
            throw new IllegalStateException("No listener register");
        } else {
            if (v0_0 != p2) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            } else {
                this.mListener = 0;
                return;
            }
        }
    }

    public void unregisterOnLoadCanceledListener(androidx.loader.content.c p2)
    {
        throw new IllegalStateException("No listener register");
    }
}
