class Reminder(
    val name: String
) {
    private var task: String = ""

    fun remindMeTo(task: String) {
        this.task = task
    }

    fun remind(): String {
        return "$task, $name!"
    }
}