public class Assignment
{
    // That Is Main class of my programme

    public static void main(String[] args)
    {
        weekend student1 = new weekend();

        student1.addDetails("Jane","Malabe",'F',1990,"DS","QA");

        String studentId1 = student1.generate_Id();

        student1.addMark(56,34,12,46,78);

        System.out.print("Student ID : "+studentId1);

        System.out.println("\n");



        weekday student2 = new weekday();

        student2.addDetails("Jim","Kaluthra",'M',1991,"SE","Tuesday");

        String studentId2 = student2.generate_Id();

        student2.addMark(78,89,45,87,90);

        System.out.print("Student ID : "+studentId2);



        Enroll sem1 = new Enroll();

        System.out.print("\n\nEnroll Students Details");

        sem1.enrollStudent(studentId1,"IT");

        sem1.enrollStudent(studentId2,"SE");


        Specialization spe = new Specialization();

        spe.addSpecialization("SE",2.75);

        spe.addSpecialization("DS",3.5);





    }
}
