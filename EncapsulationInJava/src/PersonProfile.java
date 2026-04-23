import java.util.*;

class person{
  private  String name;
  private int age;
  private String country;

  public void setDetails(String name, int age , String country){
      this.name = name;
      if(age > 18 && age < 120){
      this.age = age;}
      else{
          System.out.println("not a valid age");
      }
      this.country = country;
  }

  public String getName(){
      return name;
  }

    public int getAge(){
        return age;
    }

    public String getCountry(){
        return country;
    }


}


public class PersonProfile {
   public static void main(String[] args) {
        person p = new person();

        p.setDetails("Uttkarsh",19,"india");

        System.out.println("the details of person is :");

        System.out.println("Name :"+p.getName());
        System.out.println("Age is : "+p.getAge());
        System.out.println("country is : "+p.getCountry());


    }
}
