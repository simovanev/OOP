package rpg_lab;

import org.junit.Assert;
import org.junit.Test;

public class AxeTest {
    @Test
    public void weaponAttackTest() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);

        axe.attack(dummy);

        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void TestAxeWhenNoMoreDurability() {
        Axe axe = new Axe(10,1);
        Dummy dummy= new Dummy(5,5);
         axe.attack(dummy);
         axe.attack(dummy);
    }
}
