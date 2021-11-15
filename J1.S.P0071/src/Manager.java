
import java.util.ArrayList;
import java.util.Iterator;

public class Manager {

    ArrayList<Task> list = new ArrayList<>();
    Validate v = new Validate();

    //add Task to list
    public int addTask(String requirementName, String assignee, String reviewer, String taskTypeId, String date, double planFrom, double planTo) {
        int id = list.isEmpty() ? 1 : list.get(list.size() - 1).getId() + 1;

        list.add(new Task(id, taskTypeId, requirementName, date, planFrom, planTo, assignee, reviewer));
        return id;
    }

    //delete Task from list
    public void deleteTask(String id) {
        int idNumber = Integer.valueOf(id);
        for(int i=0; i<list.size(); i++){
            Task task = list.get(i);
            if(task.getId() == idNumber){
                list.remove(task);
                System.out.println("Delete Task Successfully");
                break;
            }
        }
    }
    
    public boolean checkDuplicateID(int id){
        int idNumber = Integer.valueOf(id);
        for(Task task : list){
            if(task.getId() == idNumber){
                return false;
            }
        }
        return true;
    }

    //show Task
    public void getDataTasks() {
        if (list.isEmpty()) {
            System.out.println("List empty.");
        } else {
            System.out.println("----------------------------------------- Task ---------------------------------------");
            System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
            for (Task task : list) {
                System.out.printf("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s\n",
                        task.getId(),
                        task.getRequirementName(),
                        task.getTaskTypeId(),
                        task.getDate(),
                        task.getPlanTo() - task.getPlanFrom(),
                        task.getAssignee(),
                        task.getReviewer());
            }
        }
    }
}
