import java.util.Scanner;
import java.util.Calendar;
import java.util.LocalTime;
import java.util.DateTimeFormatter;

class Date_and_Time_Converter{
    Calendar d1=new Calendar();

     void setDate(){
        d1.set(7,9,1995);
    }
     void setTime(){
        LocalTime lt=LocalTime.of(23,59,59);
    }
     void SetDatePattern(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = d1.format(formatter);

    }

       
       public static void main(String[] args){
        Date_and_Time_Converter t1= new Date_and_Time_Converter();
        t1.setDate();
        t1.setTime();

    }
}

