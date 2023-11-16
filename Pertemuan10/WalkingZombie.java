public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += (health * 0.1);
        } else if (level == 2) {
            health += (health * 0.3);
        } else {
            health += (health * 0.4);
        }
    }

    public void destroyed() {
        health -= (health * 2/10);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \nHealth= " + health + "\nLevel= " + level + "\n";
    }
}
