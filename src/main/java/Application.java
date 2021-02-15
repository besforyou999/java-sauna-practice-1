import java.util.Scanner;

public class Application {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String []args) {

        String input = new String();
        Integer OperationNumber = 0;
        Locker locker = new Locker();
        Food_Menu m = new Food_Menu();
        CheckNumber CN = new CheckNumber();
        Errors E = new Errors();
        ExecuteOperation EO = new ExecuteOperation();

        while (true) {
            locker.PrintLockers();
            AskUser.AskWhichLockerToUse();
            input = sc.nextLine();
            Integer locker_number = CN.CheckGivenLockerNumber(input);
            if (locker_number == -1) {
                return;
            }
            if (locker_number >= 1) {
                SecondPhase.SecondPhaseMethod(locker_number);
            }
        }

    }
}
