public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += (health * 0.3);
        } else if (level == 2) {
            health += (health * 0.4);
        } else {
            health += (health * 0.5);
        }
    }

    public void destroyed() {
        health -= (health * 1/10);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \nHealth= " + health + "\nLevel= " + level + "\n";
    }
}
