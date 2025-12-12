package lt.ng;

import lt.ng.service.TaskProcessor;

public class Main {
    public static void main(String[] args) {
        TaskProcessor taskProcessor = new TaskProcessor();

        taskProcessor.welcome();
        taskProcessor.processWantedTask();
    }
}
