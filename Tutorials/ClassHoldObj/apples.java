package Tutorials.ClassHoldObj;

public class apples {
//    public static void main(String[] args) {
//        dogList dlist = new dogList();
//        dog d = new dog();
//        dlist.add(d);
//}


    public static void main(String[] args) {
        AnimalList Alist = new AnimalList();
        dog d = new dog();
        fish f = new fish();
        Alist.add(d);// addded the dog object
        Alist.add(f);// added the fish object ASSS


        System.out.println("");
        Animal[] animalList= new Animal[2];
        dog d1 = new dog ();
        fish f1 = new fish ();
         animalList[0]= d;
         animalList[1]=f;
         for(Animal x: animalList){
             x.noise();
         }

    }
}
