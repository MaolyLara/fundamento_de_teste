import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocket.Identifier;

public class IdentifierTest {
    Identifier id;

    @Before
    public void setUp() {
        id = new Identifier();
    }

    @Test
    public void verificarTamanhoStringValido() {
        boolean result;
        result = id.validateIdentifier("vaca1");
        Assert.assertTrue(result);
    }

    @Test
    public void verificarTamanhoStringInvalido() {
        boolean result;
        result = id.validateIdentifier("vaca143234");
        Assert.assertFalse(result);
    }

    @Test
    public void verificarParametroString() {
        boolean result;
        result = id.validateIdentifier("C13R70");
        Assert.assertTrue(result);
    }

    @Test
    public void verificarParametroString1() {
        boolean result;
        result = id.validateIdentifier("V3R4N0");
        Assert.assertTrue(result);
    }

    @Test
    public void verificarParametrosString2() {
        boolean result;
        result = id.validateIdentifier("3574B4");
        Assert.assertFalse(result);
    }

    @Test
    public void verficarParametrosString3() {
        boolean result;
        result = id.validateIdentifier("3N");
        Assert.assertFalse(result);
    }

    @Test
    public void verificarParametrosStringInvalido() {
        boolean result;
        result = id.validateIdentifier("4R3N4");
        Assert.assertFalse(result);
    }

    @Test
    public void verificarParametrosStringInvalido1() {
        boolean result;
        result = id.validateIdentifier("70RR35,");
        Assert.assertFalse(result);
    }

    @Test
    public void verificarParametrosStringInvalido2() {
        boolean result;
        result = id.validateIdentifier("PU3N735.");
        Assert.assertFalse(result);
    }

    @Test
    public void verificarParametrosStringInvalido3() {
        boolean result;
        result = id.validateIdentifier("0CUL705");
        Assert.assertFalse(result);
    }

    @After
    public void tearDown(){
        id = null;

    }

}
