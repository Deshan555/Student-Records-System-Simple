public class weekend extends weekday
{
    protected static void addDetails(String std_name, String std_address, Character sex, int born_year, String specialization, String std_type)
    {
        String Gender = sex.toString();

        String DOB = String.valueOf(born_year);

        // special attribute add to Student Type

        std_type = "job title "+std_type;

        String details_array[] = {std_name,std_address,Gender,DOB,specialization,std_type};

        ShowDetails(std_name,std_address,Gender,DOB,specialization,std_type);
    }

}
