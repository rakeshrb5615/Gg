package com.google.android.play.core.integrity;
public class StandardIntegrityException extends com.google.android.gms.common.api.ApiException {
    private final Throwable a;

    public StandardIntegrityException(int p5, Throwable p6)
    {
        String v1_2 = com.google.android.play.core.integrity.model.b.a(p5);
        StringBuilder v2_1 = new StringBuilder("Standard Integrity API error (");
        v2_1.append(p5);
        v2_1.append("): ");
        v2_1.append(v1_2);
        v2_1.append(".");
        super(new com.google.android.gms.common.api.Status(p5, v2_1.toString()));
        if (p5 == null) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        } else {
            super.a = p6;
            return;
        }
    }

    public final declared_synchronized Throwable getCause()
    {
        return this.a;
    }

    public int getErrorCode()
    {
        return super.getStatusCode();
    }
}
