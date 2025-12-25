package com.google.android.gms.tasks;
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {

    private DuplicateTaskCompletionException(String p1, Throwable p2)
    {
        super(p1, p2);
        return;
    }

    public static IllegalStateException of(com.google.android.gms.tasks.Task p3)
    {
        if (p3.isComplete()) {
            String v3_2;
            Exception v0_2 = p3.getException();
            if (v0_2 == null) {
                if (!p3.isSuccessful()) {
                    if (!p3.isCanceled()) {
                        v3_2 = "unknown issue";
                    } else {
                        v3_2 = "cancellation";
                    }
                } else {
                    v3_2 = "result ".concat(String.valueOf(p3.getResult()));
                }
            } else {
                v3_2 = "failure";
            }
            return new com.google.android.gms.tasks.DuplicateTaskCompletionException("Complete with: ".concat(v3_2), v0_2);
        } else {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }
}
