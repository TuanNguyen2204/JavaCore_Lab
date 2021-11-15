
public class View {

    public static void main(String[] args) {
        Validate v = new Validate();
        Manager m = new Manager();
        View vi = new View();
        while (true) {
            //display menu
            vi.menu();
            int option = v.getInt("Enter your option: ", "Option[1-4]", 1, 4);
            switch (option) {
                case 1://add task
                    System.out.println("------------Add Task---------------");
                    String requirementName = v.getInputString("Requirement Name: ", "[a-zA-Z ]+");
                    String taskTypeId = v.getTaskType("Task Type: ");
                    String date = v.getDate("Date(dd/MM/yyyy): ", "Date is not exist");
                    double planFrom = v.getTimePlan("From: ", "Plan form must >=8 and <=17.0 (ex:8.0, 8.5 ... 17.0)", 8.0, 17.0);
                    double planTo = v.getTimePlan("To: ", "Plan to must be > "+String.valueOf(planFrom) + " and <= 17.5 ", planFrom + 0.5, 17.5);
                    String assignee = v.getInputString("Assignee: ", "[a-zA-Z ]+");
                    String reviewer = v.getInputString("Reviewer: ", "[a-zA-Z ]+");
                    m.addTask(requirementName, assignee, reviewer, taskTypeId, date, planFrom, planTo);

                    break;
                case 2://delete task
                    if (m.list.isEmpty()) {
                        System.out.println("List empty.");
                        return;
                    }
                    System.out.println("---------Delete Task------");
                    int id = v.getInt("Enter ID: ", "ID not exist", 1, Integer.MAX_VALUE);
                    if (m.checkDuplicateID(id)) {
                        System.out.println("ID not exist");
                    } else {
                        System.out.println("Do you want to delete?(Y/N)");
                        String checkYN = v.checkYN();
                        if (checkYN.equalsIgnoreCase("y")) {
                            m.deleteTask(String.valueOf(id));
                        }
                    }
                    break;

                case 3://show task
                    m.getDataTasks();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    void menu() {
        System.out.println("----------------Task Program-----------------\n"
                + "1. Add task\n"
                + "2. Delete task \n"
                + "3. Display task\n"
                + "4. Exit");
    }
}
