package factory;

public class Main {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();

        Task spotifyTask = factory.getTask(TaskType.SPOTIFY);
        Task calendarTask = factory.getTask(TaskType.CALENDAR);
        Task chatTask = factory.getTask(TaskType.CHAT);

        System.out.println(spotifyTask.execute());
        System.out.println(calendarTask.execute());
        System.out.println(chatTask.execute());
    }
}
