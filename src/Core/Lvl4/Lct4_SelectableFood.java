package Core.Lvl4;

class Lct4_SelectableFood {

    public static void main(String[] args) {
        Food food = new Food();
        Food selectable = new Food();

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        food.onSelect();
        food.onEat();
    }

    public static void selectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }
        public void onSelect() {
            System.out.println("The food was selected");
        }

    }
}
