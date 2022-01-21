package homework12WorkerLambda;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
