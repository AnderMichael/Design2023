package example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private List<Task> tasks = new ArrayList<>();

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void runTasks() {
		for (Task task : tasks) {
			task.execute();
		}
	}
}
