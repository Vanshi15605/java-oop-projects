class Archer extends Character implements Attackable
{
    static Random r = new Random();

    Archer(String name,int health)
    {
        super(name,health);
    }

    public int attack()
    {
        return (12+r.nextInt(11));
    }
}
