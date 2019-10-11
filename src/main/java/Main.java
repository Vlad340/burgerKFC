public class Main {
    public static void main(String[] args) {
        Integer decimal = 10;

        Burger burger = new Burger();
        burger.id = 2963L;
        burger.name = "Шефбургер Джуниор Острый";
        burger.calories = 250;
        burger.weight=161;
        burger.proteins=136;
        burger.fats = 100;
        burger.carbohydrates = 265;
        burger.description = "Два сочных стрипса в острой панировке, сочные листья салата, " +
                "пикантные маринованные огурчики, лук, фирменный соус «Бургер» и булочка с черно-белым кунжутом.";
        burger.remarks = "* Данные по пищевой и энергетической ценности блюд, представленные в таблице, основаны на " +
                "данных лабораторных исследований, технико-технологических карт и данных по пищевой ценности, " +
                "полученных от поставщиков. Различия в размерах порций, так же как региональные и сезонные различия " +
                "могут влиять на пищевую ценность каждого продукта меню.<br/>Рецептура блюд периодически может меняться." +
                " Информация предоставлена на основе текущего меню и может изменяться без предварительного уведомления." +
                "** В некоторых ресторанах KFC продукты и цены могут отличаться";
        burger.price = 99_00L;
        burger.photoUrl = "https://s82079.cdn.ngenix.net/YLb95nAs4KMibLPRCtve6Je3.png?dw=230";

        System.out.println(burger.id);
        System.out.println(burger.name);
        System.out.println(burger.calories);
        System.out.println(burger.weight);
        System.out.println(burger.proteins/decimal);
        System.out.println(burger.fats/decimal);
        System.out.println(burger.carbohydrates/decimal);
        System.out.println(burger.description);
        System.out.println(burger.remarks);
        System.out.println(burger.price);
        System.out.println(burger.photoUrl);

        Burger burger = new Burger();
        burger.id = 2382L;
        burger.name = "Чизбургер Де Люкс";
        burger.calories = 193;
        burger.weight=226;
        burger.proteins=126;
        burger.fats = 66;
        burger.carbohydrates = 207;
        burger.description = "Пряный горчичный соус, кетчуп, сочное филе в оригинальной панировке, лук, сыр Чеддер, " +
                "огурцы на пшеничной булочке с кукурузной посыпкой, свежий салат и ломтики помидора.";
        burger.remarks = "* Данные по пищевой и энергетической ценности блюд, представленные в таблице, основаны на " +
                "данных лабораторных исследований, технико-технологических карт и данных по пищевой ценности, " +
                "полученных от поставщиков. Различия в размерах порций, так же как региональные и сезонные различия " +
                "могут влиять на пищевую ценность каждого продукта меню.<br/>Рецептура блюд периодически может меняться." +
                " Информация предоставлена на основе текущего меню и может изменяться без предварительного уведомления." +
                "** В некоторых ресторанах KFC продукты и цены могут отличаться";
        burger.price = 124_00L;
        burger.photoUrl = "https://s82079.cdn.ngenix.net/MXahUbKht6Q6D2wGRYrAz7nu.png?dw=230";

        System.out.println(burger.id);
        System.out.println(burger.name);
        System.out.println(burger.calories);
        System.out.println(burger.weight);
        System.out.println(burger.proteins/decimal);
        System.out.println(burger.fats/decimal);
        System.out.println(burger.carbohydrates/decimal);
        System.out.println(burger.description);
        System.out.println(burger.remarks);
        System.out.println(burger.price);
        System.out.println(burger.photoUrl);
    }
}
