package sk.stuba.fei.vsa;
import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void  main(String[] args){

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager manager = managerFactory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();


        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        try {
            Date date = simpleDateFormat.parse("2018-09-09");
            manager.persist(new Osoba());
            manager.persist(new Osoba("David",date,9.6f));
            transaction.commit();

            Query query = manager.createNativeQuery("SELECT * FROM OSOBA", Osoba.class);
            List<Osoba> osobas = query.getResultList();
            for(Osoba osoba : osobas){
                System.out.println(osoba);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



           /* Display the Books from Database*/




    }
}