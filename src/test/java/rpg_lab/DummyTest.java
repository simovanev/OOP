package rpg_lab;

import org.junit.Assert;
import org.junit.Test;

public class DummyTest {
    @Test
    public  void DummyLoseHealthWhenAttacked(){
        Axe axe= new Axe(1,5);
        Dummy dummy = new Dummy(5,5);

        axe.attack(dummy);

        Assert.assertEquals(4,dummy.getHealth());
    }
    @Test( expected = IllegalStateException.class)
    public  void DummyLoseAllHealthWhenAttacked(){
        Axe axe= new Axe(5,5);
        Dummy dummy = new Dummy(5,5);

        axe.attack(dummy);
        axe.attack(dummy);


    }
}
