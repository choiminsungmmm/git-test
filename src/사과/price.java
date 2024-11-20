//package 사과;
//
//import java.security.PublicKey;
//
//public class FishBread {
//
//    //붕어빵 FishBread 클래스를 만들겁니다.
//    //앙금 ,반죽, 가격
//    // 앙금 ,반죽 정하고 이후에 가격을 결정할겁니다.
//    //이러한 요구사항에 부합하는 클래스를 만들어 보세요.
//    public String type;
//    public String paste;
//    public  double price;
//    public FishBread(String type,String paste){
//
//        this.type = type;
//        this.paste = paste;
//    }
//        public void changeprice(double price){
//            this.price = price;
//
//        }
//
//
//
//
//    // 2단계
//    //앙금 반죽 가격 이름
//    ////////////////////////////////
//    // 2단계에서 이름이라는 맴버변수 가 추가된것
//    // 1단계에서 만든 생성자에서 받는 앙금과 반죽을 통해서 이름을 만들어줘야합니다.
//    // 생성자에서 이름을 따로 받는것이 아니라 앙금과 반죽을 조합해서 이름이라는 맴버 변수에 넣어주는것입니다.
//
//    // 붕어빵 이름을 만들어 주는데
//    // 붕어빵 이름은 앙금 +반죽으로 지정
//    // ex) 밀가루 슈붕
//    // 밀가루로 만든 슈붕
//
//    // ex) 밀가루 팔
//    // 밀가루로 만든 팥
//    // 밀가루 +슈크림  --> 반죽 +앙금
//    public class FishBread {
//        public String type;
//        public String paste;          //맴버변수
//        public  double price;
//        public String name;
//
//        public FishBread (String type,String paste){
//
//        this.type = type;
//        this.paste = paste;
//        this.name = type+ "로만든 "+ paste;
//        }
//
//        public void changename(double price){
//            this.price = price;
//            }
//
//    }
//
//
//
//
//
//// 투자자 (invest)
//    // 투자라는 클래스를 만들고
//    //어떤 코인의 이름
//    //어떤 거래소에서 구매를 할건지
//    // 희망 목표가를 설정합니다.
//    //현재가 라는 맴버 변수
//    //코멘트라는 것을 코인 이름 + 희망 목표가 + 가즈아!
//
////    Class 투자 {
////        코인의 이름;
////        거래소;
////        희망 목표가;
////        현재가;
////        코멘트;
//    }
//    //코인의 이름, 거래소의 이름, 희망 목표가를 입력을 받는다
//    //코멘트라는 것을 코인 이름 + 희망 목표가 +가즈아 !! 이거로 생성자에서 설정이 된다
//    // 이후 현재가를 수정할수 있다
//    // 이후 희망 목표가를 현재가로 변경할수있다.
//    Public Class invest(){
//        public String name;
//        public String location;
//        public double hopeprice;
//        public double price;
//        public String comment;
//
//        public invest( String name,  String location,double hopeprice){
//            this.name = name;
//            this.location = location;
//            this.hopeprice = hopeprice;
//            this.comment = name + hopeprice + "가즈아!";
//        }
//            public void changeprice(double price){
//                this.price = price;
//
//            }
//            public void changehopeprice(double hopeprice){
//                this.hopeprice = price;
//            }
//
//        // 2단계
//        // 코인의 이름만 가지고 인스턴스를 생성 할수도 있다
//        //이후 하나의 매서드 에서 거래소,희망 목표가,현재가를 매개변수로 입력받아 값을 수행할수있다.
//        //여기서 코멘트 까먹지 마세요
//
//       public invest (String coinname){
//            this,coinname = coinname;
//        }
//        public void changeprie(double price){
//            this.price = price;
//        }
//        public void changeprie(double price){
//            this.price = price;
//
//    }
////  public     int   number (int num1){
//
//        public
//
//
//
//
//
//
//
//
//}
