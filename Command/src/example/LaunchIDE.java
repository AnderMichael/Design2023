package example;

public class LaunchIDE {

	public static void main(String[] args) {
		IDE ide = new IDE();

		BuildProjectTask buildProjectTask = new BuildProjectTask(ide);
		CleanBuildTask cleanBuildTask = new CleanBuildTask(ide);
		CompileCodeTask compileCodeTask = new CompileCodeTask(ide);
		RunUnitTestTask runUnitTestTask = new RunUnitTestTask(ide);

		TaskManager taskManager = new TaskManager();
		taskManager.addTask(buildProjectTask);
		taskManager.addTask(cleanBuildTask);
		taskManager.addTask(runUnitTestTask);
		taskManager.addTask(compileCodeTask);

		taskManager.runTasks();
	}

}
