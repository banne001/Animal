public class Cat implements Animal{
   private String name;
   public Cat(String name){
      this.name = name;
   }
   public String toString(){
      return name + " the Cat" ;
   }
    public String makeSound(){
       return "Purr";
   }
   public String getName(){
      return this.name;
   }
}