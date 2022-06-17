public class HomeWork01 {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1, 11, "zw"));
        dao.save("002", new User(2, 12, "zx"));
        dao.save("003", new User(3, 13, "zc"));

        System.out.println(dao.getMap());

    }
}
