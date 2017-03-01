
public class education
{
    String gen;
    int age;
    Boolean college = false;
    Boolean male;
    int fail = 0;
    
   public education(String gen, int age){
       this.gen = gen;
       this.age = age;
       if(age>18){
           college = true;
       }
        
       if(gen == "m"){
            male = true;
       }else if(gen == "f"){
            male = false;
       }else{
           System.out.print("Incorrect");
           fail = 1;
       }
   }

   public Boolean getCollege(){
       if(fail == 1){
           return null;
        }else
          return college;
    }
    
    /**Get the gender of the pupil*/
   public Boolean getGen(){
         if(fail == 1){
           return null;
        }else
           return male;
    }
}

