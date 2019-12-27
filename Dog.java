public class Dog implements Animal{
   private String name;
   
   public Dog(String name){
      this.name = name;
   }
   public String toString(){
      return name + " the Dog" ;
   }
   public String makeSound(){
      return "Woof";
   }
   public String getName(){
      return this.name;
   }
}