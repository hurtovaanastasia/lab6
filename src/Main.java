public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В. В.", "001", "Факультет информатики", "01.01.2000", "1234567890");
        readers[1] = new Reader("Сидоров С. С.", "002", "Факультет математики", "02.02.2000", "0987654321");
        readers[2] = new Reader("Иванов И. И.", "003", "Факультет физики", "03.03.2000", "1122334455");
        readers[3] = new Reader("Кузнецов К. К.", "004", "Факультет химии", "04.04.2000", "2233445566");
        readers[4] = new Reader("Смирнов С. С.", "005", "Факультет биологии", "05.05.2000", "3344556677");

        readers[0].TakeBook(2);
        readers[1].TakeBook("Капитанская дочка", "Ревизор", "Психология");
        readers[2].ReturnBook(4);
        readers[3].ReturnBook("Психология", "Шинель");
    }
}