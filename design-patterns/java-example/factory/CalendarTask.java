package factory;

public class CalendarTask implements Task {
    @Override
    public String execute() {
        return "A calendar task is being executed";
    }
}
