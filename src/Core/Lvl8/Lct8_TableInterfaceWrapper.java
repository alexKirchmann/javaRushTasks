package Core.Lvl8;

import java.util.List;

public class Lct8_TableInterfaceWrapper {

    static class TableInterfaceWrapper implements TableInterface{
        private TableInterface tableInterface;

        public TableInterfaceWrapper (TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel (List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText (String newHeaderText){
            tableInterface.setHeaderText(newHeaderText);
        }
    }






    interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }

}


/*
public class TableInterfaceWrapper implements TableInterface{
        private  TableInterface data;
        public  TableInterfaceWrapper (TableInterface data)
        {
            this.data=data;
        }

        @Override
        public void setModel(List rows) {
               System.out.println(rows.size());
               data.setModel(rows);
        }

        @Override
        public String getHeaderText() {
                return data.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            data.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
 */