package Core.Lvl3.Lct11_RoboFight;

class Robot extends AbstractRobot implements Attackable, Defensable {
    public String name;
    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
