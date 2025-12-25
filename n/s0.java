package n;
public abstract class s0 {

    public static android.view.textclassifier.TextClassifier a(android.widget.TextView p1)
    {
        android.view.textclassifier.TextClassifier v1_4 = ((android.view.textclassifier.TextClassificationManager) p1.getContext().getSystemService(android.view.textclassifier.TextClassificationManager));
        if (v1_4 == null) {
            return android.view.textclassifier.TextClassifier.NO_OP;
        } else {
            return v1_4.getTextClassifier();
        }
    }
}
