public class Logic {

  public void Solution(int [] array){
    int l = array.length;
    int k=l/2;
    int count=0;
    int count1=0;
    int count2=0;
    if (l % 2==0) { //если длина массива четная
      for (int i = k; i < l; i++) { //элементы из пр.ч., которые больше или равны какого-либо любого элемента из л.ч.
        for (int j = 0; j < k; j++) {
          if (array[i] >= array[j]) {
            count = count + 1;
            break;
          }
        }
      }
      for (int i = k; i < l; i++) { //элементы из пр.ч., которые больше или равны всех элементов из л.ч.
        for (int j = 0; j < k; j++) {
          if (array[i] >= array[j]) {
            count1 = count1 + 1;
          }
        }
        if (count1 == k){
          count2 = count2 + 1;
        }
        count1=0;
      }
    }
    else { //если длина массива нечетная
      for (int i = k + 1; i < l; i++) { //элементы из пр.ч., которые больше или равны какого-либо любого элемента из л.ч.
        for (int j = 0; j <= k; j++) {
          if (array[i] >= array[j]) {
            count = count + 1;
            break;
          }
        }
      }
      for (int i = k + 1; i < l; i++) { //элементы из пр.ч., которые больше или равны всех элементов из л.ч.
        for (int j = 0; j <= k; j++) {
          if (array[i] >= array[j]) {
            count1 = count1 + 1;
          }
        }
        if (count1 == k+1){
          count2 = count2 + 1;
        }
        count1=0;
      }
    }
    System.out.println("Количество элементов в правой половине массива, которые больше или равны какого-либо любого элемента в левой половине массива: "+count);
    System.out.println("Количество элементов в правой половине массива, которые больше или равны всех элементов в левой половине массива: "+count2);
  }

  public void Output(int [] array){
    int l = array.length;
    System.out.println("Созданный массив:");
    for (int i=0; i<l; i++) {
      System.out.print(" " + array[i]);
    }
    System.out.println();
  }

}
