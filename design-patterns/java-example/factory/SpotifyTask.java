package factory;

public class SpotifyTask implements Task {
    @Override
    public String execute() {
        return "A music task is being executed";
    }
}
