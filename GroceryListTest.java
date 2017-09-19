import junit.framework.TestCase;

public class GroceryListTest extends TestCase {
  
  public void testIndexOf() {
    
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    GroceryItem tomato = new GroceryItem("Tomato", 2);

    GroceryListArray veges = new GroceryListArray();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    veges.add(gabi);
    veges.add(tomato);
    
    assertEquals(3, veges.indexOf("Okra"));
    assertEquals(0, veges.indexOf("Carrot"));
    assertEquals(-1, veges.indexOf("Pechay"));
  }
  
  public void testAddFalse() {
    
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    GroceryItem tomato = new GroceryItem("Tomato", 2);

    GroceryListArray veges = new GroceryListArray();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    veges.add(gabi);
    veges.add(tomato);
    //add pechay
    GroceryItem pechay = new GroceryItem("Pechay", 2);
    assertEquals(false, veges.add(pechay));
  
  
  }
  
  public void testAddTrue() {
    
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    

    GroceryListArray veges = new GroceryListArray();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    veges.add(gabi);
    
    // add tomato
    GroceryItem tomato = new GroceryItem("Tomato", 2);
    veges.add(tomato);
  }
  
  public void testMarkAsBought() {
    
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    

    GroceryListArray veges = new GroceryListArray();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    //veges.add(gabi);
    
    // test mark as bought to true
    assertEquals(true, veges.markAsBought("Carrot"));
    // test mark as bought to false
    assertEquals(false, veges.markAsBought("Gabi"));
  }
  
  public void testTotalQuantity() {
    
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    

    GroceryListArray veges = new GroceryListArray();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    veges.add(gabi);
    
    // counts the total items 
    assertEquals(18, veges.totalQuantity()); 
  }
  
  public void testReduceQuanity() {
    
    GroceryItem carrot = new GroceryItem("Carrot", 2);
    GroceryItem cabbage = new GroceryItem("Cabbage", 2);
    GroceryItem squash = new GroceryItem("Squash", 2);
    GroceryItem okra = new GroceryItem("Okra", 2);
    GroceryItem eggplant = new GroceryItem("Eggplant", 2);
    GroceryItem gourd = new GroceryItem("Bitter Gourd", 2);
    GroceryItem spinach = new GroceryItem("Spinach", 2);
    GroceryItem shoots = new GroceryItem("Bamboo Shoots", 2);
    GroceryItem gabi = new GroceryItem("Gabi", 2);
    

    GroceryListArray veges = new GroceryListArray();
    
    veges.add(carrot);
    veges.add(cabbage);
    veges.add(squash);
    veges.add(okra);
    veges.add(eggplant);
    veges.add(gourd);
    veges.add(spinach);
    veges.add(shoots);
    veges.add(gabi);
    
    // reduce quantity of an item but still has a quantity has succeeded 
    assertEquals(true, veges.reduceQuantity("Carrot", 1));
    // reduce quantity of an item and remove it in the list
    assertEquals(true, veges.reduceQuantity("Cabbage", 3));
    // reduce quantity of an non-existing item in list will return false
    assertEquals(false, veges.reduceQuantity("Pechay", 1));

  }
  
}
