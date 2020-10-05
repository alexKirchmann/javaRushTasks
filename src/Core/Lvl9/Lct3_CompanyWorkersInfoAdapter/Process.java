package Core.Lvl9.Lct3_CompanyWorkersInfoAdapter;

import java.util.HashMap;
import java.util.Map;

public class Process {
    public static Map<String,String> countries = new HashMap<String,String>();

    static
    {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    static class Adapter implements RowItem {
        private Contact contact;
        private Customer customer;

        @Override
        public String getCountryCode() {
            for (Map.Entry<String, String> pair : countries.entrySet()){
                if (pair.getValue() == customer.getCountryName()) {return pair.getKey();}
            }
            return "NOT FOUND";
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String name = contact.getName();
            return name.substring(name.indexOf(" "));
        }

        @Override
        public String getContactLastName() {
            String name = contact.getName();
            return name.substring(0 ,name.indexOf(",")-1);
        }

        @Override
        public String getDialString() {
            String number = contact.getPhoneNumber().replaceAll("\\)","");
            number = number.replaceAll("\\(","");
            number = number.replaceAll("-   ","");
            return "callto://"+number;
        }
    }

    public interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}
