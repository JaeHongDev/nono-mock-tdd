package domain;

public class State {
    private final Context context;

    public State(Context context) {
        this.context = context;
    }

    public Integer run(){
        if(context.runAble()){
            return 1;
        }
        return 0;
    }
}
