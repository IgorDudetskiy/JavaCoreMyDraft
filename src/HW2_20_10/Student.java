package HW2_20_10;

public class Student {
    public Student() {
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private String firstname;
    private String lastname;

    public void setAge(int age) {
        if (age > 17 && age < 40) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    private int age;
    private String login;

    public String getPassword() {
        return password.charAt(0)+"*****";
    }

    private
    String password;
    final double socialPayment=4500;
    {
        age=25;
        System.out.println("samples");
    }

    public Student(String firstname, String lastname, int age, String login, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public void PrintInfo(){
        System.out.println(firstname+"h"+ lastname+ "j");
    }
}
