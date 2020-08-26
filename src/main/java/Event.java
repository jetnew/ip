import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    LocalDate taskAt;

    Event(String taskName, LocalDate taskAt) {
        super(taskName);
        this.taskAt = taskAt;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + this.taskAt.format(DateTimeFormatter.ofPattern("MMM dd yyyy")) + ")";
    }

    @Override
    public String toFileFormat() {
        return "E|" + (this.isDone ? "1" : "0") + "|" + this.taskName + "|" + this.taskAt;
    }

    static Event fromFileFormat(String fileFormatString) {
        String[] tokens = fileFormatString.split("\\|");
        Event loaded = new Event(tokens[2], tokens[3]);
        if (tokens[1].equals("1")) {
            loaded.setDone();
        }
        return loaded;
    }
}