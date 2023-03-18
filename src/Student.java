abstract class Student {
    public String fname="John Baa";
    public int age=24;
    public abstract void study();
}
class StudentDetails extends Student{
    public int graduationYear=2018;

    @Override
    public void study() {
        System.out.println("Studying all day long");
    }

}
