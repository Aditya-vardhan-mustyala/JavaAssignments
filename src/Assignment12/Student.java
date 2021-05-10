package Assignment12;

public class Student
{
    int id,age,year;
    String name,gender,engDepartment;
    double perTillDate;

    Student(int id,String name,int age,String gender,String dept,int year,double percent)
    {
        this.id= id;
        this.name=name;
        this.age=age;
        this.year=year;
        this.engDepartment=dept;
        this.gender=gender;
        this.perTillDate=percent;
    }

    public String toString()
    {
        return "[ " +id+" " + name + " " +age+" "+year+ " "+  engDepartment+" "+ gender+ " " +perTillDate+" ]";
    }
}
