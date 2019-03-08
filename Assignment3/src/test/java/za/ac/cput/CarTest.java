package za.ac.cput;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CarTest {

    Car car1 = new Car("Mercedez Benz AMG GT 4-door Coupe");

    @Test
    public void getNameOfCar() throws Exception{

        Assert.assertEquals("Mercedez Benz AMG GT 4-door Coupe", car1.getNameOfCar());

        Assert.assertSame(car1,car1);

    }

    @Test(timeout = 2000)
    public void setNameOfCar() throws Exception{

        try{
            car1.setNameOfCar(null);
            Assert.fail();
        }catch (Exception e){
            Assert.assertEquals("Mercedez Benz AMG GT 4-door Coupe", e.getMessage());
        }
    }

    @Ignore("Owner of car method Ignored")
    @Test
    public void getOwner() throws Exception{
        car1.getOwner();
    }



}
