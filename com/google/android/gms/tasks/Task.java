package com.google.android.gms.tasks;
public abstract class Task {

    public Task()
    {
        return;
    }

    public com.google.android.gms.tasks.Task addOnCanceledListener(android.app.Activity p1, com.google.android.gms.tasks.OnCanceledListener p2)
    {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public com.google.android.gms.tasks.Task addOnCanceledListener(com.google.android.gms.tasks.OnCanceledListener p2)
    {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public com.google.android.gms.tasks.Task addOnCanceledListener(java.util.concurrent.Executor p1, com.google.android.gms.tasks.OnCanceledListener p2)
    {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public com.google.android.gms.tasks.Task addOnCompleteListener(android.app.Activity p1, com.google.android.gms.tasks.OnCompleteListener p2)
    {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public com.google.android.gms.tasks.Task addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener p2)
    {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public com.google.android.gms.tasks.Task addOnCompleteListener(java.util.concurrent.Executor p1, com.google.android.gms.tasks.OnCompleteListener p2)
    {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract com.google.android.gms.tasks.Task addOnFailureListener();

    public abstract com.google.android.gms.tasks.Task addOnFailureListener();

    public abstract com.google.android.gms.tasks.Task addOnFailureListener();

    public abstract com.google.android.gms.tasks.Task addOnSuccessListener();

    public abstract com.google.android.gms.tasks.Task addOnSuccessListener();

    public abstract com.google.android.gms.tasks.Task addOnSuccessListener();

    public com.google.android.gms.tasks.Task continueWith(com.google.android.gms.tasks.Continuation p2)
    {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public com.google.android.gms.tasks.Task continueWith(java.util.concurrent.Executor p1, com.google.android.gms.tasks.Continuation p2)
    {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public com.google.android.gms.tasks.Task continueWithTask(com.google.android.gms.tasks.Continuation p2)
    {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public com.google.android.gms.tasks.Task continueWithTask(java.util.concurrent.Executor p1, com.google.android.gms.tasks.Continuation p2)
    {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract Object getResult();

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public com.google.android.gms.tasks.Task onSuccessTask(com.google.android.gms.tasks.SuccessContinuation p2)
    {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public com.google.android.gms.tasks.Task onSuccessTask(java.util.concurrent.Executor p1, com.google.android.gms.tasks.SuccessContinuation p2)
    {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
