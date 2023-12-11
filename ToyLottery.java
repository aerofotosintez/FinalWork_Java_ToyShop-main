public class ToyLottery {
    public static void main(String[] args) {
        ToyShop shop = new ToyShop();

        Toy toy1 = new Toy(1, "Машинка", 10, 20);
        Toy toy2 = new Toy(2, "Кукла", 200, 40);
        Toy toy3 = new Toy(3, "Сабля", 200, 90);
        Toy toy4 = new Toy(4, "Кухня", 50, 30);
        Toy toy5 = new Toy(5, "Настольная игра", 200, 90);
        Toy toy6 = new Toy(6, "Карты", 10, 10);

        shop.addToy(toy1);
        shop.addToy(toy2);
        shop.addToy(toy3);
        shop.addToy(toy4);
        shop.addToy(toy5);
        shop.addToy(toy6);

        shop.changeToyFrequency(1, 30);

        shop.organizeLottery();

        Toy prizeToy = shop.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}
