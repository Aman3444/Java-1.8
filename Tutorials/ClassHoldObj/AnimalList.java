package Tutorials.ClassHoldObj;

public class AnimalList {

//    private dog[] list = new dog[5];
//    private int i =0;
//
//    public void add(dog d){
//        //check if the array is full or not
//        if (i <list.length){
//            list[i]=d;
//            System.out.println("Dog added at the index "+i);
//            i++;
//        }
//    }



    private Animal[] Alist= new Animal[5];
    private int i =0;

    public void add(Animal a) {
        if (i<Alist.length){
            Alist[i]=a;
            System.out.println("Animal has been addded at the index :"+i);
            i++;
        }

    }
}
