package Arrays;
class Student{
    public int rollno;
    public String name;
    Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
}

public class ArrayOfObjects {
    public static void main(String[]args){
        Student[] arr;

        arr=new Student[5];
        arr[0]=new Student(1,"vishnu");
        arr[1]=new Student(2,"sony");
        arr[2]=new Student(3,"siri");
        arr[3]=new Student(4,"shikar");
        arr[4]=new Student(5,"mohit");

        for(int i=0;i<arr.length;i++)
            System.out.println("Element at"+i+":"+arr[i].rollno+" "+arr[i].name);
    }
}
