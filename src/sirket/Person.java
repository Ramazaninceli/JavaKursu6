package sirket;

public class Person {

    String name;
    String surName;
    int age;


  public int getBirthYear(){
       int dogumYili= (2023-this.age);

      return dogumYili;
   }

   public String toString(){
       String yazilacakYazi=(this.name+""+this.surName+"\t"+this.age);
       return yazilacakYazi;
   }

}
