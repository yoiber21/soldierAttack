//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear unidades con estrategias de ataque y movimiento específicas
        Unit soldier = new Unit(new SoldierAttack(), new SoldierMovement());
        Unit archer = new Unit(new ArcherAttack(), new ArcherMovement());
        Unit knight = new Unit(new KnightAttack(), new KnightMovement());

        // Llamar a los métodos de ataque y movimiento de las unidades
        System.out.println("Unidad Soldado:");
        soldier.attack();
        soldier.move();

        System.out.println("\nUnidad Arquero:");
        archer.attack();
        archer.move();

        System.out.println("\nUnidad Caballero:");
        knight.attack();
        knight.move();
    }
}