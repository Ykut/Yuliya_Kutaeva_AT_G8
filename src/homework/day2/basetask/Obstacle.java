package homework.day2.basetask;

public class Obstacle {
    String severity;
    String description;

    public Obstacle(String severity, String description) {
        this.severity = severity;
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printObstacleDetails(){
        System.out.println("Возникло "+severity+" препятствиие "+description);
    }
}
