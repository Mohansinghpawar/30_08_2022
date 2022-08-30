public class Harnivorous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of type A
				Animal a = new Animal();

				// object of type B
				Dog b = new Dog();

				// object of type C
				Cat c = new Cat();
    
        Elephant e=new Elephant();
				// obtain a reference of type A
				Animal ref;
				
				// ref refers to an A object
				ref = a;

				// calling A's version of m1()
				ref.animalEat();

				// now ref refers to a B object
				ref = b;

				// calling B's version of m1()
				ref.animalEat();

				// now ref refers to a C object
				ref = c;

				// calling C's version of m1()
				ref.animalEat();
	}

}class Animal
{
	public void animalEat()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal
{
	// overriding m1()
	void dogBarks()
	{
		System.out.println("Barking....");
	}
	@Override
	public void animalEat()
	{
		System.out.println("Inside A's m1 method");
	}
	
}

class Cat extends Animal
{
	// overriding m1()
	void CatMeu()
	{
		System.out.println("Meuuu....");
	}
	@Override
	public void animalEat()
	{
		System.out.println("eating...");
	}
}

