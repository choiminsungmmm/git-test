package week55;

public class DataStore {
    private String data;

    public void setDate(String data){
        if (data.equals("a")){
            System.out.println("a입력하지마세요");
        }else {
            this.data = data;
        }

        this.data = data;
    }

}

