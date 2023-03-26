package p01_Database;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import javax.xml.crypto.Data;

import java.util.Optional;

import static org.junit.Assert.*;

public class DatabaseTest {
    @Test
    public void testConstructorNormalConditions() throws OperationNotSupportedException {
        Integer[] data = new Integer[5];

        Database database = new Database(data);

        Assert.assertArrayEquals(data, database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorMoreThan16Elements() throws OperationNotSupportedException {
        Integer[] data = new Integer[17];
        Database database = new Database(data);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorZeroElements() throws OperationNotSupportedException {
        Integer[] data = new Integer[0];
        Database database = new Database(data);
    }
    @Test
    public void testAddNormalConditions() throws OperationNotSupportedException {
        Integer[] data= new Integer[] {0,1,2,3};
        Database database= new Database (data);
        database.add(4);

        Assert.assertEquals(Integer.valueOf(4),database.getElements()[data.length]);
    }
    @Test ( expected = IndexOutOfBoundsException.class)
    public void testAddExceed16Elements() throws OperationNotSupportedException {
        Integer[] data= new Integer[15];
        Database database = new Database(data);

        database.add(1);
        database.add(1);
    }
    @Test
    public  void testRemoveNormalConditions() throws OperationNotSupportedException {
        Integer[] data= new Integer[] {0,1,2,3};
        Database database= new Database(data);

        database.remove();

        Assert.assertEquals(data[data.length-2], database.getElements()[database.getElements().length-1]);

    }
    @Test(expected = OperationNotSupportedException.class)
    public void testRemovingElementWhenEmptyDatabase() throws OperationNotSupportedException {
        Integer[] data= new Integer[]{1};

        Database database= new Database(data);

        database.remove();
        database.remove();
    }


}