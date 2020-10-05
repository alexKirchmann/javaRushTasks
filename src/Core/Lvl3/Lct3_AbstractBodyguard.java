package Core.Lvl3;

abstract class Lct3_AbstractBodyguard {

    abstract void applyMartialArts(Attacker attacker);

    void shoot(Attacker attacker)
    {
        gun.shoot(attacker);
    }

    void saveClientLife(Attacker attacker)
    {
        if (attacker.hasGun())
            shoot(attacker);
        else
            applyMartialArts(attacker);
    }
}
