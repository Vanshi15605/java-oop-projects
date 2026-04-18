
class Warrior extends Character implements Attackable
{
    static Random r = new Random();

    Warrior(String name,int health)
    {
        super(name,health);
    }

    public int attack()
    { 
        return (15+r.nextInt(11));
    }
}
