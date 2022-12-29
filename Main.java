class Task {
  private String name;
  private String description;
  private Date dueDate;
  private boolean isCompleted;
  private int priority;
  private String notes;

  public Task(String name, String description, Date dueDate, int priority) {
    this.name = name;
    this.description = description;
    this.dueDate = dueDate;
    this.priority = priority;
    this.isCompleted = false;
  }

  public void markCompleted() {
    this.isCompleted = true;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public void addNotes(String notes) {
    this.notes = notes;
  }

  // getters for each field
}

class TaskList {
  private List<Task> tasks;

  public TaskList() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(task);
  }

  public void removeTask(Task task) {
    tasks.remove(task);
  }

  public List<Task> getTasks() {
    return tasks;
  }
}

class User {
  private String name;
  private String email;
  private List<TaskList> taskLists;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
    this.taskLists = new ArrayList<>();
  }

  public void addTaskList(TaskList taskList) {
    taskLists.add(taskList);
  }

  public void removeTaskList(TaskList taskList) {
    taskLists.remove(taskList);
  }

  public List<TaskList> getTaskLists() {
    return taskLists;
  }

  // getters for each field
}
