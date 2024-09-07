import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.afisha.Afisha;

public class AfishaTest {
    String film1 = "Бладшот";
    String film2 = "Вперед";
    String film3 = "Отель Белград";
    String film4 = "Джентельмены";
    String film5 = "Человек Неведимка";
    String film6 = "Тролли в лесу";
    String film7 = "Номер один";

    @Test
    public void shouldFindAll() {

        Afisha star = new Afisha();

        String[] actual = star.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm() {

        Afisha star = new Afisha();
        star.addFilm(film1);
        star.addFilm(film2);
        star.addFilm(film3);
        star.addFilm(film4);
        star.addFilm(film5);
        String[] actual = star.findAll();
        String[] expected = {film1, film2, film3, film4, film5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        Afisha star = new Afisha();
        star.addFilm(film1);
        star.addFilm(film2);
        star.addFilm(film3);
        star.addFilm(film4);
        star.addFilm(film5);
        String[] actual = star.findLast();
        String[] expected = {film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLess() {

        Afisha star = new Afisha(4);
        star.addFilm(film1);
        star.addFilm(film2);
        star.addFilm(film3);
        star.addFilm(film4);
        String[] actual = star.findLast();
        String[] expected = {film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOver() {

        Afisha star = new Afisha(7);
        star.addFilm(film1);
        star.addFilm(film2);
        star.addFilm(film3);
        star.addFilm(film4);
        star.addFilm(film5);
        star.addFilm(film6);
        star.addFilm(film7);
        String[] actual = star.findLast();
        String[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverLess() {

        Afisha star = new Afisha(7);
        star.addFilm(film1);
        star.addFilm(film2);
        star.addFilm(film3);
        star.addFilm(film4);

        String[] actual = star.findLast();
        String[] expected = {film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverMore() {

        Afisha star = new Afisha(5);
        star.addFilm(film1);
        star.addFilm(film2);
        star.addFilm(film3);
        star.addFilm(film4);
        star.addFilm(film5);
        star.addFilm(film6);
        star.addFilm(film7);
        String[] actual = star.findLast();
        String[] expected = {film7, film6, film5, film4, film3};
        Assertions.assertArrayEquals(expected, actual);
    }
}
