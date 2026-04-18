
abstract class Character
{
    String name;
    int health;

    Character(String name,int health)
    {
        this.name=name;
        this.health=health;
    }

    void takeDamage(int damage)
    {
        health=health-damage;
        System.out.println("Updated Health for "+this.name+" is : "+this.health);
    }

    boolean isAlive()
    {
        return this.health>0;
    }
}
