package homework12WorkerLambda;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
