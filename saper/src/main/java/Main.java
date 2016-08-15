import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {
        System.out.println();

    }

    @Test
    public void EqualsCoordinateShootXwithCoordinateBombX() throws Exception {
        Bomb bomb = new Bomb(5,10);
        Shoot shoot = new Shoot(6,2);
        Integer xCoordinateShootX = shoot.getCoordinateShootX();
        Integer xCoordinateBombX = bomb.getCoordinateBombX();
        Assert.assertEquals("Игрок ввел координату и попал в бомбу", xCoordinateShootX, xCoordinateBombX);
    }

    @Test
    public void testGetCoordinateShootXfromPlayer(String shootX){
        int shoot = Integer.parseInt(shootX);
        assertTrue("Координата X выстрела является числом", shoot > 0);
    }

    @Test
    public void CoordinateShootXsmallWidthXfield() throws Exception {
        Shoot shoot = new Shoot(6,2);
        Integer xCoordinateShootX = shoot.getCoordinateShootX();
        Integer fieldWidthX = FieldGame.WIDTH_FIELD;
        assertTrue("Координата выстрела по оси X меньше длины игрового поля", xCoordinateShootX < fieldWidthX);
    }
}
