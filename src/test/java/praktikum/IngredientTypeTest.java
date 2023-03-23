package praktikum;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;


@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTypeTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }


    @Parameterized.Parameters
    public static Object[][] dataParametersIngredient() {
        return new Object[][]{
                {SAUCE, "Название1", 10},
                {FILLING, "Название2", 5},
        };
    }

    @Test
    public void checkIngredientTypeTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals(ingredient.getType(), type);
    }

}
