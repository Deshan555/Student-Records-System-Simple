import java.util.Random;

public class weekday
{

    protected static void addDetails(String std_name, String std_address, Character sex, int born_year, String specialization, String std_type)
    {
        String Gender = sex.toString();

        String DOB = String.valueOf(born_year);

        // special attribute add to Student Type

        std_type = "free day "+std_type;

        String details_array[] = {std_name,std_address,Gender,DOB,specialization,std_type};

        ShowDetails(std_name,std_address,Gender,DOB,specialization,std_type);

    }

    protected static String generate_Id()
    {
            Random rand = new Random();

            int random_id = rand.nextInt(99999);

            String ID = String.valueOf(random_id);

            String std_id = "IT"+ID;

        return std_id;
    }

    protected static void ShowDetails(String std_name,String std_address,String Gender,String DOB, String specialization,String std_type)
    {
        System.out.println("\nStudent Name : "+std_name+"\nStudent Address : "+std_address

        +"\nGender : "+Gender+"\nStudent Year : "+DOB+"\nStudent Specialization : "+specialization+"\nStudent : "+std_type);

    }

    protected static void addMark(int marks1,int marks2,int marks3,int marks4,int marks5)
    {
        try
        {
            int marks_array[] = {marks1,marks2,marks3,marks4,marks5};
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

}
