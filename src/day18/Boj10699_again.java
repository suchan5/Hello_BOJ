package day18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Boj10699_again {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd"); // DD로 해주면 날짜가 3자리수로 이상하게 뜬다. dd로 해줘야함
        System.out.println(simpleDateFormat.format(date));
    }
}