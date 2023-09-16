import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;
    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
    }
    @Test
    public void getFamilyTest() {

        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithParam() {
        int kittensCount = 5;
        int expectedKittensCount = feline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, kittensCount);
    }
    @Test
    public void getKittensNoParamInvokeGetKittensWith1() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }
}
