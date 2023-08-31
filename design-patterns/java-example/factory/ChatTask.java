package factory;

public class ChatTask implements Task{
    @Override
    public String execute() {
        return "A chat task is being executed";
    }
}
