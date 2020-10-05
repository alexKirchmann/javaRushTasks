package Core.Lvl4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Lct8_MovieFactory {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            Movie movie =  MovieFactory.getMovie(reader.readLine());
            if (movie instanceof SoapOpera || movie instanceof Thriller || movie instanceof Cartoon ){
                System.out.println(movie.getClass().getSimpleName());
            }
            else break;
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            if (key.equals("soapOpera")) {
                movie = new SoapOpera();
            }
            if (key.equals("cartoon")) {
                movie = new Cartoon();
            }
            if (key.equals("thriller")) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }
    static class Cartoon  extends Movie {}
    static class Thriller extends Movie {}
}
