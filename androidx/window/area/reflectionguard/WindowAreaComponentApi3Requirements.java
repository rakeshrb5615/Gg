package androidx.window.area.reflectionguard;
public interface WindowAreaComponentApi3Requirements {

    public abstract void addRearDisplayPresentationStatusListener();

    public abstract void addRearDisplayStatusListener();

    public abstract void endRearDisplayPresentationSession();

    public abstract void endRearDisplaySession();

    public abstract android.util.DisplayMetrics getRearDisplayMetrics();

    public abstract androidx.window.extensions.area.ExtensionWindowAreaPresentation getRearDisplayPresentation();

    public abstract void removeRearDisplayPresentationStatusListener();

    public abstract void removeRearDisplayStatusListener();

    public abstract void startRearDisplayPresentationSession();

    public abstract void startRearDisplaySession();
}
