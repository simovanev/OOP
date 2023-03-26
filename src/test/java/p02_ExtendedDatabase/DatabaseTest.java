package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    @Test
    public  void testAddingPersonWithSameId() throws OperationNotSupportedException {
        Person person1= new Person(2,"as");
        Person person2= new Person(2,"asd");
        Database database = new Database(person1);
        database.add(person2);
        Assert.assertEquals(person2,database.getElements()[database.getElements().length-1]);

    }
    @Test(expected = OperationNotSupportedException.class)
    public  void testAddNegativeId() throws OperationNotSupportedException {
        Person person= new Person(-15,"hgf");
        Database database = new Database(person);
    }

}