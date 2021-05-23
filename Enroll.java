public class Enroll
{
    public static void enrollStudent(String studentID,String specialization)
    {
        String enroll_array[] = {studentID,specialization};

        show_details(enroll_array);

    }

    public static void show_details(String enroll_array[])
    {
        System.out.print("\n"+enroll_array[0]+" : "+enroll_array[1]);
    }
}
