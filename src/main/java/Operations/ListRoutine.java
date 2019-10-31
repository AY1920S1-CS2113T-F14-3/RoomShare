package Operations;

import CustomExceptions.RoomShareException;
import Model_Classes.ProgressBar;

public class ListRoutine {
    private TaskList taskList;
    private Ui ui = new Ui();

    /**
     * constructor for the ListRoutine
     * @param taskList the task list to be listed using the list routine
     */
    public ListRoutine(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * the listing method to be used by ListRoutine
     * lists the tasks and the associated information, while showing the progress bar
     */
    public void list() {
        ui.showList();
        try {
            taskList.list();
        } catch (RoomShareException e) {
            ui.showError(e);
        }
        ProgressBar progressBar = new ProgressBar(taskList.getSize(), taskList.getDoneSize());
        ui.showBar(progressBar.showBar());
    }
}
