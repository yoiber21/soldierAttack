public class Unit {
    private final AttackStrategy attackStrategy;
    private final MovementStrategy movementStrategy;

    public Unit(AttackStrategy attackStrategy, MovementStrategy movementStrategy) {
        this.attackStrategy = attackStrategy;
        this.movementStrategy = movementStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void move() {
        movementStrategy.move();
    }
}