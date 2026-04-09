class BurgerRunner {

    public static void main(String... args) {

        BurgerRun burgerRun = new BurgerRun("Veg", 150);

        Burger burger = burgerRun.info();

        burgerRun.show();
        burger.details();
    }
}