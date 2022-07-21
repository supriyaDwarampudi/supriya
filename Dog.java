abstract class Animal
{
void eat()
{
System.out.println("i can eat");
}
abstract void makeSound();
}
class Dog extends Animal
{
void makeSound()
{
System.out.println("bark bark");
}
public static void main(String args[])
{
Dog d=new Dog();
d.eat();
d.makeSound();
}
}
