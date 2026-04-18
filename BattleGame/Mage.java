
class Mage extends Character implements Attackable
{
    static Random r = new Random();

    Mage(String name,int health)
    {
        super(name,health);
    }

    public int attack()
    {
        return (10+r.nextInt(21));
    }
}
