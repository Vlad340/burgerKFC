public class Main {
    public static void main(String[] args) {
        Integer decimal = 10;
        Integer hundredth=100;

        Burger burgerChefburger = new Burger();
        burgerChefburger.id = 2963L;
        burgerChefburger.name = "Шефбургер Джуниор Острый";
        burgerChefburger.calories = 250;
        burgerChefburger.weight=161;
        burgerChefburger.proteins=136;
        burgerChefburger.fats = 100;
        burgerChefburger.carbohydrates = 265;
        burgerChefburger.description = "Два сочных стрипса в острой панировке, сочные листья салата, " +
                "пикантные маринованные огурчики, лук, фирменный соус «Бургер» и булочка с черно-белым кунжутом.";
        burgerChefburger.remarks = "* Данные по пищевой и энергетической ценности блюд, представленные в таблице, основаны на " +
                "данных лабораторных исследований, технико-технологических карт и данных по пищевой ценности, " +
                "полученных от поставщиков. Различия в размерах порций, так же как региональные и сезонные различия " +
                "могут влиять на пищевую ценность каждого продукта меню.<br/>Рецептура блюд периодически может меняться." +
                " Информация предоставлена на основе текущего меню и может изменяться без предварительного уведомления." +
                "** В некоторых ресторанах KFC продукты и цены могут отличаться";
        burgerChefburger.price = 99_00L;
        burgerChefburger.photoUrl = "https://s82079.cdn.ngenix.net/YLb95nAs4KMibLPRCtve6Je3.png?dw=230";

        System.out.println(burgerChefburger.id);
        System.out.println(burgerChefburger.name);
        System.out.println(burgerChefburger.calories+" Ккал");
        System.out.println(burgerChefburger.weight+" г");
        System.out.println((double)burgerChefburger.proteins/decimal+" г");
        System.out.println((double)burgerChefburger.fats/decimal+" г");
        System.out.println((double)burgerChefburger.carbohydrates/decimal+" г");
        System.out.println(burgerChefburger.description);
        System.out.println(burgerChefburger.remarks);
        System.out.println((double) burgerChefburger.price/hundredth+" руб");
        System.out.println(burgerChefburger.photoUrl);

        Burger burgerCheeseburger = new Burger();
        burgerCheeseburger.id = 2382L;
        burgerCheeseburger.name = "Чизбургер Де Люкс";
        burgerCheeseburger.calories = 193;
        burgerCheeseburger.weight=226;
        burgerCheeseburger.proteins=126;
        burgerCheeseburger.fats = 66;
        burgerCheeseburger.carbohydrates = 207;
        burgerCheeseburger.description = "Пряный горчичный соус, кетчуп, сочное филе в оригинальной панировке, лук, сыр Чеддер, " +
                "огурцы на пшеничной булочке с кукурузной посыпкой, свежий салат и ломтики помидора.";
        burgerCheeseburger.remarks = "* Данные по пищевой и энергетической ценности блюд, представленные в таблице, основаны на " +
                "данных лабораторных исследований, технико-технологических карт и данных по пищевой ценности, " +
                "полученных от поставщиков. Различия в размерах порций, так же как региональные и сезонные различия " +
                "могут влиять на пищевую ценность каждого продукта меню.<br/>Рецептура блюд периодически может меняться." +
                " Информация предоставлена на основе текущего меню и может изменяться без предварительного уведомления." +
                "** В некоторых ресторанах KFC продукты и цены могут отличаться";
        burgerCheeseburger.price = 124_00L;
        burgerCheeseburger.photoUrl = "https://s82079.cdn.ngenix.net/MXahUbKht6Q6D2wGRYrAz7nu.png?dw=230";

        System.out.println(burgerCheeseburger.id);
        System.out.println(burgerCheeseburger.name);
        System.out.println(burgerCheeseburger.calories+" Ккал");
        System.out.println(burgerCheeseburger.weight+" г");
        System.out.println((double) burgerCheeseburger.proteins/decimal+" г");
        System.out.println((double)burgerCheeseburger.fats/decimal+" г");
        System.out.println((double)burgerCheeseburger.carbohydrates/decimal+" г");
        System.out.println(burgerCheeseburger.description);
        System.out.println(burgerCheeseburger.remarks);
        System.out.println((double) burgerCheeseburger.price/hundredth+" руб");
        System.out.println(burgerCheeseburger.photoUrl);
    }
}
