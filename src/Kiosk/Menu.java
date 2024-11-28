package Kiosk;


import java.util.ArrayList;

public class Menu {
    /**
     * 속성
     */
    public String categoryName;
    public ArrayList<MenuItem> menuItems;

    /**
     * 생성자
     * @param categoryName
     */
    public Menu(String categoryName){
        this.categoryName = categoryName;
        this.menuItems =new ArrayList<>();
    }

    /**
     * 기능
     *
     */
//    public void addMenuItem(MenuItem item){
//        menuItems.add(item);
//    }
    public String getCategoryName() {
        return categoryName;
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public ArrayList<MenuItem> menuItemsList = new ArrayList<MenuItem>();

    MenuItem burger1 = new MenuItem("빅맥버거", 6.9, "순쇠고기 패티,치즈,양상추,피클,양파가 토핑된 버거");
    MenuItem burger2 = new MenuItem("더블 맥스파이시버거", 7.9, "쌀가루 크럼블 시즈닝을 입힌 닭가슴살 패티가 2장!");
    MenuItem burger3 = new MenuItem(" 1955버거", 7.9, "쌀가루 크럼블 시즈닝을 입힌 닭가슴살 패티가 2장!");
    MenuItem burger4 = new MenuItem("불고기버거", 5.9, "한국인 입맛에 딱!! 맞는 불고기 소스");

    ArrayList<MenuItem> menuItemList2 = new ArrayList<MenuItem>();

    MenuItem drink1 = new MenuItem("코카콜라", 2.9, "햄버거의 단짝");
    MenuItem drink2 = new MenuItem("코카콜라 제로", 2.9, "햄버거의 단짝에 제로가 만났다!");
    MenuItem drink3 = new MenuItem("딸기 쉐이크", 3.9, "달콤한 쉐이크에 딸기가 가~득");
    MenuItem drink4 = new MenuItem("바닐라 쉐이크", 3.9, "달콤한 쉐이크에 바나나가 가~득");

    ArrayList<MenuItem> menuItemList3 = new ArrayList<MenuItem>();

    MenuItem dessert1 = new MenuItem("감자튀김", 2.9, "세트의 정석");
    MenuItem dessert2 = new MenuItem("해쉬 브라운", 2.9, "바삭, 고소한 감자 느낌 그대로! ");
    MenuItem dessert3 = new MenuItem("소프트 아이스크림", 1.9, "아이스크림의 정석");
    MenuItem dessert4 = new MenuItem("베리 스트로베리 맥플러리", 3.9, "MZ의 유행의 대명사");

    ArrayList<Menu>categoryList = new ArrayList<Menu>();

    Menu burgerMenu = new Menu("버거");
    Menu drinkMenu = new Menu("음료");
    Menu dessertMenu = new Menu("디저트");



}




