package factory;

public class TaskFactory {
    public Task getTask(TaskType type) {
        switch (type) {
            case SPOTIFY:
                return new SpotifyTask();
            case CALENDAR:
                return new CalendarTask();
            default:
                return new ChatTask();
        }
    }
}
