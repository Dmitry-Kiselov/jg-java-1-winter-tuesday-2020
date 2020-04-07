package l12;

public class DaysDemo {

    public static void main(String[] args) {

        Days days = Days.SUNDAY;

        switch (days) {
            case MONDAY:
                System.out.println("Work real hard");
                break;

            case TUESDAY:
                System.out.println("Java courses");
                break;

            case WEDNESDAY:
                System.out.println("Almost like friday");
                break;

            case THURSDAY:
                System.out.println("Java courses again");
                break;

            case FRIDAY:
                System.out.println("Bottoms up");
                break;

            case SATURDAY:
                System.out.println("Hangover");
                break;

            case SUNDAY:
                System.out.println("Zavtra ponedelnik :-(");
                break;
        }

    }

}
