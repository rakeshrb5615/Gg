package com.google.android.gms.common.sqlite;
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    public CursorWrapper(android.database.Cursor p3)
    {
        super(p3);
        IllegalArgumentException v0_0 = 0;
        while ((v0_0 < 10) && ((p3 instanceof android.database.CursorWrapper))) {
            p3 = ((android.database.CursorWrapper) p3).getWrappedCursor();
            v0_0++;
        }
        if (!(p3 instanceof android.database.AbstractWindowedCursor)) {
            throw new IllegalArgumentException("Unknown type: ".concat(p3.getClass().getName()));
        } else {
            super.zza = ((android.database.AbstractWindowedCursor) p3);
            return;
        }
    }

    public void fillWindow(int p2, android.database.CursorWindow p3)
    {
        this.zza.fillWindow(p2, p3);
        return;
    }

    public android.database.CursorWindow getWindow()
    {
        return this.zza.getWindow();
    }

    public final synthetic android.database.Cursor getWrappedCursor()
    {
        return this.zza;
    }

    public final boolean onMove(int p2, int p3)
    {
        return this.zza.onMove(p2, p3);
    }

    public void setWindow(android.database.CursorWindow p2)
    {
        this.zza.setWindow(p2);
        return;
    }
}
