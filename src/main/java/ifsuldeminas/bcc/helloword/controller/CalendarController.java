package ifsuldeminas.bcc.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @GetMapping("/today")
    public String today() {
        Date today = new  Date();
        //DateFormat Dateformat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(today);
        return "Hoje é "+ formattedDate;
    }

    @GetMapping("/tomorrow")
    public String tomorrow() {
        //Pega a data corrente
        GregorianCalendar tomorrow = new GregorianCalendar();
        //Soma um dia a data corrente
        tomorrow.roll(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(tomorrow.getTime());
        return "Amanhã será " + formattedDate;
    }
    @GetMapping("/yesterday")
    public String yesterday(){
        //Pega a data corrente
        GregorianCalendar tomorrow = new GregorianCalendar();
        //Soma um dia a data corrente
        tomorrow.roll(Calendar.DAY_OF_MONTH, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(tomorrow.getTime());
        return "Amanhã será " + formattedDate;
    }

}
