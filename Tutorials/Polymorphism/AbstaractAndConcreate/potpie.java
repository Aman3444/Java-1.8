package Tutorials.Polymorphism.AbstaractAndConcreate;

public class potpie extends food{
    @Override
    public void sam() {
        System.out.println("this method is sam as it was abstract in food class in potpie ");
    }

    @Override
    void eat (){
        System.out.println("This potpie is great");
    }
}
