class GroceryListArray implements IGroceryList {
  
  int max = 10;
  GroceryItem items[] = new GroceryItem[max];
  int size = 0;
  
  GroceryListArray() {}
    
  // GroceryItem -> boolean
  // Adds an item into the GroceryListArray. If the GroceryListArray is at max, create a new list with size + 10;
  public boolean add(GroceryItem item) {
    if (size == max) {
      /*max += 10;
      GroceryItem bigger[] = new GroceryItem[max];
      bigger = item.clone();
      // copy items to new array
      // assign new array to items
      
       // don't return instead*/
      return false;
    }
    
    int i = indexOf(item.name);
    if (i > -1) {
      items[i].addQuantity(item.quantity);
    } else {    
      items[this.size] = item;
      this.size++;
    }
    return true;
  }
  
  // TEMPLATE
  /*  Fields:
   *    this.max
   *    this.items   --GroceryItem[]
   *    this.size
   * 
   *  Methods:
   *    this.add
   *    this.indexOf
   *    this.remove
   *    this.markAsBought
   *    this.display
   *    this.totalQuantity
   *    this.reduceQuantity
   * 
   *  Methods on this.items[i]:
   *    this.items[i].addQuantity()
   *    this.items[i].equals()
   *    this.items[i].toString()
   *    this.items[i].isBoughtTrue()
   *    this.items[i].itemQuantity()
   */
  
   
  // String -> int
  // Given the name of a GroceryItem, returns the
  // corresponding GroceryItem index from the list. If it is not in the list,
  //  returns -1
  int indexOf(String name) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(new GroceryItem(name, 0))) {
        return i;
      }
    }
    return -1;
  }
  
  
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i]);
    }
  }
  
  // String -> boolean
  // Returns true if the item has been removed successfully
  public void remove(String name) {
    for (int i = 0; i < this.size; i++){
      if (this.items[i].equals(new GroceryItem(name, 0))) {
        this.items[i] = this.items[i + 1];
      }
    }
    this.size -= 1;
  }
  
  // String -> boolean
  // Returns true if this item that matches given name has been marked successfully.
  public boolean markAsBought(String name) {
    for(int i = 0; i < this.size; i++){
      if (this.items[i].equals(new GroceryItem(name, 0))){
        return items[i].isBoughtTrue();
      }   
    }
    return false;
  }
  
  // -> int
  // Returns the total number of individual items in this GroceryListArray
  public int totalQuantity() {
    int itemCounter = 0;
    for (int i = 0; i < this.size; i++){
      itemCounter += items[i].itemQuantity();
    }
    return itemCounter;   
  }
  
  // String, int -> boolean
  // Returns true if the given item name and a given quantity is reduced successfully, if the reducing produces zero
  // or negative, remove item.
  public boolean reduceQuantity(String name, int quantityReduction) {
    int newQuantity;
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(new GroceryItem(name, 0))) {
        newQuantity = this.items[i].itemQuantity() - quantityReduction;
        if (newQuantity <= 0) {
          this.items[i] = this.items[i + 1];
          this.size -= 1;
        }
         return true;
      }
    }
    return false;
  }
}