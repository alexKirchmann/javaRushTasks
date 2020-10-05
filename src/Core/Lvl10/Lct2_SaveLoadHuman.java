package Core.Lvl10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lct2_SaveLoadHuman {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }





    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);

            if (name == null) {
                System.out.println("You can't save Person without name!");
            }

            else {
                printWriter.println(name);

                if (assets != null) {
                    printWriter.println("y");

                    for (Asset asset : assets) {
                        printWriter.println(asset.name);
                        printWriter.println(asset.price);
                    }
                }
                else {
                    printWriter.println("n");
                }
            }

        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            name = reader.readLine();

            if (reader.readLine().equals("y")) {
                while (reader.ready()) {
                    assets.add(new Asset(reader.readLine(), Double.parseDouble(reader.readLine())));
                }
            }
            else {
                assets = null;
            }

        }
    }





    static class Asset {
        public Asset(String name, double price) {
            this.name = name;
            this.price = price;
        }

        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Asset asset = (Asset) o;

            if (Double.compare(asset.price, price) != 0) return false;
            return name != null ? name.equals(asset.name) : asset.name == null;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = name != null ? name.hashCode() : 0;
            temp = Double.doubleToLongBits(price);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
}


