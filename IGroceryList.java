interface IGroceryList {
  boolean add(GroceryItem item);
  
  void remove(String name);
  
  boolean markAsBought(String name);
  
  void display();
  
  int totalQuantity();
  
  boolean reduceQuantity(String name, int quantityReduction);
  
}