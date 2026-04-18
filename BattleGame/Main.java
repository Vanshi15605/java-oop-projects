
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Choose your Character");
        System.out.println("1 Warrior");
        System.out.println("2 Mage");
        System.out.println("3 Archer");

        int choice=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your character name");
        String character=sc.nextLine();

        Character you=null;

        if(choice==1)
            you=new Warrior(character,100);
        else if(choice==2)
            you=new Mage(character,100);
        else if(choice==3)
            you=new Archer(character,100);
        else
        {
            System.out.println("Invalid choice");
            return;
        }

        Random r=new Random();
        int enemyChoice=r.nextInt(3);

        Character enemy;

        if(enemyChoice==0)
            enemy=new Warrior("WarriorX",100);
        else if(enemyChoice==1)
            enemy=new Mage("MageX",100);
        else
            enemy=new Archer("ArcherX",100);

        System.out.println("Enemy selected: "+enemy.name);

        int round=1;

        while(you.isAlive() && enemy.isAlive())
        {
            System.out.println("---- Round "+round+" ----");
            System.out.println(you.name+" HP: "+you.health+" | "+enemy.name+" HP: "+enemy.health);

            System.out.println("Choose action:");
            System.out.println("Press 1 to Attack");
            int action=sc.nextInt();

            if(action!=1)
                continue;

            int damage=((Attackable)you).attack();
            System.out.println(you.name+" attacks "+enemy.name+" for "+damage+" damage");
            enemy.takeDamage(damage);

            if(!enemy.isAlive())
            {
                System.out.println(enemy.name+" is dead");
                System.out.println(you.name+" wins");
                break;
            }

            damage=((Attackable)enemy).attack();
            System.out.println(enemy.name+" attacks "+you.name+" for "+damage+" damage");
            you.takeDamage(damage);

            if(!you.isAlive())
            {
                System.out.println(you.name+" is dead");
                System.out.println(enemy.name+" wins");
                break;
            }

            round++;
        }

        sc.close();
    }
}
