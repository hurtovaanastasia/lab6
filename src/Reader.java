public class  Reader{
    public String FullName;
    public String ID;
    public String Faculty;
    public String Birthday;
    public String Phone;
    Reader(String FullName,String ID,String Faculty,String Birthday,String Phone){
          this.FullName = FullName;
          this.ID = ID;
          this.Faculty = Faculty;
          this.Birthday = Birthday;
          this.Phone = Phone;
    }
    public void TakeBook(int books){
        System.out.println(FullName + " взял " + books + " книги.");
    }
    public void TakeBook(String...Title){
        System.out.println(FullName + " взял книги: ");
        for (int i = 0; i < Title.length; i++) {
            System.out.print(Title[i]);
            if (i < Title.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
    public void ReturnBook(int books){
        System.out.println(FullName + " вернул " + books + " книги.");
    }
    public void ReturnBook(String...Title){
        System.out.println(FullName + " вернул книги: ");
        for (int i = 0; i < Title.length; i++) {
            System.out.print(Title[i]);
            if (i < Title.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}