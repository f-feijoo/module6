public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {
        cocheCRUD.delete();
        cocheCRUD.findAll();
        cocheCRUD.save();

    }
}